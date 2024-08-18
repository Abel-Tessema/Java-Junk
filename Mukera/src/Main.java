import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
    }
}







//        new ProcessBuilder().start().getInputStream();

//        try {
//            FileChannel channel = FileChannel.open(Paths.get(""), StandardOpenOption.READ);
//            FileLock lock = channel.lock();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//    interface Library {
//        void bookLibrary(String source, String destination);
//    }
//    static class Java implements Library {
//        public void bookLibrary(String source, String destination) {
//            System.out.println("JCR a is book from " + source + " to " + destination);
//        }
//    }
//        Library a = new Java();
//        a.bookLibrary("Addis Ababa", "Dire Dawa");

//        List<Number> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(10.5);
//        numbers.toArray();
//        Path path = Paths.get("Abebech.txt");
//        File file1 = path.toFile();
//        System.out.println(file1.createNewFile());
//        System.err.println("Abebe is mad.");
//        playBeepSound();

//    private static void playBeepSound() {
//        // Use the default beep sound from the AWT Toolkit
//        Toolkit.getDefaultToolkit().beep();
//        System.out.println("Time's up!");
//        Color color = new Color(20, 240, 240);
//    }

//        File file = new File("C:/Users/Abel XO/Desktop/test.txt");
//        File file = new File("D:\\Projects\\Java\\Mukera\\src\\Abebe.txt");
//        File file = new File("./src/Abebe.txt");
//        System.out.println("Can execute: " + file.canExecute());
//        System.out.println("Can read: " + file.canRead());
//        System.out.println("Can write: " + file.canWrite());
//        System.out.println("Is file: " + file.isFile());
//        System.out.println("Is directory: " + file.isDirectory());
//        System.out.println("Is absolute: " + file.isAbsolute());
//        System.out.println("Is hidden: " + file.isHidden());
//        System.out.println("Exists: " + file.exists());
//        System.out.println("Last modified: " + file.lastModified());
//        System.out.println("Length: " + file.length());
//        System.out.println("Get absolute path: " + file.getAbsolutePath());
//        System.out.println("Get canonical path: " + file.getCanonicalPath());
//        System.out.println("Get parent: " + file.getParent());
//        System.out.println("Get name: " + file.getName());
//        System.out.println("Get free space: " + file.getFreeSpace());
//        System.out.println("Get usable space: " + file.getUsableSpace());
//        System.out.println("Get total space: " + file.getTotalSpace());
//        System.out.println("Set executable: " + file.setExecutable(true));
//        System.out.println("Set read-only: " + file.setReadOnly());
//        System.out.println("Set writable: " + file.setWritable(true));
//        System.out.println(file.delete());
//        file.deleteOnExit();

//    public static <T> void println(T value) {70346
//        System.out.println(value);
//    }
//        println("Yahallo!");

//        try (InputStream inputStream = new InputStream() {
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
//        }) {
//        }

//@FunctionalInterface
//interface Test {
//    void test();
//}

//        List<Integer> list = List.of(1, 2, 3);

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
//        list.add(1);

//        Consumer consumer;
//        consumer(() -> {});
//        for (int i = 0; i < 5; System.out.println(i), i++) {
//
//        }

//        System.out.println();
//        outerLoop:
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 5; j++) {
//                if (i == 4)
//                    break outerLoop;
//                System.out.print('a');
//            }
//            System.out.println();
//        }

//        ThreadDemo.start();

//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().totalMemory());

//        Set<String> set1 = new HashSet<>(Arrays.asList("b"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
//        set1.retainAll(set2);
//        System.out.println(set1);

//        List<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4);
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//class A {
//    final public void abebe() {
//
//    }
//}
//
//class B extends A {
//    final public void abebe() {
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

//interface Abyayel {
//    int x = 10;
//    void rotte();
//}
//
//class Gette {
//    void drink() {
//        System.out.println("Nati drinks.");
//    }
//    static void move() {
//        System.out.println("Move bitch, move!");
//    }
//}
//
//class Anberbir extends Gette {
////    static void move() {
////        System.out.println("Move gellete, move!");
////    }
//}
//
//abstract class A {
//    abstract void eat();
//}
//
//class B extends A {
//    @Override
//    void eat() {
////        Character.isu
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
////        System.out.println(Character.isAlphabetic('s'));
////        System.out.println(Character.isSpaceChar('\b'));
////        System.out.println(Character.isWhitespace('\b'));
////        String string = "Chaltu";
////        string.
//        Gette nati = new Gette();
//        nati.drink();
//        Gette abel = new Gette() {
//            @Override
//            void drink() {
//                System.out.println("Abel drinks.");;
//            }
//        };
//        abel.drink();
//        Anberbir.move();
//
//        int[] numbers1 = {1, 2, 3};
//        int[] numbers2 = numbers1;
//        numbers2[0] = 10;
//        System.out.println(numbers1[0]);
//
//        String s1 = "Burka";
//        String s2 = s1;
//        s2 = "Enticho";
//        System.out.println(s1);
//
//        String s3 = new String("Bogale");
//        String s4 = s3;
//        s4 = new String("Abebaye");
//        System.out.println(s3);
//
//        Gette gette = new Gette();
//        gette.move();
//
//    }
//}

//class A {
//    static class B {
//        static void eat() {}
//
//    }
//    class C {
//
//    }
//}
//
//interface Nati {
//    int a = 29;
//    default void eat() {}
//}
//
//public class Mains {
//    public static void main(String[] args) {
//        A a = new A();
//        A.C abebe = new A().new C();
//        A.B kebede = new A.B();
//        Character.is
//    }
//}

//class Super {
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    int num;
//    Super() {
//        System.out.println("Abebe");
//    }
//    Super(int num) {
//        System.out.println("Super constructed.");
//        this.num = num;
//    }
//}
//
//class Sub extends Super {
//    Sub(int num) {
//        super(num);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Sub sub = new Sub(5);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    String name;
//    public static void helloName(){
//        String name;
//        Scanner input= new Scanner(System.in);
//        name = input.nextLine();
//        System.out.println("Hello" + name);
//    }
//    public static void main(String[] args) {
//        System.out.print("What is your name?");
//        helloName();
//    }
//}

//class Animal {
////    Animal() {}
//    Animal(String string) {
//
//    }
//}
//
//class Dog extends Animal {
//    Dog(String string) {
//        super(string);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal animal = new Animal();
//    }
//}

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            inputAge();
//        } catch (IllegalArgumentException e) {
//            System.out.println("Something 1");
//        } catch (InputMismatchException e) {
//            System.out.println("Something 2");
//        }
//        System.out.println("Program continues.");
//    }
//
//    private static void inputAge() throws IllegalArgumentException, InputMismatchException {
//        System.out.print("Enter your age: ");
//        int age = new Scanner(System.in).nextByte();
//        if (age <= 0)
//            throw new IllegalArgumentException();
//        System.out.println("You are " + age + " years old.");
//    }
//}

//class Animal {
//    int x = 10;
//    void makeNoise() {
//        System.out.println("Animal making noise.");
//    }
//    {
//        System.out.println("Animal.");
//    }
//}
//
//class Dog extends Animal {
//    int x = 20;
//    int y = 30;
//    void eat() {
//        System.out.println("Eating.");
//    }
//    @Override
//    void makeNoise() {
//        System.out.println("Dog making noise.");
//    }
//}
//
//class Cat extends Dog {
//    @Override
//    void makeNoise() {
//        System.out.println("Cat making noise");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal[] animals = {new Animal(), new Cat(), new Dog()};
//        for (Animal animal : animals)
//            animal.makeNoise();
//        Animal a = new Dog();
//        System.out.println(a.x);
//        Dog dog = (Dog) a;
//        System.out.println(dog.x);
////        Dog dog = new Dog();
//        Animal b = null;
//        Cat cat = (Cat) b;
//        System.out.println(cat.y);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String string1 = "Abebe";
//        String string2 = "Abebe";
//        String string3 = new String("Abebe");
//        System.out.println(string1 == string2);
//        System.out.println(string1.equals(string3));
//        Integer x = 10;
//        Integer y = new Integer(10);
//        int z = Integer.parseInt("23");
//        double a = Double.parseDouble("23");
//        float b = Float.parseFloat("24.7");
//        float c = 4.5f;
//        long d = 5;
//        long e = 5L;
//        System.out.println();
//        System.out.println(x == y);
//        System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
//class Person {
//    void eat() {
//        System.out.println("Abebe besso bela.");
//    }
//    void drink() {
//        System.out.println();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person() {
//            void eat() {
//                System.out.println("Abebe besso albelam.");
//            }
////            void drink() {
////                System.out.println("Abebe besso tetta.");
////            }
//        };
//        Person person2 = new Person();
//
//        person1.eat();
//        person2.eat();
//
//        List<Integer> list = new List<Integer>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Integer get(int index) {
//                return null;
//            }
//
//            @Override
//            public Integer set(int index, Integer element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, Integer element) {
//
//            }
//
//            @Override
//            public Integer remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<Integer> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<Integer> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Integer> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        };
//    }
//}

//public class Main {
//    static int i = 1;
//    public static void main(String[] args) {
//        int n = 20;
//        switch (n) {
//            case 10: n += 1;
//            case 15: n += 2;
//            case 20: n += 3;
//            case 25: n += 4;
//            case 30: n += 5;
//        }
//        System.out.println(n);
//        System.out.println("H" + "a");
//        System.out.println('a' + 0);
//
//        System.out.println();
//
//        System.out.println(i + ", ");
//        m(i);
//        System.out.println(i);
//
//    }
//
//    public static void m(int i) {
//        i += 2;
//    }
//}

//interface Abebe {
//
//}
//
//interface Challa {
//
//}
//
//interface Kebede extends Abebe, Challa {
//
//}
//class B {
//    public B(B b) {
//
//    }
//    String s = "Class B";
//    static class A {
//        String s = "Class A";
//    }
//    class C extends A {
//
//    }
//    abstract void show();
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        B.A a = new B.A();
//        System.out.println(a.s);
//    }
//}

//class A {
//    String s = "Class A";
//}
//
//class B extends A {
//    String s = "Class B";
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A a = new B();
//        System.out.println(a.s);
//    }
//}

//class A {
//    String s = "Class A";
//}
//
//class B extends A {
//    String s = "Class B";
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B {
//    String s = "Class C";
//    {
//        System.out.println(super.s);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        C c = new C();
//        System.out.println(c.s);
//    }
//}