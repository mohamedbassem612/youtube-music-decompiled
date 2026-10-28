package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.version_info.VersionConstantsBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axpo implements Iterable, Serializable {
    public static final axpo d = new axpn(axqj.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    static {
        Class cls = axpi.a;
    }

    public static axpo h(String str, Charset charset) {
        return str.isEmpty() ? d : new axpn(str.getBytes(charset));
    }

    static axpo i(byte[] bArr) {
        try {
            return l(bArr);
        } catch (axqm e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static axpo k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        a.ao(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new axpn(bArr2);
    }

    static axpo l(byte[] bArr) {
        return bArr.length == 0 ? d : new axpn(bArr);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract axpo c(int i, int i2);

    public abstract void d(axpk axpkVar);

    protected abstract boolean e(axpo axpoVar);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axpo) {
            axpo axpoVar = (axpo) obj;
            int iB = b();
            if (iB == axpoVar.b()) {
                if (iB == 0) {
                    return true;
                }
                int i = this.a;
                int i2 = axpoVar.a;
                if (i == 0 || i2 == 0 || i == i2) {
                    return e(axpoVar);
                }
            }
        }
        return false;
    }

    protected abstract void f(byte[] bArr, int i);

    protected abstract int g(int i, int i2);

    public final int hashCode() {
        int iG = this.a;
        if (iG == 0) {
            int iB = b();
            iG = g(iB, iB);
            if (iG == 0) {
                iG = 1;
            }
            this.a = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new lwu(this, 2);
    }

    public final byte[] j() {
        int iB = b();
        if (iB == 0) {
            return axqj.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()), b() <= 50 ? VersionConstantsBridge.a(this) : VersionConstantsBridge.a(c(0, 47)).concat("..."));
    }
}
