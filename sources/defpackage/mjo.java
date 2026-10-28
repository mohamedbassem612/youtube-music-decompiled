package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjo extends fgv {
    final mjq a;
    public final BitSet d;
    private final String[] e;

    public mjo(fhd fhdVar, mjq mjqVar) {
        super(fhdVar, mjqVar);
        this.e = new String[]{"child", "directUpdateProcessorWrapper", "enableCheckDirectUpdateStateDisposed"};
        BitSet bitSet = new BitSet(3);
        this.d = bitSet;
        this.a = mjqVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(3, this.d, this.e);
        return this.a;
    }
}
