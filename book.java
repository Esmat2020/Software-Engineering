/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Scanner;

/**
 *
 * @author Ayman
 */
public class booking extends userInfo implements notification , notificationDB{
    String template;
    String item;
    
    public void setItem(String setItem) {
        item = setItem;
    }

    public String getItem(String getItem) {
        System.out.println("enter the item you want to book");
        Scanner userinput = new Scanner(System.in);
        getItem = userinput.nextLine();
        return getItem;

    }

    @Override
    public void CreateTemplate() {
        template = "Notification : you have booked "+item+ " successfully";
    }

    @Override
    public void UpdateTemplate(String newTemplate) {
        this.template = newTemplate;

    }
}