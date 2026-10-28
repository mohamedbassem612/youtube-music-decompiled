package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vls extends fgv {
    public final vlt a;
    public final BitSet d;
    private final String[] e;

    public vls(fhd fhdVar, vlt vltVar) {
        super(fhdVar, vltVar);
        this.e = new String[]{"riveData"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = vltVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }
}
