package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adcl extends fgv {
    public final adcm a;
    public final BitSet d;
    private final String[] e;

    public adcl(fhd fhdVar, adcm adcmVar) {
        super(fhdVar, adcmVar);
        this.e = new String[]{"commandResolver", "currentProgress", "hapticFeedbackEnabled", "logger", "maxIndex"};
        BitSet bitSet = new BitSet(5);
        this.d = bitSet;
        this.a = adcmVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(5, this.d, this.e);
        return this.a;
    }
}
