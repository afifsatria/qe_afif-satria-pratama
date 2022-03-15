package section12n13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
        public <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
        {

            Set<T> set = new LinkedHashSet<>();
            set.addAll(list);
            list.clear();
            list.addAll(set);
            return list;
        }

        public void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 6, 9, 9));

            System.out.println("Duplicates: " + list);

            ArrayList<Integer> newList = removeDuplicates(list);

            System.out.println("Duplicates removed: " + newList);
            System.out.println("Output: " + newList.size());
        }

    }
