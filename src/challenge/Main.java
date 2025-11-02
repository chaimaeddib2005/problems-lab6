package challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Town> towns = new LinkedList<>();
        towns.add(new Town("Sydney", 0));
        towns.add(new Town("Melbourne", 877));
        towns.add(new Town("Brisbane", 917));
        towns.add(new Town("Adelaide", 1374));
        towns.add(new Town("Alice Springs", 2771));
        towns.add(new Town("Perth", 3923));
        towns.add(new Town("Darwin", 3972));

        ListIterator<Town> iterator = towns.listIterator();
        Town current = iterator.next();

        Scanner sc = new Scanner(System.in);
        char choice = 'S';
        boolean movingForward = true;

        while (choice != 'Q') {
            System.out.println("""
                    Type a character to proceed:
                    (F) Forward
                    (B) Backward
                    (D) Display towns
                    (Q) Quit""");
            choice = Character.toUpperCase(sc.next().charAt(0));

            if (choice == 'F') {
                if (!movingForward) {

                    if (iterator.hasNext()) iterator.next();
                    movingForward = true;
                }

                if (iterator.hasNext()) {
                    current = iterator.next();
                    System.out.println("Now visiting: " + current);
                } else {
                    System.out.println("You reached the farthest town from Sydney.");
                }
            } else if (choice == 'B') {
                if (movingForward) {

                    if (iterator.hasPrevious()) iterator.previous();
                    movingForward = false;
                }

                if (iterator.hasPrevious()) {
                    current = iterator.previous();
                    System.out.println("Now visiting: " + current);
                } else {
                    System.out.println("You are at Sydney.");
                }
            } else if (choice == 'D') {
                System.out.println("List of towns:");
                for (Town t : towns) {
                    System.out.println(t);
                }
            }
        }

        sc.close();
    }
}
