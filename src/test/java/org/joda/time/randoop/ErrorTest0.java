package org.joda.time.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology1.getLeapYearPatternType();
    org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
    org.joda.time.DurationField durationField4 = islamicChronology1.years();
    org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.clockhourOfHalfday();
    org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfYear();
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
    org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology8.getZone();
    org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.dayOfMonth();
    org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology8.getZone();
    org.joda.time.DurationField durationField12 = islamicChronology8.weekyears();
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
    org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology14.getZone();
    org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
    org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
    org.joda.time.Chronology chronology18 = islamicChronology8.withZone(dateTimeZone15);
    org.joda.time.Chronology chronology19 = islamicChronology1.withZone(dateTimeZone15);
    
    // Checks the contract:  compareTo-equals on durationField4 and durationField12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField12", (durationField4.compareTo(durationField12) == 0) == durationField4.equals(durationField12));

  }

}
