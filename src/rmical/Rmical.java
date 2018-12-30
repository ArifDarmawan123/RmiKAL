/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmical;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Student
 */
public class Rmical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        // TODO code application logic here
        client a = new client();
        a.setVisible(true);
    }
}
