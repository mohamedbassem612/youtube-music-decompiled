package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ftm extends fgv {
    final ftn a;
    private final String[] d;
    private final BitSet e;

    public ftm(fhd fhdVar, ftn ftnVar) {
        super(fhdVar, ftnVar);
        this.d = new String[]{"color"};
        BitSet bitSet = new BitSet(1);
        this.e = bitSet;
        this.a = ftnVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ftn a() {
        hmy.c(1, this.e, this.d);
        return this.a;
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m(float f) {
        this.a.a = f;
    }

    public final void d() {
        this.e.set(0);
    }
}
