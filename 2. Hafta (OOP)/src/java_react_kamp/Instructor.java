package java_react_kamp;

public class Instructor {

	
	public Instructor(int instructorId, String name, String imageURL, String biography) {
		super();
		this.instructorId = instructorId;
		this.name = name;
		this.imageURL = imageURL;
		this.biography = biography;
	}
	
	int instructorId;
	public String name;
	public String imageURL;
	public String biography;
	


	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
	

}
