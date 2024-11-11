class Question {
    int quesNo;
    String ques;
    String opt1;
    String opt2;
    String opt3;
    String opt4;
    String ans;
    
    public Question(int quesNo, String ques, String opt1, String opt2, String opt3, String opt4, String ans) {
        this.quesNo = quesNo;
        this.ques = ques;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }
    public int getQuesNo() {
        return quesNo;
    }
    public void setQuesNo(int quesNo) {
        this.quesNo = quesNo;
    }
    public String getQues() {
        return ques;
    }
    public void setQues(String ques) {
        this.ques = ques;
    }
    public String getOpt1() {
        return opt1;
    }
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    public String getOpt4() {
        return opt4;
    }
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
    @Override
    public String toString() {
        return "Question [quesNo=" + quesNo + ", ques=" + ques + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", opt4=" + opt4 + ", ans=" + ans + "]";
    }
    
    
    
}
