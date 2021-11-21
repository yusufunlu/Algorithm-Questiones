package codesignal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog a = new Dog(1);
        a.setName("first");

        System.out.println("Before: a = " + a);
        changeValue(a);
        System.out.println("After: a = " + a );

        List<Integer> map = new ArrayList<>();


    }



    public static void changeValue(Dog x){
        x.setOld(2);
        x=new Dog(4);
        x.setOld(8);
    }

    static class Dog {
        String name;
        int old;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(int old) {
            this.old = old;
        }

        public int getOld() {
            return old;
        }

        public Dog setOld(int old) {
            this.old = old;
            return this;
        }

        public String getName() {
            return name;
        }

        public Dog setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", old=" + old +
                    '}';
        }
    }
}
