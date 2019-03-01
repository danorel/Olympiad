public class OperateData {
    public String operate(Integer arraySize, Integer initialArray[], Integer operationSize, Integer[][]operations){
        StringBuilder result = new StringBuilder();
        for(int operation = 0; operation < operations.length; operation++){
            if(operations[operation][0] == 1){
                result.append(calculateSummary(initialArray, operations[operation][1], operations[operation][2])).append("\n");
            } else {
                assignValue(initialArray, operations[operation][1], operations[operation][2]);
            }
        }
        return result.toString();
    }

    private void assignValue(Integer[] initialArray, Integer index, Integer value){
        initialArray[--index] = value;
    }

    private Integer calculateSummary(Integer[] initialArray, Integer leftBorder, Integer rightBorder){
        int summary = 0;
        leftBorder--;
        rightBorder--;
        for(int start = leftBorder, countOperation = 0; start <= rightBorder; start++, countOperation++){
            if(countOperation % 2 == 0){
                summary += initialArray[start];
            } else {
                summary -= initialArray[start];
            }
        }
        return summary;
    }
}
