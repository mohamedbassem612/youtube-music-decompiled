package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crf implements cra {
    public final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private aami[] f;

    public crf(boolean z, int i) {
        ahno.F(i > 0);
        this.b = z;
        this.a = i;
        this.e = 0;
        this.f = new aami[100];
    }

    @Override // defpackage.cra
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cra
    public final synchronized void b() {
        int i = this.c;
        int i2 = bwp.a;
        int i3 = this.a;
        int iMax = Math.max(0, (((i + i3) - 1) / i3) - this.d);
        int i4 = this.e;
        if (iMax >= i4) {
            return;
        }
        Arrays.fill(this.f, iMax, i4, (Object) null);
        this.e = iMax;
    }

    @Override // defpackage.cra
    public final synchronized void c(cok cokVar) {
        while (cokVar != null) {
            aami[] aamiVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            aamiVarArr[i] = cokVar.e();
            this.d--;
            cokVar = cokVar.d();
        }
    }

    @Override // defpackage.cra
    public final synchronized aami d() {
        aami aamiVar;
        this.d++;
        int i = this.e;
        if (i > 0) {
            aami[] aamiVarArr = this.f;
            int i2 = i - 1;
            this.e = i2;
            aamiVar = aamiVarArr[i2];
            aamiVar.getClass();
            aamiVarArr[i2] = null;
        } else {
            aamiVar = new aami((Object) new byte[this.a]);
            int i3 = this.d;
            aami[] aamiVarArr2 = this.f;
            int length = aamiVarArr2.length;
            if (i3 > length) {
                this.f = (aami[]) Arrays.copyOf(aamiVarArr2, length << 1);
            }
        }
        return aamiVar;
    }

    @Override // defpackage.cra
    public final synchronized void e(aami aamiVar) {
        aami[] aamiVarArr = this.f;
        int i = this.e;
        this.e = i + 1;
        aamiVarArr[i] = aamiVar;
        this.d--;
    }

    public final synchronized int f() {
        return this.d * this.a;
    }

    public final synchronized int g() {
        return this.e * this.a;
    }

    public final synchronized void h() {
        if (this.b) {
            i(0);
        }
    }

    public final synchronized void i(int i) {
        int i2 = this.c;
        this.c = i;
        if (i < i2) {
            b();
        }
    }
}
