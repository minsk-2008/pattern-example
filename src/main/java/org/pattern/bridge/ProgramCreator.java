package org.pattern.bridge;

public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {
                // изменяем разработчика
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
