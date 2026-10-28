package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cxg extends cxf {
    private final bwb a;
    private final bwb b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public cxg(cwj cwjVar) {
        super(cwjVar);
        this.a = new bwb(bxf.a);
        this.b = new bwb(4);
    }

    @Override // defpackage.cxf
    protected final boolean a(bwb bwbVar) throws cxe {
        int iN = bwbVar.n();
        int i = iN >> 4;
        int i2 = iN & 15;
        if (i2 != 7) {
            throw new cxe(a.bR(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    @Override // defpackage.cxf
    protected final boolean b(bwb bwbVar, long j) {
        int i;
        int iN = bwbVar.n();
        bwbVar.I(3);
        byte[] bArr = bwbVar.b;
        int i2 = bwbVar.c;
        int i3 = i2 + 1;
        bwbVar.c = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        bwbVar.c = i5;
        int i6 = bArr[i3] & 255;
        bwbVar.c = i2 + 3;
        int i7 = bArr[i5] & 255;
        if (iN == 0) {
            if (this.e) {
                return false;
            }
            bwb bwbVar2 = new bwb(new byte[bwbVar.d()]);
            bwbVar.K(bwbVar2.b, 0, bwbVar.d());
            cur curVarA = cur.a(bwbVar2);
            this.c = curVarA.b;
            bsd bsdVar = new bsd();
            bsdVar.a("video/x-flv");
            bsdVar.e("video/avc");
            bsdVar.k = curVarA.l;
            bsdVar.u = curVarA.c;
            bsdVar.v = curVarA.d;
            bsdVar.B = curVarA.k;
            bsdVar.r = curVarA.a;
            this.d.b(new bse(bsdVar));
            this.e = true;
            return false;
        }
        if (iN != 1 || !this.e) {
            return false;
        }
        int i8 = this.g == 1 ? 1 : 0;
        if (this.f) {
            i = i8;
        } else {
            if (i8 == 0) {
                return false;
            }
            i = 1;
        }
        bwb bwbVar3 = this.b;
        byte[] bArr2 = bwbVar3.b;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i9 = 4 - this.c;
        int i10 = 0;
        while (bwbVar.d() > 0) {
            bwbVar.K(bwbVar3.b, i9, this.c);
            bwbVar3.P(0);
            int iQ = bwbVar3.q();
            bwb bwbVar4 = this.a;
            bwbVar4.P(0);
            cwj cwjVar = this.d;
            cwjVar.c(bwbVar4, 4);
            cwjVar.c(bwbVar, iQ);
            i10 = i10 + 4 + iQ;
        }
        this.d.e(j + (((long) (((i4 << 24) >> 8) | (i6 << 8) | i7)) * 1000), i, i10, 0, null);
        this.f = true;
        return true;
    }
}
