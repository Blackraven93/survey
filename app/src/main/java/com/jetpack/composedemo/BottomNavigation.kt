package com.jetpack.composedemo

sealed class BottomNavigation(
    val title: Int, val icon: Int, val screenRoute: String
) {
    object Calendar : BottomNavItem(R.string.text_calendar, R.drawable.ic_calendar, CALENDAR)
    object Timeline : BottomNavItem(R.string.text_timeline, R.drawable.ic_timeline, TIMELINE)
    object Analysis : BottomNavItem(R.string.text_analysis, R.drawable.ic_clipbord, ANALYSIS)
    object Settings : BottomNavItem(R.string.text_settings, R.drawable.ic_settings, SETTINGS)
}
