package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cxb extends cxf {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    @Override // defpackage.cxf
    protected final boolean a(bwb bwbVar) throws cxe {
        if (this.b) {
            bwbVar.Q(1);
        } else {
            int iN = bwbVar.n();
            int i = iN >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(iN >> 2) & 3];
                bsd bsdVar = new bsd();
                bsdVar.a("video/x-flv");
                bsdVar.e("audio/mpeg");
                bsdVar.G = 1;
                bsdVar.I = i2;
                this.d.b(new bse(bsdVar));
                this.c = true;
            } else if (i == 7 || i == 8) {
                bsd bsdVar2 = new bsd();
                bsdVar2.a("video/x-flv");
                bsdVar2.e(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                bsdVar2.G = 1;
                bsdVar2.I = 8000;
                this.d.b(new bse(bsdVar2));
                this.c = true;
            } else if (i != 10) {
                throw new cxe(a.bR(i, "Audio format not supported: "));
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.cxf
    protected final boolean b(bwb bwbVar, long j) {
        if (this.e == 2) {
            int iD = bwbVar.d();
            cwj cwjVar = this.d;
            cwjVar.c(bwbVar, iD);
            cwjVar.e(j, 1, iD, 0, null);
            return true;
        }
        int iN = bwbVar.n();
        if (iN == 0 && !this.c) {
            int iD2 = bwbVar.d();
            byte[] bArr = new byte[iD2];
            bwbVar.K(bArr, 0, iD2);
            aerm aermVarA = cun.a(bArr);
            bsd bsdVar = new bsd();
            bsdVar.a("video/x-flv");
            bsdVar.e("audio/mp4a-latm");
            bsdVar.k = (String) aermVarA.c;
            bsdVar.G = aermVarA.a;
            bsdVar.I = aermVarA.b;
            bsdVar.r = Collections.singletonList(bArr);
            this.d.b(new bse(bsdVar));
            this.c = true;
        } else if (this.e != 10 || iN == 1) {
            int iD3 = bwbVar.d();
            cwj cwjVar2 = this.d;
            cwjVar2.c(bwbVar, iD3);
            cwjVar2.e(j, 1, iD3, 0, null);
            return true;
        }
        return false;
    }
}
