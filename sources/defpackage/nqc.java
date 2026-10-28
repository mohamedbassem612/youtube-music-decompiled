package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqc extends fgv {
    public final nqf a;
    public final BitSet d;
    private final String[] e;

    public nqc(fhd fhdVar, nqf nqfVar) {
        super(fhdVar, nqfVar);
        this.e = new String[]{"image", "imageProcessorExtensionResolver", "imageSourceExtensionResolver", "imageType", "logger", "properties"};
        BitSet bitSet = new BitSet(6);
        this.d = bitSet;
        this.a = nqfVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(6, this.d, this.e);
        return this.a;
    }
}
