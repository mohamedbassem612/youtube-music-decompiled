package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpn extends axpm {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public axpn(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.axpo
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.axpo
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.axpo
    public final axpo c(int i, int i2) {
        int iAo = a.ao(0, i2, b());
        return iAo == 0 ? axpo.d : new axpl(this.a, 0, iAo);
    }

    @Override // defpackage.axpo
    public final void d(axpk axpkVar) throws axpu {
        axpkVar.k(this.a, 0, b());
    }

    @Override // defpackage.axpo
    protected final boolean e(axpo axpoVar) {
        boolean z = axpoVar instanceof axpn;
        if (z) {
            return Arrays.equals(this.a, ((axpn) axpoVar).a);
        }
        boolean z2 = axpoVar instanceof axpl;
        if (!z2) {
            return axpoVar.e(this);
        }
        int iB = b();
        if (iB > axpoVar.b()) {
            throw new IllegalArgumentException("Length too large: " + iB + b());
        }
        if (iB > axpoVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iB + ", " + axpoVar.b());
        }
        if (z) {
            return a.aQ(this.a, 0, ((axpn) axpoVar).a, 0, iB);
        }
        if (!z2) {
            return axpoVar.c(0, iB).equals(c(0, iB));
        }
        axpl axplVar = (axpl) axpoVar;
        byte[] bArr = this.a;
        int i = axpl.c;
        return a.aQ(bArr, 0, axplVar.a, axplVar.b, iB);
    }

    @Override // defpackage.axpo
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.axpo
    protected final int g(int i, int i2) {
        byte[] bArr = axqj.a;
        return a.al(i, this.a, 0, i2);
    }
}
