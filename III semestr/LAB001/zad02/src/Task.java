public class Task {
    private String topic;
    private String contents;
    private String priority;
    private String deadLine;


    public Task(String topic, String contents, String priority, String deadLine){
        this.topic=topic;
        this.contents=contents;
        this.priority=priority;
        this.deadLine=deadLine;
    }

    public String getTopic() {
        return topic;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String newContents) {
        this.contents = newContents;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadLine() {
        return deadLine;
    }



    @Override
    public String toString(){
        return "[ "+topic+" ] \n"+
                "[ "+contents+" ] \n"+
                "[ "+priority+" ] \n"+
                "[ "+deadLine+" ] \n";
    }

}
