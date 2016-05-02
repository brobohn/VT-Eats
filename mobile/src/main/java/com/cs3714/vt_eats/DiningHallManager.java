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
