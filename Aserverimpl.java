import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

public class Aserverimpl extends UnicastRemoteObject implements Aserver 
{
String p=new String("");
    public Aserverimpl()throws  RemoteException
    {
    	super();
    }
    public String student(String sz)throws RemoteException
    {
    	try{
    	
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection conn= DriverManager.getConnection("jdbc:odbc:sql1","","");
 PreparedStatement st=conn.prepareStatement("select * from  student where hname=?");
 st.setString(1,sz);
 ResultSet rs= st.executeQuery();
 	
 	//st.executeQuery("insert into student values('jhon','Mathew','13/1/1990',' shankar nagar')");
 rs.next();
  p =  rs.getString(2);
 conn.close();
    	}
    	
    	catch(Exception ex)
    	{
    		//System.out.println (ex);
    		}
    		return  p;
    	}
    	
    public void ins(String sf,String sf1)throws RemoteException
    {
    	try{
    	
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection conn= DriverManager.getConnection("jdbc:odbc:sql1","","");
 PreparedStatement st=conn.prepareStatement("UPDATE student SET hcop=? WHERE hname=?");
 st.setString(1,sf);
 st.setString(2,sf1);
 //ResultSet rs= 
 	st.executeQuery();
 	
 	//st.executeQuery("insert into student values('jhon','Mathew','13/1/1990',' shankar nagar')");
 //rs.next();
  //p =  rs.getString(2);
 conn.close();
    	}
    	
    	catch(Exception ex)
    	{
    		//System.out.println (ex);
    		}
    		//return  p;
    	}
    public static void main (String[] args) 
    	{
    	System.setSecurityManager(new RMISecurityManager());
    	try
    		{
    			Aserverimpl instance =new Aserverimpl();
    			Naming.rebind("Aserver",instance);
    			System.out.println ("Server Registered");
    			}
    	catch(Exception e){System.out.println (e);}
        }
    
}