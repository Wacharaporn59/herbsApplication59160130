package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.c59160130.miniproject02.databinding.FragmentListThaiBinding

/**
 * A simple [Fragment] subclass.
 */
class listThaiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_list_thai, container, false)

        val binding = DataBindingUtil.inflate<FragmentListThaiBinding>(inflater, R.layout.fragment_list_thai, container, false)


        var arrList02: ArrayList<ListThaiData> = ArrayList()

        arrList02.add(ListThaiData("กระชาย\n" +
                "สรรพคุณ : แก้ท้องอืด ท้องเฟ้อ แน่น จุกเสียด"))

        arrList02.add(ListThaiData("ขมิ้นชัน\n" +
                "สรรพคุณ : แก้โรคผิวหนัง ผื่นคัน ขับลม"))

        arrList02.add(ListThaiData("ขี้เหล็ก\n" +
                "สรรพคุณ : เป็นยาระบาย แก้ท้องผูก "))

        arrList02.add(ListThaiData("ข่อย\n" +
                "สรรพคุณ : แก้อาการปวดฟัน รักษารำมะนาด"))

        arrList02.add(ListThaiData("คูณ\n" +
                "สรรพคุณ : แก้ท้องผูก"))

        arrList02.add(ListThaiData("ตำลึง\n" +
                "สรรพคุณ : เแก้แพ้ อักเสบจากแมลงสัตว์กัดต่อย "))

        arrList02.add(ListThaiData("บอระเพ็ด\n" +
                "สรรพคุณ : แก้ไข้ทุกชนิด แก้หวัด ทำให้เจริญอาหาร"))

        arrList02.add(ListThaiData("ผักบุ้งทะเล\n" +
                "สรรพคุณ : แก้แพ้ อักเสอบจากแมลงสัตว์กัดต่อย"))

        arrList02.add(ListThaiData("มะคำดีควาย\n" +
                "สรรพคุณ : แก้ชันนะตุ "))

        arrList02.add(ListThaiData("กระชาย\n" +
                "สรรพคุณ : แก้ท้องอืด ท้องเฟ้อ แน่น จุกเสียด"))

        binding.listThaiView.adapter = this.context?.let { customAdapter02(it,arrList02) }

        return binding.root
    }


}
