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
                    db.userDao.multipleInsert(User("1", "张三").apply {
                        phoneNumber = "18888888888"
                        email = "666666@qq.com"
                        educationExperiences = mutableListOf(
                            EducationExperience(schoolName = "清华大学", educationBackground = "本科"),
                            EducationExperience(schoolName = "清华大学", educationBackground = "研究生").apply {
                                degree = "硕士学位"
                            },
                            EducationExperience(schoolName = "普林斯顿大学", educationBackground = "研究生").apply {
                                degree = "博士学位"
                            }
                        )
                    })
                    db.userDao.multipleInsert(User("2", "李四"))
                    db.userDao.multipleInsert(User("3", "王二麻子").apply {
                        educationExperiences = mutableListOf(
                            EducationExperience(schoolName = "家里蹲大学", educationBackground = "小本")
                        )
                    })
                }
            }
        }
    }

    override fun layoutId(): Int = R.layout.fragment_main
}