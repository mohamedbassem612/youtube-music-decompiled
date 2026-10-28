package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mko extends fgv {
    final mkq a;
    public final BitSet d;
    private final String[] e;

    public mko(fhd fhdVar, mkq mkqVar) {
        super(fhdVar, mkqVar);
        this.e = new String[]{"child", "gestureProtector"};
        BitSet bitSet = new BitSet(2);
        this.d = bitSet;
        this.a = mkqVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(2, this.d, this.e);
        return this.a;
    }
}
