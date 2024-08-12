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

        // remove (Integer element)
        arrayList.remove(3);
        System.out.println(arrayList);

        // get (int index)
        int firstIndex = arrayList.get(0);
        System.out.println(firstIndex);

        // contains (Integer element)
        System.out.println(arrayList.contains(77));

        // size ()
        System.out.println(arrayList.size());

        // isEmpty()
        System.out.println(arrayList.isEmpty());

        // next()
        System.out.println(arrayList.iterator().next());

        // hasNext()
        System.out.println(arrayList.iterator().hasNext());

        // lastIndexOf (E element)
        System.out.println(arrayList.lastIndexOf(77));
        System.out.println(arrayList);

        // clear()
        arrayList.clear();
        System.out.println(arrayList);
    }
}
