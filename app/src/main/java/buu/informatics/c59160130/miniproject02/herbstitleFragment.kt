package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.c59160130.miniproject02.databinding.FragmentHerbsTitleBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class herbsHomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHerbsTitleBinding>(inflater,R.layout.fragment_herbs_title,container,false)
        binding.homeHerbButton01.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_herbsHomeFragment_to_listHomeFragment)
        }
        binding.thaiHerbButton01.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_herbsHomeFragment_to_listThaiFragment)
        }






        setHasOptionsMenu(true)

        return binding.root


    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }





}
