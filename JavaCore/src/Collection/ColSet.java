package Collection;

import util.Contact;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColSet {
    public static void main(String[] args) {

//        TreeSet

        Set<String> setTree = new TreeSet<>();
        setTree.add("ankara");
        setTree.add("İstanbul");
        setTree.add("adana");
        setTree.add("konya");
        setTree.add("yozgat");
        setTree.add("yozgat");
        setTree.add("bolu");
        System.err.println(setTree);


//        HashSet

        Set<Contact> contatcHS = new HashSet<>();
 
        contatcHS.add(new Contact(12, "mmm"));
        contatcHS.add(new Contact(12, "mmm"));
        contatcHS.add(new Contact(12, "mmm"));
        contatcHS.add(new Contact(12, "mmm"));
        contatcHS.add(new Contact(23423, "ggg"));
        contatcHS.add(new Contact(1, "sdasd"));
        contatcHS.add(new Contact(3423, "yozgat"));
        contatcHS.add(new Contact(456, "onya"));
        contatcHS.add(new Contact(6, "gfdg"));
        contatcHS.add(new Contact(9, "asdas"));


        contatcHS.forEach(x -> {

            System.err.print(x.age + ",");
            System.err.print(x.name);
            System.err.println();
        });
//        LinkedHashSet

        Set<Contact> contatcLinkedHS = new LinkedHashSet<>();

        contatcLinkedHS.add(new Contact(12, "mmm"));
        contatcLinkedHS.add(new Contact(23423, "ggg"));
        contatcLinkedHS.add(new Contact(1, "sdasd"));
        contatcLinkedHS.add(new Contact(1, "sdasd"));
        contatcLinkedHS.add(new Contact(1, "sdasd"));
        contatcLinkedHS.add(new Contact(1, "sdasd"));
        contatcLinkedHS.add(new Contact(3423, "yozgat"));
        contatcLinkedHS.add(new Contact(456, "onya"));
        contatcLinkedHS.add(new Contact(6, "gfdg"));
        contatcLinkedHS.add(new Contact(9, "asdas"));


        contatcLinkedHS.forEach(x -> {

            System.err.print(x.age + ",");
            System.err.print(x.name);
            System.err.println();
        });
    }

}
