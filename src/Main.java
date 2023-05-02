// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /** MyClass деген класс тузунуз
        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз,
        жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        Параметри эки башка болгон эки конструктор тузунуз
        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
        Эки объектке эки башка конструктор иштесин.
        Объекттердин маанилерин консольго чыгарыныз.*/

//MyClass myClass=new MyClass();
//myClass.firstName="Zhanuzak";
//myClass.lastName="Anashov";
//myClass.age=24;
//myClass.lesson1="Technical Lesson";
//myClass.lesson2="Practice Lesson";
//myClass.lesson3="Technical English";
//myClass.lesson4="Soft Skills";
//myClass.tamak="Besh barmak";
//
//        System.out.println(myClass.firstName+"\n"+myClass.lastName+"\n"
//        +myClass.age+"\n"+myClass.lesson1+"\n"+myClass.lesson2+"\n"
//        +myClass.lesson3+"\n"+myClass.lesson4+"\n"+myClass.tamak);

MyClass myClass1=new MyClass("Zhanuzak","Anashov",24,
        "Technical Lesson","Practice Lesson","Technical English",
        "Soft Skills","Besh barmak");

        System.out.println(myClass1.firstName+"\n"+myClass1.lastName+"\n"
                +myClass1.age+"\n"+myClass1.lesson1+"\n"+myClass1.lesson2+"\n"
                +myClass1.lesson3+"\n"+myClass1.lesson4+"\n"+myClass1.tamak+"\n");

MyClass myClass2=new MyClass();
myClass2.firstName="Adilet";
myClass2.lastName="Asanov";
myClass2.age=23;
myClass2.lesson1="Technical Lesson";
myClass2.lesson2="Technical Lesson";
myClass2.lesson3="Technical English";
myClass2.lesson4="Soft Skill";
myClass2.tamak="Kuurdak";
        System.out.println(myClass2.firstName+"\n"+myClass2.lastName+"\n"
                +myClass2.age+"\n"+myClass2.lesson1+"\n"+myClass2.lesson2+"\n"
                +myClass2.lesson3+myClass2.lesson4+"\n"+myClass2.tamak);

    }
}