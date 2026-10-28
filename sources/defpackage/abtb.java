package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abtb {
    final /* synthetic */ abtd a;
    private final Uri.Builder b;
    private final Set c = new HashSet();

    public abtb(abtd abtdVar, String str) {
        this.a = abtdVar;
        this.b = new Uri.Builder().scheme("http").encodedAuthority("localhost:" + abtdVar.e.getLocalPort()).path(str);
    }

    public final synchronized Uri a() {
        Uri.Builder builder;
        builder = this.b;
        return builder.appendQueryParameter("sig", this.a.d.a(builder.appendQueryParameter("sparams", TextUtils.join(",", this.c)).build())).build();
    }

    public final synchronized void b(String str, String str2) {
        Set set = this.c;
        ahno.O(!set.contains(str));
        if (str2 == null) {
            str2 = "";
        }
        this.b.appendQueryParameter(str, str2);
        set.add(str);
    }

    public final void c(String str, int i) {
        b(str, Integer.toString(i));
    }

    public final void d(String str, long j) {
        b(str, Long.toString(j));
    }
}
