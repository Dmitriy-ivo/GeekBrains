/*
Написать консольный вариант клиент\серверного приложения, в котором пользователь может
писать сообщения как на клиентской стороне, так и на серверной. Т.е. если на клиентской
стороне написать «Привет», нажать Enter, то сообщение должно передаться на сервер и там
отпечататься в консоли. Если сделать то же самое на серверной стороне, сообщение,
соответственно, передаётся клиенту и печатается у него в консоли. Есть одна особенность,
которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд.
Такую ситуацию необходимо корректно обработать.
Разобраться с кодом с занятия — он является фундаментом проекта-чата.
ВАЖНО! Сервер общается только с одним клиентом, т.е. не нужно запускать цикл, который будет ожидать
второго/третьего/n-го клиента.
 */
package GeeB2_6.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {

        public static void main (String[]args){

            Socket socket = null;

            try {
                socket = new Socket("localhost", 8189);
                Scanner in = new Scanner(socket.getInputStream());

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner console = new Scanner(System.in);

                Thread t1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            String str = in.nextLine();
                            System.out.println(str);
                        }
                    }
                });

                t1.start();

                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            System.out.println("Введите сообщение");
                            String str = console.nextLine();
                            out.println(str);
                        }
                    }
                });

                t2.setDaemon(true);
                t2.start();


                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
