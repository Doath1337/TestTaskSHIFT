public class Statistics {
    public static void printFullStatistics(){
        System.out.println("Full statistics:\n");
        System.out.printf("Strings:" +
                        "\nLine count: %d" +
                        "\nShortest string length: %d" +
                        "\nLongest string length: %d\n\n",
                        StringWriter.numOfStrings,StringWriter.minLength,StringWriter.maxLength);
        System.out.printf("Integers:\n\n" +
                "Number of numbers: %d\n" +
                "Smallest integer: %d\n" +
                "Largest integer: %d\n" +
                "Sum of numbers: %d\n" +
                "The average of all numbers: %d\n\n"
                ,IntWriter.numOfInt,IntWriter.minValue,IntWriter.maxValue,IntWriter.sumInteger,IntWriter.averageValue);
        System.out.printf("Real numbers:\n\n" +
                        "Number of numbers: %d\n" +
                        "Least real number: %e\n" +
                        "Largest real number: %f\n" +
                        "Sum of numbers: %f\n" +
                        "The average of all numbers: %f\n\n"
                ,DoubleWriter.numOfDouble,DoubleWriter.minValue,DoubleWriter.maxValue,DoubleWriter.sumDouble,DoubleWriter.averageValue);
    }
    public static void printShortStatistics(){
        System.out.println("Short statistics:\n");
        System.out.printf("Number of String type elements:%d\n",StringWriter.numOfStrings);
        System.out.printf("Number of integers:%d\n",IntWriter.numOfInt);
        System.out.printf("Number of real numbers:%d\n\n",DoubleWriter.numOfDouble);
        System.out.println("\n");
    }

}
