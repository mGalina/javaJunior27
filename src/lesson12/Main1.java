package lesson12;

import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(13);
        nums.add(4);
        nums.add(3);
        nums.add(1);


        System.out.println(nums);
    }
}
