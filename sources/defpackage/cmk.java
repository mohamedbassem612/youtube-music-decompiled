package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cmk implements coo {
    public final coo a;
    public boolean b;
    final /* synthetic */ cml c;
    private final boolean d;

    public cmk(cml cmlVar, coo cooVar, boolean z) {
        this.c = cmlVar;
        this.a = cooVar;
        this.d = z;
    }

    @Override // defpackage.coo
    public final int a() {
        cml cmlVar = this.c;
        int iA = this.a.a();
        if (cmlVar.d != Long.MIN_VALUE) {
            iA |= 1;
        }
        return (cmlVar.c == 0 || !this.d) ? iA : (iA & (-3)) | 4;
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        cml cmlVar = this.c;
        if (cmlVar.s()) {
            return -3;
        }
        if (!cmlVar.f) {
            if (this.b) {
                decoderInputBuffer.setFlags(4);
            } else {
                long jGt = cmlVar.gt();
                int iB = this.a.b(ccuVar, decoderInputBuffer, i);
                if (cmlVar.b != -9223372036854775807L && iB != -3) {
                    cmlVar.b = -9223372036854775807L;
                }
                if (iB == -5) {
                    cml.r(ccuVar, cmlVar.c, cmlVar.d);
                } else {
                    long j = cmlVar.d;
                    if (j == Long.MIN_VALUE || ((iB != -4 || decoderInputBuffer.timeUs < j) && !(iB == -3 && jGt == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                        return iB;
                    }
                    decoderInputBuffer.clear();
                    decoderInputBuffer.setFlags(4);
                    this.b = true;
                }
            }
            return -4;
        }
        int iB2 = this.a.b(ccuVar, decoderInputBuffer, i);
        if (iB2 != -5) {
            return iB2;
        }
        cml.r(ccuVar, cmlVar.c, cmlVar.d);
        return -5;
    }

    @Override // defpackage.coo
    public final int c(long j) {
        if (this.c.s()) {
            return -3;
        }
        return this.a.c(j);
    }

    @Override // defpackage.coo
    public final boolean f() {
        return !this.c.s() && this.a.f();
    }

    @Override // defpackage.coo
    public final void gu() {
        this.a.gu();
    }
}
