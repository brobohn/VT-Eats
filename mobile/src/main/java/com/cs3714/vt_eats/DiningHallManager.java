package com.cs3714.vt_eats;

import android.location.Location;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Ben on 4/29/2016.
 */
public class DiningHallManager {

    final int secondsPerHour = 60*60;

    private DiningHall[] diningHalls;

    public DiningHallManager() {
        diningHalls = new DiningHall[13];

        // build list here
        buildDiningHalls();
    }

    public DiningHall[] getDiningHalls() {
        return diningHalls;
    }

    private void buildDiningHalls() {

        DiningHall abpglc = new DiningHall("Au Bon Pain - Graduate Life Center");
        abpglc.addHours(Calendar.MONDAY, 7.5, 20);
        abpglc.addHours(Calendar.TUESDAY, 7.5, 20);
        abpglc.addHours(Calendar.WEDNESDAY, 7.5, 20);
        abpglc.addHours(Calendar.THURSDAY, 7.5, 20);
        abpglc.addHours(Calendar.FRIDAY, 7.5, 15);
        abpglc.setLocation(37.228237, -80.417594);

        abpglc.addFoodItem("Asiago Breadstick", new FoodItem(150, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Everything Breadstick", new FoodItem(160, "Soy, Wheat, Sesame"));
        abpglc.addFoodItem("Southwest Jalapeno Cornbread", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpglc.addFoodItem("Ciabatta", new FoodItem(190, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Gluten Free 3 Seed Roll", new FoodItem(160, "Eggs"));
        abpglc.addFoodItem("Tortilla Wrap", new FoodItem(280, "Soy Wheat"));
        abpglc.addFoodItem("Traditional Artisan Baguette", new FoodItem(190, "Soy,Wheat"));
        abpglc.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpglc.addFoodItem("Whole Wheat Tortilla Wrap", new FoodItem(260, "Soy, Wheat"));
        // Bagels
        abpglc.addFoodItem("Asiago Cheese Bagel", new FoodItem(330, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Everything Bagel", new FoodItem(260, "Soy, Wheat, Sesame"));
        abpglc.addFoodItem("Onion Dill Bagel", new FoodItem(260, "Soy, Wheat"));
        abpglc.addFoodItem("Skinny Wheat Bagel", new FoodItem(90, "Soy, Wheat"));
        abpglc.addFoodItem("Cinnamon Crisp Bagel", new FoodItem(370, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Honey 9-Grain Bagel", new FoodItem(280, "Soy, Wheat, Granola Topping may contain milk."));
        abpglc.addFoodItem("Plain Bagel", new FoodItem(250, "Soy, Wheat"));
        abpglc.addFoodItem("Cinnamon Raisin Bagel", new FoodItem(280, "Soy, Wheat"));
        abpglc.addFoodItem("Jalapeno Cheddar Bagel", new FoodItem(290, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Sesame Bagel", new FoodItem(270, "Soy, Wheat, Sesame"));
        // Cream Cheese
        abpglc.addFoodItem("Garden Vegetable Cream Cheese", new FoodItem(100, "Milk"));
        abpglc.addFoodItem("Reduced Fat Philadelphia Cream Cheese", new FoodItem(90, "Milk"));
        abpglc.addFoodItem("Honey Pecan Cream Cheese", new FoodItem(150, "Milk, Tree Nuts(Pecans). May Contain Peanuts"));
        abpglc.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts(Almonds), Wheat"));
        abpglc.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Cookies
        abpglc.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts, Wheat"));
        abpglc.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpglc.addFoodItem("Lemon White Chocolate Cookie", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Chocolate Chip Cookie", new FoodItem(370,"Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Chunky Peanut Butter Cookie", new FoodItem(400, "Eggs, Milk, Peanuts, Wheat"));
        abpglc.addFoodItem("English Toffee Cookie", new FoodItem(320, "Eggs, Milk, Soy, Tree Nuts, Wheats"));
        abpglc.addFoodItem("Mint Chocolate Chip Cookie", new FoodItem(560, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Chocolate Dipped Cranberry Almond Macaroon", new FoodItem(290, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpglc.addFoodItem("Classic Oatmeal Raisin Cookie", new FoodItem(290, "Eggs, Milk, Wheat"));
        abpglc.addFoodItem("Harvest Cookie", new FoodItem(370, "Eggs, Milk, Tree Nuts, Wheat"));
        abpglc.addFoodItem("Mudslide Cookie", new FoodItem(360, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Croissants
        abpglc.addFoodItem("Almond Croissant", new FoodItem(500, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpglc.addFoodItem("Chocolate Croissant", new FoodItem(480, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Raspberry Cheese Croissant", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Strawberry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Apple and Cinnamon Croissant", new FoodItem(240, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpglc.addFoodItem("Ham and Cheese Croissant", new FoodItem(410, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Raspberry CroisBun", new FoodItem(530, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Sweet Cheese CroisBun", new FoodItem(510, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Cherry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Plain Croissant", new FoodItem(280, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Spinach and Cheese Hot Croissant", new FoodItem(330, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Sweet Cheese Croissant", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        // Muffins & Scones
        abpglc.addFoodItem("Blueberry Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Cinnamon Chip Scone", new FoodItem(500, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Cranberry Walnut Muffin", new FoodItem(520, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpglc.addFoodItem("Raisin Bran Muffin", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Blueberry Scone", new FoodItem(410, "Milk, Soy, Wheat"));
        abpglc.addFoodItem("Corn Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Double Chocolate Chunk Muffin", new FoodItem(580, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Carrot Walnut Muffin", new FoodItem(540, "Eggs, Soy, Tree Nuts, Wheat, Sulfites"));
        abpglc.addFoodItem("Cranberry Orange Scone", new FoodItem(520, "Eggs, Milk, Wheat"));
        abpglc.addFoodItem("Low Fat Berry Muffin Whole Grains", new FoodItem(290, "Eggs, Milk, Soy, Wheat"));
        // Brownies
        abpglc.addFoodItem("Brownie Bites", new FoodItem(600, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Chewy Marshmallow Bar", new FoodItem(250, "Milk"));
        abpglc.addFoodItem("Chocolate Chip Brownie", new FoodItem(440, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Gluten Free Chocolate Chip Brownie", new FoodItem(420, "Eggs, Soy"));
        // Cupcakes
        abpglc.addFoodItem("Double Chocolate Cupcake", new FoodItem(320, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Lemon Drop Cupcake", new FoodItem(270,"Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Red Velvet Cupcake", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        // Danish
        abpglc.addFoodItem("Blueberry Danish", new FoodItem(380, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Cherry Danish", new FoodItem(370, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpglc.addFoodItem("Sweet Cheese Danish", new FoodItem(450, "Eggs, Milk, Soy, Wheat, Sulfites"));
        // Other Goodies
        abpglc.addFoodItem("Chocolate and Creme Torsade", new FoodItem(230, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpglc.addFoodItem("Marble Pound Cake", new FoodItem(450, "Eggs, Milk, Soy, Wheat"));
        abpglc.addFoodItem("Cinnamon Swirl Roll", new FoodItem(550, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpglc.addFoodItem("Pecan Roll", new FoodItem(740, "Eggs, Milk, Soy, Tree Nuts(Pecans), Wheat"));
        abpglc.addFoodItem("Raspberry Torsade", new FoodItem(200, "Eggs, Milk, Soy, Wheat, Sulfites  "));
        // Hot Coffee
        abpglc.addFoodItem("Decaf French Roast", new FoodItem(5,"None"));
        abpglc.addFoodItem("Hazelnut", new FoodItem(5, "None"));
        abpglc.addFoodItem("French Roast", new FoodItem(5, "None"));
        abpglc.addFoodItem("Morning Blend", new FoodItem(5, "None"));
        abpglc.addFoodItem("French Vanilla", new FoodItem(5, "None"));
        // Hot Espresso
        abpglc.addFoodItem("Caffe Americano", new FoodItem(10, "None"));
        abpglc.addFoodItem("Cappuccino", new FoodItem(120, "Milk"));
        abpglc.addFoodItem("Espresso", new FoodItem(5, "None"));
        abpglc.addFoodItem("Turtle Latte", new FoodItem(320, "Milk, Peanuts, Tree Nuts"));
        abpglc.addFoodItem("Caffe Latte", new FoodItem(140, "Milk"));
        abpglc.addFoodItem("Caramel Macchiato", new FoodItem(270, "Milk"));
        abpglc.addFoodItem("Hot Chocolate", new FoodItem(360, "Milk"));
        abpglc.addFoodItem("Vanilla Latte", new FoodItem(240, "Milk"));
        abpglc.addFoodItem("Chai Latte", new FoodItem(210, "Milk"));
        abpglc.addFoodItem("Mocha Latte", new FoodItem(310, "Milk"));

        diningHalls[0] = abpglc;

        DiningHall abpsc = new DiningHall("Au Bon Pain - Squires Cafe");
        abpsc.addHours(Calendar.SUNDAY, 11, 19);
        abpsc.addHours(Calendar.MONDAY, 8, 19);
        abpsc.addHours(Calendar.TUESDAY, 8, 19);
        abpsc.addHours(Calendar.WEDNESDAY, 8, 19);
        abpsc.addHours(Calendar.THURSDAY, 8, 19);
        abpsc.addHours(Calendar.FRIDAY, 8, 15);
        abpsc.addHours(Calendar.SATURDAY, 10, 19);
        abpsc.setLocation(37.229446, -80.418240);
        // Artisan Breads
        abpsc.addFoodItem("Asiago Breadstick", new FoodItem(150, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Everything Breadstick", new FoodItem(160, "Soy, Wheat, Sesame"));
        abpsc.addFoodItem("Southwest Jalapeno Cornbread", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpsc.addFoodItem("Ciabatta", new FoodItem(190, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Gluten Free 3 Seed Roll", new FoodItem(160, "Eggs"));
        abpsc.addFoodItem("Tortilla Wrap", new FoodItem(280, "Soy Wheat"));
        abpsc.addFoodItem("Traditional Artisan Baguette", new FoodItem(190, "Soy,Wheat"));
        abpsc.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpsc.addFoodItem("Whole Wheat Tortilla Wrap", new FoodItem(260, "Soy, Wheat"));
        // Bagels
        abpsc.addFoodItem("Asiago Cheese Bagel", new FoodItem(330, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Everything Bagel", new FoodItem(260, "Soy, Wheat, Sesame"));
        abpsc.addFoodItem("Onion Dill Bagel", new FoodItem(260, "Soy, Wheat"));
        abpsc.addFoodItem("Skinny Wheat Bagel", new FoodItem(90, "Soy, Wheat"));
        abpsc.addFoodItem("Cinnamon Crisp Bagel", new FoodItem(370, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Honey 9-Grain Bagel", new FoodItem(280, "Soy, Wheat, Granola Topping may contain milk."));
        abpsc.addFoodItem("Plain Bagel", new FoodItem(250, "Soy, Wheat"));
        abpsc.addFoodItem("Cinnamon Raisin Bagel", new FoodItem(280, "Soy, Wheat"));
        abpsc.addFoodItem("Jalapeno Cheddar Bagel", new FoodItem(290, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Sesame Bagel", new FoodItem(270, "Soy, Wheat, Sesame"));
        // Cream Cheese
        abpsc.addFoodItem("Garden Vegetable Cream Cheese", new FoodItem(100, "Milk"));
        abpsc.addFoodItem("Reduced Fat Philadelphia Cream Cheese", new FoodItem(90, "Milk"));
        abpsc.addFoodItem("Honey Pecan Cream Cheese", new FoodItem(150, "Milk, Tree Nuts(Pecans). May Contain Peanuts"));
        abpsc.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts(Almonds), Wheat"));
        abpsc.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Cookies
        abpsc.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts, Wheat"));
        abpsc.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpsc.addFoodItem("Lemon White Chocolate Cookie", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Chocolate Chip Cookie", new FoodItem(370,"Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Chunky Peanut Butter Cookie", new FoodItem(400, "Eggs, Milk, Peanuts, Wheat"));
        abpsc.addFoodItem("English Toffee Cookie", new FoodItem(320, "Eggs, Milk, Soy, Tree Nuts, Wheats"));
        abpsc.addFoodItem("Mint Chocolate Chip Cookie", new FoodItem(560, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Chocolate Dipped Cranberry Almond Macaroon", new FoodItem(290, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsc.addFoodItem("Classic Oatmeal Raisin Cookie", new FoodItem(290, "Eggs, Milk, Wheat"));
        abpsc.addFoodItem("Harvest Cookie", new FoodItem(370, "Eggs, Milk, Tree Nuts, Wheat"));
        abpsc.addFoodItem("Mudslide Cookie", new FoodItem(360, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Croissants
        abpsc.addFoodItem("Almond Croissant", new FoodItem(500, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsc.addFoodItem("Chocolate Croissant", new FoodItem(480, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Raspberry Cheese Croissant", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Strawberry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Apple and Cinnamon Croissant", new FoodItem(240, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsc.addFoodItem("Ham and Cheese Croissant", new FoodItem(410, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Raspberry CroisBun", new FoodItem(530, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Sweet Cheese CroisBun", new FoodItem(510, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Cherry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Plain Croissant", new FoodItem(280, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Spinach and Cheese Hot Croissant", new FoodItem(330, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Sweet Cheese Croissant", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        // Muffins & Scones
        abpsc.addFoodItem("Blueberry Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Cinnamon Chip Scone", new FoodItem(500, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Cranberry Walnut Muffin", new FoodItem(520, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpsc.addFoodItem("Raisin Bran Muffin", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Blueberry Scone", new FoodItem(410, "Milk, Soy, Wheat"));
        abpsc.addFoodItem("Corn Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Double Chocolate Chunk Muffin", new FoodItem(580, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Carrot Walnut Muffin", new FoodItem(540, "Eggs, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsc.addFoodItem("Cranberry Orange Scone", new FoodItem(520, "Eggs, Milk, Wheat"));
        abpsc.addFoodItem("Low Fat Berry Muffin Whole Grains", new FoodItem(290, "Eggs, Milk, Soy, Wheat"));
        // Brownies
        abpsc.addFoodItem("Brownie Bites", new FoodItem(600, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Chewy Marshmallow Bar", new FoodItem(250, "Milk"));
        abpsc.addFoodItem("Chocolate Chip Brownie", new FoodItem(440, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Gluten Free Chocolate Chip Brownie", new FoodItem(420, "Eggs, Soy"));
        // Cupcakes
        abpsc.addFoodItem("Double Chocolate Cupcake", new FoodItem(320, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Lemon Drop Cupcake", new FoodItem(270,"Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Red Velvet Cupcake", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        // Danish
        abpsc.addFoodItem("Blueberry Danish", new FoodItem(380, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Cherry Danish", new FoodItem(370, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsc.addFoodItem("Sweet Cheese Danish", new FoodItem(450, "Eggs, Milk, Soy, Wheat, Sulfites"));
        // Other Goodies
        abpsc.addFoodItem("Chocolate and Creme Torsade", new FoodItem(230, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsc.addFoodItem("Marble Pound Cake", new FoodItem(450, "Eggs, Milk, Soy, Wheat"));
        abpsc.addFoodItem("Cinnamon Swirl Roll", new FoodItem(550, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsc.addFoodItem("Pecan Roll", new FoodItem(740, "Eggs, Milk, Soy, Tree Nuts(Pecans), Wheat"));
        abpsc.addFoodItem("Raspberry Torsade", new FoodItem(200, "Eggs, Milk, Soy, Wheat, Sulfites  "));
        // Hot Coffee
        abpsc.addFoodItem("Decaf French Roast", new FoodItem(5,"None"));
        abpsc.addFoodItem("Hazelnut", new FoodItem(5, "None"));
        abpsc.addFoodItem("French Roast", new FoodItem(5, "None"));
        abpsc.addFoodItem("Morning Blend", new FoodItem(5, "None"));
        abpsc.addFoodItem("French Vanilla", new FoodItem(5, "None"));
        // Hot Espresso
        abpsc.addFoodItem("Caffe Americano", new FoodItem(10, "None"));
        abpsc.addFoodItem("Cappuccino", new FoodItem(120, "Milk"));
        abpsc.addFoodItem("Espresso", new FoodItem(5, "None"));
        abpsc.addFoodItem("Turtle Latte", new FoodItem(320, "Milk, Peanuts, Tree Nuts"));
        abpsc.addFoodItem("Caffe Latte", new FoodItem(140, "Milk"));
        abpsc.addFoodItem("Caramel Macchiato", new FoodItem(270, "Milk"));
        abpsc.addFoodItem("Hot Chocolate", new FoodItem(360, "Milk"));
        abpsc.addFoodItem("Vanilla Latte", new FoodItem(240, "Milk"));
        abpsc.addFoodItem("Chai Latte", new FoodItem(210, "Milk"));
        abpsc.addFoodItem("Mocha Latte", new FoodItem(310, "Milk"));

        diningHalls[1] = abpsc;

        DiningHall abpsk = new DiningHall("Au Bon Pain - Squires Kiosk");
        abpsk.addHours(Calendar.MONDAY, 7, 19);
        abpsk.addHours(Calendar.TUESDAY, 7, 19);
        abpsk.addHours(Calendar.WEDNESDAY, 7, 19);
        abpsk.addHours(Calendar.THURSDAY, 7, 19);
        abpsk.addHours(Calendar.FRIDAY, 7, 19);
        abpsk.setLocation(37.229491, -80.418077);

        abpsk.addFoodItem("Asiago Breadstick", new FoodItem(150, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Everything Breadstick", new FoodItem(160, "Soy, Wheat, Sesame"));
        abpsk.addFoodItem("Southwest Jalapeno Cornbread", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpsk.addFoodItem("Ciabatta", new FoodItem(190, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Gluten Free 3 Seed Roll", new FoodItem(160, "Eggs"));
        abpsk.addFoodItem("Tortilla Wrap", new FoodItem(280, "Soy Wheat"));
        abpsk.addFoodItem("Traditional Artisan Baguette", new FoodItem(190, "Soy,Wheat"));
        abpsk.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpsk.addFoodItem("Whole Wheat Tortilla Wrap", new FoodItem(260, "Soy, Wheat"));
        // Bagels
        abpsk.addFoodItem("Asiago Cheese Bagel", new FoodItem(330, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Everything Bagel", new FoodItem(260, "Soy, Wheat, Sesame"));
        abpsk.addFoodItem("Onion Dill Bagel", new FoodItem(260, "Soy, Wheat"));
        abpsk.addFoodItem("Skinny Wheat Bagel", new FoodItem(90, "Soy, Wheat"));
        abpsk.addFoodItem("Cinnamon Crisp Bagel", new FoodItem(370, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Honey 9-Grain Bagel", new FoodItem(280, "Soy, Wheat, Granola Topping may contain milk."));
        abpsk.addFoodItem("Plain Bagel", new FoodItem(250, "Soy, Wheat"));
        abpsk.addFoodItem("Cinnamon Raisin Bagel", new FoodItem(280, "Soy, Wheat"));
        abpsk.addFoodItem("Jalapeno Cheddar Bagel", new FoodItem(290, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Sesame Bagel", new FoodItem(270, "Soy, Wheat, Sesame"));
        // Cream Cheese
        abpsk.addFoodItem("Garden Vegetable Cream Cheese", new FoodItem(100, "Milk"));
        abpsk.addFoodItem("Reduced Fat Philadelphia Cream Cheese", new FoodItem(90, "Milk"));
        abpsk.addFoodItem("Honey Pecan Cream Cheese", new FoodItem(150, "Milk, Tree Nuts(Pecans). May Contain Peanuts"));
        abpsk.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts(Almonds), Wheat"));
        abpsk.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Cookies
        abpsk.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts, Wheat"));
        abpsk.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpsk.addFoodItem("Lemon White Chocolate Cookie", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Chocolate Chip Cookie", new FoodItem(370,"Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Chunky Peanut Butter Cookie", new FoodItem(400, "Eggs, Milk, Peanuts, Wheat"));
        abpsk.addFoodItem("English Toffee Cookie", new FoodItem(320, "Eggs, Milk, Soy, Tree Nuts, Wheats"));
        abpsk.addFoodItem("Mint Chocolate Chip Cookie", new FoodItem(560, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Chocolate Dipped Cranberry Almond Macaroon", new FoodItem(290, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsk.addFoodItem("Classic Oatmeal Raisin Cookie", new FoodItem(290, "Eggs, Milk, Wheat"));
        abpsk.addFoodItem("Harvest Cookie", new FoodItem(370, "Eggs, Milk, Tree Nuts, Wheat"));
        abpsk.addFoodItem("Mudslide Cookie", new FoodItem(360, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Croissants
        abpsk.addFoodItem("Almond Croissant", new FoodItem(500, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsk.addFoodItem("Chocolate Croissant", new FoodItem(480, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Raspberry Cheese Croissant", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Strawberry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Apple and Cinnamon Croissant", new FoodItem(240, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsk.addFoodItem("Ham and Cheese Croissant", new FoodItem(410, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Raspberry CroisBun", new FoodItem(530, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Sweet Cheese CroisBun", new FoodItem(510, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Cherry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Plain Croissant", new FoodItem(280, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Spinach and Cheese Hot Croissant", new FoodItem(330, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Sweet Cheese Croissant", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        // Muffins & Scones
        abpsk.addFoodItem("Blueberry Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Cinnamon Chip Scone", new FoodItem(500, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Cranberry Walnut Muffin", new FoodItem(520, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpsk.addFoodItem("Raisin Bran Muffin", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Blueberry Scone", new FoodItem(410, "Milk, Soy, Wheat"));
        abpsk.addFoodItem("Corn Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Double Chocolate Chunk Muffin", new FoodItem(580, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Carrot Walnut Muffin", new FoodItem(540, "Eggs, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsk.addFoodItem("Cranberry Orange Scone", new FoodItem(520, "Eggs, Milk, Wheat"));
        abpsk.addFoodItem("Low Fat Berry Muffin Whole Grains", new FoodItem(290, "Eggs, Milk, Soy, Wheat"));
        // Brownies
        abpsk.addFoodItem("Brownie Bites", new FoodItem(600, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Chewy Marshmallow Bar", new FoodItem(250, "Milk"));
        abpsk.addFoodItem("Chocolate Chip Brownie", new FoodItem(440, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Gluten Free Chocolate Chip Brownie", new FoodItem(420, "Eggs, Soy"));
        // Cupcakes
        abpsk.addFoodItem("Double Chocolate Cupcake", new FoodItem(320, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Lemon Drop Cupcake", new FoodItem(270,"Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Red Velvet Cupcake", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        // Danish
        abpsk.addFoodItem("Blueberry Danish", new FoodItem(380, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Cherry Danish", new FoodItem(370, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsk.addFoodItem("Sweet Cheese Danish", new FoodItem(450, "Eggs, Milk, Soy, Wheat, Sulfites"));
        // Other Goodies
        abpsk.addFoodItem("Chocolate and Creme Torsade", new FoodItem(230, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpsk.addFoodItem("Marble Pound Cake", new FoodItem(450, "Eggs, Milk, Soy, Wheat"));
        abpsk.addFoodItem("Cinnamon Swirl Roll", new FoodItem(550, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpsk.addFoodItem("Pecan Roll", new FoodItem(740, "Eggs, Milk, Soy, Tree Nuts(Pecans), Wheat"));
        abpsk.addFoodItem("Raspberry Torsade", new FoodItem(200, "Eggs, Milk, Soy, Wheat, Sulfites  "));
        // Hot Coffee
        abpsk.addFoodItem("Decaf French Roast", new FoodItem(5,"None"));
        abpsk.addFoodItem("Hazelnut", new FoodItem(5, "None"));
        abpsk.addFoodItem("French Roast", new FoodItem(5, "None"));
        abpsk.addFoodItem("Morning Blend", new FoodItem(5, "None"));
        abpsk.addFoodItem("French Vanilla", new FoodItem(5, "None"));
        // Hot Espresso
        abpsk.addFoodItem("Caffe Americano", new FoodItem(10, "None"));
        abpsk.addFoodItem("Cappuccino", new FoodItem(120, "Milk"));
        abpsk.addFoodItem("Espresso", new FoodItem(5, "None"));
        abpsk.addFoodItem("Turtle Latte", new FoodItem(320, "Milk, Peanuts, Tree Nuts"));
        abpsk.addFoodItem("Caffe Latte", new FoodItem(140, "Milk"));
        abpsk.addFoodItem("Caramel Macchiato", new FoodItem(270, "Milk"));
        abpsk.addFoodItem("Hot Chocolate", new FoodItem(360, "Milk"));
        abpsk.addFoodItem("Vanilla Latte", new FoodItem(240, "Milk"));
        abpsk.addFoodItem("Chai Latte", new FoodItem(210, "Milk"));
        abpsk.addFoodItem("Mocha Latte", new FoodItem(310, "Milk"));

        diningHalls[2] = abpsk;

        DiningHall abpg = new DiningHall("Au Bon Pain - Goodwin");
        abpg.addHours(Calendar.MONDAY, 7.5, 16);
        abpg.addHours(Calendar.TUESDAY, 7.5, 16);
        abpg.addHours(Calendar.WEDNESDAY, 7.5, 16);
        abpg.addHours(Calendar.THURSDAY, 7.5, 16);
        abpg.addHours(Calendar.FRIDAY, 7.5, 15.5);
        abpg.setLocation(37.232431, -80.425817);

        abpg.addFoodItem("Asiago Breadstick", new FoodItem(150, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Everything Breadstick", new FoodItem(160, "Soy, Wheat, Sesame"));
        abpg.addFoodItem("Southwest Jalapeno Cornbread", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpg.addFoodItem("Ciabatta", new FoodItem(190, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Gluten Free 3 Seed Roll", new FoodItem(160, "Eggs"));
        abpg.addFoodItem("Tortilla Wrap", new FoodItem(280, "Soy Wheat"));
        abpg.addFoodItem("Traditional Artisan Baguette", new FoodItem(190, "Soy,Wheat"));
        abpg.addFoodItem("Whole Grain Wheat Bread", new FoodItem(280, "Soy, Wheat"));
        abpg.addFoodItem("Whole Wheat Tortilla Wrap", new FoodItem(260, "Soy, Wheat"));
        // Bagels
        abpg.addFoodItem("Asiago Cheese Bagel", new FoodItem(330, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Everything Bagel", new FoodItem(260, "Soy, Wheat, Sesame"));
        abpg.addFoodItem("Onion Dill Bagel", new FoodItem(260, "Soy, Wheat"));
        abpg.addFoodItem("Skinny Wheat Bagel", new FoodItem(90, "Soy, Wheat"));
        abpg.addFoodItem("Cinnamon Crisp Bagel", new FoodItem(370, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Honey 9-Grain Bagel", new FoodItem(280, "Soy, Wheat, Granola Topping may contain milk."));
        abpg.addFoodItem("Plain Bagel", new FoodItem(250, "Soy, Wheat"));
        abpg.addFoodItem("Cinnamon Raisin Bagel", new FoodItem(280, "Soy, Wheat"));
        abpg.addFoodItem("Jalapeno Cheddar Bagel", new FoodItem(290, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Sesame Bagel", new FoodItem(270, "Soy, Wheat, Sesame"));
        // Cream Cheese
        abpg.addFoodItem("Garden Vegetable Cream Cheese", new FoodItem(100, "Milk"));
        abpg.addFoodItem("Reduced Fat Philadelphia Cream Cheese", new FoodItem(90, "Milk"));
        abpg.addFoodItem("Honey Pecan Cream Cheese", new FoodItem(150, "Milk, Tree Nuts(Pecans). May Contain Peanuts"));
        abpg.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts(Almonds), Wheat"));
        abpg.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Cookies
        abpg.addFoodItem("Almond Biscotti", new FoodItem(130, "Eggs, Milk, Tree Nuts, Wheat"));
        abpg.addFoodItem("Chocolate Dipped Shortbread Cookie", new FoodItem(390, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Double Chocolate Mudslide Cookie", new FoodItem(370, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpg.addFoodItem("Lemon White Chocolate Cookie", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Chocolate Chip Cookie", new FoodItem(370,"Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Chunky Peanut Butter Cookie", new FoodItem(400, "Eggs, Milk, Peanuts, Wheat"));
        abpg.addFoodItem("English Toffee Cookie", new FoodItem(320, "Eggs, Milk, Soy, Tree Nuts, Wheats"));
        abpg.addFoodItem("Mint Chocolate Chip Cookie", new FoodItem(560, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Chocolate Dipped Cranberry Almond Macaroon", new FoodItem(290, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpg.addFoodItem("Classic Oatmeal Raisin Cookie", new FoodItem(290, "Eggs, Milk, Wheat"));
        abpg.addFoodItem("Harvest Cookie", new FoodItem(370, "Eggs, Milk, Tree Nuts, Wheat"));
        abpg.addFoodItem("Mudslide Cookie", new FoodItem(360, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        // Croissants
        abpg.addFoodItem("Almond Croissant", new FoodItem(500, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpg.addFoodItem("Chocolate Croissant", new FoodItem(480, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Raspberry Cheese Croissant", new FoodItem(360, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Strawberry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Apple and Cinnamon Croissant", new FoodItem(240, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpg.addFoodItem("Ham and Cheese Croissant", new FoodItem(410, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Raspberry CroisBun", new FoodItem(530, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Sweet Cheese CroisBun", new FoodItem(510, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Cherry CroisBun", new FoodItem(500, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Plain Croissant", new FoodItem(280, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Spinach and Cheese Hot Croissant", new FoodItem(330, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Sweet Cheese Croissant", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        // Muffins & Scones
        abpg.addFoodItem("Blueberry Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Cinnamon Chip Scone", new FoodItem(500, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Cranberry Walnut Muffin", new FoodItem(520, "Eggs, Milk, Soy, Tree Nuts, Wheat"));
        abpg.addFoodItem("Raisin Bran Muffin", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Blueberry Scone", new FoodItem(410, "Milk, Soy, Wheat"));
        abpg.addFoodItem("Corn Muffin", new FoodItem(490, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Double Chocolate Chunk Muffin", new FoodItem(580, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Carrot Walnut Muffin", new FoodItem(540, "Eggs, Soy, Tree Nuts, Wheat, Sulfites"));
        abpg.addFoodItem("Cranberry Orange Scone", new FoodItem(520, "Eggs, Milk, Wheat"));
        abpg.addFoodItem("Low Fat Berry Muffin Whole Grains", new FoodItem(290, "Eggs, Milk, Soy, Wheat"));
        // Brownies
        abpg.addFoodItem("Brownie Bites", new FoodItem(600, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Chewy Marshmallow Bar", new FoodItem(250, "Milk"));
        abpg.addFoodItem("Chocolate Chip Brownie", new FoodItem(440, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Gluten Free Chocolate Chip Brownie", new FoodItem(420, "Eggs, Soy"));
        // Cupcakes
        abpg.addFoodItem("Double Chocolate Cupcake", new FoodItem(320, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Lemon Drop Cupcake", new FoodItem(270,"Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Red Velvet Cupcake", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        // Danish
        abpg.addFoodItem("Blueberry Danish", new FoodItem(380, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Cherry Danish", new FoodItem(370, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpg.addFoodItem("Sweet Cheese Danish", new FoodItem(450, "Eggs, Milk, Soy, Wheat, Sulfites"));
        // Other Goodies
        abpg.addFoodItem("Chocolate and Creme Torsade", new FoodItem(230, "Eggs, Milk, Soy, Tree Nuts, Wheat, Sulfites"));
        abpg.addFoodItem("Marble Pound Cake", new FoodItem(450, "Eggs, Milk, Soy, Wheat"));
        abpg.addFoodItem("Cinnamon Swirl Roll", new FoodItem(550, "Eggs, Milk, Soy, Wheat, Sulfites"));
        abpg.addFoodItem("Pecan Roll", new FoodItem(740, "Eggs, Milk, Soy, Tree Nuts(Pecans), Wheat"));
        abpg.addFoodItem("Raspberry Torsade", new FoodItem(200, "Eggs, Milk, Soy, Wheat, Sulfites  "));
        // Hot Coffee
        abpg.addFoodItem("Decaf French Roast", new FoodItem(5,"None"));
        abpg.addFoodItem("Hazelnut", new FoodItem(5, "None"));
        abpg.addFoodItem("French Roast", new FoodItem(5, "None"));
        abpg.addFoodItem("Morning Blend", new FoodItem(5, "None"));
        abpg.addFoodItem("French Vanilla", new FoodItem(5, "None"));
        // Hot Espresso
        abpg.addFoodItem("Caffe Americano", new FoodItem(10, "None"));
        abpg.addFoodItem("Cappuccino", new FoodItem(120, "Milk"));
        abpg.addFoodItem("Espresso", new FoodItem(5, "None"));
        abpg.addFoodItem("Turtle Latte", new FoodItem(320, "Milk, Peanuts, Tree Nuts"));
        abpg.addFoodItem("Caffe Latte", new FoodItem(140, "Milk"));
        abpg.addFoodItem("Caramel Macchiato", new FoodItem(270, "Milk"));
        abpg.addFoodItem("Hot Chocolate", new FoodItem(360, "Milk"));
        abpg.addFoodItem("Vanilla Latte", new FoodItem(240, "Milk"));
        abpg.addFoodItem("Chai Latte", new FoodItem(210, "Milk"));
        abpg.addFoodItem("Mocha Latte", new FoodItem(310, "Milk"));

        diningHalls[3] = abpg;

        DiningHall b37 = new DiningHall("Burger '37");
        b37.addHours(Calendar.SUNDAY, 12, 19);
        b37.addHours(Calendar.MONDAY, 10.5, 21);
        b37.addHours(Calendar.TUESDAY, 10.5, 21);
        b37.addHours(Calendar.WEDNESDAY, 10.5, 21);
        b37.addHours(Calendar.THURSDAY, 10.5, 21);
        b37.addHours(Calendar.FRIDAY, 10.5, 19);
        b37.addHours(Calendar.SATURDAY, 11, 19);
        b37.setLocation(37.229209, -80.418380);
        //Burgers
        b37.addFoodItem("Bacon Cheeseburger", new FoodItem(554, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Burger: Ancho Turkey", new FoodItem(349, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Burger: Plain", new FoodItem(416, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Burger: Plain w/Gluten Freen Bun", new FoodItem(536, "Eggs and Soy"));
        b37.addFoodItem("Burger: Rice and Beans", new FoodItem(467, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Cheeseburger", new FoodItem(584, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Gluten Free Bun", new FoodItem(250, "Eggs"));
        b37.addFoodItem("Signature Burger #1 (Bacon & Egg)", new FoodItem(783, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Signature Burger #2 (Mushroom & Swiss", new FoodItem(546, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Signature Burger #3 (Cheddar & Fried Onions", new FoodItem(700, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Signature Burger #4 (Pepper Jack, Salsa, Avocado)", new FoodItem(617, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Signature Burger #5 (Bleu Cheese, Fried Onions, A-1 Sauce", new FoodItem(686, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Signature Burger #6 (Provolone & Sauteed Onions", new FoodItem(559, "Gluten, Milk, Nuts, Soy and Wheat"));
        //Fries
        b37.addFoodItem("French Fries", new FoodItem(461, "Soy"));
        b37.addFoodItem("Sweet Potato Fries", new FoodItem(671, "Soy"));
        //Milkshakes
        b37.addFoodItem("Chocolate Brownie Milkshake", new FoodItem(619, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Chocolate Milkshake", new FoodItem(500, "Gluten, Milk and Soy"));
        b37.addFoodItem("Cookies & Cream Milkshake", new FoodItem(520, "Gluten, Milk, Nuts, Soy and Wheat"));
        b37.addFoodItem("Peanut Butter & Banana Milkshake", new FoodItem(603, "Milk, Nuts and Soy"));
        b37.addFoodItem("Salted Caramel Milkshake", new FoodItem(569, "Gluten, Milk, Nuts and Soy"));
        b37.addFoodItem("Strawberry Banana Milkshake", new FoodItem(427, "Milk and Nuts"));
        b37.addFoodItem("Strawberry Milkshake", new FoodItem(396, "Milk and Nuts"));
        b37.addFoodItem("Vanilla Milkshake", new FoodItem(383, "Milk and Nuts"));
        //Toppings
        b37.addFoodItem("Toppings: A-1 Sauce/.5oz", new FoodItem(12, "None"));
        b37.addFoodItem("Toppings: Avocado Ranch Dipping Sauce/oz", new FoodItem(93, "Eggs, Milk and Soy"));
        b37.addFoodItem("Toppings: B37 Smokey Sriracha Mayo/floz", new FoodItem(99, "Eggs and Soy"));
        b37.addFoodItem("Toppings: Bacon/3 slices", new FoodItem(82, "None"));
        b37.addFoodItem("Toppings: Banana Peppers/.5oz", new FoodItem(5, "None"));
        b37.addFoodItem("Toppings: Burger '37 Sauce/oz", new FoodItem(35, "None"));
        b37.addFoodItem("Toppings: French Fried Onion Pieces/.5oz", new FoodItem(91, "Milk, Gluten, Soy and Wheat"));
        b37.addFoodItem("Toppings: Fresh Avocado Slices/1/12 each", new FoodItem(16, "None"));
        b37.addFoodItem("Toppings: Fry Sauce/2oz", new FoodItem(220, "Eggs and Soy"));
        b37.addFoodItem("Toppings: Guacamole/3oz", new FoodItem(147, "None"));
        b37.addFoodItem("Toppings: Heinz 57 Sauce/.5oz", new FoodItem(16, "Gluten and Soy"));
        b37.addFoodItem("Toppings: Jalapenos/.5oz", new FoodItem(2, "Gluten"));
        b37.addFoodItem("Toppings: Ketchup/oz", new FoodItem(13, "None"));
        b37.addFoodItem("Toppings: Ketchup: Jalapeno Cilantro/oz", new FoodItem(39, "Soy"));
        b37.addFoodItem("Toppings: Lettuce Leaves/.33oz", new FoodItem(1, "None"));
        b37.addFoodItem("Toppings: Marshmallow Dipping Sauce/2oz", new FoodItem(151, "Gluten, Milk and Soy"));
        b37.addFoodItem("Toppings: Mayonnaise: Mango Habanero/oz", new FoodItem(83, "Eggs, Gluten, Milk and Soy"));
        b37.addFoodItem("Toppings: Mayonnaise: Old Bay/oz", new FoodItem(118, "Eggs and Soy"));
        b37.addFoodItem("Toppings: Pesto Sauce/.5oz", new FoodItem(47, "Milk"));
        b37.addFoodItem("Toppings: Pickle Chips/.5oz", new FoodItem(1, "None"));
        b37.addFoodItem("Toppings: Red Onions/oz", new FoodItem(11, "None"));
        b37.addFoodItem("Toppings: Roasted Red Pepper/.5oz", new FoodItem(0, "None"));
        b37.addFoodItem("Toppings: Salsa: Fresh Tomato/2oz", new FoodItem(16, "None"));
        b37.addFoodItem("Toppings: Sauteed Fresh Mushrooms/oz", new FoodItem(23, "Soy"));
        b37.addFoodItem("Toppings: Sauteed Fresh Onions/oz", new FoodItem(20, "Soy"));
        b37.addFoodItem("Toppings: Sauteed Fresh Peppers/oz", new FoodItem(13, "Soy"));
        b37.addFoodItem("Toppings: Sliced Tomatoes/oz", new FoodItem(5, "None"));
        diningHalls[4] = b37;

        DiningHall d2 = new DiningHall("D2");
        d2.addHours(Calendar.SUNDAY, 9.5, 18.5);
        d2.addHours(Calendar.MONDAY, 7, 9.5);
        d2.addHours(Calendar.MONDAY, 11, 14);
        d2.addHours(Calendar.MONDAY, 17, 19);
        d2.addHours(Calendar.TUESDAY, 7, 9.5);
        d2.addHours(Calendar.TUESDAY, 11, 14);
        d2.addHours(Calendar.TUESDAY, 17, 19);
        d2.addHours(Calendar.WEDNESDAY, 7, 9.5);
        d2.addHours(Calendar.WEDNESDAY, 11, 14);
        d2.addHours(Calendar.WEDNESDAY, 17, 19);
        d2.addHours(Calendar.THURSDAY, 7, 9.5);
        d2.addHours(Calendar.THURSDAY, 11, 14);
        d2.addHours(Calendar.THURSDAY, 17, 19);
        d2.addHours(Calendar.FRIDAY, 7, 9.5);
        d2.addHours(Calendar.FRIDAY, 11, 14);
        d2.addHours(Calendar.FRIDAY, 17, 19);
        d2.setLocation(37.224483, -80.421081);

        // Breakfast Items
        d2.addFoodItem("Bacon",new FoodItem(113, "None"));
        d2.addFoodItem("Buttermilk Pancakes", new FoodItem(219, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Cereal, Cream of Wheat", new FoodItem(1706, "Gluten, Wheat"));
        d2.addFoodItem("Cereal, Wheat", new FoodItem(106, "Gluten"));
        d2.addFoodItem("Cinnamon Apples", new FoodItem(114, "Soy"));
        d2.addFoodItem("Fried Egg", new FoodItem(84, "Eggs, Soybeans"));
        d2.addFoodItem("Make Your Own Waffle", new FoodItem(267, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Sausage Gravy", new FoodItem(122, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Sausage Links", new FoodItem(416, "None"));
        d2.addFoodItem("Scrambled Eggs", new FoodItem(217, "Eggs, Soy"));
        d2.addFoodItem("Steamed Eggs", new FoodItem(176, "Eggs"));
        d2.addFoodItem("Tater Tots", new FoodItem(207, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Turkey Bacon", new FoodItem(88, "Soy"));
        d2.addFoodItem("Applesauce Raisin Bread", new FoodItem(10, "Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Biscuits", new FoodItem(270, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Donuts", new FoodItem(352, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Breakfast Quinoa w/ Raisins GF", new FoodItem(182, "None"));
        d2.addFoodItem("Hash Browns", new FoodItem(122, "Soybeans"));
        d2.addFoodItem("Scrambled Eggs", new FoodItem(217, "Eggs, Soybeans"));
        d2.addFoodItem("Steamed Eggs", new FoodItem(176, "Eggs"));
        d2.addFoodItem("Grapefruit Half", new FoodItem(100, "None"));
        // Bagels
        d2.addFoodItem("Bagel, Asiago Cheese", new FoodItem(0, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Bagel, Cinnamon Raisin", new FoodItem(317, "Wheats, Soybeans, Gluten"));
        d2.addFoodItem("Bagel, Blueberry", new FoodItem(317, "Wheats, Soybeans, Gluten"));
        d2.addFoodItem("Bagel, Sesame", new FoodItem(160, "Wheats, Soybeans, Gluten"));
        d2.addFoodItem("Bagel, Whole Wheat", new FoodItem(278, "Gluten, Soy, Wheat"));
        d2.addFoodItem("Bagels", new FoodItem(298, "Wheats, Soybeans, Gluten"));
        // Soups
        d2.addFoodItem("Chili Con Carne", new FoodItem(164, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Curry Broth", new FoodItem(22, "Milk, Fish, Tree Nuts, Soybeans"));
        d2.addFoodItem("Navy Bean Soup", new FoodItem(111, "Eggs, Gluten, Milk, Soy, Wheat"));
        // Pan Asia
        d2.addFoodItem("Asian Vegetable Stirfry", new FoodItem(81, "Wheats, Soybeans, Gluten"));
        d2.addFoodItem("Chicken Sate w/Peanut Sauce", new FoodItem(257, "Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Fried Zucchini w/Pork & Prawns", new FoodItem(139, "Fish, Crustacean Shellfish, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Southeast Asian Fried Rice", new FoodItem(156, "Crustacen Shellfish, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Steamed Rice", new FoodItem(208, "None"));
        d2.addFoodItem("Thai Coconut Soup", new FoodItem(400, "Milk, Eggs, Fish, Tree Nuts, Wheat, Soybeans, Gluten"));
        // Gaucho's
        d2.addFoodItem("Gaucho's Carved Pork", new FoodItem(124, "None"));
        d2.addFoodItem("All Beef Burger", new FoodItem(211, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Chicken Breast, Crispy Fried", new FoodItem(201, "Gluten, Milk, Soy, Wheat, Halal"));
        d2.addFoodItem("French Fries", new FoodItem(153, "Soybeans"));
        d2.addFoodItem("Pepper Jelly", new FoodItem(72, "Soy"));
        d2.addFoodItem("Ranch Fries", new FoodItem(103, "Milk, Soybeans"));
        d2.addFoodItem("Baked Potato", new FoodItem(117, "Soybeans"));
        d2.addFoodItem("Cauliflower", new FoodItem(20, "None"));
        d2.addFoodItem("Cereal, Cocoa Pebbles", new FoodItem(120, "Nuts"));
        d2.addFoodItem("Cereal, Fruity Pebbles", new FoodItem(110, "Nuts"));
        d2.addFoodItem("Cereal, Rice Chex", new FoodItem(100, "None"));
        d2.addFoodItem("Gluten Free Brownie", new FoodItem(350, "Eggs, Soybeans"));
        d2.addFoodItem("Gluten Free Chocolate Chip Cookie", new FoodItem(320, "Eggs, Soybeans"));
        d2.addFoodItem("Gluten Free Ham & Noodles Au Gratin", new FoodItem(322, "Milk, Soybeans"));
        d2.addFoodItem("Lemon Herb Rotisserie Chicken", new FoodItem(244, "None"));
        d2.addFoodItem("Pizza, Gluten Free Cheese", new FoodItem(332, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Whole Kernel Corn", new FoodItem(88, "None"));
        d2.addFoodItem("Buffalo Chicken Pizza", new FoodItem(283, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Penne Pasta", new FoodItem(257, "Wheats, Soybeans, Gluten"));
        // Mangia
        d2.addFoodItem("Alfredo Sauce", new FoodItem(381, "Milk, Soybeans"));
        d2.addFoodItem("Cheese Breadsticks", new FoodItem(106, " Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Cheese Pizza", new FoodItem(203, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Italian Meat Sauce", new FoodItem(149, "None"));
        d2.addFoodItem("Marinara Sauce", new FoodItem(66, "None"));
        d2.addFoodItem("Pepperoni Pizza", new FoodItem(237, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Whole Wheat Spaghetti", new FoodItem(149, "Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Lebanese Whole Wheat Wrap", new FoodItem(100, " Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Olive's Quesadillas to Order", new FoodItem(310, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Roasted Red Pepper", new FoodItem(58, "None"));
        // Olive's
        d2.addFoodItem("Cheese, Feta", new FoodItem(75, "Milk"));
        d2.addFoodItem("Chocolate Soy Milk", new FoodItem(85, "Soybeans"));
        d2.addFoodItem("Fatoush Salad", new FoodItem(57, "Wheats, Soybeans, Gluten"));
        d2.addFoodItem("Hummus", new FoodItem(116, "None"));
        d2.addFoodItem("Olive Salad", new FoodItem(219, "None"));
        d2.addFoodItem("Pita Bread, Whole Wheat", new FoodItem(98, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Steamed Baby Carrots", new FoodItem(29, "None"));
        d2.addFoodItem("Sweet Potato Fries", new FoodItem(122, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Sweet Potato", new FoodItem(103, "None"));
        d2.addFoodItem("Tabouleh", new FoodItem(172, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Vanilla Soy Milk", new FoodItem(95, "Soybeans"));
        // Salsa's
        d2.addFoodItem("Black Beans", new FoodItem(143, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Charred Jalapenos", new FoodItem(8, "None"));
        d2.addFoodItem("Cheese, Shredded Cheddar", new FoodItem(57, "Milk"));
        d2.addFoodItem("Chicken Fajita", new FoodItem(77, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Flour Tortilla", new FoodItem(143, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Grilled Fresh Veggies", new FoodItem(10, "Soybeans"));
        d2.addFoodItem("Guacamole", new FoodItem(19, "None"));
        d2.addFoodItem("Picante Sauce", new FoodItem(20, "None"));
        d2.addFoodItem("Pickled Carrots", new FoodItem(21, "None"));
        d2.addFoodItem("Pickled Red Onions", new FoodItem(36, "None"));
        d2.addFoodItem("Pico De Gallo", new FoodItem(6, "None"));
        d2.addFoodItem("Roasted Green Chili Salsa", new FoodItem(9, "None"));
        d2.addFoodItem("Salsa Black Bean & Corn", new FoodItem(78, "None"));
        d2.addFoodItem("Sauce Con Queso", new FoodItem(8, "Milk"));
        d2.addFoodItem("Smokey Salsa", new FoodItem(8, "Soybeans"));
        d2.addFoodItem("Sour Cream ", new FoodItem(57, "Milk"));
        d2.addFoodItem("Taco Meat", new FoodItem(148, "None"));
        d2.addFoodItem("Taco Salad Tortilla", new FoodItem(230, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Taco Shell", new FoodItem(160, "None"));
        d2.addFoodItem("Yellow Rice", new FoodItem(392, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        // Eden's
        d2.addFoodItem("Bacon bits", new FoodItem(122, "Soybeans"));
        d2.addFoodItem("Broccoli Buds", new FoodItem(8, "None"));
        d2.addFoodItem("Cabbage Topping for Fish Taco", new FoodItem(8, "None"));
        d2.addFoodItem("Croutons", new FoodItem(61, "Milk, Wheat, Gluten"));
        d2.addFoodItem("Edamame", new FoodItem(151, "Soybeans"));
        d2.addFoodItem("Feta Cheese", new FoodItem(75, "Milk"));
        d2.addFoodItem("Grape Tomatoes", new FoodItem(1, "None"));
        d2.addFoodItem("Green Pepper Strips", new FoodItem(6, "None"));
        d2.addFoodItem("Lettuce Mix", new FoodItem(5, "None"));
        d2.addFoodItem("Monterey Jack & Cheddar Cheese", new FoodItem(111, "Milk"));
        d2.addFoodItem("Oil (for Oil & Vinegar)", new FoodItem(104, "Soybeans"));
        d2.addFoodItem("Red Kidney Beans", new FoodItem(40, "Gluten"));
        d2.addFoodItem("Red Onions", new FoodItem(11, "None"));
        d2.addFoodItem("Salad Dressing, Basil Vinaigrette", new FoodItem(128, "None"));
        d2.addFoodItem("Salad Dressing, Bleu Cheese", new FoodItem(80, "Milk, Eggs, Soybeans"));
        d2.addFoodItem("Salad Dressing, Caesar", new FoodItem(150, "Milk, Fish, Soybeans"));
        d2.addFoodItem("Salad Dressing, Charred Lemon Vinaigrette", new FoodItem(82, "None"));
        d2.addFoodItem("Salad Dressing, French", new FoodItem(130, "Soybeans"));
        d2.addFoodItem("Salad Dressing, Homestyle Ranch", new FoodItem(100, "Milk, Eggs, Soybeans"));
        d2.addFoodItem("Salad Dressing, Italian", new FoodItem(120, "Soybeans"));
        d2.addFoodItem("Salad Dressing, Strawberry Yogurt", new FoodItem(29, "Milk"));
        d2.addFoodItem("Salad Dressing,1000 Island", new FoodItem(280, "Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Sliced Cucumbers", new FoodItem(4, "None"));
        d2.addFoodItem("Sliced Mushrooms", new FoodItem(6, "None"));
        d2.addFoodItem("Sliced Red Peppers", new FoodItem(0, "None"));
        d2.addFoodItem("Steamed Eggs", new FoodItem(88, "Eggs"));
        // La Patisserie
        d2.addFoodItem("Apple Strudel", new FoodItem(171, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Blueberry Cobbler", new FoodItem(296, "Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Chocolate Cake/Chocolate Icing", new FoodItem(507, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Lemon Poppy Seed Cake", new FoodItem(569, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Make your own Waffle", new FoodItem(267, "Milk, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Pancake Syrup, Maple", new FoodItem(151, "None"));
        d2.addFoodItem("Peanut Butter Cookie", new FoodItem(165, "Milk, Eggs, Peanuts, Wheat, Soybeans, Gluten"));
        d2.addFoodItem("Strawberry Gelatin", new FoodItem(122, "None"));
        d2.addFoodItem("Strawberry Sauce", new FoodItem(68, "Wheat, Gluten"));
        d2.addFoodItem("Sugar Cookie", new FoodItem(241, " Milk, Eggs, Wheat, Gluten"));
        d2.addFoodItem("Sugar Free Gelatin", new FoodItem(0, "None"));
        d2.addFoodItem("Whipped Topping", new FoodItem(24, "Soybeans, Gluten"));

        diningHalls[5] = d2;

        DiningHall deets = new DiningHall("Deet's Place");
        deets.addHours(Calendar.SUNDAY, 10, 24);
        deets.addHours(Calendar.MONDAY, 7.5, 24);
        deets.addHours(Calendar.TUESDAY, 7.5, 24);
        deets.addHours(Calendar.WEDNESDAY, 7.5, 24);
        deets.addHours(Calendar.THURSDAY, 7.5, 24);
        deets.addHours(Calendar.FRIDAY, 7.5, 24);
        deets.addHours(Calendar.SATURDAY, 10, 24);
        deets.setLocation(37.224203, -80.421242);

        // Hot Drinks
        deets.addFoodItem("Americano, Grande", new FoodItem(0, "None"));
        deets.addFoodItem("Americano, Short", new FoodItem(0, "None"));
        deets.addFoodItem("Americano, Tall", new FoodItem(0, "None"));
        deets.addFoodItem("Cafe Aulait, Grande", new FoodItem(131, "Milk"));
        deets.addFoodItem("Cafe Aulait, Short", new FoodItem(72, "Milk"));
        deets.addFoodItem("Cafe Aulait, Tall", new FoodItem(101, "Milk"));
        deets.addFoodItem("Cappuccino Flavored, Grande", new FoodItem(257, "Milk"));
        deets.addFoodItem("Cappuccino Flavored, Short", new FoodItem(142, "Milk"));
        deets.addFoodItem("Cappuccino Flavored, Tall", new FoodItem(201, "Milk"));
        deets.addFoodItem("Cappuccino, Grande", new FoodItem(145, "Milk"));
        deets.addFoodItem("Cappucino, Short", new FoodItem(87, "Milk"));
        deets.addFoodItem("Cappuccino, Tall", new FoodItem(74, "Milk"));
        deets.addFoodItem("Caramel Jitterbug",new FoodItem(350, "Milk, Soybeans, Gluten"));
        deets.addFoodItem("Caramel Macchiato, Grande", new FoodItem(438, "Milk, Soybeans, Gluten"));
        deets.addFoodItem("Caramel Macchiato, Short", new FoodItem(295, "Milk, Soybeans, Gluten"));
        deets.addFoodItem("Caramel Macchiato, Tall", new FoodItem(366, "Milk, Soybeans, Gluten"));
        deets.addFoodItem("Chai, Grande", new FoodItem(340, "Milk, Gluten"));
        deets.addFoodItem("Chai, Short", new FoodItem(205, "Milk, Gluten"));
        deets.addFoodItem("Chai, Tall", new FoodItem(272, "Milk, Gluten"));
        deets.addFoodItem("Hot Cocoa, Grande w/Marshmallows & Whipped cream", new FoodItem(756, "Milk, Gluten"));
        deets.addFoodItem("Hot Cocoa, Short w/Marshmallows & Whipped cream", new FoodItem(447, "Milk, Gluten"));
        deets.addFoodItem("Hot Cocoa, Tall w/Marshmallows & Whipped cream", new FoodItem(599, "Milk, Gluten"));
        deets.addFoodItem("Italian Steamer, Grande", new FoodItem(373, "Milk"));
        deets.addFoodItem("Italian Steamer, Short", new FoodItem(200, "Milk"));
        deets.addFoodItem("Italian Steamer, Tall", new FoodItem(288, "Milk"));
        deets.addFoodItem("Latte Flavored, Grande", new FoodItem(330, "Milk"));
        deets.addFoodItem("Latte Flavored, Short", new FoodItem(186, "Milk"));
        deets.addFoodItem("Latte Flavored, Tall", new FoodItem(259, "Milk"));
        deets.addFoodItem("Grande, Latte", new FoodItem(217, "Milk"));
        deets.addFoodItem("Latte, Short", new FoodItem(131, "Milk"));
        deets.addFoodItem("Latte, Tall", new FoodItem(175, "Milk"));
        deets.addFoodItem("Mocha Jitterbug", new FoodItem(282, "Milk, Gluten"));
        deets.addFoodItem("Mocha Latte, Grande", new FoodItem(369, "Milk"));
        deets.addFoodItem("Mocha Latte, Short", new FoodItem(205, "Milk"));
        deets.addFoodItem("Mocha Latte, Tall", new FoodItem(289, "Milk"));
        deets.addFoodItem("Soy Cafe Aulait, Grande", new FoodItem(106, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Cafe Aulait, Short", new FoodItem(59, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Cafe Aulait, Tall", new FoodItem(83, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Cappuccino Flavored, Grande", new FoodItem(236, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Cappuccino Flavored, Short", new FoodItem(128, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Cappuccino Flavored, Tall", new FoodItem(182, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Caramel Macchiatto, Grande", new FoodItem(406, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Caramel Macchiatto, Short", new FoodItem(275, "Soy Caramel Macchiatto, Grande"));
        deets.addFoodItem("Soy Caramel Macchiatto, Tall", new FoodItem(340, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Chai, Grande", new FoodItem(314, "Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Chai, Short", new FoodItem(188, "Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Chai, Tall", new FoodItem(251, "Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Gourmet Hot Chocolate, Grande", new FoodItem(619, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Gourmet Hot Chocolate, Short", new FoodItem(346, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Gourmet Hot Chocolate, Tall", new FoodItem(488, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Italian Steamer, Grande", new FoodItem(330, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Italian Steamer, Short", new FoodItem(176, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Italian Steamer, Tall", new FoodItem(253, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte Flavored, Grande", new FoodItem(295, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte Flavored, Short", new FoodItem(164, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte Flavored, Tall", new FoodItem(216, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte, Grande", new FoodItem(177, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte, Short", new FoodItem(106, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Latte, Tall", new FoodItem(142, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Mocha Latte, Grande", new FoodItem(346, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Mocha Latte, Short", new FoodItem(118, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Mocha Latte, Tall", new FoodItem(283, "Tree Nuts, Soybeans"));
        deets.addFoodItem("Soy Swanson Special, Grande", new FoodItem(413, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Swanson Special, Short", new FoodItem(241, "Milk, Tree Nuts, Soybeans, Gluten"));
        deets.addFoodItem("Soy Swanson Speical, Tall", new FoodItem(342, "Milk, Gluten"));
        deets.addFoodItem("Swanson Special, Grande", new FoodItem(522, "Milk, Gluten"));
        deets.addFoodItem("Swanson Special, Short", new FoodItem(262, "Milk, Gluten"));
        deets.addFoodItem("Swanson Special, Tall", new FoodItem(395, "Milk, Gluten"));

        diningHalls[6] = deets;

        DiningHall dd = new DiningHall("Dunkin Donuts");
        dd.addHours(Calendar.MONDAY, 7.5, 21);
        dd.addHours(Calendar.TUESDAY, 7.5, 21);
        dd.addHours(Calendar.WEDNESDAY, 7.5, 21);
        dd.addHours(Calendar.THURSDAY, 7.5, 21);
        dd.addHours(Calendar.FRIDAY, 7.5, 21);
        dd.setLocation(37.226881, -80.418482);

        dd.addFoodItem("Cappucino", new FoodItem(80, "Milk"));
        dd.addFoodItem("Dunkaccino", new FoodItem(240, "Milk, Soy"));
        dd.addFoodItem("Espresso", new FoodItem(5, "None"));
        dd.addFoodItem("Hot Chocolate", new FoodItem(220, "Milk, Soy"));
        dd.addFoodItem("Hot Coffee", new FoodItem(5, "None"));
        dd.addFoodItem("Hot Macchiato", new FoodItem(180, "Milk"));
        dd.addFoodItem("Hot Tea", new FoodItem(0, "None"));
        dd.addFoodItem("Latte", new FoodItem(80, "Tree Nuts"));
        dd.addFoodItem("Mint Hot Chocolate", new FoodItem(210, "Milk, Soy"));
        dd.addFoodItem("Salted Caramel Hot Chocolate", new FoodItem(220, "Milk, Soy"));
        dd.addFoodItem("S'mores Hot Chocolate", new FoodItem(220, "Milk, Soy"));
        dd.addFoodItem("Vanilla Chai", new FoodItem(330, "Milk, Soy"));
        dd.addFoodItem("Iced Coffee", new FoodItem(10, "None"));
        dd.addFoodItem("Iced Green Tea", new FoodItem(70, "None"));
        dd.addFoodItem("Iced Latte", new FoodItem(80, "Tree Nuts"));
        dd.addFoodItem("Iced Machiatto", new FoodItem(160, "Milk"));
        dd.addFoodItem("Iced Tea", new FoodItem(70, "None"));
        dd.addFoodItem("Sweet Tea", new FoodItem(160, "None"));
        dd.addFoodItem("Frozem Caramel Coffee Coolatta", new FoodItem(300, "Milk"));
        dd.addFoodItem("Frozen Coffee Coolatta", new FoodItem(400, "Milk"));
        dd.addFoodItem("Frozen Dunkaccino", new FoodItem(400, "Milk, Soy"));
        dd.addFoodItem("Frozen Mocha Coffee Coolatta", new FoodItem(300, "Milk"));
        dd.addFoodItem("Hot Chocolate-Frozen", new FoodItem(400, "Milk, Soy"));
        dd.addFoodItem("Minute-Maid Orange Coolatta", new FoodItem(220, "None"));
        dd.addFoodItem("Strawberry Banana Smoothie", new FoodItem(290, "Milk"));
        dd.addFoodItem("Strawberry Coolatta", new FoodItem(250, "None"));
        dd.addFoodItem("Tropical Mango Smoothie", new FoodItem(290, "Milk"));
        dd.addFoodItem("Vanilla Bean Coolatta", new FoodItem(420, "Milk"));
        dd.addFoodItem("Bagels", new FoodItem(350, "Soy, Wheat"));
        dd.addFoodItem("Danish", new FoodItem(400, "Eggs, Milk, Soy, Wheat"));
        dd.addFoodItem("Donuts", new FoodItem(310, "Eggs, Milk, Soy, Wheat"));
        dd.addFoodItem("Hash Browns", new FoodItem(140, "None"));
        dd.addFoodItem("Muffins", new FoodItem(510,"Eggs, Milk, Soy, Wheat"));
        dd.addFoodItem("Munchkins", new FoodItem(70, "Eggs, Milk, Soy, Wheat"));
        dd.addFoodItem("Other Bakery", new FoodItem(420, "Eggs, Milk, Soy, Wheat"));

        diningHalls[7] = dd;

        DiningHall dx = new DiningHall("DXpress");
        dx.addHours(Calendar.SUNDAY, 9, 26);
        dx.addHours(Calendar.MONDAY, 7, 26);
        dx.addHours(Calendar.TUESDAY, 7, 26);
        dx.addHours(Calendar.WEDNESDAY, 7, 26);
        dx.addHours(Calendar.THURSDAY, 7, 26);
        dx.addHours(Calendar.FRIDAY, 7, 26);
        dx.addHours(Calendar.SATURDAY, 7, 26);
        dx.setLocation(37.224525, -80.420769);
        //Hot Sandwiches
        dx.addFoodItem("Bacon Cheeseburger", new FoodItem(503, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Bacon Double Cheeseburger", new FoodItem(754, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Chicken Filet Sandwich", new FoodItem(351, "Eggs, Gluten, Soy and Wheat"));
        dx.addFoodItem("Chicken Patty Sandwich", new FoodItem(341, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Double Cheeseburger", new FoodItem(591, "Gluten Milk, Soy and Wheat"));
        dx.addFoodItem("Grilled Chicken Sandwich", new FoodItem(248, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Grilled Chicken/Cheese Sandwich", new FoodItem(297, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Meatball Sub", new FoodItem(571, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Quarterpound Cheeseburger", new FoodItem(390, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Quarterpound Hamburger", new FoodItem(341, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Quarterpound Hot Dog", new FoodItem(446, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Spicy Chicken Filet Sandwich", new FoodItem(403, "Gluten, Soy, Wheat and Milk"));
        dx.addFoodItem("Spicy Chicken Filet/Cheese Sandwich", new FoodItem(452, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sriracha Chicken Bites", new FoodItem(546, "Gluten, Soy and Wheat"));
        //Cold Sandwiches
        dx.addFoodItem("Pretzel Sub, Beef & Cheddar", new FoodItem(521, "Milk, Soy and Wheat"));
        dx.addFoodItem("Pretzel Sub, Ham & Swiss", new FoodItem(514, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pretzel Sub, Turkey & Provolone", new FoodItem(444, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sandwich, Gluten Free Beef & Jack", new FoodItem(478, "Eggs, Milk and Soy"));
        dx.addFoodItem("Sandwich, Gluten Free Ham & Swiss", new FoodItem(480, "Eggs, Milk and Soy"));
        dx.addFoodItem("Sandwich, Gluten Free Turkey/Provolone", new FoodItem(473, "Eggs, Milk and Soy"));
        dx.addFoodItem("Sandwich, Peanut Butter & Jelly", new FoodItem(377, "Gluten, Nuts, Soy and Wheat"));
        dx.addFoodItem("Sandwich, Turkey Bagel", new FoodItem(107, "Gluten, Milk, Soy and Wheat"));
        //Custom Subs and Wraps
        dx.addFoodItem("Toppings: Bacon/oz", new FoodItem(113, "None"));
        dx.addFoodItem("Toppings: Banana Peppers/.5oz", new FoodItem(5, "None"));
        dx.addFoodItem("Toppings: Cheese: American/slice", new FoodItem(49, "Milk and Soy"));
        dx.addFoodItem("Toppings: Cheese: Cheddar/oz", new FoodItem(114, "Milk"));
        dx.addFoodItem("Toppings: Cheese: Pepper Jack/oz", new FoodItem(111, "Gluten and Milk"));
        dx.addFoodItem("Toppings: Cheese: Provolone/oz", new FoodItem(101, "Milk"));
        dx.addFoodItem("Toppings: Cheese: Shredded Parmesan/oz", new FoodItem(101, "Milk"));
        dx.addFoodItem("Toppings: Cheese: Swiss/oz", new FoodItem(108, "Milk"));
        dx.addFoodItem("Toppings: Chicken Breast: Crispy, Fried/3oz", new FoodItem(201, "Gluten, Milk, Soy, Wheat and Halal"));
        dx.addFoodItem("Toppings: Chicken Breast: Grilled/breast", new FoodItem(108, "None"));
        dx.addFoodItem("Toppings: Deli Meat: Ham/4oz", new FoodItem(182, "None"));
        dx.addFoodItem("Toppings: Deli Meat: Roast Beef/4oz", new FoodItem(182, "Soy"));
        dx.addFoodItem("Toppings: Deli Meat: Turkey/4oz", new FoodItem(97, "Gluten and Wheat"));
        dx.addFoodItem("Toppings: Feathered Onions/.5oz", new FoodItem(6, "None"));
        dx.addFoodItem("Toppings: Fresh Spinach/.5oz", new FoodItem(2, "None"));
        dx.addFoodItem("Toppings: Green Pepper Strips/.5oz", new FoodItem(3, "None"));
        dx.addFoodItem("Toppings: Jalapenos/.25oz", new FoodItem(1, "Gluten"));
        dx.addFoodItem("Toppings: Mayonnaise/.5oz", new FoodItem(54, "Eggs and Soy"));
        dx.addFoodItem("Toppings: Romaine Lettuce/.5oz", new FoodItem(2, "None"));
        dx.addFoodItem("Toppings: Salad Dressing: Caesar/2TBSP", new FoodItem(150, "Fish, Milk and Soy"));
        dx.addFoodItem("Toppings: Salad Dressing: Italian/2TBSP", new FoodItem(120, "Soy"));
        dx.addFoodItem("Toppings: Salad Dressing: Olivie Oil/TBSP", new FoodItem(240, "Soy"));
        dx.addFoodItem("Toppings: Salad Dressing: Ranch/floz", new FoodItem(60, "Eggs, Milk and Soy"));
        dx.addFoodItem("Toppings: Sauce: BBQ/.5oz", new FoodItem(30, "Gluten and Wheat"));
        dx.addFoodItem("Toppings: Sauce: Honey Mustard/floz", new FoodItem(23, "None"));
        dx.addFoodItem("Toppings: Shredded Iceberg Lettuce/.5oz", new FoodItem(2, "None"));
        dx.addFoodItem("Toppings: Sliced Cucumbers/.5oz", new FoodItem(2, "None"));
        dx.addFoodItem("Toppings: Sliced Pickles/.5oz", new FoodItem(0, "None"));
        dx.addFoodItem("Toppings: Sliced Tomatoes/.5oz", new FoodItem(3, "None"));
        dx.addFoodItem("Tortilla for Wraps and Burritos", new FoodItem(331, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Wheat Sub Roll", new FoodItem(230, "Eggs, Gluten, Soy and Wheat"));
        dx.addFoodItem("White Sub Roll", new FoodItem(220, "Eggs, Gluten, Soy and Wheat"));
        dx.addFoodItem("Whole Wheat Tortilla for Wraps and Burritos", new FoodItem(310, "Gluten, Soy and Wheat"));
        //Grab-n-Go Cold Items
        dx.addFoodItem("Bento Box - Fruit", new FoodItem(194, "Gluten, Milk and Soy"));
        dx.addFoodItem("Bento Box - Mediterranean", new FoodItem(470, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        dx.addFoodItem("Bento Box - Sushi", new FoodItem(434, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Jumbo Blueberry Muffin", new FoodItem(372, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Jumbo Chocolate Chip Muffin", new FoodItem(445, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Power Caesar Salad", new FoodItem(300, "None"));
        dx.addFoodItem("Pudding Cup - Banana", new FoodItem(318, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pudding Cup - Chocolate & Graham Crackers", new FoodItem(437, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pudding Cup - Vanilla & Oreos", new FoodItem(422, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Salad: Caesar", new FoodItem(80, "Milk"));
        dx.addFoodItem("Salad: Chicken Caesar", new FoodItem(187, "Milk"));
        dx.addFoodItem("Salad: Chicken Mandarin", new FoodItem(676, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: 4 Variety Vegetable Rolls", new FoodItem(307, "None"));
        dx.addFoodItem("Sushi Box: Calif. & Philad. Rolls", new FoodItem(453, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: Calif. & Salmon Rolls", new FoodItem(337, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: California Rolls", new FoodItem(302, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: Crab & Salmon Rolls", new FoodItem(355, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: Cuc/Avocado/Carrot Rolls", new FoodItem(278, "None"));
        dx.addFoodItem("Sushi Box: Eel & Calif. Rolls", new FoodItem(254, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Sushi Box: Spicy Crab Rolls", new FoodItem(323, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Almond Crusted Chicken Salad", new FoodItem(254, "Eggs and Nuts"));
        dx.addFoodItem("YES TO GO Almond Crusted Chicken Wrap", new FoodItem(561, "Eggs, Gluten, Nuts, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Bento Box, American", new FoodItem(220, "Eggs, Milk, Nuts and Soy"));
        dx.addFoodItem("YES TO GO Bran Muffins", new FoodItem(272, "Eggs, Gluten, Milk and Wheat"));
        dx.addFoodItem("YES TO GO Chia Pudding with Berries", new FoodItem(175, "Nuts and Soy"));
        dx.addFoodItem("YES TO GO Chia Seed Pudding", new FoodItem(228, "Nuts and Soy"));
        dx.addFoodItem("YES TO GO Curried Sweet Potato Salad", new FoodItem(173, "Milk and Nuts"));
        dx.addFoodItem("YES TO GO Fresh Cantaloupe Cup", new FoodItem(39, "None"));
        dx.addFoodItem("YES TO GO Fresh Grapes Cup", new FoodItem(78, "None"));
        dx.addFoodItem("YES TO GO Fresh Honeydew Cup", new FoodItem(0, "None"));
        dx.addFoodItem("YES TO GO Fresh Mixed Fruit Bowl", new FoodItem(39, "None"));
        dx.addFoodItem("YES TO GO Fresh Pineapple Cup", new FoodItem(57, "None"));
        dx.addFoodItem("YES TO GO Fresh Strawberry Cup", new FoodItem(36, "None"));
        dx.addFoodItem("YES TO GO Garlicky Garbanzo Goodies", new FoodItem(172, "None"));
        dx.addFoodItem("YES TO GO Hummus Bowl w/Pitas", new FoodItem(214, "Gluten, Wheat and Soy"));
        dx.addFoodItem("YES TO GO Hummus Red Pepper Bowl w/Pitas", new FoodItem(155, "Gluten, Wheat and Soy"));
        dx.addFoodItem("YES TO GO Salad Bowl - Chef", new FoodItem(219, "Eggs, Gluten, Milk and Wheat"));
        dx.addFoodItem("YES TO GO Salad Bowl - Garden", new FoodItem(30, "None"));
        dx.addFoodItem("YES TO GO Salad Bowl - Pecan Chicken", new FoodItem(201, "Eggs, Nuts and Soy"));
        dx.addFoodItem("YES TO GO Salad Bowl - Spicy Grilled Chicken", new FoodItem(237, "Halal and Soy"));
        dx.addFoodItem("YES TO GO Sandwich: Beef & Cheddar", new FoodItem(386, "Milk, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Sandwich: Chicken Salad", new FoodItem(428, "Eggs, Gluten, Nuts, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Sandwich: Ham & Swiss", new FoodItem(383, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Sandwich: Turkey & Provolone", new FoodItem(337, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Veggie Bowl", new FoodItem(58, "Milk"));
        dx.addFoodItem("YES TO GO Wrap: Pecan & Craisin Chicken Salad", new FoodItem(571, "Eggs, Gluten, Nuts, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Wrap: Red Pepper Hummus", new FoodItem(503, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Wrap: Spicy Chicken", new FoodItem(578, "Halal, Gluten, Soy and Wheat"));
        dx.addFoodItem("YES TO GO Yogurt Blueberry Parfait", new FoodItem(271, "Gluten, Milk and Wheat"));
        dx.addFoodItem("YES TO GO Yogurt Raspberry Parfait", new FoodItem(273, "Gluten, Milk and Wheat"));
        dx.addFoodItem("YES TO GO Yogurt Strawberry Parfait", new FoodItem(275, "Gluten, Milk and Wheat"));
        dx.addFoodItem("Chicken Tenders", new FoodItem(422, "Eggs, Gluten, Soy and Wheat"));
        dx.addFoodItem("Corn Dog Nuggets", new FoodItem(417, "Eggs, Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("French Fries", new FoodItem(153, "Soy"));
        dx.addFoodItem("General Tso's Chicken", new FoodItem(744, "Gluten, Soy and Wheat"));
        dx.addFoodItem("Macaroni & Cheese", new FoodItem(437, "Eggs, Gluten, Milk and Wheat"));
        dx.addFoodItem("Pizza: Cheese", new FoodItem(789, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pizza: Dxpress Supreme", new FoodItem(869, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pizza: Hawaiian", new FoodItem(841, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pizza: Meat Lovers", new FoodItem(1048, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pizza: Pepperoni", new FoodItem(823, "Gluten, Milk, Soy and Wheat"));
        dx.addFoodItem("Pizza: Veggie", new FoodItem(765, "Gluten, Milk, Soy and Wheat"));
        //Fruits
        dx.addFoodItem("Fresh Banana", new FoodItem(108, "None"));
        dx.addFoodItem("Fresh Golden Delicious Apple", new FoodItem(63, "None"));
        dx.addFoodItem("Fresh Orange", new FoodItem(94, "None"));

        diningHalls[8] = dx;

        DiningHall hg = new DiningHall("Hokie Grill");
        hg.addHours(Calendar.MONDAY, 10.5, 21);
        hg.addHours(Calendar.TUESDAY, 10.5, 21);
        hg.addHours(Calendar.WEDNESDAY, 10.5, 21);
        hg.addHours(Calendar.THURSDAY, 10.5, 21);
        hg.addHours(Calendar.FRIDAY, 10.5, 21);
        hg.addHours(Calendar.SATURDAY, 12, 20);
        hg.setLocation(37.226793, -80.418691);
        diningHalls[9] = hg;

        DiningHall owens = new DiningHall("Owens Food Court");
        owens.addHours(Calendar.SUNDAY, 10.5, 21);
        owens.addHours(Calendar.MONDAY, 10.5, 21);
        owens.addHours(Calendar.TUESDAY, 10.5, 21);
        owens.addHours(Calendar.WEDNESDAY, 10.5, 21);
        owens.addHours(Calendar.THURSDAY, 10.5, 21);
        owens.addHours(Calendar.FRIDAY, 10.5, 20);
        owens.addHours(Calendar.SATURDAY, 10.5, 20);
        owens.setLocation(37.226603, -80.418956);
        //Garden Soups
        owens.addFoodItem("Chicken Tortellini Soup", new FoodItem(166, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Vegetarian Chili", new FoodItem(141, "Gluten and Soy"));
        //Farms & Fields
        owens.addFoodItem("Blacksburg Bagels: Cherry Almond Bagel", new FoodItem(330, "Gluten, Nuts and Wheat"));
        owens.addFoodItem("Blacksburg Bagels: Everything Bagel", new FoodItem(290, "Gluten, Nuts, Soy and Wheat"));
        owens.addFoodItem("Blacksburg Bagels: Plain Bagel", new FoodItem(270, "Gluten, Nuts and Wheat"));
        owens.addFoodItem("Burger: Veggie & Cheese", new FoodItem(460, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger: Veggie", new FoodItem(411, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Ice Cream: Homestead Creamery: Average of all flavors/scoop", new FoodItem(309, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        //Carvery Chicken & Side Items
        owens.addFoodItem("Blue Ridge BBQ Cornbread Muffin", new FoodItem(178, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Blue Ridge BBQ Green Beans", new FoodItem(25, "None"));
        owens.addFoodItem("Gravy/2floz", new FoodItem(41, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Macaroni & Cheese/4.5oz", new FoodItem(450, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Rotisserie Chicken", new FoodItem(415, "Halal"));
        owens.addFoodItem("Rotisserie Chicken w/Side Dishes", new FoodItem(722, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sweet Potato Casserole/4oz", new FoodItem(215, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Whipped Fresh Potatoes & Gravy/6oz", new FoodItem(215, "Eggs, Gluten, Milk, Soy and Wheat"));
        //Lotsa Pasta
        owens.addFoodItem("Alfredo Sauce/4.5floz", new FoodItem(253, "Milk and Soy"));
        owens.addFoodItem("Alfredo Sauce/Pasta", new FoodItem(523, "Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Garlic Breadsticks/stick", new FoodItem(86, "Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Gluten Free Pasta/6oz", new FoodItem(203, "Soy"));
        owens.addFoodItem("Marinara Sauce/4.5oz", new FoodItem(72, "None"));
        owens.addFoodItem("Marinara Sauce/Pasta", new FoodItem(341, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Meat Sauce/4.5oz", new FoodItem(83, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Meat Sauce/Pasta", new FoodItem(352, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Shell Pasta/6oz", new FoodItem(553, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Vermicelli Pasta/6oz", new FoodItem(539, "Gluten, Soy and Wheat"));
        //Bowl Dynasty
        owens.addFoodItem("Bowl Dynasty Fried Rice/6oz", new FoodItem(156, "Eggs, Gluten, Soy and Wheat"));
        owens.addFoodItem("Chicken Noodle Bowl", new FoodItem(524, "Gluten, Milk, Soy, Wheat and Halal"));
        owens.addFoodItem("Dumplings, Edamame & Sauces/5dumplings", new FoodItem(260, "Fish, Gluten, Soy and Wheat"));
        owens.addFoodItem("Egg Rolls/egg roll", new FoodItem(217, "Eggs, Gluten, Soy and Wheat"));
        owens.addFoodItem("General Tso's Chicken & Rice/15oz", new FoodItem(645, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Honey Seared Chicken/11oz", new FoodItem(547, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Pacific Blend Veggie Stirfry/Rice/11oz", new FoodItem(335, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Rice: White/6oz", new FoodItem(658, "None"));
        //Frank's Deli
        owens.addFoodItem("Frank's Deli Cheese Sub", new FoodItem(508, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Deli Meat Sub", new FoodItem(407, "Eggs, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Deli Veggie Sub", new FoodItem(192, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'Fantstic Frank'", new FoodItem(660, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'Special Teams'", new FoodItem(550, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'The Blocked Kick'", new FoodItem(855, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'The Defensive Back'", new FoodItem(490, "Eggs, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'The Lunch Pail'", new FoodItem(579, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Frank's Sandwich: 'The Read Zone'", new FoodItem(691, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Homestyle Potato Chip/1.5oz", new FoodItem(81, "Soy"));
        owens.addFoodItem("Salad: Chicken/3oz", new FoodItem(185, "Eggs and Soy"));
        owens.addFoodItem("Salad: Tuna/3oz", new FoodItem(159, "Eggs, Fish and Soy"));
        //Freshen's Yogurt & Smoothies
        owens.addFoodItem("Bangin' Berry Smoothie", new FoodItem(370, "Gluten"));
        owens.addFoodItem("Caribbean Craze Smoothie", new FoodItem(330, "None"));
        owens.addFoodItem("Feelin' Peachy Smoothie", new FoodItem(310, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Freshen's Yogurt", new FoodItem(375, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Jamaican Jammer Smoothie", new FoodItem(320, "Gluten, Milk and Wheat"));
        owens.addFoodItem("Mango Me Crazy Smoothie", new FoodItem(290, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Maui Mango Smoothie", new FoodItem(330, "None"));
        owens.addFoodItem("Oh Kale Smoothie", new FoodItem(320, "None"));
        owens.addFoodItem("Orange Sunrise Smoothie", new FoodItem(320, "Gluten and Milk"));
        owens.addFoodItem("Peach on the Beach Smoothie", new FoodItem(280, "Gluten and Milk"));
        owens.addFoodItem("Peanut Buter Protein Smoothie", new FoodItem(500, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Pom-Tastic Smoothie", new FoodItem(320, "Gluten"));
        owens.addFoodItem("Protein Power-Up Smoothie", new FoodItem(580, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Purple Reign Smoothie", new FoodItem(320, "Gluten"));
        owens.addFoodItem("Smoothie Supplements", new FoodItem(4, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sprinkles/.5oz", new FoodItem(71, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Stir-In: Oreo Cookie/oz", new FoodItem(137, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Stir-In: Reese's Pieces/oz", new FoodItem(141, "Milk, Nuts and Soy"));
        owens.addFoodItem("Toppings for Frozen Yogurt/3.5oz", new FoodItem(295, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Tropical Therapy Smoothie", new FoodItem(480, "Gluten and Nuts"));
        //La Cantina
        owens.addFoodItem("Beans: Black", new FoodItem(98, "Soy"));
        owens.addFoodItem("Beans: Pinto", new FoodItem(60, "Soy"));
        owens.addFoodItem("Cantina Salad", new FoodItem(645, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Cheese: Monterey Jack Shredded", new FoodItem(211, "Milk"));
        owens.addFoodItem("Fajita Peppers/Onions", new FoodItem(6, "None"));
        owens.addFoodItem("Guacamole and Chips", new FoodItem(501, "Gluten and Soy"));
        owens.addFoodItem("Guacamole", new FoodItem(98, "None"));
        owens.addFoodItem("Meat: Barbacoa Beef", new FoodItem(132, "None"));
        owens.addFoodItem("Meat: Chipotle Chicken", new FoodItem(172, "Soy and Halal"));
        owens.addFoodItem("Meat: Chipotle Steak", new FoodItem(206, "Soy"));
        owens.addFoodItem("Meat: Pork Carnitas", new FoodItem(102, "None"));
        owens.addFoodItem("Quesadilla: Barbacoa Beef", new FoodItem(823, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Quesadilla: Carnitas", new FoodItem(803, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Quesadilla: Cheese", new FoodItem(755, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Quesadilla: Chicken", new FoodItem(849, "Eggs, Gluten, Milk, Nuts, Soy, Wheat and Halal"));
        owens.addFoodItem("Quesadilla: Steak", new FoodItem(872, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Rice: Cilantro Lime", new FoodItem(332, "Soy"));
        owens.addFoodItem("Salad Dressing: Chipotle Ranch", new FoodItem(140, "Eggs, Milk and Soy"));
        owens.addFoodItem("Salad Dressing: Honey Chipotle Vinaigrette", new FoodItem(96, "Soy"));
        owens.addFoodItem("Salsa Verde", new FoodItem(11, "None"));
        owens.addFoodItem("Salsa and Chips", new FoodItem(370, "Gluten and Soy"));
        owens.addFoodItem("Salsa: Fresh Tomato", new FoodItem(16, "None"));
        owens.addFoodItem("Salsa: Red Chili", new FoodItem(25, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Salsa: Roasted Chili Corn", new FoodItem(36, "None"));
        owens.addFoodItem("Sour Cream", new FoodItem(113, "Milk"));
        owens.addFoodItem("Tortilla: Burrito", new FoodItem(331, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Tortilla: Hard Taco Shell", new FoodItem(160, "None"));
        owens.addFoodItem("Tortilla: Soft Taco", new FoodItem(93, "Gluten and Wheat"));
        owens.addFoodItem("White Chili con Queso", new FoodItem(266, "Gluten and Milk"));
        //Philly City
        owens.addFoodItem("French Fries", new FoodItem(306, "Soy"));
        owens.addFoodItem("Philly Cheese Steak", new FoodItem(376, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Philly Chicken Cheese Steak", new FoodItem(304, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Philly City French Fries/Ketchup", new FoodItem(332, "Gluten and Soy"));
        //Sweet Temptations
        owens.addFoodItem("Assorted Cookies/cookie", new FoodItem(225, "Eggs, Gluten, Milk, Nuts, Soy, Wheat"));
        owens.addFoodItem("Assorted Fruit Pies/piece", new FoodItem(360, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Assorted Gourmet Pies/piece", new FoodItem(308, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Brownie Sundae/brownie", new FoodItem(1022, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Chocolate Dipped Cannoli/cannoli", new FoodItem(319, "Eggs, Gluten, Milk and Wheat"));
        owens.addFoodItem("Chocolate Dipped Strawberries/3berries", new FoodItem(486, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Gluten Free Blueberry Muffin", new FoodItem(197, "Eggs and Soy"));
        owens.addFoodItem("Gluten Free Brownie", new FoodItem(350, "Eggs and Soy"));
        owens.addFoodItem("Gluten Free Sliced Bread", new FoodItem(170, "Eggs and Soy"));
        owens.addFoodItem("Mega Muffin", new FoodItem(551, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Parfait", new FoodItem(613, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Pumpkin Spice Whoopie Pie", new FoodItem(285, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Vanilla/Chocolate Cupcake", new FoodItem(748, "Eggs, Gluten, Milk, Soy and Wheat"));
        //The Garden
        owens.addFoodItem("Toppings: Bacon Bits/oz", new FoodItem(122, "Soy"));
        owens.addFoodItem("Bagel", new FoodItem(298, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Toppings: Banana Peppers/.5oz", new FoodItem(5, "None"));
        owens.addFoodItem("Toppings: Black Olives/.5oz", new FoodItem(27, "None"));
        owens.addFoodItem("Bread Bowl: White for Soup", new FoodItem(417, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Bread Bowl: Whole Wheat for Soup", new FoodItem(521, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Toppings: Cantaloupe Slices/oz", new FoodItem(10, "None"));
        owens.addFoodItem("Toppings: Cheese: Feta/oz", new FoodItem(75, "Milk"));
        owens.addFoodItem("Toppings: Cheese: Mozzarella/oz", new FoodItem(72, "Milk"));
        owens.addFoodItem("Toppings: Cheese: Shredded Cheddar/oz", new FoodItem(114, "Milk"));
        owens.addFoodItem("Toppings: Cheese: Shredded Parmesan/oz", new FoodItem(101, "Milk"));
        owens.addFoodItem("Chow Mein Noodles/oz", new FoodItem(130, "Gluten and Wheat"));
        owens.addFoodItem("Toppings: Cole Slaw/4oz", new FoodItem(148, "Eggs and Soy"));
        owens.addFoodItem("Toppings: Cottage Cheese/.5cup", new FoodItem(80, "Milk"));
        owens.addFoodItem("Toppings: Cream Cheese/oz", new FoodItem(97, "Milk"));
        owens.addFoodItem("Toppings: Croutons/.5oz", new FoodItem(61, "Gluten, Milk and Wheat"));
        owens.addFoodItem("Toppings: Diced Ham/oz", new FoodItem(46, "None"));
        owens.addFoodItem("Toppings: Diced Turkey/oz", new FoodItem(24, "Gluten and Wheat"));
        owens.addFoodItem("Egg Salad/oz", new FoodItem(39, "Eggs and Soy"));
        owens.addFoodItem("Toppings: Eggs: Chopped/oz", new FoodItem(44, "Eggs"));
        owens.addFoodItem("Fresh Banana", new FoodItem(108, "None"));
        owens.addFoodItem("Fresh Orange", new FoodItem(94, "None"));
        owens.addFoodItem("Fresh Pear", new FoodItem(97, "None"));
        owens.addFoodItem("Toppings: Fresh Pineapple/oz", new FoodItem(14, "None"));
        owens.addFoodItem("Fresh Red Delicious Apple", new FoodItem(63, "None"));
        owens.addFoodItem("Toppings: Fresh Red Grapes/oz", new FoodItem(19, "None"));
        owens.addFoodItem("Toppings: Fresh Strawberries/oz", new FoodItem(9, "None"));
        owens.addFoodItem("Toppings: Garbanzo Beans/oz", new FoodItem(39, "None"));
        owens.addFoodItem("Toppings: Green Olives/oz", new FoodItem(43, "None"));
        owens.addFoodItem("Toppings: Honeydew Melon Slices/oz", new FoodItem(0, "None"));
        owens.addFoodItem("Toppings: Jelly/.5oz", new FoodItem(77, "None"));
        owens.addFoodItem("Toppings: Peach Slices/3oz", new FoodItem(43, "None"));
        owens.addFoodItem("Toppings: Peanut Butter/oz", new FoodItem(186, "Nuts and Soy"));
        owens.addFoodItem("Toppings: Picante Sauce/2TBSP", new FoodItem(20, "None"));
        owens.addFoodItem("Salad Dressing: Bleu Cheese/2TBSP", new FoodItem(80, "Eggs, Milk and Soy"));
        owens.addFoodItem("Salad Dressing: Caesar/2TBSP", new FoodItem(150, "Fish, Milk and Soy"));
        owens.addFoodItem("Salad Dressing: French/2TBSP", new FoodItem(130, "Soy"));
        owens.addFoodItem("Salad Dressing: Italian/2TBSP", new FoodItem(120, "Soy"));
        owens.addFoodItem("Salad Dressing: Olive Oil/2TBSP", new FoodItem(480, "Soy"));
        owens.addFoodItem("Salad Dressing: Ranch/TBSP", new FoodItem(20, "Eggs, Milk and Soy"));
        owens.addFoodItem("Salad Dressing: Seasame Spice/2floz", new FoodItem(123, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Salad Dressing: 1000 Island/2TBSP", new FoodItem(280, "Eggs, Gluten, Soy and Wheat"));
        owens.addFoodItem("Salad Dressing: Fat Free Honey/2TBSP", new FoodItem(45, "Eggs and Milk"));
        owens.addFoodItem("Salad Dressing: Raspberry Vinaigrette/2TBSP", new FoodItem(70, "None"));
        owens.addFoodItem("Salad Dressing: Fat Free Italian/2TBSP", new FoodItem(20, "Soy"));
        owens.addFoodItem("Salad Dressing: Fat Free Ranch/2TBSP", new FoodItem(30, "Milk"));
        owens.addFoodItem("Salad: Tossed w/just Veggies/2oz", new FoodItem(15, "None"));
        owens.addFoodItem("Salad: Barley Antipasto/4oz", new FoodItem(175, "Gluten, Milk and Soy"));
        owens.addFoodItem("Salad: Broccoli Raisin/oz", new FoodItem(68, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Salad: Chicken/4oz", new FoodItem(246, "Eggs and Soy"));
        owens.addFoodItem("Salad: Corn and Black Bean/4oz", new FoodItem(110, "Soy"));
        owens.addFoodItem("Salad: Crabmeat/oz", new FoodItem(32, "Eggs, Fish, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Salad: Garden Bean/4oz", new FoodItem(94, "Gluten"));
        owens.addFoodItem("Salad: Ham and Smoked Gouda/oz", new FoodItem(109, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Salad: Potato/oz", new FoodItem(40, "Eggs and Soy"));
        owens.addFoodItem("Salad: Quinoa Tabouleh/4oz", new FoodItem(79, "Milk and Soy"));
        owens.addFoodItem("Salad: Soba Noodle/4oz", new FoodItem(161, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Salad: Tuna/3oz", new FoodItem(159, "Eggs, Fish and Soy"));
        owens.addFoodItem("Toppings: Sunflower Seeds/oz", new FoodItem(165, "Eggs, Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Toppings: Tofu/oz", new FoodItem(37, "Soy"));
        owens.addFoodItem("Toppings: Tuna/oz", new FoodItem(24, "Fish and Soy"));
        owens.addFoodItem("Toppings: Whipped Margarine/.5oz", new FoodItem(68, "Soy"));
        owens.addFoodItem("White Sandwich Bread", new FoodItem(63, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Whole Wheat Bread", new FoodItem(60, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Yogurt: Blueberry/2oz", new FoodItem(58, "Gluten and Milk"));
        owens.addFoodItem("Yogurt: Strawberry/2oz", new FoodItem(58, "Milk"));
        //The Oasis
        owens.addFoodItem("Soft Drinks: Diet/16oz", new FoodItem(2, "None"));
        owens.addFoodItem("Soft Drinks: Non Diet/16oz", new FoodItem(315, "None"));
        //Flips
        owens.addFoodItem("Buffalo Chicken Sandwich", new FoodItem(596, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger Patty: Grilled To Order/No Bun", new FoodItem(257, "None"));
        owens.addFoodItem("Burger: Bacon Cheese", new FoodItem(675, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger: Cheese w/toppings", new FoodItem(498, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger: Grilled w/Bun & Toppings", new FoodItem(448, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger: John Wayne", new FoodItem(950, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Burger: Mushroom & Swiss", new FoodItem(683, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Chicken Breast: Grilled to Order/No Bun", new FoodItem(212, "Soy and Halal"));
        owens.addFoodItem("Flips French Fries/Ketchup", new FoodItem(447, "Gluten, Soy and Wheat"));
        owens.addFoodItem("Homestyle Potato Chips/1.5oz", new FoodItem(81, "Soy"));
        owens.addFoodItem("Hot Dog: Hebrew National", new FoodItem(551, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Meatball Sub", new FoodItem(702, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Mozzarella Cheese Sticks/4 sticks", new FoodItem(396, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Onion Rings/4oz", new FoodItem(258, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Chicken Bacon Ranch", new FoodItem(897, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Chicken Cordon Bleu", new FoodItem(1027, "Eggs, Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Chicken Parmesan", new FoodItem(827, "Gluten, Milk, Nuts, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Grilled Cheese", new FoodItem(373, "Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Grilled Ham and Cheese", new FoodItem(479, "Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Grilled Turkey & Cheese", new FoodItem(410, "Gluten, Milk, Soy and Wheat"));
        owens.addFoodItem("Sandwich: Spicy Chicken", new FoodItem(474, "Eggs, Gluten, Milk, Soy and Wheat"));

        diningHalls[10] = owens;

        DiningHall turner = new DiningHall("Turner Place");
        turner.addHours(Calendar.MONDAY, 7, 22);
        turner.addHours(Calendar.TUESDAY, 7, 22);
        turner.addHours(Calendar.WEDNESDAY, 7, 22);
        turner.addHours(Calendar.THURSDAY, 7, 22);
        turner.addHours(Calendar.FRIDAY, 7, 22);
        turner.setLocation(37.230973, -80.422623);
        diningHalls[11] = turner;

        DiningHall we = new DiningHall("West End Market");
        we.addHours(Calendar.SUNDAY, 11, 20);
        we.addHours(Calendar.MONDAY, 10.5, 20);
        we.addHours(Calendar.TUESDAY, 10.5, 20);
        we.addHours(Calendar.WEDNESDAY, 10.5, 20);
        we.addHours(Calendar.THURSDAY, 10.5, 20);
        we.addHours(Calendar.FRIDAY, 10.5, 20);
        we.addHours(Calendar.SATURDAY, 11, 20);
        we.setLocation(37.223395, -80.421993);

        // Bistro Firenze
        we.addFoodItem("Bread, Garlic", new FoodItem(394, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Breadsticks w/ Sauce", new FoodItem(597, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Caesar Salad", new FoodItem(243, "Milk, Eggs, Fish, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Caesar Salad w/ Chicken", new FoodItem(614, "Milk, Eggs, Fish, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Calzone", new FoodItem(1084, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cheese Breadstick w/ Sauce", new FoodItem(408, "Milk, Wheat, Gluten"));
        we.addFoodItem("Chocolate French Silk Pie", new FoodItem(766, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Creamed Filled Cannoli", new FoodItem(240, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Marinated Chicken", new FoodItem(128, "Soybeans"));
        we.addFoodItem("Pasta, Gluten Free", new FoodItem(369, "None"));
        we.addFoodItem("Pasta, Rotini", new FoodItem(637, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pasta, Sm Plate: Gluten Free", new FoodItem(231, "None"));
        we.addFoodItem("Pasta, Sm. Plate Whole Wheat Penne", new FoodItem(189, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pasta, Sm. Plate: Rotini", new FoodItem(390, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pasta, Sm. Plate: Spaghetti", new FoodItem(417, " Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pasta, Spaghetti", new FoodItem(680, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pasta, Whole Wheat Penne", new FoodItem(503, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pizza, Four Cheese", new FoodItem(2515, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pizza, Pepperoni", new FoodItem(2941, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Potato Salad", new FoodItem(207, "Eggs, Soybeans"));
        we.addFoodItem("Sauce, Alfredo", new FoodItem(223, "Milk"));
        we.addFoodItem("Sauce, Marinara", new FoodItem(126, "None"));
        we.addFoodItem("Sauce, Meat Marinara", new FoodItem(214, "None"));
        we.addFoodItem("Sauce, Sm. Plate: Alfredo", new FoodItem(112, "Milk"));
        we.addFoodItem("Sauce, Sm. Plate: Cajun Cream", new FoodItem(177, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sauce, Sm. Plate: Marinara", new FoodItem(63, "None"));
        we.addFoodItem("Sauce, Sm. Plate: Meat Marinara", new FoodItem(124, "None"));
        we.addFoodItem("Stromboli", new FoodItem(932, "Milk, Wheat, Soybeans, Gluten"));
        // Leaf & Ladle
        we.addFoodItem("Bread Chicken Strips",new FoodItem(105, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Marinated Grilled Chicken", new FoodItem(127, "Soybeans"));
        // Soups & Quiche
        we.addFoodItem("Bread Bowl", new FoodItem(150, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Chili Beans with Meat", new FoodItem(365, "Gluten"));
        we.addFoodItem("Quiche Lorraine", new FoodItem(387, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Soup, Garden Vegetable", new FoodItem(171, "Soybeans"));
        // Croissants & Flatbreads
        we.addFoodItem("Croissant with Chicken Salad", new FoodItem(536, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Croissant with Tuna Salad", new FoodItem(508, "Milk, Eggs, Fish, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Flatbread with Chicken Salad", new FoodItem(437, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Flatbread with Tuna Salad", new FoodItem(410, "Eggs, Fish, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Flatbread with Veggies", new FoodItem(217, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pita Bread, Whole Wheat", new FoodItem(98, "Wheat, Soybeans, Gluten"));
        // Salads
        we.addFoodItem("Bowl, Fresh Fruit", new FoodItem(168, "Milk"));
        we.addFoodItem("Garden Salad with Fruit, Nuts & Dressing", new FoodItem(384, "Tree Nuts, Soybeans"));
        we.addFoodItem("Salad, All American Tossed, no dressing", new FoodItem(244, "Milk, Wheat, Gluten"));
        we.addFoodItem("Salad, Chef, no dressing", new FoodItem(605, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Salad, Greek w/Agean Dressing", new FoodItem(338, "Milk, Wheat, Gluten"));
        we.addFoodItem("Salad, Power Green w/ Pomegranate Dressing", new FoodItem(375, "Milk, Eggs, Tree Nuts, Soybeans"));
        we.addFoodItem("Salad, Side American Tossed, no dressing", new FoodItem(94, "Milk, Wheat, Gluten"));
        we.addFoodItem("Salad, Side Chef, no dressing", new FoodItem(322, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Salad, Side Greek, no dressing", new FoodItem(179, "Milk, Wheat, Gluten"));
        we.addFoodItem("Salad, Side Power Green w/Pomegrante Dressing", new FoodItem(260, "Milk, Eggs, Tree Nuts, Soybeans"));
        we.addFoodItem("Salad, Southwest Grill Chicken, no dressing", new FoodItem(615, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Salad, Warm Chicken, no dressing", new FoodItem(504, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Soba Noodle Salad Plate", new FoodItem(338, "Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        // Salad Dressings
        we.addFoodItem("Balsamic Vinaigrette", new FoodItem(50, "Soybeans"));
        we.addFoodItem("Salad Dressing, Agean Greek", new FoodItem(130, "Milk, Soybeans"));
        we.addFoodItem("Salad Dressing, Bleu Cheese", new FoodItem(80, "Milk, Eggs, Soybeans"));
        we.addFoodItem("Salad Dressing, Poppyseed", new FoodItem(260, "Milk, Eggs, Soybeans"));
        we.addFoodItem("Salad Dressing, Ranch", new FoodItem(60, "Milk, Eggs, Soybeans"));
        we.addFoodItem("Salad Dressing,1000 Island", new FoodItem(280, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Salad Dressing,Fat Free Honey", new FoodItem(45, "Milk, Eggs"));
        we.addFoodItem("Salad Dressing,Honey Mustard", new FoodItem(119, "Eggs, Soybeans, Gluten"));
        we.addFoodItem("Salad Dressing Fat Free French", new FoodItem(30, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Salad Dressing Fat Free Ital", new FoodItem(20, "Soybeans"));
        // Wired
        we.addFoodItem("Carrot Apple Juice", new FoodItem(208, "None"));
        we.addFoodItem("Chocolate Cupcake/Cream cheese Icing", new FoodItem(333, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Chocolate Cupcake/Vanilla Icing", new FoodItem(376, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Creme Brulee variety", new FoodItem(569, "Milk, Eggs, Soybeans"));
        we.addFoodItem("Fresh Orange", new FoodItem(94, "None"));
        we.addFoodItem("Fresh Red Delicious Apple", new FoodItem(63, "None"));
        we.addFoodItem("Juice, Fresh Apple", new FoodItem(222, "None"));
        we.addFoodItem("Juice, Freshly Squeezed Orange", new FoodItem(191, "None"));
        we.addFoodItem("Pineapple Ginger Drink", new FoodItem(107, "None"));
        we.addFoodItem("Soft Drinks, Diet", new FoodItem(2, "None"));
        we.addFoodItem("Soft Drinks, non-diet", new FoodItem(315, "None"));
        // Smoothies
        we.addFoodItem("Smoothie, Blueberry Peach Small", new FoodItem(202, "Milk, Gluten"));
        we.addFoodItem("Smoothie, Blueberry Peach", new FoodItem(334, "Milk, Gluten"));
        we.addFoodItem("Smoothie, Coco Nana", new FoodItem(571, "Tree Nuts"));
        we.addFoodItem("Smoothie, Cocoa Nana Small", new FoodItem(325, "Tree Nuts"));
        we.addFoodItem("Smoothie, Peach Small", new FoodItem(222, "Gluten"));
        we.addFoodItem("Smoothie, Peach", new FoodItem(305, "Gluten"));
        we.addFoodItem("Smoothie, Pina Colada Small", new FoodItem(246, "Tree Nuts"));
        we.addFoodItem("Smoothie, Pina Colada", new FoodItem(426, "Tree Nuts"));
        we.addFoodItem("Smoothie, Planet Raspberry Small", new FoodItem(167, "None"));
        we.addFoodItem("Smoothie, Planet Raspberry", new FoodItem(338, "None"));
        we.addFoodItem("Smoothie, Strawberry Banana Small", new FoodItem(235, "None"));
        we.addFoodItem("Smoothie, Strawberry Banana", new FoodItem(355, "None"));
        we.addFoodItem("Smoothie, Strawberry Daiquiri Small", new FoodItem(249, "None"));
        we.addFoodItem("Smoothie, Strawberry Daiquiri", new FoodItem(369, "None"));
        // Baked Goods
        we.addFoodItem("Baguette", new FoodItem(346, "Wheat, Gluten"));
        we.addFoodItem("Brownies", new FoodItem(459, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Carrot Cake", new FoodItem(970, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie, Chocolate Chunk", new FoodItem(600, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie, Harvest", new FoodItem(350, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie, Royale", new FoodItem(520, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie, Triple Chocolate", new FoodItem(370, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie, White Chocolate Macadamia Nut", new FoodItem(400, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Eclair, Chocolate", new FoodItem(255, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Rice Krispie Treat", new FoodItem(300, "Milk, Soybeans, Gluten"));
        // Ice Cream Items
        we.addFoodItem("Banana Split", new FoodItem(913, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Brownie Sundae", new FoodItem(953, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cookie Sundae", new FoodItem(399, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Fresh Banana", new FoodItem(139, "None"));
        we.addFoodItem("Fudgy Walnut Brownie", new FoodItem(554, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Hershey Syrup", new FoodItem(15, "None"));
        we.addFoodItem("Hot Fudge Sauce", new FoodItem(246, "Milk, Tree Nuts"));
        we.addFoodItem("Ice Cream in Waffle Cone", new FoodItem(399, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Butter Pecan", new FoodItem(160, "Milk, Tree Nuts, Soybeans"));
        we.addFoodItem("Ice Cream, Chocolate", new FoodItem(140, "Milk"));
        we.addFoodItem("Ice Cream, Classic Vanilla Bean", new FoodItem(140, "Milk"));
        we.addFoodItem("Ice Cream, Cookies & Cream", new FoodItem(150, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Double Scoop", new FoodItem(300, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Homestead Creamery Moo Tracks", new FoodItem(327, "Milk, Eggs, Tree Nuts, Peanuts, Soybeans"));
        we.addFoodItem("Ice Cream, Homestead Creamery Orange Cream", new FoodItem(302, "Milk, Eggs"));
        we.addFoodItem("Ice Cream, Homestead Creamery, Average of all flavors", new FoodItem(309, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Mint Chocolate Chip", new FoodItem(160, "Milk, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Rocky Road", new FoodItem(160, "Milk, Tree Nuts, Soybeans"));
        we.addFoodItem("Ice Cream, Single Scoop", new FoodItem(150, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Strawberry Cheesecake", new FoodItem(150, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ice Cream, Strawberry", new FoodItem(120, "Milk, Gluten"));
        we.addFoodItem("Maraschino Cherry", new FoodItem(6, "None"));
        we.addFoodItem("Milkshake", new FoodItem(374, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Peanut Topping", new FoodItem(29, "Milk, Eggs, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pineapple Sauce", new FoodItem(47, "None"));
        we.addFoodItem("Rainbow Sprinkles", new FoodItem(39, "Soybeans"));
        we.addFoodItem("Strawberry Sauce", new FoodItem(49, "None"));
        we.addFoodItem("Sundae in Waffle Cone", new FoodItem(636, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sundae, Ice Cream Large", new FoodItem(577, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sundae, Ice Cream Small", new FoodItem(366, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Triple Chocolate Cookie", new FoodItem(370, "Milk, Eggs, Tree Nuts, Peanuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Waffle Cone", new FoodItem(99, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Whipped Topping", new FoodItem(89, "Milk, Gluten"));
        // Wrap World
        we.addFoodItem("Black Bean & Corn Relish", new FoodItem(10, "None"));
        we.addFoodItem("Mexican Rice", new FoodItem(465, "Soybeans"));
        we.addFoodItem("Onions & Peppers for Wraps", new FoodItem(65, "Soybeans"));
        we.addFoodItem("Wrap, Blackened Chicken w/Rice", new FoodItem(864, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Buffalo Chicken w/ Rice", new FoodItem(816, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Chicken Caesar w/o Rice", new FoodItem(659, "Milk, Fish, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Chicken Fajita w/Rice", new FoodItem(839, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Grilled Veggie w/Rice", new FoodItem(725, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Jerk Chicken w/Rice", new FoodItem(886, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Smoked BBQ w/Rice", new FoodItem(1088, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Southwest Steak w/Rice", new FoodItem(840, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wrap, Spicy Asian Chicken w/Rice", new FoodItem(649, "Eggs, Wheat, Soybeans, Gluten"));
        // Build your own Sandwich
        we.addFoodItem("Bread, Cracked Wheat", new FoodItem(116, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Bread, Potato", new FoodItem(123, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Bread, Rye", new FoodItem(88, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Bread, Sourdough", new FoodItem(80, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cappicola Ham", new FoodItem(106, "None"));
        we.addFoodItem("Cheese, Cheddar", new FoodItem(114, "Milk"));
        we.addFoodItem("Cheese, Provolone", new FoodItem(101, "Milk"));
        we.addFoodItem("Cheese, Swiss", new FoodItem(108, "Milk"));
        we.addFoodItem("Deli Meat: Corned Beef", new FoodItem(75, "None"));
        we.addFoodItem("Deli Meat: Ham", new FoodItem(48, "None"));
        we.addFoodItem("Deli Meat: Roast Beef", new FoodItem(137, "Soybeans"));
        we.addFoodItem("Deli Meat: Salami", new FoodItem(349, "None"));
        we.addFoodItem("Deli Meat: Smoked Turkey", new FoodItem(101, "None"));
        we.addFoodItem("Deli Meat: Turkey", new FoodItem(73, "Wheat, Gluten"));
        we.addFoodItem("Lettuce and Tomato", new FoodItem(5, "None"));
        // Specialy Sandwiches
        we.addFoodItem("BLT Sandwich", new FoodItem(444, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Croissant, Smoked Turkey", new FoodItem(581, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, French Dip", new FoodItem(497, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Grilled Ham & Chse", new FoodItem(642, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Hokie Club", new FoodItem(937, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Hokie Steak", new FoodItem(624, "Milk, Wheat, Gluten"));
        we.addFoodItem("Sandwich, Hot Rst Beef & Ched.", new FoodItem(686, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Italian Grinder", new FoodItem(942, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Reuben", new FoodItem(326, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Vegetable Panini", new FoodItem(330, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        // JP's Chop Shop
        we.addFoodItem("Apple Smoked Chicken Breast", new FoodItem(467, "None"));
        we.addFoodItem("Apple Smoked Chicken", new FoodItem(2452, "None"));
        we.addFoodItem("Bourbon Marinade Added to Steak", new FoodItem(1, "Soybeans"));
        we.addFoodItem("Catch of the Day", new FoodItem(191, "Fish"));
        we.addFoodItem("Crispy Grilled Chicken Breast", new FoodItem(309, "None"));
        we.addFoodItem("Crispy Grilled Chicken Dinner", new FoodItem(711, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("London Broil", new FoodItem(274, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Ribeye Steak", new FoodItem(91, "None"));
        we.addFoodItem("Salmon Sandwich", new FoodItem(535, "Eggs, Fish, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Whole Lobster", new FoodItem(970, "Milk, Crustacean Shellfish"));
        we.addFoodItem("Baked Potato w/Butter & Sour Cream", new FoodItem(394, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Broiled Italian Tomato Half", new FoodItem(131, "Milk"));
        we.addFoodItem("Chicken Gravy", new FoodItem(34, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Cornbread", new FoodItem(291, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Crusty Wheat Roll", new FoodItem(95, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Crusty White Roll", new FoodItem(75, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("French Onion Soup", new FoodItem(494, "Garlic Whipped Potatoes"));
        we.addFoodItem("Mushroom Sauce", new FoodItem(61, "Milk, Eggs, Tree Nuts, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Roesti Potatoes", new FoodItem(180, "Soybeans"));
        we.addFoodItem("Wild Rice", new FoodItem(156, "Soybeans"));
        // Burgers and Dogs
        we.addFoodItem("Burger, Bacon Bleu", new FoodItem(711, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, California", new FoodItem(661, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Cheese & Bacon", new FoodItem(619, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Cheese", new FoodItem(598, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Hickory", new FoodItem(749, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Monterey", new FoodItem(712,"Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Sports Bar", new FoodItem(543, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Burger, Veggie", new FoodItem(446, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Grilled Portabello Mushroom Burger", new FoodItem(327, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Hot Dog Chili", new FoodItem(58, "Soybeans"));
        we.addFoodItem("Hot Dog with Bun", new FoodItem(446, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Pub Burger", new FoodItem(732, "Milk, Wheat, Soybeans, Gluten"));
        // Chicken, Wings, and Quesadillas
        we.addFoodItem("Grilled Chicken Sandwich", new FoodItem(347, " Wheat, Soybeans, Gluten"));
        we.addFoodItem("Hokie Planks", new FoodItem(493, "Wheat, Gluten"));
        we.addFoodItem("Quesadilla, Cheese", new FoodItem(947, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Quesadilla, Chicken", new FoodItem(1113, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Quesadilla, Steak", new FoodItem(1333, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Quesadilla, Vegetable", new FoodItem(1190, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Sandwich, Chipotle Plank", new FoodItem(477, "Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wings: Hot", new FoodItem(529, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wings: Mixed (BBQ & Hot)", new FoodItem(609, "Wheat, Soybeans, Gluten"));
        we.addFoodItem("Wings: BBQ", new FoodItem(586, "Wheat, Gluten"));
        we.addFoodItem("Wings: Korean Spicy", new FoodItem(710, "Wheat, Gluten"));
        // Sides, Snacks, and Toppings
        we.addFoodItem("American Cheese", new FoodItem(74, "Milk, Soybeans"));
        we.addFoodItem("Bacon", new FoodItem(137, "None"));
        we.addFoodItem("Cheese Fries", new FoodItem(1288, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Chipotle Nachos", new FoodItem(880, "Milk, Soybeans"));
        we.addFoodItem("Fighting Gobbler Sampler Basket", new FoodItem(608, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Mozzarella Cheese Sticks/Sce", new FoodItem(543,"Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Nachos Grande", new FoodItem(1386, "Milk, Gluten"));
        we.addFoodItem("Steak Fries", new FoodItem(742,"Milk, Wheat, Soybeans, Gluten"));
        // Brunch Items
        we.addFoodItem("Biscuits", new FoodItem(270, "Milk, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Breakfast Burrito", new FoodItem(752, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Buttermilk Pancakes & Syrup", new FoodItem(807, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("French Toast Sticks/Syrup", new FoodItem(203, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("French Toast", new FoodItem(684, "Milk, Eggs, Wheat, Soybeans, Gluten"));
        we.addFoodItem("Gluten Free Steel Cut Oatmeal", new FoodItem(140, "Tree Nuts, Soybeans"));
        we.addFoodItem("Oatmeal Topping: Brown Sugar", new FoodItem(53, "None"));
        we.addFoodItem("Oatmeal Topping: Craisins", new FoodItem(46, "None"));
        we.addFoodItem("Oatmeal Topping: Half & Half", new FoodItem(39, "Milk"));
        we.addFoodItem("Oatmeal Topping: Honey Roasted Almonds", new FoodItem(81, "Tree Nuts"));
        we.addFoodItem("Oatmeal Topping: Walnuts", new FoodItem(93, "Tree Nuts"));
        we.addFoodItem("Omelette", new FoodItem(556, "Milk, Eggs, Soybeans"));
        we.addFoodItem("Redskin Potato Homefries", new FoodItem(301, "Milk"));
        we.addFoodItem("Sausage Links", new FoodItem(477, "None"));
        we.addFoodItem("Scrambled Eggs", new FoodItem(226, "Eggs, Soybeans"));
        diningHalls[12] = we;

    }


}
