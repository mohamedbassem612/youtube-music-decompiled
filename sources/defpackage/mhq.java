package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mhq extends fgv {
    final mhr a;
    public final BitSet d;
    private final String[] e;

    public mhq(fhd fhdVar, mhr mhrVar) {
        super(fhdVar, mhrVar);
        this.e = new String[]{"commandResolver", "conversionContext", "logger", "onFrameCompleteCommandFuture", "onProgressCompleteCommandFuture", "type", "typefaceProvider"};
        BitSet bitSet = new BitSet(7);
        this.d = bitSet;
        this.a = mhrVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(7, this.d, this.e);
        return this.a;
    }
}
