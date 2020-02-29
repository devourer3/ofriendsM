package com.gibeom.ofriendsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.*
import com.gibeom.ofriendsmobile.utils.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private var currentNavController: LiveData<NavController>? = null

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    private lateinit var bottomNav: BottomNavigationView

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
//        val binding: ActivityMainBinding =
//            DataBindingUtil.setContentView(this, R.layout.activity_main)

//        navController = findNavController(R.id.nav_fragment)
//        findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(navController)

//        bottomNav = findViewById(R.id.bottomNav)
        //    drawerLayout = binding.drawerLayout
//        appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.homeFragment,
//                R.id.ofriendsFragment,
//                R.id.likeFragment,
//                R.id.moreFragment
//            ), null
//        )
//        setOf  -> root Destination설정(드로어의 아이콘이 백버튼 아이콘으로 변하지 않기 위함)
        // Set up ActionBar
//        setSupportActionBar(binding.mainToolbar.main_toolbar)
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        navController.setGraph(R.navigation.ofriends)


        // Set up BottomNav
//        NavigationUI.setupWithNavController(bottomNav, navController)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigationBar()
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setupBottomNavigationBar() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

//        val navGraphIds = listOf(R.navigation.ofriends, R.navigation.list, R.navigation.form)
        val navGraphIds = listOf(R.navigation.home, R.navigation.like, R.navigation.ofriends, R.navigation.more)

        // Setup the bottom navigation view with a list of navigation graphs
        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_fragment,
            intent = intent
        )

        // Whenever the selected controller changes, setup the action bar.
//        controller.observe(this, Observer { navController ->
//            setupActionBarWithNavController(navController)
//        })

        currentNavController = controller
    }


    override fun onBackPressed() {
        super.onBackPressed()
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
    }

}
