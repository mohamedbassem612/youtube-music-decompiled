package defpackage;

import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjb {
    public static final wjb a = new wjb(false);
    public static final wjb b = new wjb(true);
    public final boolean c;

    private wjb(boolean z) {
        this.c = z;
    }

    @Deprecated
    public final wja a(StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, alvw alvwVar) {
        wiv wivVar = new wiv(0);
        wiu wiuVar = wiu.c;
        wiy wiyVar = new wiy(streamingDataOuterClass$StreamingData, alvwVar);
        wiyVar.b(0L);
        wiyVar.i = wivVar;
        wiyVar.f = "";
        wiyVar.g = wiuVar;
        wiyVar.j = this.c;
        return wiyVar.a();
    }
}
