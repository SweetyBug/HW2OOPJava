import java.util.ArrayList;
import java.util.Objects;

public class Mother extends Human{

    Mother(String nameChild, int ageChild, Mother motherChild, Father fatherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.father = fatherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Mother(String nameChild, int ageChild, Father fatherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.father = fatherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Mother(String nameChild, int ageChild, Mother motherChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Mother(String nameChild, int ageChild, ArrayList<Object> childrenFather, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.children.add(childrenFather);
        super.howIs = howIs;
    }

    Mother(String nameChild, int ageChild, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.howIs = howIs;
    }

    Mother() {
    }

}
