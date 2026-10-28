package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axrf {
    public static final Class a;
    public static final axrl b;

    static {
        Class<?> cls;
        Class cls2 = axpi.a;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new axrl();
    }

    @Deprecated
    static int a(int i, axqv axqvVar, axre axreVar) {
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((axpg) axqvVar).b(axreVar);
    }

    static int b(axpg axpgVar, axre axreVar) {
        int iB = axpgVar.b(axreVar);
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    static int c(int i, Object obj, axre axreVar) {
        int iNumberOfLeadingZeros;
        int iB;
        int i2 = i << 3;
        if (obj instanceof axqo) {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = ((axqo) obj).a();
        } else {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = b((axpg) obj, axreVar);
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
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iE = axqgVar.e(i);
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iE << 1) ^ (iE >> 31)) * 9)) >>> 6;
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
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jE = axqqVar.e(i);
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jE << 1) ^ (jE >> 63)) * 9)) >>> 6;
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
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(axqgVar.e(i)) * 9)) >>> 6;
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

    static Object g(Object obj, int i, int i2, Object obj2, axrl axrlVar) {
        if (obj2 == null) {
            obj2 = axrlVar.b(obj);
        }
        axrlVar.d(obj2, i, i2);
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
    static void h(axrl axrlVar, Object obj, Object obj2) {
        axrm axrmVarC = axrlVar.c(obj);
        axrm axrmVarC2 = axrlVar.c(obj2);
        axrm axrmVar = axrm.a;
        if (!axrmVar.equals(axrmVarC2)) {
            if (axrmVar.equals(axrmVarC)) {
                int i = axrmVarC.b + axrmVarC2.b;
                int[] iArrCopyOf = Arrays.copyOf(axrmVarC.c, i);
                System.arraycopy(axrmVarC2.c, 0, iArrCopyOf, axrmVarC.b, axrmVarC2.b);
                Object[] objArrCopyOf = Arrays.copyOf(axrmVarC.d, i);
                System.arraycopy(axrmVarC2.d, 0, objArrCopyOf, axrmVarC.b, axrmVarC2.b);
                axrmVarC = new axrm(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!axrmVarC2.equals(axrmVar)) {
                axrmVarC.b();
                int i2 = axrmVarC.b + axrmVarC2.b;
                axrmVarC.c(i2);
                System.arraycopy(axrmVarC2.c, 0, axrmVarC.c, axrmVarC.b, axrmVarC2.b);
                System.arraycopy(axrmVarC2.d, 0, axrmVarC.d, axrmVarC.b, axrmVarC2.b);
                axrmVarC.b = i2;
            }
        }
        axrlVar.f(obj, axrmVarC);
    }

    static Object i(Object obj, int i, List list, axpc axpcVar, Object obj2, axrl axrlVar) {
        if (axpcVar != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num = (Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (axpc.a(iIntValue)) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = g(obj, i, iIntValue, obj2, axrlVar);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (!axpc.a(iIntValue2)) {
                        obj2 = g(obj, i, iIntValue2, obj2, axrlVar);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static /* synthetic */ int j(List list) {
        int iAR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            iAR = 0;
            while (i < size) {
                iAR += a.aR(axqgVar.e(i));
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

    public static /* synthetic */ int k(List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(axqqVar.e(i)) * 9)) >>> 6;
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

    static void l(Object obj, Object obj2) {
        axqa axqaVarE = AndroidInfo.e(obj2);
        if (axqaVarE.d()) {
            return;
        }
        AndroidInfo.f(obj);
        axri axriVar = axqaVarE.b;
        if (axriVar.size() > 0) {
            axrg axrgVar = (axrg) axriVar.a(0);
            lxs lxsVar = axrgVar.c;
            Object obj3 = axrgVar.a;
            throw null;
        }
    }

    public static void m(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axpj)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            axpkVar.y(i3);
            while (i2 < list.size()) {
                axpkVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        axpj axpjVar = (axpj) list;
        if (!z) {
            while (i2 < axpjVar.a) {
                ((axpk) axklVar.a).l(i, axpjVar.f(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < axpjVar.a; i6++) {
            axpjVar.f(i6);
            i5++;
        }
        axpkVar2.y(i5);
        while (i2 < axpjVar.a) {
            axpkVar2.j(axpjVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axpv)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).e(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            axpkVar.y(i3);
            while (i2 < list.size()) {
                axpkVar.f(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        axpv axpvVar = (axpv) list;
        if (!z) {
            while (i2 < axpvVar.a) {
                ((axpk) axklVar.a).e(i, axpvVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < axpvVar.a; i6++) {
            axpvVar.e(i6);
            i5 += 8;
        }
        axpkVar2.y(i5);
        while (i2 < axpvVar.a) {
            axpkVar2.f(axpvVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).g(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            axpkVar.y(i3);
            while (i2 < list.size()) {
                axpkVar.h(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        axqc axqcVar = (axqc) list;
        if (!z) {
            while (i2 < axqcVar.a) {
                ((axpk) axklVar.a).g(i, axqcVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < axqcVar.a; i6++) {
            axqcVar.e(i6);
            i5 += 4;
        }
        axpkVar2.y(i5);
        while (i2 < axqcVar.a) {
            axpkVar2.h(axqcVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqg)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = axklVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((axpk) obj).x(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            axpkVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                axpkVar.y((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        axqg axqgVar = (axqg) list;
        if (!z) {
            while (i2 < axqgVar.a) {
                Object obj2 = axklVar.a;
                int iE = axqgVar.e(i2);
                ((axpk) obj2).x(i, (iE << 1) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < axqgVar.a; i4++) {
            int iE2 = axqgVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE2 << 1) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        axpkVar2.y(iNumberOfLeadingZeros2);
        while (i2 < axqgVar.a) {
            int iE3 = axqgVar.e(i2);
            axpkVar2.y((iE3 << 1) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void q(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqq)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = axklVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((axpk) obj).z(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            axpkVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                axpkVar.A((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        axqq axqqVar = (axqq) list;
        if (!z) {
            while (i2 < axqqVar.a) {
                Object obj2 = axklVar.a;
                long jE = axqqVar.e(i2);
                ((axpk) obj2).z(i, (jE << 1) ^ (jE >> 63));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < axqqVar.a; i4++) {
            long jE2 = axqqVar.e(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jE2 << 1) ^ (jE2 >> 63)) * 9)) >>> 6;
        }
        axpkVar2.y(iNumberOfLeadingZeros2);
        while (i2 < axqqVar.a) {
            long jE3 = axqqVar.e(i2);
            axpkVar2.A((jE3 << 1) ^ (jE3 >> 63));
            i2++;
        }
    }

    public static void r(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).x(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            axpkVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                axpkVar.y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        axqg axqgVar = (axqg) list;
        if (!z) {
            while (i2 < axqgVar.a) {
                ((axpk) axklVar.a).x(i, axqgVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < axqgVar.a; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(axqgVar.e(i4)) * 9)) >>> 6;
        }
        axpkVar2.y(iNumberOfLeadingZeros2);
        while (i2 < axqgVar.a) {
            axpkVar2.y(axqgVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int iAR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAR += a.aR(((Integer) list.get(i3)).intValue());
            }
            axpkVar.y(iAR);
            while (i2 < list.size()) {
                axpkVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        axqg axqgVar = (axqg) list;
        if (!z) {
            while (i2 < axqgVar.a) {
                ((axpk) axklVar.a).s(i, axqgVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int iAR2 = 0;
        for (int i4 = 0; i4 < axqgVar.a; i4++) {
            iAR2 += a.aR(axqgVar.e(i4));
        }
        axpkVar2.y(iAR2);
        while (i2 < axqgVar.a) {
            axpkVar2.t(axqgVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            axpkVar.y(i3);
            while (i2 < list.size()) {
                axpkVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        axqg axqgVar = (axqg) list;
        if (!z) {
            while (i2 < axqgVar.a) {
                ((axpk) axklVar.a).o(i, axqgVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < axqgVar.a; i6++) {
            axqgVar.e(i6);
            i5 += 4;
        }
        axpkVar2.y(i5);
        while (i2 < axqgVar.a) {
            axpkVar2.p(axqgVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            axpkVar.y(i3);
            while (i2 < list.size()) {
                axpkVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        axqq axqqVar = (axqq) list;
        if (!z) {
            while (i2 < axqqVar.a) {
                ((axpk) axklVar.a).q(i, axqqVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < axqqVar.a; i6++) {
            axqqVar.e(i6);
            i5 += 8;
        }
        axpkVar2.y(i5);
        while (i2 < axqqVar.a) {
            axpkVar2.r(axqqVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, axkl axklVar, boolean z) throws axpu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof axqq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((axpk) axklVar.a).z(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            axpk axpkVar = (axpk) axklVar.a;
            axpkVar.y((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            axpkVar.y(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                axpkVar.A(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        axqq axqqVar = (axqq) list;
        if (!z) {
            while (i2 < axqqVar.a) {
                ((axpk) axklVar.a).z(i, axqqVar.e(i2));
                i2++;
            }
            return;
        }
        axpk axpkVar2 = (axpk) axklVar.a;
        axpkVar2.y((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < axqqVar.a; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(axqqVar.e(i4)) * 9)) >>> 6;
        }
        axpkVar2.y(iNumberOfLeadingZeros2);
        while (i2 < axqqVar.a) {
            axpkVar2.A(axqqVar.e(i2));
            i2++;
        }
    }
}
