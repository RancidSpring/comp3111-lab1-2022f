package Lab1;

public class Library {
    public static void main(String[] arg) {
        Library library = new Library();
        if (library.someLibraryMethod()) {
            System.out.println("Hello, World!");
        }
    }

    public boolean someLibraryMethod() {
        return true;
    }
}
