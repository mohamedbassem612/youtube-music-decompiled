package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axqf extends axpg {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static final Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected axrm unknownFields = axrm.a;

    protected static void p(Class cls, axqf axqfVar) {
        axqfVar.o();
        defaultInstanceMap.put(cls, axqfVar);
    }

    public static final boolean t(axqf axqfVar) {
        byte bByteValue = ((Byte) axqfVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = axrb.a.b(axqfVar).h(axqfVar);
        axqfVar.a(2);
        return zH;
    }

    private final int u(axre axreVar) {
        return axreVar == null ? axrb.a.b(this).a(this) : axreVar.a(this);
    }

    protected abstract Object a(int i);

    @Override // defpackage.axpg
    public final int b(axre axreVar) {
        if (r()) {
            int iU = u(axreVar);
            if (iU < 0) {
                throw new IllegalStateException(a.bR(iU, "serialized size must be non-negative, was "));
            }
            return iU;
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iU2 = u(axreVar);
        q(iU2);
        return iU2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return axrb.a.b(this).g(this, (axqf) obj);
    }

    final int f() {
        return axrb.a.b(this).b(this);
    }

    final int g() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.axqv
    public final int h() {
        return b(null);
    }

    public final int hashCode() {
        if (r()) {
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

    public final axqd i() {
        return (axqd) a(5);
    }

    @Override // defpackage.axqv
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final axqd m() {
        return (axqd) a(5);
    }

    @Override // defpackage.axqw
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final axqf e() {
        return (axqf) a(6);
    }

    public final axqf l() {
        return (axqf) a(4);
    }

    protected final void n() {
        axrb.a.b(this).d(this);
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

    final boolean r() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    @Override // defpackage.axqv
    public final void s(axpk axpkVar) {
        axre axreVarB = axrb.a.b(this);
        Object axklVar = axpkVar.a;
        if (axklVar == null) {
            axklVar = new axkl(axpkVar);
        }
        axreVarB.i(this, (axkl) axklVar);
    }

    public final String toString() {
        String string = super.toString();
        int i = axqx.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        axqx.b(this, sb, 0);
        return sb.toString();
    }
}
