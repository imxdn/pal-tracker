package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public long getId() {
        return id;
    }

    public TimeEntry() {
    }

    public TimeEntry(final long projectId, final long userId, final LocalDate date, final int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(final long id, final long projectId, final long userId, final LocalDate date, final int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public long getProjectId() {
        return this.projectId;
    }

    public long getUserId() {
        return this.userId;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getHours() {
        return this.hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEntry timeEntry = (TimeEntry) o;

        if (id != timeEntry.id) return false;
        if (projectId != timeEntry.projectId) return false;
        if (userId != timeEntry.userId) return false;
        if (hours != timeEntry.hours) return false;
        return Objects.equals(date, timeEntry.date);
    }
}
