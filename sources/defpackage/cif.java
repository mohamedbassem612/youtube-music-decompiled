package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cif implements coo {
    public dep a;
    private final bse b;
    private long[] c;
    private boolean d;
    private boolean e;
    private int f;
    private final eol h = new eol();
    private long g = -9223372036854775807L;

    public cif(dep depVar, bse bseVar, boolean z) {
        this.b = bseVar;
        this.a = depVar;
        this.c = (long[]) depVar.b;
        g(depVar, z);
    }

    @Override // defpackage.coo
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.f;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.e) {
            ccuVar.b = this.b;
            this.e = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrF = this.h.f(((cxt[]) this.a.a)[i2]);
            decoderInputBuffer.ensureSpaceForWrite(bArrF.length);
            decoderInputBuffer.data.put(bArrF);
        }
        decoderInputBuffer.timeUs = this.c[i2];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    @Override // defpackage.coo
    public final int c(long j) {
        int iMax = Math.max(this.f, bwp.al(this.c, j, true));
        int i = iMax - this.f;
        this.f = iMax;
        return i;
    }

    public final void e(long j) {
        int iAl = bwp.al(this.c, j, true);
        this.f = iAl;
        if (!this.d || iAl != this.c.length) {
            j = -9223372036854775807L;
        }
        this.g = j;
    }

    @Override // defpackage.coo
    public final boolean f() {
        return true;
    }

    public final void g(dep depVar, boolean z) {
        int i = this.f;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.a = depVar;
        long[] jArr = (long[]) depVar.b;
        this.c = jArr;
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            e(j2);
        } else if (j != -9223372036854775807L) {
            this.f = bwp.al(jArr, j, false);
        }
    }

    @Override // defpackage.coo
    public final void gu() {
    }
}
