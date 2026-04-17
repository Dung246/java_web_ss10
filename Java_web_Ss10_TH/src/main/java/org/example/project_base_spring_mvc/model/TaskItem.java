package org.example.project_base_spring_mvc.model;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class TaskItem {

    private String id;

    @NotBlank(message = "Title không được để trống")
    @Size(min = 5, message = "Title phải ít nhất 5 ký tự")
    private String title;

    @NotNull(message = "Deadline không được để trống")
    @Future(message = "Deadline phải là ngày trong tương lai")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;

    @Pattern(regexp = "HIGH|MEDIUM|LOW", message = "Priority phải là HIGH, MEDIUM hoặc LOW")
    private String priority;

    public TaskItem() {}

    public TaskItem(String id, String title, LocalDate deadline, String priority) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
}
