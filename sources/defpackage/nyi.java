package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nyi extends fgv {
    public final nyk a;
    public final BitSet d;
    private final String[] e;

    public nyi(fhd fhdVar, nyk nykVar) {
        super(fhdVar, nykVar);
        this.e = new String[]{"componentCallable", "conversionContext"};
        BitSet bitSet = new BitSet(2);
        this.d = bitSet;
        this.a = nykVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nyk a() {
        hmy.c(2, this.d, this.e);
        return this.a;
    }
}
