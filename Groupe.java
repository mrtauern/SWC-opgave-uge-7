public class Groupe {
    private String groupeName;
    private int groupeSemester;

    public Groupe(String groupeName, int groupeSemester) {
        this.groupeName = groupeName;
        this.groupeSemester = groupeSemester;
    }

    public String getGroupeName() {
        return groupeName;
    }

    public void setGroupeName(String groupeName) {
        this.groupeName = groupeName;
    }

    public int getGroupeSemester() {
        return groupeSemester;
    }

    public void setGroupeSemester(int groupeSemester) {
        this.groupeSemester = groupeSemester;
    }
}
