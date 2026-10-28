package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjt {
    public static final Class a;
    public static final bjy b;

    static {
        Class<?> cls;
        Class cls2 = bhp.a;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new bjy();
    }

    @Deprecated
    static int a(int i, bji bjiVar, bjs bjsVar) {
        return (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((bhn) bjiVar).c(bjsVar);
    }

    static int b(bhn bhnVar, bjs bjsVar) {
        int iC = bhnVar.c(bjsVar);
        return ((352 - (Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    static int c(int i, Object obj, bjs bjsVar) {
        int iNumberOfLeadingZeros;
        int iB;
        int i2 = i << 3;
        if (obj instanceof bjc) {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = ((bjc) obj).a();
        } else {
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2) * 9;
            iB = b((bhn) obj, bjsVar);
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
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iE = bitVar.e(i);
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
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jE = bjeVar.e(i);
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
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(bitVar.e(i)) * 9)) >>> 6;
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

    static Object g(Object obj, int i, List list, biv bivVar, Object obj2, bjy bjyVar) {
        if (bivVar != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num = (Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (bivVar.a()) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = h(obj, i, iIntValue, obj2, bjyVar);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (!bivVar.a()) {
                        obj2 = h(obj, i, iIntValue2, obj2, bjyVar);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, bjy bjyVar) {
        if (obj2 == null) {
            obj2 = bjyVar.b(obj);
        }
        bjyVar.d(obj2, i, i2);
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
    static void i(bjy bjyVar, Object obj, Object obj2) {
        bjz bjzVarC = bjyVar.c(obj);
        bjz bjzVarC2 = bjyVar.c(obj2);
        bjz bjzVar = bjz.a;
        if (!bjzVar.equals(bjzVarC2)) {
            if (bjzVar.equals(bjzVarC)) {
                int i = bjzVarC.b + bjzVarC2.b;
                int[] iArrCopyOf = Arrays.copyOf(bjzVarC.c, i);
                System.arraycopy(bjzVarC2.c, 0, iArrCopyOf, bjzVarC.b, bjzVarC2.b);
                Object[] objArrCopyOf = Arrays.copyOf(bjzVarC.d, i);
                System.arraycopy(bjzVarC2.d, 0, objArrCopyOf, bjzVarC.b, bjzVarC2.b);
                bjzVarC = new bjz(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!bjzVarC2.equals(bjzVar)) {
                bjzVarC.b();
                int i2 = bjzVarC.b + bjzVarC2.b;
                bjzVarC.c(i2);
                System.arraycopy(bjzVarC2.c, 0, bjzVarC.c, bjzVarC.b, bjzVarC2.b);
                System.arraycopy(bjzVarC2.d, 0, bjzVarC.d, bjzVarC.b, bjzVarC2.b);
                bjzVarC.b = i2;
            }
        }
        bjyVar.f(obj, bjzVarC);
    }

    public static /* synthetic */ int j(List list) {
        int iAR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            iAR = 0;
            while (i < size) {
                iAR += a.aR(bitVar.e(i));
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
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(bjeVar.e(i)) * 9)) >>> 6;
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
        bin binVarO = azw.o(obj2);
        if (binVarO.e()) {
            return;
        }
        azw.p(obj);
        bjv bjvVar = binVarO.b;
        if (bjvVar.size() > 0) {
            lzb lzbVar = (lzb) bjvVar.a(0);
            Object obj3 = lzbVar.c;
            Object obj4 = lzbVar.a;
            throw null;
        }
    }

    public static void m(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bhq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).e(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            bihVar.u(i3);
            while (i2 < list.size()) {
                bihVar.c(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        bhq bhqVar = (bhq) list;
        if (!z) {
            while (i2 < bhqVar.a) {
                ((bih) zfVar.a).e(i, bhqVar.f(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bhqVar.a; i6++) {
            bhqVar.f(i6);
            i5++;
        }
        bihVar2.u(i5);
        while (i2 < bhqVar.a) {
            bihVar2.c(bhqVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bii)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).I(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            bihVar.u(i3);
            while (i2 < list.size()) {
                bihVar.J(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        bii biiVar = (bii) list;
        if (!z) {
            while (i2 < biiVar.a) {
                ((bih) zfVar.a).I(i, biiVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < biiVar.a; i6++) {
            biiVar.e(i6);
            i5 += 8;
        }
        bihVar2.u(i5);
        while (i2 < biiVar.a) {
            bihVar2.J(biiVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bip)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).K(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            bihVar.u(i3);
            while (i2 < list.size()) {
                bihVar.L(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        bip bipVar = (bip) list;
        if (!z) {
            while (i2 < bipVar.a) {
                ((bih) zfVar.a).K(i, bipVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bipVar.a; i6++) {
            bipVar.e(i6);
            i5 += 4;
        }
        bihVar2.u(i5);
        while (i2 < bipVar.a) {
            bihVar2.L(bipVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bit)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = zfVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((bih) obj).t(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            bihVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                bihVar.u((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        bit bitVar = (bit) list;
        if (!z) {
            while (i2 < bitVar.a) {
                Object obj2 = zfVar.a;
                int iE = bitVar.e(i2);
                ((bih) obj2).t(i, (iE << 1) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bitVar.a; i4++) {
            int iE2 = bitVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE2 << 1) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        bihVar2.u(iNumberOfLeadingZeros2);
        while (i2 < bitVar.a) {
            int iE3 = bitVar.e(i2);
            bihVar2.u((iE3 << 1) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void q(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bje)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = zfVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((bih) obj).v(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            bihVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                bihVar.w((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        bje bjeVar = (bje) list;
        if (!z) {
            while (i2 < bjeVar.a) {
                Object obj2 = zfVar.a;
                long jE = bjeVar.e(i2);
                ((bih) obj2).v(i, (jE << 1) ^ (jE >> 63));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bjeVar.a; i4++) {
            long jE2 = bjeVar.e(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jE2 << 1) ^ (jE2 >> 63)) * 9)) >>> 6;
        }
        bihVar2.u(iNumberOfLeadingZeros2);
        while (i2 < bjeVar.a) {
            long jE3 = bjeVar.e(i2);
            bihVar2.w((jE3 << 1) ^ (jE3 >> 63));
            i2++;
        }
    }

    public static void r(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bit)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            bihVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                bihVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bit bitVar = (bit) list;
        if (!z) {
            while (i2 < bitVar.a) {
                ((bih) zfVar.a).t(i, bitVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bitVar.a; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(bitVar.e(i4)) * 9)) >>> 6;
        }
        bihVar2.u(iNumberOfLeadingZeros2);
        while (i2 < bitVar.a) {
            bihVar2.u(bitVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bit)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int iAR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAR += a.aR(((Integer) list.get(i3)).intValue());
            }
            bihVar.u(iAR);
            while (i2 < list.size()) {
                bihVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bit bitVar = (bit) list;
        if (!z) {
            while (i2 < bitVar.a) {
                ((bih) zfVar.a).l(i, bitVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int iAR2 = 0;
        for (int i4 = 0; i4 < bitVar.a; i4++) {
            iAR2 += a.aR(bitVar.e(i4));
        }
        bihVar2.u(iAR2);
        while (i2 < bitVar.a) {
            bihVar2.m(bitVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bit)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            bihVar.u(i3);
            while (i2 < list.size()) {
                bihVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        bit bitVar = (bit) list;
        if (!z) {
            while (i2 < bitVar.a) {
                ((bih) zfVar.a).h(i, bitVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bitVar.a; i6++) {
            bitVar.e(i6);
            i5 += 4;
        }
        bihVar2.u(i5);
        while (i2 < bitVar.a) {
            bihVar2.i(bitVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bje)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            bihVar.u(i3);
            while (i2 < list.size()) {
                bihVar.k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bje bjeVar = (bje) list;
        if (!z) {
            while (i2 < bjeVar.a) {
                ((bih) zfVar.a).j(i, bjeVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bjeVar.a; i6++) {
            bjeVar.e(i6);
            i5 += 8;
        }
        bihVar2.u(i5);
        while (i2 < bjeVar.a) {
            bihVar2.k(bjeVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, zf zfVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof bje)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((bih) zfVar.a).v(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bih bihVar = (bih) zfVar.a;
            bihVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            bihVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                bihVar.w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bje bjeVar = (bje) list;
        if (!z) {
            while (i2 < bjeVar.a) {
                ((bih) zfVar.a).v(i, bjeVar.e(i2));
                i2++;
            }
            return;
        }
        bih bihVar2 = (bih) zfVar.a;
        bihVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bjeVar.a; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(bjeVar.e(i4)) * 9)) >>> 6;
        }
        bihVar2.u(iNumberOfLeadingZeros2);
        while (i2 < bjeVar.a) {
            bihVar2.w(bjeVar.e(i2));
            i2++;
        }
    }
}
