package Funktionalinterface;

public class Example {
    public static void main(String[] args) {
        @FunctionalInterface
        interface MyFunctionalInterface {
            void doSomething();
        }

        MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override
            public void doSomething() {
                System.out.println("Anonim siniflə çağırıldı!");
            }
        };

        Mycase1 object = new Mycase1() {
            @Override
            public void doWrite() {
                System.out.println("heyyy Murikk ");
            }
        };

        Sout sout = new Sout() {
            @Override
            public void doThing() {
                System.out.println("Turing Academy");
            }
        };

        obj.doSomething();
        object.doWrite();
        sout.doThing();

    }
}
