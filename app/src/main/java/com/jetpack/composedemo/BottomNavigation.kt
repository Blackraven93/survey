package com.jetpack.composedemo

sealed class BottomNavigation(
    val title: Int, val icon: Int, val screenRoute: String
) {

    object Calendar : BottomNavItem(R.string.text_calendar, R.drawable.raven_img, CALENDAR)
    object Timeline : BottomNavItem(R.string.text_timeline, R.drawable.raven_img, TIMELINE)
    object Analysis : BottomNavItem(R.string.text_analysis, R.drawable.raven_img, ANALYSIS)
    object Settings : BottomNavItem(R.string.text_settings, R.drawable.raven_img, SETTINGS)
}
