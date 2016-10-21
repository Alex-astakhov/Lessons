package lesson2;

/**
 * Created by Alex Astakhov on 30.09.2016.
 */
public class TypeTrans {
    public static void main(String[] args) {
        byte b = 12;
        short s = 3267;
        int i = 1215464;
        long l = 3545195143212l;
        float f = 12155.55f;
        double d = 1322151651321.5;
        l = i = s = b;
        d = f;
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);

        int in = 1264708795;
        long lo = in;
        short sh = (short) lo;
        System.out.println(sh);

        char ch = 'w';
        in = ch;
        System.out.println(in);
        ch = (char) in;
        System.out.println(ch);

        // еще явное приведение типов:

        double dou = 2.6;
        int c = (int) (0.5 + dou);
        System.out.println(c);
        System.out.println((int)9.69);
        System.out.println((int)'A');
        System.out.println((double)3);
        Integer integ = new Integer(2);
        int xint;
        Float x = new Float("3.3644");
        xint = x.intValue();
    }
}
