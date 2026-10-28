package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigh extends aigg {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public aigh(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.aigj
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.aigj
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.aigj
    protected final int c(int i, int i2, int i3) {
        byte[] bArr = aiif.a;
        return a.al(i, this.a, i2, i3);
    }

    @Override // defpackage.aigj
    public final int d() {
        return this.a.length;
    }

    @Override // defpackage.aigj
    public final aigj e(int i, int i2) {
        int iAo = a.ao(i, i2, d());
        return iAo == 0 ? aigj.d : new aige(this.a, i, iAo);
    }

    @Override // defpackage.aigj
    public final aigj f(int i, int i2) {
        int iAo = a.ao(i, i2, d());
        return iAo == 0 ? aigj.d : new aige(this.a, i, iAo);
    }

    @Override // defpackage.aigj
    public final aigm g() {
        return aigm.O(this.a, 0, d(), true);
    }

    @Override // defpackage.aigj
    public final InputStream h() {
        return new ByteArrayInputStream(this.a, 0, d());
    }

    @Override // defpackage.aigj
    protected final String i(Charset charset) {
        return new String(this.a, charset);
    }

    @Override // defpackage.aigj
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    @Override // defpackage.aigj
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.aigj
    public final void l(aigb aigbVar) {
        aigbVar.a(this.a, 0, d());
    }

    @Override // defpackage.aigj
    public final void m(OutputStream outputStream) throws IOException {
        outputStream.write(G());
    }

    @Override // defpackage.aigj
    protected final boolean n(aigj aigjVar) {
        if (aigjVar instanceof aigh) {
            return Arrays.equals(this.a, ((aigh) aigjVar).a);
        }
        return aigjVar instanceof aige ? o(aigjVar, 0, d()) : aigjVar.n(this);
    }

    @Override // defpackage.aigg
    public final boolean o(aigj aigjVar, int i, int i2) {
        if (i2 > aigjVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 <= aigjVar.d()) {
            if (aigjVar instanceof aigh) {
                return aigj.F(this.a, 0, ((aigh) aigjVar).a, i, i2);
            }
            if (!(aigjVar instanceof aige)) {
                return aigjVar.f(i, i3).equals(f(0, i2));
            }
            aige aigeVar = (aige) aigjVar;
            byte[] bArr = this.a;
            int i4 = aige.c;
            return aigj.F(bArr, 0, aigeVar.a, aigeVar.b + i, i2);
        }
        throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + aigjVar.d());
    }

    @Override // defpackage.aigj
    public final boolean p() {
        return ahng.aJ(this.a);
    }
}
