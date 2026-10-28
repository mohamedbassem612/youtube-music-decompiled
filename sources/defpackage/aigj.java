package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aigj implements Iterable, Serializable {
    public static final aigj d = new aigh(aiif.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    static void C(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.bQ(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.bR(i, "Index < 0: "));
        }
    }

    public static boolean F(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        a.ao(i, i4, bArr.length);
        a.ao(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static aigj H(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        a.ao(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new aigh(bArr2);
    }

    public static aigj I(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = SemanticState.Hidden;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            aigj aigjVarW = i == 0 ? null : w(bArr, 0, i);
            if (aigjVarW == null) {
                return u(arrayList);
            }
            arrayList.add(aigjVarW);
            iMin = Math.min(iMin << 1, SemanticState.Multiline);
        }
    }

    public static aigj J(byte[] bArr) {
        return bArr.length == 0 ? d : new aigh(bArr);
    }

    private static aigj o(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (aigj) it.next();
        }
        int i2 = i >>> 1;
        return o(it, i2).t(o(it, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aigj u(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? d : o(iterable.iterator(), size);
    }

    public static aigj v(byte[] bArr) {
        try {
            return H(bArr, 0, bArr.length);
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static aigj w(byte[] bArr, int i, int i2) {
        try {
            return H(bArr, i, i2);
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static aigj x(String str) {
        return str.isEmpty() ? d : new aigh(str.getBytes(StandardCharsets.UTF_8));
    }

    public static aigj z(byte[] bArr) {
        try {
            return J(bArr);
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public final String A(Charset charset) {
        return E() ? "" : i(charset);
    }

    public final String B() {
        return A(StandardCharsets.UTF_8);
    }

    @Deprecated
    public final void D(byte[] bArr, int i, int i2, int i3) {
        a.ao(i, i + i3, d());
        a.ao(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            k(bArr, i, i2, i3);
        }
    }

    public final boolean E() {
        return d() == 0;
    }

    public final byte[] G() {
        int iD = d();
        if (iD == 0) {
            return aiif.a;
        }
        byte[] bArr = new byte[iD];
        k(bArr, 0, 0, iD);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    protected abstract int c(int i, int i2, int i3);

    public abstract int d();

    public abstract aigj e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aigj) {
            aigj aigjVar = (aigj) obj;
            int iD = d();
            if (iD == aigjVar.d()) {
                if (iD == 0) {
                    return true;
                }
                int i = this.a;
                int i2 = aigjVar.a;
                if (i == 0 || i2 == 0 || i == i2) {
                    return n(aigjVar);
                }
            }
        }
        return false;
    }

    public abstract aigj f(int i, int i2);

    public abstract aigm g();

    public abstract InputStream h();

    public final int hashCode() {
        int iC = this.a;
        if (iC == 0) {
            int iD = d();
            iC = c(iD, 0, iD);
            if (iC == 0) {
                iC = 1;
            }
            this.a = iC;
        }
        return iC;
    }

    protected abstract String i(Charset charset);

    public abstract ByteBuffer j();

    protected abstract void k(byte[] bArr, int i, int i2, int i3);

    public abstract void l(aigb aigbVar);

    public abstract void m(OutputStream outputStream);

    protected abstract boolean n(aigj aigjVar);

    public abstract boolean p();

    protected abstract int q();

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public aigf iterator() {
        return new aigc(this);
    }

    public final aigj t(aigj aigjVar) {
        if (Alert.DURATION_SHOW_INDEFINITELY - d() < aigjVar.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + d() + '+' + aigjVar.d());
        }
        int[] iArr = aijf.a;
        if (aigjVar.d() == 0) {
            return this;
        }
        if (d() != 0) {
            int iD = d() + aigjVar.d();
            if (iD < 128) {
                return aijf.K(this, aigjVar);
            }
            if (this instanceof aijf) {
                aijf aijfVar = (aijf) this;
                aigj aigjVar2 = aijfVar.e;
                if (aigjVar2.d() + aigjVar.d() < 128) {
                    aigjVar = new aijf(aijfVar.c, aijf.K(aigjVar2, aigjVar));
                } else {
                    aigj aigjVar3 = aijfVar.c;
                    if (aigjVar3.q() > aigjVar2.q() && aijfVar.f > aigjVar.q()) {
                        aigjVar = new aijf(aigjVar3, new aijf(aigjVar2, aigjVar));
                    }
                }
            }
            if (iD >= aijf.o(Math.max(q(), aigjVar.q()) + 1)) {
                return new aijf(this, aigjVar);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            aext.z(this, arrayDeque);
            aext.z(aigjVar, arrayDeque);
            aigj aijfVar2 = (aigj) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                aijfVar2 = new aijf((aigj) arrayDeque.pop(), aijfVar2);
            }
            return aijfVar2;
        }
        return aigjVar;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? aijo.a(this) : aijo.a(f(0, 47)).concat("..."));
    }

    public final aigj y(int i) {
        return e(i, d());
    }
}
