package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cov implements coo {
    public final coo a;
    final /* synthetic */ cow b;

    public cov(cow cowVar, coo cooVar) {
        this.b = cowVar;
        this.a = cooVar;
    }

    @Override // defpackage.coo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iB = this.a.b(ccuVar, decoderInputBuffer, i);
        if (iB != -4) {
            return iB;
        }
        decoderInputBuffer.timeUs += this.b.b;
        return -4;
    }

    @Override // defpackage.coo
    public final int c(long j) {
        return this.a.c(j - this.b.b);
    }

    @Override // defpackage.coo
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.coo
    public final void gu() {
        this.a.gu();
    }
}
