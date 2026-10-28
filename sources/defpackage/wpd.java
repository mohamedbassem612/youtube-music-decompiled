package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpd {
    public final almt a;
    public ajwo b;
    public zdj c;

    public wpd(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        almt almtVar = almt.a;
        this.a = (almt) zik.cf(str, aihn.getParserForClass(almt.class));
    }

    public final byte[] a() {
        return this.a.f.G();
    }

    public wpd(almt almtVar) {
        almtVar.getClass();
        this.a = almtVar;
    }
}
