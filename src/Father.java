import java.util.ArrayList;

public class Father extends Human{

    Father(String nameChild, int ageChild, Mother motherChild, Father fatherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.father = fatherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Father(String nameChild, int ageChild, Father fatherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.father = fatherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Father(String nameChild, int ageChild, Mother motherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Father(String nameChild, int ageChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Father(String nameChild, int ageChild) {
        super.name = nameChild;
        super.age = ageChild;
    }

    Father() {
    }

}
