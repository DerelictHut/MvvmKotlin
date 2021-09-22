package com.dh.db.sealeds

/**
 * @author wjl
 */
sealed class EducationBackgroundSealed(val level: Int) {
    class SmallUndergraduate : EducationBackgroundSealed(0)
    class JuniorHighSchool : EducationBackgroundSealed(1)
    class HighSchool : EducationBackgroundSealed(2)
    class UndergraduateCourse : EducationBackgroundSealed(3)
    class AGraduateStudent : EducationBackgroundSealed(4)

    companion object {
        fun getEbsByLevel(level: Int): EducationBackgroundSealed =
            when(level) {
                0 -> SmallUndergraduate()
                1 -> JuniorHighSchool()
                2 -> HighSchool()
                3 -> UndergraduateCourse()
                4 -> AGraduateStudent()
                else -> throw IllegalArgumentException("学历参数异常!!!!!!!!!")
            }
    }
}

sealed class DegreeSealed(val level: Int) {
    class BachelorDegree : DegreeSealed(0)
    class MasterDegree : DegreeSealed(1)
    class DrDegree : DegreeSealed(2)

    companion object {
        fun getDsByLevel(level: Int): DegreeSealed =
            when(level) {
                0 -> BachelorDegree()
                1 -> MasterDegree()
                2 -> DrDegree()
                else -> throw IllegalArgumentException("学位参数异常!!!!!!!!!")
            }
    }
}
