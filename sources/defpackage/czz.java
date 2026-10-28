package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czz {
    public final cwj a;
    public dal d;
    public czw e;
    public int f;
    public int g;
    public int h;
    public int i;
    public bse j;
    public bse k;
    public boolean l;
    public final dak b = new dak();
    public final bwb c = new bwb();
    private final bwb m = new bwb(1);
    private final bwb n = new bwb();

    public czz(cwj cwjVar, dal dalVar, czw czwVar, bse bseVar) {
        this.a = cwjVar;
        this.d = dalVar;
        this.e = czwVar;
        this.k = bseVar;
        if (cvh.f(bseVar.q)) {
            this.j = bseVar;
        }
        d(dalVar, czwVar);
    }

    public final int a() {
        int i;
        if (this.l) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return g() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i2) {
        bwb bwbVar;
        yhk yhkVarG = g();
        if (yhkVarG == null) {
            return 0;
        }
        int i3 = yhkVarG.a;
        if (i3 != 0) {
            bwbVar = this.b.m;
        } else {
            Object obj = yhkVarG.c;
            int i4 = bwp.a;
            bwb bwbVar2 = this.n;
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            bwbVar2.N(bArr, length);
            bwbVar = bwbVar2;
            i3 = length;
        }
        dak dakVar = this.b;
        boolean zC = dakVar.c(this.f);
        boolean z = zC || i2 != 0;
        bwb bwbVar3 = this.m;
        bwbVar3.b[0] = (byte) ((true != z ? 0 : SemanticState.Focused) | i3);
        bwbVar3.P(0);
        cwj cwjVar = this.a;
        cwjVar.d(bwbVar3, 1, 1);
        cwjVar.d(bwbVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zC) {
            bwb bwbVar4 = this.c;
            bwbVar4.L(8);
            byte[] bArr2 = bwbVar4.b;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            cwjVar.d(bwbVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        bwb bwbVar5 = dakVar.m;
        int iS = bwbVar5.s();
        bwbVar5.Q(-2);
        int i6 = (iS * 6) + 2;
        if (i2 != 0) {
            bwb bwbVar6 = this.c;
            bwbVar6.L(i6);
            byte[] bArr3 = bwbVar6.b;
            bwbVar5.K(bArr3, 0, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
            bwbVar5 = bwbVar6;
        }
        cwjVar.d(bwbVar5, i6, 1);
        return i5 + i6;
    }

    public final long c() {
        return !this.l ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final void d(dal dalVar, czw czwVar) {
        this.d = dalVar;
        this.e = czwVar;
        if (this.j == null) {
            this.a.b(this.k);
        }
        e();
    }

    public final void e() {
        dak dakVar = this.b;
        dakVar.d = 0;
        dakVar.o = 0L;
        dakVar.p = false;
        dakVar.k = false;
        dakVar.n = false;
        dakVar.q = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean f() {
        this.f++;
        if (this.l) {
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
        }
        return false;
    }

    public final yhk g() {
        if (!this.l) {
            return null;
        }
        dak dakVar = this.b;
        czw czwVar = dakVar.a;
        int i = bwp.a;
        int i2 = czwVar.a;
        yhk yhkVarA = dakVar.q;
        if (yhkVarA == null) {
            yhkVarA = this.d.a.a(i2);
        }
        if (yhkVarA == null || !yhkVarA.b) {
            return null;
        }
        return yhkVarA;
    }
}
