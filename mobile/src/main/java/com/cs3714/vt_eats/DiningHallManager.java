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
        diningHalls[1] = abpsc;

        DiningHall abpsk = new DiningHall("Au Bon Pain - Squires Kiosk");
        abpsk.addHours(Calendar.MONDAY, 7, 19);
        abpsk.addHours(Calendar.TUESDAY, 7, 19);
        abpsk.addHours(Calendar.WEDNESDAY, 7, 19);
        abpsk.addHours(Calendar.THURSDAY, 7, 19);
        abpsk.addHours(Calendar.FRIDAY, 7, 19);
        abpsk.setLocation(37.229491, -80.418077);
        diningHalls[2] = abpsk;

        DiningHall abpg = new DiningHall("Au Bon Pain - Goodwin");
        abpg.addHours(Calendar.MONDAY, 7.5, 14);
        abpg.addHours(Calendar.TUESDAY, 7.5, 14);
        abpg.addHours(Calendar.WEDNESDAY, 7.5, 14);
        abpg.addHours(Calendar.THURSDAY, 7.5, 14);
        abpg.addHours(Calendar.FRIDAY, 7.5, 15.5);
        abpg.setLocation(37.232431, -80.425817);
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
        diningHalls[6] = deets;

        DiningHall dd = new DiningHall("Dunkin Donuts");
        dd.addHours(Calendar.MONDAY, 7.5, 21);
        dd.addHours(Calendar.TUESDAY, 7.5, 21);
        dd.addHours(Calendar.WEDNESDAY, 7.5, 21);
        dd.addHours(Calendar.THURSDAY, 7.5, 21);
        dd.addHours(Calendar.FRIDAY, 7.5, 21);
        dd.setLocation(37.226881, -80.418482);
        diningHalls[7] = dd;

        DiningHall dx = new DiningHall("DXpress");
        dx.addHours(Calendar.SUNDAY, 0, 2);
        dx.addHours(Calendar.SUNDAY, 9, 24);
        dx.addHours(Calendar.MONDAY, 0, 2);
        dx.addHours(Calendar.MONDAY, 7, 24);
        dx.addHours(Calendar.TUESDAY, 0, 2);
        dx.addHours(Calendar.TUESDAY, 7, 24);
        dx.addHours(Calendar.WEDNESDAY, 0, 2);
        dx.addHours(Calendar.WEDNESDAY, 7, 24);
        dx.addHours(Calendar.THURSDAY, 0, 2);
        dx.addHours(Calendar.THURSDAY, 7, 24);
        dx.addHours(Calendar.FRIDAY, 0, 2);
        dx.addHours(Calendar.FRIDAY, 7, 24);
        dx.addHours(Calendar.SATURDAY, 0, 2);
        dx.addHours(Calendar.SATURDAY, 7, 24);
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
        diningHalls[12] = we;


    }


}
