package GeeB2_6.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainServer {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server included");
            socket = serverSocket.accept();
            System.out.println("Сокет подключен");

            Scanner sc = new Scanner(socket.getInputStream());
            PrintWriter wr = new PrintWriter(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            Thread th1 = new Thread(new Runnable(){
                @Override
                public void run(){
                    while (true) {
                        if (sc.hasNextLine()) {
                            String str = sc.nextLine();
                            if (str.equals("end")) {
                                break;
                            }
                            System.out.println(str);
                        }
                    }
                }

            });
            th1.start();

            Thread th2 = new Thread(new Runnable(){
                @Override
                public void run(){
                    System.out.println("Введите сообщение");
                    String str = scanner.nextLine();
                    System.out.println("Сообщение отправлено");
                    wr.println(str);
                }

            });
            th2.setDaemon(true);
            th2.start();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }

            try {
                serverSocket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }



    }


}
