package SUPL;


import java.util.Arrays;


public class SortedUniquePersonList {
    public Person[] people;

    public SortedUniquePersonList(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "SortedUniquePersonList{" +
                "people=" + Arrays.toString(people) +
                '}';
    }

    public static void main(String[] args) {
        Person uusinimine = new Person(5, "Kristjan", "Lõhmus");
        Person uusInimene2 = new Person(4, "Uku", "Kangur");
        Person[] uus = new Person[1];
        uus[0] = uusinimine;
        SortedUniquePersonList uuslist = new SortedUniquePersonList(uus);
        uuslist.add(uusInimene2);
        uuslist.removeElement(4);
        System.out.println(uuslist.toString());
    }

    public Person getElementAt(int index) {
        if (0 <= index && index < people.length) {
            return people[index];
        } else {
            return null;
        }
    }

    public int indexOf(int idCode) {
        {
            for (int i = 0; i < people.length; i++) {
                if (idCode == people[i].getIdCode()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(Person person) {
        int uusindeks = indexOf(person.getIdCode());
        Person[] uuspeople = new Person[people.length + 1];
        if (uusindeks != -1) {
            return false;
        } else {
            for (int i = 0; i < people.length; i++) {
                if (person.getIdCode() > people[i].getIdCode()) {
                    uuspeople[i] = people[i];
                } else {
                    uuspeople[i + 1] = people[i];
                }
            }
            for (int i = 0; i < uuspeople.length; i++) {
                if (uuspeople[i] == null) {
                    uuspeople[i] = person;
                }
            }
        }
        people = uuspeople;
        return true;
    }


    public boolean removeElement(int idCode) {
        Person[] uuslist = new Person[people.length - 1];
        int eemaldatavIndeks = indexOf(idCode);
        System.out.println(eemaldatavIndeks);
        if (eemaldatavIndeks == -1) {
            return false;
        } else {
            for (int i = 0; i < people.length; i++) {
                if (i < eemaldatavIndeks) {
                    uuslist[i] = people[i];
                } else if (i > eemaldatavIndeks) {
                    uuslist[i - 1] = people[i];
                }
            }
        }
        people = uuslist;
        return true;
    }


    public int size() {
        return people.length;
    }
}
