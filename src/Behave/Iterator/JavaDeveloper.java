package Behave.Iterator;

public class JavaDeveloper implements MyIterable {

    String name;
    String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public MyIterator iterator() {
        return new JavaDeveloperMyIterator();
    }


    class JavaDeveloperMyIterator implements MyIterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
