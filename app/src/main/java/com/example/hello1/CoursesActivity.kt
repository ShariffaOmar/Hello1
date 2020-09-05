package com.example.hello1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.hello1.database.HelloDatabase
import kotlinx.android.synthetic.main.activity_courses.*

class CoursesActivity : AppCompatActivity() {
    lateinit var database:HelloDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        data class Courses(val course_id: Int, val course_name: String, val course_code: Int, val instructor:String, val description:String)


        class CoursesActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_courses)

                rvCourses.layoutManager = LinearLayoutManager(baseContext)
                val coursesRecyclerViewAdapter = CoursesRecyclerViewAdapter(coursesList = listOf(


                    Courses(15,"Hradware Design",111,"Barre Yassin","Fusion work"),
                    Courses(33,"Javascript",109,"Purity Maina","Language"),
                    Courses(34,"Hardware Electronics",112,"Barre Yassin","Electronics"),
                    Courses(38,"React",109,"Purity maina","Excellent"),
                    Courses(39,"Python",100,"Jmaes Mwai","Language"),
                    Courses(40,"Proffessional development",107,"Rodgers Owoko","Excellent"),
                    Courses(25,"UI/UX Design",106,"Nyandia Kamawe","Excellent"),
                    Courses(39,"Entreprenuership",105,"Kelly Murungi","Excellent"),
                    Courses(20,"HTML/CSS",104,"Jeff muthondu","Language"),
                    Courses(24,"Navigating",101,"Veronica Thaman","Life Skills")


                ))
                rvCourses.adapter=coursesRecyclerViewAdapter
            }
        }
    }
}
