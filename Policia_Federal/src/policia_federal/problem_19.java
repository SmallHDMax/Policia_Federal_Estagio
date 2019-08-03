package policia_federal;

public class problem_19 {

    public void Sunday() {
        boolean bissexto = false;//Variavel que define se o ano é bissexto
        int diaMax, countDia = 1, countSunday = 0;
        for (int ano = 1900; ano < 2001; ano++) { //For para incrementar o ano
            if (ano % 4 == 0 && ano % 100 != 0) {//IFs para definir se o ano é bissexto
                bissexto = true;
            }
            if (ano % 400 == 0) {
                bissexto = true;
            }
            for (int mes = 1; mes < 13; mes++) {//For para incrementar o mes
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {//IF para meses com 30 dias
                    diaMax = 30;
                } else if (mes == 2 && bissexto) {//IFs para definir o valor de Fevereiro
                    diaMax = 29;
                    bissexto = false;

                } else if (mes == 2) {
                    diaMax = 28;
                } else {//Meses restantes
                    diaMax = 31;
                }
                for (int dia = 1; dia <= diaMax; dia++) {//For para incrementar os dias
                    if (countDia == 7) {//IF para ver se o está no ultimo dia da semana (Domingo)
                        if (dia == 1) {//If para caso seja domingo e seja o primeiro dia do mes ele incrementa a variavel countSunday
                            countSunday++;
                            System.out.println("Mes:" + mes);
                            System.out.println("Ano:" + ano);
                        }
                        countDia = 1;
                    } else {//Caso não seja domingo ele incrementa o dia da semana
                        countDia++;
                    }
                }
            }
        }
        System.out.println("Domingos no primeiro dia do mês: " + countSunday);
    }

}
