package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axqa {
    public static final axqa a = new axqa(null);
    public final axri b = new axri();
    private boolean c;

    private axqa(byte[] bArr) {
        c();
        c();
    }

    public static int a(axrt axrtVar, int i, Object obj) {
        int iNumberOfLeadingZeros;
        int iH;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (axrtVar == axrt.GROUP) {
            iNumberOfLeadingZeros4 <<= 1;
        }
        axru axruVar = axru.a;
        int iAR = 4;
        switch (axrtVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case FLOAT:
                ((Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iAR;
            case INT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case UINT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case INT32:
                iAR = a.aR(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iAR;
            case FIXED64:
                ((Long) obj).longValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case FIXED32:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iAR;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iAR = 1;
                return iNumberOfLeadingZeros4 + iAR;
            case STRING:
                iAR = obj instanceof axpo ? axpk.b((axpo) obj) : axpk.c((String) obj);
                return iNumberOfLeadingZeros4 + iAR;
            case GROUP:
                iAR = ((axqv) obj).h();
                return iNumberOfLeadingZeros4 + iAR;
            case MESSAGE:
                if (obj instanceof axqk) {
                    throw null;
                }
                iH = ((axqv) obj).h();
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                iAR = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                return iNumberOfLeadingZeros4 + iAR;
            case BYTES:
                if (obj instanceof axpo) {
                    iAR = axpk.b((axpo) obj);
                } else {
                    iH = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                    iAR = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                }
                return iNumberOfLeadingZeros4 + iAR;
            case UINT32:
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case ENUM:
                iAR = obj instanceof axqh ? a.aR(((axqh) obj).a()) : a.aR(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iAR;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iAR;
            case SFIXED64:
                ((Long) obj).longValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void e(axpk axpkVar, axrt axrtVar, int i, Object obj) {
        int i2 = i << 3;
        if (axrtVar == axrt.GROUP) {
            axpkVar.y(i2 | 3);
            ((axqv) obj).s(axpkVar);
            axpkVar.y(i2 | 4);
            return;
        }
        axpkVar.y(i2 | axrtVar.t);
        axru axruVar = axru.a;
        switch (axrtVar) {
            case DOUBLE:
                axpkVar.f(((Double) obj).doubleValue());
                break;
            case FLOAT:
                axpkVar.h(((Float) obj).floatValue());
                break;
            case INT64:
                axpkVar.A(((Long) obj).longValue());
                break;
            case UINT64:
                axpkVar.A(((Long) obj).longValue());
                break;
            case INT32:
                axpkVar.t(((Integer) obj).intValue());
                break;
            case FIXED64:
                axpkVar.r(((Long) obj).longValue());
                break;
            case FIXED32:
                axpkVar.p(((Integer) obj).intValue());
                break;
            case BOOL:
                axpkVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof axpo)) {
                    axpkVar.w((String) obj);
                } else {
                    axpkVar.n((axpo) obj);
                }
                break;
            case GROUP:
                ((axqv) obj).s(axpkVar);
                break;
            case MESSAGE:
                axpkVar.u((axqv) obj);
                break;
            case BYTES:
                if (!(obj instanceof axpo)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    axpkVar.y(length);
                    axpkVar.k(bArr, 0, length);
                } else {
                    axpkVar.n((axpo) obj);
                }
                break;
            case UINT32:
                axpkVar.y(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof axqh)) {
                    axpkVar.t(((Integer) obj).intValue());
                } else {
                    axpkVar.t(((axqh) obj).a());
                }
                break;
            case SFIXED32:
                axpkVar.p(((Integer) obj).intValue());
                break;
            case SFIXED64:
                axpkVar.r(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                axpkVar.y((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                axpkVar.A((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public final Iterator b() {
        return d() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void c() {
        if (this.c) {
            return;
        }
        axri axriVar = this.b;
        int size = axriVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((axrg) axriVar.a(i)).a;
            if (obj instanceof axqf) {
                ((axqf) obj).n();
            }
        }
        if (!axriVar.c) {
            axriVar.c();
            Object[] objArr = axriVar.a;
            if (objArr != null && axriVar.b > 0) {
                lxs lxsVar = ((axrg) objArr[0]).c;
                throw null;
            }
            axriVar.c = true;
        }
        this.c = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        axqa axqaVar = new axqa();
        axri axriVar = this.b;
        if (axriVar.size() <= 0) {
            return axqaVar;
        }
        axrg axrgVar = (axrg) axriVar.a(0);
        lxs lxsVar = axrgVar.c;
        Object obj = axrgVar.a;
        throw null;
    }

    final boolean d() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof axqa) {
            axri axriVar = this.b;
            axri axriVar2 = ((axqa) obj).b;
            if (axriVar.size() == axriVar2.size() && axriVar.keySet().equals(axriVar2.keySet())) {
                for (Map.Entry entry : axriVar.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    axriVar2.get(key);
                    if (value != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        axri axriVar = this.b;
        if (axriVar.size() <= 0) {
            return;
        }
        lxs lxsVar = ((axrg) axriVar.a(0)).c;
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private axqa() {
    }
}
