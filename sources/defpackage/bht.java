package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bht extends bhv {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public bht(byte[] bArr, int i, int i2) {
        a.ao(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.bhy
    public final byte a(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.bhy
    public final int b() {
        return this.e;
    }

    @Override // defpackage.bhy
    public final bhy c(int i, int i2) {
        int iAo = a.ao(i, i2, this.e);
        return iAo == 0 ? bhy.d : new bht(this.a, this.b + i, iAo);
    }

    @Override // defpackage.bhy
    public final void d(bhr bhrVar) {
        bhrVar.a(this.a, this.b, this.e);
    }

    @Override // defpackage.bhy
    protected final boolean e(bhy bhyVar) {
        boolean z = bhyVar instanceof bhw;
        if (!z && !(bhyVar instanceof bht)) {
            return bhyVar.e(this);
        }
        int i = this.e;
        if (i > bhyVar.b()) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > bhyVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + bhyVar.b());
        }
        if (z) {
            byte[] bArr = this.a;
            int i2 = this.b;
            int i3 = bhw.b;
            return a.aQ(bArr, i2, ((bhw) bhyVar).a, 0, i);
        }
        if (bhyVar instanceof bht) {
            bht bhtVar = (bht) bhyVar;
            return a.aQ(this.a, this.b, bhtVar.a, bhtVar.b, i);
        }
        bhy bhyVarC = bhyVar.c(0, i);
        int i4 = this.b;
        return bhyVarC.equals(c(i4, i + i4));
    }

    @Override // defpackage.bhy
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, this.b, bArr, 0, i);
    }

    @Override // defpackage.bhy
    protected final int g(int i, int i2) {
        byte[] bArr = bix.a;
        return a.al(i, this.a, this.b, i2);
    }

    Object writeReplace() {
        return bhy.i(j());
    }
}
