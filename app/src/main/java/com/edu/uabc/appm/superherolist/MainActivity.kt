package com.edu.uabc.appm.superherolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }
        lateinit var mRecyclerView: RecyclerView //attache
        val mAdapter: RecyclerAdapter = RecyclerAdapter()//attache

        data class Superhero(
            var superhero: String,
            var publisher: String,
            var realName: String,
            var photo: String

        )

        val batman: Superhero = Superhero(
            "Batman", "DC", "Bruce Wayne",
            "https://cursokotlin.com/wp-content/uploads/2017/07/ batman.jpg"
        )
        val superBatman: Superhero = batman.copy(superhero = "SuperBatman")

        val batmanRealName = batman.realName //Recuperamos "Bruce Wayne"
        batman.realName = "Soy Batman" //Cambiamos "Brece Wayne" por "Soy Batman"
        batman.toString() //Devolverá todos los atributos con su valor

        batman.component1() //Batman
        batman.component2() //DC
        batman.component3() //Bruce Wayne
        batman.component4() //https://cursokotlin.com/wpcontent/ uploads/2017/07/batman.jpg
        /*val (superheroFav, publisherFav, realNameFav, photoFav) = batman
        superheroFav //Batman
        publisherFav //DC
        realNameFav //Bruce Wayne
        photoFav //https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg*/

        fun setUpRecyclerView() {
            mRecyclerView = findViewById(R.id.rvSuperheroList) as RecyclerView
            mRecyclerView.setHasFixedSize(true)
            mRecyclerView.layoutManager = LinearLayoutManager(this)
            mAdapter.RecyclerAdapter(getSuperheros(), this)
            mRecyclerView.adapter = mAdapter
        }

        fun getSuperheros(): MutableList<Superhero> {  //empieza metodo
            var superheros: MutableList<Superhero> = ArrayList()
            superheros.add(
                Superhero(
                    "Spiderman", "Marvel", "Peter Parker",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/ spiderman.jpg"
                )
            )
            superheros.add(
                Superhero(
                    "Daredevil", "Marvel", "Matthew Michael Murdock",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
                )
            )
            superheros.add(
                Superhero(
                    "Wolverine", "Marvel", "James Howlett",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/ logan.jpeg"
                )
            )
            superheros.add(
                Superhero(
                    "Batman", "DC", "Bruce Wayne",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
                )
            )
            superheros.add(
                Superhero(
                    "Thor", "Marvel", "Thor Odinson",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
                )
            )
            superheros.add(
                Superhero(
                    "Flash", "DC", "Jay Garrick",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
                )
            )
            superheros.add(
                Superhero(
                    "Green Lantern", "DC", "Alan Scott",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/greenlantern. jpg"
                )
            )
            superheros.add(
                Superhero(
                    "Wonder Woman", "DC", "Princess Diana",
                    "https://cursokotlin.com/wp-content/uploads/2017/07/ wonder_woman.jpg"
                )
            )

            return superheros
        }

    }



