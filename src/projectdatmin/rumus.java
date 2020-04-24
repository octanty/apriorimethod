/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatmin;

/**
 *
 * @author okojsam
 */
public class rumus {

    static String kataygdicari1 = ProjectDatminView.transaksi1;
    static String kataygdicari2 = ProjectDatminView.transaksi2;
    static String kataygdicari3 = ProjectDatminView.transaksi3;
    static String kataygdicari4 = ProjectDatminView.transaksi4;
    static String kataygdicari5 = ProjectDatminView.transaksi5;
    public static String daftar1[] = {"Engineering", "Social", "Religion"};
    public static String daftar2[] = {"Social", "Politic"};
    public static String daftar3[] = {"Engineering", "Social", "Science"};
    public static String daftar4[] = {"Science"};
    public static String daftar5[] = {"Engineering", "Social", "Politic"};
    public static String daftar6[] = {"Politic", "Religion"};
    public static String daftar7[] = {"Engineering", "Religion", "Science", "Social"};
    public static String daftar8[] = {"Engineering", "Social", "Politic", "Science"};
    public static String daftar9[] = {"Engineering"};
    public static String daftar10[] = {"Social", "Politic"};
    public float jumlah1 = 0;
    public float jumlah2 = 0;
    public float jumlah3 = 0;
    public float jumlah4 = 0;
    public float jumlah5 = 0;
    public float jumlah6 = 0;
    public float jumlah11 = 0;
    public float jumlah12 = 0;
    public float jumlah13 = 0;
    public float jumlah14 = 0;
    public float jumlah15 = 0;
    public float jumlah16 = 0;
    public float jumlah17 = 0;
    public float jumlah18 = 0;
    public float jumlah19 = 0;
    public float jumlah20 = 0;
    public float jumlah21 = 0;
    public float jumlah22 = 0;
    public float jumlah23 = 0;
    public float jumlah24 = 0;
    public float jumlah25 = 0;
    public float jumlah26 = 0;
    public float jumlah27 = 0;
    public float jumlah28 = 0;
    public float jumlah29 = 0;
    public float jumlah30 = 0;
    public float c1;
    public float c2;
    public float c3;
    public float c4;
    public float c5;
    public float c6;
    public float s1;
    String a;
    String b;
    String c;
    String d;
    String e;
    String k;
    String l;
    String m;
    String n;
    String o;
    String hslkata1;
    String hslkata2;
    String hslkata3;
   
    public void ulang(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(kataygdicari1)) {
                jumlah1++;
            }

            if (array[i].equals(kataygdicari2)) {
                jumlah2++;
            }

            if (array[i].equals(kataygdicari3)) {
                jumlah3++;
            }

            if (array[i].equals(kataygdicari4)) {
                jumlah4++;
            }

            if (array[i].equals(kataygdicari5)) {
                jumlah5++;
            }

        }
    }

    public void datmin() {
        ulang(daftar1);
        ulang(daftar2);
        ulang(daftar3);
        ulang(daftar4);
        ulang(daftar5);
        ulang(daftar6);
        ulang(daftar7);
        ulang(daftar8);
        ulang(daftar9);
        ulang(daftar10);



    }

    public void proses1() {

        if (jumlah1 >= ProjectDatminView.minsuport) {

            a = kataygdicari1;
        } else {
            a = "";
            System.out.println(kataygdicari1 + "dieliminasi");
        }

        if (jumlah2 >= ProjectDatminView.minsuport) {

            b = kataygdicari2;
        } else {
            b = "";

            System.out.println(kataygdicari2 + "dieliminasi");
        }

        if (jumlah3 >= ProjectDatminView.minsuport) {

            c = kataygdicari3;
        } else {
            c = "";
            System.out.println(kataygdicari3 + "dieliminasi");

        }

        if (jumlah4 >= ProjectDatminView.minsuport) {

            d = kataygdicari4;
        } else {
            d = "";
            System.out.println(kataygdicari4 + "dieliminasi");
        }

        if (jumlah5 >= ProjectDatminView.minsuport) {

            e = kataygdicari5;
        } else {
            e = "";
            System.out.println(kataygdicari5 + "dieliminasi");
        }


    }

    public void ulang2(String[] array) {
        int flag = 0;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        int flag5 = 0;
        //  int flag6 = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(a)) {
                flag1++;
            } else if (array[i].equals(b)) {
                flag2++;
            } else if (array[i].equals(c)) {
                flag3++;
            } else if (array[i].equals(d)) {
                flag4++;
            } else if (array[i].equals(e)) {
                flag5++;

            }
        }
        if (flag1 + flag2 == 2) {
            jumlah11++;

        }

        if (flag1 + flag3 == 2) {
            jumlah12++;

        }
        if (flag1 + flag4 == 2) {
            jumlah13++;

        }
        if (flag1 + flag5 == 2) {
            jumlah14++;

        }

        if (flag2 + flag3 == 2) {
            jumlah15++;

        }
        if (flag2 + flag4 == 2) {
            jumlah16++;

        }
        if (flag2 + flag5 == 2) {
            jumlah17++;

        }

        if (flag3 + flag4 == 2) {
            jumlah18++;

        }
        if (flag3 + flag5 == 2) {
            jumlah19++;

        }

        if (flag4 + flag5 == 2) {
            jumlah20++;

        }

    }

    public void datmin1() {
        ulang2(daftar1);
        ulang2(daftar2);
        ulang2(daftar3);
        ulang2(daftar4);
        ulang2(daftar5);
        ulang2(daftar6);
        ulang2(daftar7);
        ulang2(daftar8);
        ulang2(daftar9);
        ulang2(daftar10);

    }

    public void proses2() {

        if (jumlah11 >= ProjectDatminView.minsuport) {
            //   System.out.println("lanjut ke langkah selanjutnya");
        } else {

            System.out.println(kataygdicari1 + "," + kataygdicari2 + ":" + jumlah11 + "dieliminasi");

        }
        if (jumlah12 >= ProjectDatminView.minsuport) {
            //  System.out.println(+jumlah12);
        } else {
            k = "";
            m = "";

            System.out.println(kataygdicari1 + "," + kataygdicari3 + ":" + jumlah12 + "dieliminasi");
        }
        if (jumlah13 >= ProjectDatminView.minsuport) {

            k = a;
            n = d;
            //  System.out.println(+jumlah13);
        } else {
            k = "";
            n = "";

            System.out.println(kataygdicari1 + "," + kataygdicari4 + ":" + jumlah13 + "dieliminasi");
        }
        if (jumlah14 >= ProjectDatminView.minsuport) {

            k = a;
            o = e;
            //   System.out.println(+jumlah14);
        } else {
            k = "";
            o = "";

            System.out.println(kataygdicari1 + "," + kataygdicari5 + ":" + jumlah14 + "dieliminasi");
        }

        if (jumlah15 >= ProjectDatminView.minsuport) {


            l = b;
            m = c;
            //   System.out.println(+jumlah15);
        } else {
            l = "";
            m = "";

            System.out.println(kataygdicari2 + "," + kataygdicari3 + ":" + jumlah15 + "dieliminasi");
        }
        if (jumlah16 >= ProjectDatminView.minsuport) {

            l = b;
            n = d;
            //   System.out.println(+jumlah16);
        } else {
            l = "";
            n = "";

            System.out.println(kataygdicari2 + "," + kataygdicari4 + ":" + jumlah16 + "dieliminasi");
        }
        if (jumlah17 >= ProjectDatminView.minsuport) {

            l = b;
            o = e;
            //   System.out.println(+jumlah17);
        } else {
            l = "";
            o = "";

            System.out.println(kataygdicari2 + "," + kataygdicari5 + ":" + jumlah17 + "dieliminasi");
        }
        if (jumlah18 >= ProjectDatminView.minsuport) {

            m = b;
            n = d;
            //   System.out.println(+jumlah18);
        } else {
            m = "";
            n = "";

            System.out.println(kataygdicari3 + "," + kataygdicari4 + ":" + jumlah18 + "dieliminasi");
        }

        if (jumlah19 >= ProjectDatminView.minsuport) {

            m = b;
            n = e;
            //   System.out.println(+jumlah19);
        } else {
            m = "";
            n = "";

            System.out.println(kataygdicari3 + "," + kataygdicari5 + ":" + jumlah19 + "dieliminasi");
        }
        if (jumlah20 >= ProjectDatminView.minsuport) {

            n = d;
            o = e;
            //     System.out.println(+jumlah20);
        } else {
            n = "";
            o = "";
            System.out.println(kataygdicari4 + "," + kataygdicari5 + ":" + jumlah20 + "dieliminasi");

        }



    }

    public void ulang3(String[] array) {
        int flag = 0;
        int flag7 = 0;
        int flag8 = 0;
        int flag9 = 0;
        int flag10 = 0;
        int flag11 = 0;
        int flag12 = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(kataygdicari1)) {
                flag7++;
            } else if (array[i].equals(kataygdicari2)) {
                flag8++;
            } else if (array[i].equals(kataygdicari3)) {
                flag9++;
            } else if (array[i].equals(kataygdicari4)) {
                flag10++;
            } else if (array[i].equals(kataygdicari5)) {
                flag11++;
            }
        }
        if (flag7 + flag8 + flag9 == 3) {
            jumlah21++;

        }

        if (flag7 + flag8 + flag10 == 3) {
            jumlah22++;

        }
        if (flag7 + flag8 + flag11 == 3) {
            jumlah23++;

        }
        if (flag7 + flag9 + flag10 == 3) {
            jumlah24++;

        }
        if (flag7 + flag9 + flag11 == 3) {
            jumlah25++;

        }
        if (flag8 + flag9 + flag10 == 3) {
            jumlah26++;

        }
        if (flag8 + flag9 + flag11 == 3) {
            jumlah27++;

        }
        if (flag8 + flag10 + flag11 == 3) {
            jumlah28++;

        }
        if (flag9 + flag10 + flag11 == 3) {
            jumlah29++;

        }
         if (flag9 + flag10 + flag11 == 3) {
            jumlah30++;

        }





    }

    public void datmin2() {
        ulang3(daftar1);
        ulang3(daftar2);
        ulang3(daftar3);
        ulang3(daftar4);
        ulang3(daftar5);
        ulang3(daftar6);
        ulang3(daftar7);
        ulang3(daftar8);
        ulang3(daftar9);
        ulang3(daftar10);

    }

       public void fungsi3(String kata1, String kata2, String kata3,float jumlaha, float jumlahb, float jumlahc, float jumlahd,  float jumlahe, float jumlahf,float jumlahall) {
         hslkata1=kata1;
         hslkata2=kata2;
         hslkata3=kata3;
         s1=jumlahall/10;
         c1=jumlahall/jumlaha;
         c2=jumlahall/jumlahb;
         c3=jumlahall/jumlahc;
         c4=jumlahall/jumlahd;
         c5=jumlahall/jumlahe;
         c6=jumlahall/jumlahf;
    }
    
  
    
}
