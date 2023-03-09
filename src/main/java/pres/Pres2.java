package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        //DaoImpl dao=new DaoImpl();
        String daoClassname=scanner.nextLine();
        Class cDao=Class.forName(daoClassname);
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

        Method m1=cMetier.getDeclaredMethod("setDao",IDao.class);
        m1.invoke(metier,dao);
        System.out.println(metier.calcul()’);
    }
}
