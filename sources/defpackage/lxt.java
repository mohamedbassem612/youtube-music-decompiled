package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lxt extends lwn {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static final Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected lzh unknownFields = lzh.a;

    public static lye A(lye lyeVar) {
        return lyeVar.e(lyeVar.size() << 1);
    }

    protected static void E(Class cls, lxt lxtVar) {
        lxtVar.D();
        defaultInstanceMap.put(cls, lxtVar);
    }

    public static final boolean I(lxt lxtVar) {
        byte bByteValue = ((Byte) lxtVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zJ = lyw.a.a(lxtVar).j(lxtVar);
        lxtVar.a(2);
        return zJ;
    }

    private final int b(lyz lyzVar) {
        return lyzVar == null ? lyw.a.a(this).a(this) : lyzVar.a(this);
    }

    private static lxt c(lxt lxtVar, byte[] bArr, int i, lxl lxlVar) throws lyh {
        if (i == 0) {
            return lxtVar;
        }
        lxt lxtVarX = lxtVar.x();
        try {
            lyz lyzVarA = lyw.a.a(lxtVarX);
            lyzVarA.h(lxtVarX, bArr, 0, i, new lwq(lxlVar));
            lyzVarA.f(lxtVarX);
            return lxtVarX;
        } catch (IOException e) {
            if (e.getCause() instanceof lyh) {
                throw ((lyh) e.getCause());
            }
            throw new lyh(e);
        } catch (IndexOutOfBoundsException unused) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (lyh e2) {
            if (e2.a) {
                throw new lyh(e2);
            }
            throw e2;
        } catch (lzf e3) {
            throw e3.a();
        }
    }

    public static lxt y(lxt lxtVar, byte[] bArr) throws lyh {
        lxt lxtVarC = c(lxtVar, bArr, bArr.length, lxl.a());
        if (lxtVarC == null || I(lxtVarC)) {
            return lxtVarC;
        }
        throw new lzf().a();
    }

    public static lya z(lya lyaVar) {
        return lyaVar.e(lyaVar.size() << 1);
    }

    protected final void C() {
        lyw.a.a(this).f(this);
        D();
    }

    final void D() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    final void F(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.bR(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | i;
    }

    @Override // defpackage.lyp
    public final void G(lxh lxhVar) {
        lyz lyzVarA = lyw.a.a(this);
        Object lqaVar = lxhVar.b;
        if (lqaVar == null) {
            lqaVar = new lqa(lxhVar);
        }
        lyzVarA.k(this, (lqa) lqaVar);
    }

    final boolean H() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return lyw.a.a(this).i(this, (lxt) obj);
    }

    public final int hashCode() {
        if (H()) {
            return o();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iO = o();
        this.memoizedHashCode = iO;
        return iO;
    }

    @Override // defpackage.lwn
    public final int l(lyz lyzVar) {
        if (H()) {
            int iB = b(lyzVar);
            if (iB < 0) {
                throw new IllegalStateException(a.bR(iB, "serialized size must be non-negative, was "));
            }
            return iB;
        }
        if (p() != Integer.MAX_VALUE) {
            return p();
        }
        int iB2 = b(lyzVar);
        F(iB2);
        return iB2;
    }

    final int o() {
        return lyw.a.a(this).b(this);
    }

    final int p() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.lyp
    public final int q() {
        return l(null);
    }

    public final lxq s() {
        return (lxq) a(5);
    }

    public final lxq t(lxt lxtVar) {
        lxq lxqVarS = s();
        lxqVarS.t(lxtVar);
        return lxqVarS;
    }

    public final String toString() {
        String string = super.toString();
        int i = lyr.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        lyr.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.lyp
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final lxq B() {
        return (lxq) a(5);
    }

    public final lxq v() {
        lxq lxqVar = (lxq) a(5);
        lxqVar.t(this);
        return lxqVar;
    }

    @Override // defpackage.lyq
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final lxt r() {
        return (lxt) a(6);
    }

    final lxt x() {
        return (lxt) a(4);
    }
}
