package com.example.control.repetitive;

import java.util.Scanner;

public class while3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int op1=0;
        int op2=0;
        double precio=0;

        System.out.println("Bienvenido a la tienda virtual supermercados Exito");
        System.out.println("seleccione una categoria de su interes.");



        do {

            System.out.println("1 - Lacteos");
            System.out.println("2 - Granos");
            System.out.println("3 - Verduras");
            System.out.println("4 - Frutas");
            System.out.println("5 - Jugueteria");
            System.out.println("6 - Ferreteria");
            System.out.println("7 - Fin de la compra y total");

            op1=Integer.parseInt(teclado.next());


            switch (op1){
                case 1:

                    while (op2<=5) {
                        System.out.println("Lacteos");
                        System.out.println("1 - leche :$100");
                        System.out.println("2- yogurt :$200");
                        System.out.println("3 - alpinito :$300");
                        System.out.println("4 - queso :$400");
                        System.out.println("5 - bon yurt :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }
                    }



                    //break;

                case 2:

                    while (op2<=5) {
                        System.out.println("Granos");
                        System.out.println("1 - frijol :$100");
                        System.out.println("2- lenteja :$200");
                        System.out.println("3 - soja :$300");
                        System.out.println("4 - garbanzo :$400");
                        System.out.println("5 - arbeja :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }

                    }



                    //break;

                case 3:

                    while (op2<=5) {
                        System.out.println("verduras");
                        System.out.println("1 - espinaca :$100");
                        System.out.println("2- coliflor :$200");
                        System.out.println("3 - zanahoria :$300");
                        System.out.println("4 - tomate :$400");
                        System.out.println("5 - cebolla :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }

                    }



                    //break;


                case 4:

                    while (op2<=5) {
                        System.out.println("frutas");
                        System.out.println("1 - manzana :$100");
                        System.out.println("2- pera :$200");
                        System.out.println("3 - banano :$300");
                        System.out.println("4 - uvas :$400");
                        System.out.println("5 - durazno :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }

                    }



                    //break;


                case 5:

                    while (op2<=5) {
                        System.out.println("Jugueteria");
                        System.out.println("1 - uno :$100");
                        System.out.println("2- monopolio :$200");
                        System.out.println("3 - ajedrez :$300");
                        System.out.println("4 - balon :$400");
                        System.out.println("5 - plastilina :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }

                    }



                    //break;
                case 6:

                    while (op2<=5) {
                        System.out.println("Ferreteria");
                        System.out.println("1 - pala :$100");
                        System.out.println("2- martillo :$200");
                        System.out.println("3 - destornillador :$300");
                        System.out.println("4 - taladro :$400");
                        System.out.println("5 - alicate9 :$500");
                        System.out.println("6 - volver atras");

                        op2=Integer.parseInt(teclado.next());
                        if (op2==1) {
                            precio=precio+100;
                        }
                        else
                        if (op2==2) {
                            precio=precio+200;
                        }
                        else
                        if (op2==3) {
                            precio=precio+300;
                        }
                        else
                        if (op2==4) {
                            precio=precio+400;
                        }
                        else
                        if (op2==5) {
                            precio=precio+500;
                        }

                    }



                    //break;

            /*default:
                System.out.println("total: "+precio);*/

            }

            System.out.println("total: "+precio);


        } while (op1!=7);


    }

}
