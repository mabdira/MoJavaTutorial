package com.tutorials_point.Networking.Socket.SocketProgramming;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following GreetingClient is a client program that connects to a server by
 * using a socket and sends a greeting, and then waits for a response.
 */
public class _ClientSocket {

    public static void main(String[] args) throws IOException {
        // Initialize the remote server host and it's port number to connect to
        int port = 60669;
        // get the local hostname and ip address
        InetAddress localHost = null;
        try {
            localHost = Inet4Address.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host name cannot be determined");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // Display the local server name and it's TCP/IP address
        System.out.println("Local hostname: " + localHost.getHostName());
        System.out.println("Local ip-Address: " + localHost.getHostAddress());

        // Connect to the remote host server
        System.out.println("\nConnecting to " + localHost.getHostName()
                            + " on port " + port);
        Socket client = new Socket(localHost.getHostName(), port);
        System.out.println("Just connected to "
                            + client.getRemoteSocketAddress().toString());

        // Create an DataOutputStream object to send out information to server
        OutputStream outToServer = client.getOutputStream();
        DataOutput out = new DataOutputStream(outToServer);

        // Sending a greating to the server
        out.writeUTF("Hello Server from " + client.getLocalAddress());


        // create an inputStream object to receive data from the server
        InputStream inFromServer = client.getInputStream();
        DataInput in = new DataInputStream(inFromServer);

        // Listening a greeting from the Server
        System.out.println("Server says " + in.readUTF());

        // Close the client socket
        client.close();

    }
}
