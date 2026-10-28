package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jua {
    public final cwj a;
    public jue d;
    public jtz e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final juf b = new juf();
    public final bwb c = new bwb();
    private final bwb j = new bwb(1);
    private final bwb k = new bwb();

    public jua(cwj cwjVar) {
        this.a = cwjVar;
    }

    public final int a(int i, int i2) {
        bwb bwbVar;
        yhk yhkVarE = e();
        if (yhkVarE == null) {
            return 0;
        }
        int i3 = yhkVarE.a;
        if (i3 != 0) {
            bwbVar = this.b.o;
        } else {
            Object obj = yhkVarE.c;
            bwb bwbVar2 = this.k;
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            bwbVar2.N(bArr, length);
            bwbVar = bwbVar2;
            i3 = length;
        }
        juf jufVar = this.b;
        boolean zC = jufVar.c(this.f);
        boolean z = zC || i2 != 0;
        bwb bwbVar3 = this.j;
        bwbVar3.b[0] = (byte) ((true != z ? 0 : SemanticState.Focused) | i3);
        bwbVar3.P(0);
        cwj cwjVar = this.a;
        cwjVar.c(bwbVar3, 1);
        cwjVar.c(bwbVar, i3);
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
            cwjVar.c(bwbVar4, 8);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        bwb bwbVar5 = jufVar.o;
        int iS = bwbVar5.s();
        bwbVar5.Q(-2);
        int i5 = (iS * 6) + 2;
        if (i2 != 0) {
            bwb bwbVar6 = this.c;
            bwbVar6.L(i5);
            bwbVar6.K(bwbVar5.b, 0, i5);
            bwbVar5.Q(i5);
            byte[] bArr3 = bwbVar6.b;
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            bwbVar5 = bwbVar6;
        }
        cwjVar.c(bwbVar5, i5);
        return i4 + i5;
    }

    public final void b(jue jueVar, jtz jtzVar) {
        jueVar.getClass();
        this.d = jueVar;
        jtzVar.getClass();
        this.e = jtzVar;
        this.a.b(jueVar.f);
        c();
    }

    public final void c() {
        juf jufVar = this.b;
        jufVar.d = 0;
        jufVar.q = 0L;
        jufVar.m = false;
        jufVar.p = false;
        jufVar.r = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
    }

    public final boolean d() {
        this.f++;
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final yhk e() {
        juf jufVar = this.b;
        int i = jufVar.a.a;
        yhk yhkVarA = jufVar.r;
        if (yhkVarA == null) {
            yhkVarA = this.d.a(i);
        }
        if (yhkVarA == null || !yhkVarA.b) {
            return null;
        }
        return yhkVarA;
    }
}
