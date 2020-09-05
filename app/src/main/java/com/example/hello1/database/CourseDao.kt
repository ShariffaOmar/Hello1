package com.example.hello1.database
@Dao

interface CourseDao {
    @Insert(onConflict=onConflictStrategy.REPLACE)
    fun insertCourse(course:Course)
    @Query(value:SELECT)

}