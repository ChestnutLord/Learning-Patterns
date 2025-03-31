package Behave.Iterator;

public class Demo {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Patterns", "Maven", "SQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Bob", skills);

        MyIterator iterator = javaDeveloper.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
