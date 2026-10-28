package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqe implements ppy {
    public final Context a;
    public final ppx b;
    private final awou c;

    static {
        agsn.h("GnpSdk");
    }

    public pqe(Context context, awou awouVar, ppx ppxVar, pls plsVar) {
        context.getClass();
        awouVar.getClass();
        plsVar.getClass();
        this.a = context;
        this.c = awouVar;
        this.b = ppxVar;
    }

    @Override // defpackage.ppy
    public final Object a(int i, plx plxVar, String str, awoq awoqVar) throws Throwable {
        Object objP = awro.p(this.c, new adqf(this, plxVar, i, str, (awoq) null, 1), awoqVar);
        return objP != awox.a ? awmy.a : objP;
    }

    @Override // defpackage.ppy
    public final Object b(ppw ppwVar, plx plxVar, Bundle bundle, Long l, String str, awoq awoqVar) {
        return awro.p(this.c, new pqd(ppwVar, this, plxVar, str, bundle, l, (awoq) null, 0), awoqVar);
    }
}
