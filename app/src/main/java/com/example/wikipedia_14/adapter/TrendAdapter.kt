package ir.dunijet.wikipedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia_14.data.ItemPost
import com.example.wikipedia_14.databinding.ItemTrendBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class TrendAdapter(val data: List<ItemPost>) :
    RecyclerView.Adapter<TrendAdapter.TrendViewHolder>() {
    lateinit var binding: ItemTrendBinding

    inner class TrendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindViews(itemPost: ItemPost) {

            binding.txtTrendTitle.text = itemPost.txtTitle

            binding.txtTrendSubtitle.text = itemPost.txtSubtitle

            binding.txtTrendInsight.text = itemPost.insight

            binding.txtTrendNumber.text = (adapterPosition + 1).toString()

            Glide
                .with(binding.root)
                .load(itemPost.imgUrl)
                .transform(RoundedCornersTransformation(24, 8))
                .into(binding.imgTrendMain)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendViewHolder {
        binding = ItemTrendBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return TrendViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: TrendViewHolder, position: Int) {

        holder.bindViews(data[position])

    }

    override fun getItemCount(): Int {
        return data.size
    }


}