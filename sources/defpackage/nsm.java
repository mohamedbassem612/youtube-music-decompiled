package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nsm {
    public static Uri a(Uri uri) {
        String string = uri.toString();
        return Uri.parse(string.substring(0, string.lastIndexOf("_")));
    }

    public static String b(String str, String str2) {
        return str + '_' + str2;
    }
}
