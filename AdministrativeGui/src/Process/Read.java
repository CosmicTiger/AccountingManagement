/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

/**
 *
 * @author Luisángel_Marcia
 */
import java.io.*;
/*Email teacher: marvinparrales2013@gmail.com*/
public class Read {
        public static String data ()
        {
            String sdata = "";
            try
            {
                InputStreamReader isr = new InputStreamReader (System.in);
                BufferedReader flowE = new BufferedReader (isr);
                sdata = flowE.readLine();
            }
            catch (IOException e)
            {
                System.err.println ("Error: "+ e.getMessage());
            }
            return sdata;
        }
        public static short dataShort()
        {
            try
            {
                return Short.parseShort(data());
            }
            catch (NumberFormatException e) {
                return Short.MIN_VALUE;
            }
        }
        public static int dataInt ()
        {
            try
            {
                return Short.parseShort(data());
            }
            catch (NumberFormatException e)
            {
                return Integer.MIN_VALUE;
            }
        }
        public static long dataLong()
        {
            try
            {
                return Long.parseLong(data());
            }
            catch (NumberFormatException e)
            {
                return Long.MIN_VALUE;
            }
        }
        public static float dataFloat ()
        {
            try
            {
                Float f = new Float(data());
                return f.floatValue();
            }
            catch (NumberFormatException e)
            {
                return Float.NaN;
            }
        }
        public static double dataDouble ()
        {
            try
            {
                Double d = new Double(data());
                return d.doubleValue();
            }
            catch (NumberFormatException e)
            {
                return Double.NaN;
            }
        }
}

