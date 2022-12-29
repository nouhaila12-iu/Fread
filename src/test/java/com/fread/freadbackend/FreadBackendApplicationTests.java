package com.fread.freadbackend;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.fread.freadbackend.model.Course;
import com.fread.freadbackend.repository.CourseRepository;

@SpringBootTest
class FreadBackendApplicationTests {


	@MockBean
	private CourseRepository courseRepository;


	/**
	 *
	 */
	@Test
	public void deleteUserTest() {
		Course course = new Course();
		course.setCourseid(1);
		course.setCoursename("Business intelligence");
		course.setCoursecode("BI");
		courseRepository.deleteById(course.getCourseid());
		verify(courseRepository, times(1)).delete(course);
	}

}

