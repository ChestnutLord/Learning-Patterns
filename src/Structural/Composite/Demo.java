package Structural.Composite;

public class Demo {
    public static void main(String[] args) {
        Team devTeam = new Team();

        devTeam.addDeveloper(new CppDev());
        devTeam.addDeveloper(new CppDev());
        devTeam.addDeveloper(new CppDev());
        devTeam.addDeveloper(new CppDev());

        devTeam.addDeveloper(new JavaDev());
        devTeam.addDeveloper(new JavaDev());
        devTeam.addDeveloper(new JavaDev());

        devTeam.writeCode();
    }
}
