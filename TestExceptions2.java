public class TestExceptions2 {
    public static void main(String[] args) {
        System.out.println("=================> GENERAL ERROR");
        try {
            doThing("specific");
            doThing("general");
        } catch (SpecificException e) {
            System.out.println(e.getMessage());
        }
        catch (GeneralException e) {
            System.out.println(e.getMessage());
        }
    }

    static void doThing(String errToThrow) throws GeneralException {
        System.out.println("doThing started running");
        if ("general".equalsIgnoreCase(errToThrow)) {
            throw new GeneralException();
        }
        if ("specific".equalsIgnoreCase(errToThrow)) {
            throw new SpecificException();
        }
        System.out.println("doThing stopped running");
    }
}

class GeneralException extends Exception {

    public GeneralException(String errMsg) {
        super(errMsg);
    }

    public GeneralException() {
        super("General Exception message");
    }
}

class SpecificException extends GeneralException {
    public SpecificException() {
        super("Specific Exception message");
    }
}
