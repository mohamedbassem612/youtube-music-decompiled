package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dav extends dax {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean r;

    public static boolean d(bwb bwbVar, byte[] bArr) {
        if (bwbVar.d() < 8) {
            return false;
        }
        int i = bwbVar.c;
        byte[] bArr2 = new byte[8];
        bwbVar.K(bArr2, 0, 8);
        bwbVar.P(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.dax
    protected final long a(bwb bwbVar) {
        byte[] bArr = bwbVar.b;
        return g(atz.c(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0));
    }

    @Override // defpackage.dax
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.r = false;
        }
    }

    @Override // defpackage.dax
    protected final boolean c(bwb bwbVar, long j, isw iswVar) {
        if (d(bwbVar, a)) {
            byte[] bArrCopyOf = Arrays.copyOf(bwbVar.b, bwbVar.d);
            int i = bArrCopyOf[9] & 255;
            List listD = atz.d(bArrCopyOf);
            if (iswVar.a != null) {
                return true;
            }
            bsd bsdVar = new bsd();
            bsdVar.a("audio/ogg");
            bsdVar.e("audio/opus");
            bsdVar.G = i;
            bsdVar.I = 48000;
            bsdVar.r = listD;
            iswVar.a = new bse(bsdVar);
            return true;
        }
        if (!d(bwbVar, q)) {
            iswVar.a.getClass();
            return false;
        }
        iswVar.a.getClass();
        if (this.r) {
            return true;
        }
        this.r = true;
        bwbVar.Q(8);
        bsx bsxVarA = cwk.a(agke.p((Object[]) aua.g(bwbVar, false, false).a));
        if (bsxVarA == null) {
            return true;
        }
        bse bseVar = (bse) iswVar.a;
        bsd bsdVar2 = new bsd(bseVar);
        bsdVar2.l = bsxVarA.e(bseVar.m);
        iswVar.a = new bse(bsdVar2);
        return true;
    }

    @Override // defpackage.dax
    protected final byte[] e(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(bwp.D(j, 1000000000L, 48000L, RoundingMode.CEILING)).array();
    }
}
