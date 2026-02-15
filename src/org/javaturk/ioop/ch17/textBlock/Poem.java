package org.javaturk.ioop.ch17.textBlock;

public class Poem {

    public static void main(String[] args) {
        printPoem1();
        printPoem2();
        printPoem3();
        printPoem4();
    }

    /**
     * We used to write multi-line text this way.
     */
    public static void printPoem1() {
        System.out.println("printPoem1");
        String line0 = "\n          Leylim Ley           ";
        String line1 = "Döndüm daldan düşen kuru yaprağa";
        String line2 = "Seher yeli dağıt beni kır beni";
        String line3 = "Götür tozlarımı burdan uzağa";
        String line4 = "Yarin çıplak ayağına sür beni";
        String poem = line0 + "\n" + line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + "...\n" + "Sabahattin Ali";
        System.out.println(poem);
    }

    /**
     * Or this way.
     */
    public static void printPoem2() {
        System.out.println("\nprintPoem2");
        String poem = "\n          Leylim Ley           \n" +
                "Döndüm daldan düşen kuru yaprağa\n" +
                "Seher yeli dağıt beni kır beni\n" +
                "Götür tozlarımı burdan uzağa\n" +
                "Yarin çıplak ayağına sür beni\n" +
                "...\n" +
                "Sabahattin Ali";
        System.out.println(poem);
    }

    /**
     * Or this way.
     */
    public static void printPoem3() {
        System.out.println("\nprintPoem3");
        String newLine = System.getProperty("line.separator");
        String poem = newLine.concat("").
                concat("          Leylim Ley           ").concat(newLine).
                concat("Döndüm daldan düşen kuru yaprağa").concat(newLine).
                concat("Seher yeli dağıt beni kır beni").concat(newLine).
                concat("Götür tozlarımı burdan uzağa").concat(newLine).
                concat("Yarin çıplak ayağına sür beni").concat(newLine).
                concat("...").concat(newLine).
                concat("Sabahattin Ali");
        System.out.println(poem);
    }

    /**
     * Prints the poem "Leylim Ley" by Sabahattin Ali using a text block.
     *
     * This method demonstrates the use of a multi-line text block
     * to format and display a multi-line poem in a concise and readable way.
     * The text block preserves the intended layout and indentation of the poem,
     * providing an aesthetically pleasing output.
     */
    public static void printPoem4() {
        System.out.println("\nprintPoem4");
        String poem = """
                          Leylim Ley
                Döndüm daldan düşen kuru yaprağa
                Seher yeli dağıt beni kır beni
                Götür tozlarımı burdan uzağa
                Yarin çıplak ayağına sür beni
                                
                Sabahattin Ali""";
        System.out.println(poem);
    }
}
