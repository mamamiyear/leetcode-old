package testset;

public abstract class TestSet {

    public static final boolean SUCESS = true;
    public static final boolean FAULT = false;

    public abstract boolean preTest();

    public abstract boolean afterTest();

    public abstract boolean testcase0();
}
