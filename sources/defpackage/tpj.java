package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/preferences/CommonSettingsUtil");

    public static Uri a(Context context, String str, String str2) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c(str);
        qpqVar.d(str2);
        return qpqVar.a();
    }
}
