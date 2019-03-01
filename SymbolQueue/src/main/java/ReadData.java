import java.util.Arrays;
import java.util.List;

public class ReadData {
    private static final int SIZE = 0;
    private static final int INIT_DATA = 1;
    private static final int OPERATIONS = 2;
    private static final int DATA = 3;

    public Integer getArraySize(String content){
        if(validateContent(content)){
            List<String> tokens = Arrays.asList(content.split("\n"));
            return validateArraySize(Integer.valueOf(tokens.get(SIZE)));
        } else {
            return 0;
        }
    }

    private Integer validateArraySize(Integer value){
        return value <= 10e5 ? value : 0;
    }

    public Integer[] getInitialArray(String content){
        if(validateContent(content)){
            List<String> tokens = Arrays.asList(content.split("\n"));
            String []numbers = tokens.get(INIT_DATA).split("[ ]");
            Integer []Array = new Integer[numbers.length];
            for(int index = 0; index < Array.length; index++){
                Array[index] = validateArrayValue(Integer.valueOf(numbers[index]));
            }
            return Array;
        } else {
            return new Integer[]{};
        }
    }

    private Integer validateArrayValue(Integer value){
        return value < 10e4 ? value : 0;
    }

    public Integer getNumberOfOperations(String content){
        if(validateContent(content)){
            List<String> tokens = Arrays.asList(content.split("\n"));
            return validateNumberOfOperations(Integer.valueOf(tokens.get(OPERATIONS)));
        } else {
            return 0;
        }
    }

    private Integer validateNumberOfOperations(Integer operations){
        return operations <= 10e5 && operations >= 1 ? operations : 0;
    }

    public Integer[][] getOperations(String content){
        int notNullRows = countNotNullRows(content);
        Integer[][] operations = new Integer[notNullRows - 3][3];
        if(validateContent(content)){
            List<String> tokens = Arrays.asList(content.split("\n"));
            for(int dataIndex = DATA, operationIndex = 0; dataIndex < notNullRows; dataIndex++, operationIndex++){
               String[] subtokens = tokens.get(dataIndex).split("[ ]");
               operations[operationIndex][0] = validateOperation(Integer.valueOf(subtokens[0]));
               if(operations[operationIndex][0] == 0){
                   operations[operationIndex][1] = validateIndex(Integer.valueOf(subtokens[1]), content);
                   operations[operationIndex][2] = validateArrayValue(Integer.valueOf(subtokens[2]));
               } else {
                   operations[operationIndex][1] = validateLeftBorder(Integer.valueOf(subtokens[1]), tokens.get(dataIndex));
                   operations[operationIndex][2] = validateRightBorder(Integer.valueOf(subtokens[2]), content, tokens.get(dataIndex));
               }
            }
        }
        return operations;
    }

    private Integer validateOperation(Integer operation){
        return operation == 0 || operation == 1 ? operation : 0;
    }

    private Integer validateIndex(Integer index, String content){
        String []tokens = content.split("\n");
        return (index < Integer.valueOf(tokens[0])) ? index : 0;
    }


    private Integer validateLeftBorder(Integer left, String line){
        String []tokens = line.split(" ");
        return (left <= Integer.valueOf(tokens[2])) ? left : 0;
    }

    private Integer validateRightBorder(Integer right, String content, String line){
        String []tokens = line.split(" ");
        return (right >= Integer.valueOf(tokens[1]) && validateIndex(right, content).equals(right)) ? right : getArrayLength(content);
    }

    private Integer getArrayLength(String content){
        return Integer.valueOf(content.split("[\n]")[0]);
    }

    private Integer countNotNullRows(String content){
        return content.split("\n").length;
    }

    private boolean validateContent(String content){
        return content.length() != 0 && content.contains("\n");
    }
}
