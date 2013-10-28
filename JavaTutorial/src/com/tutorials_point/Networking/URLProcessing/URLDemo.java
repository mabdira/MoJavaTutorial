package com.tutorials_point.Networking.URLProcessing;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 *
 * The following URLDemo program demonstrates the various parts of a URL.
 * A URL is entered on the command line, and the URLDemo program outputs each part
 * of the given URL.
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        // The URL address page
        String link = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=restaurants+in+Sydney&sensor=true&key=AIzaSyBvi9X4uwkM9iNxjWAIjm-BupOz0KvsDNo";
        // Create URL object to represent the url link above
        URL url = new URL(link);

        // Display the different pieces of the URL data
        System.out.println("URL is " + url.toString());
        System.out.println("protocol is "
                + url.getProtocol());
        System.out.println("authority is "
                + url.getAuthority());
        System.out.println("file name is " + url.getFile());
        System.out.println("host is " + url.getHost());
        System.out.println("path is " + url.getPath());
        System.out.println("port is " + url.getPort());
        System.out.println("default port is "
                + url.getDefaultPort());
        System.out.println("query is " + url.getQuery());
        System.out.println("ref is " + url.getRef());
    }
}
