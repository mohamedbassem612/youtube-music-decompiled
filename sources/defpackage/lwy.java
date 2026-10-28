package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwy extends lwx {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public lwy(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.lxa
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.lxa
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.lxa
    public final lxa c(int i, int i2) {
        int iAo = a.ao(0, i2, b());
        return iAo == 0 ? lxa.d : new lwv(this.a, 0, iAo);
    }

    @Override // defpackage.lxa
    public final void d(lwt lwtVar) {
        lwtVar.a(this.a, 0, b());
    }

    @Override // defpackage.lxa
    protected final boolean e(lxa lxaVar) {
        boolean z = lxaVar instanceof lwy;
        if (z) {
            return Arrays.equals(this.a, ((lwy) lxaVar).a);
        }
        boolean z2 = lxaVar instanceof lwv;
        if (!z2) {
            return lxaVar.e(this);
        }
        int iB = b();
        if (iB > lxaVar.b()) {
            throw new IllegalArgumentException("Length too large: " + iB + b());
        }
        if (iB > lxaVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iB + ", " + lxaVar.b());
        }
        if (z) {
            return a.aQ(this.a, 0, ((lwy) lxaVar).a, 0, iB);
        }
        if (!z2) {
            return lxaVar.c(0, iB).equals(c(0, iB));
        }
        lwv lwvVar = (lwv) lxaVar;
        byte[] bArr = this.a;
        int i = lwv.c;
        return a.aQ(bArr, 0, lwvVar.a, lwvVar.b, iB);
    }

    @Override // defpackage.lxa
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.lxa
    protected final int g(int i, int i2) {
        byte[] bArr = lyf.a;
        return a.al(i, this.a, 0, i2);
    }
}
