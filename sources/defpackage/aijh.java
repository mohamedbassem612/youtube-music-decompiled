package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aijh {
    public static final aijs a = new aijs();

    public static /* synthetic */ void A(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiio)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).z(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            aigsVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                aigsVar.A(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aiio aiioVar = (aiio) list;
        if (!z) {
            while (i2 < aiioVar.c) {
                ((aigs) ahudVar.b).z(i, aiioVar.a(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aiioVar.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(aiioVar.a(i4)) * 9)) >>> 6;
        }
        aigsVar2.y(iNumberOfLeadingZeros2);
        while (i2 < aiioVar.c) {
            aigsVar2.A(aiioVar.a(i2));
            i2++;
        }
    }

    @Deprecated
    static int a(int i, MessageLite messageLite, aijg aijgVar) {
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((aifs) messageLite).getSerializedSize(aijgVar);
    }

    static int b(List list) {
        int iAR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            iAR = 0;
            while (i < size) {
                iAR += a.aR(aihoVar.d(i));
                i++;
            }
        } else {
            iAR = 0;
            while (i < size) {
                iAR += a.aR(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iAR;
    }

    static int c(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(aihoVar.d(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int d(int i, Object obj, aijg aijgVar) {
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
        int serializedSize = ((aifs) obj).getSerializedSize(aijgVar);
        return ((352 - iNumberOfLeadingZeros) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(serializedSize) * 9)) >>> 6) + serializedSize;
    }

    static int e(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iD = aihoVar.d(i);
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iD << 1) ^ (iD >> 31)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31)) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int f(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jA = aiioVar.a(i);
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jA << 1) ^ (jA >> 63)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63)) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int g(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(aihoVar.d(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static Object h(Object obj, int i, List list, aihs aihsVar, Object obj2, aijs aijsVar) {
        if (aihsVar != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num = (Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (aihsVar.findValueByNumber(iIntValue) != null) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = l(obj, i, iIntValue, obj2);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (aihsVar.findValueByNumber(iIntValue2) == null) {
                        obj2 = l(obj, i, iIntValue2, obj2);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    static Object i(Object obj, int i, List list, aiht aihtVar, Object obj2, aijs aijsVar) {
        if (aihtVar != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num = (Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (aihtVar.isInRange(iIntValue)) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = l(obj, i, iIntValue, obj2);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (!aihtVar.isInRange(iIntValue2)) {
                        obj2 = l(obj, i, iIntValue2, obj2);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static /* synthetic */ int j(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(aiioVar.a(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static void k(Object obj, Object obj2) {
        aiha aihaVar = ((aihi) obj2).j;
        if (aihaVar.h()) {
            return;
        }
        aiha aihaVarA = ((aihi) obj).a();
        aijl aijlVar = aihaVar.b;
        int size = aijlVar.size();
        for (int i = 0; i < size; i++) {
            aiji aijiVar = (aiji) aijlVar.a(i);
            aihk aihkVar = aijiVar.c;
            Object objB = aijiVar.a;
            boolean z = objB instanceof aiii;
            if (aihkVar.d) {
                if (z) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                Object objK = aihaVarA.k(aihkVar);
                List list = (List) objB;
                int size2 = list.size();
                if (objK == null) {
                    objK = new ArrayList(size2);
                }
                List list2 = (List) objK;
                for (int i2 = 0; i2 < size2; i2++) {
                    list2.add(aiha.d(list.get(i2)));
                }
                aihaVarA.b.d(aihkVar, objK);
            } else if (aihkVar.a() == aikb.i) {
                Object objK2 = aihaVarA.k(aihkVar);
                if (objK2 == null) {
                    aihaVarA.b.d(aihkVar, aiha.d(objB));
                    if (z) {
                        aihaVarA.d = true;
                    }
                } else {
                    if (z) {
                        objB = ((aiii) objB).b();
                    }
                    if (objK2 instanceof MessageLite) {
                        aiir builder = ((MessageLite) objK2).toBuilder();
                        aihk.b(builder, objB);
                        aihaVarA.b.d(aihkVar, builder.build());
                    } else {
                        aihk.b(objK2, objB);
                    }
                }
            } else {
                if (z) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                aihaVarA.b.d(aihkVar, aiha.d(objB));
            }
        }
    }

    static Object l(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = aijs.f(obj);
        }
        aijs.b(obj2, i, i2);
        return obj2;
    }

    public static void m(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiga)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).h(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            aigsVar.y(i3);
            while (i2 < list.size()) {
                aigsVar.e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        aiga aigaVar = (aiga) list;
        if (!z) {
            while (i2 < aigaVar.c) {
                ((aigs) ahudVar.b).h(i, aigaVar.g(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aigaVar.c; i6++) {
            aigaVar.g(i6);
            i5++;
        }
        aigsVar2.y(i5);
        while (i2 < aigaVar.c) {
            aigsVar2.e(aigaVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, ahud ahudVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((aigs) ahudVar.b).i(i, (aigj) list.get(i2));
        }
    }

    public static void o(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aigt)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).Q(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            aigsVar.y(i3);
            while (i2 < list.size()) {
                aigsVar.R(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        aigt aigtVar = (aigt) list;
        if (!z) {
            while (i2 < aigtVar.d) {
                ((aigs) ahudVar.b).Q(i, aigtVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aigtVar.d; i6++) {
            aigtVar.d(i6);
            i5 += 8;
        }
        aigsVar2.y(i5);
        while (i2 < aigtVar.d) {
            aigsVar2.R(aigtVar.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiho)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iAR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAR += a.aR(((Integer) list.get(i3)).intValue());
            }
            aigsVar.y(iAR);
            while (i2 < list.size()) {
                aigsVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aiho aihoVar = (aiho) list;
        if (!z) {
            while (i2 < aihoVar.c) {
                ((aigs) ahudVar.b).o(i, aihoVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iAR2 = 0;
        for (int i4 = 0; i4 < aihoVar.c; i4++) {
            iAR2 += a.aR(aihoVar.d(i4));
        }
        aigsVar2.y(iAR2);
        while (i2 < aihoVar.c) {
            aigsVar2.p(aihoVar.d(i2));
            i2++;
        }
    }

    public static void q(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aihc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).S(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            aigsVar.y(i3);
            while (i2 < list.size()) {
                aigsVar.T(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        aihc aihcVar = (aihc) list;
        if (!z) {
            while (i2 < aihcVar.d) {
                ((aigs) ahudVar.b).S(i, aihcVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aihcVar.d; i6++) {
            aihcVar.d(i6);
            i5 += 4;
        }
        aigsVar2.y(i5);
        while (i2 < aihcVar.d) {
            aigsVar2.T(aihcVar.d(i2));
            i2++;
        }
    }

    public static void r(int i, List list, ahud ahudVar, aijg aijgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ahudVar.C(i, list.get(i2), aijgVar);
        }
    }

    public static void s(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiho)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iAR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAR += a.aR(((Integer) list.get(i3)).intValue());
            }
            aigsVar.y(iAR);
            while (i2 < list.size()) {
                aigsVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aiho aihoVar = (aiho) list;
        if (!z) {
            while (i2 < aihoVar.c) {
                ((aigs) ahudVar.b).o(i, aihoVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i4 = 0; i4 < aihoVar.c; i4++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(aihoVar.d(i4)) * 9)) >>> 6;
        }
        aigsVar2.y(iNumberOfLeadingZeros);
        while (i2 < aihoVar.c) {
            aigsVar2.p(aihoVar.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, ahud ahudVar, aijg aijgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ahudVar.F(i, list.get(i2), aijgVar);
        }
    }

    public static void u(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiho)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ahudVar.b;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((aigs) obj).x(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            aigsVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                aigsVar.y((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        aiho aihoVar = (aiho) list;
        if (!z) {
            while (i2 < aihoVar.c) {
                Object obj2 = ahudVar.b;
                int iD = aihoVar.d(i2);
                ((aigs) obj2).x(i, (iD << 1) ^ (iD >> 31));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aihoVar.c; i4++) {
            int iD2 = aihoVar.d(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iD2 << 1) ^ (iD2 >> 31)) * 9)) >>> 6;
        }
        aigsVar2.y(iNumberOfLeadingZeros2);
        while (i2 < aihoVar.c) {
            int iD3 = aihoVar.d(i2);
            aigsVar2.y((iD3 << 1) ^ (iD3 >> 31));
            i2++;
        }
    }

    public static void v(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiio)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ahudVar.b;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((aigs) obj).z(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            aigsVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                aigsVar.A((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        aiio aiioVar = (aiio) list;
        if (!z) {
            while (i2 < aiioVar.c) {
                Object obj2 = ahudVar.b;
                long jA = aiioVar.a(i2);
                ((aigs) obj2).z(i, (jA << 1) ^ (jA >> 63));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aiioVar.c; i4++) {
            long jA2 = aiioVar.a(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jA2 << 1) ^ (jA2 >> 63)) * 9)) >>> 6;
        }
        aigsVar2.y(iNumberOfLeadingZeros2);
        while (i2 < aiioVar.c) {
            long jA3 = aiioVar.a(i2);
            aigsVar2.A((jA3 << 1) ^ (jA3 >> 63));
            i2++;
        }
    }

    public static void w(int i, List list, ahud ahudVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiin)) {
            while (i2 < list.size()) {
                ((aigs) ahudVar.b).u(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        aiin aiinVar = (aiin) list;
        while (i2 < list.size()) {
            Object objC = aiinVar.c();
            if (objC instanceof String) {
                ((aigs) ahudVar.b).u(i, (String) objC);
            } else {
                ((aigs) ahudVar.b).i(i, (aigj) objC);
            }
            i2++;
        }
    }

    public static void x(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiho)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).x(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            aigsVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                aigsVar.y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aiho aihoVar = (aiho) list;
        if (!z) {
            while (i2 < aihoVar.c) {
                ((aigs) ahudVar.b).x(i, aihoVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aihoVar.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(aihoVar.d(i4)) * 9)) >>> 6;
        }
        aigsVar2.y(iNumberOfLeadingZeros2);
        while (i2 < aihoVar.c) {
            aigsVar2.y(aihoVar.d(i2));
            i2++;
        }
    }

    public static /* synthetic */ void y(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiho)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            aigsVar.y(i3);
            while (i2 < list.size()) {
                aigsVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aiho aihoVar = (aiho) list;
        if (!z) {
            while (i2 < aihoVar.c) {
                ((aigs) ahudVar.b).k(i, aihoVar.d(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aihoVar.c; i6++) {
            aihoVar.d(i6);
            i5 += 4;
        }
        aigsVar2.y(i5);
        while (i2 < aihoVar.c) {
            aigsVar2.l(aihoVar.d(i2));
            i2++;
        }
    }

    public static /* synthetic */ void z(int i, List list, ahud ahudVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aiio)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((aigs) ahudVar.b).m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aigs aigsVar = (aigs) ahudVar.b;
            aigsVar.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            aigsVar.y(i3);
            while (i2 < list.size()) {
                aigsVar.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aiio aiioVar = (aiio) list;
        if (!z) {
            while (i2 < aiioVar.c) {
                ((aigs) ahudVar.b).m(i, aiioVar.a(i2));
                i2++;
            }
            return;
        }
        aigs aigsVar2 = (aigs) ahudVar.b;
        aigsVar2.w(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aiioVar.c; i6++) {
            aiioVar.a(i6);
            i5 += 8;
        }
        aigsVar2.y(i5);
        while (i2 < aiioVar.c) {
            aigsVar2.n(aiioVar.a(i2));
            i2++;
        }
    }
}
