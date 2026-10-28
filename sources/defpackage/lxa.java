package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lxa implements Iterable, Serializable {
    private static final lww a;
    public static final lxa d = new lwy(lyf.a);
    private static final long serialVersionUID = 1;
    private int b = 0;

    static {
        a = lwp.a() ? new lwz(0) : new lwz(1);
    }

    public static lxa h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static lxa i(byte[] bArr, int i, int i2) {
        lxa lwyVar;
        try {
            if (i2 == 0) {
                lwyVar = d;
            } else {
                a.ao(i, i + i2, bArr.length);
                lwyVar = new lwy(a.a(bArr, i, i2));
            }
            return lwyVar;
        } catch (lyh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract lxa c(int i, int i2);

    public abstract void d(lwt lwtVar);

    protected abstract boolean e(lxa lxaVar);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxa) {
            lxa lxaVar = (lxa) obj;
            int iB = b();
            if (iB == lxaVar.b()) {
                if (iB == 0) {
                    return true;
                }
                int i = this.b;
                int i2 = lxaVar.b;
                if (i == 0 || i2 == 0 || i == i2) {
                    return e(lxaVar);
                }
            }
        }
        return false;
    }

    protected abstract void f(byte[] bArr, int i);

    protected abstract int g(int i, int i2);

    public final int hashCode() {
        int iG = this.b;
        if (iG == 0) {
            int iB = b();
            iG = g(iB, iB);
            if (iG == 0) {
                iG = 1;
            }
            this.b = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new lwu(this, 0);
    }

    public final byte[] j() {
        int iB = b();
        if (iB == 0) {
            return lyf.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()), b() <= 50 ? mdu.p(this) : mdu.p(c(0, 47)).concat("..."));
    }
}
