public class App {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();

        // add(E e)
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(3);
        System.out.println(arrayList);

        // add(E e, int index)
        arrayList.add(2, 4);
        System.out.println(arrayList);
        arrayList.add(2, 10);
        System.out.println(arrayList);

        // set(E e, int index)
        arrayList.set(0, 77);
        System.out.println(arrayList);

        // remove(E e)
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
