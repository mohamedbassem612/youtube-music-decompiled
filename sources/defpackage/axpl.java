package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axpl extends axpm {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public axpl(byte[] bArr, int i, int i2) {
        a.ao(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.axpo
    public final byte a(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.axpo
    public final int b() {
        return this.e;
    }

    @Override // defpackage.axpo
    public final axpo c(int i, int i2) {
        int iAo = a.ao(i, i2, this.e);
        return iAo == 0 ? axpo.d : new axpl(this.a, this.b + i, iAo);
    }

    @Override // defpackage.axpo
    public final void d(axpk axpkVar) throws axpu {
        axpkVar.k(this.a, this.b, this.e);
    }

    @Override // defpackage.axpo
    protected final boolean e(axpo axpoVar) {
        boolean z = axpoVar instanceof axpn;
        if (!z && !(axpoVar instanceof axpl)) {
            return axpoVar.e(this);
        }
        int i = this.e;
        if (i > axpoVar.b()) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > axpoVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + axpoVar.b());
        }
        if (z) {
            byte[] bArr = this.a;
            int i2 = this.b;
            int i3 = axpn.b;
            return a.aQ(bArr, i2, ((axpn) axpoVar).a, 0, i);
        }
        if (axpoVar instanceof axpl) {
            axpl axplVar = (axpl) axpoVar;
            return a.aQ(this.a, this.b, axplVar.a, axplVar.b, i);
        }
        axpo axpoVarC = axpoVar.c(0, i);
        int i4 = this.b;
        return axpoVarC.equals(c(i4, i + i4));
    }

    @Override // defpackage.axpo
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, this.b, bArr, 0, i);
    }

    @Override // defpackage.axpo
    protected final int g(int i, int i2) {
        byte[] bArr = axqj.a;
        return a.al(i, this.a, this.b, i2);
    }

    Object writeReplace() {
        return axpo.i(j());
    }
}
