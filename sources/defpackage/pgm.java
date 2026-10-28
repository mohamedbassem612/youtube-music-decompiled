package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pgm implements pgi {
    public static final /* synthetic */ int b = 0;
    public final peq a;
    private final awou c;

    static {
        agsn.h("GnpSdk");
    }

    public pgm(peq peqVar, pdr pdrVar, mbc mbcVar, awou awouVar) {
        peqVar.getClass();
        pdrVar.getClass();
        mbcVar.getClass();
        awouVar.getClass();
        this.a = peqVar;
        this.c = awouVar;
    }

    @Override // defpackage.pgi
    public final Object a(plx plxVar, Long l, aidy aidyVar, awoq awoqVar) {
        return nxf.a(this.c, awov.a, new egh(plxVar, this, aidyVar, l, (awoq) null, 7), awoqVar);
    }

    @Override // defpackage.pgi
    public final Object b(plx plxVar, aidy aidyVar, awoq awoqVar) {
        return nxf.a(this.c, awov.a, new gme(this, plxVar, aidyVar, (awoq) null, 8), awoqVar);
    }

    @Override // defpackage.pgi
    public final Object c(plx plxVar, aiff aiffVar, String str, int i, pbh pbhVar, List list, int i2, int i3, awoq awoqVar) {
        return nxf.a(this.c, awov.a, new pgl(this, plxVar, aiffVar, str, i, pbhVar, list, i2, i3, (awoq) null, 0), awoqVar);
    }
}
