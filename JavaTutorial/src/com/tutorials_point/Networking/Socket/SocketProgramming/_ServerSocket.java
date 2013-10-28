package com.tutorials_point.Networking.Socket.SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following GreetingServer program is an example of a server application that
 * uses the Socket class to listen for clients on a port number specified by a
 * command-line argument:
 */
public class _ServerSocket extends Thread{

    // Data variable
    ServerSocket serverSocket = null;

    public _ServerSocket(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
        try {
            serverSocket.setSoTimeout(10000);
        } catch (SocketException e) {
            System.out.println("SocketException thrown when setting up "
                                + "the server socket time out to 10000ms");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    public void run() {
        // start listening for client connection
        System.out.println("Waiting for client on port "
                        + serverSocket.getLocalPort() + "...");
        Socket server = null;
        try {
            server = this.serverSocket.accept();

            System.out.println("Just connected to "
                            + server.getRemoteSocketAddress().toString());

            // Create a datainputstream object to listen for information
            DataInputStream in = new DataInputStream(server.getInputStream());

            // Read the data from the client
            System.out.println("Client said: " + in.readUTF());

            // Create a dataoutputstrea object to send information to client
            DataOutput out = new DataOutputStream(server.getOutputStream());

            // Send a thank you notice and warn the socket will be closed now to client
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
                    + "\nGoodbye!");

            // close the server socket
            server.close();
        }
        catch(IOException io){
            System.out.println("IOException is thrown from the Server Socket");
            io.printStackTrace();
        }
    }


    public static void main(String[] args){

        _ServerSocket serverSocket = null;
        try {
            serverSocket = new _ServerSocket(60669);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // Start the thread
        serverSocket.start();

    }

}
