package com.example.randotracker

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.randotracker.adapter.TrackerAdapter
import com.example.randotracker.data.Trackable
import com.example.randotracker.data.TrackableMode
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.standard_layout.*

const val COLUMNS = 7

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Trackable>()

        list.add(Trackable("bow", R.drawable.bow, arrayOf(R.drawable.silver_arrows), TrackableMode.PROGRESSIVE, false))
        list.add(Trackable("boomerang_blue", R.drawable.boomerang_blue, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("boomerang_red", R.drawable.boomerang_red,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("hookshot", R.drawable.hookshot, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("powder", R.drawable.powder,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("mushroom", R.drawable.mushroom, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))

        list.add(Trackable("firerod", R.drawable.firerod, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("icerod", R.drawable.icerod, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("bombos", R.drawable.bombos_medallion, null,TrackableMode.TOGGLE, true))
        list.add(Trackable("ether", R.drawable.ether_medallion, null,TrackableMode.TOGGLE, true))
        list.add(Trackable("quake", R.drawable.quake_medallion, null,TrackableMode.TOGGLE, true))
        list.add(Trackable("shovel", R.drawable.shovel, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))

        list.add(Trackable("lamp", R.drawable.lamp,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("hammer", R.drawable.hammer, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("flute", R.drawable.flute, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("net", R.drawable.net, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("book", R.drawable.book,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("moon_pearl", R.drawable.moon_pearl, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))

        list.add(Trackable("bottle", R.drawable.bottle, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("cane_somaria", R.drawable.cane_somaria,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("cane_byrna", R.drawable.cane_byrna,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("cape", R.drawable.cape,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("mirror", R.drawable.mirror, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("mail", R.drawable.mail_red, arrayOf(R.drawable.mail_blue),TrackableMode.PROGRESSIVE, false))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))

        list.add(Trackable("glove", R.drawable.glove, arrayOf(R.drawable.mitts),TrackableMode.PROGRESSIVE, false))
        list.add(Trackable("boots", R.drawable.boots, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("flippers", R.drawable.flippers,null, TrackableMode.TOGGLE, false))
        list.add(Trackable("half_magic", R.drawable.half_magic, null,TrackableMode.TOGGLE, false))
        list.add(Trackable("fighters_sword", R.drawable.fighters_sword, arrayOf(R.drawable.master_sword, R.drawable.tempered_sword, R.drawable.golden_sword),TrackableMode.PROGRESSIVE, false))
        list.add(Trackable("shield", R.drawable.shield, arrayOf(R.drawable.shield_red, R.drawable.shield_mirror),TrackableMode.PROGRESSIVE, false))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))

        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))
        list.add(Trackable("crystal", R.drawable.crystal,null, TrackableMode.TOGGLE, true))
        list.add(Trackable("crystal", R.drawable.crystal,null, TrackableMode.TOGGLE, true))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))
        list.add(Trackable("crystal", R.drawable.crystal, null,TrackableMode.TOGGLE, true))



        rv_tracker.layoutManager = GridLayoutManager(this, COLUMNS)
        rv_tracker.adapter = TrackerAdapter(list, this)

    }
}
