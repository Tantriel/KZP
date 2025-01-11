/**
 * lab 5 package
 */
package ki34.hlynskyi.lab5;

import java.util.Scanner;

import java.io.*;

import static java.lang.System.out;

/**
 * Class EquationsApp demonstrate program
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class EquationsApp {

    /**
     * Method main
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    CalcWFio obj = new CalcWFio();

                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    double result = eq.calculate(in.nextInt());
                    fout.print(result);
                    System.out.println("Result is: " + result);
                    obj.writeResTxt("textRes.txt", result);
                    obj.writeResBin("BinRes.bin", result);

                    obj.readResBin("BinRes.bin");
                    obj.readResTxt("textRes.txt");


                } finally {
// Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {

// Блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {

// Блок перехоплює помилки роботи з файлом навіть якщо вони
// виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}

