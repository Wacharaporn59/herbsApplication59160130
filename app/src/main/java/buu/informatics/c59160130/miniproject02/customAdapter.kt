package buu.informatics.c59160130.miniproject02


import android.content.Context
import android.view.*
import android.widget.BaseAdapter
import android.widget.TextView

class customAdapter(var context: Context, var listType: ArrayList<ListData>): BaseAdapter() {
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
            view = layout.inflate(R.layout.fragment_item_home,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var ListHome:ListData = getItem(position) as ListData
        viewHolder.textName.text = ListHome.name
        return view as View

    }

    override fun getItem(position: Int): Any {
        return listType.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listType.count();
    }
}