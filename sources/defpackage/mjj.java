package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mjj extends fod {
    final mjl b;
    public final BitSet c;
    private final String[] d;

    public mjj(fof fofVar, mjl mjlVar) {
        super(fofVar, mjlVar);
        this.d = new String[]{"collectionDataSource", "collectionDataSourceChangeCount", "collectionType", "commandResolver", "componentElementSubscription", "conversionContext", "dataLayerSelector", "decorator", "elementConverterFlat", "elementsErrorLogger", "elementsItemTouchHelper", "enableDdcDelayedGetElementByIndex", "enableDebugger"};
        BitSet bitSet = new BitSet(13);
        this.c = bitSet;
        this.b = mjlVar;
        bitSet.clear();
    }

    @Override // defpackage.fod
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mjl a() {
        hmy.c(13, this.c, this.d);
        return this.b;
    }
}
