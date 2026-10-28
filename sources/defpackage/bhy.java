package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bhy implements Iterable, Serializable {
    private static final bhu a;
    public static final bhy d = new bhw(bix.a);
    private static final long serialVersionUID = 1;
    private int b = 0;

    static {
        a = bhp.a() ? new bhx() : new bhs();
    }

    public static bhy h(byte[] bArr) {
        try {
            return k(bArr, 0, bArr.length);
        } catch (bja e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static bhy i(byte[] bArr) {
        try {
            return l(bArr);
        } catch (bja e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static bhy k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        a.ao(i, i + i2, bArr.length);
        return new bhw(a.a(bArr, i, i2));
    }

    static bhy l(byte[] bArr) {
        return bArr.length == 0 ? d : new bhw(bArr);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract bhy c(int i, int i2);

    public abstract void d(bhr bhrVar);

    protected abstract boolean e(bhy bhyVar);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhy) {
            bhy bhyVar = (bhy) obj;
            int iB = b();
            if (iB == bhyVar.b()) {
                if (iB == 0) {
                    return true;
                }
                int i = this.b;
                int i2 = bhyVar.b;
                if (i == 0 || i2 == 0 || i == i2) {
                    return e(bhyVar);
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
        return new lwu(this, 1);
    }

    public final byte[] j() {
        int iB = b();
        if (iB == 0) {
            return bix.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()), b() <= 50 ? aea.a(this) : aea.a(c(0, 47)).concat("..."));
    }
}
