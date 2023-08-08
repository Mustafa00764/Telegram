package adaptr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.xr.telegram.R
import model.User

class ChatAdapter(val list:ArrayList<User>):RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat,parent,false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val user = list[position]
        holder.tvName.text = user.fullname
        holder.tvMessage.text = user.message
        holder.tvTime.text = user.time
        Glide.with(holder.ivProfile).load(user.image).into(holder.ivProfile)
        if (user.isOnline){
            holder.ivOnline.visibility = View.VISIBLE
        }else{
            holder.ivOnline.visibility = View.GONE
        }
    }

    class ChatViewHolder(view:View):RecyclerView.ViewHolder(view){
        val ivProfile = view.findViewById<ImageView>(R.id.iv_profile)
        val ivOnline = view.findViewById<ImageView>(R.id.iv_online)
        val tvName = view.findViewById<TextView>(R.id.tv_fulname)
        val tvTime = view.findViewById<TextView>(R.id.tv_time)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)

    }


}

