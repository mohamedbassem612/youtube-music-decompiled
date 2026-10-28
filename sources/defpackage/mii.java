package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mii extends fod {
    final mij b;
    public final BitSet c;
    private final String[] d;

    public mii(fof fofVar, mij mijVar) {
        super(fofVar, mijVar);
        this.d = new String[]{"children", "collectionType", "componentElementSubscription", "conversionContext", "decorator", "elementConverterFlat"};
        BitSet bitSet = new BitSet(6);
        this.c = bitSet;
        this.b = mijVar;
        bitSet.clear();
    }

    @Override // defpackage.fod
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mij a() {
        hmy.c(6, this.c, this.d);
        return this.b;
    }
}
