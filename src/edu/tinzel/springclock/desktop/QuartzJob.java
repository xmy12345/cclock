package edu.tinzel.springclock.desktop;
import java.text.SimpleDateFormat;
import java.util.Date;
public class QuartzJob {
 public void work() {
  SimpleDateFormat sdf = new SimpleDateFormat("");
  Date date = new Date();
  System.out.println(sdf.format(date) + "向邓建,国服第一武器大师 贾克斯");
 	}
}