package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aige extends aigg {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public aige(byte[] bArr, int i, int i2) {
        a.ao(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aigj
    public final byte a(int i) {
        C(i, this.e);
        return this.a[this.b + i];
    }

    @Override // defpackage.aigj
    public final byte b(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.aigj
    protected final int c(int i, int i2, int i3) {
        byte[] bArr = aiif.a;
        return a.al(i, this.a, this.b + i2, i3);
    }

    @Override // defpackage.aigj
    public final int d() {
        return this.e;
    }

    @Override // defpackage.aigj
    public final aigj e(int i, int i2) {
        int iAo = a.ao(i, i2, this.e);
        return iAo == 0 ? aigj.d : new aige(this.a, this.b + i, iAo);
    }

    @Override // defpackage.aigj
    public final aigj f(int i, int i2) {
        int iAo = a.ao(i, i2, this.e);
        return iAo == 0 ? aigj.d : new aige(this.a, this.b + i, iAo);
    }

    @Override // defpackage.aigj
    public final aigm g() {
        return aigm.O(this.a, this.b, this.e, true);
    }

    @Override // defpackage.aigj
    public final InputStream h() {
        return new ByteArrayInputStream(this.a, this.b, this.e);
    }

    @Override // defpackage.aigj
    protected final String i(Charset charset) {
        return new String(this.a, this.b, this.e, charset);
    }

    @Override // defpackage.aigj
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.a, this.b, this.e).slice().asReadOnlyBuffer();
    }

    @Override // defpackage.aigj
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    @Override // defpackage.aigj
    public final void l(aigb aigbVar) {
        aigbVar.a(this.a, this.b, this.e);
    }

    @Override // defpackage.aigj
    public final void m(OutputStream outputStream) throws IOException {
        outputStream.write(G());
    }

    @Override // defpackage.aigj
    protected final boolean n(aigj aigjVar) {
        return ((aigjVar instanceof aigh) || (aigjVar instanceof aige)) ? o(aigjVar, 0, this.e) : aigjVar.n(this);
    }

    @Override // defpackage.aigg
    public final boolean o(aigj aigjVar, int i, int i2) {
        if (i2 > aigjVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.e);
        }
        int i3 = i + i2;
        if (i3 > aigjVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + aigjVar.d());
        }
        if (aigjVar instanceof aigh) {
            byte[] bArr = this.a;
            int i4 = this.b;
            int i5 = aigh.b;
            return aigj.F(bArr, i4, ((aigh) aigjVar).a, i, i2);
        }
        if (aigjVar instanceof aige) {
            aige aigeVar = (aige) aigjVar;
            return aigj.F(this.a, this.b, aigeVar.a, aigeVar.b + i, i2);
        }
        aigj aigjVarF = aigjVar.f(i, i3);
        int i6 = this.b;
        return aigjVarF.equals(f(i6, i2 + i6));
    }

    @Override // defpackage.aigj
    public final boolean p() {
        byte[] bArr = this.a;
        int i = this.b;
        return ahng.aK(bArr, i, this.e + i);
    }

    Object writeReplace() {
        return aigj.z(G());
    }
}
