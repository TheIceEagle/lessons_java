package org.jusan.week3.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
//    public static void show() {
//        sayHello(null);
//
//
//    }
//    public static void sayHello (String name) {
//
//         //error from the toUpperCase() --> unckecked exception
//        //ex. Arithmetic ex
//    }

        public static void show()  {
            try (FileReader reader = new FileReader("file.txt")) {
                System.out.println("File opened");
            } catch (FileNotFoundException e ) {
                System.out.println("File not found");
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //try with resources


        }


//    public static void show() {
//        FileReader reader = null; //now we got null pointer exception
//        try {
//            reader = new FileReader("file.txt");
//            var value = reader.read(); // problem resources are not going to close
//            new SimpleDateFormat().parse("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } catch (IOException  | ParseException ex) {
//            System.out.println("Could not read data.");
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//        } catch (ParseException ex) {
//            throw new RuntimeException(ex);
//        }

//        catch (IOException e | ParseException ex) {
//            System.out.println("Could not read data.");
//        }


    }



