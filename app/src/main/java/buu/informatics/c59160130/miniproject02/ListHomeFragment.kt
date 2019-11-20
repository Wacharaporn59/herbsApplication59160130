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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_home, container, false)

        val binding = DataBindingUtil.inflate<FragmentListHomeBinding>(inflater, R.layout.fragment_list_home, container, false)

        var arrList: ArrayList<ListData> = ArrayList()

        arrList.add(ListData("กะเพราแดง\n" +
                "สรรพคุณ : แก้ปวดท้อง ท้องอืด แก้ลมจุดเสียด แน่นท้อง ขับลม"))

        arrList.add(ListData("ขิง\n" +
                "สรรพคุณ : บรรเทาอาการท้องอืด ขับลม แน่น จุกเสียด"))

        arrList.add(ListData("ตะไคร้\n" +
                "สรรพคุณ : ลดคอเลสเตอรอล ลดความดันโลหิตสูง ลดอาการท้องอีดท้องเฟ้อ"))

        arrList.add(ListData("ช้าพลู\n" +
                "สรรพคุณ : ทำให้เจริญอาหาร ขับลม แก้ท้องอืด"))

        arrList.add(ListData("บัวบก\n" +
                "สรรพคุณ : แก้ช้ำใน"))

        arrList.add(ListData("ฟ้าทะลายโจร\n" +
                "สรรพคุณ : บรรเทาอาการเจ็บคอ หวัดและสร้างภูมิคุ้มกันให้ร่างกาย"))

        arrList.add(ListData("มะกรูด\n" +
                "สรรพคุณ : แก้อาการหน้ามืด วิงวียน แก้ไอ ขับเสมหะ"))

        arrList.add(ListData("มะระขี้นก\n" +
                "สรรพคุณ : แก้ไข้ แก้ร้อนใน เจริญอาหาร"))

        arrList.add(ListData("ว่านหางจระเข้\n" +
                "สรรพคุณ : ช่วยรักษาแผลไฟไหม้ น้ำร้อนลวก บรรเทาอาการแสบร้อน ปกป้องแผลจากการติดเชื้อ "))




        binding.listView.adapter = this.context?.let { customAdapter(it,arrList) }
    }


}
