package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.chromium.base.AndroidInfo;
import org.chromium.base.Callback2;
import org.chromium.base.JniAndroid;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axqy implements axre {
    public static final int[] a = new int[0];
    public static final Unsafe b = axrq.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final axqv g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final axrl m;

    public axqy(int[] iArr, Object[] objArr, int i, int i2, axqv axqvVar, int[] iArr2, int i3, int i4, axrl axrlVar, AndroidInfo androidInfo) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = axqvVar instanceof axqf;
        boolean z = false;
        if (androidInfo != null && (axqvVar instanceof axqe)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = axrlVar;
        this.g = axqvVar;
    }

    private final void A(Object obj, int i, Object obj2) {
        b.putObject(obj, n(m(i)), obj2);
        y(obj, i);
    }

    private final void B(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, n(m(i2)), obj2);
        z(obj, i, i2);
    }

    private final boolean C(Object obj, Object obj2, int i) {
        return D(obj, i) == D(obj2, i);
    }

    private final boolean D(Object obj, int i) {
        int iL = l(i);
        long j = iL & 1048575;
        if (j == 1048575) {
            int iM = m(i);
            long j2 = 1048575 & iM;
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(axrq.b(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(axrq.c(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (axrq.e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (axrq.e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (axrq.e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return axrq.a.f(obj, j2);
                case 8:
                    Object objI = axrq.a.i(obj, j2);
                    if (objI instanceof String) {
                        if (((String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof axpo)) {
                            return J();
                        }
                        if (axpo.d.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (axrq.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (axpo.d.equals(axrq.a.i(obj, j2))) {
                        return false;
                    }
                    break;
                case 11:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (axrq.e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (axrq.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (axrq.e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (axrq.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    return J();
            }
        } else {
            if ((axrq.a.g(obj, j) & (1 << (iL >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean E(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return D(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean F(Object obj, int i, axre axreVar) {
        return axreVar.h(axrq.g(obj, n(i)));
    }

    private static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof axqf) {
            return ((axqf) obj).r();
        }
        return true;
    }

    private final boolean H(Object obj, Object obj2, int i) {
        long jL = l(i) & 1048575;
        return axrq.d(obj, jL) == axrq.d(obj2, jL);
    }

    private final boolean I(Object obj, int i, int i2) {
        return axrq.d(obj, (long) (l(i2) & 1048575)) == i;
    }

    private boolean J() {
        throw new IllegalArgumentException();
    }

    private final axpc K(int i) {
        return (axpc) this.d[((i / 3) << 1) + 1];
    }

    private static final void L(int i, Object obj, axkl axklVar) throws axpu {
        if (!(obj instanceof String)) {
            axklVar.i(i, (axpo) obj);
        } else {
            ((axpk) axklVar.a).v(i, (String) obj);
        }
    }

    private final int j(int i) {
        return this.c[i];
    }

    private static int k(Object obj, long j) {
        return ((Integer) axrq.g(obj, j)).intValue();
    }

    private final int l(int i) {
        return this.c[i + 2];
    }

    private final int m(int i) {
        return this.c[i + 1];
    }

    private static long n(int i) {
        return i & 1048575;
    }

    private static long o(Object obj, long j) {
        return ((Long) axrq.g(obj, j)).longValue();
    }

    private final Object p(Object obj, int i, Object obj2, axrl axrlVar, Object obj3) {
        int iJ = j(i);
        Object objI = axrq.a.i(obj, m(i) & 1048575);
        if (objI != null && K(i) != null) {
            Object obj4 = ((axkl) q(i)).a;
            Iterator it = ((axqs) objI).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!axpc.a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = axrlVar.b(obj3);
                    }
                    int iF = axkl.f((axqr) obj4, entry.getKey(), entry.getValue());
                    axpo axpoVar = axpo.d;
                    byte[] bArr = new byte[iF];
                    axpk axpkVar = new axpk(bArr, iF);
                    try {
                        axkl.g(axpkVar, (axqr) obj4, entry.getKey(), entry.getValue());
                        ((axrm) obj2).e((iJ << 3) | 2, Callback2.JniHelper.a(bArr, axpkVar));
                        it.remove();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private final Object q(int i) {
        return this.d[(i / 3) << 1];
    }

    private final Object r(Object obj, int i) {
        axre axreVarT = t(i);
        long jN = n(m(i));
        if (!D(obj, i)) {
            return axreVarT.c();
        }
        Object object = b.getObject(obj, jN);
        if (G(object)) {
            return object;
        }
        Object objC = axreVarT.c();
        if (object != null) {
            axreVarT.e(objC, object);
        }
        return objC;
    }

    private final Object s(Object obj, int i, int i2) {
        axre axreVarT = t(i2);
        if (!I(obj, i, i2)) {
            return axreVarT.c();
        }
        Object object = b.getObject(obj, n(m(i2)));
        if (G(object)) {
            return object;
        }
        Object objC = axreVarT.c();
        if (object != null) {
            axreVarT.e(objC, object);
        }
        return objC;
    }

    private final axre t(int i) {
        Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        axre axreVar = (axre) objArr[i2];
        if (axreVar != null) {
            return axreVar;
        }
        axre axreVarA = axrb.a.a((Class) objArr[i2 + 1]);
        objArr[i2] = axreVarA;
        return axreVarA;
    }

    private static void u(Object obj) {
        if (G(obj)) {
            return;
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void v(Object obj, Object obj2, int i) {
        if (D(obj2, i)) {
            long jN = n(m(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            axre axreVarT = t(i);
            if (!D(obj, i)) {
                if (G(object)) {
                    Object objC = axreVarT.c();
                    axreVarT.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                y(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!G(object2)) {
                Object objC2 = axreVarT.c();
                axreVarT.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            axreVarT.e(object2, object);
        }
    }

    private final void w(Object obj, Object obj2, int i) {
        int iJ = j(i);
        if (I(obj2, iJ, i)) {
            long jN = n(m(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            axre axreVarT = t(i);
            if (!I(obj, iJ, i)) {
                if (G(object)) {
                    Object objC = axreVarT.c();
                    axreVarT.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                z(obj, iJ, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!G(object2)) {
                Object objC2 = axreVarT.c();
                axreVarT.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            axreVarT.e(object2, object);
        }
    }

    private final void x(Object obj, int i, axpt axptVar) throws axql {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            axrq.a.l(obj, j, axptVar.r());
        } else if (this.i) {
            axrq.a.l(obj, j, axptVar.q());
        } else {
            axrq.a.l(obj, j, axptVar.s());
        }
    }

    private final void y(Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j != 1048575) {
            axrp axrpVar = axrq.a;
            axrpVar.j(obj, j, axrpVar.g(obj, j) | (1 << (iL >>> 20)));
        }
    }

    private final void z(Object obj, int i, int i2) {
        axrq.a.j(obj, l(i2) & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0493  */
    /* JADX WARN: Code duplicated, block: B:198:0x057e  */
    /* JADX WARN: Code duplicated, block: B:203:0x05a3  */
    @Override // defpackage.axre
    public final int a(Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iNumberOfLeadingZeros5;
        int iC;
        int iK;
        int size;
        int size2;
        int iK2;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iNumberOfLeadingZeros11;
        int iA;
        int iNumberOfLeadingZeros12;
        axqy axqyVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iNumberOfLeadingZeros13 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = axqyVar.c;
            if (i3 >= iArr.length) {
                int iA2 = iNumberOfLeadingZeros13 + axqyVar.m.c(obj2).a();
                if (axqyVar.h) {
                    axri axriVar = AndroidInfo.e(obj2).b;
                    if (axriVar.size() > 0) {
                        axrg axrgVar = (axrg) axriVar.a(0);
                        lxs lxsVar = axrgVar.c;
                        Object obj3 = axrgVar.a;
                        throw null;
                    }
                }
                return iA2;
            }
            int iM = axqyVar.m(i3);
            int iJ = axqyVar.j(i3);
            int i6 = iArr[i3 + 2];
            int i7 = i6 & i2;
            int i8 = (iM >>> 20) & 255;
            if (i8 <= 17) {
                if (i7 != i5) {
                    i4 = i7 == i2 ? 0 : unsafe.getInt(obj2, i7);
                    i5 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iM & i2;
            if (i8 >= axqb.DOUBLE_LIST_PACKED.Z) {
                int i10 = axqb.SINT64_LIST_PACKED.Z;
            }
            long j = i9;
            switch (i8) {
                case 0:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 1:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 2:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(unsafe.getLong(obj2, j)) * 9)) >>> 6);
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 3:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = a.br(iJ, unsafe.getLong(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 4:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros13 += ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(unsafe.getInt(obj2, j)) * 9)) >>> 6);
                    }
                    axqyVar = this;
                    break;
                case 5:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros4 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 6:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 7:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros5 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 8:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof axpo) {
                            iNumberOfLeadingZeros3 = axpk.a(iJ, (axpo) object);
                        } else {
                            int iNumberOfLeadingZeros14 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int i11 = axrs.a;
                            int iD = JniAndroid.d((String) object);
                            iNumberOfLeadingZeros3 = ((352 - iNumberOfLeadingZeros14) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                        }
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 9:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iC = axrf.c(iJ, unsafe.getObject(obj2, j), axqyVar.t(i3));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 10:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = axpk.a(iJ, (axpo) unsafe.getObject(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 11:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = a.bq(iJ, unsafe.getInt(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 12:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = a.bn(iJ, unsafe.getInt(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 13:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 14:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros4 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros5;
                    }
                    axqyVar = this;
                    obj2 = obj;
                    break;
                case 15:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = a.bo(iJ, unsafe.getInt(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 16:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iNumberOfLeadingZeros3 = a.bp(iJ, unsafe.getLong(obj2, j));
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros3;
                    }
                    axqyVar = this;
                    break;
                case 17:
                    if (axqyVar.E(obj2, i3, i5, i4, i)) {
                        iC = axrf.a(iJ, (axqv) unsafe.getObject(obj2, j), axqyVar.t(i3));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 18:
                    List list = (List) unsafe.getObject(obj2, j);
                    Class cls = axrf.a;
                    iC = a.bl(iJ, list);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 19:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    Class cls2 = axrf.a;
                    iC = a.bk(iJ, list2);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 20:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    Class cls3 = axrf.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros9 = 0;
                    } else {
                        iK = axrf.k(list3);
                        size = list3.size() * ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    break;
                case 21:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    Class cls4 = axrf.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iC = 0;
                    } else {
                        iK2 = axrf.k(list4);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 22:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    Class cls5 = axrf.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iK2 = axrf.j(list5);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 23:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    Class cls6 = axrf.a;
                    iC = a.bl(iJ, list6);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 24:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    Class cls7 = axrf.a;
                    iC = a.bk(iJ, list7);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 25:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    Class cls8 = axrf.a;
                    int size3 = list8.size();
                    if (size3 != 0) {
                        iC = size3 * (((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1);
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 26:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    Class cls9 = axrf.a;
                    int size4 = list9.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        boolean z = list9 instanceof axqp;
                        iNumberOfLeadingZeros7 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size4;
                        if (z) {
                            axqp axqpVar = (axqp) list9;
                            for (int i12 = 0; i12 < size4; i12++) {
                                Object objB = axqpVar.b();
                                iNumberOfLeadingZeros7 += objB instanceof axpo ? axpk.b((axpo) objB) : axpk.c((String) objB);
                            }
                        } else {
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object obj4 = list9.get(i13);
                                iNumberOfLeadingZeros7 += obj4 instanceof axpo ? axpk.b((axpo) obj4) : axpk.c((String) obj4);
                            }
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros7;
                    break;
                case 27:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    axre axreVarT = axqyVar.t(i3);
                    Class cls10 = axrf.a;
                    int size5 = list10.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iNumberOfLeadingZeros8 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size5;
                        for (int i14 = 0; i14 < size5; i14++) {
                            Object obj5 = list10.get(i14);
                            iNumberOfLeadingZeros8 += obj5 instanceof axqo ? ((axqo) obj5).a() : axrf.b((axpg) obj5, axreVarT);
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    break;
                case 28:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    Class cls11 = axrf.a;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        iNumberOfLeadingZeros9 = size6 * ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        for (int i15 = 0; i15 < list11.size(); i15++) {
                            iNumberOfLeadingZeros9 += axpk.b((axpo) list11.get(i15));
                        }
                    } else {
                        iNumberOfLeadingZeros9 = 0;
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    Class cls12 = axrf.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iK2 = axrf.f(list12);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 30:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    Class cls13 = axrf.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iK2 = axrf.j(list13);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 31:
                    List list14 = (List) unsafe.getObject(obj2, j);
                    Class cls14 = axrf.a;
                    iC = a.bk(iJ, list14);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 32:
                    List list15 = (List) unsafe.getObject(obj2, j);
                    Class cls15 = axrf.a;
                    iC = a.bl(iJ, list15);
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 33:
                    List list16 = (List) unsafe.getObject(obj2, j);
                    Class cls16 = axrf.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iK2 = axrf.d(list16);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 34:
                    List list17 = (List) unsafe.getObject(obj2, j);
                    Class cls17 = axrf.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iK2 = axrf.e(list17);
                        iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    iNumberOfLeadingZeros13 += iC;
                    break;
                case 35:
                    List list18 = (List) unsafe.getObject(obj2, j);
                    Class cls18 = axrf.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 36:
                    List list19 = (List) unsafe.getObject(obj2, j);
                    Class cls19 = axrf.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 37:
                    size = axrf.k((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 38:
                    size = axrf.k((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 39:
                    size = axrf.j((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 40:
                    List list20 = (List) unsafe.getObject(obj2, j);
                    Class cls20 = axrf.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 41:
                    List list21 = (List) unsafe.getObject(obj2, j);
                    Class cls21 = axrf.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 42:
                    List list22 = (List) unsafe.getObject(obj2, j);
                    Class cls22 = axrf.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 43:
                    size = axrf.f((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 44:
                    size = axrf.j((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 45:
                    List list23 = (List) unsafe.getObject(obj2, j);
                    Class cls23 = axrf.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 46:
                    List list24 = (List) unsafe.getObject(obj2, j);
                    Class cls24 = axrf.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 47:
                    size = axrf.d((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 48:
                    size = axrf.e((List) unsafe.getObject(obj2, j));
                    if (size > 0) {
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros10) >>> 6) + ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6);
                        iNumberOfLeadingZeros9 = iK + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros9;
                    }
                    break;
                case 49:
                    List list25 = (List) unsafe.getObject(obj2, j);
                    axre axreVarT2 = axqyVar.t(i3);
                    Class cls25 = axrf.a;
                    int size7 = list25.size();
                    if (size7 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i16 = 0; i16 < size7; i16++) {
                            iA += axrf.a(iJ, (axqv) list25.get(i16), axreVarT2);
                        }
                    }
                    iNumberOfLeadingZeros13 += iA;
                    break;
                case 50:
                    axqs axqsVar = (axqs) unsafe.getObject(obj2, j);
                    axkl axklVar = (axkl) axqyVar.q(i3);
                    if (axqsVar.isEmpty()) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                        for (Map.Entry entry : axqsVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int iNumberOfLeadingZeros15 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int iF = axkl.f((axqr) axklVar.a, key, value);
                            iNumberOfLeadingZeros8 += ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iF) * 9)) >>> 6) + iF;
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    break;
                case 51:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 52:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 53:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(o(obj2, j)) * 9)) >>> 6);
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 54:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = a.br(iJ, o(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 55:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros7 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(k(obj2, j)) * 9)) >>> 6);
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros7;
                    }
                    break;
                case 56:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 57:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 58:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 59:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof axpo) {
                            iC = axpk.a(iJ, (axpo) object2);
                        } else {
                            int iNumberOfLeadingZeros16 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int i17 = axrs.a;
                            int iD2 = JniAndroid.d((String) object2);
                            iC = ((352 - iNumberOfLeadingZeros16) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD2) * 9)) >>> 6) + iD2;
                        }
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 60:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = axrf.c(iJ, unsafe.getObject(obj2, j), axqyVar.t(i3));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 61:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = axpk.a(iJ, (axpo) unsafe.getObject(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 62:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = a.bq(iJ, k(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 63:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = a.bn(iJ, k(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 64:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 65:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 66:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = a.bo(iJ, k(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 67:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = a.bp(iJ, o(obj2, j));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
                case 68:
                    if (axqyVar.I(obj2, iJ, i3)) {
                        iC = axrf.a(iJ, (axqv) unsafe.getObject(obj2, j), axqyVar.t(i3));
                        iNumberOfLeadingZeros13 += iC;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
    }

    @Override // defpackage.axre
    public final int b(Object obj) {
        int i;
        int iHashCode = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int iM = m(i2);
            int i3 = (iM >>> 20) & 255;
            if (i3 <= 50 || i3 >= 69) {
                long jN = n(iM);
                int iAk = 37;
                switch (i3) {
                    case 0:
                        i = iHashCode * 53;
                        long jDoubleToLongBits = Double.doubleToLongBits(axrq.b(obj, jN));
                        byte[] bArr = axqj.a;
                        iAk = a.ak(jDoubleToLongBits);
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iAk = Float.floatToIntBits(axrq.c(obj, jN));
                        break;
                    case 2:
                        i = iHashCode * 53;
                        long jE = axrq.e(obj, jN);
                        byte[] bArr2 = axqj.a;
                        iAk = a.ak(jE);
                        break;
                    case 3:
                        i = iHashCode * 53;
                        long jE2 = axrq.e(obj, jN);
                        byte[] bArr3 = axqj.a;
                        iAk = a.ak(jE2);
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 5:
                        i = iHashCode * 53;
                        long jE3 = axrq.e(obj, jN);
                        byte[] bArr4 = axqj.a;
                        iAk = a.ak(jE3);
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zR = axrq.r(obj, jN);
                        byte[] bArr5 = axqj.a;
                        iAk = a.aj(zR);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iAk = ((String) axrq.g(obj, jN)).hashCode();
                        break;
                    case 9:
                        i = iHashCode * 53;
                        Object objG = axrq.g(obj, jN);
                        if (objG != null) {
                            iAk = objG.hashCode();
                        }
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iAk = axrq.g(obj, jN).hashCode();
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 14:
                        i = iHashCode * 53;
                        long jE4 = axrq.e(obj, jN);
                        byte[] bArr6 = axqj.a;
                        iAk = a.ak(jE4);
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iAk = axrq.d(obj, jN);
                        break;
                    case 16:
                        i = iHashCode * 53;
                        long jE5 = axrq.e(obj, jN);
                        byte[] bArr7 = axqj.a;
                        iAk = a.ak(jE5);
                        break;
                    case 17:
                        i = iHashCode * 53;
                        Object objG2 = axrq.g(obj, jN);
                        if (objG2 != null) {
                            iAk = objG2.hashCode();
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
                        iAk = axrq.g(obj, jN).hashCode();
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iAk = axrq.g(obj, jN).hashCode();
                        break;
                    default:
                        continue;
                }
                iHashCode = i + iAk;
            }
        }
        int i4 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i4 >= iArr.length) {
                int iHashCode2 = (iHashCode * 53) + this.m.c(obj).hashCode();
                return this.h ? (iHashCode2 * 53) + AndroidInfo.e(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!I(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + axrq.g(obj, n(m(i5))).hashCode();
            }
            i4++;
        }
    }

    @Override // defpackage.axre
    public final Object c() {
        return ((axqf) this.g).l();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[SYNTHETIC] */
    @Override // defpackage.axre
    public final void d(Object obj) {
        if (G(obj)) {
            if (obj instanceof axqf) {
                axqf axqfVar = (axqf) obj;
                axqfVar.q(Alert.DURATION_SHOW_INDEFINITELY);
                axqfVar.memoizedHashCode = 0;
                axqfVar.o();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM = m(i);
                int i2 = 1048575 & iM;
                int i3 = (iM >>> 20) & 255;
                long j = i2;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 17:
                                if (D(obj, i)) {
                                    t(i).d(b.getObject(obj, j));
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
                                ((axqi) axrq.a.i(obj, j)).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((axqs) object).c();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (I(obj, j(i), i)) {
                        t(i).d(b.getObject(obj, j));
                    }
                } else if (D(obj, i)) {
                    t(i).d(b.getObject(obj, j));
                }
            }
            this.m.e(obj);
            if (this.h) {
                AndroidInfo.g(obj);
            }
        }
    }

    @Override // defpackage.axre
    public final void e(Object obj, Object obj2) {
        u(obj);
        axqj.a(obj2);
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            long jN = n(iM);
            int iJ = j(i);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (D(obj2, i)) {
                        axrq.l(obj, jN, axrq.b(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 1:
                    if (D(obj2, i)) {
                        axrq.m(obj, jN, axrq.c(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 2:
                    if (D(obj2, i)) {
                        axrq.o(obj, jN, axrq.e(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 3:
                    if (D(obj2, i)) {
                        axrq.o(obj, jN, axrq.e(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 4:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 5:
                    if (D(obj2, i)) {
                        axrq.o(obj, jN, axrq.e(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 6:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 7:
                    if (D(obj2, i)) {
                        axrq.i(obj, jN, axrq.r(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 8:
                    if (D(obj2, i)) {
                        axrq.p(obj, jN, axrq.g(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 9:
                    v(obj, obj2, i);
                    break;
                case 10:
                    if (D(obj2, i)) {
                        axrq.p(obj, jN, axrq.g(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 11:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 12:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 13:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 14:
                    if (D(obj2, i)) {
                        axrq.o(obj, jN, axrq.e(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 15:
                    if (D(obj2, i)) {
                        axrq.n(obj, jN, axrq.d(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 16:
                    if (D(obj2, i)) {
                        axrq.o(obj, jN, axrq.e(obj2, jN));
                        y(obj, i);
                    }
                    break;
                case 17:
                    v(obj, obj2, i);
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
                    axqi axqiVarF = JniAndroid.f(obj, jN);
                    axqi axqiVarF2 = JniAndroid.f(obj2, jN);
                    int size = axqiVarF.size();
                    int size2 = axqiVarF2.size();
                    if (size > 0 && size2 > 0) {
                        if (!axqiVarF.c()) {
                            axqiVarF = axqiVarF.d(size2 + size);
                        }
                        axqiVarF.addAll(axqiVarF2);
                    }
                    if (size > 0) {
                        axqiVarF2 = axqiVarF;
                    }
                    axrq.p(obj, jN, axqiVarF2);
                    break;
                case 50:
                    Class cls = axrf.a;
                    axrq.p(obj, jN, JniAndroid.e(axrq.g(obj, jN), axrq.g(obj2, jN)));
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
                    if (I(obj2, iJ, i)) {
                        axrq.p(obj, jN, axrq.g(obj2, jN));
                        z(obj, iJ, i);
                    }
                    break;
                case 60:
                    w(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (I(obj2, iJ, i)) {
                        axrq.p(obj, jN, axrq.g(obj2, jN));
                        z(obj, iJ, i);
                    }
                    break;
                case 68:
                    w(obj, obj2, i);
                    break;
            }
        }
        axrf.h(this.m, obj, obj2);
        if (this.h) {
            axrf.l(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:238:0x06ee A[LOOP:3: B:236:0x06ea->B:238:0x06ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:242:0x0705  */
    /* JADX WARN: Code duplicated, block: B:252:0x0718 A[LOOP:4: B:250:0x0714->B:252:0x0718, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x072c  */
    /* JADX WARN: Code duplicated, block: B:263:0x06db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [axqy] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [axqy] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [axrl] */
    /* JADX WARN: Type inference failed for: r5v20, types: [axrl] */
    /* JADX WARN: Type inference failed for: r5v23, types: [axrl] */
    /* JADX WARN: Type inference failed for: r5v4, types: [axrl] */
    /* JADX WARN: Type inference failed for: r5v5, types: [axrl] */
    /* JADX WARN: Type inference failed for: r5v6, types: [axrl] */
    /* JADX WARN: Type inference failed for: r6v0, types: [axrl] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [axrl] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.axre
    public final void f(Object obj, axpt axptVar, axpy axpyVar) throws Throwable {
        ?? r2;
        int i;
        Object objP;
        ?? r6;
        ?? r1;
        ?? r5;
        ?? r13;
        Object objP2;
        ?? r7;
        Throwable th;
        int i2;
        ?? r3 = this;
        byte[] bArr = axqj.a;
        axpyVar.getClass();
        u(obj);
        Throwable th2 = null;
        ?? r8 = r3.m;
        Object objB = null;
        while (true) {
            try {
                int iC = axptVar.c();
                int i3 = -1;
                if (iC >= r3.e && iC <= r3.f) {
                    int length = (r3.c.length / 3) - 1;
                    int i4 = 0;
                    while (i4 <= length) {
                        r13 = (length + i4) >>> 1;
                        int i5 = r13 * 3;
                        int iJ = r3.j(i5);
                        if (iC == iJ) {
                            i3 = i5;
                        } else if (iC < iJ) {
                            length = r13 - 1;
                        } else {
                            i4 = r13 + 1;
                        }
                    }
                }
                int i6 = Alert.DURATION_SHOW_INDEFINITELY;
                if (i3 >= 0) {
                    try {
                        r13 = r3;
                        int iM = r13.m(i3);
                        switch ((iM >>> 20) & 255) {
                            case 0:
                                th = th2;
                                axrq.l(obj, iM & 1048575, axptVar.a());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 1:
                                th = th2;
                                axrq.m(obj, iM & 1048575, axptVar.b());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 2:
                                th = th2;
                                axrq.o(obj, iM & 1048575, axptVar.k());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 3:
                                th = th2;
                                axrq.o(obj, iM & 1048575, axptVar.n());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 4:
                                th = th2;
                                axrq.a.j(obj, iM & 1048575, axptVar.f());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 5:
                                th = th2;
                                axrq.o(obj, iM & 1048575, axptVar.j());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 6:
                                th = th2;
                                axrq.a.j(obj, iM & 1048575, axptVar.e());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 7:
                                th = th2;
                                axrq.i(obj, iM & 1048575, axptVar.M());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 8:
                                th = th2;
                                r13.x(obj, iM, axptVar);
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 9:
                                th = th2;
                                axqv axqvVar = (axqv) r13.r(obj, i3);
                                axptVar.v(axqvVar, r13.t(i3), axpyVar);
                                r13.A(obj, i3, axqvVar);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 10:
                                th = th2;
                                axrq.a.l(obj, iM & 1048575, axptVar.s());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 11:
                                th = th2;
                                axrq.a.j(obj, iM & 1048575, axptVar.i());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 12:
                                th = th2;
                                int iD = axptVar.d();
                                if (r13.K(i3) == null || axpc.a(iD)) {
                                    axrq.a.j(obj, iM & 1048575, iD);
                                    r13.y(obj, i3);
                                } else {
                                    objB = axrf.g(obj, iC, iD, objB, r8);
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 13:
                                th = th2;
                                axrq.a.j(obj, iM & 1048575, axptVar.g());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 14:
                                th = th2;
                                axrq.o(obj, iM & 1048575, axptVar.l());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 15:
                                th = th2;
                                axrq.a.j(obj, iM & 1048575, axptVar.h());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 16:
                                th = th2;
                                axrq.o(obj, iM & 1048575, axptVar.m());
                                r13.y(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 17:
                                th = th2;
                                axqv axqvVar2 = (axqv) r13.r(obj, i3);
                                axptVar.t(axqvVar2, r13.t(i3), axpyVar);
                                r13.A(obj, i3, axqvVar2);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 18:
                                th = th2;
                                axptVar.x(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 19:
                                th = th2;
                                axptVar.B(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 20:
                                th = th2;
                                axptVar.D(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 21:
                                th = th2;
                                axptVar.K(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 22:
                                th = th2;
                                axptVar.C(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 23:
                                th = th2;
                                axptVar.A(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 24:
                                th = th2;
                                axptVar.z(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 25:
                                th = th2;
                                axptVar.w(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 26:
                                th = th2;
                                int i7 = 536870912 & iM;
                                int i8 = iM & 1048575;
                                if (i7 != 0) {
                                    axptVar.I(JniAndroid.g(obj, i8), true);
                                } else {
                                    axptVar.I(JniAndroid.g(obj, i8), false);
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 27:
                                th = th2;
                                axre axreVarT = r13.t(i3);
                                List listG = JniAndroid.g(obj, iM & 1048575);
                                int i9 = axptVar.b;
                                if ((i9 & 7) != 2) {
                                    throw new axql();
                                }
                                while (true) {
                                    listG.add(axptVar.p(axreVarT, axpyVar));
                                    axps axpsVar = axptVar.a;
                                    if (!axpsVar.A() && axptVar.c == 0) {
                                        int iM2 = axpsVar.m();
                                        if (iM2 != i9) {
                                            axptVar.c = iM2;
                                        }
                                    }
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                                break;
                            case 28:
                                th = th2;
                                List listG2 = JniAndroid.g(obj, iM & 1048575);
                                if ((axptVar.b & 7) != 2) {
                                    throw new axql();
                                }
                                while (true) {
                                    listG2.add(axptVar.s());
                                    axps axpsVar2 = axptVar.a;
                                    if (!axpsVar2.A()) {
                                        int iM3 = axpsVar2.m();
                                        if (iM3 != axptVar.b) {
                                            axptVar.c = iM3;
                                        }
                                    }
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                                break;
                            case 29:
                                th = th2;
                                axptVar.J(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 30:
                                th = th2;
                                List listG3 = JniAndroid.g(obj, iM & 1048575);
                                axptVar.y(listG3);
                                objB = axrf.i(obj, iC, listG3, r13.K(i3), objB, r8);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 31:
                                th = th2;
                                axptVar.E(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 32:
                                th = th2;
                                axptVar.F(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 33:
                                th = th2;
                                axptVar.G(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 34:
                                th = th2;
                                axptVar.H(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 35:
                                th = th2;
                                axptVar.x(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 36:
                                th = th2;
                                axptVar.B(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 37:
                                th = th2;
                                axptVar.D(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 38:
                                th = th2;
                                axptVar.K(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 39:
                                th = th2;
                                axptVar.C(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 40:
                                th = th2;
                                axptVar.A(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 41:
                                th = th2;
                                axptVar.z(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 42:
                                th = th2;
                                axptVar.w(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 43:
                                th = th2;
                                axptVar.J(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 44:
                                th = th2;
                                List listG4 = JniAndroid.g(obj, iM & 1048575);
                                axptVar.y(listG4);
                                objB = axrf.i(obj, iC, listG4, r13.K(i3), objB, r8);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 45:
                                th = th2;
                                axptVar.E(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 46:
                                th = th2;
                                axptVar.F(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 47:
                                th = th2;
                                axptVar.G(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 48:
                                th = th2;
                                axptVar.H(JniAndroid.g(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 49:
                                th = th2;
                                axre axreVarT2 = r13.t(i3);
                                List listG5 = JniAndroid.g(obj, iM & 1048575);
                                int i10 = axptVar.b;
                                if ((i10 & 7) != 3) {
                                    throw new axql();
                                }
                                while (true) {
                                    Object objC = axreVarT2.c();
                                    axptVar.u(objC, axreVarT2, axpyVar);
                                    axreVarT2.d(objC);
                                    listG5.add(objC);
                                    axps axpsVar3 = axptVar.a;
                                    if (!axpsVar3.A() && axptVar.c == 0) {
                                        int iM4 = axpsVar3.m();
                                        if (iM4 != i10) {
                                            axptVar.c = iM4;
                                        }
                                    }
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                                break;
                            case 50:
                                try {
                                    Object objQ = r13.q(i3);
                                    int iM5 = r13.m(i3) & 1048575;
                                    axrp axrpVar = axrq.a;
                                    long j = iM5;
                                    try {
                                        Object objI = axrpVar.i(obj, j);
                                        if (objI == null) {
                                            try {
                                                objI = axqs.a.a();
                                                axrpVar.l(obj, j, objI);
                                            } catch (axql unused) {
                                                r2 = obj;
                                                th = null;
                                                r3 = r13;
                                                if (objB == null) {
                                                    try {
                                                        objB = r8.b(r2);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                }
                                                if (!r8.a(objB, axptVar, 0)) {
                                                    objP2 = objB;
                                                    r7 = r8;
                                                    for (i2 = r3.k; i2 < r3.l; i2++) {
                                                        ?? r9 = r7;
                                                        objP2 = r3.p(r2, r3.j[i2], objP2, r9, obj);
                                                        r7 = r9;
                                                    }
                                                    if (objP2 != null) {
                                                        r7.f(r2, (axrm) objP2);
                                                    }
                                                }
                                                th2 = th;
                                            }
                                        } else if (!((axqs) objI).b) {
                                            axqs axqsVarA = axqs.a.a();
                                            JniAndroid.e(axqsVarA, objI);
                                            axrpVar.l(obj, j, axqsVarA);
                                            objI = axqsVarA;
                                        }
                                        axqs axqsVar = (axqs) objI;
                                        Object obj2 = ((axkl) objQ).a;
                                        axptVar.L(2);
                                        axps axpsVar4 = axptVar.a;
                                        int iE = axpsVar4.e(axpsVar4.n());
                                        Object obj3 = ((axqr) obj2).a;
                                        Object obj4 = ((axqr) obj2).b;
                                        Object objO = obj3;
                                        Object objO2 = obj4;
                                        while (true) {
                                            try {
                                                int iC2 = axptVar.c();
                                                if (iC2 != i6) {
                                                    if (axpsVar4.A()) {
                                                        th = null;
                                                    } else {
                                                        if (iC2 == 1) {
                                                            objO = axptVar.o((axrt) ((axqr) obj2).c, null, null);
                                                        } else if (iC2 != 2) {
                                                            try {
                                                                if (!axptVar.N()) {
                                                                    throw new axqm("Unable to parse map entry.");
                                                                }
                                                                continue;
                                                            } catch (axql e) {
                                                                if (!axptVar.N()) {
                                                                    throw new axqm(e, null);
                                                                }
                                                                axptVar.a.y(iE);
                                                                throw th;
                                                            }
                                                        } else {
                                                            objO2 = axptVar.o((axrt) ((axqr) obj2).d, obj4.getClass(), axpyVar);
                                                        }
                                                        i6 = Alert.DURATION_SHOW_INDEFINITELY;
                                                    }
                                                    th = th;
                                                    axptVar.a.y(iE);
                                                    throw th;
                                                }
                                                th = null;
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        try {
                                            axqsVar.put(objO, objO2);
                                            try {
                                                axptVar.a.y(iE);
                                                th2 = th;
                                                r13 = r13;
                                                r3 = r13;
                                            } catch (axql unused2) {
                                                r2 = obj;
                                                r3 = r13;
                                                if (objB == null) {
                                                    objB = r8.b(r2);
                                                }
                                                if (!r8.a(objB, axptVar, 0)) {
                                                    objP2 = objB;
                                                    r7 = r8;
                                                    while (i2 < r3.l) {
                                                        ?? r10 = r7;
                                                        objP2 = r3.p(r2, r3.j[i2], objP2, r10, obj);
                                                        r7 = r10;
                                                    }
                                                    if (objP2 != null) {
                                                        r7.f(r2, (axrm) objP2);
                                                    }
                                                }
                                                th2 = th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (axql unused3) {
                                        th = null;
                                    }
                                } catch (axql unused4) {
                                    th = th2;
                                }
                                break;
                            case 51:
                                axrq.a.l(obj, iM & 1048575, Double.valueOf(axptVar.a()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 52:
                                axrq.a.l(obj, iM & 1048575, Float.valueOf(axptVar.b()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 53:
                                axrq.a.l(obj, iM & 1048575, Long.valueOf(axptVar.k()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 54:
                                axrq.a.l(obj, iM & 1048575, Long.valueOf(axptVar.n()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 55:
                                axrq.a.l(obj, iM & 1048575, Integer.valueOf(axptVar.f()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 56:
                                axrq.a.l(obj, iM & 1048575, Long.valueOf(axptVar.j()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 57:
                                axrq.a.l(obj, iM & 1048575, Integer.valueOf(axptVar.e()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 58:
                                axrq.a.l(obj, iM & 1048575, Boolean.valueOf(axptVar.M()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 59:
                                r13.x(obj, iM, axptVar);
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 60:
                                axqv axqvVar3 = (axqv) r13.s(obj, iC, i3);
                                axptVar.v(axqvVar3, r13.t(i3), axpyVar);
                                r13.B(obj, iC, i3, axqvVar3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 61:
                                axrq.a.l(obj, iM & 1048575, axptVar.s());
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 62:
                                axrq.a.l(obj, iM & 1048575, Integer.valueOf(axptVar.i()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 63:
                                int iD2 = axptVar.d();
                                if (r13.K(i3) == null || axpc.a(iD2)) {
                                    axrq.a.l(obj, iM & 1048575, Integer.valueOf(iD2));
                                    r13.z(obj, iC, i3);
                                    th = th2;
                                    th2 = th;
                                    r13 = r13;
                                } else {
                                    objB = axrf.g(obj, iC, iD2, objB, r8);
                                    r13 = r13;
                                }
                                r3 = r13;
                                break;
                            case 64:
                                axrq.a.l(obj, iM & 1048575, Integer.valueOf(axptVar.g()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 65:
                                axrq.a.l(obj, iM & 1048575, Long.valueOf(axptVar.l()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 66:
                                axrq.a.l(obj, iM & 1048575, Integer.valueOf(axptVar.h()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 67:
                                axrq.a.l(obj, iM & 1048575, Long.valueOf(axptVar.m()));
                                r13.z(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 68:
                                try {
                                    axqv axqvVar4 = (axqv) r13.s(obj, iC, i3);
                                    axptVar.t(axqvVar4, r13.t(i3), axpyVar);
                                    r13.B(obj, iC, i3, axqvVar4);
                                    th = th2;
                                    th2 = th;
                                    r13 = r13;
                                    r3 = r13;
                                } catch (axql unused5) {
                                    r2 = obj;
                                    th = th2;
                                    r3 = r13;
                                    if (objB == null) {
                                        objB = r8.b(r2);
                                    }
                                    if (!r8.a(objB, axptVar, 0)) {
                                        objP2 = objB;
                                        r7 = r8;
                                        while (i2 < r3.l) {
                                            ?? r11 = r7;
                                            objP2 = r3.p(r2, r3.j[i2], objP2, r11, obj);
                                            r7 = r11;
                                        }
                                        if (objP2 != null) {
                                            r7.f(r2, (axrm) objP2);
                                        }
                                    }
                                    th2 = th;
                                }
                                break;
                            default:
                                r2 = obj;
                                th = th2;
                                if (objB == null) {
                                    try {
                                        objB = r8.b(r2);
                                    } catch (axql unused6) {
                                        r3 = r13;
                                        if (objB == null) {
                                            objB = r8.b(r2);
                                        }
                                        if (!r8.a(objB, axptVar, 0)) {
                                            objP2 = objB;
                                            r7 = r8;
                                            while (i2 < r3.l) {
                                                ?? r12 = r7;
                                                objP2 = r3.p(r2, r3.j[i2], objP2, r12, obj);
                                                r7 = r12;
                                            }
                                            if (objP2 != null) {
                                                r7.f(r2, (axrm) objP2);
                                            }
                                        }
                                        th2 = th;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        r3 = r13;
                                        i = r3.k;
                                        objP = objB;
                                        r1 = r3;
                                        r6 = r8;
                                        while (i < r1.l) {
                                            ?? r14 = r6;
                                            objP = r1.p(r2, r1.j[i], objP, r14, obj);
                                            i++;
                                            r1 = this;
                                            r6 = r14;
                                        }
                                        r5 = r6;
                                        if (objP != null) {
                                            r5.f(r2, (axrm) objP);
                                        }
                                        throw th;
                                    }
                                    break;
                                }
                                if (!r8.a(objB, axptVar, 0)) {
                                    objP2 = objB;
                                    r7 = r8;
                                    for (int i11 = r13.k; i11 < r13.l; i11++) {
                                        ?? r15 = r7;
                                        objP2 = r13.p(r2, r13.j[i11], objP2, r15, obj);
                                        r7 = r15;
                                    }
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r2 = r3;
                        r3 = r13;
                        i = r3.k;
                        objP = objB;
                        r1 = r3;
                        r6 = r8;
                        while (i < r1.l) {
                            ?? r16 = r6;
                            objP = r1.p(r2, r1.j[i], objP, r16, obj);
                            i++;
                            r1 = this;
                            r6 = r16;
                        }
                        r5 = r6;
                        if (objP != null) {
                            r5.f(r2, (axrm) objP);
                        }
                        throw th;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    objP2 = objB;
                    r7 = r8;
                    for (int i12 = r3.k; i12 < r3.l; i12++) {
                        ?? r17 = r7;
                        objP2 = r3.p(obj, r3.j[i12], objP2, r17, obj);
                        r7 = r17;
                    }
                    r2 = obj;
                } else {
                    Object obj5 = obj;
                    try {
                        if ((!r3.h ? th2 : axpyVar.b(r3.g, iC)) != null) {
                            AndroidInfo.f(obj5);
                            throw th2;
                        }
                        if (objB == null) {
                            try {
                                objB = r8.b(obj5);
                            } catch (Throwable th8) {
                                th = th8;
                                r2 = obj5;
                            }
                        }
                        if (r8.a(objB, axptVar, 0)) {
                            r13 = r3;
                            r3 = r13;
                        } else {
                            int i13 = r3.k;
                            objP2 = objB;
                            r7 = r8;
                            for (?? r4 = r3; i13 < r4.l; r4 = r4) {
                                ?? r18 = r7;
                                Object obj6 = obj5;
                                objP2 = r4.p(obj6, r4.j[i13], objP2, r18, obj);
                                r7 = r18;
                                i13++;
                                obj5 = obj6;
                            }
                            r2 = obj5;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r13 = r3;
                        r3 = obj5;
                        r2 = r3;
                        r3 = r13;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                r2 = obj;
            }
            i = r3.k;
            objP = objB;
            r1 = r3;
            r6 = r8;
            while (i < r1.l) {
                ?? r19 = r6;
                objP = r1.p(r2, r1.j[i], objP, r19, obj);
                i++;
                r1 = this;
                r6 = r19;
            }
            r5 = r6;
            if (objP != null) {
                r5.f(r2, (axrm) objP);
            }
            throw th;
        }
        if (objP2 != null) {
            r7.f(r2, (axrm) objP2);
        }
    }

    @Override // defpackage.axre
    public final boolean g(Object obj, Object obj2) {
        boolean zAe;
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            int i2 = (iM >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jN = n(iM);
                switch (i2) {
                    case 0:
                        if (!C(obj, obj2, i) || Double.doubleToLongBits(axrq.b(obj, jN)) != Double.doubleToLongBits(axrq.b(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!C(obj, obj2, i) || Float.floatToIntBits(axrq.c(obj, jN)) != Float.floatToIntBits(axrq.c(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!C(obj, obj2, i) || axrq.e(obj, jN) != axrq.e(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!C(obj, obj2, i) || axrq.e(obj, jN) != axrq.e(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!C(obj, obj2, i) || axrq.e(obj, jN) != axrq.e(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!C(obj, obj2, i) || axrq.r(obj, jN) != axrq.r(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        Object objG = axrq.g(obj, jN);
                        Object objG2 = axrq.g(obj2, jN);
                        Class cls = axrf.a;
                        if (!a.ae(objG, objG2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        Object objG3 = axrq.g(obj, jN);
                        Object objG4 = axrq.g(obj2, jN);
                        Class cls2 = axrf.a;
                        if (!a.ae(objG3, objG4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        Object objG5 = axrq.g(obj, jN);
                        Object objG6 = axrq.g(obj2, jN);
                        Class cls3 = axrf.a;
                        if (!a.ae(objG5, objG6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!C(obj, obj2, i) || axrq.e(obj, jN) != axrq.e(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!C(obj, obj2, i) || axrq.d(obj, jN) != axrq.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!C(obj, obj2, i) || axrq.e(obj, jN) != axrq.e(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!C(obj, obj2, i)) {
                            return false;
                        }
                        Object objG7 = axrq.g(obj, jN);
                        Object objG8 = axrq.g(obj2, jN);
                        Class cls4 = axrf.a;
                        if (!a.ae(objG7, objG8)) {
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
                        Object objG9 = axrq.g(obj, jN);
                        Object objG10 = axrq.g(obj2, jN);
                        Class cls5 = axrf.a;
                        zAe = a.ae(objG9, objG10);
                        break;
                    case 50:
                        Object objG11 = axrq.g(obj, jN);
                        Object objG12 = axrq.g(obj2, jN);
                        Class cls6 = axrf.a;
                        zAe = a.ae(objG11, objG12);
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
                        if (!H(obj, obj2, i)) {
                            return false;
                        }
                        Object objG13 = axrq.g(obj, jN);
                        Object objG14 = axrq.g(obj2, jN);
                        Class cls7 = axrf.a;
                        if (!a.ae(objG13, objG14)) {
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
        int i3 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i3 >= iArr.length) {
                axrl axrlVar = this.m;
                if (!axrlVar.c(obj).equals(axrlVar.c(obj2))) {
                    return false;
                }
                if (this.h) {
                    return AndroidInfo.e(obj).equals(AndroidInfo.e(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!H(obj, obj2, i4)) {
                return false;
            }
            if (!I(obj, 0, i4)) {
                long jN2 = n(m(i4));
                Object objG15 = axrq.g(obj, jN2);
                Object objG16 = axrq.g(obj2, jN2);
                Class cls8 = axrf.a;
                if (!a.ae(objG15, objG16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5 A[LOOP:2: B:50:0x00d5->B:54:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8 A[SYNTHETIC] */
    @Override // defpackage.axre
    public final boolean h(Object obj) {
        int i;
        int i2;
        List list;
        axre axreVarT;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.k) {
            int i7 = this.j[i4];
            int iM = this.m(i7);
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
            axqy axqyVar = this;
            Object obj2 = obj;
            if (a.ag(iM) && !axqyVar.E(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iM >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (axqyVar.E(obj2, i7, i, i2, i10) && !F(obj2, iM, axqyVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (List) axrq.g(obj2, n(iM));
                if (list.isEmpty()) {
                    continue;
                } else {
                    axreVarT = axqyVar.t(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (axreVarT.h(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (axqyVar.I(obj2, axqyVar.j(i7), i7) && !F(obj2, iM, axqyVar.t(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (List) axrq.g(obj2, n(iM));
                if (list.isEmpty()) {
                    axreVarT = axqyVar.t(i7);
                    while (i3 < list.size()) {
                        if (axreVarT.h(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                axqs axqsVar = (axqs) axrq.g(obj2, n(iM));
                if (axqsVar.isEmpty()) {
                    continue;
                } else {
                    if (((axrt) ((axqr) ((axkl) axqyVar.q(i7)).a).d).s == axru.i) {
                        axre axreVarA = null;
                        for (Object obj3 : axqsVar.values()) {
                            if (axreVarA == null) {
                                axreVarA = axrb.a.a(((axqf) obj3).getClass());
                            }
                            if (!axreVarA.h(obj3)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
            i4++;
            this = axqyVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        Object obj4 = obj;
        if (this.h) {
            AndroidInfo.e(obj4).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.axre
    public final void i(Object obj, axkl axklVar) throws axpu {
        Map.Entry entry;
        int i;
        int i2;
        int i3;
        axqy axqyVar = this;
        if (axqyVar.h) {
            axqa axqaVarE = AndroidInfo.e(obj);
            if (axqaVarE.d()) {
                entry = null;
            } else {
                entry = (Map.Entry) axqaVarE.b().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = axqyVar.c;
        Unsafe unsafe = b;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr.length) {
            int iM = axqyVar.m(i6);
            int iJ = axqyVar.j(i6);
            int i8 = (iM >>> 20) & 255;
            if (i8 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iM & i4;
            switch (i8) {
                case 0:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.j(iJ, axrq.b(obj, j));
                    }
                    break;
                case 1:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.n(iJ, axrq.c(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 2:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.q(iJ, unsafe.getLong(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 3:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.x(iJ, unsafe.getLong(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 4:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.p(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 5:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.m(iJ, unsafe.getLong(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 6:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.l(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 7:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.h(iJ, axrq.a.f(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 8:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        L(iJ, unsafe.getObject(obj, j), axklVar);
                    }
                    axqyVar = this;
                    break;
                case 9:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.r(iJ, unsafe.getObject(obj, j), axqyVar.t(i6));
                    }
                    break;
                case 10:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.i(iJ, (axpo) unsafe.getObject(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 11:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.w(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 12:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.k(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 13:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.s(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 14:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.t(iJ, unsafe.getLong(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 15:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.u(iJ, unsafe.getInt(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 16:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.v(iJ, unsafe.getLong(obj, j));
                    }
                    axqyVar = this;
                    break;
                case 17:
                    if (axqyVar.E(obj, i6, i5, i7, i)) {
                        axklVar.o(iJ, unsafe.getObject(obj, j), axqyVar.t(i6));
                    }
                    break;
                case 18:
                    i2 = i5;
                    i3 = i7;
                    axrf.n(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 19:
                    i2 = i5;
                    i3 = i7;
                    axrf.o(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 20:
                    i2 = i5;
                    i3 = i7;
                    axrf.v(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 21:
                    i2 = i5;
                    i3 = i7;
                    axrf.v(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 22:
                    i2 = i5;
                    i3 = i7;
                    axrf.s(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 23:
                    i2 = i5;
                    i3 = i7;
                    axrf.u(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 24:
                    i2 = i5;
                    i3 = i7;
                    axrf.t(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 25:
                    i2 = i5;
                    i3 = i7;
                    axrf.m(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 26:
                    i2 = i5;
                    i3 = i7;
                    int iJ2 = axqyVar.j(i6);
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = axrf.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof axqp) {
                            axqp axqpVar = (axqp) list;
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                Object objB = axqpVar.b();
                                if (objB instanceof String) {
                                    ((axpk) axklVar.a).v(iJ2, (String) objB);
                                } else {
                                    ((axpk) axklVar.a).m(iJ2, (axpo) objB);
                                }
                            }
                        } else {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                ((axpk) axklVar.a).v(iJ2, (String) list.get(i12));
                            }
                        }
                    }
                    i5 = i2;
                    i7 = i3;
                    break;
                case 27:
                    i2 = i5;
                    i3 = i7;
                    int iJ3 = axqyVar.j(i6);
                    List list2 = (List) unsafe.getObject(obj, j);
                    axre axreVarT = axqyVar.t(i6);
                    Class cls2 = axrf.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            axklVar.r(iJ3, list2.get(i13), axreVarT);
                        }
                    }
                    i5 = i2;
                    i7 = i3;
                    break;
                case 28:
                    i2 = i5;
                    i3 = i7;
                    int iJ4 = axqyVar.j(i6);
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = axrf.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            ((axpk) axklVar.a).m(iJ4, (axpo) list3.get(i14));
                        }
                    }
                    i5 = i2;
                    i7 = i3;
                    break;
                case 29:
                    i2 = i5;
                    i3 = i7;
                    axrf.r(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 30:
                    i2 = i5;
                    i3 = i7;
                    axrf.s(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 31:
                    i2 = i5;
                    i3 = i7;
                    axrf.t(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 32:
                    i2 = i5;
                    i3 = i7;
                    axrf.u(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 33:
                    i2 = i5;
                    i3 = i7;
                    axrf.p(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 34:
                    i2 = i5;
                    i3 = i7;
                    axrf.q(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, false);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 35:
                    i2 = i5;
                    i3 = i7;
                    axrf.n(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 36:
                    i2 = i5;
                    i3 = i7;
                    axrf.o(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 37:
                    i2 = i5;
                    i3 = i7;
                    axrf.v(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 38:
                    i2 = i5;
                    i3 = i7;
                    axrf.v(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 39:
                    i2 = i5;
                    i3 = i7;
                    axrf.s(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 40:
                    i2 = i5;
                    i3 = i7;
                    axrf.u(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 41:
                    i2 = i5;
                    i3 = i7;
                    axrf.t(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 42:
                    i2 = i5;
                    i3 = i7;
                    axrf.m(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 43:
                    i2 = i5;
                    i3 = i7;
                    axrf.r(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 44:
                    i2 = i5;
                    i3 = i7;
                    axrf.s(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 45:
                    i2 = i5;
                    i3 = i7;
                    axrf.t(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 46:
                    i2 = i5;
                    i3 = i7;
                    axrf.u(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 47:
                    i2 = i5;
                    i3 = i7;
                    axrf.p(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 48:
                    i2 = i5;
                    i3 = i7;
                    axrf.q(axqyVar.j(i6), (List) unsafe.getObject(obj, j), axklVar, true);
                    i5 = i2;
                    i7 = i3;
                    break;
                case 49:
                    i2 = i5;
                    i3 = i7;
                    int iJ5 = axqyVar.j(i6);
                    List list4 = (List) unsafe.getObject(obj, j);
                    axre axreVarT2 = axqyVar.t(i6);
                    Class cls4 = axrf.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i15 = 0; i15 < list4.size(); i15++) {
                            axklVar.o(iJ5, list4.get(i15), axreVarT2);
                        }
                    }
                    i5 = i2;
                    i7 = i3;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object obj2 = ((axkl) axqyVar.q(i6)).a;
                        Object obj3 = axklVar.a;
                        Iterator it = ((axqs) object).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            axpk axpkVar = (axpk) obj3;
                            axpkVar.y((iJ << 3) | 2);
                            int i16 = i7;
                            axqr axqrVar = (axqr) obj2;
                            axpkVar.y(axkl.f(axqrVar, entry2.getKey(), entry2.getValue()));
                            axkl.g(axpkVar, axqrVar, entry2.getKey(), entry2.getValue());
                            i5 = i5;
                            i7 = i16;
                        }
                    }
                    break;
                case 51:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.j(iJ, ((Double) axrq.a.i(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.n(iJ, ((Float) axrq.a.i(obj, j)).floatValue());
                    }
                    break;
                case 53:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.q(iJ, o(obj, j));
                    }
                    break;
                case 54:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.x(iJ, o(obj, j));
                    }
                    break;
                case 55:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.p(iJ, k(obj, j));
                    }
                    break;
                case 56:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.m(iJ, o(obj, j));
                    }
                    break;
                case 57:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.l(iJ, k(obj, j));
                    }
                    break;
                case 58:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.h(iJ, ((Boolean) axrq.a.i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (axqyVar.I(obj, iJ, i6)) {
                        L(iJ, unsafe.getObject(obj, j), axklVar);
                    }
                    break;
                case 60:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.r(iJ, unsafe.getObject(obj, j), axqyVar.t(i6));
                    }
                    break;
                case 61:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.i(iJ, (axpo) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.w(iJ, k(obj, j));
                    }
                    break;
                case 63:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.k(iJ, k(obj, j));
                    }
                    break;
                case 64:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.s(iJ, k(obj, j));
                    }
                    break;
                case 65:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.t(iJ, o(obj, j));
                    }
                    break;
                case 66:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.u(iJ, k(obj, j));
                    }
                    break;
                case 67:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.v(iJ, o(obj, j));
                    }
                    break;
                case 68:
                    if (axqyVar.I(obj, iJ, i6)) {
                        axklVar.o(iJ, unsafe.getObject(obj, j), axqyVar.t(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        axqyVar.m.c(obj).f(axklVar);
    }
}
