/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author abhi
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currentTime {

    public static void main(String[] args) {
        while (true) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println(sdf.format(cal.getTime()));
        }
    }

}
