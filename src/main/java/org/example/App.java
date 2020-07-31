package org.example;

public class App
{
    public static void main( String[] args ) throws Exception {
        DbCreator dbCreator = new DbCreator();
        dbCreator.createAndLoadData();
    }
}
