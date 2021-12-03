package io.github.hiepluong2205;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

public class NBCTest01 {
  // @Ignore
  @Test
  public void test01() {
    String str = "abc abd abc abd";
    String sub_str = "abc";
    int countAttempt = 0;

    while (str.length() > 0) {
      // TODO cover exact attempt count
      str = str.replace(sub_str, "");
      System.out.println(str);
      countAttempt++;

      if (str.compareTo(str.replace(sub_str, "")) == 0) {
        if (str.compareTo("") == 0) {
          System.out.println("Yes.");
        } else {
          System.out.println("No.");
        }
        //        System.out.println("Attempts: " + countAttempt);
        break;
      }
      ;
    }
  }

  @Ignore
  @Test
  public void test02() {
    String str1 = "XXY";
    String str2 = "XXZ";
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    char[] arrResult = {};
    int maxlength = arr1.length;
    if (arr1.length < arr2.length) {
      maxlength = arr2.length;
    }
    for (int i = 0; i < maxlength; i++) {
      // TODO insert arr2 to arr1
    }

    System.out.println(arrResult.toString());
  }

  @Ignore
  @Test
  public void test03() {
    int[] arrWeekPrices = new int[7];
    int dayLowestPrice = arrWeekPrices[0];
    int dayHighestPrice = 0;
    for (int i = 1; i <= 6; i++) {
      if (arrWeekPrices[i] >= arrWeekPrices[i - 1]) {
        dayHighestPrice = i;
      } else {
        //     TODO: cover multiple sales/possiblities

        // do nothing
      }
    }
    if (dayLowestPrice != 0 && dayHighestPrice != 0) {
      System.out.println("Recommended Buy: " + dayLowestPrice);
      System.out.println("Recommended Sell: " + dayHighestPrice);
    }
    System.out.println("Descreasing only. No profit.");
  }

  @Ignore
  @Test
  public void test04() {
//    ChromeWebDriver driver = new ChromeWebDriver();
//    driver.goTo("https://www.google.com");
//    PageGoogleSearch pageGoogleSearch = new PageGoogleSearch(driver, wait);
//    PageGoogleSearchResult pageGoogleSearchResult = new PageGoogleSearchResult(driver, wait);
//    pageGoogleSearch.search("Universal Movies from 2010 to 2020");
//    pageGoogleSearchResult().clickOnResult("Wikipedia");
    // TODO JDBC

  }
}
