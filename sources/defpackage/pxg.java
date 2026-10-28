package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxg implements pxe {
    public final Context a;
    public final pxd b;
    private final awou c;

    static {
        agsn.h("GnpSdk");
    }

    public pxg(Context context, pxd pxdVar, awou awouVar) {
        context.getClass();
        pxdVar.getClass();
        awouVar.getClass();
        this.a = context;
        this.b = pxdVar;
        this.c = awouVar;
    }

    @Override // defpackage.pxe
    public final Object a(String str, String str2, int i, int i2, awoq awoqVar) {
        return awro.p(this.c, new pxf(str2, this, str, i, i2, null), awoqVar);
    }
}
