import java.rmi.*;

public interface Aserver extends Remote
{
 String student(String sz) throws RemoteException; 
 	void ins(String sf,String sf1) throws RemoteException;     
    
}