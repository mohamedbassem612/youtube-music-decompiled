package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svy {
    private static final agsn a = agsn.j();

    public static boolean a(Context context) {
        try {
            return tzk.r(context) == 1;
        } catch (Resources.NotFoundException e) {
            ((agsj) ((agsj) ((agsj) a.c()).j(e)).k("com/google/android/libraries/youtube/commerce/red/ui/DarkThemeUtil", "isDarkTheme", 31, "DarkThemeUtil.java")).t("No ytThemeType attribute in current theme.");
            return false;
        }
    }
}
