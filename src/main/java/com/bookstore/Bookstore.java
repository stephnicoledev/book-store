package com.bookstore;

public class Bookstore {

    public static void main(String[] args) {
        System.out.println("Welcome to Books & Beans!");
        ShoppingCart cart = new ShoppingCart(0.075);

        Book ifWeWereVillains = new Book("If We Were Villains", "M.L. Rio", 17.99);
        Book theOnceAndFutureWitches = new Book("The Once and Future Witches", "Alix E. Harrow", 17.99);
        Book suchSharpTeeth = new Book("Such Sharp Teeth", "Rachel Harrison", 17.00);
        Book theMaidens = new Book("The Maidens", "Alex Michaelides", 17.99);
        Book youAgain = new Book("You Again", "Kate Goldbeck", 24.99);

        Movie toyStory = new Movie("Toy Story", 81, 19.99);

        Music speakNow = new Music("Speak Now", "Taylor Swift", "Pop", 11.99);

        Beverage myFavoriteCoffee = new Beverage("Grande", "Dark Roast", new String[] {"Iced", "Oat Milk", "Cinnamon Dolce Syrup"}, 4.98);
        Beverage chaiTea = new Beverage("Tall", "Chai Tea Latte", new String[] {"Hot", "Soy Milk"}, 5.00);



        cart.add(ifWeWereVillains);
        cart.add(theOnceAndFutureWitches);
        cart.add(suchSharpTeeth);
        cart.add(theMaidens);
        cart.add(youAgain);
        cart.add(toyStory);
        cart.add(speakNow);
        cart.add(myFavoriteCoffee);
        cart.add(chaiTea);

        System.out.println(cart.receipt());
    }

}
