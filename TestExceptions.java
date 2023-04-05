public class TestExceptions {
    public static void main(String[] args) {
        System.out.println("Main Start:");
        try {
            doRiskyThing("false");
            doRiskyThing("true");
        } catch (Exception e) {
            e.getMessage();
        }
    }
    static void doRiskyThing(String isRisky) throws ScaryException{
        System.out.println("Start of 'doRiskyThing' method");
        if (isRisky.equalsIgnoreCase("true")) {
            System.out.println("Thorowing ScaryException: ");
            throw new ScaryException();
        }
        System.out.println("End of 'doRiskyThing' method");
    }
}

class ScaryException extends Exception {}
