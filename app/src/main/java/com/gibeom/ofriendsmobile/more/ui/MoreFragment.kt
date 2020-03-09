package com.gibeom.ofriendsmobile.more.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gibeom.ofriendsmobile.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MoreFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MoreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MoreFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_more, container, false)
  }

  override fun onAttach(context: Context) {
    super.onAttach(context)
  }
}
