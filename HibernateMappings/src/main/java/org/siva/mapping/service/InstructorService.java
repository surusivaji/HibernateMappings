package org.siva.mapping.service;

public interface InstructorService {
	void addInstructor();
	void displayInstructorByInstructorId();
	void displayCoursesByInstructorId();
	void displayCoursesAlongWithInstrucorNameByInstructorId();
	void displayAllInstructorsInformation();
	void displayInstructorInformationByYoutubeChannel();
	void changeeInstructorEmailByInstructorId();
	void addCoursesForInstructorByInstructorId();
	void changeCourseTitleByCourseId();
	void removeInstructorByInstructorId();
	void removeCourseByCourseId();
	void addCourseWithReviews();
	void displayCourseAndReviewById();
	void dispalyAllCoursesAndReviews();
	void addCourseWithStudent();
	void displayCourseAndStudentByCourseId();
	void displayStudentAndCourseByStudentId();
	void addMoreCouresByStudentId();
	void removeCourseAndStudentByCourseId();
	void removeStudentAndCourseByCourseId();
}
