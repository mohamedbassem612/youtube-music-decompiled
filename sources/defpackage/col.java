package defpackage;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class col {
    public final cra a;
    public final int b;
    public final bwb c;
    public cok d;
    public cok e;
    public cok f;
    public long g;

    public col(cra craVar) {
        this.a = craVar;
        int iA = craVar.a();
        this.b = iA;
        this.c = new bwb(32);
        cok cokVar = new cok(0L, iA);
        this.d = cokVar;
        this.e = cokVar;
        this.f = cokVar;
    }

    public static cok f(cok cokVar, DecoderInputBuffer decoderInputBuffer, aeov aeovVar, bwb bwbVar) {
        if (decoderInputBuffer.isEncrypted()) {
            long j = aeovVar.b;
            int iS = 1;
            bwbVar.L(1);
            cok cokVarI = i(cokVar, j, bwbVar.b, 1);
            long j2 = j + 1;
            byte b = bwbVar.b[0];
            int i = b & 128;
            int i2 = b & 127;
            cak cakVar = decoderInputBuffer.cryptoInfo;
            byte[] bArr = cakVar.a;
            if (bArr == null) {
                cakVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            cokVar = i(cokVarI, j2, cakVar.a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                bwbVar.L(2);
                cokVar = i(cokVar, j3, bwbVar.b, 2);
                j3 += 2;
                iS = bwbVar.s();
            }
            int[] iArr = cakVar.d;
            if (iArr == null || iArr.length < iS) {
                iArr = new int[iS];
            }
            int[] iArr2 = cakVar.e;
            if (iArr2 == null || iArr2.length < iS) {
                iArr2 = new int[iS];
            }
            if (z) {
                int i3 = iS * 6;
                bwbVar.L(i3);
                cokVar = i(cokVar, j3, bwbVar.b, i3);
                j3 += (long) i3;
                bwbVar.P(0);
                for (int i4 = 0; i4 < iS; i4++) {
                    iArr[i4] = bwbVar.s();
                    iArr2[i4] = bwbVar.q();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aeovVar.c - ((int) (j3 - aeovVar.b));
            }
            Object obj = aeovVar.a;
            int i5 = bwp.a;
            cwi cwiVar = (cwi) obj;
            byte[] bArr2 = cwiVar.b;
            byte[] bArr3 = cakVar.a;
            int i6 = cwiVar.a;
            int i7 = cwiVar.c;
            int i8 = cwiVar.d;
            cakVar.f = iS;
            cakVar.d = iArr;
            cakVar.e = iArr2;
            cakVar.b = bArr2;
            cakVar.c = i6;
            cakVar.g = i7;
            cakVar.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = cakVar.i;
            cryptoInfo.numSubSamples = iS;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            MediaCodec.CryptoInfo.Pattern pattern = cakVar.j;
            pattern.set(i7, i8);
            cryptoInfo.setPattern(pattern);
            long j4 = aeovVar.b;
            int i9 = (int) (j3 - j4);
            aeovVar.b = j4 + ((long) i9);
            aeovVar.c -= i9;
        }
        if (!decoderInputBuffer.hasSupplementalData()) {
            decoderInputBuffer.ensureSpaceForWrite(aeovVar.c);
            return h(cokVar, aeovVar.b, decoderInputBuffer.data, aeovVar.c);
        }
        bwbVar.L(4);
        cok cokVarI2 = i(cokVar, aeovVar.b, bwbVar.b, 4);
        int iQ = bwbVar.q();
        aeovVar.b += 4;
        aeovVar.c -= 4;
        decoderInputBuffer.ensureSpaceForWrite(iQ);
        cok cokVarH = h(cokVarI2, aeovVar.b, decoderInputBuffer.data, iQ);
        aeovVar.b += (long) iQ;
        int i10 = aeovVar.c - iQ;
        aeovVar.c = i10;
        decoderInputBuffer.resetSupplementalData(i10);
        return h(cokVarH, aeovVar.b, decoderInputBuffer.supplementalData, aeovVar.c);
    }

    private static cok g(cok cokVar, long j) {
        while (j >= cokVar.b) {
            cokVar = cokVar.c;
        }
        return cokVar;
    }

    private static cok h(cok cokVar, long j, ByteBuffer byteBuffer, int i) {
        cok cokVarG = g(cokVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (cokVarG.b - j));
            byteBuffer.put((byte[]) cokVarG.d.b, cokVarG.a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == cokVarG.b) {
                cokVarG = cokVarG.c;
            }
        }
        return cokVarG;
    }

    private static cok i(cok cokVar, long j, byte[] bArr, int i) {
        cok cokVarG = g(cokVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (cokVarG.b - j));
            System.arraycopy(cokVarG.d.b, cokVarG.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == cokVarG.b) {
                cokVarG = cokVarG.c;
            }
        }
        return cokVarG;
    }

    public final int a(int i) {
        cok cokVar = this.f;
        if (cokVar.d == null) {
            aami aamiVarD = this.a.d();
            cok cokVar2 = new cok(this.f.b, this.b);
            cokVar.d = aamiVarD;
            cokVar.c = cokVar2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    public final void b(cok cokVar) {
        if (cokVar.d != null) {
            this.a.c(cokVar);
            cokVar.b();
        }
    }

    public final void c(long j) {
        cok cokVar;
        if (j != -1) {
            while (true) {
                cokVar = this.d;
                if (j < cokVar.b) {
                    break;
                }
                this.a.e(cokVar.d);
                this.d = this.d.b();
            }
            if (this.e.a < cokVar.a) {
                this.e = cokVar;
            }
        }
    }

    public final void d(long j) {
        ahno.F(j <= this.g);
        this.g = j;
        if (j != 0) {
            cok cokVar = this.d;
            if (j != cokVar.a) {
                while (this.g > cokVar.b) {
                    cokVar = cokVar.c;
                }
                cok cokVar2 = cokVar.c;
                cokVar2.getClass();
                b(cokVar2);
                cokVar.c = new cok(cokVar.b, this.b);
                this.f = this.g == cokVar.b ? cokVar.c : cokVar;
                if (this.e == cokVar2) {
                    this.e = cokVar.c;
                    return;
                }
                return;
            }
        }
        b(this.d);
        cok cokVar3 = new cok(this.g, this.b);
        this.d = cokVar3;
        this.e = cokVar3;
        this.f = cokVar3;
    }

    public final void e(int i) {
        long j = this.g + ((long) i);
        this.g = j;
        cok cokVar = this.f;
        if (j == cokVar.b) {
            this.f = cokVar.c;
        }
    }
}
