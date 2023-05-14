package com.sydorenko;

public class ChineseDynasties {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int totalWarriorLi = 860;
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        double coefficient = 1.5;
        int totalWarriorMin = (int) (860 * coefficient);
        int liTotalAttack = totalWarriorLi * (warriorLi + archerLi + riderLi);
        int minTotalAttack = totalWarriorMin * (warriorMin + archerMin + riderMin);
        System.out.print("Загальна атака армії Лі " + liTotalAttack + " Загальна атака армії Мінь " + minTotalAttack);

    }
}
