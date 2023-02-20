package ie.atu.productv5;




public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }
        if (productCode.equalsIgnoreCase("Song")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Hello by Adele");
            myMusic.setPrice(0.99);
            myMusic.setLabel("XL Recordings");
            myMusic.setArtist("Adele");
            p = myMusic;
        }
        if (productCode.equalsIgnoreCase("Sony")) {
            TV myTv = new TV();
            myTv.setCode(productCode);
            myTv.setDescription("4k hdr smart Tv\n");
            myTv.setPrice(599.99);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("64 inch");
            p = myTv;
        }
        if (productCode.equalsIgnoreCase("Animal" )) {
            Dog myDog = new Dog();
            myDog.setType(productCode);
            myDog.setBreed("poodle");
            myDog.setAge(13);
            myDog.setPrice(5000);
            myDog.setNeutered("yes");
            myDog.setShedding("yes");
            myDog.setVaccination("no");
            p = myDog;
        }
        else if (productCode.equalsIgnoreCase("Animal2")) {
            Horse myHorse= new Horse();
            myHorse.setType(productCode);
            myHorse.setBreed("mustang");
            myHorse.setAge(9);
            myHorse.setPrice(25000);
            myHorse.setDam("yes");
            myHorse.setHeight(2);
            myHorse.setSire("yes");
            p = myHorse;
        }
        return p;
    }
}
