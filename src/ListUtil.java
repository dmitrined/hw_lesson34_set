import java.util.*;

public class ListUtil {
    private ListUtil() {
    }

    public static <T> boolean hasDuplicateObjects(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return set.size() < list.size();
    }

    public static <T> List<T> removeDuplicateObjects(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static <T> void print(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
    public static <T> List<T> sort(List<T> list, Comparator<T> comparator){
        List<T> result = new ArrayList<>(list);
        Collections.sort(result,comparator);
        return result;
    }

    public static <T> List<T> addAllListsToOne(List<List<T>> listOfLists) {
        List<T> result = new ArrayList<>();
        for (List<T> list : listOfLists) {
            result.addAll(list);
        }
        return result;
    }
    /*

 Сначала я создал такой метод-результат не универсальный : пришлось погуглить

    public static <T> List<T> addAllListsToOne(List<T> list1, List<T> list2, List<T> list3) {
        List<T> result = new ArrayList<>();
        for (T element1 : list1) {
            result.add(element1);
        }
        for (T element2 : list2) {
            result.add(element2);
        }
        for (T element3 : list3) {
            result.add(element3);
        }
        return result;
    }

     */


}
