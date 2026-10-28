package defpackage;

import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import java.io.FileInputStream;
import java.util.Locale;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zub {
    public final int a;
    public final txf b;
    public int c;
    public int d;
    public int e;
    final /* synthetic */ zud f;

    public zub(zud zudVar, int i, int i2) {
        this.f = zudVar;
        this.a = i;
        this.b = new txf(zudVar.i, i2, 65638);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[PHI: r0
      0x00e0: PHI (r0v5 aigj) = (r0v4 aigj), (r0v6 aigj) binds: [B:36:0x00d2, B:38:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    final IllegalStateException a(int i, String str) {
        aigj aigjVarZ;
        txl txlVar;
        int i2;
        txf txfVar = this.b;
        int i3 = this.a;
        txfVar.c(i, i3);
        txl txlVar2 = txfVar.c;
        int i4 = txlVar2.q;
        int i5 = i << 3;
        aigj aigjVar = null;
        if (((int) txlVar2.c(((char) i4) + i5, i4 >>> 16)) != i3) {
            int i6 = txlVar2.q;
            int iC = ((int) txlVar2.c(((char) i6) + i5, i6 >>> 16)) - i3;
            if (iC <= 0) {
                txlVar2.I(txb.I);
            } else {
                byte[] bArr = new byte[iC];
                txlVar2.t(i3 + i, bArr, iC);
                aigjVarZ = aigj.z(bArr);
                txlVar = txfVar.c;
                i2 = txfVar.a;
                if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) i)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) == 0) {
                    aigjVar = aigjVarZ;
                } else {
                    aigjVar = aigjVarZ;
                }
            }
        } else if (txlVar2.a != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(txfVar.b(i));
                try {
                    aigjVarZ = aigj.I(fileInputStream);
                    if (txlVar2.O()) {
                        int iD = aigjVarZ.d();
                        long jA = 0;
                        for (int i7 = 1; i7 <= 8; i7++) {
                            jA = (jA << 8) | ((long) (aigjVarZ.a(iD - i7) & 255));
                        }
                        aigjVarZ = aigjVarZ.e(0, iD - 8);
                        if (txl.s(aigjVarZ) != jA) {
                            txlVar2.I(txb.J);
                            fileInputStream.close();
                        }
                    }
                    fileInputStream.close();
                    txlVar = txfVar.c;
                    i2 = txfVar.a;
                    if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) i)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) == 0 && (aigjVarZ = MemoryMappedBuffer.e(aigjVarZ)) == null) {
                        txlVar.I(txb.n);
                    } else {
                        aigjVar = aigjVarZ;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e) {
                txfVar.c.I(txb.r);
                e.getMessage();
            }
        } else {
            aigjVarZ = (aigj) txfVar.a().get(i);
            if (aigjVarZ == null) {
                txfVar.c.I(txb.p);
            } else {
                txlVar = txfVar.c;
                i2 = txfVar.a;
                if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) i)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) == 0) {
                    aigjVar = aigjVarZ;
                } else {
                    aigjVar = aigjVarZ;
                }
            }
        }
        String strConcat = aigjVar == null ? String.valueOf(str).concat("\ndata is null.") : str;
        zuo zuoVar = this.f.i;
        int i8 = zuoVar.q;
        int iC2 = (int) zuoVar.c(((char) i8) + i5, i8 >>> 16);
        int i9 = zud.c;
        int iC3 = (int) zuoVar.c(((char) i9) + i5, i9 >>> 16);
        int i10 = zud.d;
        int iC4 = (int) zuoVar.c(((char) i10) + i5, i10 >>> 16);
        int i11 = zud.e;
        int iC5 = (int) zuoVar.c(i5 + ((char) i11), i11 >>> 16);
        return ugi.e(String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.US, ": dispatch(%d) size(%d) events(%d) RLEs(%d) customSize(%d) packedSize(%d)", Integer.valueOf(i), Integer.valueOf(iC2), Integer.valueOf(iC3), Integer.valueOf(iC4), Integer.valueOf(iC5), Integer.valueOf(aigjVar == null ? 0 : aigjVar.d() - iC5)))));
    }

    public final void b() {
        this.e = 0;
        this.d = 0;
        this.c = 0;
    }
}
