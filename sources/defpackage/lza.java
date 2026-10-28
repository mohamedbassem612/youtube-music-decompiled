package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lza {
    public static final Class a;
    public static final lzg b;

    static {
        Class<?> cls;
        Class cls2 = lwp.a;
        try {
            cls = Class.forName("com.google.android.icing.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new lzg();
    }

    @Deprecated
    static int a(int i, lyp lypVar, lyz lyzVar) {
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((lwn) lypVar).l(lyzVar);
    }

    static int b(lwn lwnVar, lyz lyzVar) {
        int iL = lwnVar.l(lyzVar);
        return ((352 - (Integer.numberOfLeadingZeros(iL) * 9)) >>> 6) + iL;
    }

    static int c(int i, Object obj, lyz lyzVar) {
        int iNumberOfLeadingZeros;
        int iB;
        int i2 = i << 3;
        if (obj instanceof lyj) {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = ((lyj) obj).a();
        } else {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = b((lwn) obj, lyzVar);
        }
        return ((352 - iNumberOfLeadingZeros) >>> 6) + iB;
    }

    static int d(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lxu) {
            lxu lxuVar = (lxu) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iD = lxuVar.d(i);
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

    static int e(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lyl) {
            lyl lylVar = (lyl) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jA = lylVar.a(i);
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

    static int f(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lxu) {
            lxu lxuVar = (lxu) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(lxuVar.d(i)) * 9)) >>> 6;
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

    static Object g(Object obj, int i, int i2, Object obj2, lzg lzgVar) {
        if (obj2 == null) {
            obj2 = lzgVar.a(obj);
        }
        ((lzh) obj2).d(i << 3, Long.valueOf(i2));
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static void h(lzg lzgVar, Object obj, Object obj2) {
        lzh lzhVarB = lzgVar.b(obj);
        lzh lzhVarB2 = lzgVar.b(obj2);
        lzh lzhVar = lzh.a;
        if (!lzhVar.equals(lzhVarB2)) {
            if (lzhVar.equals(lzhVarB)) {
                int i = lzhVarB.b + lzhVarB2.b;
                int[] iArrCopyOf = Arrays.copyOf(lzhVarB.c, i);
                System.arraycopy(lzhVarB2.c, 0, iArrCopyOf, lzhVarB.b, lzhVarB2.b);
                Object[] objArrCopyOf = Arrays.copyOf(lzhVarB.d, i);
                System.arraycopy(lzhVarB2.d, 0, objArrCopyOf, lzhVarB.b, lzhVarB2.b);
                lzhVarB = new lzh(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!lzhVarB2.equals(lzhVar)) {
                lzhVarB.b();
                int i2 = lzhVarB.b + lzhVarB2.b;
                lzhVarB.c(i2);
                System.arraycopy(lzhVarB2.c, 0, lzhVarB.c, lzhVarB.b, lzhVarB2.b);
                System.arraycopy(lzhVarB2.d, 0, lzhVarB.d, lzhVarB.b, lzhVarB2.b);
                lzhVarB.b = i2;
            }
        }
        lzgVar.d(obj, lzhVarB);
    }

    public static /* synthetic */ int i(List list) {
        int iAR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lxu) {
            lxu lxuVar = (lxu) list;
            iAR = 0;
            while (i < size) {
                iAR += a.aR(lxuVar.d(i));
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

    public static /* synthetic */ int j(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lyl) {
            lyl lylVar = (lyl) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(lylVar.a(i)) * 9)) >>> 6;
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
        if (ixt.M(obj2).c()) {
            return;
        }
        throw null;
    }

    static void l(Object obj, int i, List list, lxy lxyVar, Object obj2, lzg lzgVar) {
        if (lxyVar != null) {
            Object objG = null;
            if (!(list instanceof RandomAccess)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (!lxyVar.a(iIntValue)) {
                        objG = g(obj, i, iIntValue, objG, lzgVar);
                        it.remove();
                    }
                }
                return;
            }
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue2 = num.intValue();
                if (lxyVar.a(iIntValue2)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    objG = g(obj, i, iIntValue2, objG, lzgVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
    }

    public static void m(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lws)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).e(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            lxhVar.s(i3);
            while (i2 < list.size()) {
                lxhVar.c(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        lws lwsVar = (lws) list;
        if (!z) {
            while (i2 < lwsVar.b) {
                ((lxh) lqaVar.a).e(i, lwsVar.g(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lwsVar.b; i6++) {
            lwsVar.g(i6);
            i5++;
        }
        lxhVar2.s(i5);
        while (i2 < lwsVar.b) {
            lxhVar2.c(lwsVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).H(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            lxhVar.s(i3);
            while (i2 < list.size()) {
                lxhVar.I(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        lxi lxiVar = (lxi) list;
        if (!z) {
            while (i2 < lxiVar.c) {
                ((lxh) lqaVar.a).H(i, lxiVar.d(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lxiVar.c; i6++) {
            lxiVar.d(i6);
            i5 += 8;
        }
        lxhVar2.s(i5);
        while (i2 < lxiVar.c) {
            lxhVar2.I(lxiVar.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).J(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            lxhVar.s(i3);
            while (i2 < list.size()) {
                lxhVar.K(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        lxp lxpVar = (lxp) list;
        if (!z) {
            while (i2 < lxpVar.c) {
                ((lxh) lqaVar.a).J(i, lxpVar.d(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lxpVar.c; i6++) {
            lxpVar.d(i6);
            i5 += 4;
        }
        lxhVar2.s(i5);
        while (i2 < lxpVar.c) {
            lxhVar2.K(lxpVar.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxu)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = lqaVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((lxh) obj).r(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            lxhVar.s(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                lxhVar.s((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        lxu lxuVar = (lxu) list;
        if (!z) {
            while (i2 < lxuVar.c) {
                Object obj2 = lqaVar.a;
                int iD = lxuVar.d(i2);
                ((lxh) obj2).r(i, (iD << 1) ^ (iD >> 31));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < lxuVar.c; i4++) {
            int iD2 = lxuVar.d(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iD2 << 1) ^ (iD2 >> 31)) * 9)) >>> 6;
        }
        lxhVar2.s(iNumberOfLeadingZeros2);
        while (i2 < lxuVar.c) {
            int iD3 = lxuVar.d(i2);
            lxhVar2.s((iD3 << 1) ^ (iD3 >> 31));
            i2++;
        }
    }

    public static void q(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lyl)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = lqaVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((lxh) obj).t(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            lxhVar.s(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                lxhVar.u((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        lyl lylVar = (lyl) list;
        if (!z) {
            while (i2 < lylVar.c) {
                Object obj2 = lqaVar.a;
                long jA = lylVar.a(i2);
                ((lxh) obj2).t(i, (jA << 1) ^ (jA >> 63));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < lylVar.c; i4++) {
            long jA2 = lylVar.a(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jA2 << 1) ^ (jA2 >> 63)) * 9)) >>> 6;
        }
        lxhVar2.s(iNumberOfLeadingZeros2);
        while (i2 < lylVar.c) {
            long jA3 = lylVar.a(i2);
            lxhVar2.u((jA3 << 1) ^ (jA3 >> 63));
            i2++;
        }
    }

    public static void r(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            lxhVar.s(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                lxhVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lxu lxuVar = (lxu) list;
        if (!z) {
            while (i2 < lxuVar.c) {
                ((lxh) lqaVar.a).r(i, lxuVar.d(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < lxuVar.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(lxuVar.d(i4)) * 9)) >>> 6;
        }
        lxhVar2.s(iNumberOfLeadingZeros2);
        while (i2 < lxuVar.c) {
            lxhVar2.s(lxuVar.d(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int iAR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAR += a.aR(((Integer) list.get(i3)).intValue());
            }
            lxhVar.s(iAR);
            while (i2 < list.size()) {
                lxhVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lxu lxuVar = (lxu) list;
        if (!z) {
            while (i2 < lxuVar.c) {
                ((lxh) lqaVar.a).k(i, lxuVar.d(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int iAR2 = 0;
        for (int i4 = 0; i4 < lxuVar.c; i4++) {
            iAR2 += a.aR(lxuVar.d(i4));
        }
        lxhVar2.s(iAR2);
        while (i2 < lxuVar.c) {
            lxhVar2.l(lxuVar.d(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lxu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            lxhVar.s(i3);
            while (i2 < list.size()) {
                lxhVar.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        lxu lxuVar = (lxu) list;
        if (!z) {
            while (i2 < lxuVar.c) {
                ((lxh) lqaVar.a).g(i, lxuVar.d(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lxuVar.c; i6++) {
            lxuVar.d(i6);
            i5 += 4;
        }
        lxhVar2.s(i5);
        while (i2 < lxuVar.c) {
            lxhVar2.h(lxuVar.d(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lyl)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            lxhVar.s(i3);
            while (i2 < list.size()) {
                lxhVar.j(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lyl lylVar = (lyl) list;
        if (!z) {
            while (i2 < lylVar.c) {
                ((lxh) lqaVar.a).i(i, lylVar.a(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < lylVar.c; i6++) {
            lylVar.a(i6);
            i5 += 8;
        }
        lxhVar2.s(i5);
        while (i2 < lylVar.c) {
            lxhVar2.j(lylVar.a(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, lqa lqaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof lyl)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((lxh) lqaVar.a).t(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lxh lxhVar = (lxh) lqaVar.a;
            lxhVar.q(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            lxhVar.s(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                lxhVar.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lyl lylVar = (lyl) list;
        if (!z) {
            while (i2 < lylVar.c) {
                ((lxh) lqaVar.a).t(i, lylVar.a(i2));
                i2++;
            }
            return;
        }
        lxh lxhVar2 = (lxh) lqaVar.a;
        lxhVar2.q(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < lylVar.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(lylVar.a(i4)) * 9)) >>> 6;
        }
        lxhVar2.s(iNumberOfLeadingZeros2);
        while (i2 < lylVar.c) {
            lxhVar2.u(lylVar.a(i2));
            i2++;
        }
    }
}
