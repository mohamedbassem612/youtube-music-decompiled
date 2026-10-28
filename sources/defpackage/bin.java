package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bin {
    public static final bin a = new bin(null);
    public final bjv b = new bjv();
    private boolean c;

    private bin(byte[] bArr) {
        c();
        c();
    }

    public static int a(bkl bklVar, int i, Object obj) {
        int iNumberOfLeadingZeros;
        int iH;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (bklVar == bkl.GROUP) {
            iNumberOfLeadingZeros4 <<= 1;
        }
        bkm bkmVar = bkm.a;
        int iAR = 4;
        switch (bklVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case 1:
                ((Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iAR;
            case 2:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case 3:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case 4:
                iAR = a.aR(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iAR;
            case 5:
                ((Long) obj).longValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case 6:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iAR;
            case 7:
                ((Boolean) obj).booleanValue();
                iAR = 1;
                return iNumberOfLeadingZeros4 + iAR;
            case 8:
                iAR = obj instanceof bhy ? bih.F((bhy) obj) : bih.H((String) obj);
                return iNumberOfLeadingZeros4 + iAR;
            case 9:
                iAR = ((bji) obj).h();
                return iNumberOfLeadingZeros4 + iAR;
            case 10:
                if (obj instanceof biy) {
                    throw null;
                }
                iH = ((bji) obj).h();
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                iAR = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                return iNumberOfLeadingZeros4 + iAR;
            case 11:
                if (obj instanceof bhy) {
                    iAR = bih.F((bhy) obj);
                } else {
                    iH = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                    iAR = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                }
                return iNumberOfLeadingZeros4 + iAR;
            case 12:
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case 13:
                iAR = obj instanceof biu ? a.aR(((biu) obj).a()) : a.aR(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iAR;
            case 14:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iAR;
            case 15:
                ((Long) obj).longValue();
                iAR = 8;
                return iNumberOfLeadingZeros4 + iAR;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iAR = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iAR;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void d(bih bihVar, bkl bklVar, int i, Object obj) {
        if (bklVar == bkl.GROUP) {
            bihVar.s(i, 3);
            ((bji) obj).r(bihVar);
            bihVar.s(i, 4);
            return;
        }
        bihVar.s(i, bklVar.t);
        bkm bkmVar = bkm.a;
        switch (bklVar.ordinal()) {
            case 0:
                bihVar.J(((Double) obj).doubleValue());
                break;
            case 1:
                bihVar.L(((Float) obj).floatValue());
                break;
            case 2:
                bihVar.w(((Long) obj).longValue());
                break;
            case 3:
                bihVar.w(((Long) obj).longValue());
                break;
            case 4:
                bihVar.m(((Integer) obj).intValue());
                break;
            case 5:
                bihVar.k(((Long) obj).longValue());
                break;
            case 6:
                bihVar.i(((Integer) obj).intValue());
                break;
            case 7:
                bihVar.c(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof bhy)) {
                    bihVar.r((String) obj);
                } else {
                    bihVar.g((bhy) obj);
                }
                break;
            case 9:
                ((bji) obj).r(bihVar);
                break;
            case 10:
                bihVar.n((bji) obj);
                break;
            case 11:
                if (!(obj instanceof bhy)) {
                    byte[] bArr = (byte[]) obj;
                    bihVar.x(bArr, bArr.length);
                } else {
                    bihVar.g((bhy) obj);
                }
                break;
            case 12:
                bihVar.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof biu)) {
                    bihVar.m(((Integer) obj).intValue());
                } else {
                    bihVar.m(((biu) obj).a());
                }
                break;
            case 14:
                bihVar.i(((Integer) obj).intValue());
                break;
            case 15:
                bihVar.k(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                bihVar.u((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                bihVar.w((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public final Iterator b() {
        return e() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void c() {
        if (this.c) {
            return;
        }
        bjv bjvVar = this.b;
        int size = bjvVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((lzb) bjvVar.a(i)).a;
            if (obj instanceof bis) {
                ((bis) obj).n();
            }
        }
        if (!bjvVar.c) {
            bjvVar.c();
            Object[] objArr = bjvVar.a;
            if (objArr != null && bjvVar.b > 0) {
                Object obj2 = ((lzb) objArr[0]).c;
                throw null;
            }
            bjvVar.c = true;
        }
        this.c = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        bin binVar = new bin();
        bjv bjvVar = this.b;
        if (bjvVar.size() <= 0) {
            return binVar;
        }
        lzb lzbVar = (lzb) bjvVar.a(0);
        Object obj = lzbVar.c;
        Object obj2 = lzbVar.a;
        throw null;
    }

    final boolean e() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bin) {
            bjv bjvVar = this.b;
            bjv bjvVar2 = ((bin) obj).b;
            if (bjvVar.size() == bjvVar2.size() && bjvVar.keySet().equals(bjvVar2.keySet())) {
                for (Map.Entry entry : bjvVar.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    bjvVar2.get(key);
                    if (value != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        bjv bjvVar = this.b;
        if (bjvVar.size() <= 0) {
            return;
        }
        Object obj = ((lzb) bjvVar.a(0)).c;
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private bin() {
    }
}
