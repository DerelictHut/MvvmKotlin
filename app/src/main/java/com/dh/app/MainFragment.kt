package com.dh.app

import com.dh.base.BindingFragment
import com.dh.base.utils.ResUtils
import com.dh.app.databinding.FragmentMainBinding
import com.dh.db.database.DatabaseManager
import com.dh.db.entity.EducationExperience
import com.dh.db.entity.User
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * @author wjl
 */
class MainFragment : BindingFragment<FragmentMainBinding>() {
    override fun initVariable() {
        mBinding.clContainer.setBackgroundColor(ResUtils.getColor(R.color.black))
    }

    override fun initListener() {
        mBinding.tvDbInsert.setOnClickListener {
            GlobalScope.launch {
                DatabaseManager.run {
                    db.userDao.multipleInsert(User("3", "张三").apply {
                        phoneNumber = "18888888888"
                        email = "666666@qq.com"
                    })
                    db.userDao.multipleInsert(User("4", "first"))
                    db.educationExperienceDao.multipleInsert(
                        EducationExperience(schoolName = "清华4", educationBackground = "本科"),
                        EducationExperience(schoolName = "清华5", educationBackground = "本科"),
                        EducationExperience(schoolName = "清华6", educationBackground = "本科")
                    )
                }
            }
        }
    }

    override fun layoutId(): Int = R.layout.fragment_main
}