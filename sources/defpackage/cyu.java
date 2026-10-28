package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyu extends cys {
    public final long a;
    public final long b;

    public cyu(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.cys
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.a + ", programSplicePlaybackPositionUs= " + this.b + " }";
    }
}
