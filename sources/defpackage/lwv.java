package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lwv extends lwx {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public lwv(byte[] bArr, int i, int i2) {
        a.ao(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.lxa
    public final byte a(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.lxa
    public final int b() {
        return this.e;
    }

    @Override // defpackage.lxa
    public final lxa c(int i, int i2) {
        int iAo = a.ao(i, i2, this.e);
        return iAo == 0 ? lxa.d : new lwv(this.a, this.b + i, iAo);
    }

    @Override // defpackage.lxa
    public final void d(lwt lwtVar) {
        lwtVar.a(this.a, this.b, this.e);
    }

    @Override // defpackage.lxa
    protected final boolean e(lxa lxaVar) {
        boolean z = lxaVar instanceof lwy;
        if (!z && !(lxaVar instanceof lwv)) {
            return lxaVar.e(this);
        }
        int i = this.e;
        if (i > lxaVar.b()) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > lxaVar.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + lxaVar.b());
        }
        if (z) {
            byte[] bArr = this.a;
            int i2 = this.b;
            int i3 = lwy.b;
            return a.aQ(bArr, i2, ((lwy) lxaVar).a, 0, i);
        }
        if (lxaVar instanceof lwv) {
            lwv lwvVar = (lwv) lxaVar;
            return a.aQ(this.a, this.b, lwvVar.a, lwvVar.b, i);
        }
        lxa lxaVarC = lxaVar.c(0, i);
        int i4 = this.b;
        return lxaVarC.equals(c(i4, i + i4));
    }

    @Override // defpackage.lxa
    protected final void f(byte[] bArr, int i) {
        System.arraycopy(this.a, this.b, bArr, 0, i);
    }

    @Override // defpackage.lxa
    protected final int g(int i, int i2) {
        byte[] bArr = lyf.a;
        return a.al(i, this.a, this.b, i2);
    }

    Object writeReplace() {
        byte[] bArrJ = j();
        try {
            return bArrJ.length == 0 ? lxa.d : new lwy(bArrJ);
        } catch (lyh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }
}
