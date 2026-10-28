package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adep extends fgv {
    public final ades a;
    public final BitSet d;
    private final String[] e;

    public adep(fhd fhdVar, ades adesVar) {
        super(fhdVar, adesVar);
        this.e = new String[]{"backgroundExecutor", "clock", "commandResolver", "conversionContext", "enableDecodeImageOnBackgroundExecutor", "errorLogger", "imageCaches", "imageLatencyLoggingMetadata", "imageManager", "imagePrefetchRangeRatio", "latencyLogger", "lightweightExecutor", "uiExecutor", "useGlideForAnimatedImage", "zoomType"};
        BitSet bitSet = new BitSet(15);
        this.d = bitSet;
        this.a = adesVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(15, this.d, this.e);
        return this.a;
    }
}
