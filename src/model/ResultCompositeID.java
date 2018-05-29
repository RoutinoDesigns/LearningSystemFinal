package model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ResultCompositeID implements java.io.Serializable {

	/*
	 * @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "studentsCode", updatable = true) private Result ResultID;
	 */
	@Column(name = "studentsCode")
	private String studentsCode;

	@Column(name = "courseCode")
	private String courseCode;

	public ResultCompositeID() {}

	public ResultCompositeID(String studentsCode, String courseCode) {
		this.studentsCode = studentsCode;
		this.courseCode = courseCode;
	}

	public String getStudentCode() {
		return this.studentsCode;
	}
	
	public String getCourseCode() {
		return this.courseCode;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultCompositeID)) return false;
        ResultCompositeID that = (ResultCompositeID) o;
        return Objects.equals(getCourseCode(), that.getCourseCode()) &&
                Objects.equals(getStudentCode(), that.getStudentCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseCode(), getStudentCode());
    }
}

