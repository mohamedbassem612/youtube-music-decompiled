package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bis extends bhn {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static final Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected bjz unknownFields = bjz.a;

    private final int b(bjs bjsVar) {
        return bjsVar == null ? bjp.a.a(this).a(this) : bjsVar.a(this);
    }

    protected static void p(Class cls, bis bisVar) {
        bisVar.o();
        defaultInstanceMap.put(cls, bisVar);
    }

    public static final boolean t(bis bisVar) {
        byte bByteValue = ((Byte) bisVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = bjp.a.a(bisVar).h(bisVar);
        bisVar.a(2);
        return zH;
    }

    protected abstract Object a(int i);

    @Override // defpackage.bhn
    public final int c(bjs bjsVar) {
        if (s()) {
            int iB = b(bjsVar);
            if (iB < 0) {
                throw new IllegalStateException(a.bR(iB, "serialized size must be non-negative, was "));
            }
            return iB;
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iB2 = b(bjsVar);
        q(iB2);
        return iB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return bjp.a.a(this).g(this, (bis) obj);
    }

    final int f() {
        return bjp.a.a(this).b(this);
    }

    final int g() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.bji
    public final int h() {
        return c(null);
    }

    public final int hashCode() {
        if (s()) {
            return f();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iF = f();
        this.memoizedHashCode = iF;
        return iF;
    }

    public final biq i() {
        return (biq) a(5);
    }

    @Override // defpackage.bji
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final biq m() {
        return (biq) a(5);
    }

    @Override // defpackage.bjj
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final bis e() {
        return (bis) a(6);
    }

    public final bis l() {
        return (bis) a(4);
    }

    protected final void n() {
        bjp.a.a(this).d(this);
        o();
    }

    final void o() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    final void q(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.bR(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | i;
    }

    @Override // defpackage.bji
    public final void r(bih bihVar) {
        bjs bjsVarA = bjp.a.a(this);
        Object zfVar = bihVar.b;
        if (zfVar == null) {
            zfVar = new zf(bihVar);
        }
        bjsVarA.i(this, (zf) zfVar);
    }

    final boolean s() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        int i = bjk.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        bjk.b(this, sb, 0);
        return sb.toString();
    }
}
