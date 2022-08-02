#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}; #end

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.promoClicks.domyat.BR
import com.promoClicks.domyat.R
import com.promoClicks.domyat.databinding.${binding_Name}
import com.promoClicks.domyat.model.${Model_Name}
import com.promoClicks.domyat.view.interfaces.${Interface_Name}
import com.promoClicks.domyat.view.activities.${Activity_Name}

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : Adapter Class
 * Date 10/7/2020 - 12:17 PM
 */
class ${Adapter_Name} (private var models: ArrayList<${Model_Name}>, private var mActivity: ${Activity_Name}) :
    RecyclerView.Adapter<${Adapter_Name}.${ViewHolder_Name}>(), ${Interface_Name} {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolder_Name} {
        val binding: ${binding_Name} = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.${Item_Name}, parent, false
        )
        return ${ViewHolder_Name}(binding)
    }

    override fun onBindViewHolder(holder: ${ViewHolder_Name}, position: Int) {
        val model = models[position]
        holder.bind(model)
        holder.itemRowBinding.${Interface_Variable} = this
    }

    override fun getItemCount(): Int {
        return if (models.size > 0) models.size else 0
    }

    override fun onClickItem(demo: ${Model_Name}) {

    }

    class ${ViewHolder_Name}(binding: ${binding_Name}) : RecyclerView.ViewHolder(binding.root) {
        var itemRowBinding: ${binding_Name} = binding
        fun bind(obj: Any?) {
            itemRowBinding.setVariable(BR.model, obj)
            itemRowBinding.executePendingBindings()
        }
    }
}