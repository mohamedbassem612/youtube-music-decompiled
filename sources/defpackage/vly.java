package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vly extends fgv {
    final vmb a;
    public final BitSet d;
    private final String[] e;

    public vly(fhd fhdVar, vmb vmbVar) {
        super(fhdVar, vmbVar);
        this.e = new String[]{"fontColor", "interactionLogger", "rollToNumberText", "shouldAnimate", "typographyResolver"};
        BitSet bitSet = new BitSet(5);
        this.d = bitSet;
        this.a = vmbVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(5, this.d, this.e);
        return this.a;
    }
}
