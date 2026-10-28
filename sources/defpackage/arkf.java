package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum arkf implements aihr {
    WEB_VIEW_USE_CASE_UNSPECIFIED(0),
    WEB_VIEW_USE_CASE_SHOPPING_CART_CHECKOUT(1),
    WEB_VIEW_USE_CASE_SHOPPING_DIRECT_CHECKOUT(2),
    WEB_VIEW_USE_CASE_SHOPPING_REVIEWS(3),
    WEB_VIEW_USE_CASE_SHOPPING_ORDER_HISTORY(4),
    WEB_VIEW_USE_CASE_SHOPPING_PRODUCT_DETAILS(19),
    WEB_VIEW_USE_CASE_SHOPPING_UNIVERSAL_CART(22),
    WEB_VIEW_USE_CASE_SHOPPING_UCP_CHECKOUT(23),
    WEB_VIEW_USE_CASE_SEARCH_WEB_RESULT(5),
    WEB_VIEW_USE_CASE_SEARCH_WEATHER_RESULT(6),
    WEB_VIEW_USE_CASE_SEARCH_AIR_QUALITY_RESULT(7),
    WEB_VIEW_USE_CASE_SEARCH_MOVIE_SHOWTIMES_RESULT(8),
    WEB_VIEW_USE_CASE_SEARCH_PLACE_RESULT(9),
    WEB_VIEW_USE_CASE_SEARCH_HOTEL_RESULT(10),
    WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP(11),
    WEB_VIEW_USE_CASE_COURSE_FILES(12),
    WEB_VIEW_USE_CASE_ADS(13),
    WEB_VIEW_USE_CASE_QUESTION_AND_ANSWERS(14),
    WEB_VIEW_USE_CASE_EOM_CONSENT(15),
    WEB_VIEW_USE_CASE_MY_AD_CENTER(16),
    WEB_VIEW_USE_CASE_PLACE_UGC_IMAGE_ATTRIBUTION(17),
    WEB_VIEW_USE_CASE_IDENTITY_VERIFICATION(18),
    WEB_VIEW_USE_CASE_MODAC(20),
    WEB_VIEW_USE_CASE_GEN_LIKENESS_IDENTITY_VERIFICATION(21),
    WEB_VIEW_USE_CASE_DESCRIPTION_LINKS(24);

    public final int z;

    arkf(int i) {
        this.z = i;
    }

    public static arkf a(int i) {
        switch (i) {
            case 0:
                return WEB_VIEW_USE_CASE_UNSPECIFIED;
            case 1:
                return WEB_VIEW_USE_CASE_SHOPPING_CART_CHECKOUT;
            case 2:
                return WEB_VIEW_USE_CASE_SHOPPING_DIRECT_CHECKOUT;
            case 3:
                return WEB_VIEW_USE_CASE_SHOPPING_REVIEWS;
            case 4:
                return WEB_VIEW_USE_CASE_SHOPPING_ORDER_HISTORY;
            case 5:
                return WEB_VIEW_USE_CASE_SEARCH_WEB_RESULT;
            case 6:
                return WEB_VIEW_USE_CASE_SEARCH_WEATHER_RESULT;
            case 7:
                return WEB_VIEW_USE_CASE_SEARCH_AIR_QUALITY_RESULT;
            case 8:
                return WEB_VIEW_USE_CASE_SEARCH_MOVIE_SHOWTIMES_RESULT;
            case 9:
                return WEB_VIEW_USE_CASE_SEARCH_PLACE_RESULT;
            case 10:
                return WEB_VIEW_USE_CASE_SEARCH_HOTEL_RESULT;
            case 11:
                return WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP;
            case 12:
                return WEB_VIEW_USE_CASE_COURSE_FILES;
            case 13:
                return WEB_VIEW_USE_CASE_ADS;
            case 14:
                return WEB_VIEW_USE_CASE_QUESTION_AND_ANSWERS;
            case 15:
                return WEB_VIEW_USE_CASE_EOM_CONSENT;
            case 16:
                return WEB_VIEW_USE_CASE_MY_AD_CENTER;
            case 17:
                return WEB_VIEW_USE_CASE_PLACE_UGC_IMAGE_ATTRIBUTION;
            case 18:
                return WEB_VIEW_USE_CASE_IDENTITY_VERIFICATION;
            case 19:
                return WEB_VIEW_USE_CASE_SHOPPING_PRODUCT_DETAILS;
            case 20:
                return WEB_VIEW_USE_CASE_MODAC;
            case 21:
                return WEB_VIEW_USE_CASE_GEN_LIKENESS_IDENTITY_VERIFICATION;
            case 22:
                return WEB_VIEW_USE_CASE_SHOPPING_UNIVERSAL_CART;
            case 23:
                return WEB_VIEW_USE_CASE_SHOPPING_UCP_CHECKOUT;
            case 24:
                return WEB_VIEW_USE_CASE_DESCRIPTION_LINKS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
