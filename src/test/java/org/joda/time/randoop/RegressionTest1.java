package org.joda.time.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.weekyearOfCentury();
    org.joda.time.DurationField durationField8 = islamicChronology1.halfdays();
    org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.dayOfWeek();
    java.lang.String str10 = islamicChronology1.toString();
    org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.clockhourOfHalfday();
    org.joda.time.ReadablePeriod readablePeriod12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array15 = islamicChronology1.get(readablePeriod12, 0L, (long)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "IslamicChronology[America/Los_Angeles]"+ "'", str10.equals("IslamicChronology[America/Los_Angeles]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.Chronology chronology7 = islamicChronology1.withUTC();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology1.getZone();
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.weekyear();
    org.joda.time.DateTimeField dateTimeField13 = islamicChronology1.halfdayOfDay();
    org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology1.getZone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone14);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfYear();
    org.joda.time.ReadablePeriod readablePeriod8 = null;
    long long11 = islamicChronology1.add(readablePeriod8, (long)10, (int)(byte)-1);
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.dayOfMonth();
    org.joda.time.Chronology chronology13 = islamicChronology1.withUTC();
    int i14 = islamicChronology1.getMinimumDaysInFirstWeek();
    org.joda.time.DateTimeField dateTimeField15 = islamicChronology1.halfdayOfDay();
    org.joda.time.DurationField durationField16 = islamicChronology1.months();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField16);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology4.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology6.getLeapYearPatternType();
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType7);
    org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyearOfCentury();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DurationField durationField4 = islamicChronology1.years();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.clockhourOfHalfday();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfYear();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.era();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology9.getLeapYearPatternType();
    org.joda.time.DurationField durationField11 = islamicChronology9.seconds();
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.millisOfSecond();
    org.joda.time.DateTimeField dateTimeField15 = islamicChronology9.weekyearOfCentury();
    org.joda.time.DateTimeField dateTimeField16 = islamicChronology9.clockhourOfDay();
    org.joda.time.DateTimeField dateTimeField17 = islamicChronology9.monthOfYear();
    org.joda.time.DurationField durationField18 = islamicChronology9.seconds();
    org.joda.time.DateTimeField dateTimeField19 = islamicChronology9.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField20 = islamicChronology9.yearOfCentury();
    boolean b21 = islamicChronology1.equals((java.lang.Object)dateTimeField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.Chronology chronology7 = islamicChronology1.withUTC();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.DurationField durationField10 = islamicChronology1.millis();
    org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.minuteOfDay();
    org.joda.time.DurationField durationField12 = islamicChronology1.eras();
    org.joda.time.DurationField durationField13 = islamicChronology1.days();
    org.joda.time.DateTimeField dateTimeField14 = islamicChronology1.year();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfYear();
    org.joda.time.ReadablePeriod readablePeriod8 = null;
    long long11 = islamicChronology1.add(readablePeriod8, (long)10, (int)(byte)-1);
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.weekOfWeekyear();
    org.joda.time.ReadablePeriod readablePeriod13 = null;
    long long16 = islamicChronology1.add(readablePeriod13, (long)(short)1, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1L);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.secondOfDay();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.yearOfCentury();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.weekOfWeekyear();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology7.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.Chronology chronology10 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.DurationField durationField11 = islamicChronology1.years();
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.weekyearOfCentury();
    org.joda.time.ReadablePeriod readablePeriod13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array16 = islamicChronology1.get(readablePeriod13, (long)(byte)100, (-53989990L));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology4.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology7.getLeapYearPatternType();
    boolean b9 = leapYearPatternType5.equals((java.lang.Object)leapYearPatternType8);
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType5);
    org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.ReadablePeriod readablePeriod12 = null;
    long long15 = islamicChronology11.add(readablePeriod12, (long)0, (int)(byte)-1);
    org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.centuryOfEra();
    long long22 = islamicChronology11.getDateTimeMillis((long)4, (int)(byte)1, (int)(byte)0, (int)(byte)10, 10);
    org.joda.time.DurationField durationField23 = islamicChronology11.years();
    org.joda.time.DurationField durationField24 = islamicChronology11.eras();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == (-53989990L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField24);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.millisOfDay();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.secondOfMinute();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.hourOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.Chronology chronology7 = islamicChronology1.withUTC();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.DurationField durationField10 = islamicChronology1.millis();
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology1.getLeapYearPatternType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType11);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.secondOfDay();
    org.joda.time.DurationField durationField4 = islamicChronology1.millis();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.yearOfEra();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology4.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology7.getLeapYearPatternType();
    boolean b9 = leapYearPatternType5.equals((java.lang.Object)leapYearPatternType8);
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType5);
    org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = islamicChronology13.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone15 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType17 = islamicChronology16.getLeapYearPatternType();
    boolean b18 = leapYearPatternType14.equals((java.lang.Object)leapYearPatternType17);
    org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType17);
    org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology21);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology1.getZone();
    org.joda.time.DurationField durationField5 = islamicChronology1.weekyears();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology7.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.Chronology chronology11 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.DurationField durationField12 = islamicChronology1.months();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField12);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.Chronology chronology7 = islamicChronology1.withUTC();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.DurationField durationField10 = islamicChronology1.millis();
    org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.minuteOfDay();
    org.joda.time.DurationField durationField12 = islamicChronology1.millis();
    org.joda.time.DateTimeField dateTimeField13 = islamicChronology1.year();
    org.joda.time.ReadablePartial readablePartial14 = null;
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array16 = islamicChronology1.get(readablePartial14, 32L);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField13);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.secondOfDay();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.secondOfDay();
    org.joda.time.DurationField durationField5 = islamicChronology1.hours();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfWeek();
    org.joda.time.DurationField durationField7 = islamicChronology1.days();
    // The following exception was thrown during execution in test generation
    try {
    long long15 = islamicChronology1.getDateTimeMillis(0, (int)(short)10, (int)'#', 10, (int)'#', (-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology4.getLeapYearPatternType();
    boolean b6 = leapYearPatternType2.equals((java.lang.Object)leapYearPatternType5);
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
    boolean b8 = leapYearPatternType2.equals((java.lang.Object)islamicChronology7);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology10.getLeapYearPatternType();
    org.joda.time.DurationField durationField12 = islamicChronology10.seconds();
    org.joda.time.DurationField durationField13 = islamicChronology10.years();
    org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.clockhourOfHalfday();
    boolean b15 = islamicChronology7.equals((java.lang.Object)islamicChronology10);
    org.joda.time.DurationField durationField16 = islamicChronology7.weeks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField16);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology4.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology7.getLeapYearPatternType();
    boolean b9 = leapYearPatternType5.equals((java.lang.Object)leapYearPatternType8);
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType5);
    org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.centuryOfEra();
    org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.millisOfDay();
    org.joda.time.DurationField durationField14 = islamicChronology10.days();
    org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.year();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology1.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology7.getLeapYearPatternType();
    org.joda.time.DurationField durationField9 = islamicChronology7.seconds();
    org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology7.millisOfSecond();
    org.joda.time.Chronology chronology13 = islamicChronology7.withUTC();
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.Chronology chronology15 = islamicChronology7.withZone(dateTimeZone14);
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = islamicChronology17.getLeapYearPatternType();
    org.joda.time.DurationField durationField19 = islamicChronology17.seconds();
    org.joda.time.DurationField durationField20 = islamicChronology17.years();
    org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.clockhourOfHalfday();
    org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.minuteOfDay();
    boolean b23 = islamicChronology7.equals((java.lang.Object)islamicChronology17);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType24 = islamicChronology17.getLeapYearPatternType();
    org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4, leapYearPatternType24);
    org.joda.time.DateTimeZone dateTimeZone26 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
    org.joda.time.DateTimeZone dateTimeZone28 = islamicChronology27.getZone();
    org.joda.time.Chronology chronology29 = islamicChronology25.withZone(dateTimeZone28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology29);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.millisOfSecond();
    org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfYear();
    org.joda.time.ReadablePeriod readablePeriod8 = null;
    long long11 = islamicChronology1.add(readablePeriod8, (long)10, (int)(byte)-1);
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField13 = islamicChronology1.yearOfCentury();
    org.joda.time.DurationField durationField14 = islamicChronology1.weekyears();
    org.joda.time.DateTimeField dateTimeField15 = islamicChronology1.hourOfDay();
    java.lang.String str16 = islamicChronology1.toString();
    org.joda.time.DateTimeField dateTimeField17 = islamicChronology1.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField18 = islamicChronology1.monthOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "IslamicChronology[America/Los_Angeles]"+ "'", str16.equals("IslamicChronology[America/Los_Angeles]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField18);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology4.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology7.getLeapYearPatternType();
    boolean b9 = leapYearPatternType5.equals((java.lang.Object)leapYearPatternType8);
    org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType5);
    org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = islamicChronology13.getLeapYearPatternType();
    org.joda.time.DateTimeZone dateTimeZone15 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType17 = islamicChronology16.getLeapYearPatternType();
    boolean b18 = leapYearPatternType14.equals((java.lang.Object)leapYearPatternType17);
    org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType17);
    org.joda.time.DurationField durationField20 = islamicChronology19.eras();
    org.joda.time.ReadablePeriod readablePeriod21 = null;
    long long24 = islamicChronology19.add(readablePeriod21, (-10L), 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-10L));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
    org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology4.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology6.getLeapYearPatternType();
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType7);
    org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.halfdayOfDay();
    org.joda.time.DateTimeZone dateTimeZone10 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology11.getLeapYearPatternType();
    org.joda.time.DurationField durationField13 = islamicChronology11.seconds();
    org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.minuteOfDay();
    org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.millisOfSecond();
    org.joda.time.Chronology chronology17 = islamicChronology11.withUTC();
    org.joda.time.DateTimeZone dateTimeZone18 = null;
    org.joda.time.Chronology chronology19 = islamicChronology11.withZone(dateTimeZone18);
    org.joda.time.DurationField durationField20 = islamicChronology11.millis();
    org.joda.time.DateTimeField dateTimeField21 = islamicChronology11.minuteOfDay();
    org.joda.time.DurationField durationField22 = islamicChronology11.millis();
    org.joda.time.DateTimeField dateTimeField23 = islamicChronology11.year();
    boolean b24 = islamicChronology8.equals((java.lang.Object)dateTimeField23);
    // The following exception was thrown during execution in test generation
    try {
    long long30 = islamicChronology8.getDateTimeMillis((long)' ', (int)(byte)100, 0, (int)'#', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.secondOfDay();
    org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.yearOfCentury();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.weekOfWeekyear();
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
    org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology7.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.Chronology chronology10 = islamicChronology1.withZone(dateTimeZone8);
    org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
    org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.hourOfHalfday();
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
    org.joda.time.DurationField durationField15 = islamicChronology14.days();
    boolean b16 = islamicChronology11.equals((java.lang.Object)islamicChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

}
