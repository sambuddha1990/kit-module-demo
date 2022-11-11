package `in`.swiggy.feature_a

class FeatureAScreen {
    fun compute(isAdd: Boolean): Int {
        val vm = FeatureAVM()
        return if (isAdd) vm.add() else vm.mul()
    }
}