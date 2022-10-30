package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int LannistersFootSoldier = 20;
        System.out.println("Количество пехотинцев у Ланнистеров (переменная LannistersFootSoldier) :" + LannistersFootSoldier);

        int SarumanOrcs = 40;
        System.out.println("Количество орков в войске Сарумана (переменная SarumanOrcs) :" + SarumanOrcs);

        int SarumansAndLannistersUnionTotalNumber = LannistersFootSoldier + SarumanOrcs;
        System.out.println("Количество пехоты в союзе Ланнистеров и Сарумана (переменная SarumansAndLannistersUnionTotalNumber) :" + SarumansAndLannistersUnionTotalNumber);

    }
}
