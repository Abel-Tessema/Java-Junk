package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    protected CalculatorImpl(int port) throws RemoteException {
        super(port);
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return 0;
    }

    public static void main(String[] args) {
        try {
            CalculatorImpl calculator = new CalculatorImpl(5000);
            Naming.bind("Calculator", calculator);
            System.out.println("Calculator is ready.");
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
