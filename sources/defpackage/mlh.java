package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mlh extends fgv {
    final mlj a;
    public final BitSet d;
    private final String[] e;

    public mlh(fhd fhdVar, mlj mljVar) {
        super(fhdVar, mljVar);
        this.e = new String[]{"collapsedCommandFuture", "commandResolver", "conversionContext", "dataLayerSelector", "drawableRequester", "expandableTextType", "expandedCommandFuture", "logger", "styleRunExtensionConverters", "typefaceProvider"};
        BitSet bitSet = new BitSet(10);
        this.d = bitSet;
        this.a = mljVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(10, this.d, this.e);
        return this.a;
    }
}
