import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class AppacheLogging {
    static final Logger log= LogManager.getLogger(AppacheLogging.class.getName());

    public static void main(String[] args) {
        int age=60;
        double retirementFund=10000;
        int yearsInRetirement=20;
        String name="David Johnson";

        for (int i=age;i<=65;i++){
            recalculate(retirementFund,0.1);
        }
        double monthlyPension=retirementFund/yearsInRetirement/12;

        System.out.println(name + " will have $ "+monthlyPension+" per month for retirement.");

        if (monthlyPension<100){
            log.fatal("monthlyPension is too low");
        }
        log.trace("finely detailed TRACE message");
        log.debug("detailed Debug message");
        log.info("Information message");
        log.warn("Warning message");
        log.error("error message");
        log.fatal("fatal message");
    }
    public static void recalculate(double fundAmount,  double rate){

        fundAmount=fundAmount*(1+rate);
        log.info("fundAmount = "+ fundAmount);

    }

}
