package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fus extends fgv {
    public final fuv a;
    public final BitSet d;
    private final String[] e;

    public fus(fhd fhdVar, fuv fuvVar) {
        super(fhdVar, fuvVar);
        this.e = new String[]{"childComponent"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = fuvVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }
}
