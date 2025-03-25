class Bill{
    String billReferenceNo;
    String billIssueDate;
    String billDueDate;
    String billAmount;
    boolean isBillOverDue;
    boolean isBillPaid;
    String serviceProvider;
    Bill(){
        System.out.println("bill no args constructor is invoked");
    }
    Bill(String billReferenceNo, String billIssueDate, String billDueDate, String billAmount, boolean  isBillOverDue, boolean isBillPaid, String serviceProvider)
    {
    this();
    this.billReferenceNo=billReferenceNo;
    this.billIssueDate=billIssueDate;
    this.billDueDate=billDueDate;
    this.billAmount=billAmount;
    this.isBillOverDue=isBillOverDue;
    this.isBillPaid=isBillPaid;
    this.serviceProvider=serviceProvider;

    System.out.println("bill 7 args executed");

}
public void fetchDetails(){
    System.out.println("bill reference no "+billReferenceNo);
    System.out.println("bill issue date "+billIssueDate);
    System.out.println("bill due date "+billDueDate );
    System.out.println("bill amount "+billAmount);
    System.out.println("bill over due "+isBillOverDue);
    System.out.println("bill payment "+isBillPaid);
    System.out.println("service privider "+serviceProvider);

}
}