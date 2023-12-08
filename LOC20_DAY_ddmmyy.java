
package loc20_day_ddmmyy;

import java.util.Scanner;

public class LOC20_DAY_ddmmyy {


    public static void main(String[] args) {
        System.out.print("Please enter the first date: "); 
        Scanner sn = new Scanner(System.in);
        String dayngaythang1 = sn.nextLine();
        date_month_year hamphu = new date_month_year();
        hamphu.checkDateInvalid(dayngaythang1);
        
        System.out.print("Please enter the second date: ");
        String ngaythangnam2 = sn.nextLine();
        hamphu.checkDateInvalid(ngaythangnam2);
        
        hamphu.compareTwoDate(dayngaythang1, ngaythangnam2);
        
        
        
        
    }
}

    
    

