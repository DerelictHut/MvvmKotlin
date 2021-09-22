package com.dh.app

import com.dh.app.databinding.FragmentMainBinding
import com.dh.base.BindingFragment
import com.dh.base.utils.ResUtils
import com.dh.db.database.DatabaseManager
import com.dh.db.entity.EducationExperience
import com.dh.db.entity.User
import com.dh.db.sealeds.DegreeSealed
import com.dh.db.sealeds.EducationBackgroundSealed
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
                            EducationExperience("清华大学", EducationBackgroundSealed.UndergraduateCourse()),
                            EducationExperience("清华大学", EducationBackgroundSealed.AGraduateStudent()).apply {
                                degree = DegreeSealed.MasterDegree()
                            },
                            EducationExperience("普林斯顿大学", EducationBackgroundSealed.AGraduateStudent()).apply {
                                degree = DegreeSealed.DrDegree()
                            }
                        )
                    })
                    db.userDao.multipleInsert(User("2", "李四"))
                    db.userDao.multipleInsert(User("3", "王二麻子").apply {
                        educationExperiences = mutableListOf(
                            EducationExperience("家里蹲大学", EducationBackgroundSealed.SmallUndergraduate())
                        )
                    })
                }
            }
        }
    }

    override fun layoutId(): Int = R.layout.fragment_main
}