public class Attendance {
    private String code;
    private String lectureName;
    private Student student;

    public static class AttendanceBuilder{

        private String code;
        private String lectureName;
        private Student student;


        public AttendanceBuilder setCode(String code){
            this.code = code;
            return this;
        }

        public AttendanceBuilder setLectureName(String lectureName){
            this.lectureName = lectureName;
            return this;
        }

        public AttendanceBuilder setStudent(Student student){
            this.student = student;
            return this;
        }

        public Attendance build(){
            return new Attendance(this);
        }
    }

    private Attendance(AttendanceBuilder builder){
        this.code = builder.code;
        this.lectureName = builder.lectureName;
        this.student = builder.student;
    }

    public static AttendanceBuilder create(){
        return new AttendanceBuilder();
    }
}
