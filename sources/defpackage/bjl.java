package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjl implements bjs {
    public static final int[] a = new int[0];
    public static final Unsafe b = bke.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final bji g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final bjy m;

    public bjl(int[] iArr, Object[] objArr, int i, int i2, bji bjiVar, int[] iArr2, int i3, int i4, bjy bjyVar, azw azwVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = bjiVar instanceof bis;
        boolean z = false;
        if (azwVar != null && (bjiVar instanceof bir)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = bjyVar;
        this.g = bjiVar;
    }

    private final void A(Object obj, int i, int i2) {
        bke.a.l(obj, l(i2) & 1048575, i);
    }

    private final void B(Object obj, int i, Object obj2) {
        b.putObject(obj, n(m(i)), obj2);
        z(obj, i);
    }

    private final void C(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, n(m(i2)), obj2);
        A(obj, i, i2);
    }

    private final boolean D(Object obj, Object obj2, int i) {
        return E(obj, i) == E(obj2, i);
    }

    private final boolean E(Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j == 1048575) {
            int iM = m(i);
            long jN = n(iM);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(bke.a(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(bke.b(obj, jN)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (bke.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (bke.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (bke.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return bke.s(obj, jN);
                case 8:
                    Object objF = bke.f(obj, jN);
                    if (objF instanceof String) {
                        if (((String) objF).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objF instanceof bhy)) {
                            return K();
                        }
                        if (bhy.d.equals(objF)) {
                            return false;
                        }
                    }
                case 9:
                    if (bke.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (bhy.d.equals(bke.f(obj, jN))) {
                        return false;
                    }
                    break;
                case 11:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (bke.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (bke.c(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (bke.d(obj, jN) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (bke.f(obj, jN) == null) {
                        return false;
                    }
                    break;
                default:
                    return K();
            }
        } else {
            if ((bke.c(obj, j) & (1 << (iL >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean F(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return E(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean G(Object obj, int i, bjs bjsVar) {
        return bjsVar.h(bke.f(obj, n(i)));
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof bis) {
            return ((bis) obj).s();
        }
        return true;
    }

    private final boolean I(Object obj, Object obj2, int i) {
        long jL = l(i) & 1048575;
        return bke.c(obj, jL) == bke.c(obj2, jL);
    }

    private final boolean J(Object obj, int i, int i2) {
        return bke.a.i(obj, (long) (l(i2) & 1048575)) == i;
    }

    private static final boolean K() {
        throw new IllegalArgumentException();
    }

    private static final void L(int i, Object obj, zf zfVar) {
        if (!(obj instanceof String)) {
            zfVar.q(i, (bhy) obj);
        } else {
            ((bih) zfVar.a).q(i, (String) obj);
        }
    }

    private final int j(int i) {
        return this.c[i];
    }

    private static int k(Object obj, long j) {
        return ((Integer) bke.f(obj, j)).intValue();
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
        return ((Long) bke.f(obj, j)).longValue();
    }

    private final biv p(int i) {
        return (biv) this.d[((i / 3) << 1) + 1];
    }

    private final bjs q(int i) {
        Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        bjs bjsVar = (bjs) objArr[i2];
        if (bjsVar != null) {
            return bjsVar;
        }
        bjs bjsVarB = bjp.a.b((Class) objArr[i2 + 1]);
        objArr[i2] = bjsVarB;
        return bjsVarB;
    }

    private final Object r(Object obj, int i, Object obj2, bjy bjyVar, Object obj3) {
        biv bivVarP;
        int iJ = j(i);
        Object objK = bke.a.k(obj, m(i) & 1048575);
        if (objK != null && (bivVarP = p(i)) != null) {
            Object obj4 = ((ci) s(i)).a;
            Iterator it = ((bjf) objK).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ((Integer) entry.getValue()).intValue();
                if (!bivVarP.a()) {
                    if (obj2 == null) {
                        obj2 = bjyVar.b(obj3);
                    }
                    int iD = ci.D((djl) obj4, entry.getKey(), entry.getValue());
                    bhy bhyVar = bhy.d;
                    byte[] bArr = new byte[iD];
                    bie bieVar = new bie(bArr, iD);
                    try {
                        ci.E(bieVar, (djl) obj4, entry.getKey(), entry.getValue());
                        ((bjz) obj2).e((iJ << 3) | 2, acw.c(bieVar, bArr));
                        it.remove();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private final Object s(int i) {
        return this.d[(i / 3) << 1];
    }

    private final Object t(Object obj, int i) {
        bjs bjsVarQ = q(i);
        long jN = n(m(i));
        if (!E(obj, i)) {
            return bjsVarQ.c();
        }
        Object object = b.getObject(obj, jN);
        if (H(object)) {
            return object;
        }
        Object objC = bjsVarQ.c();
        if (object != null) {
            bjsVarQ.e(objC, object);
        }
        return objC;
    }

    private final Object u(Object obj, int i, int i2) {
        bjs bjsVarQ = q(i2);
        if (!J(obj, i, i2)) {
            return bjsVarQ.c();
        }
        Object object = b.getObject(obj, n(m(i2)));
        if (H(object)) {
            return object;
        }
        Object objC = bjsVarQ.c();
        if (object != null) {
            bjsVarQ.e(objC, object);
        }
        return objC;
    }

    private static void v(Object obj) {
        if (H(obj)) {
            return;
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void w(Object obj, Object obj2, int i) {
        if (E(obj2, i)) {
            long jN = n(m(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            bjs bjsVarQ = q(i);
            if (!E(obj, i)) {
                if (H(object)) {
                    Object objC = bjsVarQ.c();
                    bjsVarQ.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                z(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!H(object2)) {
                Object objC2 = bjsVarQ.c();
                bjsVarQ.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            bjsVarQ.e(object2, object);
        }
    }

    private final void x(Object obj, Object obj2, int i) {
        int iJ = j(i);
        if (J(obj2, iJ, i)) {
            long jN = n(m(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + j(i) + " is present but null: " + obj2);
            }
            bjs bjsVarQ = q(i);
            if (!J(obj, iJ, i)) {
                if (H(object)) {
                    Object objC = bjsVarQ.c();
                    bjsVarQ.e(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                A(obj, iJ, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!H(object2)) {
                Object objC2 = bjsVarQ.c();
                bjsVarQ.e(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            bjsVarQ.e(object2, object);
        }
    }

    private final void y(Object obj, int i, bid bidVar) throws biz {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            bke.a.n(obj, j, bidVar.s());
        } else if (this.i) {
            bke.a.n(obj, j, bidVar.r());
        } else {
            bke.a.n(obj, j, bidVar.o());
        }
    }

    private final void z(Object obj, int i) {
        int iL = l(i);
        long j = 1048575 & iL;
        if (j != 1048575) {
            bke.o(obj, j, bke.c(obj, j) | (1 << (iL >>> 20)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0459  */
    /* JADX WARN: Code duplicated, block: B:196:0x0546  */
    /* JADX WARN: Code duplicated, block: B:201:0x056b  */
    @Override // defpackage.bjs
    public final int a(Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iBr;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iC;
        int iK;
        int size;
        int size2;
        int iK2;
        int iNumberOfLeadingZeros5;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iA;
        int iNumberOfLeadingZeros11;
        bjl bjlVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = bjlVar.c;
            if (i3 >= iArr.length) {
                int iA2 = i5 + bjlVar.m.c(obj2).a();
                if (bjlVar.h) {
                    bjv bjvVar = azw.o(obj2).b;
                    if (bjvVar.size() > 0) {
                        lzb lzbVar = (lzb) bjvVar.a(0);
                        Object obj3 = lzbVar.c;
                        Object obj4 = lzbVar.a;
                        throw null;
                    }
                }
                return iA2;
            }
            int iM = bjlVar.m(i3);
            int iJ = bjlVar.j(i3);
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            int i9 = (iM >>> 20) & 255;
            if (i9 <= 17) {
                if (i8 != i6) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj2, i8);
                    i6 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long jN = n(iM);
            if (i9 >= bio.DOUBLE_LIST_PACKED.Z) {
                int i10 = bio.SINT64_LIST_PACKED.Z;
            }
            switch (i9) {
                case 0:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 1:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 2:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.br(iJ, unsafe.getLong(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 3:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.br(iJ, unsafe.getLong(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 4:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.bn(iJ, unsafe.getInt(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 5:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 6:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 7:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros4 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 8:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(obj2, jN);
                        iBr = object instanceof bhy ? bih.E(iJ, (bhy) object) : bih.G(iJ, (String) object);
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 9:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iC = bjt.c(iJ, unsafe.getObject(obj2, jN), bjlVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 10:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = bih.E(iJ, (bhy) unsafe.getObject(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 11:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.bq(iJ, unsafe.getInt(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 12:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.bn(iJ, unsafe.getInt(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 13:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 4;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 14:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iJ << 3);
                        iNumberOfLeadingZeros4 = ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6) + 8;
                        i5 += iNumberOfLeadingZeros4;
                    }
                    bjlVar = this;
                    obj2 = obj;
                    break;
                case 15:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.bo(iJ, unsafe.getInt(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 16:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iBr = a.bp(iJ, unsafe.getLong(obj2, jN));
                        i5 += iBr;
                    }
                    bjlVar = this;
                    break;
                case 17:
                    if (bjlVar.F(obj2, i3, i6, i4, i)) {
                        iC = bjt.a(iJ, (bji) unsafe.getObject(obj2, jN), bjlVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 18:
                    List list = (List) unsafe.getObject(obj2, jN);
                    Class cls = bjt.a;
                    iC = a.bl(iJ, list);
                    i5 += iC;
                    break;
                case 19:
                    List list2 = (List) unsafe.getObject(obj2, jN);
                    Class cls2 = bjt.a;
                    iC = a.bk(iJ, list2);
                    i5 += iC;
                    break;
                case 20:
                    List list3 = (List) unsafe.getObject(obj2, jN);
                    Class cls3 = bjt.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iK = bjt.k(list3);
                        size = list3.size() * ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 21:
                    List list4 = (List) unsafe.getObject(obj2, jN);
                    Class cls4 = bjt.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iC = 0;
                    } else {
                        iK2 = bjt.k(list4);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    }
                    i5 += iC;
                    break;
                case 22:
                    List list5 = (List) unsafe.getObject(obj2, jN);
                    Class cls5 = bjt.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iK2 = bjt.j(list5);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 23:
                    List list6 = (List) unsafe.getObject(obj2, jN);
                    Class cls6 = bjt.a;
                    iC = a.bl(iJ, list6);
                    i5 += iC;
                    break;
                case 24:
                    List list7 = (List) unsafe.getObject(obj2, jN);
                    Class cls7 = bjt.a;
                    iC = a.bk(iJ, list7);
                    i5 += iC;
                    break;
                case 25:
                    List list8 = (List) unsafe.getObject(obj2, jN);
                    Class cls8 = bjt.a;
                    int size3 = list8.size();
                    if (size3 != 0) {
                        iC = size3 * (((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1);
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 26:
                    List list9 = (List) unsafe.getObject(obj2, jN);
                    Class cls9 = bjt.a;
                    int size4 = list9.size();
                    if (size4 == 0) {
                        iNumberOfLeadingZeros6 = 0;
                    } else {
                        boolean z = list9 instanceof bjd;
                        iNumberOfLeadingZeros6 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size4;
                        if (z) {
                            bjd bjdVar = (bjd) list9;
                            for (int i11 = 0; i11 < size4; i11++) {
                                Object objC = bjdVar.c();
                                iNumberOfLeadingZeros6 += objC instanceof bhy ? bih.F((bhy) objC) : bih.H((String) objC);
                            }
                        } else {
                            for (int i12 = 0; i12 < size4; i12++) {
                                Object obj5 = list9.get(i12);
                                iNumberOfLeadingZeros6 += obj5 instanceof bhy ? bih.F((bhy) obj5) : bih.H((String) obj5);
                            }
                        }
                    }
                    i5 += iNumberOfLeadingZeros6;
                    break;
                case 27:
                    List list10 = (List) unsafe.getObject(obj2, jN);
                    bjs bjsVarQ = bjlVar.q(i3);
                    Class cls10 = bjt.a;
                    int size5 = list10.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            Object obj6 = list10.get(i13);
                            iNumberOfLeadingZeros7 += obj6 instanceof bjc ? ((bjc) obj6).a() : bjt.b((bhn) obj6, bjsVarQ);
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 28:
                    List list11 = (List) unsafe.getObject(obj2, jN);
                    Class cls11 = bjt.a;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        iNumberOfLeadingZeros8 = size6 * ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6);
                        for (int i14 = 0; i14 < list11.size(); i14++) {
                            iNumberOfLeadingZeros8 += bih.F((bhy) list11.get(i14));
                        }
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                    }
                    i5 += iNumberOfLeadingZeros8;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj2, jN);
                    Class cls12 = bjt.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iK2 = bjt.f(list12);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 30:
                    List list13 = (List) unsafe.getObject(obj2, jN);
                    Class cls13 = bjt.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iK2 = bjt.j(list13);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 31:
                    List list14 = (List) unsafe.getObject(obj2, jN);
                    Class cls14 = bjt.a;
                    iC = a.bk(iJ, list14);
                    i5 += iC;
                    break;
                case 32:
                    List list15 = (List) unsafe.getObject(obj2, jN);
                    Class cls15 = bjt.a;
                    iC = a.bl(iJ, list15);
                    i5 += iC;
                    break;
                case 33:
                    List list16 = (List) unsafe.getObject(obj2, jN);
                    Class cls16 = bjt.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iK2 = bjt.d(list16);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 34:
                    List list17 = (List) unsafe.getObject(obj2, jN);
                    Class cls17 = bjt.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iK2 = bjt.e(list17);
                        iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = iK2 + (size2 * ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6));
                    } else {
                        iC = 0;
                    }
                    i5 += iC;
                    break;
                case 35:
                    List list18 = (List) unsafe.getObject(obj2, jN);
                    Class cls18 = bjt.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 36:
                    List list19 = (List) unsafe.getObject(obj2, jN);
                    Class cls19 = bjt.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 37:
                    size = bjt.k((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 38:
                    size = bjt.k((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 39:
                    size = bjt.j((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 40:
                    List list20 = (List) unsafe.getObject(obj2, jN);
                    Class cls20 = bjt.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 41:
                    List list21 = (List) unsafe.getObject(obj2, jN);
                    Class cls21 = bjt.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 42:
                    List list22 = (List) unsafe.getObject(obj2, jN);
                    Class cls22 = bjt.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 43:
                    size = bjt.f((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 44:
                    size = bjt.j((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 45:
                    List list23 = (List) unsafe.getObject(obj2, jN);
                    Class cls23 = bjt.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 46:
                    List list24 = (List) unsafe.getObject(obj2, jN);
                    Class cls24 = bjt.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 47:
                    size = bjt.d((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 48:
                    size = bjt.e((List) unsafe.getObject(obj2, jN));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iK = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iK + size;
                        i5 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 49:
                    List list25 = (List) unsafe.getObject(obj2, jN);
                    bjs bjsVarQ2 = bjlVar.q(i3);
                    Class cls25 = bjt.a;
                    int size7 = list25.size();
                    if (size7 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iA += bjt.a(iJ, (bji) list25.get(i15), bjsVarQ2);
                        }
                    }
                    i5 += iA;
                    break;
                case 50:
                    bjf bjfVar = (bjf) unsafe.getObject(obj2, jN);
                    ci ciVar = (ci) bjlVar.s(i3);
                    if (bjfVar.isEmpty()) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = 0;
                        for (Map.Entry entry : bjfVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iJ << 3) * 9;
                            int iD = ci.D((djl) ciVar.a, key, value);
                            iNumberOfLeadingZeros7 += ((352 - iNumberOfLeadingZeros12) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                        }
                    }
                    i5 += iNumberOfLeadingZeros7;
                    break;
                case 51:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 52:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 53:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.br(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 54:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.br(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 55:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.bn(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 56:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 57:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 58:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = ((352 - (Integer.numberOfLeadingZeros(iJ << 3) * 9)) >>> 6) + 1;
                        i5 += iC;
                    }
                    break;
                case 59:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        Object object2 = unsafe.getObject(obj2, jN);
                        iC = object2 instanceof bhy ? bih.E(iJ, (bhy) object2) : bih.G(iJ, (String) object2);
                        i5 += iC;
                    }
                    break;
                case 60:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = bjt.c(iJ, unsafe.getObject(obj2, jN), bjlVar.q(i3));
                        i5 += iC;
                    }
                    break;
                case 61:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = bih.E(iJ, (bhy) unsafe.getObject(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 62:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.bq(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 63:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.bn(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 64:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 4;
                        i5 += iC;
                    }
                    break;
                case 65:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iJ << 3);
                        iC = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 8;
                        i5 += iC;
                    }
                    break;
                case 66:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.bo(iJ, k(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 67:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = a.bp(iJ, o(obj2, jN));
                        i5 += iC;
                    }
                    break;
                case 68:
                    if (bjlVar.J(obj2, iJ, i3)) {
                        iC = bjt.a(iJ, (bji) unsafe.getObject(obj2, jN), bjlVar.q(i3));
                        i5 += iC;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
    }

    @Override // defpackage.bjs
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
                        long jDoubleToLongBits = Double.doubleToLongBits(bke.a(obj, jN));
                        byte[] bArr = bix.a;
                        iAk = a.ak(jDoubleToLongBits);
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iAk = Float.floatToIntBits(bke.b(obj, jN));
                        break;
                    case 2:
                        i = iHashCode * 53;
                        long jD = bke.d(obj, jN);
                        byte[] bArr2 = bix.a;
                        iAk = a.ak(jD);
                        break;
                    case 3:
                        i = iHashCode * 53;
                        long jD2 = bke.d(obj, jN);
                        byte[] bArr3 = bix.a;
                        iAk = a.ak(jD2);
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 5:
                        i = iHashCode * 53;
                        long jD3 = bke.d(obj, jN);
                        byte[] bArr4 = bix.a;
                        iAk = a.ak(jD3);
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zS = bke.s(obj, jN);
                        byte[] bArr5 = bix.a;
                        iAk = a.aj(zS);
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iAk = ((String) bke.f(obj, jN)).hashCode();
                        break;
                    case 9:
                        i = iHashCode * 53;
                        Object objF = bke.f(obj, jN);
                        if (objF != null) {
                            iAk = objF.hashCode();
                        }
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iAk = bke.f(obj, jN).hashCode();
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 14:
                        i = iHashCode * 53;
                        long jD4 = bke.d(obj, jN);
                        byte[] bArr6 = bix.a;
                        iAk = a.ak(jD4);
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iAk = bke.c(obj, jN);
                        break;
                    case 16:
                        i = iHashCode * 53;
                        long jD5 = bke.d(obj, jN);
                        byte[] bArr7 = bix.a;
                        iAk = a.ak(jD5);
                        break;
                    case 17:
                        i = iHashCode * 53;
                        Object objF2 = bke.f(obj, jN);
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
                        iAk = bke.f(obj, jN).hashCode();
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iAk = bke.f(obj, jN).hashCode();
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
                return this.h ? (iHashCode2 * 53) + azw.o(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!J(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + bke.f(obj, n(m(i5))).hashCode();
            }
            i4++;
        }
    }

    @Override // defpackage.bjs
    public final Object c() {
        return ((bis) this.g).l();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    @Override // defpackage.bjs
    public final void d(Object obj) {
        if (H(obj)) {
            if (obj instanceof bis) {
                bis bisVar = (bis) obj;
                bisVar.q(Alert.DURATION_SHOW_INDEFINITELY);
                bisVar.memoizedHashCode = 0;
                bisVar.o();
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
                                if (E(obj, i)) {
                                    q(i).d(b.getObject(obj, j));
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
                                azw.m(obj, j).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((bjf) object).c();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (J(obj, j(i), i)) {
                        q(i).d(b.getObject(obj, j));
                    }
                } else if (E(obj, i)) {
                    q(i).d(b.getObject(obj, j));
                }
            }
            this.m.e(obj);
            if (this.h) {
                azw.q(obj);
            }
        }
    }

    @Override // defpackage.bjs
    public final void e(Object obj, Object obj2) {
        v(obj);
        bix.a(obj2);
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            long jN = n(iM);
            int iJ = j(i);
            switch ((iM >>> 20) & 255) {
                case 0:
                    if (E(obj2, i)) {
                        bke.m(obj, jN, bke.a(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 1:
                    if (E(obj2, i)) {
                        bke.n(obj, jN, bke.b(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 2:
                    if (E(obj2, i)) {
                        bke.p(obj, jN, bke.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 3:
                    if (E(obj2, i)) {
                        bke.p(obj, jN, bke.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 4:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 5:
                    if (E(obj2, i)) {
                        bke.p(obj, jN, bke.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 6:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 7:
                    if (E(obj2, i)) {
                        bke.j(obj, jN, bke.s(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 8:
                    if (E(obj2, i)) {
                        bke.q(obj, jN, bke.f(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 9:
                    w(obj, obj2, i);
                    break;
                case 10:
                    if (E(obj2, i)) {
                        bke.q(obj, jN, bke.f(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 11:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 12:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 13:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 14:
                    if (E(obj2, i)) {
                        bke.p(obj, jN, bke.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 15:
                    if (E(obj2, i)) {
                        bke.o(obj, jN, bke.c(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 16:
                    if (E(obj2, i)) {
                        bke.p(obj, jN, bke.d(obj2, jN));
                        z(obj, i);
                    }
                    break;
                case 17:
                    w(obj, obj2, i);
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
                    biw biwVarM = azw.m(obj, jN);
                    biw biwVarM2 = azw.m(obj2, jN);
                    int size = biwVarM.size();
                    int size2 = biwVarM2.size();
                    if (size > 0 && size2 > 0) {
                        if (!biwVarM.c()) {
                            biwVarM = biwVarM.d(size2 + size);
                        }
                        biwVarM.addAll(biwVarM2);
                    }
                    if (size > 0) {
                        biwVarM2 = biwVarM;
                    }
                    bke.q(obj, jN, biwVarM2);
                    break;
                case 50:
                    Class cls = bjt.a;
                    bke.q(obj, jN, azx.e(bke.f(obj, jN), bke.f(obj2, jN)));
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
                    if (J(obj2, iJ, i)) {
                        bke.q(obj, jN, bke.f(obj2, jN));
                        A(obj, iJ, i);
                    }
                    break;
                case 60:
                    x(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (J(obj2, iJ, i)) {
                        bke.q(obj, jN, bke.f(obj2, jN));
                        A(obj, iJ, i);
                    }
                    break;
                case 68:
                    x(obj, obj2, i);
                    break;
            }
        }
        bjt.i(this.m, obj, obj2);
        if (this.h) {
            bjt.l(obj, obj2);
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
    /* JADX WARN: Type inference failed for: r13v10, types: [bjl] */
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
    /* JADX WARN: Type inference failed for: r1v0, types: [bjl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bjl] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [bjl] */
    /* JADX WARN: Type inference failed for: r1v3, types: [bjl] */
    /* JADX WARN: Type inference failed for: r1v37, types: [bjl] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bjl] */
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
    /* JADX WARN: Type inference failed for: r5v10, types: [bjy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [bjy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [bjy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bjy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [bjy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bjy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bjy] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [bjy] */
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
    @Override // defpackage.bjs
    public final void f(Object obj, bid bidVar, bil bilVar) throws Throwable {
        ?? r2;
        int i;
        Object objR;
        ?? r6;
        ?? r1;
        ?? r5;
        ?? r13;
        Object objR2;
        ?? r7;
        Throwable th;
        int i2;
        ?? r3 = this;
        byte[] bArr = bix.a;
        bilVar.getClass();
        v(obj);
        Throwable th2 = null;
        ?? r8 = r3.m;
        Object objB = null;
        while (true) {
            try {
                int iC = bidVar.c();
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
                                bke.m(obj, iM & 1048575, bidVar.a());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 1:
                                th = th2;
                                bke.n(obj, iM & 1048575, bidVar.b());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 2:
                                th = th2;
                                bke.p(obj, iM & 1048575, bidVar.k());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 3:
                                th = th2;
                                bke.p(obj, iM & 1048575, bidVar.n());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 4:
                                th = th2;
                                bke.a.l(obj, iM & 1048575, bidVar.f());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 5:
                                th = th2;
                                bke.p(obj, iM & 1048575, bidVar.j());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 6:
                                th = th2;
                                bke.a.l(obj, iM & 1048575, bidVar.e());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 7:
                                th = th2;
                                bke.j(obj, iM & 1048575, bidVar.M());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 8:
                                th = th2;
                                r13.y(obj, iM, bidVar);
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 9:
                                th = th2;
                                bji bjiVar = (bji) r13.t(obj, i3);
                                bidVar.v(bjiVar, r13.q(i3), bilVar);
                                r13.B(obj, i3, bjiVar);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 10:
                                th = th2;
                                bke.a.n(obj, iM & 1048575, bidVar.o());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 11:
                                th = th2;
                                bke.a.l(obj, iM & 1048575, bidVar.i());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 12:
                                th = th2;
                                int iD = bidVar.d();
                                biv bivVarP = r13.p(i3);
                                if (bivVarP == null || bivVarP.a()) {
                                    bke.a.l(obj, iM & 1048575, iD);
                                    r13.z(obj, i3);
                                } else {
                                    objB = bjt.h(obj, iC, iD, objB, r8);
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 13:
                                th = th2;
                                bke.a.l(obj, iM & 1048575, bidVar.g());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 14:
                                th = th2;
                                bke.p(obj, iM & 1048575, bidVar.l());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 15:
                                th = th2;
                                bke.a.l(obj, iM & 1048575, bidVar.h());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 16:
                                th = th2;
                                bke.p(obj, iM & 1048575, bidVar.m());
                                r13.z(obj, i3);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 17:
                                th = th2;
                                bji bjiVar2 = (bji) r13.t(obj, i3);
                                bidVar.t(bjiVar2, r13.q(i3), bilVar);
                                r13.B(obj, i3, bjiVar2);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 18:
                                th = th2;
                                bidVar.x(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 19:
                                th = th2;
                                bidVar.B(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 20:
                                th = th2;
                                bidVar.D(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 21:
                                th = th2;
                                bidVar.K(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 22:
                                th = th2;
                                bidVar.C(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 23:
                                th = th2;
                                bidVar.A(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 24:
                                th = th2;
                                bidVar.z(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 25:
                                th = th2;
                                bidVar.w(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 26:
                                th = th2;
                                int i7 = 536870912 & iM;
                                int i8 = iM & 1048575;
                                if (i7 != 0) {
                                    bidVar.I(azw.n(obj, i8), true);
                                } else {
                                    bidVar.I(azw.n(obj, i8), false);
                                }
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 27:
                                th = th2;
                                bjs bjsVarQ = r13.q(i3);
                                List listN = azw.n(obj, iM & 1048575);
                                int i9 = bidVar.b;
                                if ((i9 & 7) != 2) {
                                    throw new biz();
                                }
                                while (true) {
                                    listN.add(bidVar.q(bjsVarQ, bilVar));
                                    bic bicVar = bidVar.a;
                                    if (!bicVar.A() && bidVar.c == 0) {
                                        int iM2 = bicVar.m();
                                        if (iM2 != i9) {
                                            bidVar.c = iM2;
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
                                List listN2 = azw.n(obj, iM & 1048575);
                                if ((bidVar.b & 7) != 2) {
                                    throw new biz();
                                }
                                while (true) {
                                    listN2.add(bidVar.o());
                                    bic bicVar2 = bidVar.a;
                                    if (!bicVar2.A()) {
                                        int iM3 = bicVar2.m();
                                        if (iM3 != bidVar.b) {
                                            bidVar.c = iM3;
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
                                bidVar.J(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 30:
                                th = th2;
                                List listN3 = azw.n(obj, iM & 1048575);
                                bidVar.y(listN3);
                                objB = bjt.g(obj, iC, listN3, r13.p(i3), objB, r8);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 31:
                                th = th2;
                                bidVar.E(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 32:
                                th = th2;
                                bidVar.F(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 33:
                                th = th2;
                                bidVar.G(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 34:
                                th = th2;
                                bidVar.H(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 35:
                                th = th2;
                                bidVar.x(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 36:
                                th = th2;
                                bidVar.B(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 37:
                                th = th2;
                                bidVar.D(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 38:
                                th = th2;
                                bidVar.K(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 39:
                                th = th2;
                                bidVar.C(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 40:
                                th = th2;
                                bidVar.A(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 41:
                                th = th2;
                                bidVar.z(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 42:
                                th = th2;
                                bidVar.w(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 43:
                                th = th2;
                                bidVar.J(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 44:
                                th = th2;
                                List listN4 = azw.n(obj, iM & 1048575);
                                bidVar.y(listN4);
                                objB = bjt.g(obj, iC, listN4, r13.p(i3), objB, r8);
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 45:
                                th = th2;
                                bidVar.E(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 46:
                                th = th2;
                                bidVar.F(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 47:
                                th = th2;
                                bidVar.G(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 48:
                                th = th2;
                                bidVar.H(azw.n(obj, iM & 1048575));
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 49:
                                th = th2;
                                bjs bjsVarQ2 = r13.q(i3);
                                List listN5 = azw.n(obj, iM & 1048575);
                                int i10 = bidVar.b;
                                if ((i10 & 7) != 3) {
                                    throw new biz();
                                }
                                while (true) {
                                    Object objC = bjsVarQ2.c();
                                    bidVar.u(objC, bjsVarQ2, bilVar);
                                    bjsVarQ2.d(objC);
                                    listN5.add(objC);
                                    bic bicVar3 = bidVar.a;
                                    if (!bicVar3.A() && bidVar.c == 0) {
                                        int iM4 = bicVar3.m();
                                        if (iM4 != i10) {
                                            bidVar.c = iM4;
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
                                    Object objS = r13.s(i3);
                                    int iM5 = r13.m(i3) & 1048575;
                                    bkd bkdVar = bke.a;
                                    long j = iM5;
                                    try {
                                        Object objK = bkdVar.k(obj, j);
                                        if (objK == null) {
                                            try {
                                                objK = bjf.a.a();
                                                bkdVar.n(obj, j, objK);
                                            } catch (biz unused) {
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
                                                if (!r8.a(objB, bidVar, 0)) {
                                                    objR2 = objB;
                                                    r7 = r8;
                                                    for (i2 = r3.k; i2 < r3.l; i2++) {
                                                        ?? r9 = r7;
                                                        objR2 = r3.r(r2, r3.j[i2], objR2, r9, obj);
                                                        r7 = r9;
                                                    }
                                                    if (objR2 != null) {
                                                        r7.f(r2, (bjz) objR2);
                                                    }
                                                }
                                                th2 = th;
                                            }
                                        } else if (!((bjf) objK).b) {
                                            bjf bjfVarA = bjf.a.a();
                                            azx.e(bjfVarA, objK);
                                            bkdVar.n(obj, j, bjfVarA);
                                            objK = bjfVarA;
                                        }
                                        bjf bjfVar = (bjf) objK;
                                        Object obj2 = ((ci) objS).a;
                                        bidVar.L(2);
                                        bic bicVar4 = bidVar.a;
                                        int iE = bicVar4.e(bicVar4.n());
                                        Object obj3 = ((djl) obj2).b;
                                        Object obj4 = ((djl) obj2).d;
                                        Object objP = obj3;
                                        Object objP2 = obj4;
                                        while (true) {
                                            try {
                                                int iC2 = bidVar.c();
                                                if (iC2 != i6) {
                                                    if (bicVar4.A()) {
                                                        th = null;
                                                    } else {
                                                        if (iC2 == 1) {
                                                            objP = bidVar.p((bkl) ((djl) obj2).c, null, null);
                                                        } else if (iC2 != 2) {
                                                            try {
                                                                if (!bidVar.N()) {
                                                                    throw new bja("Unable to parse map entry.");
                                                                }
                                                                continue;
                                                            } catch (biz e) {
                                                                if (!bidVar.N()) {
                                                                    throw new bja(e, null);
                                                                }
                                                                bidVar.a.y(iE);
                                                                throw th;
                                                            }
                                                        } else {
                                                            objP2 = bidVar.p((bkl) ((djl) obj2).a, obj4.getClass(), bilVar);
                                                        }
                                                        i6 = Alert.DURATION_SHOW_INDEFINITELY;
                                                    }
                                                    th = th;
                                                    bidVar.a.y(iE);
                                                    throw th;
                                                }
                                                th = null;
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        try {
                                            bjfVar.put(objP, objP2);
                                            try {
                                                bidVar.a.y(iE);
                                                th2 = th;
                                                r13 = r13;
                                                r3 = r13;
                                            } catch (biz unused2) {
                                                r2 = obj;
                                                r3 = r13;
                                                if (objB == null) {
                                                    objB = r8.b(r2);
                                                }
                                                if (!r8.a(objB, bidVar, 0)) {
                                                    objR2 = objB;
                                                    r7 = r8;
                                                    while (i2 < r3.l) {
                                                        ?? r10 = r7;
                                                        objR2 = r3.r(r2, r3.j[i2], objR2, r10, obj);
                                                        r7 = r10;
                                                    }
                                                    if (objR2 != null) {
                                                        r7.f(r2, (bjz) objR2);
                                                    }
                                                }
                                                th2 = th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (biz unused3) {
                                        th = null;
                                    }
                                } catch (biz unused4) {
                                    th = th2;
                                }
                                break;
                            case 51:
                                bke.a.n(obj, iM & 1048575, Double.valueOf(bidVar.a()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 52:
                                bke.a.n(obj, iM & 1048575, Float.valueOf(bidVar.b()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 53:
                                bke.a.n(obj, iM & 1048575, Long.valueOf(bidVar.k()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 54:
                                bke.a.n(obj, iM & 1048575, Long.valueOf(bidVar.n()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 55:
                                bke.a.n(obj, iM & 1048575, Integer.valueOf(bidVar.f()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 56:
                                bke.a.n(obj, iM & 1048575, Long.valueOf(bidVar.j()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 57:
                                bke.a.n(obj, iM & 1048575, Integer.valueOf(bidVar.e()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 58:
                                bke.a.n(obj, iM & 1048575, Boolean.valueOf(bidVar.M()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 59:
                                r13.y(obj, iM, bidVar);
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 60:
                                bji bjiVar3 = (bji) r13.u(obj, iC, i3);
                                bidVar.v(bjiVar3, r13.q(i3), bilVar);
                                r13.C(obj, iC, i3, bjiVar3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 61:
                                bke.a.n(obj, iM & 1048575, bidVar.o());
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 62:
                                bke.a.n(obj, iM & 1048575, Integer.valueOf(bidVar.i()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 63:
                                int iD2 = bidVar.d();
                                biv bivVarP2 = r13.p(i3);
                                if (bivVarP2 == null || bivVarP2.a()) {
                                    bke.a.n(obj, iM & 1048575, Integer.valueOf(iD2));
                                    r13.A(obj, iC, i3);
                                    th = th2;
                                    th2 = th;
                                    r13 = r13;
                                } else {
                                    objB = bjt.h(obj, iC, iD2, objB, r8);
                                    r13 = r13;
                                }
                                r3 = r13;
                                break;
                            case 64:
                                bke.a.n(obj, iM & 1048575, Integer.valueOf(bidVar.g()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 65:
                                bke.a.n(obj, iM & 1048575, Long.valueOf(bidVar.l()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 66:
                                bke.a.n(obj, iM & 1048575, Integer.valueOf(bidVar.h()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 67:
                                bke.a.n(obj, iM & 1048575, Long.valueOf(bidVar.m()));
                                r13.A(obj, iC, i3);
                                th = th2;
                                th2 = th;
                                r13 = r13;
                                r3 = r13;
                                break;
                            case 68:
                                try {
                                    bji bjiVar4 = (bji) r13.u(obj, iC, i3);
                                    bidVar.t(bjiVar4, r13.q(i3), bilVar);
                                    r13.C(obj, iC, i3, bjiVar4);
                                    th = th2;
                                    th2 = th;
                                    r13 = r13;
                                    r3 = r13;
                                } catch (biz unused5) {
                                    r2 = obj;
                                    th = th2;
                                    r3 = r13;
                                    if (objB == null) {
                                        objB = r8.b(r2);
                                    }
                                    if (!r8.a(objB, bidVar, 0)) {
                                        objR2 = objB;
                                        r7 = r8;
                                        while (i2 < r3.l) {
                                            ?? r11 = r7;
                                            objR2 = r3.r(r2, r3.j[i2], objR2, r11, obj);
                                            r7 = r11;
                                        }
                                        if (objR2 != null) {
                                            r7.f(r2, (bjz) objR2);
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
                                    } catch (biz unused6) {
                                        r3 = r13;
                                        if (objB == null) {
                                            objB = r8.b(r2);
                                        }
                                        if (!r8.a(objB, bidVar, 0)) {
                                            objR2 = objB;
                                            r7 = r8;
                                            while (i2 < r3.l) {
                                                ?? r12 = r7;
                                                objR2 = r3.r(r2, r3.j[i2], objR2, r12, obj);
                                                r7 = r12;
                                            }
                                            if (objR2 != null) {
                                                r7.f(r2, (bjz) objR2);
                                            }
                                        }
                                        th2 = th;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        r3 = r13;
                                        i = r3.k;
                                        objR = objB;
                                        r1 = r3;
                                        r6 = r8;
                                        while (i < r1.l) {
                                            ?? r14 = r6;
                                            objR = r1.r(r2, r1.j[i], objR, r14, obj);
                                            i++;
                                            r1 = this;
                                            r6 = r14;
                                        }
                                        r5 = r6;
                                        if (objR != null) {
                                            r5.f(r2, (bjz) objR);
                                        }
                                        throw th;
                                    }
                                    break;
                                }
                                if (!r8.a(objB, bidVar, 0)) {
                                    objR2 = objB;
                                    r7 = r8;
                                    for (int i11 = r13.k; i11 < r13.l; i11++) {
                                        ?? r15 = r7;
                                        objR2 = r13.r(r2, r13.j[i11], objR2, r15, obj);
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
                        objR = objB;
                        r1 = r3;
                        r6 = r8;
                        while (i < r1.l) {
                            ?? r16 = r6;
                            objR = r1.r(r2, r1.j[i], objR, r16, obj);
                            i++;
                            r1 = this;
                            r6 = r16;
                        }
                        r5 = r6;
                        if (objR != null) {
                            r5.f(r2, (bjz) objR);
                        }
                        throw th;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    objR2 = objB;
                    r7 = r8;
                    for (int i12 = r3.k; i12 < r3.l; i12++) {
                        ?? r17 = r7;
                        objR2 = r3.r(obj, r3.j[i12], objR2, r17, obj);
                        r7 = r17;
                    }
                    r2 = obj;
                } else {
                    Object obj5 = obj;
                    try {
                        if ((!r3.h ? th2 : bilVar.b(r3.g, iC)) != null) {
                            azw.p(obj5);
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
                        if (r8.a(objB, bidVar, 0)) {
                            r13 = r3;
                            r3 = r13;
                        } else {
                            int i13 = r3.k;
                            objR2 = objB;
                            r7 = r8;
                            for (?? r4 = r3; i13 < r4.l; r4 = r4) {
                                ?? r18 = r7;
                                Object obj6 = obj5;
                                objR2 = r4.r(obj6, r4.j[i13], objR2, r18, obj);
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
            objR = objB;
            r1 = r3;
            r6 = r8;
            while (i < r1.l) {
                ?? r19 = r6;
                objR = r1.r(r2, r1.j[i], objR, r19, obj);
                i++;
                r1 = this;
                r6 = r19;
            }
            r5 = r6;
            if (objR != null) {
                r5.f(r2, (bjz) objR);
            }
            throw th;
        }
        if (objR2 != null) {
            r7.f(r2, (bjz) objR2);
        }
    }

    @Override // defpackage.bjs
    public final boolean g(Object obj, Object obj2) {
        boolean zAe;
        for (int i = 0; i < this.c.length; i += 3) {
            int iM = m(i);
            int i2 = (iM >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jN = n(iM);
                switch (i2) {
                    case 0:
                        if (!D(obj, obj2, i) || Double.doubleToLongBits(bke.a(obj, jN)) != Double.doubleToLongBits(bke.a(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!D(obj, obj2, i) || Float.floatToIntBits(bke.b(obj, jN)) != Float.floatToIntBits(bke.b(obj2, jN))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!D(obj, obj2, i) || bke.d(obj, jN) != bke.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!D(obj, obj2, i) || bke.d(obj, jN) != bke.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!D(obj, obj2, i) || bke.d(obj, jN) != bke.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!D(obj, obj2, i) || bke.s(obj, jN) != bke.s(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        Object objF = bke.f(obj, jN);
                        Object objF2 = bke.f(obj2, jN);
                        Class cls = bjt.a;
                        if (!a.ae(objF, objF2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        Object objF3 = bke.f(obj, jN);
                        Object objF4 = bke.f(obj2, jN);
                        Class cls2 = bjt.a;
                        if (!a.ae(objF3, objF4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        Object objF5 = bke.f(obj, jN);
                        Object objF6 = bke.f(obj2, jN);
                        Class cls3 = bjt.a;
                        if (!a.ae(objF5, objF6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!D(obj, obj2, i) || bke.d(obj, jN) != bke.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!D(obj, obj2, i) || bke.c(obj, jN) != bke.c(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!D(obj, obj2, i) || bke.d(obj, jN) != bke.d(obj2, jN)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!D(obj, obj2, i)) {
                            return false;
                        }
                        Object objF7 = bke.f(obj, jN);
                        Object objF8 = bke.f(obj2, jN);
                        Class cls4 = bjt.a;
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
                        Object objF9 = bke.f(obj, jN);
                        Object objF10 = bke.f(obj2, jN);
                        Class cls5 = bjt.a;
                        zAe = a.ae(objF9, objF10);
                        break;
                    case 50:
                        Object objF11 = bke.f(obj, jN);
                        Object objF12 = bke.f(obj2, jN);
                        Class cls6 = bjt.a;
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
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        Object objF13 = bke.f(obj, jN);
                        Object objF14 = bke.f(obj2, jN);
                        Class cls7 = bjt.a;
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
        int i3 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i3 >= iArr.length) {
                bjy bjyVar = this.m;
                if (!bjyVar.c(obj).equals(bjyVar.c(obj2))) {
                    return false;
                }
                if (this.h) {
                    return azw.o(obj).equals(azw.o(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!I(obj, obj2, i4)) {
                return false;
            }
            if (!J(obj, 0, i4)) {
                long jN2 = n(m(i4));
                Object objF15 = bke.f(obj, jN2);
                Object objF16 = bke.f(obj2, jN2);
                Class cls8 = bjt.a;
                if (!a.ae(objF15, objF16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3 A[LOOP:2: B:50:0x00d3->B:54:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6 A[SYNTHETIC] */
    @Override // defpackage.bjs
    public final boolean h(Object obj) {
        int i;
        int i2;
        List list;
        bjs bjsVarQ;
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
            bjl bjlVar = this;
            Object obj2 = obj;
            if (a.ag(iM) && !bjlVar.F(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iM >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (bjlVar.F(obj2, i7, i, i2, i10) && !G(obj2, iM, bjlVar.q(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (List) bke.f(obj2, n(iM));
                if (list.isEmpty()) {
                    continue;
                } else {
                    bjsVarQ = bjlVar.q(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (bjsVarQ.h(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (bjlVar.J(obj2, bjlVar.j(i7), i7) && !G(obj2, iM, bjlVar.q(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (List) bke.f(obj2, n(iM));
                if (list.isEmpty()) {
                    bjsVarQ = bjlVar.q(i7);
                    while (i3 < list.size()) {
                        if (bjsVarQ.h(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                bjf bjfVar = (bjf) bke.f(obj2, n(iM));
                if (bjfVar.isEmpty()) {
                    continue;
                } else {
                    if (((bkl) azx.o(bjlVar.s(i7)).a).s == bkm.i) {
                        bjs bjsVarB = null;
                        for (Object obj3 : bjfVar.values()) {
                            if (bjsVarB == null) {
                                bjsVarB = bjp.a.b(((bis) obj3).getClass());
                            }
                            if (!bjsVarB.h(obj3)) {
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
            this = bjlVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        Object obj4 = obj;
        if (this.h) {
            azw.o(obj4).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.bjs
    public final void i(Object obj, zf zfVar) {
        Map.Entry entry;
        int i;
        int i2;
        bjl bjlVar = this;
        if (bjlVar.h) {
            bin binVarO = azw.o(obj);
            if (binVarO.e()) {
                entry = null;
            } else {
                entry = (Map.Entry) binVarO.b().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = bjlVar.c;
        Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < iArr.length) {
            int iM = bjlVar.m(i5);
            int iJ = bjlVar.j(i5);
            int i7 = (iM >>> 20) & 255;
            if (i7 <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long jN = n(iM);
            switch (i7) {
                case 0:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.r(iJ, bke.a(obj, jN));
                    }
                    break;
                case 1:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.v(iJ, bke.b(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 2:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.y(iJ, unsafe.getLong(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 3:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.F(iJ, unsafe.getLong(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 4:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.x(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 5:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.u(iJ, unsafe.getLong(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 6:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.t(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 7:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.p(iJ, bke.s(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 8:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        L(iJ, unsafe.getObject(obj, jN), zfVar);
                    }
                    bjlVar = this;
                    break;
                case 9:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.z(iJ, unsafe.getObject(obj, jN), bjlVar.q(i5));
                    }
                    break;
                case 10:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.q(iJ, (bhy) unsafe.getObject(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 11:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.E(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 12:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.s(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 13:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.A(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 14:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.B(iJ, unsafe.getLong(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 15:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.C(iJ, unsafe.getInt(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 16:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.D(iJ, unsafe.getLong(obj, jN));
                    }
                    bjlVar = this;
                    break;
                case 17:
                    if (bjlVar.F(obj, i5, i4, i6, i)) {
                        zfVar.w(iJ, unsafe.getObject(obj, jN), bjlVar.q(i5));
                    }
                    break;
                case 18:
                    i2 = i4;
                    bjt.n(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 19:
                    i2 = i4;
                    bjt.o(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 20:
                    i2 = i4;
                    bjt.v(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 21:
                    i2 = i4;
                    bjt.v(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 22:
                    i2 = i4;
                    bjt.s(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 23:
                    i2 = i4;
                    bjt.u(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 24:
                    i2 = i4;
                    bjt.t(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 25:
                    i2 = i4;
                    bjt.m(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 26:
                    i2 = i4;
                    int iJ2 = bjlVar.j(i5);
                    List list = (List) unsafe.getObject(obj, jN);
                    Class cls = bjt.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof bjd) {
                            bjd bjdVar = (bjd) list;
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                Object objC = bjdVar.c();
                                if (objC instanceof String) {
                                    ((bih) zfVar.a).q(iJ2, (String) objC);
                                } else {
                                    ((bih) zfVar.a).f(iJ2, (bhy) objC);
                                }
                            }
                        } else {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                ((bih) zfVar.a).q(iJ2, (String) list.get(i11));
                            }
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int iJ3 = bjlVar.j(i5);
                    List list2 = (List) unsafe.getObject(obj, jN);
                    bjs bjsVarQ = bjlVar.q(i5);
                    Class cls2 = bjt.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i12 = 0; i12 < list2.size(); i12++) {
                            zfVar.z(iJ3, list2.get(i12), bjsVarQ);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int iJ4 = bjlVar.j(i5);
                    List list3 = (List) unsafe.getObject(obj, jN);
                    Class cls3 = bjt.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            ((bih) zfVar.a).f(iJ4, (bhy) list3.get(i13));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    i2 = i4;
                    bjt.r(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 30:
                    i2 = i4;
                    bjt.s(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 31:
                    i2 = i4;
                    bjt.t(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 32:
                    i2 = i4;
                    bjt.u(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 33:
                    i2 = i4;
                    bjt.p(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 34:
                    i2 = i4;
                    bjt.q(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, false);
                    i4 = i2;
                    break;
                case 35:
                    i2 = i4;
                    bjt.n(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    bjt.o(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    bjt.v(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    bjt.v(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    bjt.s(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    bjt.u(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    bjt.t(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    bjt.m(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    bjt.r(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    bjt.s(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    bjt.t(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    bjt.u(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    bjt.p(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    bjt.q(bjlVar.j(i5), (List) unsafe.getObject(obj, jN), zfVar, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int iJ5 = bjlVar.j(i5);
                    List list4 = (List) unsafe.getObject(obj, jN);
                    bjs bjsVarQ2 = bjlVar.q(i5);
                    Class cls4 = bjt.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            zfVar.w(iJ5, list4.get(i14), bjsVarQ2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, jN);
                    if (object != null) {
                        djl djlVarO = azx.o(bjlVar.s(i5));
                        Object obj2 = zfVar.a;
                        Iterator it = ((bjf) object).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            bih bihVar = (bih) obj2;
                            bihVar.s(iJ, 2);
                            bihVar.u(ci.D(djlVarO, entry2.getKey(), entry2.getValue()));
                            ci.E(bihVar, djlVarO, entry2.getKey(), entry2.getValue());
                            i4 = i4;
                        }
                    }
                    break;
                case 51:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.r(iJ, ((Double) bke.f(obj, jN)).doubleValue());
                    }
                    break;
                case 52:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.v(iJ, ((Float) bke.f(obj, jN)).floatValue());
                    }
                    break;
                case 53:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.y(iJ, o(obj, jN));
                    }
                    break;
                case 54:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.F(iJ, o(obj, jN));
                    }
                    break;
                case 55:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.x(iJ, k(obj, jN));
                    }
                    break;
                case 56:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.u(iJ, o(obj, jN));
                    }
                    break;
                case 57:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.t(iJ, k(obj, jN));
                    }
                    break;
                case 58:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.p(iJ, ((Boolean) bke.f(obj, jN)).booleanValue());
                    }
                    break;
                case 59:
                    if (bjlVar.J(obj, iJ, i5)) {
                        L(iJ, unsafe.getObject(obj, jN), zfVar);
                    }
                    break;
                case 60:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.z(iJ, unsafe.getObject(obj, jN), bjlVar.q(i5));
                    }
                    break;
                case 61:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.q(iJ, (bhy) unsafe.getObject(obj, jN));
                    }
                    break;
                case 62:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.E(iJ, k(obj, jN));
                    }
                    break;
                case 63:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.s(iJ, k(obj, jN));
                    }
                    break;
                case 64:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.A(iJ, k(obj, jN));
                    }
                    break;
                case 65:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.B(iJ, o(obj, jN));
                    }
                    break;
                case 66:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.C(iJ, k(obj, jN));
                    }
                    break;
                case 67:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.D(iJ, o(obj, jN));
                    }
                    break;
                case 68:
                    if (bjlVar.J(obj, iJ, i5)) {
                        zfVar.w(iJ, unsafe.getObject(obj, jN), bjlVar.q(i5));
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        bjlVar.m.c(obj).f(zfVar);
    }
}
