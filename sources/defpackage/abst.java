package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abst {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;

    private abst(String str, int i, String str2, long j, long j2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public static abst a(Uri uri) {
        String queryParameter = uri.getQueryParameter("v");
        String queryParameter2 = uri.getQueryParameter("i");
        String queryParameter3 = uri.getQueryParameter("x");
        String queryParameter4 = uri.getQueryParameter("l");
        String queryParameter5 = uri.getQueryParameter("m");
        boolean zEquals = Objects.equals(uri.getQueryParameter("f"), "1");
        if (TextUtils.isEmpty(queryParameter) || queryParameter2 == null || queryParameter3 == null || queryParameter4 == null || queryParameter5 == null) {
            return null;
        }
        return new abst(queryParameter, Integer.parseInt(queryParameter2), queryParameter3, Long.parseLong(queryParameter4), Long.parseLong(queryParameter5), zEquals);
    }
}
