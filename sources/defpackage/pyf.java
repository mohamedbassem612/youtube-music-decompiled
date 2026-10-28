package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pyf implements pxv {
    public static final agsn a = agsn.h("GnpSdk");
    public final pqp b;
    public final Context c;
    public final pxh d;
    public final agev e;
    public final boolean f;
    public final awmd g;
    public final omm h;
    private final awou i;

    public pyf(pqp pqpVar, awou awouVar, omm ommVar, Context context, pxh pxhVar, agev agevVar, boolean z, awmd awmdVar) {
        pqpVar.getClass();
        awouVar.getClass();
        ommVar.getClass();
        context.getClass();
        pxhVar.getClass();
        awmdVar.getClass();
        this.b = pqpVar;
        this.i = awouVar;
        this.h = ommVar;
        this.c = context;
        this.d = pxhVar;
        this.e = agevVar;
        this.f = z;
        this.g = awmdVar;
    }

    @Override // defpackage.pxv
    public final Object a(aier aierVar, String str, awoq awoqVar) {
        return awro.p(this.i, new beh(this, aierVar, str, (awoq) null, 5), awoqVar);
    }
}
