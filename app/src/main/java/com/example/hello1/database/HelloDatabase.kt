package com.example.hello1.database
@Database(entities = arrayOf(course::class),version )

 abstract class HelloDatabase: RoomDatabase(), version=1 {
    abstract fun courseDao():courseDao{
        companion

    }
}