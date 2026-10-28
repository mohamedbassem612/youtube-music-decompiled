package defpackage;

import androidx.car.app.model.Alert;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiiu implements aijg {
    public static final int[] a = new int[0];
    public static final Unsafe b = aijy.g();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final MessageLite g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final aijs m;

    public aiiu(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, int[] iArr2, int i3, int i4, aijs aijsVar, ahng ahngVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = messageLite instanceof aihn;
        boolean z = false;
        if (ahngVar != null && (messageLite instanceof aihi)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = aijsVar;
        this.g = messageLite;
    }

    private static void A(Object obj) {
        if (!M(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void B(Object obj, Object obj2, int i) {
        if (J(obj2, i)) {
            int iS = s(i) & 1048575;
            Unsafe unsafe = b;
            long j = iS;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            aijg aijgVarW = w(i);
            if (!J(obj, i)) {
                if (M(object)) {
                    Object objE = aijgVarW.e();
                    aijgVarW.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                E(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!M(object2)) {
                Object objE2 = aijgVarW.e();
                aijgVarW.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            aijgVarW.h(object2, object);
        }
    }

    private final void C(Object obj, Object obj2, int i) {
        int iN = n(i);
        if (O(obj2, iN, i)) {
            int iS = s(i) & 1048575;
            Unsafe unsafe = b;
            long j = iS;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            aijg aijgVarW = w(i);
            if (!O(obj, iN, i)) {
                if (M(object)) {
                    Object objE = aijgVarW.e();
                    aijgVarW.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                F(obj, iN, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!M(object2)) {
                Object objE2 = aijgVarW.e();
                aijgVarW.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            aijgVarW.h(object2, object);
        }
    }

    private final void D(Object obj, int i, aign aignVar) throws aiij {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            aijy.a.l(obj, j, aignVar.u());
        } else if (this.i) {
            aijy.a.l(obj, j, aignVar.t());
        } else {
            aijy.a.l(obj, j, aignVar.o());
        }
    }

    private final void E(Object obj, int i) {
        int iQ = q(i);
        long j = 1048575 & iQ;
        if (j != 1048575) {
            aijx aijxVar = aijy.a;
            aijxVar.j(obj, j, aijxVar.g(obj, j) | (1 << (iQ >>> 20)));
        }
    }

    private final void F(Object obj, int i, int i2) {
        aijy.a.j(obj, q(i2) & 1048575, i);
    }

    private final void G(Object obj, int i, Object obj2) {
        b.putObject(obj, s(i) & 1048575, obj2);
        E(obj, i);
    }

    private final void H(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, s(i2) & 1048575, obj2);
        F(obj, i, i2);
    }

    private final boolean I(Object obj, Object obj2, int i) {
        return J(obj, i) == J(obj2, i);
    }

    private final boolean J(Object obj, int i) {
        int iQ = q(i);
        long j = iQ & 1048575;
        if (j == 1048575) {
            int iS = s(i);
            long j2 = 1048575 & iS;
            switch ((iS >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(aijy.b(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(aijy.a.b(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (aijy.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (aijy.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (aijy.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return aijy.a.f(obj, j2);
                case 8:
                    Object objI = aijy.a.i(obj, j2);
                    if (objI instanceof String) {
                        if (((String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof aigj)) {
                            return P();
                        }
                        if (aigj.d.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (aijy.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (aigj.d.equals(aijy.a.i(obj, j2))) {
                        return false;
                    }
                    break;
                case 11:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (aijy.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (aijy.a.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (aijy.a.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (aijy.a.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    return P();
            }
        } else {
            if ((aijy.a.g(obj, j) & (1 << (iQ >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean K(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return J(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean L(Object obj, int i, aijg aijgVar) {
        return aijgVar.l(aijy.a.i(obj, i & 1048575));
    }

    private static boolean M(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof aihn) {
            return ((aihn) obj).isMutable();
        }
        return true;
    }

    private final boolean N(Object obj, Object obj2, int i) {
        long jQ = q(i) & 1048575;
        return aijy.c(obj, jQ) == aijy.c(obj2, jQ);
    }

    private final boolean O(Object obj, int i, int i2) {
        return aijy.a.g(obj, (long) (q(i2) & 1048575)) == i;
    }

    private boolean P() {
        throw new IllegalArgumentException();
    }

    private static final int Q(byte[] bArr, int i, int i2, aika aikaVar, Class cls, aifw aifwVar) {
        int i3;
        aika aikaVar2 = aika.DOUBLE;
        switch (aikaVar) {
            case DOUBLE:
                i3 = i + 8;
                int i4 = aifx.a;
                aifwVar.c = Double.valueOf(Double.longBitsToDouble(a.f(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                aifwVar.c = Float.valueOf(Float.intBitsToFloat(aifx.b(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int iV = aifx.v(bArr, i, aifwVar);
                aifwVar.c = Long.valueOf(aifwVar.b);
                return iV;
            case INT32:
            case UINT32:
            case ENUM:
                int iS = aifx.s(bArr, i, aifwVar);
                aifwVar.c = Integer.valueOf(aifwVar.a);
                return iS;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                int i5 = aifx.a;
                aifwVar.c = Long.valueOf(a.f(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                aifwVar.c = Integer.valueOf(aifx.b(bArr, i));
                break;
            case BOOL:
                int iV2 = aifx.v(bArr, i, aifwVar);
                aifwVar.c = Boolean.valueOf(aifwVar.b != 0);
                return iV2;
            case STRING:
                return aifx.q(bArr, i, aifwVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return aifx.e(aiiz.a.b(cls), bArr, i, i2, aifwVar);
            case BYTES:
                return aifx.a(bArr, i, aifwVar);
            case SINT32:
                int iS2 = aifx.s(bArr, i, aifwVar);
                int i6 = aifwVar.a;
                int i7 = aigm.l;
                aifwVar.c = Integer.valueOf((i6 >>> 1) ^ (-(i6 & 1)));
                return iS2;
            case SINT64:
                int iV3 = aifx.v(bArr, i, aifwVar);
                long j = aifwVar.b;
                int i8 = aigm.l;
                aifwVar.c = Long.valueOf((j >>> 1) ^ (-(j & 1)));
                return iV3;
        }
        return i3;
    }

    private final Object R(Object obj, int i, Object obj2, Object obj3) {
        aiht aihtVarV;
        int iN = n(i);
        Object objI = aijy.a.i(obj, s(i) & 1048575);
        if (objI != null && (aihtVarV = v(i)) != null) {
            Object obj4 = ((ahud) x(i)).b;
            Iterator it = ((aiip) objI).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!aihtVarV.isInRange(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = aijs.f(obj3);
                    }
                    int iR = ahud.R((axqr) obj4, entry.getKey(), entry.getValue());
                    aigj aigjVar = aigj.d;
                    byte[] bArr = new byte[iR];
                    aigo aigoVar = new aigo(bArr, 0, iR, null);
                    try {
                        ahud.S(aigoVar, (axqr) obj4, entry.getKey(), entry.getValue());
                        aigoVar.P();
                        ((aijt) obj2).f((iN << 3) | 2, new aigh(bArr));
                        it.remove();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return obj2;
    }

    private static final void S(int i, Object obj, ahud ahudVar) {
        if (obj instanceof String) {
            ahudVar.L(i, (String) obj);
        } else {
            ahudVar.w(i, (aigj) obj);
        }
    }

    static aijt d(Object obj) {
        aihn aihnVar = (aihn) obj;
        aijt aijtVar = aihnVar.unknownFields;
        if (aijtVar != aijt.a) {
            return aijtVar;
        }
        aijt aijtVar2 = new aijt();
        aihnVar.unknownFields = aijtVar2;
        return aijtVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final int n(int i) {
        return this.c[i];
    }

    private static int o(Object obj, long j) {
        return ((Integer) aijy.a.i(obj, j)).intValue();
    }

    private final int p(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return r(i, 0);
    }

    private final int q(int i) {
        return this.c[i + 2];
    }

    private final int r(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iN = n(i4);
            if (i == iN) {
                return i4;
            }
            if (i < iN) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 1];
    }

    private static long t(int i) {
        return i & 1048575;
    }

    private static long u(Object obj, long j) {
        return ((Long) aijy.e(obj, j)).longValue();
    }

    private final aiht v(int i) {
        return (aiht) this.d[((i / 3) << 1) + 1];
    }

    private final aijg w(int i) {
        Object[] objArr = this.d;
        int i2 = (i / 3) << 1;
        aijg aijgVar = (aijg) objArr[i2];
        if (aijgVar != null) {
            return aijgVar;
        }
        aijg aijgVarB = aiiz.a.b((Class) objArr[i2 + 1]);
        objArr[i2] = aijgVarB;
        return aijgVarB;
    }

    private final Object x(int i) {
        return this.d[(i / 3) << 1];
    }

    private final Object y(Object obj, int i) {
        aijg aijgVarW = w(i);
        int iS = s(i) & 1048575;
        if (!J(obj, i)) {
            return aijgVarW.e();
        }
        Object object = b.getObject(obj, iS);
        if (M(object)) {
            return object;
        }
        Object objE = aijgVarW.e();
        if (object != null) {
            aijgVarW.h(objE, object);
        }
        return objE;
    }

    private final Object z(Object obj, int i, int i2) {
        aijg aijgVarW = w(i2);
        if (!O(obj, i, i2)) {
            return aijgVarW.e();
        }
        Object object = b.getObject(obj, s(i2) & 1048575);
        if (M(object)) {
            return object;
        }
        Object objE = aijgVarW.e();
        if (object != null) {
            aijgVarW.h(objE, object);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0467  */
    /* JADX WARN: Code duplicated, block: B:194:0x0572  */
    /* JADX WARN: Code duplicated, block: B:199:0x0597  */
    @Override // defpackage.aijg
    public final int a(Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iK;
        int iNumberOfLeadingZeros2;
        int iD;
        int iJ;
        int size;
        int size2;
        int iJ2;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iAN;
        int iNumberOfLeadingZeros5;
        int iAN2;
        int iNumberOfLeadingZeros6;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int iNumberOfLeadingZeros9;
        int iNumberOfLeadingZeros10;
        int iA;
        int iNumberOfLeadingZeros11;
        int iNumberOfLeadingZeros12;
        aiiu aiiuVar = this;
        Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iNumberOfLeadingZeros13 = 0;
        while (true) {
            int[] iArr = aiiuVar.c;
            if (i3 >= iArr.length) {
                int iA2 = iNumberOfLeadingZeros13 + aijs.c(obj).a();
                if (!aiiuVar.h) {
                    return iA2;
                }
                aijl aijlVar = ahng.aT(obj).b;
                int size3 = aijlVar.size();
                int iJ3 = 0;
                for (int i5 = 0; i5 < size3; i5++) {
                    aiji aijiVar = (aiji) aijlVar.a(i5);
                    iJ3 += aiha.j(aijiVar.c, aijiVar.a);
                }
                return iA2 + iJ3;
            }
            int iS = aiiuVar.s(i3);
            int iN = aiiuVar.n(i3);
            int i6 = iArr[i3 + 2];
            int i7 = i6 & 1048575;
            int i8 = (iS >>> 20) & 255;
            if (i8 <= 17) {
                if (i7 != i2) {
                    i4 = i7 == 1048575 ? 0 : unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long jT = t(iS);
            if (i8 >= aihb.DOUBLE_LIST_PACKED.Z) {
                int i9 = aihb.SINT64_LIST_PACKED.Z;
            }
            switch (i8) {
                case 0:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros13 += ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 8;
                    }
                    break;
                case 1:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iN << 3);
                        iK = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 2:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.K(iN, unsafe.getLong(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 3:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.N(iN, unsafe.getLong(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 4:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.J(iN, unsafe.getInt(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 5:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iN << 3);
                        iK = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 6:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iN << 3);
                        iK = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 7:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 8:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        Object object = unsafe.getObject(obj, jT);
                        iK = object instanceof aigj ? aigs.H(iN, (aigj) object) : aigs.L(iN, (String) object);
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 9:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iD = aijh.d(iN, unsafe.getObject(obj, jT), aiiuVar.w(i3));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 10:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.H(iN, (aigj) unsafe.getObject(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 11:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.M(iN, unsafe.getInt(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 12:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = aigs.I(iN, unsafe.getInt(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 13:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iN << 3);
                        iK = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 14:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iN << 3);
                        iK = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 15:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = a.bo(iN, unsafe.getInt(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 16:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iK = a.bp(iN, unsafe.getLong(obj, jT));
                        iNumberOfLeadingZeros13 += iK;
                    }
                    aiiuVar = this;
                    break;
                case 17:
                    if (aiiuVar.K(obj, i3, i2, i4, i)) {
                        iD = aijh.a(iN, (MessageLite) unsafe.getObject(obj, jT), aiiuVar.w(i3));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 18:
                    List list = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar = aijh.a;
                    iD = a.bl(iN, list);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 19:
                    List list2 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar2 = aijh.a;
                    iD = a.bk(iN, list2);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 20:
                    List list3 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar3 = aijh.a;
                    if (list3.size() == 0) {
                        iNumberOfLeadingZeros8 = 0;
                    } else {
                        iJ = aijh.j(list3);
                        size = list3.size() * ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    break;
                case 21:
                    List list4 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar4 = aijh.a;
                    size2 = list4.size();
                    if (size2 == 0) {
                        iD = 0;
                    } else {
                        iJ2 = aijh.j(list4);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 22:
                    List list5 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar5 = aijh.a;
                    size2 = list5.size();
                    if (size2 != 0) {
                        iJ2 = aijh.c(list5);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 23:
                    List list6 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar6 = aijh.a;
                    iD = a.bl(iN, list6);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 24:
                    List list7 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar7 = aijh.a;
                    iD = a.bk(iN, list7);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 25:
                    List list8 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar8 = aijh.a;
                    int size4 = list8.size();
                    if (size4 != 0) {
                        iD = size4 * (((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1);
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 26:
                    List list9 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar9 = aijh.a;
                    int size5 = list9.size();
                    if (size5 == 0) {
                        iNumberOfLeadingZeros4 = 0;
                    } else {
                        boolean z = list9 instanceof aiin;
                        iNumberOfLeadingZeros4 = ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size5;
                        if (z) {
                            aiin aiinVar = (aiin) list9;
                            for (int i10 = 0; i10 < size5; i10++) {
                                Object objC = aiinVar.c();
                                if (objC instanceof aigj) {
                                    iAN2 = ((aigj) objC).d();
                                    iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iAN2);
                                } else {
                                    iAN2 = ahng.aN((String) objC);
                                    iNumberOfLeadingZeros6 = Integer.numberOfLeadingZeros(iAN2);
                                }
                                iNumberOfLeadingZeros4 += ((352 - (iNumberOfLeadingZeros6 * 9)) >>> 6) + iAN2;
                            }
                        } else {
                            for (int i11 = 0; i11 < size5; i11++) {
                                Object obj2 = list9.get(i11);
                                if (obj2 instanceof aigj) {
                                    iAN = ((aigj) obj2).d();
                                    iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iAN);
                                } else {
                                    iAN = ahng.aN((String) obj2);
                                    iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(iAN);
                                }
                                iNumberOfLeadingZeros4 += ((352 - (iNumberOfLeadingZeros5 * 9)) >>> 6) + iAN;
                            }
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros4;
                    break;
                case 27:
                    List list10 = (List) unsafe.getObject(obj, jT);
                    aijg aijgVarW = aiiuVar.w(i3);
                    aijs aijsVar10 = aijh.a;
                    int size6 = list10.size();
                    if (size6 == 0) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size6;
                        for (int i12 = 0; i12 < size6; i12++) {
                            int serializedSize = ((aifs) list10.get(i12)).getSerializedSize(aijgVarW);
                            iNumberOfLeadingZeros7 += ((352 - (Integer.numberOfLeadingZeros(serializedSize) * 9)) >>> 6) + serializedSize;
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros7;
                    break;
                case 28:
                    List list11 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar11 = aijh.a;
                    int size7 = list11.size();
                    if (size7 != 0) {
                        iNumberOfLeadingZeros8 = size7 * ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6);
                        for (int i13 = 0; i13 < list11.size(); i13++) {
                            int iD2 = ((aigj) list11.get(i13)).d();
                            iNumberOfLeadingZeros8 += ((352 - (Integer.numberOfLeadingZeros(iD2) * 9)) >>> 6) + iD2;
                        }
                    } else {
                        iNumberOfLeadingZeros8 = 0;
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    break;
                case 29:
                    List list12 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar12 = aijh.a;
                    size2 = list12.size();
                    if (size2 != 0) {
                        iJ2 = aijh.g(list12);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 30:
                    List list13 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar13 = aijh.a;
                    size2 = list13.size();
                    if (size2 != 0) {
                        iJ2 = aijh.b(list13);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 31:
                    List list14 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar14 = aijh.a;
                    iD = a.bk(iN, list14);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 32:
                    List list15 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar15 = aijh.a;
                    iD = a.bl(iN, list15);
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 33:
                    List list16 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar16 = aijh.a;
                    size2 = list16.size();
                    if (size2 != 0) {
                        iJ2 = aijh.e(list16);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 34:
                    List list17 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar17 = aijh.a;
                    size2 = list17.size();
                    if (size2 != 0) {
                        iJ2 = aijh.f(list17);
                        iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = iJ2 + (size2 * ((352 - (iNumberOfLeadingZeros3 * 9)) >>> 6));
                    } else {
                        iD = 0;
                    }
                    iNumberOfLeadingZeros13 += iD;
                    break;
                case 35:
                    List list18 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar18 = aijh.a;
                    size = list18.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 36:
                    List list19 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar19 = aijh.a;
                    size = list19.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 37:
                    size = aijh.j((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 38:
                    size = aijh.j((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 39:
                    size = aijh.c((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 40:
                    List list20 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar20 = aijh.a;
                    size = list20.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 41:
                    List list21 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar21 = aijh.a;
                    size = list21.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 42:
                    List list22 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar22 = aijh.a;
                    size = list22.size();
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 43:
                    size = aijh.g((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 44:
                    size = aijh.b((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 45:
                    List list23 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar23 = aijh.a;
                    size = list23.size() << 2;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 46:
                    List list24 = (List) unsafe.getObject(obj, jT);
                    aijs aijsVar24 = aijh.a;
                    size = list24.size() << 3;
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 47:
                    size = aijh.e((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 48:
                    size = aijh.f((List) unsafe.getObject(obj, jT));
                    if (size > 0) {
                        iNumberOfLeadingZeros9 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros10 = Integer.numberOfLeadingZeros(size);
                        iJ = ((352 - iNumberOfLeadingZeros9) >>> 6) + ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6);
                        iNumberOfLeadingZeros8 = iJ + size;
                        iNumberOfLeadingZeros13 += iNumberOfLeadingZeros8;
                    }
                    break;
                case 49:
                    List list25 = (List) unsafe.getObject(obj, jT);
                    aijg aijgVarW2 = aiiuVar.w(i3);
                    aijs aijsVar25 = aijh.a;
                    int size8 = list25.size();
                    if (size8 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i14 = 0; i14 < size8; i14++) {
                            iA += aijh.a(iN, (MessageLite) list25.get(i14), aijgVarW2);
                        }
                    }
                    iNumberOfLeadingZeros13 += iA;
                    break;
                case 50:
                    aiip aiipVar = (aiip) unsafe.getObject(obj, jT);
                    ahud ahudVar = (ahud) aiiuVar.x(i3);
                    if (aiipVar.isEmpty()) {
                        iNumberOfLeadingZeros7 = 0;
                    } else {
                        iNumberOfLeadingZeros7 = 0;
                        for (Map.Entry entry : aiipVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int iNumberOfLeadingZeros14 = Integer.numberOfLeadingZeros(iN << 3) * 9;
                            int iR = ahud.R((axqr) ahudVar.b, key, value);
                            iNumberOfLeadingZeros7 += ((352 - iNumberOfLeadingZeros14) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iR) * 9)) >>> 6) + iR;
                        }
                    }
                    iNumberOfLeadingZeros13 += iNumberOfLeadingZeros7;
                    break;
                case 51:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 52:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 53:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.K(iN, u(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 54:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.N(iN, u(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 55:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.J(iN, o(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 56:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 57:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 58:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = ((352 - (Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 59:
                    if (aiiuVar.O(obj, iN, i3)) {
                        Object object2 = unsafe.getObject(obj, jT);
                        iD = object2 instanceof aigj ? aigs.H(iN, (aigj) object2) : aigs.L(iN, (String) object2);
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 60:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aijh.d(iN, unsafe.getObject(obj, jT), aiiuVar.w(i3));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 61:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.H(iN, (aigj) unsafe.getObject(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 62:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.M(iN, o(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 63:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aigs.I(iN, o(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 64:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros12 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 65:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iNumberOfLeadingZeros11 = Integer.numberOfLeadingZeros(iN << 3);
                        iD = ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 66:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = a.bo(iN, o(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 67:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = a.bp(iN, u(obj, jT));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
                case 68:
                    if (aiiuVar.O(obj, iN, i3)) {
                        iD = aijh.a(iN, (MessageLite) unsafe.getObject(obj, jT), aiiuVar.w(i3));
                        iNumberOfLeadingZeros13 += iD;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    @Override // defpackage.aijg
    public final int b(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int iS = s(i3);
            int i4 = (iS >>> 20) & 255;
            if (i4 <= 50 || i4 >= 69) {
                long j = iS & 1048575;
                int iHashCode2 = 37;
                switch (i4) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(aijy.b(obj, j));
                        byte[] bArr = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(aijy.a.b(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = aijy.a.h(obj, j);
                        byte[] bArr2 = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = aijy.a.h(obj, j);
                        byte[] bArr3 = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = aijy.a.h(obj, j);
                        byte[] bArr4 = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zF = aijy.a.f(obj, j);
                        byte[] bArr5 = aiif.a;
                        iFloatToIntBits = true != zF ? 1237 : 1231;
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iFloatToIntBits = ((String) aijy.a.i(obj, j)).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        Object objI = aijy.a.i(obj, j);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = aijy.a.h(obj, j);
                        byte[] bArr6 = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = aijy.a.h(obj, j);
                        byte[] bArr7 = aiif.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        Object objI2 = aijy.a.i(obj, j);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
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
                        iFloatToIntBits = aijy.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iFloatToIntBits = aijy.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                }
            }
        }
        int i5 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i5 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((aihn) obj).unknownFields.hashCode();
                return this.h ? (iHashCode3 * 53) + ((aihi) obj).j.hashCode() : iHashCode3;
            }
            int i6 = iArr[i5];
            if (!O(obj, 0, i6)) {
                iHashCode = (iHashCode * 53) + aijy.a.i(obj, s(i6) & 1048575).hashCode();
            }
            i5++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int c(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.aifw r43) {
        /*
            Method dump skipped, instruction units count: 3822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiiu.c(java.lang.Object, byte[], int, int, int, aifw):int");
    }

    @Override // defpackage.aijg
    public final Object e() {
        return ((aihn) this.g).newMutableInstance();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    @Override // defpackage.aijg
    public final void g(Object obj) {
        if (M(obj)) {
            if (obj instanceof aihn) {
                aihn aihnVar = (aihn) obj;
                aihnVar.clearMemoizedSerializedSize();
                aihnVar.clearMemoizedHashCode();
                aihnVar.markImmutable();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iS = s(i);
                long jT = t(iS);
                int i2 = (iS >>> 20) & 255;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (J(obj, i)) {
                                    w(i).g(b.getObject(obj, jT));
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
                                ((aiie) aijy.a.i(obj, jT)).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, jT);
                                if (object != null) {
                                    ((aiip) object).c();
                                    unsafe.putObject(obj, jT, object);
                                }
                                break;
                        }
                    } else if (O(obj, n(i), i)) {
                        w(i).g(b.getObject(obj, jT));
                    }
                } else if (J(obj, i)) {
                    w(i).g(b.getObject(obj, jT));
                }
            }
            aijs.g(obj);
            if (this.h) {
                ahng.aV(obj);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aijg
    public final void h(Object obj, Object obj2) {
        A(obj);
        obj2.getClass();
        int i = 0;
        while (i < this.c.length) {
            int iS = s(i);
            int iN = n(i);
            long j = 1048575 & iS;
            Object obj3 = obj;
            switch ((iS >>> 20) & 255) {
                case 0:
                    if (J(obj2, i)) {
                        aijy.a.d(obj3, j, aijy.b(obj2, j));
                        E(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    if (J(obj2, i)) {
                        aijx aijxVar = aijy.a;
                        aijxVar.e(obj3, j, aijxVar.b(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    if (J(obj2, i)) {
                        aijx aijxVar2 = aijy.a;
                        aijxVar2.k(obj3, j, aijxVar2.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    if (J(obj2, i)) {
                        aijx aijxVar3 = aijy.a;
                        aijxVar3.k(obj3, j, aijxVar3.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    if (J(obj2, i)) {
                        aijx aijxVar4 = aijy.a;
                        aijxVar4.j(obj3, j, aijxVar4.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    if (J(obj2, i)) {
                        aijx aijxVar5 = aijy.a;
                        aijxVar5.k(obj3, j, aijxVar5.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    if (J(obj2, i)) {
                        aijx aijxVar6 = aijy.a;
                        aijxVar6.j(obj3, j, aijxVar6.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    if (J(obj2, i)) {
                        aijx aijxVar7 = aijy.a;
                        aijxVar7.c(obj3, j, aijxVar7.f(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    if (J(obj2, i)) {
                        aijx aijxVar8 = aijy.a;
                        aijxVar8.l(obj3, j, aijxVar8.i(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    B(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    if (J(obj2, i)) {
                        aijx aijxVar9 = aijy.a;
                        aijxVar9.l(obj3, j, aijxVar9.i(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    if (J(obj2, i)) {
                        aijx aijxVar10 = aijy.a;
                        aijxVar10.j(obj3, j, aijxVar10.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    if (J(obj2, i)) {
                        aijx aijxVar11 = aijy.a;
                        aijxVar11.j(obj3, j, aijxVar11.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    if (J(obj2, i)) {
                        aijx aijxVar12 = aijy.a;
                        aijxVar12.j(obj3, j, aijxVar12.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    if (J(obj2, i)) {
                        aijx aijxVar13 = aijy.a;
                        aijxVar13.k(obj3, j, aijxVar13.h(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    if (J(obj2, i)) {
                        aijx aijxVar14 = aijy.a;
                        aijxVar14.j(obj3, j, aijxVar14.g(obj2, j));
                        E(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (J(obj2, i)) {
                        aijx aijxVar15 = aijy.a;
                        obj3 = obj;
                        aijxVar15.k(obj3, j, aijxVar15.h(obj2, j));
                        E(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    B(obj, obj2, i);
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
                    aijx aijxVar16 = aijy.a;
                    aiie aiieVarE = (aiie) aijxVar16.i(obj, j);
                    aiie aiieVar = (aiie) aijxVar16.i(obj2, j);
                    int size = aiieVarE.size();
                    int size2 = aiieVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!aiieVarE.c()) {
                            aiieVarE = aiieVarE.e(size2 + size);
                        }
                        aiieVarE.addAll(aiieVar);
                    }
                    if (size > 0) {
                        aiieVar = aiieVarE;
                    }
                    aijxVar16.l(obj, j, aiieVar);
                    break;
                case 50:
                    aijs aijsVar = aijh.a;
                    aijx aijxVar17 = aijy.a;
                    aijxVar17.l(obj, j, ahng.aP(aijxVar17.i(obj, j), aijxVar17.i(obj2, j)));
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
                    if (O(obj2, iN, i)) {
                        aijx aijxVar18 = aijy.a;
                        aijxVar18.l(obj, j, aijxVar18.i(obj2, j));
                        F(obj, iN, i);
                    }
                    break;
                case 60:
                    C(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (O(obj2, iN, i)) {
                        aijx aijxVar19 = aijy.a;
                        aijxVar19.l(obj, j, aijxVar19.i(obj2, j));
                        F(obj, iN, i);
                    }
                    break;
                case 68:
                    C(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        Object obj4 = obj;
        aijs aijsVar2 = aijh.a;
        aihn aihnVar = (aihn) obj4;
        aihnVar.unknownFields = aijs.d(aihnVar.unknownFields, ((aihn) obj2).unknownFields);
        if (this.h) {
            aijh.k(obj4, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027a A[Catch: all -> 0x08e8, TryCatch #8 {all -> 0x08e8, blocks: (B:3:0x0010, B:11:0x0034, B:17:0x0044, B:25:0x0068, B:48:0x0112, B:49:0x0127, B:47:0x010c, B:38:0x00ab, B:39:0x00b4, B:40:0x00bf, B:41:0x00ca, B:42:0x00d5, B:43:0x00e0, B:44:0x00eb, B:45:0x00f6, B:46:0x0101, B:50:0x0128, B:52:0x0133, B:54:0x013f, B:55:0x0145, B:94:0x025f, B:96:0x0265, B:97:0x026a, B:104:0x0292, B:101:0x027a, B:103:0x0280, B:56:0x014b, B:57:0x0153, B:59:0x0159, B:60:0x0163, B:61:0x016d, B:62:0x0177, B:63:0x0181, B:64:0x0188, B:65:0x0189, B:66:0x0193, B:67:0x0199, B:69:0x019f, B:71:0x01a7, B:73:0x01b6, B:74:0x01c1, B:75:0x01c6, B:76:0x01d2, B:78:0x01d8, B:80:0x01e0, B:82:0x01ef, B:83:0x01fa, B:84:0x01ff, B:85:0x0213, B:86:0x0218, B:87:0x0221, B:88:0x022a, B:89:0x0233, B:90:0x023c, B:91:0x0245, B:92:0x024e, B:93:0x0257, B:108:0x029e, B:14:0x003a, B:115:0x02b9, B:122:0x02d5, B:123:0x02e7, B:124:0x02fc, B:125:0x0311, B:126:0x0326, B:127:0x033b, B:129:0x0345, B:131:0x034b, B:132:0x0351, B:133:0x0362, B:134:0x0377, B:135:0x0388, B:136:0x039a, B:137:0x03a2, B:138:0x03b7, B:139:0x03cc, B:140:0x03e1, B:141:0x03f6, B:142:0x040b, B:143:0x0420, B:144:0x0435, B:145:0x044a, B:147:0x045d, B:151:0x047a, B:175:0x04f7, B:180:0x0505, B:181:0x050a, B:148:0x0467, B:150:0x046d, B:182:0x050b, B:184:0x051d, B:186:0x052c, B:188:0x0530, B:190:0x0536, B:191:0x053a, B:192:0x053f, B:193:0x0540, B:194:0x054c, B:195:0x0558, B:196:0x0564, B:197:0x0570, B:204:0x058f, B:205:0x0598, B:206:0x05a4, B:207:0x05b0, B:208:0x05bb, B:209:0x05c6, B:210:0x05d1, B:211:0x05dc, B:212:0x05e7, B:213:0x05f2, B:214:0x05fd, B:215:0x0608, B:216:0x0613, B:218:0x0620), top: B:332:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x08bf A[Catch: all -> 0x08e6, TRY_ENTER, TryCatch #3 {all -> 0x08e6, blocks: (B:109:0x02a2, B:289:0x08a6, B:296:0x08bf, B:297:0x08c4), top: B:322:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x08d1 A[LOOP:1: B:300:0x08cd->B:302:0x08d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x08de  */
    /* JADX WARN: Code duplicated, block: B:314:0x08f2 A[LOOP:7: B:312:0x08ee->B:314:0x08f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:352:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x08cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0276  */
    @Override // defpackage.aijg
    public final void i(Object obj, aign aignVar, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        Object obj2;
        int i;
        Object objValueOf;
        int iOrdinal;
        Object objK;
        ArrayList arrayList;
        Object obj3;
        aijs aijsVar;
        Object obj4;
        int i2;
        obj = obj;
        extensionRegistryLite.getClass();
        A(obj);
        Object objR = null;
        aiha aihaVarA = null;
        while (true) {
            try {
                int iC = aignVar.c();
                int iP = p(iC);
                aijs aijsVar2 = this.m;
                int i3 = Alert.DURATION_SHOW_INDEFINITELY;
                if (iP >= 0) {
                    int iS = s(iP);
                    int i4 = 1;
                    switch ((iS >>> 20) & 255) {
                        case 0:
                            obj4 = objR;
                            aijy.a.d(obj, iS & 1048575, aignVar.a());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 1:
                            obj4 = objR;
                            aijy.a.e(obj, iS & 1048575, aignVar.b());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 2:
                            obj4 = objR;
                            aijy.a.k(obj, iS & 1048575, aignVar.k());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 3:
                            obj4 = objR;
                            aijy.a.k(obj, iS & 1048575, aignVar.n());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 4:
                            obj4 = objR;
                            aijy.a.j(obj, iS & 1048575, aignVar.f());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 5:
                            obj4 = objR;
                            aijy.a.k(obj, iS & 1048575, aignVar.j());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 6:
                            obj4 = objR;
                            aijy.a.j(obj, iS & 1048575, aignVar.e());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 7:
                            obj4 = objR;
                            aijy.a.c(obj, iS & 1048575, aignVar.N());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 8:
                            obj4 = objR;
                            D(obj, iS, aignVar);
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 9:
                            obj4 = objR;
                            MessageLite messageLite = (MessageLite) y(obj, iP);
                            aignVar.w(messageLite, w(iP), extensionRegistryLite);
                            G(obj, iP, messageLite);
                            objR = obj4;
                            break;
                        case 10:
                            obj4 = objR;
                            aijy.a.l(obj, iS & 1048575, aignVar.o());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 11:
                            obj4 = objR;
                            aijy.a.j(obj, iS & 1048575, aignVar.i());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 12:
                            obj4 = objR;
                            int iD = aignVar.d();
                            aiht aihtVarV = v(iP);
                            if (aihtVarV == null || aihtVarV.isInRange(iD)) {
                                aijy.a.j(obj, iS & 1048575, iD);
                                E(obj, iP);
                                objR = obj4;
                            } else {
                                objR = aijh.l(obj, iC, iD, obj4);
                            }
                            break;
                        case 13:
                            obj4 = objR;
                            aijy.a.j(obj, iS & 1048575, aignVar.g());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 14:
                            obj4 = objR;
                            aijy.a.k(obj, iS & 1048575, aignVar.l());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 15:
                            obj4 = objR;
                            aijy.a.j(obj, iS & 1048575, aignVar.h());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 16:
                            obj4 = objR;
                            aijy.a.k(obj, iS & 1048575, aignVar.m());
                            E(obj, iP);
                            objR = obj4;
                            break;
                        case 17:
                            obj4 = objR;
                            MessageLite messageLite2 = (MessageLite) y(obj, iP);
                            aignVar.v(messageLite2, w(iP), extensionRegistryLite);
                            G(obj, iP, messageLite2);
                            objR = obj4;
                            break;
                        case 18:
                            obj4 = objR;
                            aignVar.y(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 19:
                            obj4 = objR;
                            aignVar.C(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 20:
                            obj4 = objR;
                            aignVar.E(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 21:
                            obj4 = objR;
                            aignVar.L(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 22:
                            obj4 = objR;
                            aignVar.D(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 23:
                            obj4 = objR;
                            aignVar.B(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 24:
                            obj4 = objR;
                            aignVar.A(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 25:
                            obj4 = objR;
                            aignVar.x(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 26:
                            obj4 = objR;
                            long j = iS & 1048575;
                            if ((536870912 & iS) != 0) {
                                aignVar.J(ahng.aR(obj, j), true);
                            } else {
                                aignVar.J(ahng.aR(obj, j), false);
                            }
                            objR = obj4;
                            break;
                        case 27:
                            obj4 = objR;
                            aijg aijgVarW = w(iP);
                            List listAR = ahng.aR(obj, iS & 1048575);
                            int i5 = aignVar.b;
                            if ((i5 & 7) != 2) {
                                throw new aiij("Protocol message tag had invalid wire type.");
                            }
                            while (true) {
                                listAR.add(aignVar.r(aijgVarW, extensionRegistryLite));
                                aigm aigmVar = aignVar.a;
                                if (!aigmVar.D() && aignVar.c == 0) {
                                    int iN = aigmVar.n();
                                    if (iN != i5) {
                                        aignVar.c = iN;
                                    }
                                }
                            }
                            objR = obj4;
                            break;
                            break;
                        case 28:
                            obj4 = objR;
                            List listAR2 = ahng.aR(obj, iS & 1048575);
                            if ((aignVar.b & 7) != 2) {
                                throw new aiij("Protocol message tag had invalid wire type.");
                            }
                            while (true) {
                                listAR2.add(aignVar.o());
                                aigm aigmVar2 = aignVar.a;
                                if (!aigmVar2.D()) {
                                    int iN2 = aigmVar2.n();
                                    if (iN2 != aignVar.b) {
                                        aignVar.c = iN2;
                                    }
                                }
                            }
                            objR = obj4;
                            break;
                            break;
                        case 29:
                            obj4 = objR;
                            aignVar.K(ahng.aR(obj, iS & 1048575));
                            objR = obj4;
                            break;
                        case 30:
                            List listAR3 = ahng.aR(obj, iS & 1048575);
                            aignVar.z(listAR3);
                            Object obj5 = obj;
                            try {
                                objR = aijh.i(obj5, iC, listAR3, v(iP), objR, aijsVar2);
                                obj = obj5;
                            } catch (aiij unused) {
                                obj2 = objR;
                                aijsVar = aijsVar2;
                                obj = obj5;
                                objR = obj2;
                                if (objR == null) {
                                    objR = aijs.f(obj);
                                }
                                if (!aijsVar.a(objR, aignVar, 0)) {
                                    for (i2 = this.k; i2 < this.l; i2++) {
                                        objR = R(obj, this.j[i2], objR, obj);
                                    }
                                    if (objR != null) {
                                        ((aihn) obj).unknownFields = (aijt) objR;
                                    }
                                }
                            }
                            break;
                        case 31:
                            aignVar.F(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 32:
                            aignVar.G(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 33:
                            aignVar.H(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 34:
                            aignVar.I(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 35:
                            aignVar.y(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 36:
                            aignVar.C(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 37:
                            aignVar.E(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 38:
                            aignVar.L(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 39:
                            aignVar.D(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 40:
                            aignVar.B(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 41:
                            aignVar.A(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 42:
                            aignVar.x(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 43:
                            aignVar.K(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 44:
                            List listAR4 = ahng.aR(obj, iS & 1048575);
                            aignVar.z(listAR4);
                            Object obj6 = obj;
                            try {
                                objR = aijh.i(obj6, iC, listAR4, v(iP), objR, aijsVar2);
                                obj = obj6;
                            } catch (aiij unused2) {
                                obj = obj6;
                                obj2 = objR;
                                aijsVar = aijsVar2;
                                objR = obj2;
                                if (objR == null) {
                                    objR = aijs.f(obj);
                                }
                                if (!aijsVar.a(objR, aignVar, 0)) {
                                    while (i2 < this.l) {
                                        objR = R(obj, this.j[i2], objR, obj);
                                    }
                                    if (objR != null) {
                                        ((aihn) obj).unknownFields = (aijt) objR;
                                    }
                                }
                            }
                            break;
                        case 45:
                            aignVar.F(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 46:
                            aignVar.G(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 47:
                            aignVar.H(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 48:
                            aignVar.I(ahng.aR(obj, iS & 1048575));
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 49:
                            aijg aijgVarW2 = w(iP);
                            List listAR5 = ahng.aR(obj, iS & 1048575);
                            int i6 = aignVar.b;
                            if ((i6 & 7) != 3) {
                                throw new aiij("Protocol message tag had invalid wire type.");
                            }
                            while (true) {
                                listAR5.add(aignVar.q(aijgVarW2, extensionRegistryLite));
                                aigm aigmVar3 = aignVar.a;
                                if (!aigmVar3.D() && aignVar.c == 0) {
                                    int iN3 = aigmVar3.n();
                                    if (iN3 != i6) {
                                        aignVar.c = iN3;
                                    }
                                }
                            }
                            obj4 = objR;
                            objR = obj4;
                            break;
                            break;
                        case 50:
                            Object objX = x(iP);
                            int iS2 = s(iP) & 1048575;
                            aijx aijxVar = aijy.a;
                            long j2 = iS2;
                            Object objI = aijxVar.i(obj, j2);
                            if (objI == null) {
                                objI = aiip.a.a();
                                aijxVar.l(obj, j2, objI);
                            } else if (ahng.aQ(objI)) {
                                aiip aiipVarA = aiip.a.a();
                                ahng.aP(aiipVarA, objI);
                                aijxVar.l(obj, j2, aiipVarA);
                                objI = aiipVarA;
                            }
                            aiip aiipVar = (aiip) objI;
                            Object obj7 = ((ahud) objX).b;
                            aignVar.M(2);
                            aigm aigmVar4 = aignVar.a;
                            int iF = aigmVar4.f(aigmVar4.o());
                            Object obj8 = ((axqr) obj7).c;
                            Object obj9 = ((axqr) obj7).d;
                            Object objP = obj8;
                            Object objP2 = obj9;
                            while (true) {
                                try {
                                    int iC2 = aignVar.c();
                                    if (iC2 != i3 && !aigmVar4.D()) {
                                        if (iC2 == i4) {
                                            objP = aignVar.p((aika) ((axqr) obj7).a, null, null);
                                        } else if (iC2 != 2) {
                                            try {
                                                if (!aignVar.O()) {
                                                    throw new aiik("Unable to parse map entry.");
                                                }
                                                continue;
                                            } catch (aiij e) {
                                                if (!aignVar.O()) {
                                                    throw new aiik("Unable to parse map entry.", e);
                                                }
                                            }
                                        } else {
                                            objP2 = aignVar.p((aika) ((axqr) obj7).b, obj9.getClass(), extensionRegistryLite);
                                        }
                                        i4 = 1;
                                        i3 = Alert.DURATION_SHOW_INDEFINITELY;
                                    }
                                } catch (Throwable th) {
                                    aignVar.a.A(iF);
                                    throw th;
                                }
                            }
                            aiipVar.put(objP, objP2);
                            aigm aigmVar5 = aignVar.a;
                            if (aigmVar5.d() != 0) {
                                throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            aigmVar5.A(iF);
                            obj4 = objR;
                            objR = obj4;
                            break;
                            break;
                        case 51:
                            aijy.a.l(obj, iS & 1048575, Double.valueOf(aignVar.a()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 52:
                            aijy.a.l(obj, iS & 1048575, Float.valueOf(aignVar.b()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 53:
                            aijy.a.l(obj, iS & 1048575, Long.valueOf(aignVar.k()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 54:
                            aijy.a.l(obj, iS & 1048575, Long.valueOf(aignVar.n()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 55:
                            aijy.a.l(obj, iS & 1048575, Integer.valueOf(aignVar.f()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 56:
                            aijy.a.l(obj, iS & 1048575, Long.valueOf(aignVar.j()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 57:
                            aijy.a.l(obj, iS & 1048575, Integer.valueOf(aignVar.e()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 58:
                            aijy.a.l(obj, iS & 1048575, Boolean.valueOf(aignVar.N()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 59:
                            D(obj, iS, aignVar);
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 60:
                            MessageLite messageLite3 = (MessageLite) z(obj, iC, iP);
                            aignVar.w(messageLite3, w(iP), extensionRegistryLite);
                            H(obj, iC, iP, messageLite3);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 61:
                            aijy.a.l(obj, iS & 1048575, aignVar.o());
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 62:
                            aijy.a.l(obj, iS & 1048575, Integer.valueOf(aignVar.i()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 63:
                            int iD2 = aignVar.d();
                            aiht aihtVarV2 = v(iP);
                            if (aihtVarV2 == null || aihtVarV2.isInRange(iD2)) {
                                aijy.a.l(obj, iS & 1048575, Integer.valueOf(iD2));
                                F(obj, iC, iP);
                                obj4 = objR;
                                objR = obj4;
                            } else {
                                objR = aijh.l(obj, iC, iD2, objR);
                            }
                            break;
                        case 64:
                            aijy.a.l(obj, iS & 1048575, Integer.valueOf(aignVar.g()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 65:
                            aijy.a.l(obj, iS & 1048575, Long.valueOf(aignVar.l()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 66:
                            aijy.a.l(obj, iS & 1048575, Integer.valueOf(aignVar.h()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 67:
                            aijy.a.l(obj, iS & 1048575, Long.valueOf(aignVar.m()));
                            F(obj, iC, iP);
                            obj4 = objR;
                            objR = obj4;
                            break;
                        case 68:
                            try {
                                MessageLite messageLite4 = (MessageLite) z(obj, iC, iP);
                                aignVar.v(messageLite4, w(iP), extensionRegistryLite);
                                H(obj, iC, iP, messageLite4);
                                obj4 = objR;
                                objR = obj4;
                            } catch (aiij unused3) {
                                obj2 = objR;
                                aijsVar = aijsVar2;
                                objR = obj2;
                                if (objR == null) {
                                    objR = aijs.f(obj);
                                }
                                if (!aijsVar.a(objR, aignVar, 0)) {
                                    while (i2 < this.l) {
                                        objR = R(obj, this.j[i2], objR, obj);
                                    }
                                    if (objR != null) {
                                        ((aihn) obj).unknownFields = (aijt) objR;
                                    }
                                }
                            }
                            break;
                        default:
                            obj2 = objR;
                            aijsVar = aijsVar2;
                            if (obj2 == null) {
                                try {
                                    objR = aijs.f(obj);
                                } catch (aiij unused4) {
                                    objR = obj2;
                                    if (objR == null) {
                                        objR = aijs.f(obj);
                                    }
                                    if (!aijsVar.a(objR, aignVar, 0)) {
                                        while (i2 < this.l) {
                                            objR = R(obj, this.j[i2], objR, obj);
                                        }
                                        if (objR != null) {
                                            ((aihn) obj).unknownFields = (aijt) objR;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objR = obj2;
                                    for (i = this.k; i < this.l; i++) {
                                        objR = R(obj, this.j[i], objR, obj);
                                    }
                                    if (objR != null) {
                                        ((aihn) obj).unknownFields = (aijt) objR;
                                    }
                                    throw th;
                                }
                            } else {
                                objR = obj2;
                            }
                            try {
                                if (!aijsVar.a(objR, aignVar, 0)) {
                                    for (int i7 = this.k; i7 < this.l; i7++) {
                                        objR = R(obj, this.j[i7], objR, obj);
                                    }
                                }
                            } catch (aiij unused5) {
                                if (objR == null) {
                                    objR = aijs.f(obj);
                                }
                                if (!aijsVar.a(objR, aignVar, 0)) {
                                    while (i2 < this.l) {
                                        objR = R(obj, this.j[i2], objR, obj);
                                    }
                                    if (objR != null) {
                                        ((aihn) obj).unknownFields = (aijt) objR;
                                    }
                                }
                            }
                            break;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    for (int i8 = this.k; i8 < this.l; i8++) {
                        objR = R(obj, this.j[i8], objR, obj);
                    }
                } else {
                    aihl aihlVarA = !this.h ? null : extensionRegistryLite.a(this.g, iC);
                    if (aihlVarA != null) {
                        if (aihaVarA == null) {
                            aihaVarA = ((aihi) obj).a();
                        }
                        try {
                            int iA = aihlVarA.a();
                            aihk aihkVar = aihlVarA.d;
                            if (aihkVar.d && aihkVar.e) {
                                aika aikaVar = aika.DOUBLE;
                                switch (aihlVarA.b()) {
                                    case DOUBLE:
                                        arrayList = new ArrayList();
                                        aignVar.y(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case FLOAT:
                                        arrayList = new ArrayList();
                                        aignVar.C(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case INT64:
                                        arrayList = new ArrayList();
                                        aignVar.E(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case UINT64:
                                        arrayList = new ArrayList();
                                        aignVar.L(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case INT32:
                                        arrayList = new ArrayList();
                                        aignVar.D(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case FIXED64:
                                        arrayList = new ArrayList();
                                        aignVar.B(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case FIXED32:
                                        arrayList = new ArrayList();
                                        aignVar.A(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case BOOL:
                                        arrayList = new ArrayList();
                                        aignVar.x(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case STRING:
                                    case GROUP:
                                    case MESSAGE:
                                    case BYTES:
                                    default:
                                        throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(aihlVarA.d.c))));
                                    case UINT32:
                                        arrayList = new ArrayList();
                                        aignVar.K(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case ENUM:
                                        ArrayList arrayList2 = new ArrayList();
                                        aignVar.z(arrayList2);
                                        try {
                                            Object objH = aijh.h(obj, iA, arrayList2, aihkVar.a, objR, aijsVar2);
                                            obj = obj;
                                            obj3 = objH;
                                            arrayList = arrayList2;
                                            aihaVarA.m(aihkVar, arrayList);
                                            objR = obj3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj = obj;
                                            obj2 = objR;
                                            objR = obj2;
                                            while (i < this.l) {
                                                objR = R(obj, this.j[i], objR, obj);
                                            }
                                            if (objR != null) {
                                                ((aihn) obj).unknownFields = (aijt) objR;
                                            }
                                            throw th;
                                        }
                                        break;
                                    case SFIXED32:
                                        arrayList = new ArrayList();
                                        aignVar.F(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case SFIXED64:
                                        arrayList = new ArrayList();
                                        aignVar.G(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case SINT32:
                                        arrayList = new ArrayList();
                                        aignVar.H(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                    case SINT64:
                                        arrayList = new ArrayList();
                                        aignVar.I(arrayList);
                                        obj3 = objR;
                                        aihaVarA.m(aihkVar, arrayList);
                                        objR = obj3;
                                        break;
                                }
                            } else {
                                obj = obj;
                                if (aihlVarA.b() != aika.ENUM) {
                                    switch (aihlVarA.b()) {
                                        case DOUBLE:
                                            objValueOf = Double.valueOf(aignVar.a());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr2 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case FLOAT:
                                            objValueOf = Float.valueOf(aignVar.b());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr3 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr4 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case INT64:
                                            objValueOf = Long.valueOf(aignVar.k());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr5 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr6 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case UINT64:
                                            objValueOf = Long.valueOf(aignVar.n());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr7 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr8 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case INT32:
                                            objValueOf = Integer.valueOf(aignVar.f());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr9 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr10 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case FIXED64:
                                            objValueOf = Long.valueOf(aignVar.j());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr11 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr12 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case FIXED32:
                                            objValueOf = Integer.valueOf(aignVar.e());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr13 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr14 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case BOOL:
                                            objValueOf = Boolean.valueOf(aignVar.N());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr15 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr16 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case STRING:
                                            objValueOf = aignVar.t();
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr17 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr18 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case GROUP:
                                            if (!aihlVarA.f()) {
                                                Object objK2 = aihaVarA.k(aihkVar);
                                                if (objK2 instanceof aihn) {
                                                    aihn aihnVar = (aihn) objK2;
                                                    aijg aijgVarA = aiiz.a.a(aihnVar);
                                                    if (!aihnVar.isMutable()) {
                                                        Object objE = aijgVarA.e();
                                                        aijgVarA.h(objE, objK2);
                                                        aihaVarA.m(aihkVar, objE);
                                                        objK2 = objE;
                                                    }
                                                    aignVar.v(objK2, aijgVarA, extensionRegistryLite);
                                                    break;
                                                }
                                            }
                                            Class<?> cls = aihlVarA.c.getClass();
                                            aignVar.M(3);
                                            objValueOf = aignVar.q(aiiz.a.b(cls), extensionRegistryLite);
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr19 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr110 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case MESSAGE:
                                            if (!aihlVarA.f()) {
                                                Object objK3 = aihaVarA.k(aihkVar);
                                                if (objK3 instanceof aihn) {
                                                    aihn aihnVar2 = (aihn) objK3;
                                                    aijg aijgVarA2 = aiiz.a.a(aihnVar2);
                                                    if (!aihnVar2.isMutable()) {
                                                        Object objE2 = aijgVarA2.e();
                                                        aijgVarA2.h(objE2, objK3);
                                                        aihaVarA.m(aihkVar, objE2);
                                                        objK3 = objE2;
                                                    }
                                                    aignVar.w(objK3, aijgVarA2, extensionRegistryLite);
                                                    break;
                                                }
                                            }
                                            objValueOf = aignVar.s(aihlVarA.c.getClass(), extensionRegistryLite);
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr111 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr112 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case BYTES:
                                            objValueOf = aignVar.o();
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr113 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr114 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case UINT32:
                                            objValueOf = Integer.valueOf(aignVar.i());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr115 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr116 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case ENUM:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case SFIXED32:
                                            objValueOf = Integer.valueOf(aignVar.g());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr117 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr118 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case SFIXED64:
                                            objValueOf = Long.valueOf(aignVar.l());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr119 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr1110 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case SINT32:
                                            objValueOf = Integer.valueOf(aignVar.h());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr1111 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr1112 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        case SINT64:
                                            objValueOf = Long.valueOf(aignVar.m());
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr1113 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr1114 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                        default:
                                            objValueOf = null;
                                            if (aihlVarA.f()) {
                                                aihaVarA.l(aihkVar, objValueOf);
                                            } else {
                                                iOrdinal = aihlVarA.b().ordinal();
                                                if (iOrdinal != 9) {
                                                    byte[] bArr1115 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                } else {
                                                    byte[] bArr1116 = aiif.a;
                                                    objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                                }
                                                aihaVarA.m(aihkVar, objValueOf);
                                            }
                                            break;
                                    }
                                } else {
                                    int iF2 = aignVar.f();
                                    if (aihkVar.a.findValueByNumber(iF2) == null) {
                                        objR = aijh.l(obj, iA, iF2, objR);
                                    } else {
                                        objValueOf = Integer.valueOf(iF2);
                                        if (aihlVarA.f()) {
                                            aihaVarA.l(aihkVar, objValueOf);
                                        } else {
                                            iOrdinal = aihlVarA.b().ordinal();
                                            if ((iOrdinal != 9 || iOrdinal == 10) && (objK = aihaVarA.k(aihkVar)) != null) {
                                                byte[] bArr1117 = aiif.a;
                                                objValueOf = ((MessageLite) objK).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                                            }
                                            aihaVarA.m(aihkVar, objValueOf);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj;
                        }
                    } else {
                        if (objR == null) {
                            objR = aijs.f(obj);
                        }
                        try {
                            if (!aijsVar2.a(objR, aignVar, 0)) {
                                for (int i9 = this.k; i9 < this.l; i9++) {
                                    objR = R(obj, this.j[i9], objR, obj);
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            while (i < this.l) {
                                objR = R(obj, this.j[i], objR, obj);
                            }
                            if (objR != null) {
                                ((aihn) obj).unknownFields = (aijt) objR;
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        if (objR != null) {
            ((aihn) obj).unknownFields = (aijt) objR;
        }
    }

    @Override // defpackage.aijg
    public final void j(Object obj, byte[] bArr, int i, int i2, aifw aifwVar) {
        c(obj, bArr, i, i2, 0, aifwVar);
    }

    @Override // defpackage.aijg
    public final boolean k(Object obj, Object obj2) {
        boolean zAe;
        for (int i = 0; i < this.c.length; i += 3) {
            int iS = s(i);
            int i2 = (iS >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long jT = t(iS);
                switch (i2) {
                    case 0:
                        if (!I(obj, obj2, i) || Double.doubleToLongBits(aijy.b(obj, jT)) != Double.doubleToLongBits(aijy.b(obj2, jT))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar = aijy.a;
                        if (Float.floatToIntBits(aijxVar.b(obj, jT)) != Float.floatToIntBits(aijxVar.b(obj2, jT))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar2 = aijy.a;
                        if (aijxVar2.h(obj, jT) != aijxVar2.h(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar3 = aijy.a;
                        if (aijxVar3.h(obj, jT) != aijxVar3.h(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar4 = aijy.a;
                        if (aijxVar4.g(obj, jT) != aijxVar4.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar5 = aijy.a;
                        if (aijxVar5.h(obj, jT) != aijxVar5.h(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar6 = aijy.a;
                        if (aijxVar6.g(obj, jT) != aijxVar6.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar7 = aijy.a;
                        if (aijxVar7.f(obj, jT) != aijxVar7.f(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar8 = aijy.a;
                        Object objI = aijxVar8.i(obj, jT);
                        Object objI2 = aijxVar8.i(obj2, jT);
                        aijs aijsVar = aijh.a;
                        if (!a.ae(objI, objI2)) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar9 = aijy.a;
                        Object objI3 = aijxVar9.i(obj, jT);
                        Object objI4 = aijxVar9.i(obj2, jT);
                        aijs aijsVar2 = aijh.a;
                        if (!a.ae(objI3, objI4)) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar10 = aijy.a;
                        Object objI5 = aijxVar10.i(obj, jT);
                        Object objI6 = aijxVar10.i(obj2, jT);
                        aijs aijsVar3 = aijh.a;
                        if (!a.ae(objI5, objI6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar11 = aijy.a;
                        if (aijxVar11.g(obj, jT) != aijxVar11.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar12 = aijy.a;
                        if (aijxVar12.g(obj, jT) != aijxVar12.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar13 = aijy.a;
                        if (aijxVar13.g(obj, jT) != aijxVar13.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar14 = aijy.a;
                        if (aijxVar14.h(obj, jT) != aijxVar14.h(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar15 = aijy.a;
                        if (aijxVar15.g(obj, jT) != aijxVar15.g(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar16 = aijy.a;
                        if (aijxVar16.h(obj, jT) != aijxVar16.h(obj2, jT)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!I(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar17 = aijy.a;
                        Object objI7 = aijxVar17.i(obj, jT);
                        Object objI8 = aijxVar17.i(obj2, jT);
                        aijs aijsVar4 = aijh.a;
                        if (!a.ae(objI7, objI8)) {
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
                        aijx aijxVar18 = aijy.a;
                        Object objI9 = aijxVar18.i(obj, jT);
                        Object objI10 = aijxVar18.i(obj2, jT);
                        aijs aijsVar5 = aijh.a;
                        zAe = a.ae(objI9, objI10);
                        break;
                    case 50:
                        aijx aijxVar19 = aijy.a;
                        Object objI11 = aijxVar19.i(obj, jT);
                        Object objI12 = aijxVar19.i(obj2, jT);
                        aijs aijsVar6 = aijh.a;
                        zAe = a.ae(objI11, objI12);
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
                        if (!N(obj, obj2, i)) {
                            return false;
                        }
                        aijx aijxVar20 = aijy.a;
                        Object objI13 = aijxVar20.i(obj, jT);
                        Object objI14 = aijxVar20.i(obj2, jT);
                        aijs aijsVar7 = aijh.a;
                        if (!a.ae(objI13, objI14)) {
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
                if (!aijs.c(obj).equals(aijs.c(obj2))) {
                    return false;
                }
                if (this.h) {
                    return ahng.aT(obj).equals(ahng.aT(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!N(obj, obj2, i4)) {
                return false;
            }
            if (!O(obj, 0, i4)) {
                long jT2 = t(s(i4));
                Object objE = aijy.e(obj, jT2);
                Object objE2 = aijy.e(obj2, jT2);
                aijs aijsVar8 = aijh.a;
                if (!a.ae(objE, objE2)) {
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
    /* JADX WARN: Code duplicated, block: B:70:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6 A[SYNTHETIC] */
    @Override // defpackage.aijg
    public final boolean l(Object obj) {
        int i;
        int i2;
        List list;
        aijg aijgVarW;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.k) {
            int i7 = this.j[i4];
            int iS = this.s(i7);
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
            aiiu aiiuVar = this;
            Object obj2 = obj;
            if (a.ag(iS) && !aiiuVar.K(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iS >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (aiiuVar.K(obj2, i7, i, i2, i10) && !L(obj2, iS, aiiuVar.w(i7))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (List) aijy.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    aijgVarW = aiiuVar.w(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (aijgVarW.l(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (aiiuVar.O(obj2, aiiuVar.n(i7), i7) && !L(obj2, iS, aiiuVar.w(i7))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (List) aijy.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    aijgVarW = aiiuVar.w(i7);
                    while (i3 < list.size()) {
                        if (aijgVarW.l(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 == 50) {
                aiip aiipVar = (aiip) aijy.a.i(obj2, iS & 1048575);
                if (aiipVar.isEmpty()) {
                    continue;
                } else {
                    if (((aika) ahng.aS(aiiuVar.x(i7)).b).s == aikb.i) {
                        aijg aijgVarB = null;
                        for (Object obj3 : aiipVar.values()) {
                            if (aijgVarB == null) {
                                aijgVarB = aiiz.a.b(((aihn) obj3).getClass());
                            }
                            if (!aijgVarB.l(obj3)) {
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
            this = aiiuVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.h || ahng.aT(obj).i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // defpackage.aijg
    public final void m(Object obj, ahud ahudVar) {
        Map.Entry entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        aiiu aiiuVar = this;
        if (aiiuVar.h) {
            aiha aihaVarAT = ahng.aT(obj);
            if (aihaVarAT.h()) {
                entry = null;
                it = null;
            } else {
                Iterator itE = aihaVarAT.e();
                entry = (Map.Entry) itE.next();
                it = itE;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = aiiuVar.c;
        Unsafe unsafe = b;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr.length) {
            int iS = aiiuVar.s(i6);
            int iN = aiiuVar.n(i6);
            int i8 = (iS >>> 20) & 255;
            if (i8 <= 17) {
                int i9 = iArr[i6 + 2];
                z = true;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i7;
                i3 = 1 << (i9 >>> 20);
            } else {
                z = true;
                i = i5;
                i2 = i7;
                i3 = 0;
            }
            while (entry != null && ((aihk) entry.getKey()).b <= iN) {
                ahng.br(ahudVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jT = t(iS);
            switch (i8) {
                case 0:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.x(iN, aijy.b(obj, jT));
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 1:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.B(iN, aijy.a.b(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 2:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.E(iN, unsafe.getLong(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 3:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.N(iN, unsafe.getLong(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 4:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.D(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 5:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.A(iN, unsafe.getLong(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 6:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.z(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 7:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.v(iN, aijy.a.f(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 8:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        S(iN, unsafe.getObject(obj, jT), ahudVar);
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 9:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.F(iN, unsafe.getObject(obj, jT), aiiuVar.w(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 10:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.w(iN, (aigj) unsafe.getObject(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 11:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.M(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 12:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.y(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 13:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.H(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 14:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.I(iN, unsafe.getLong(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 15:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.J(iN, unsafe.getInt(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 16:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.K(iN, unsafe.getLong(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 17:
                    if (aiiuVar.K(obj, i6, i, i2, i3)) {
                        ahudVar.C(iN, unsafe.getObject(obj, jT), aiiuVar.w(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 18:
                    aijh.o(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 19:
                    aijh.q(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 20:
                    aijh.A(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 21:
                    aijh.A(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 22:
                    aijh.s(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 23:
                    aijh.z(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 24:
                    aijh.y(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 25:
                    aijh.m(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 26:
                    aijh.w(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar);
                    break;
                case 27:
                    aijh.t(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, aiiuVar.w(i6));
                    break;
                case 28:
                    aijh.n(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar);
                    break;
                case 29:
                    aijh.x(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 30:
                    aijh.p(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 31:
                    aijh.y(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 32:
                    aijh.z(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 33:
                    aijh.u(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 34:
                    aijh.v(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, false);
                    break;
                case 35:
                    aijh.o(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 36:
                    aijh.q(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 37:
                    aijh.A(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 38:
                    aijh.A(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 39:
                    aijh.s(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 40:
                    aijh.z(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 41:
                    aijh.y(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 42:
                    aijh.m(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 43:
                    aijh.x(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 44:
                    aijh.p(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 45:
                    aijh.y(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 46:
                    aijh.z(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 47:
                    aijh.u(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 48:
                    aijh.v(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, z);
                    break;
                case 49:
                    aijh.r(aiiuVar.n(i6), (List) unsafe.getObject(obj, jT), ahudVar, aiiuVar.w(i6));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, jT);
                    if (object != null) {
                        axqr axqrVarAS = ahng.aS(aiiuVar.x(i6));
                        Object obj2 = ahudVar.b;
                        Iterator it2 = ((aiip) object).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            aigs aigsVar = (aigs) obj2;
                            aigsVar.w(iN, 2);
                            aigsVar.y(ahud.R(axqrVarAS, entry2.getKey(), entry2.getValue()));
                            ahud.S(aigsVar, axqrVarAS, entry2.getKey(), entry2.getValue());
                            i = i;
                            i2 = i2;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 51:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.x(iN, ((Double) aijy.e(obj, jT)).doubleValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 52:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.B(iN, ((Float) aijy.a.i(obj, jT)).floatValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 53:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.E(iN, u(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 54:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.N(iN, u(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 55:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.D(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 56:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.A(iN, u(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 57:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.z(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 58:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.v(iN, ((Boolean) aijy.e(obj, jT)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 59:
                    if (aiiuVar.O(obj, iN, i6)) {
                        S(iN, unsafe.getObject(obj, jT), ahudVar);
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 60:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.F(iN, unsafe.getObject(obj, jT), aiiuVar.w(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 61:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.w(iN, (aigj) unsafe.getObject(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 62:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.M(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 63:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.y(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 64:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.H(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 65:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.I(iN, u(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 66:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.J(iN, o(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 67:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.K(iN, u(obj, jT));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                case 68:
                    if (aiiuVar.O(obj, iN, i6)) {
                        ahudVar.C(iN, unsafe.getObject(obj, jT), aiiuVar.w(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
                default:
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                    aiiuVar = this;
                    i7 = i2;
                    i5 = i;
                    entry = entry;
                    break;
            }
            i = i;
            i2 = i2;
            i6 += 3;
            i4 = 1048575;
            aiiuVar = this;
            i7 = i2;
            i5 = i;
            entry = entry;
        }
        while (entry != null) {
            ahng.br(ahudVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        aijs.c(obj).h(ahudVar);
    }
}
