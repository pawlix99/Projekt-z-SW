import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Host{
    static String userInput;

    public static void main(String args[]){
        String host;
        int port;
        if(args.length==0){
            host="localhost";
            port=9999;
        }else{
            host=args[0];
            String portStr=args[1];
            try{
                port=Integer.parseInt(portStr);
            }catch (NumberFormatException nfe){
                System.out.println("Invalid port number!");
                port=9999;
            }
        }
        try{
            System.out.println("Host attempt to connect to server:"+host+","+port);
            Socket skt=new Socket(host,port);
            BufferedReader myinput=new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream myoutput=new PrintStream(skt.getOutputStream());

            Scanner scanner=new Scanner(System.in);
            System.out.println("Ktory element ukladu wybierasz:");
            int i=scanner.nextInt();
            if(i==1){
                myoutput.print("1\n");
                //String buffer1;
                System.out.println("Dostalem sie do dzwieku!");
                while ((userInput = myinput.readLine()) != null) {
                    System.out.println(userInput);
                    /*
                     * W TY MIEJSCU NIEZBEDNA JEST OPERACJA NA WARTOSCI USER_INPUT
                     * POWINNA ONA POSLUZYC DO USTAWIENIU WARTOSCI DZWIEKU NA KOMPUTERZE
                     *
                     *
                     * */
                    myoutput.print(userInput+"\n");
                    Thread.sleep(10);

                }
                myinput.close();
                skt.close();
            }else if(i==3){
                //Wyswietlanie obciazania systemu Hosta:
                myoutput.print("3\n");


                //Wartosci podane na sztywno, do modyfikacji:
                //TRZEBA POBRAC REALNE WARTOSCI Z KOMPUTERA
                //PONIZSZE ZMIENNE INT SA POMOCNICZE DO ZAPREZENTOWANIA PRZESYLANIA


                int value1=100;
                int value2=200;
                int value3=300;

                while(true){
                    myoutput.print(value1+"\n");
                    Thread.sleep(1500);
                    myoutput.print(value2+"\n");
                    Thread.sleep(1500);
                    myoutput.print(value3+"\n");
                    Thread.sleep(1500);

                }

            }else if(i==4){

                //PONIZEJ W MIEJSCACH, GDZIE PISZE AKCJA KLAWISZA:X NALEZY WYWOLAC JAKAS AKCJE NA KOMPUTERZE
                //PRZYKLADOWO ODPALIC FIREFOXA CZY COS


                String buffer1;
                int temp;
                /*AKCJA NA PRZYCISKACH:*/
                myoutput.print("4\n");
                while(true){
                    buffer1=myinput.readLine();
                    temp=Integer.parseInt(buffer1);
                    if(temp==1){
                        try{
                            String url = "http://www.google.com";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==2){
                        try{
                            String url = "http://www.elf2.pk.edu.pl";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==3){
                        try{
                            String url = "http://www.github.com";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==4){
                        try{
                            String url = "http://www.pk.edu.pl";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==5){
                        try{
                            String url = "http://www.youtube.com";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==6){
                        try{
                            String url = "http://www.nasa.gov";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==7){
                        try{
                            String url = "https://and-tech.pl/zestaw-evb-5-1/";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                    else if(temp==8){
                        try{
                            String url = "https://www.centrumrowerowe.pl/rowery/";
                            Desktop.getDesktop().browse(new URL(url).toURI());
                        }
                        catch(Exception E){
                            System.err.println("Exp : "+E.getMessage());
                        }
                    }
                }
            }else if(i==5){
                myoutput.print("5\n");
                /* WYSWIETLANIE KOLORU NA RGB*/
                //Wartosci na sztywno, do modyfikacji:
                //TRZEBA POZYSKAC WARTOSC KOLOROW DO PRZESLANIA
                int temp1=100;
                int temp2=150;
                int temp3=200;

                while(true){
                    myoutput.print(temp1+"\n");
                    myoutput.print(temp2+"\n");
                    myoutput.print(temp3+"\n");
                    Thread.sleep(10);
                    temp2++;
                    if(temp2==255)
                        temp2=0;
                }
            }
            skt.close();
            System.out.println("Host is exiting!");
        }catch (IOException | InterruptedException exc){
            exc.printStackTrace();
            System.out.println("Error!");
        }
    }
}
