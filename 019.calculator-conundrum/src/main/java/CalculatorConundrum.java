class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        try {
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            } else if (operation == "") {
                throw new IllegalArgumentException("Operation cannot be empty");
            } else if (operation != "+" && operation != "*" && operation != "/") {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }

            switch (operation) {
                case "+":
                    return String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
                case "*":
                    return String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
                case "/":

                    try {
                        int result = operand1 / operand2;
                    } catch (ArithmeticException e) {
                        throw new IllegalOperationException("Division by zero is not allowed", e);
                    }

                    return String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);

                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
