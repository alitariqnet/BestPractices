

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeDate {

	public static void main(String[] args) {

        Date _date = new Date();
        _date.getTimezoneOffset();
        System.out.println(_date);

        List<String> dates = Arrays.asList("22nd Mar 1984","20th Feb 1960","19th Sep 1940", "14th Jul 1990",
                "1st Apr 1950","3rd Dec 1889");

        List<String> formatedDates = new LinkedList();
        for (String date : dates) {
            String[] tempDate = date.split(" ");
            String day = tempDate[0];
            String month = tempDate[1];
            String year = tempDate[2];
            String resultedDate = year + "-";
            switch (month) {
                case "Jan":
                    resultedDate = resultedDate + "01";
                    break;
                case "Feb":
                    resultedDate = resultedDate + "02";
                    break;
                case "Mar":
                    resultedDate = resultedDate + "03";
                    break;
                case "Apr":
                    resultedDate = resultedDate + "04";
                    break;
                case "May":
                    resultedDate = resultedDate + "05";
                    break;
                case "Jun":
                    resultedDate = resultedDate + "06";
                    break;
                case "Jul":
                    resultedDate = resultedDate + "07";
                    break;
                case "Aug":
                    resultedDate = resultedDate + "08";
                    break;
                case "Sep":
                    resultedDate = resultedDate + "09";
                    break;
                case "Oct":
                    resultedDate = resultedDate + "10";
                    break;
                case "Nov":
                    resultedDate = resultedDate + "11";
                    break;
                case "Dec":
                    resultedDate = resultedDate + "12";
                    break;
            }
            day = day.replace("th", "").replace("rd", "").replace("nd", "").replace("st", "");
            if(day.length()>1) {
                resultedDate = resultedDate + "-" + day;
            }else{
                resultedDate = resultedDate + "-0" + day;
            }
            formatedDates.add(resultedDate);

        }
        System.out.println(formatedDates);
    }
}
