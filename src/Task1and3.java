import java.util.List;

public class Task1and3 {
    public static void main(String[] args) {
        List<String> stringList = List.of("mo", "jo", "li", "flo", "mo", "li");
        System.out.println("проверка boolean есть ли в данном листе повторяющиеся объект: ");
        System.out.println(ListUtil.hasDuplicateObjects(stringList));


        System.out.println("\nУдаление в данном листе повторяющиеся объекты и вывод в консоль: ");
        ListUtil.print(ListUtil.removeDuplicateObjects(stringList));
    }


}