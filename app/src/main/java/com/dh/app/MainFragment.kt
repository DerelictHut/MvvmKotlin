package com.dh.app

import com.blankj.utilcode.util.GsonUtils
import com.blankj.utilcode.util.LogUtils
import com.dh.app.databinding.FragmentMainBinding
import com.dh.base.BindingFragment
import com.dh.base.utils.ResUtils
import com.dh.db.database.DatabaseManager
import com.dh.db.entity.bean.EducationExperience
import com.dh.db.entity.db.Email
import com.dh.db.entity.db.User
import com.dh.db.entity.sealeds.DegreeSealed
import com.dh.db.entity.sealeds.EducationBackgroundSealed
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
                        id = 271
                        phoneNumber = "18888888888"
                        birthday = "2000-1-1"
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
                    db.userDao.multipleInsert(User("5", "王二麻子").apply {
                        educationExperiences = mutableListOf(
                            EducationExperience("家里蹲大学", EducationBackgroundSealed.SmallUndergraduate())
                        )
                    })
                    db.emailDao.multipleInsert(
                        Email("888888@qq.com", "1"),
                        Email("666666@163.com", "2"),
                        Email("666666@gmail.com", "2"))
                }
            }
        }
        mBinding.tvDbQueryEmail.setOnClickListener {
            GlobalScope.launch {
                DatabaseManager.run {
                    LogUtils.d(GsonUtils.toJson(db.userDao.getUserEmailList()))
                    LogUtils.d("------------------------------------------------------")
                    LogUtils.d(GsonUtils.toJson(db.userDao.getUserEmailNameList()))
                }
            }
        }
    }

    override fun layoutId(): Int = R.layout.fragment_main
}