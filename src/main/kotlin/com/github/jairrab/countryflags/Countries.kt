package com.github.jairrab.countryflags

object Countries {
    val list by lazy {
        listOf(
            Country(CountryID.ARGENTINA, "Argentina", "\uD83C\uDDE6\uD83C\uDDF7"),
            Country(CountryID.AUSTRALIA, "Australia", "\uD83C\uDDE6\uD83C\uDDFA"),
            Country(CountryID.BRAZIL, "Brazil", "\uD83C\uDDE7\uD83C\uDDF7"),
            Country(CountryID.CAMBODIA, "Cambodia", "\uD83C\uDDF0\uD83C\uDDED"),
            Country(CountryID.CANADA, "Canada", "\uD83C\uDDE8\uD83C\uDDE6"),
            Country(CountryID.CARIBBEAN, "Caribbeans", "\uD83C\uDDE7\uD83C\uDDF8"),
            Country(CountryID.CHILE, "Chile", "\uD83C\uDDE8\uD83C\uDDF1"),
            Country(CountryID.CHINA, "China", "\uD83C\uDDE8\uD83C\uDDF3"),
            Country(CountryID.COLOMBIA, "Colombia", "\uD83C\uDDE8\uD83C\uDDF4"),
            Country(CountryID.COSTA_RICA, "Costa Rica", "\uD83C\uDDE8\uD83C\uDDF7"),
            Country(CountryID.CROATIA, "Croatia", "\uD83C\uDDED\uD83C\uDDF7"),
            Country(CountryID.CZECH, "Czech Republic", "\uD83C\uDDE8\uD83C\uDDFF"),
            Country(CountryID.ECUADOR, "Ecuador", "\uD83C\uDDEA\uD83C\uDDE8"),
            Country(CountryID.EGYPT, "Egypt", "\uD83C\uDDEA\uD83C\uDDEC"),
            Country(CountryID.ESTONIA, "Estonia", "\uD83C\uDDEA\uD83C\uDDEA"),
            Country(CountryID.FRANCE, "France", "\uD83C\uDDEB\uD83C\uDDF7"),
            Country(CountryID.GERMANY, "Germany", "\uD83C\uDDE9\uD83C\uDDEA"),
            Country(CountryID.GREECE, "Greece", "\uD83C\uDDEC\uD83C\uDDF7"),
            Country(CountryID.HUNGARY, "Hungary", "\uD83C\uDDED\uD83C\uDDFA"),
            Country(CountryID.ICELAND, "Iceland", "\uD83C\uDDEE\uD83C\uDDF8"),
            Country(CountryID.INDIA, "India", "\uD83C\uDDEE\uD83C\uDDF3"),
            Country(CountryID.INDONESIA, "Indonesia", "\uD83C\uDDEE\uD83C\uDDE9"),
            Country(CountryID.IRAN, "Iran", "\uD83C\uDDEE\uD83C\uDDF7"),
            Country(CountryID.ISRAEL, "Israel", "\uD83C\uDDEE\uD83C\uDDF1"),
            Country(CountryID.ITALY, "Italy", "\uD83C\uDDEE\uD83C\uDDF9"),
            Country(CountryID.JAPAN, "Japan", "\uD83C\uDDEF\uD83C\uDDF5"),
            Country(CountryID.JORDAN, "Jordan", "\uD83C\uDDEF\uD83C\uDDF4"),
            Country(CountryID.MALAYSIA, "Malaysia", "\uD83C\uDDF2\uD83C\uDDFE"),
            Country(CountryID.MEXICO, "Mexico", "\uD83C\uDDF2\uD83C\uDDFD"),
            Country(CountryID.MOROCCO, "Morocco", "\uD83C\uDDF2\uD83C\uDDE6"),
            Country(CountryID.NEW_ZEALAND, "New Zealand", "\uD83C\uDDF3\uD83C\uDDFF"),
            Country(CountryID.NICARAGUA, "Nicaragua", "\uD83C\uDDF3\uD83C\uDDEE"),
            Country(CountryID.PERU, "Peru", "\uD83C\uDDF5\uD83C\uDDEA"),
            Country(CountryID.PHILIPPINES, "Philippines", "\uD83C\uDDF5\uD83C\uDDED"),
            Country(CountryID.QATAR, "Qatar", "\uD83C\uDDF6\uD83C\uDDE6"),
            Country(CountryID.RUSSIA, "Russia", "\uD83C\uDDF7\uD83C\uDDFA"),
            Country(CountryID.SAUDI, "Saudi Arabia", "\uD83C\uDDF8\uD83C\uDDE6"),
            Country(CountryID.SCANDINAVIA, "Scandinavia", "\uD83C\uDDF8\uD83C\uDDEA"),
            Country(CountryID.SINGAPORE, "Singapore", "\uD83C\uDDF8\uD83C\uDDEC"),
            Country(CountryID.SOUTH_AFRICA, "South Africa", "\uD83C\uDDFF\uD83C\uDDE6"),
            Country(CountryID.SOUTH_KOREA, "South Korea", "\uD83C\uDDF0\uD83C\uDDF7"),
            Country(CountryID.SPAIN, "Spain", "\uD83C\uDDEA\uD83C\uDDF8"),
            Country(CountryID.SWITZERLAND, "Switzerland", "\uD83C\uDDE8\uD83C\uDDED"),
            Country(CountryID.TAIWAN, "Taiwan", "\uD83C\uDDF9\uD83C\uDDFC"),
            Country(CountryID.THAILAND, "Thailand", "\uD83C\uDDF9\uD83C\uDDED"),
            Country(CountryID.TURKEY, "Turkey", "\uD83C\uDDF9\uD83C\uDDF7"),
            Country(CountryID.UAE, "UAE", "\uD83C\uDDE6\uD83C\uDDEA"),
            Country(CountryID.UK, "United Kingdom", "\uD83C\uDDEC\uD83C\uDDE7"),
            Country(CountryID.USA, "USA", "\uD83C\uDDFA\uD83C\uDDF8"),
            Country(CountryID.VIETNAM, "Vietnam", "\uD83C\uDDFB\uD83C\uDDF3"),
        )
    }

    fun getFlag(countryID: CountryID): String? {
        return getCountry(countryID)?.flag
    }

    fun getCountry(countryID: CountryID): Country? {
        return list.firstOrNull { it.countryID == countryID }
    }
}