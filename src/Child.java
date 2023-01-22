public class Child extends Human {

    Child(String nameChild, int ageChild, Mother motherChild, Father fatherChild, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.father = fatherChild;
        super.howIs = howIs;
    }

    Child(String nameChild, int ageChild, Father fatherChild, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.father = fatherChild;
        super.howIs = howIs;
    }

    Child(String nameChild, int ageChild, Mother motherChild, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.mother = motherChild;
        super.howIs = howIs;
    }

    Child( String nameChild, int ageChild, String howIs) {
        super.name = nameChild;
        super.age = ageChild;
        super.howIs = howIs;
    }

    Child( String nameChild, int ageChild) {
        super.name = nameChild;
        super.age = ageChild;
    }

    Child() {
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
