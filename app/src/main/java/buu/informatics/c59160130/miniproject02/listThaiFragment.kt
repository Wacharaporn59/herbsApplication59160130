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
        return inflater.inflate(R.layout.fragment_list_thai, container, false)

        val binding = DataBindingUtil.inflate<FragmentListThaiBinding>(inflater, R.layout.fragment_list_thai, container, false)


        var arrList: ArrayList<ListData> = ArrayList()

        arrList.add(ListData("กระชาย\n" +
                "สรรพคุณ : แก้ท้องอืด ท้องเฟ้อ แน่น จุกเสียด"))

        arrList.add(ListData("ขมิ้นชัน\n" +
                "สรรพคุณ : แก้โรคผิวหนัง ผื่นคัน ขับลม"))

        arrList.add(ListData("ขี้เหล็ก\n" +
                "สรรพคุณ : เป็นยาระบาย แก้ท้องผูก "))

        arrList.add(ListData("ข่อย\n" +
                "สรรพคุณ : แก้อาการปวดฟัน รักษารำมะนาด"))

        arrList.add(ListData("คูณ\n" +
                "สรรพคุณ : แก้ท้องผูก"))

        arrList.add(ListData("ตำลึง\n" +
                "สรรพคุณ : เแก้แพ้ อักเสบจากแมลงสัตว์กัดต่อย "))

        arrList.add(ListData("บอระเพ็ด\n" +
                "สรรพคุณ : แก้ไข้ทุกชนิด แก้หวัด ทำให้เจริญอาหาร"))

        arrList.add(ListData("ผักบุ้งทะเล\n" +
                "สรรพคุณ : แก้แพ้ อักเสอบจากแมลงสัตว์กัดต่อย"))

        arrList.add(ListData("มะคำดีควาย\n" +
                "สรรพคุณ : แก้ชันนะตุ "))

        arrList.add(ListData("กระชาย\n" +
                "สรรพคุณ : แก้ท้องอืด ท้องเฟ้อ แน่น จุกเสียด"))

        binding.listView.adapter = this.context?.let { customAdapter(it,arrList) }
    }


}
