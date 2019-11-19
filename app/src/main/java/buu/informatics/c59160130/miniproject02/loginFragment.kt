package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.c59160130.miniproject02.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class loginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login,container,false)
        binding.loginButton.setOnClickListener { view ->
            var status = if(username_editText.text.toString().equals("Wacharaporn") && password_editText.text.toString().equals("59160130")){
                Toast.makeText(context,"เข้าสู่ระบบสำเร็จ ยินดีต้อนรับ", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment_to_herbsHomeFragment)}
            }else{
                Toast.makeText(context,"ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง กรุณาลองอีกครั้ง", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment_self)}
            }
            view.findNavController().navigate(R.id.action_loginFragment_to_herbsHomeFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }


}