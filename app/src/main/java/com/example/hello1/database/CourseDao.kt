package com.example.hello1.database

import com.example.hello1.Course

@Dao

interface CourseDao {
    @Insert(onConflict=onConflictStrategy.REPLACE)
    fun insertCourse(course: Course)
    @Query(value:SELECT * FROM courses)

}