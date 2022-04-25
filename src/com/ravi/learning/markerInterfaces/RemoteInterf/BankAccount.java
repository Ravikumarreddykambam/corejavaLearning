package com.ravi.learning.markerInterfaces.RemoteInterf;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends java.rmi.Remote {

    public void deposit(float amount) throws RemoteException;
    public void withDraw(float amount) throws RemoteException ;
    public  float getBalance() throws RemoteException;

}
interface  alfa{
    public final String okay="constants are okay too";
    public Object foo(Object obj)throws  RemoteException;
    public void bar()throws IOException;
    public int baz() throws  Exception;
}
interface beta extends  alfa, Remote{
    public void ping()throws RemoteException;
}
