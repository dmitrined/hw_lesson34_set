import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Person> team1 = new ArrayList<>();
        team1.add(new Person("Майк", "Тайсон", "1966.06.30"));
        team1.add(new Person("Илон", "Маск", "1971.06.28"));
        team1.add(new Person("Дональд", "Трамп", "1946.06.14"));
        team1.add(new Person("Владимир", "Путин", "1952.10.07"));
        team1.add(new Person("Олаф", "Шольц", "1958.06.14"));
        List<Person> team2 = new ArrayList<>();
        team2.add(new Person("Джеки", "Чан", "1954.04.07"));
        team2.add(new Person("Юрий", "Шатунов", "1973.09.06"));
        team2.add(new Person("Филипп", "Киркоров", "1967.04.30"));
        team2.add(new Person("Илон", "Маск", "1971.06.28"));
        List<Person> team3 = new ArrayList<>();
        team3.add(new Person("Виктор", "Цой", "1962.06.21"));
        team3.add(new Person("Юрий", "Гагарин", "1934.03.09"));
        team3.add(new Person("Майк", "Тайсон", "1966.06.30"));
        team3.add(new Person("Владимир", "Путин", "1952.10.07"));

        System.out.println("\n--Все Person в листе (с повтором)--");
        List<List<Person>> teamList = List.of(team1, team2, team3);
        List<Person> allTeamList = ListUtil.addAllListsToOne(teamList);
        ListUtil.print(allTeamList);

        System.out.println("\n--Общий список Person, но без повторов--");
        List<Person> unrepeatedTeamList = ListUtil.removeDuplicateObjects(allTeamList);
        ListUtil.print(unrepeatedTeamList);
    }

}
