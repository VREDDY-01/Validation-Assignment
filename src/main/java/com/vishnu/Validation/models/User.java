package com.vishnu.Validation.models;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@NotNull
	private Integer userId;

	@NotBlank
	private String username;

	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
	private String dateOfBirth;

	@Email
	private String email;

	@Size(min = 12,max = 12)
	@Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
	private String phoneNumber;

	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
	private String date;
	@Pattern(regexp = "^\\d{2}:\\d{2}:\\d{2}$")
	private String time;
}
