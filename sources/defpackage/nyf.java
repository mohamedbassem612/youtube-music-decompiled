package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyf extends fgv {
    public final nyh a;
    private final String[] d;
    private final BitSet e;

    public nyf(fhd fhdVar, nyh nyhVar) {
        super(fhdVar, nyhVar);
        this.d = new String[]{"componentCallable", "conversionContext"};
        BitSet bitSet = new BitSet(2);
        this.e = bitSet;
        this.a = nyhVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nyh a() {
        hmy.c(2, this.e, this.d);
        return this.a;
    }

    public final void c(Boolean bool) {
        this.a.a = bool;
    }

    public final void d(nxw nxwVar) {
        this.a.b = nxwVar;
        this.e.set(0);
    }

    public final void e(nsl nslVar) {
        this.a.c = nslVar;
        this.e.set(1);
    }
}
