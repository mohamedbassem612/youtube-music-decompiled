package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adcx extends fgv {
    public final adcz a;
    public final BitSet d;
    private final String[] e;

    public adcx(fhd fhdVar, adcz adczVar) {
        super(fhdVar, adczVar);
        this.e = new String[]{"children", "commandExtensionResolver", "onSwipe", "onSwipeAnimationCompleted", "onSwipeStart", "onSwipeStop"};
        BitSet bitSet = new BitSet(6);
        this.d = bitSet;
        this.a = adczVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(6, this.d, this.e);
        return this.a;
    }
}
