public class CsharpProgrammer extends Human implements Programmer{
    @Override
    public void writeCde(String requirement) {
        System.out.println("CSharp writing code " + requirement);
    }

    @Override
    public String languages() {
        return "CSharp, C++";
    }

    @Override
    public void readCode() {
        System.out.println("reading CSharp code");
    }

    @Override
    public void speakEnglish() {

    }

    @Override
    public void f() {

    }
}
