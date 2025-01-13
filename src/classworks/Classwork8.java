package classworks;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

public class Classwork8 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
        Converter converter1 = new Converter(numbers);
        Converter converter2 = new Converter(colors);
        System.out.println(converter1.reverse());
        System.out.println(converter2.reverse());

        SomeClass[] array1 = (SomeClass[]) Classwork8.toArray(SomeClass.class, 32);
        System.out.println(Arrays.toString(array1));
    }

    public static Object[] toArray(Class cls, int size)
            throws Exception {
        Constructor ctor = cls.getConstructors()[0];
        Object[] objects = new Object[size];
        for ( int i = 0; i < size; i++ ) {
            objects[i] = ctor.newInstance();
        }

        return objects;
    }
}

class SomeClass {
    int val;

}


class Converter<T> {
    private ArrayList<T> objects;
    public Converter(ArrayList<T> objects) {
        this.objects = objects;
    }

    public ArrayList<T> reverse() {
        ArrayList<T> newArray = new ArrayList<>();
        for (int i = 0, j = objects.size() - 1; i < objects.size(); i++, j--) {
            newArray.add(objects.get(j));
        }
        return newArray;
    }
}
