class Seasons {

    private enum Season {WINTER, SPRING, SUMMER, AUTUMN}

    static String detectSeason(String season) {
        switch (season.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                return String.valueOf(Season.WINTER);
            case "march":
            case "april":
            case "may":
                return String.valueOf(Season.SPRING);
            case "june":
            case "july":
            case "august":
                return String.valueOf(Season.SUMMER);
            case "september":
            case "october":
            case "november":
                return String.valueOf(Season.AUTUMN);
            default:
                return "There is no such month.";
        }
    }
}
