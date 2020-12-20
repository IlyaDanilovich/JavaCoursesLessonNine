package com.company;

public class Main {

    public static void main(String[] args) {
    //Use object in pdrdmetrs
    //Добавьте в класс Student конструктор создающий копию объекта
        /*test obi = new test(100, 22);
        test ob2 = new test(100, 22);
        test ob3 = new test(-1, -1);
        System.out.println("obi == ob2: " + obi.equals(ob2));
        System.out.println("obi == ob3 : " + obi.equals(ob3));

        Car bmw = new Car(100,"RED");
        //создание обекта lada класса Car
        Car lada = new Car();
        lada.speed=75;
        lada.color="GREEN";
        Car lada2 = new Car(lada);
        // вывод всех полей объектов
        bmw.show();
        lada.show();
        lada2.show();
        //определение времени за которое проедет 200км
        //каждый автомобиль
        double time1=bmw.time(200);
        double time2=lada.time(200);
        System.out.println("bmw проедет 200км за "+time1);
        System.out.println("lada проедет 200км за "+time2);
        bmw.show();
        lada.show();
        lada2.show();
*/
        Test1 ob1 = new Test1(2);
        Test1 ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
                System.out.println("ob2.а после второго увеличения: " + ob2.a);
        Factorial f = new Factorial();
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
        System.out.println("Факториал 4 равен " + f.fact(10));
            }

            // write your code here
            //Java поддерживает РЕКУРСИЮ - применительно к кпрограммированию на Java это атрибут который позволяет методу вызывать самого себя
            //Классический пример РЕКУРСИИ вычисление факториала числа


    }