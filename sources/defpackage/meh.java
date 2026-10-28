package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meh extends fgv {
    final mei a;
    public final BitSet d;
    private final String[] e;

    public meh(fhd fhdVar, mei meiVar) {
        super(fhdVar, meiVar);
        this.e = new String[]{"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};
        BitSet bitSet = new BitSet(4);
        this.d = bitSet;
        this.a = meiVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mei a() {
        hmy.c(4, this.d, this.e);
        return this.a;
    }
}
