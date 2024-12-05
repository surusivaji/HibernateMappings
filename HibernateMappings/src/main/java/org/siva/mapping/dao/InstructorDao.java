package org.siva.mapping.dao;

import java.util.List;

import org.siva.mapping.entity.Course;
import org.siva.mapping.entity.Instructor;
import org.siva.mapping.entity.Student;

public interface InstructorDao {
	boolean insertInstructor(Instructor instructor);
	Instructor selectInstructorByInstructorId(int instructorId);
	List<Course> selectCoursesByInstructorId(int instructorId);
	Instructor selectCoursesAlongWithInstructorId(int instructorId);
	List<Instructor> selectAllInstructors();
	Instructor selectInstructorInformationByYoutubeChannel(String youtubeChannel);
	boolean updateInstructorEmailByInstructorId(int instructorId, String email);
	boolean insertCoursesForInstructorByInstructorId(int instructorId, List<Course> courses);
	boolean updateCourseTitleByCourseId(int courseId, String courseTitle);
	boolean deleteCourseInstructorByInstructorId(int instructorId);
	boolean removeCourseByCourseId(int courseId);
	boolean insertCourseWithReviews(Course course);
	Course selectCourseAndReviewsByCourseId(int courseId);
	List<Course> selectAllCourses();
	boolean addCoursesWithStudent(Course course);
	Course displayStudentAndCourseByCourseId(int courseId);
	Student selectStudentByStudentId(int studentId);
	boolean insertCoursesByStudentById(Student student);
	boolean deleteCourseAndStudentByCourseId(int courseId);
	boolean deleteStudentAndCourseByStudentId(int studentId);
}
