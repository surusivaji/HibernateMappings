package org.siva.mapping.dao;

import java.util.List;

import org.siva.mapping.entity.Course;
import org.siva.mapping.entity.Instructor;
import org.siva.mapping.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class InstructorDaoImpl implements InstructorDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public boolean insertInstructor(Instructor instructor) {
		try {
			entityManager.persist(instructor);
			return true;
		}
		catch (Exception e) {			
			return false;
		}
	}
	
	@Override
	public Instructor selectInstructorByInstructorId(int instructorId) {
		try {
			Instructor instructor = entityManager.find(Instructor.class, instructorId);
			if (instructor!=null) {
				return instructor;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Course> selectCoursesByInstructorId(int instructorId) {
	    try {
	        Instructor instructor = entityManager.find(Instructor.class, instructorId);
	        if (instructor != null) {
	            String query = "SELECT course FROM Course course WHERE course.instructor = :instructor";
	            TypedQuery<Course> typedQuery = entityManager.createQuery(query, Course.class);
	            typedQuery.setParameter("instructor", instructor);
	            return typedQuery.getResultList();
	        } else {
	            return null;
	        }
	    } catch (Exception e) {
	        return null;
	    }
	}
	
	@Override
	public Instructor selectCoursesAlongWithInstructorId(int instructorId) {
		try {
			Instructor instructor = entityManager.find(Instructor.class, instructorId);
			if (instructor!=null) {
				return instructor;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Instructor> selectAllInstructors() {
		try {
			String selectAllInstructors = "select instructor from Instructor instructor";
			TypedQuery<Instructor> typedQuery = entityManager.createQuery(selectAllInstructors, Instructor.class);
			List<Instructor> instructors = typedQuery.getResultList();
			return instructors;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public Instructor selectInstructorInformationByYoutubeChannel(String youtubeChannel) {
		try {
			String findInstructor = "select instructor from Instructor instructor where instructor.id in (select instructorDetail.id from InstructorDetail instructorDetail where instructorDetail.youtubeChannel=:youtubeChannel)";
			TypedQuery<Instructor> typedQuery = entityManager.createQuery(findInstructor, Instructor.class);
			typedQuery.setParameter("youtubeChannel", youtubeChannel);
			Instructor instructor = typedQuery.getSingleResult();
			if (instructor!=null) {
				return instructor;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	@Transactional
	public boolean updateInstructorEmailByInstructorId(int instructorId, String email) {
		try {
			Instructor instructor = entityManager.find(Instructor.class, instructorId);
			if (instructor!=null) {
				instructor.setEmail(email);
				entityManager.merge(instructor);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean insertCoursesForInstructorByInstructorId(int instructorId, List<Course> courses) {
		try {
			Instructor instructor = entityManager.find(Instructor.class, instructorId);
			if (instructor!=null) {
				instructor.setCourses(courses);
				entityManager.merge(instructor);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean updateCourseTitleByCourseId(int courseId, String courseTitle) {
		try {
			Course course = entityManager.find(Course.class, courseId);
			if (course!=null) {
				course.setCourseTitle(courseTitle);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean deleteCourseInstructorByInstructorId(int instructorId) {
		try {
			Instructor instructor = entityManager.find(Instructor.class, instructorId);
			if (instructor!=null) {
				List<Course> courses = instructor.getCourses();
				for (Course course : courses) {
					course.setInstructor(null);
				}
				entityManager.remove(instructor);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean removeCourseByCourseId(int courseId) {
		try {
			Course course = entityManager.find(Course.class, courseId);
			if (course!=null) {
				entityManager.remove(course);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean insertCourseWithReviews(Course course) {
		try {
			entityManager.persist(course);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public Course selectCourseAndReviewsByCourseId(int courseId) {
		try {
			Course course = entityManager.find(Course.class, courseId);
			if (course!=null) {
				return course;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Course> selectAllCourses() {
		try {
			String selectAllCourses = "select course from Course course";
			TypedQuery<Course> query = entityManager.createQuery(selectAllCourses, Course.class);
			List<Course> list = query.getResultList();
			return list;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	@Transactional
	public boolean addCoursesWithStudent(Course course) {
		try {
			entityManager.persist(course);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public Course displayStudentAndCourseByCourseId(int courseId) {
		try {
			String query = "select c from Course c JOIN FETCH c.students where c.id=:data";
			TypedQuery<Course> typedQuery = entityManager.createQuery(query, Course.class);
			typedQuery.setParameter("data", courseId);
			Course course = typedQuery.getSingleResult();
			if (course!=null) {
				return course;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public Student selectStudentByStudentId(int studentId) {
		try {
			String fetchStudentByStudentId = "select student from Student student JOIN FETCH student.courses where student.id=:id";
			TypedQuery<Student> typedQuery = entityManager.createQuery(fetchStudentByStudentId, Student.class);
			typedQuery.setParameter("id", studentId);
			Student student = typedQuery.getSingleResult();
			if (student!=null) {
				return student;
			}
			else {
				return null;
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	@Transactional
	public boolean insertCoursesByStudentById(Student student) {
		try {
			entityManager.merge(student);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean deleteCourseAndStudentByCourseId(int courseId) {
		try {
			Course course = entityManager.find(Course.class, courseId);
			if (course!=null) {
				entityManager.remove(course);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean deleteStudentAndCourseByStudentId(int studentId) {
		try {
			Student student = entityManager.find(Student.class, studentId);
			if (student!=null) {
				entityManager.remove(student);
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}



}
