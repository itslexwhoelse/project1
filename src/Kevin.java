public class Kevin {
    public static void main(String[] args) {
        String[] libby = new String[4];
        libby[0] = "Athar";
        libby[1] = "Bob";
        libby[2] = "Carl";
        libby[3] = "David";
        m(libby);
    }

    public static void m(String[] list) {
        int first = 0;
        String name = list[first];
        for (int i = 1; i < list.length; i++) {
            if (name.compareTo(list[i]) > 0) {
                first = i;
                name = list[i];
            }
        }
        System.out.println(first + ": " + name);
    }

}
