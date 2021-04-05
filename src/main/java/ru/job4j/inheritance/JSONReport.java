package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Overrid
    public String generate(String name, String body)
    {
        return "\"name\" " + ": " + "\"" + name + "\"" + "," + System.lineSeparator() + "\"body\" " + ": " + "\"" +
                body + "\"" ;
    }
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("name", "body");
        System.out.println(text);
    }
}
