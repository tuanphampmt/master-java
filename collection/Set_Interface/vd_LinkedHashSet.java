package collection.Set_Interface;

import collection.User;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class vd_LinkedHashSet {

    //Những điểm quan trọng về lớp LinkedHashSet trong java là:
   // Chỉ chứa các phần tử duy nhất giống như HashSet.
    //Duy trì thứ tự chèn.
    public static void main(String[] args) {

        Set<String> setA = new LinkedHashSet<>();
        setA.add("Java");
        setA.add("C++");
        setA.add("C#");
        setA.add(null);
        for (String item: setA) {
            System.out.println(item);
        }


        // init set
        LinkedHashSet<User> set = new LinkedHashSet<User>();
        // create students object
        User User1 = new User("Cong", 17, true);
        User User2 = new User("Dung", 16, true);
        User User3 = new User("Ngon", 18, true);
        User User4 = new User("Hanh", 19, true);
        // add students object to set
        set.add(User1);
        set.add(User2);
        set.add(User3);
        set.add(User4);
        // show set
        Iterator<User> iterator = set.iterator();
        User user;
        while (iterator.hasNext()) {
            user = iterator.next();
            System.out.println(user.toString());
        }
    }
}
