package com.epam.task4.view;

import com.epam.task4.controller.Controller;

/**
 * @author serge
 *         17.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        String response;
//      controller.chooseParser("sax");
//      controller.chooseParser("dom");
        controller.chooseParser("stax");
//      response = controller.executeRequest("get_treasure_list ");
//      response = controller.executeRequest("get_by_category jewel");
//      response = controller.executeRequest("get_most_expensive_treasure ");
//      response = controller.executeRequest("get_by_material Silver ");
        response = controller.executeRequest("get_by_price_range 130 700 ");
        System.out.println(response);
    }
}
