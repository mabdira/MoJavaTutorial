package com.tutorials_point.Networking.URLProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following URLConnectionDemo program connects to a URL entered from the
 * command line.
 * If the URL represents an HTTP resource, the connection is cast to
 * HttpURLConnection, and the data in the resource is read one line at a time.
 */
public class URLConnectionDemo {

    public static void main(String[] args) throws IOException {
        // link address
        String link = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=restaurants+in+Sydney&sensor=true&key=AIzaSyBvi9X4uwkM9iNxjWAIjm-BupOz0KvsDNo";
        // Create URL object based on the link above
        URL url = null;
        try {
            url = new URL(link);
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException is thrown during URL creation");
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        // Open a connection to the URL link above
        URLConnection urlConnection = url.openConnection();

        // http url connection
        HttpURLConnection connection = null;

        // Check if the connection is http protocol type
        if(urlConnection instanceof HttpURLConnection){
            connection = (HttpURLConnection) urlConnection;
        }
        else{
            System.out.println("Please enter an HTTP URL");
        }

        // Read the content data from the URL
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String data;
        System.out.println("URL Content Data:");
        System.out.println("-----------------");
        while((data = in.readLine()) != null){
            System.out.println(data);
        }

    }
}
