package nested.anonymous;


import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;


            @Override
            public void printer() {
                System.out.println("value= "+value);
                System.out.println("localVar="+localVar);
                System.out.println("paramVar= "+paramVar);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printer();
    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);
    }
    }
