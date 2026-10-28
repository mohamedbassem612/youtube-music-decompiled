package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmc extends fgv {
    private static final String[] a = {"delegate"};
    private final BitSet d;
    private final fmd e;

    public fmc(fhd fhdVar, fmd fmdVar) {
        super(fhdVar, fmdVar);
        this.d = new BitSet(1);
        this.e = fmdVar;
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fmd a() {
        hmy.c(1, this.d, a);
        return this.e;
    }

    public final void c(fgy fgyVar) {
        this.d.set(0);
        this.e.a = fgyVar;
    }
}
