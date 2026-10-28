package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mso extends fgv {
    public final msp a;
    public final BitSet d;
    private final String[] e;

    public mso(fhd fhdVar, msp mspVar) {
        super(fhdVar, mspVar);
        this.e = new String[]{"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
        BitSet bitSet = new BitSet(7);
        this.d = bitSet;
        this.a = mspVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(7, this.d, this.e);
        return this.a;
    }
}
