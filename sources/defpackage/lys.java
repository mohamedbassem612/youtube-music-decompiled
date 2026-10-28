package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lys implements lyz {
    public static final int[] a = new int[0];
    public static final Unsafe b = lzn.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final lyp g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final lzg l;

    public lys(int[] iArr, Object[] objArr, int i, int i2, lyp lypVar, int[] iArr2, int i3, int i4, lzg lzgVar, ixt ixtVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        boolean z = false;
        if (ixtVar != null && (lypVar instanceof lxr)) {
            z = true;
        }
        this.h = z;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = lzgVar;
        this.g = lypVar;
    }

    private final void A(Object obj, Object obj2, int i) {
        int iL = l(i);
        if (L(obj2, iL, i)) {
            long jQ = q(p(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + l(i) + " is present but null: " + obj2);
            }
            lyz lyzVarT = t(i);
            if (!L(obj, iL, i)) {
                if (J(object)) {
                    Object objE = lyzVarT.e();
                    lyzVarT.g(objE, object);
                    unsafe.putObject(obj, jQ, objE);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                C(obj, iL, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!J(object2)) {
                Object objE2 = lyzVarT.e();
                lyzVarT.g(objE2, object2);
                unsafe.putObject(obj, jQ, objE2);
                object2 = objE2;
            }
            lyzVarT.g(object2, object);
        }
    }

    private final void B(Object obj, int i) {
        int iN = n(i);
        long j = 1048575 & iN;
        if (j != 1048575) {
            lzn.o(obj, j, lzn.c(obj, j) | (1 << (iN >>> 20)));
        }
    }

    private final void C(Object obj, int i, int i2) {
        lzn.o(obj, n(i2) & 1048575, i);
    }

    private final void D(Object obj, int i, Object obj2) {
        b.putObject(obj, q(p(i)), obj2);
        B(obj, i);
    }

    private final void E(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, q(p(i2)), obj2);
        C(obj, i, i2);
    }

    private final boolean F(Object obj, Object obj2, int i) {
        return G(obj, i) == G(obj2, i);
    }

    private final boolean G(Object obj, int i) {
        int iN = n(i);
        long j = 1048575 & iN;
        if (j == 1048575) {
            int iP = p(i);
            long jQ = q(iP);
            switch ((iP >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(lzn.a(obj, jQ)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(lzn.b(obj, jQ)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (lzn.d(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (lzn.d(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (lzn.d(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return lzn.s(obj, jQ);
                case 8:
                    Object objF = lzn.f(obj, jQ);
                    if (objF instanceof String) {
                        if (((String) objF).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objF instanceof lxa)) {
                            return M();
                        }
                        if (lxa.d.equals(objF)) {
                            return false;
                        }
                    }
                case 9:
                    if (lzn.f(obj, jQ) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (lxa.d.equals(lzn.f(obj, jQ))) {
                        return false;
                    }
                    break;
                case 11:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (lzn.d(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (lzn.c(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (lzn.d(obj, jQ) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (lzn.f(obj, jQ) == null) {
                        return false;
                    }
                    break;
                default:
                    return M();
            }
        } else {
            if ((lzn.c(obj, j) & (1 << (iN >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean H(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return G(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean I(Object obj, int i, lyz lyzVar) {
        return lyzVar.j(lzn.f(obj, q(i)));
    }

    private static boolean J(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof lxt) {
            return ((lxt) obj).H();
        }
        return true;
    }

    private final boolean K(Object obj, Object obj2, int i) {
        long jN = n(i) & 1048575;
        return lzn.c(obj, jN) == lzn.c(obj2, jN);
    }

    private final boolean L(Object obj, int i, int i2) {
        return lzn.c(obj, (long) (n(i2) & 1048575)) == i;
    }

    private static final boolean M() {
        throw new IllegalArgumentException();
    }

    private static final void N(int i, Object obj, lqa lqaVar) {
        if (!(obj instanceof String)) {
            lqaVar.b(i, (lxa) obj);
        } else {
            ((lxh) lqaVar.a).o(i, (String) obj);
        }
    }

    static lzh d(Object obj) {
        lxt lxtVar = (lxt) obj;
        lzh lzhVar = lxtVar.unknownFields;
        if (lzhVar != lzh.a) {
            return lzhVar;
        }
        lzh lzhVar2 = new lzh();
        lxtVar.unknownFields = lzhVar2;
        return lzhVar2;
    }

    private final int l(int i) {
        return this.c[i];
    }

    private static int m(Object obj, long j) {
        return ((Integer) lzn.f(obj, j)).intValue();
    }

    private final int n(int i) {
        return this.c[i + 2];
    }

    private final int o(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iL = l(i4);
            if (i == iL) {
                return i4;
            }
            if (i < iL) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int p(int i) {
        return this.c[i + 1];
    }

    private static long q(int i) {
        return i & 1048575;
    }

    private static long r(Object obj, long j) {
        return ((Long) lzn.f(obj, j)).longValue();
    }

    private final lxy s(int i) {
        return (lxy) this.d[((i / 3) << 1) + 1];
    }

    private final lyz t(int i) {
        Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        lyz lyzVar = (lyz) objArr[i2];
        if (lyzVar != null) {
            return lyzVar;
        }
        lyz lyzVarB = lyw.a.b((Class) objArr[i2 + 1]);
        objArr[i2] = lyzVarB;
        return lyzVarB;
    }

    private final Object u(Object obj, int i, Object obj2, lzg lzgVar, Object obj3) {
        lxy lxyVarS;
        int iL = l(i);
        Object objF = lzn.f(obj, q(p(i)));
        if (objF != null && (lxyVarS = s(i)) != null) {
            sdo sdoVarR = mdu.r(v(i));
            Iterator it = ((lym) objF).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!lxyVarS.a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = lzgVar.a(obj3);
                    }
                    entry.getKey();
                    entry.getValue();
                    int iT = mdu.t(sdoVarR);
                    lxa lxaVar = lxa.d;
                    byte[] bArr = new byte[iT];
                    lxh lxhVarF = lxh.F(bArr);
                    try {
                        mdu.s(lxhVarF, sdoVarR, entry.getKey(), entry.getValue());
                        ((lzh) obj2).d((iL << 3) | 2, ixt.O(lxhVarF, bArr));
                        it.remove();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private final Object v(int i) {
        return this.d[(i / 3) << 1];
    }

    private final Object w(Object obj, int i) {
        lyz lyzVarT = t(i);
        long jQ = q(p(i));
        if (!G(obj, i)) {
            return lyzVarT.e();
        }
        Object object = b.getObject(obj, jQ);
        if (J(object)) {
            return object;
        }
        Object objE = lyzVarT.e();
        if (object != null) {
            lyzVarT.g(objE, object);
        }
        return objE;
    }

    private final Object x(Object obj, int i, int i2) {
        lyz lyzVarT = t(i2);
        if (!L(obj, i, i2)) {
            return lyzVarT.e();
        }
        Object object = b.getObject(obj, q(p(i2)));
        if (J(object)) {
            return object;
        }
        Object objE = lyzVarT.e();
        if (object != null) {
            lyzVarT.g(objE, object);
        }
        return objE;
    }

    private static void y(Object obj) {
        if (J(obj)) {
            return;
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void z(Object obj, Object obj2, int i) {
        if (G(obj2, i)) {
            long jQ = q(p(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + l(i) + " is present but null: " + obj2);
            }
            lyz lyzVarT = t(i);
            if (!G(obj, i)) {
                if (J(object)) {
                    Object objE = lyzVarT.e();
                    lyzVarT.g(objE, object);
                    unsafe.putObject(obj, jQ, objE);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                B(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!J(object2)) {
                Object objE2 = lyzVarT.e();
                lyzVarT.g(objE2, object2);
                unsafe.putObject(obj, jQ, objE2);
                object2 = objE2;
            }
            lyzVarT.g(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0526  */
    /* JADX WARN: Code duplicated, block: B:201:0x054b  */
    @Override // defpackage.lyz
    public final int a(Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iBr;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iC;
        int iJ;
        int size;
        int size2;
        int iJ2;
        int iNumberOfLeadingZeros5;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iA;
        int iNumberOfLeadingZeros11;
        lys lysVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = lysVar.c;
            if (i2 >= iArr.length) {
                int iA2 = i4 + lysVar.l.b(obj2).a();
                if (lysVar.h) {
                    lzd lzdVar = ixt.M(obj2).b;
                    if (lzdVar.size() > 0) {
                        lzb lzbVar = (lzb) lzdVar.a(0);
                        Object obj3 = lzbVar.c;
                        Object obj4 = lzbVar.a;
                        throw null;
                    }
                }
                return iA2;
            }
            int iP = lysVar.p(i2);
            int iL = lysVar.l(i2);
            int i6 = iArr[i2 + 2];
            int i7 = i6 & 1048575;
            int i8 = (iP >>> 20) & 255;
            if (i8 <= 17) {
                if (i7 != i5) {
                    i3 = i7 == 1048575 ? 0 : unsafe.getInt(obj2, i7);
                    i5 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long jQ = q(iP);
            if (i8 >= lxo.DOUBLE_LIST_PACKED.Z) {
                int i9 = lxo.SINT64_LIST_PACKED.Z;
            }
            switch (i8) {
                case 0:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 1:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iL << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 2:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.br(iL, unsafe.getLong(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 3:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.br(iL, unsafe.getLong(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 4:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.bn(iL, unsafe.getInt(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 5:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iL << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 6:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iL << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 7:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros4 = ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6) + 1;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 8:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        Object object = unsafe.getObject(obj2, jQ);
                        iBr = object instanceof lxa ? lxh.B(iL, (lxa) object) : lxh.D(iL, (String) object);
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 9:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iC = lza.c(iL, unsafe.getObject(obj2, jQ), lysVar.t(i2));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 10:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = lxh.B(iL, (lxa) unsafe.getObject(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 11:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.bq(iL, unsafe.getInt(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 12:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.bn(iL, unsafe.getInt(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 13:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iL << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 14:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iL << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i4 += iNumberOfLeadingZeros4;
                    }
                    lysVar = this;
                    obj2 = obj;
                    i2 += 3;
                    break;
                case 15:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.bo(iL, unsafe.getInt(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 16:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iBr = a.bp(iL, unsafe.getLong(obj2, jQ));
                        i4 += iBr;
                    }
                    lysVar = this;
                    i2 += 3;
                    break;
                case 17:
                    if (lysVar.H(obj2, i2, i5, i3, i)) {
                        iC = lza.a(iL, (lyp) unsafe.getObject(obj2, jQ), lysVar.t(i2));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 18:
                    List list = (List) unsafe.getObject(obj2, jQ);
                    Class cls = lza.a;
                    iC = a.bl(iL, list);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 19:
                    List list2 = (List) unsafe.getObject(obj2, jQ);
                    Class cls2 = lza.a;
                    iC = a.bk(iL, list2);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 20:
                    List list3 = (List) unsafe.getObject(obj2, jQ);
                    Class cls3 = lza.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iJ = lza.j(list3);
                        size = list3.size() * ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                    }
                    i4 += iNumberOfLeadingZeros8;
                    i2 += 3;
                    break;
                case 21:
                    List list4 = (List) unsafe.getObject(obj2, jQ);
                    Class cls4 = lza.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iC = 0;
                    } else {
                        iJ2 = lza.j(list4);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 22:
                    List list5 = (List) unsafe.getObject(obj2, jQ);
                    Class cls5 = lza.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iJ2 = lza.i(list5);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 23:
                    List list6 = (List) unsafe.getObject(obj2, jQ);
                    Class cls6 = lza.a;
                    iC = a.bl(iL, list6);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 24:
                    List list7 = (List) unsafe.getObject(obj2, jQ);
                    Class cls7 = lza.a;
                    iC = a.bk(iL, list7);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 25:
                    List list8 = (List) unsafe.getObject(obj2, jQ);
                    Class cls8 = lza.a;
                    int size3 = list8.size();
                    if (size3 != 0) {
                        iC = size3 * (((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6) + 1);
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 26:
                    List list9 = (List) unsafe.getObject(obj2, jQ);
                    Class cls9 = lza.a;
                    int size4 = list9.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        boolean z = list9 instanceof lyk;
                        iNumberOfLeadingZeros6 = ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6) * size4;
                        if (z) {
                            lyk lykVar = (lyk) list9;
                            for (int i10 = 0; i10 < size4; i10++) {
                                Object objC = lykVar.c();
                                iNumberOfLeadingZeros6 += objC instanceof lxa ? lxh.C((lxa) objC) : lxh.E((String) objC);
                            }
                        } else {
                            for (int i11 = 0; i11 < size4; i11++) {
                                Object obj5 = list9.get(i11);
                                iNumberOfLeadingZeros6 += obj5 instanceof lxa ? lxh.C((lxa) obj5) : lxh.E((String) obj5);
                            }
                        }
                    }
                    i4 += iNumberOfLeadingZeros6;
                    i2 += 3;
                    break;
                case 27:
                    List list10 = (List) unsafe.getObject(obj2, jQ);
                    lyz lyzVarT = lysVar.t(i2);
                    Class cls10 = lza.a;
                    int size5 = list10.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6) * size5;
                        for (int i12 = 0; i12 < size5; i12++) {
                            Object obj6 = list10.get(i12);
                            iNumberOfLeadingZeros7 += obj6 instanceof lyj ? ((lyj) obj6).a() : lza.b((lwn) obj6, lyzVarT);
                        }
                    }
                    i4 += iNumberOfLeadingZeros7;
                    i2 += 3;
                    break;
                case 28:
                    List list11 = (List) unsafe.getObject(obj2, jQ);
                    Class cls11 = lza.a;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        iNumberOfLeadingZeros8 = size6 * ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6);
                        for (int i13 = 0; i13 < list11.size(); i13++) {
                            iNumberOfLeadingZeros8 += lxh.C((lxa) list11.get(i13));
                        }
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                    }
                    i4 += iNumberOfLeadingZeros8;
                    i2 += 3;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj2, jQ);
                    Class cls12 = lza.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iJ2 = lza.f(list12);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 30:
                    List list13 = (List) unsafe.getObject(obj2, jQ);
                    Class cls13 = lza.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iJ2 = lza.i(list13);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 31:
                    List list14 = (List) unsafe.getObject(obj2, jQ);
                    Class cls14 = lza.a;
                    iC = a.bk(iL, list14);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 32:
                    List list15 = (List) unsafe.getObject(obj2, jQ);
                    Class cls15 = lza.a;
                    iC = a.bl(iL, list15);
                    i4 += iC;
                    i2 += 3;
                    break;
                case 33:
                    List list16 = (List) unsafe.getObject(obj2, jQ);
                    Class cls16 = lza.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iJ2 = lza.d(list16);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 34:
                    List list17 = (List) unsafe.getObject(obj2, jQ);
                    Class cls17 = lza.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iJ2 = lza.e(list17);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i4 += iC;
                    i2 += 3;
                    break;
                case 35:
                    List list18 = (List) unsafe.getObject(obj2, jQ);
                    Class cls18 = lza.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 36:
                    List list19 = (List) unsafe.getObject(obj2, jQ);
                    Class cls19 = lza.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 37:
                    size = lza.j((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 38:
                    size = lza.j((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 39:
                    size = lza.i((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 40:
                    List list20 = (List) unsafe.getObject(obj2, jQ);
                    Class cls20 = lza.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 41:
                    List list21 = (List) unsafe.getObject(obj2, jQ);
                    Class cls21 = lza.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 42:
                    List list22 = (List) unsafe.getObject(obj2, jQ);
                    Class cls22 = lza.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 43:
                    size = lza.f((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 44:
                    size = lza.i((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 45:
                    List list23 = (List) unsafe.getObject(obj2, jQ);
                    Class cls23 = lza.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 46:
                    List list24 = (List) unsafe.getObject(obj2, jQ);
                    Class cls24 = lza.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 47:
                    size = lza.d((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 48:
                    size = lza.e((List) unsafe.getObject(obj2, jQ));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iL << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        i4 += iNumberOfLeadingZeros8;
                    }
                    i2 += 3;
                    break;
                case 49:
                    List list25 = (List) unsafe.getObject(obj2, jQ);
                    lyz lyzVarT2 = lysVar.t(i2);
                    Class cls25 = lza.a;
                    int size7 = list25.size();
                    if (size7 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i14 = 0; i14 < size7; i14++) {
                            iA += lza.a(iL, (lyp) list25.get(i14), lyzVarT2);
                        }
                    }
                    i4 += iA;
                    i2 += 3;
                    break;
                case 50:
                    lym lymVar = (lym) unsafe.getObject(obj2, jQ);
                    if (lymVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = lymVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i2 += 3;
                case 51:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 52:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 53:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.br(iL, r(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 54:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.br(iL, r(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 55:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.bn(iL, m(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 56:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 57:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 58:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = ((352 - (Integer.numberOfLeadingZeros(iL << 3) * 9)) >>> 6) + 1;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 59:
                    if (lysVar.L(obj2, iL, i2)) {
                        Object object2 = unsafe.getObject(obj2, jQ);
                        iC = object2 instanceof lxa ? lxh.B(iL, (lxa) object2) : lxh.D(iL, (String) object2);
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 60:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = lza.c(iL, unsafe.getObject(obj2, jQ), lysVar.t(i2));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 61:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = lxh.B(iL, (lxa) unsafe.getObject(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 62:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.bq(iL, m(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 63:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.bn(iL, m(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 64:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 65:
                    if (lysVar.L(obj2, iL, i2)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iL << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 66:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.bo(iL, m(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 67:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = a.bp(iL, r(obj2, jQ));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                case 68:
                    if (lysVar.L(obj2, iL, i2)) {
                        iC = lza.a(iL, (lyp) unsafe.getObject(obj2, jQ), lysVar.t(i2));
                        i4 += iC;
                    }
                    i2 += 3;
                    break;
                default:
                    i2 += 3;
                    break;
            }
        }
    }

    @Override // defpackage.lyz
    public final int b(Object obj) {
        int i;
        int iHashCode = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int iP = p(i2);
            int i3 = (iP >>> 20) & 255;
            if (i3 <= 50 || i3 >= 69) {
                long jQ = q(iP);
                int iAk = 37;
                switch (i3) {
                    case 0:
                        i = iHashCode * 53;
                        long jDoubleToLongBits = Double.doubleToLongBits(lzn.a(obj, jQ));
                        byte[] bArr = lyf.a;
                        iAk = a.ak(jDoubleToLongBits);
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iAk = Float.floatToIntBits(lzn.b(obj, jQ));
                        break;
                    case 2:
                        i = iHashCode * 53;
                        long jD = lzn.d(obj, jQ);
                        byte[] bArr2 = lyf.a;
                        iAk = a.ak(jD);
                        break;
                    case 3:
                        i = iHashCode * 53;
                        long jD2 = lzn.d(obj, jQ);
                        byte[] bArr3 = lyf.a;
                        iAk = a.ak(jD2);
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 5:
                        i = iHashCode * 53;
                        long jD3 = lzn.d(obj, jQ);
                        byte[] bArr4 = lyf.a;
                        iAk = a.ak(jD3);
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zS = lzn.s(obj, jQ);
                        byte[] bArr5 = lyf.a;
                        iAk = a.aj(zS);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iAk = ((String) lzn.f(obj, jQ)).hashCode();
                        break;
                    case 9:
                        i = iHashCode * 53;
                        Object objF = lzn.f(obj, jQ);
                        if (objF != null) {
                            iAk = objF.hashCode();
                        }
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iAk = lzn.f(obj, jQ).hashCode();
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 14:
                        i = iHashCode * 53;
                        long jD4 = lzn.d(obj, jQ);
                        byte[] bArr6 = lyf.a;
                        iAk = a.ak(jD4);
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iAk = lzn.c(obj, jQ);
                        break;
                    case 16:
                        i = iHashCode * 53;
                        long jD5 = lzn.d(obj, jQ);
                        byte[] bArr7 = lyf.a;
                        iAk = a.ak(jD5);
                        break;
                    case 17:
                        i = iHashCode * 53;
                        Object objF2 = lzn.f(obj, jQ);
                        if (objF2 != null) {
                            iAk = objF2.hashCode();
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = iHashCode * 53;
                        iAk = lzn.f(obj, jQ).hashCode();
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iAk = lzn.f(obj, jQ).hashCode();
                        break;
                    default:
                        continue;
                }
                iHashCode = i + iAk;
            }
        }
        int i4 = this.k;
        while (true) {
            int[] iArr = this.i;
            if (i4 >= iArr.length) {
                int iHashCode2 = (iHashCode * 53) + this.l.b(obj).hashCode();
                return this.h ? (iHashCode2 * 53) + ixt.M(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!L(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + lzn.f(obj, q(p(i5))).hashCode();
            }
            i4++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int c(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.lwq r43) {
        /*
            Method dump skipped, instruction units count: 3748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lys.c(java.lang.Object, byte[], int, int, int, lwq):int");
    }

    @Override // defpackage.lyz
    public final Object e() {
        return ((lxt) this.g).x();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // defpackage.lyz
    public final void f(Object obj) {
        if (J(obj)) {
            if (obj instanceof lxt) {
                lxt lxtVar = (lxt) obj;
                lxtVar.F(Alert.DURATION_SHOW_INDEFINITELY);
                lxtVar.memoizedHashCode = 0;
                lxtVar.D();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iP = p(i);
                long jQ = q(iP);
                int i2 = (iP >>> 20) & 255;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (G(obj, i)) {
                                    t(i).f(b.getObject(obj, jQ));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ixt.L(obj, jQ).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, jQ);
                                if (object != null) {
                                    ((lym) object).c();
                                    unsafe.putObject(obj, jQ, object);
                                }
                                break;
                        }
                    } else if (L(obj, l(i), i)) {
                        t(i).f(b.getObject(obj, jQ));
                    }
                } else if (G(obj, i)) {
                    t(i).f(b.getObject(obj, jQ));
                }
            }
            this.l.c(obj);
            if (this.h) {
                ixt.N(obj);
            }
        }
    }

    @Override // defpackage.lyz
    public final void g(Object obj, Object obj2) {
        y(obj);
        lyf.a(obj2);
        for (int i = 0; i < this.c.length; i += 3) {
            int iP = p(i);
            long jQ = q(iP);
            int iL = l(i);
            switch ((iP >>> 20) & 255) {
                case 0:
                    if (G(obj2, i)) {
                        lzn.m(obj, jQ, lzn.a(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 1:
                    if (G(obj2, i)) {
                        lzn.n(obj, jQ, lzn.b(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 2:
                    if (G(obj2, i)) {
                        lzn.p(obj, jQ, lzn.d(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 3:
                    if (G(obj2, i)) {
                        lzn.p(obj, jQ, lzn.d(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 4:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 5:
                    if (G(obj2, i)) {
                        lzn.p(obj, jQ, lzn.d(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 6:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 7:
                    if (G(obj2, i)) {
                        lzn.j(obj, jQ, lzn.s(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 8:
                    if (G(obj2, i)) {
                        lzn.q(obj, jQ, lzn.f(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 9:
                    z(obj, obj2, i);
                    break;
                case 10:
                    if (G(obj2, i)) {
                        lzn.q(obj, jQ, lzn.f(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 11:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 12:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 13:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 14:
                    if (G(obj2, i)) {
                        lzn.p(obj, jQ, lzn.d(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 15:
                    if (G(obj2, i)) {
                        lzn.o(obj, jQ, lzn.c(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 16:
                    if (G(obj2, i)) {
                        lzn.p(obj, jQ, lzn.d(obj2, jQ));
                        B(obj, i);
                    }
                    break;
                case 17:
                    z(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    lye lyeVarL = ixt.L(obj, jQ);
                    lye lyeVarL2 = ixt.L(obj2, jQ);
                    int size = lyeVarL.size();
                    int size2 = lyeVarL2.size();
                    if (size > 0 && size2 > 0) {
                        if (!lyeVarL.c()) {
                            lyeVarL = lyeVarL.e(size2 + size);
                        }
                        lyeVarL.addAll(lyeVarL2);
                    }
                    if (size > 0) {
                        lyeVarL2 = lyeVarL;
                    }
                    lzn.q(obj, jQ, lyeVarL2);
                    break;
                case 50:
                    Class cls = lza.a;
                    lzn.q(obj, jQ, mdu.q(lzn.f(obj, jQ), lzn.f(obj2, jQ)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (L(obj2, iL, i)) {
                        lzn.q(obj, jQ, lzn.f(obj2, jQ));
                        C(obj, iL, i);
                    }
                    break;
                case 60:
                    A(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (L(obj2, iL, i)) {
                        lzn.q(obj, jQ, lzn.f(obj2, jQ));
                        C(obj, iL, i);
                    }
                    break;
                case 68:
                    A(obj, obj2, i);
                    break;
            }
        }
        lza.h(this.l, obj, obj2);
        if (this.h) {
            lza.k(obj, obj2);
        }
    }

    @Override // defpackage.lyz
    public final void h(Object obj, byte[] bArr, int i, int i2, lwq lwqVar) {
        c(obj, bArr, i, i2, 0, lwqVar);
    }

    @Override // defpackage.lyz
    public final boolean i(Object obj, Object obj2) {
        boolean zAe;
        for (int i = 0; i < this.c.length; i += 3) {
            int iP = p(i);
            int i2 = (iP >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jQ = q(iP);
                switch (i2) {
                    case 0:
                        if (!F(obj, obj2, i) || Double.doubleToLongBits(lzn.a(obj, jQ)) != Double.doubleToLongBits(lzn.a(obj2, jQ))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!F(obj, obj2, i) || Float.floatToIntBits(lzn.b(obj, jQ)) != Float.floatToIntBits(lzn.b(obj2, jQ))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!F(obj, obj2, i) || lzn.d(obj, jQ) != lzn.d(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!F(obj, obj2, i) || lzn.d(obj, jQ) != lzn.d(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!F(obj, obj2, i) || lzn.d(obj, jQ) != lzn.d(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!F(obj, obj2, i) || lzn.s(obj, jQ) != lzn.s(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!F(obj, obj2, i)) {
                            return false;
                        }
                        Object objF = lzn.f(obj, jQ);
                        Object objF2 = lzn.f(obj2, jQ);
                        Class cls = lza.a;
                        if (!a.ae(objF, objF2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!F(obj, obj2, i)) {
                            return false;
                        }
                        Object objF3 = lzn.f(obj, jQ);
                        Object objF4 = lzn.f(obj2, jQ);
                        Class cls2 = lza.a;
                        if (!a.ae(objF3, objF4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!F(obj, obj2, i)) {
                            return false;
                        }
                        Object objF5 = lzn.f(obj, jQ);
                        Object objF6 = lzn.f(obj2, jQ);
                        Class cls3 = lza.a;
                        if (!a.ae(objF5, objF6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!F(obj, obj2, i) || lzn.d(obj, jQ) != lzn.d(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!F(obj, obj2, i) || lzn.c(obj, jQ) != lzn.c(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!F(obj, obj2, i) || lzn.d(obj, jQ) != lzn.d(obj2, jQ)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!F(obj, obj2, i)) {
                            return false;
                        }
                        Object objF7 = lzn.f(obj, jQ);
                        Object objF8 = lzn.f(obj2, jQ);
                        Class cls4 = lza.a;
                        if (!a.ae(objF7, objF8)) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        Object objF9 = lzn.f(obj, jQ);
                        Object objF10 = lzn.f(obj2, jQ);
                        Class cls5 = lza.a;
                        zAe = a.ae(objF9, objF10);
                        break;
                    case 50:
                        Object objF11 = lzn.f(obj, jQ);
                        Object objF12 = lzn.f(obj2, jQ);
                        Class cls6 = lza.a;
                        zAe = a.ae(objF11, objF12);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (!K(obj, obj2, i)) {
                            return false;
                        }
                        Object objF13 = lzn.f(obj, jQ);
                        Object objF14 = lzn.f(obj2, jQ);
                        Class cls7 = lza.a;
                        if (!a.ae(objF13, objF14)) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zAe) {
                    return false;
                }
            }
        }
        int i3 = this.k;
        while (true) {
            int[] iArr = this.i;
            if (i3 >= iArr.length) {
                lzg lzgVar = this.l;
                if (!lzgVar.b(obj).equals(lzgVar.b(obj2))) {
                    return false;
                }
                if (this.h) {
                    return ixt.M(obj).equals(ixt.M(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!K(obj, obj2, i4)) {
                return false;
            }
            if (!L(obj, 0, i4)) {
                long jQ2 = q(p(i4));
                Object objF15 = lzn.f(obj, jQ2);
                Object objF16 = lzn.f(obj2, jQ2);
                Class cls8 = lza.a;
                if (!a.ae(objF15, objF16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[LOOP:1: B:41:0x00a4->B:45:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7 A[SYNTHETIC] */
    @Override // defpackage.lyz
    public final boolean j(Object obj) {
        int i;
        int i2;
        List list;
        lyz lyzVarT;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.j) {
            int i7 = this.i[i4];
            int iP = this.p(i7);
            int i8 = this.c[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = b.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i6;
                i2 = i5;
            }
            lys lysVar = this;
            Object obj2 = obj;
            if (a.ag(iP) && !lysVar.H(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iP >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (lysVar.H(obj2, i7, i, i2, i10) && !I(obj2, iP, lysVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (List) lzn.f(obj2, q(iP));
                if (list.isEmpty()) {
                    continue;
                } else {
                    lyzVarT = lysVar.t(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (lyzVarT.j(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (lysVar.L(obj2, lysVar.l(i7), i7) && !I(obj2, iP, lysVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (List) lzn.f(obj2, q(iP));
                if (list.isEmpty()) {
                    lyzVarT = lysVar.t(i7);
                    while (i3 < list.size()) {
                        if (lyzVarT.j(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50 && !((lym) lzn.f(obj2, q(iP))).isEmpty()) {
                Object obj3 = mdu.r(lysVar.v(i7)).b;
                throw null;
            }
            i4++;
            this = lysVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        Object obj4 = obj;
        if (this.h) {
            ixt.M(obj4).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.lyz
    public final void k(Object obj, lqa lqaVar) {
        Map.Entry entry;
        int i;
        lys lysVar = this;
        if (lysVar.h) {
            lxn lxnVarM = ixt.M(obj);
            if (lxnVarM.c()) {
                entry = null;
            } else {
                entry = (Map.Entry) lxnVarM.a().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = lysVar.c;
        Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iP = lysVar.p(i4);
            int iL = lysVar.l(i4);
            int i6 = (iP >>> 20) & 255;
            if (i6 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long jQ = q(iP);
            switch (i6) {
                case 0:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.c(iL, lzn.a(obj, jQ));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.g(iL, lzn.b(obj, jQ));
                    }
                    break;
                case 2:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.j(iL, unsafe.getLong(obj, jQ));
                    }
                    break;
                case 3:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.q(iL, unsafe.getLong(obj, jQ));
                    }
                    break;
                case 4:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.i(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 5:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.f(iL, unsafe.getLong(obj, jQ));
                    }
                    break;
                case 6:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.e(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 7:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.a(iL, lzn.s(obj, jQ));
                    }
                    break;
                case 8:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        N(iL, unsafe.getObject(obj, jQ), lqaVar);
                    }
                    break;
                case 9:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.k(iL, unsafe.getObject(obj, jQ), lysVar.t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.b(iL, (lxa) unsafe.getObject(obj, jQ));
                    }
                    break;
                case 11:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.p(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 12:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.d(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 13:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.l(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 14:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.m(iL, unsafe.getLong(obj, jQ));
                    }
                    break;
                case 15:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.n(iL, unsafe.getInt(obj, jQ));
                    }
                    break;
                case 16:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.o(iL, unsafe.getLong(obj, jQ));
                    }
                    break;
                case 17:
                    if (lysVar.H(obj, i4, i3, i5, i)) {
                        lqaVar.h(iL, unsafe.getObject(obj, jQ), lysVar.t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    lza.n(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    lza.o(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    lza.v(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    lza.v(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    lza.s(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    lza.u(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    lza.t(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    lza.m(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int iL2 = lysVar.l(i4);
                    List list = (List) unsafe.getObject(obj, jQ);
                    Class cls = lza.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof lyk) {
                            lyk lykVar = (lyk) list;
                            for (int i9 = 0; i9 < list.size(); i9++) {
                                Object objC = lykVar.c();
                                if (objC instanceof String) {
                                    ((lxh) lqaVar.a).o(iL2, (String) objC);
                                } else {
                                    ((lxh) lqaVar.a).f(iL2, (lxa) objC);
                                }
                            }
                        } else {
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                ((lxh) lqaVar.a).o(iL2, (String) list.get(i10));
                            }
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    int iL3 = lysVar.l(i4);
                    List list2 = (List) unsafe.getObject(obj, jQ);
                    lyz lyzVarT = lysVar.t(i4);
                    Class cls2 = lza.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            lqaVar.k(iL3, list2.get(i11), lyzVarT);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    int iL4 = lysVar.l(i4);
                    List list3 = (List) unsafe.getObject(obj, jQ);
                    Class cls3 = lza.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        for (int i12 = 0; i12 < list3.size(); i12++) {
                            ((lxh) lqaVar.a).f(iL4, (lxa) list3.get(i12));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    lza.r(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    lza.s(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    lza.t(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    lza.u(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    lza.p(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    lza.q(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    lza.n(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 36:
                    lza.o(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 37:
                    lza.v(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    lza.v(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 39:
                    lza.s(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 40:
                    lza.u(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 41:
                    lza.t(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 42:
                    lza.m(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    lza.r(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 44:
                    lza.s(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 45:
                    lza.t(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    lza.u(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    lza.p(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    lza.q(lysVar.l(i4), (List) unsafe.getObject(obj, jQ), lqaVar, true);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    int iL5 = lysVar.l(i4);
                    List list4 = (List) unsafe.getObject(obj, jQ);
                    lyz lyzVarT2 = lysVar.t(i4);
                    Class cls4 = lza.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i13 = 0; i13 < list4.size(); i13++) {
                            lqaVar.h(iL5, list4.get(i13), lyzVarT2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, jQ);
                    if (object != null) {
                        sdo sdoVarR = mdu.r(lysVar.v(i4));
                        Object obj2 = lqaVar.a;
                        Iterator it = ((lym) object).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            lxh lxhVar = (lxh) obj2;
                            lxhVar.q(iL, 2);
                            entry2.getKey();
                            entry2.getValue();
                            lxhVar.s(mdu.t(sdoVarR));
                            mdu.s(lxhVar, sdoVarR, entry2.getKey(), entry2.getValue());
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.c(iL, ((Double) lzn.f(obj, jQ)).doubleValue());
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.g(iL, ((Float) lzn.f(obj, jQ)).floatValue());
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.j(iL, r(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.q(iL, r(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.i(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.f(iL, r(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.e(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.a(iL, ((Boolean) lzn.f(obj, jQ)).booleanValue());
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (lysVar.L(obj, iL, i4)) {
                        N(iL, unsafe.getObject(obj, jQ), lqaVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.k(iL, unsafe.getObject(obj, jQ), lysVar.t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.b(iL, (lxa) unsafe.getObject(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.p(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.d(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.l(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.m(iL, r(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.n(iL, m(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.o(iL, r(obj, jQ));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (lysVar.L(obj, iL, i4)) {
                        lqaVar.h(iL, unsafe.getObject(obj, jQ), lysVar.t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
            lysVar = this;
            i4 += 3;
            i2 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        lysVar.l.b(obj).e(lqaVar);
    }
}
