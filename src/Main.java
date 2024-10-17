public class Main {
    public static void main(String[] args) {

        Author LevTolstoy = new Author("Лев", "Толстой");
        Book WarAndPeace = new Book("Война и мир", 1869,LevTolstoy);
        System.out.println(WarAndPeace.getTitle() + " " + WarAndPeace.getYearOfPublication()
                + " " + WarAndPeace.getAuthor() + " " + LevTolstoy.getName()
                + " " + LevTolstoy.getSurname());

        WarAndPeace.setYearOfPublication(1870);

        System.out.println(WarAndPeace.getTitle() + " " + WarAndPeace.getYearOfPublication()
                + " " + WarAndPeace.getAuthor() + " " + LevTolstoy.getName()
                + " " + LevTolstoy.getSurname());

        Author CharlesPerrault = new Author("Шарль" , "Перро");
        Book PussInBoots = new Book("Кот в сапогах" , 1697 , CharlesPerrault);
        System.out.println(PussInBoots.getTitle() + " " + PussInBoots.getYearOfPublication()
                + " " + PussInBoots.getAuthor() + " " + CharlesPerrault.getName()
                + " " + CharlesPerrault.getSurname());

    }
}