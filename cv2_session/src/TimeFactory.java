import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeFactory {

    public static BufferedImage getTimeImage(int shift) {
        Calendar cal = GregorianCalendar.getInstance();

        int hh = cal.get(Calendar.HOUR) + shift;
        int mm = cal.get(Calendar.MINUTE);

        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D)img.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setStroke(new BasicStroke(2));

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, img.getWidth(), img.getHeight());

        g.setColor(Color.BLACK);
        g.drawOval(2, 2, img.getWidth()-5, img.getHeight()-5);

        //hodiny
        int xx = img.getWidth()/2 + (int)(30*Math.sin((hh*30+mm/2)*Math.PI/180));
        int yy = img.getHeight()/2 - (int)(30*Math.cos((hh*30+mm/2)*Math.PI/180));
        g.setColor(Color.RED);
        g.drawLine(img.getWidth()/2, img.getHeight()/2, xx, yy);

        //minuty
        xx = img.getWidth()/2 + (int)(40*Math.sin(mm*6*Math.PI/180));
        yy = img.getHeight()/2 - (int)(40*Math.cos(mm*6*Math.PI/180));
        g.setColor(Color.BLUE);
        g.drawLine(img.getWidth()/2, img.getHeight()/2, xx, yy);

        return img;
    }
}
