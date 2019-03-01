import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        FileManager.createFile("data/input.txt");
        FileManager.createFile("data/output.txt");
        FileManager.writeFile("data/input.txt",
                "3\n" +
                        "1 2 3\n" +
                        "5\n" +
                        "1 1 2\n" +
                        "1 1 3\n" +
                        "1 2 3\n" +
                        "0 2 1\n" +
                        "1 1 3"
        );
        String result = FileManager.readFile("data/input.txt");
        ReadData reader = new ReadData();
        /*
            System.out.println("Array size: " + reader.getArraySize(result));
            System.out.println("Number of operations: " + reader.getNumberOfOperations(result));
            Arrays.asList(reader.getInitialArray(result))
                    .forEach(System.out::println);
            Arrays.asList(reader.getOperations(result))
                    .forEach(operation -> {
                        Arrays.asList(operation)
                                .forEach(particle -> {
                                    System.out.print(particle + " ");
                                });
                        System.out.println();
                    });
        */
        OperateData task = new OperateData();
        FileManager.writeFile("data/output.txt", task.operate(reader.getArraySize(result), reader.getInitialArray(result), reader.getNumberOfOperations(result), reader.getOperations(result)));
    }
}
