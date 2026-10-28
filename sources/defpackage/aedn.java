package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aedn {
    private static final agkj a;

    static {
        agkh agkhVar = new agkh(4);
        aqlc aqlcVar = aqlc.THEME_ATTRIBUTE_BACKGROUND1;
        Integer numValueOf = Integer.valueOf(R.attr.ytBrandBackgroundSolid);
        agkhVar.e(aqlcVar, numValueOf);
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BACKGROUND2, Integer.valueOf(R.attr.ytGeneralBackgroundA));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BACKGROUND3, Integer.valueOf(R.attr.ytGeneralBackgroundB));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_SEPARATOR, Integer.valueOf(R.attr.ytSeparator));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_CHIP_BACKGROUND, Integer.valueOf(R.attr.ytChipBackground));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_TEXT1, Integer.valueOf(R.attr.ytTextPrimary));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_TEXT2, Integer.valueOf(R.attr.ytTextSecondary));
        aqlc aqlcVar2 = aqlc.THEME_ATTRIBUTE_TEXT3;
        Integer numValueOf2 = Integer.valueOf(R.attr.ytTextDisabled);
        agkhVar.e(aqlcVar2, numValueOf2);
        agkhVar.e(aqlc.THEME_ATTRIBUTE_SELECTED_NAV_TEXT, Integer.valueOf(R.attr.ytSelectedNavText));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BRAND_RED, Integer.valueOf(R.attr.ytBrandRed));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_BLUE, Integer.valueOf(R.attr.ytStaticBlue));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_BRAND_BLACK, Integer.valueOf(R.attr.ytStaticBrandBlack));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_YELLOW, Integer.valueOf(R.attr.ytStaticYellow));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_GREEN, Integer.valueOf(R.attr.ytStaticGreen));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_WHITE, Integer.valueOf(R.attr.ytStaticWhite));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_GREY, Integer.valueOf(R.attr.ytStaticGrey));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_ICON1, Integer.valueOf(R.attr.ytIcon1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_ICON2, Integer.valueOf(R.attr.ytIcon2));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_UNSELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconInactive));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_SELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconActive));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_HEADER_ICON, Integer.valueOf(R.attr.ytHeaderIcon));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BADGE_BACKGROUND1, Integer.valueOf(R.attr.ytBadgeBackground1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BADGE_BACKGROUND2, Integer.valueOf(R.attr.ytBadgeBackground2));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BADGE_TEXT1, Integer.valueOf(R.attr.ytBadgeText1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BADGE_TEXT2, Integer.valueOf(R.attr.ytBadgeText2));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1, Integer.valueOf(R.attr.ytStaticDarkBackground1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_MUTED_BACKGROUND, Integer.valueOf(R.attr.adMutedBackground));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_BLUE, Integer.valueOf(R.attr.adBlue));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_BACKGROUND1, Integer.valueOf(R.attr.adBackground1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_BACKGROUND2, Integer.valueOf(R.attr.adBackground2));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND, Integer.valueOf(R.attr.adOverlayBackground));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_TEXT1, Integer.valueOf(R.attr.adText1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_TEXT2, Integer.valueOf(R.attr.adText2));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_TEXT3, Integer.valueOf(R.attr.adText3));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_TEXT4, Integer.valueOf(R.attr.adText4));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_AD_SEPARATOR1, Integer.valueOf(R.attr.adSeparator1));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_ICON_DISABLED, Integer.valueOf(R.attr.ytIconDisabled));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_TEXT_DISABLED, numValueOf2);
        agkhVar.e(aqlc.THEME_ATTRIBUTE_ICON_INACTIVE, Integer.valueOf(R.attr.ytIconInactive));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_TEXT_PRIMARY_INVERSE, Integer.valueOf(R.attr.ytTextPrimaryInverse));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_SUGGESTED_ACTION, Integer.valueOf(R.attr.ytSuggestedAction));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_ERROR_BACKGROUND, Integer.valueOf(R.attr.ytErrorBackground));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BRAND_BACKGROUND_SOLID, numValueOf);
        agkhVar.e(aqlc.THEME_ATTRIBUTE_THEMED_BLUE, Integer.valueOf(R.attr.ytThemedBlue));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_THEMED_GREEN, Integer.valueOf(R.attr.ytThemedGreen));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM, Integer.valueOf(R.attr.ytOverlayBackgroundMedium));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM_LIGHT, Integer.valueOf(R.attr.ytOverlayBackgroundMediumLight));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_BRAND_BUTTON_BACKGROUND, Integer.valueOf(R.attr.ytRedIndicator));
        agkhVar.e(aqlc.THEME_ATTRIBUTE_INVERTED_BACKGROUND, Integer.valueOf(R.attr.ytInvertedBackground));
        a = agkhVar.d(true);
    }

    public static Optional a(Context context, aqlc aqlcVar) {
        agkj agkjVar = a;
        if (!agkjVar.containsKey(aqlcVar)) {
            return Optional.empty();
        }
        try {
            return Optional.of(Integer.valueOf(tzk.i(context, ((Integer) agkjVar.get(aqlcVar)).intValue())));
        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            return Optional.empty();
        }
    }

    public static int b(Context context, aqlc aqlcVar) {
        agkj agkjVar = a;
        if (agkjVar.containsKey(aqlcVar)) {
            return tzk.n(context, ((Integer) agkjVar.get(aqlcVar)).intValue()).orElse(0);
        }
        return 0;
    }
}
