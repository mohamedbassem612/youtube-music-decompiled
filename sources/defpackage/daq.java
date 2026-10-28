package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class daq extends dax {
    private cvn a;
    private dap q;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.dax
    protected final long a(bwb bwbVar) {
        if (!d(bwbVar.b)) {
            return -1L;
        }
        int i = (bwbVar.b[2] & 255) >> 4;
        if (i == 6) {
            bwbVar.Q(4);
            bwbVar.y();
        } else if (i == 7) {
            i = 7;
            bwbVar.Q(4);
            bwbVar.y();
        }
        int i2 = bbm.i(bwbVar, i);
        bwbVar.P(0);
        return i2;
    }

    @Override // defpackage.dax
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
        }
    }

    @Override // defpackage.dax
    protected final boolean c(bwb bwbVar, long j, isw iswVar) {
        byte[] bArr = bwbVar.b;
        cvn cvnVar = this.a;
        if (cvnVar == null) {
            cvn cvnVar2 = new cvn(bArr, 17);
            this.a = cvnVar2;
            bsd bsdVar = new bsd(cvnVar2.c(Arrays.copyOfRange(bArr, 9, bwbVar.d), null));
            bsdVar.a("audio/ogg");
            iswVar.a = new bse(bsdVar);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            eol eolVarL = bbm.l(bwbVar);
            cvn cvnVarE = cvnVar.e(eolVarL);
            this.a = cvnVarE;
            this.q = new dap(cvnVarE, eolVarL);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        dap dapVar = this.q;
        if (dapVar != null) {
            dapVar.a = j;
            iswVar.b = dapVar;
        }
        iswVar.a.getClass();
        return false;
    }
}
