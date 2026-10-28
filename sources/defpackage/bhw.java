package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhw extends bhv {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public bhw(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.bhy
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.bhy
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.bhy
    public final bhy c(int i, int i2) {
        int iAo = a.ao(0, i2, b());
        return iAo == 0 ? bhy.d : new bht(this.a, 0, iAo);
    }

    @Override // defpackage.bhy
    public final void d(bhr bhrVar) {
        bhrVar.a(this.a, 0, b());
    }

    @Override // defpackage.bhy
    protected final boolean e(bhy bhyVar) {
        boolean z = bhyVar instanceof bhw;
        if (z) {
            return Arrays.equals(this.a, ((bhw) bhyVar).a);
        }
        boolean z2 = bhyVar instanceof bht;
        if (!z2) {
            return bhyVar.e(this);
        }
        int iB = b();
        if (iB > bhyVar.b()) {
            throw new IllegalArgumentException("Length too large: " + iB + b());
        }
        if (iB > bhyVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iB + ", " + bhyVar.b());
        }
        if (z) {
            return a.aQ(this.a, 0, ((bhw) bhyVar).a, 0, iB);
        }
        if (!z2) {
            return bhyVar.c(0, iB).equals(c(0, iB));
        }
        bht bhtVar = (bht) bhyVar;
        byte[] bArr = this.a;
        int i = bht.c;
        return a.aQ(bArr, 0, bhtVar.a, bhtVar.b, iB);
    }

    @Override // defpackage.bhy
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.bhy
    protected final int g(int i, int i2) {
        byte[] bArr = bix.a;
        return a.al(i, this.a, 0, i2);
    }
}
