package buu.informatics.c59160130.miniproject02


import android.content.Context
import android.view.*
import android.widget.BaseAdapter
import android.widget.TextView

class customAdapter02(var context: Context, var listType02: ArrayList<ListThaiData>): BaseAdapter() {
    private class ViewHolder(row: View?){
        var textName: TextView


        init {
            this.textName = row?.findViewById(R.id.home_text) as TextView

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if(convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.fragment_item_thai,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var ListThai:ListThaiData = getItem(position) as ListThaiData
        viewHolder.textName.text = ListThai.Thai
        return view as View

    }

    override fun getItem(position: Int): Any {
        return listType02.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listType02.count();
    }
}