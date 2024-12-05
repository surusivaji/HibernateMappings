package org.siva.mapping;

import java.util.Scanner;

import org.siva.mapping.service.InstructorService;
import org.siva.mapping.service.InstructorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToManyMappingApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = SpringApplication.run(OneToManyMappingApplication.class, args);
		InstructorService service = context.getBean(InstructorServiceImpl.class);
		String welcome = "WELCOME TO MY ONLINE INSTITUTE APPLICATION";
		System.err.println("🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸");
		System.err.print("                                                                   ");
		for (int i=0; i<welcome.length(); i++) {
			System.err.print(welcome.charAt(i));
			Thread.sleep(200);
		}
		System.err.println();
		System.err.println("🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("PRESS 1 FOR ADD INSTRUCTOR ✌️✌️✌️");
			System.out.println("PRESS 2 FOR DISPLAY INSTRUCTOR BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 3 FOR DISPLAY COURSES BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 4 FOR DISPLAY COURSES ALONG WITH INSTRUCTOR NAME BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 5 FOR DISPLAY ALL INSTRUCTORS INFORMATION ✌️✌️✌️");
			System.out.println("PRESS 6 FOR DISPLAY INSTRUCTOR INFORMATION BY YOUTUBE CHANNEL ✌️✌️✌️");
			System.out.println("PRESS 7 FOR CHANGE INSTRUCTOR EMAIL BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 8 FOR ADD COURSES FOR BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 9 FOR CHANGE COURSE TITLE BY COURSE ID ✌️✌️✌️");
			System.out.println("PRESS 10 FOR REMOVE INSTRUCTOR BY INSTRUCTOR ID ✌️✌️✌️");
			System.out.println("PRESS 11 FOR REMOVE COURSE BY COURSE ID ✌️✌️✌️");
			System.out.println("PRESS 12 FOR ADD COURSE WITH REVIEWS ✌️✌️✌️");
			System.out.println("PRESS 13 FOR DISPLAY COURSE AND REVIEWS BY COURSE ID ✌️✌️✌️");
			System.out.println("PRESS 14 FOR DISPLAY ALL COURSES AND REVIEWS ✌️✌️✌️");
			System.out.println("PRESS 15 FOR ADD COURSE WITH STUDENT ✌️✌️✌️");
			System.out.println("PRESS 16 FOR DISPLAY STUDENT AND COURSE BY ID ✌️✌️✌️");
			System.out.println("PRESS 17 FOR DISPLAY STUDENT AND COURSE BY ID ✌️✌️✌️");
			System.out.println("PRESS 18 FOR ADD MORE COURES BY STUDENT ID ✌️✌️✌️");
			System.out.println("PRESS 19 FOR REMOVE COURSE AND STUDENT BY COURSE ID ✌️✌️✌️");
			System.out.println("PRESS 20 FOR REMOVE STUDENT AND COURSE BY COURSE ID ✌️✌️✌️");
			switch(scanner.nextInt()) {
			case 1: service.addInstructor(); break;		
			case 2: service.displayInstructorByInstructorId(); break;
			case 3: service.displayCoursesByInstructorId(); break;
			case 4: service.displayCoursesAlongWithInstrucorNameByInstructorId(); break;
			case 5: service.displayAllInstructorsInformation(); break;
			case 6: service.displayInstructorInformationByYoutubeChannel(); break;
			case 7: service.changeeInstructorEmailByInstructorId(); break;
			case 8: service.addCoursesForInstructorByInstructorId(); break;
			case 9: service.changeCourseTitleByCourseId(); break;
			case 10: service.removeInstructorByInstructorId(); break;
			case 11: service.removeCourseByCourseId(); break;
			case 12: service.addCourseWithReviews(); break;
			case 13: service.displayCourseAndReviewById(); break;
			case 14: service.dispalyAllCoursesAndReviews(); break;
			case 15: service.addCourseWithStudent(); break;
			case 16: service.displayCourseAndStudentByCourseId(); break;
			case 17: service.displayStudentAndCourseByStudentId(); break;
			case 18: service.addMoreCouresByStudentId(); break;
			case 19: service.removeCourseAndStudentByCourseId(); break;
			case 20: service.removeStudentAndCourseByCourseId(); break;
			default: System.err.println("👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉 INVALID OPTION  👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈");
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Do You Want Continue? say [Yes/No]");
			String option = scanner.next();
			if (option.equalsIgnoreCase("yes")) {
				continue;
			}
			else if(option.equalsIgnoreCase("no")) {
				System.err.println("🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 THANKYOU FOR USING MY APPLICATION 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏");
				break;
			}
			else {
				System.err.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎 GET LOST 👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
				break;
			}
		}
	}

}
