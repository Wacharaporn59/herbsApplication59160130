package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.c59160130.miniproject02.databinding.FragmentListHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class listHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentListHomeBinding>(inflater, R.layout.fragment_list_home, container, false)

        var arrList01: ArrayList<ListHomeData> = ArrayList()

        arrList01.add(ListHomeData("กะเพราแดง\n" +
                "สรรพคุณ : แก้ปวดท้อง ท้องอืด แก้ลมจุดเสียด แน่นท้อง ขับลม"))

        arrList01.add(ListHomeData("ขิง\n" +
                "สรรพคุณ : บรรเทาอาการท้องอืด ขับลม แน่น จุกเสียด"))

        arrList01.add(ListHomeData("ตะไคร้\n" +
                "สรรพคุณ : ลดคอเลสเตอรอล ลดความดันโลหิตสูง ลดอาการท้องอีดท้องเฟ้อ"))

        arrList01.add(ListHomeData("ช้าพลู\n" +
                "สรรพคุณ : ทำให้เจริญอาหาร ขับลม แก้ท้องอืด"))

        arrList01.add(ListHomeData("บัวบก\n" +
                "สรรพคุณ : แก้ช้ำใน"))

        arrList01.add(ListHomeData("ฟ้าทะลายโจร\n" +
                "สรรพคุณ : บรรเทาอาการเจ็บคอ หวัดและสร้างภูมิคุ้มกันให้ร่างกาย"))

        arrList01.add(ListHomeData("มะกรูด\n" +
                "สรรพคุณ : แก้อาการหน้ามืด วิงวียน แก้ไอ ขับเสมหะ"))

        arrList01.add(ListHomeData("มะระขี้นก\n" +
                "สรรพคุณ : แก้ไข้ แก้ร้อนใน เจริญอาหาร"))

        arrList01.add(ListHomeData("ว่านหางจระเข้\n" +
                "สรรพคุณ : ช่วยรักษาแผลไฟไหม้ น้ำร้อนลวก บรรเทาอาการแสบร้อน ปกป้องแผลจากการติดเชื้อ "))

        binding.listHomeView.adapter = this.context?.let { customAdapter(it, arrList01) }

        return binding.root

    }


}
