import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        final BankStatementAnalyser bankStatementAnalyser = new BankStatementAnalyser();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyser.analyze("csv.csv", bankStatementParser);
    }
}
