public class MainForArrayList {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("rabotnik");
        arrayList.add("rabotnik2");
        arrayList.add("rabotnik3");
        arrayList.add("rabotnik4");
        arrayList.add("rabotnik5");
        arrayList.add("rabotnik6");
        arrayList.remove(2);
        arrayList.remove("rabotnik");


        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
