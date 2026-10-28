package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aijf extends aigj {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};
    private static final long serialVersionUID = 1;
    public final int b;
    public final aigj c;
    public final aigj e;
    public final int f;
    private final int g;

    public aijf(aigj aigjVar, aigj aigjVar2) {
        this.c = aigjVar;
        this.e = aigjVar2;
        int iD = aigjVar.d();
        this.g = iD;
        this.b = iD + aigjVar2.d();
        this.f = Math.max(aigjVar.q(), aigjVar2.q()) + 1;
    }

    public static aigj K(aigj aigjVar, aigj aigjVar2) {
        int iD = aigjVar.d();
        int iD2 = aigjVar2.d();
        byte[] bArr = new byte[iD + iD2];
        aigjVar.D(bArr, 0, 0, iD);
        aigjVar2.D(bArr, 0, iD, iD2);
        return aigj.z(bArr);
    }

    public static int o(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aigj
    public final byte a(int i) {
        C(i, this.b);
        return b(i);
    }

    @Override // defpackage.aigj
    public final byte b(int i) {
        int i2 = this.g;
        return i < i2 ? this.c.b(i) : this.e.b(i - i2);
    }

    @Override // defpackage.aigj
    protected final int c(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            return this.c.c(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.c(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.c(this.c.c(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.aigj
    public final int d() {
        return this.b;
    }

    @Override // defpackage.aigj
    public final aigj e(int i, int i2) {
        return f(i, i2);
    }

    @Override // defpackage.aigj
    public final aigj f(int i, int i2) {
        int i3 = this.b;
        int iAo = a.ao(i, i2, i3);
        if (iAo == 0) {
            return aigj.d;
        }
        if (iAo == i3) {
            return this;
        }
        int i4 = this.g;
        if (i2 <= i4) {
            return this.c.e(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.e.e(i - i4, i5);
        }
        return new aijf(this.c.y(i), this.e.e(0, i5));
    }

    @Override // defpackage.aigj
    public final aigm g() {
        ArrayList arrayList = new ArrayList();
        aijd aijdVar = new aijd(this);
        while (aijdVar.hasNext()) {
            arrayList.add(aijdVar.next().j());
        }
        return aigm.T(arrayList);
    }

    @Override // defpackage.aigj
    public final InputStream h() {
        return new aije(this);
    }

    @Override // defpackage.aigj
    protected final String i(Charset charset) {
        return new String(G(), charset);
    }

    @Override // defpackage.aigj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new aijc(this);
    }

    @Override // defpackage.aigj
    public final ByteBuffer j() {
        throw null;
    }

    @Override // defpackage.aigj
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            this.c.k(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.e.k(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.k(bArr, i, i2, i6);
            this.e.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.aigj
    public final void l(aigb aigbVar) {
        this.c.l(aigbVar);
        this.e.l(aigbVar);
    }

    @Override // defpackage.aigj
    public final void m(OutputStream outputStream) {
        this.c.m(outputStream);
        this.e.m(outputStream);
    }

    @Override // defpackage.aigj
    public final boolean n(aigj aigjVar) {
        aigg aiggVarA;
        aijd aijdVar = new aijd(this);
        aigg aiggVarA2 = aijdVar.next();
        aijd aijdVar2 = new aijd(aigjVar);
        aigg aiggVarA3 = aijdVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iD = aiggVarA2.d() - i;
            int iD2 = aiggVarA3.d() - i2;
            int iMin = Math.min(iD, iD2);
            if (!(i == 0 ? aiggVarA2.o(aiggVarA3, i2, iMin) : aiggVarA3.o(aiggVarA2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                aiggVarA = aijdVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iD2) {
                aiggVarA2 = aiggVarA2;
                aiggVarA2 = aiggVarA;
                aiggVarA3 = aijdVar2.next();
                i2 = 0;
            } else {
                aiggVarA2 = aiggVarA2;
                aiggVarA2 = aiggVarA;
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.aigj
    public final boolean p() {
        aijd aijdVar = new aijd(this);
        while (aijdVar.hasNext()) {
            if (!aijdVar.next().p()) {
                return ahng.aJ(G());
            }
        }
        return true;
    }

    @Override // defpackage.aigj
    protected final int q() {
        return this.f;
    }

    @Override // defpackage.aigj
    public final boolean r() {
        return this.b >= o(this.f);
    }

    @Override // defpackage.aigj
    /* JADX INFO: renamed from: s */
    public final aigf iterator() {
        return new aijc(this);
    }

    Object writeReplace() {
        return aigj.z(G());
    }
}
