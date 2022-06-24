package com.javaweb.webapp.dto;

import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

	
	@NotBlank(message = "Tên bị null hoặc để trống")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Tên không được chứa kí tự đặc biệt hoặc chữ số")
    @Length(min = 3, max = 200, message = "Tên phải từ 3 đến 200 kí tự!")
    private String name;

	@NotNull(message = "Tuổi là bắt buộc")
    @Min(value = 0, message = "Tuổi không được bé hơn 0!")
    @Max(value = 200, message = "Tuổi không được lớn hơn 200!")
    private Integer age;

    @DecimalMin(value = "0.0", inclusive = false, message = "Chiều cao phải là số dương!")
    @DecimalMax(value = "300.5", inclusive = true, message = "Chiều cao không được cao quá 300.5 cm!")
    @Digits(integer = 3, fraction = 2
            , message = "Chiều cao không khớp định dạng tối đa 3 số phần nguyên và 2 số phần thập phân!")
    private Double height;

    @NotEmpty(message = "Sở thích là bắt buộc")
    @Size(min = 1, max = 100, message = "Phải có ít nhất 2 sở thích!")
    private List<String> hobbies;
}
