import java.util.ArrayList;
import java.util.Scanner;

public class Main implements FamilyTree {

    static Scanner user = new Scanner(System.in);
    static ArrayList<Object> family = new ArrayList<>();

    public static void main(String[] args) {
        String answer;
        System.out.println("Hello!\nLet's make a family tree? (Y/n)");
        answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Good!");
            program();
        } else {
            System.out.println("Bye!");
        }
        System.out.println(family);
    }

    public static void program() {
        Main main = new Main();
        main.addChild();
    }

    @Override
    public Mother addMother(Object child) {
        Mother mother = new Mother();

        mother.children.add(child);

        System.out.println("Name:");
        mother.name = user.nextLine();
        System.out.println("age: ");
        String k = user.nextLine();
        mother.age = Integer.parseInt(k);
        System.out.println("Mother? (Y/n)");
        String answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            mother.mother = addMother(mother);
        }
        System.out.println("father? (Y/n)");
        answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            mother.father = addFather(mother);
        }
        System.out.println("Who is this?:");
        mother.howIs = user.nextLine();

        //family.add(mother);

        return null;
    }

    @Override
    public Father addFather(Object child) {
        Father father = new Father();

        System.out.println("Name:");
        father.name = user.nextLine();
        System.out.println("age: ");
        String k = user.nextLine();
        father.age = Integer.parseInt(k);
        System.out.println("Mother? (Y/n)");
        String answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            father.mother = addMother(father);
        }
        System.out.println("father? (Y/n)");
        answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            father.father = addFather(father);
        }
        System.out.println("Who is this?:");
        father.howIs = user.nextLine();
        father.children.add(child);

        family.add(father);

        return father;
    }

    @Override
    public Child addChild() {
        Child child = new Child();

        System.out.println("Name:");
        child.name = user.nextLine();
        System.out.println("age: ");
        String k = user.nextLine();
        child.age = Integer.parseInt(k);
        System.out.println("Mother? (Y/n)");
        String answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            child.mother = addMother(child);
        }
        System.out.println("father? (Y/n)");
        answer = user.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            child.father = addFather(child);
        }

        System.out.println("Who is this?:");
        child.howIs = user.nextLine();

        family.add(child);

        return child;
    }
}