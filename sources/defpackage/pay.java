package defpackage;

import android.content.Context;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pay implements pav {
    public final Context a;
    public final Random b;
    public final kjc c;
    private final pls d;
    private final mbc e;
    private final pun f;
    private final pds g;
    private final pgy h;
    private final awut i;
    private final int j;

    static {
        agsn.h("GnpSdk");
    }

    public pay(Context context, pls plsVar, int i, mbc mbcVar, pun punVar, pds pdsVar, kjc kjcVar, pgy pgyVar, pxh pxhVar, Random random, awut awutVar) {
        context.getClass();
        plsVar.getClass();
        mbcVar.getClass();
        punVar.getClass();
        pdsVar.getClass();
        kjcVar.getClass();
        pgyVar.getClass();
        pxhVar.getClass();
        random.getClass();
        this.a = context;
        this.d = plsVar;
        this.j = i;
        this.e = mbcVar;
        this.f = punVar;
        this.g = pdsVar;
        this.c = kjcVar;
        this.h = pgyVar;
        this.b = random;
        this.i = awutVar;
        pxhVar.a(context);
    }

    @Override // defpackage.pav
    public final /* bridge */ /* synthetic */ paw a(ahyy ahyyVar) {
        return new pbc(this, this.e, null, ahyyVar, this.d, this.j, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.pav
    public final /* bridge */ /* synthetic */ paw b(ahzv ahzvVar) {
        return new pbc(this, this.e, ahzvVar, null, this.d, this.j, this.f, this.g, this.h, this.i);
    }
}
