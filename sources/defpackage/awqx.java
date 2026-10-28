package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awqx {
    public static final awyr A(awut awutVar, awou awouVar, int i, int i2, int i3, awqk awqkVar) throws Throwable {
        awyo awyoVar = new awyo(awup.b(awutVar, awouVar), awuw.h(i, i2, 4));
        awrc.I(i3, awqkVar, awyoVar, awyoVar);
        return awyoVar;
    }

    private static final boolean B(Throwable th, Throwable th2) {
        if (th2 != null) {
            boolean z = axcn.a;
            boolean z2 = axcn.a;
            if (!z2 && awuv.b) {
                th2 = axdx.c(th2);
            }
            if (!z2 && awuv.b) {
                th = axdx.c(th);
            }
            if (awrc.c(th2, th)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean b(char c, char c2, boolean z) {
        char upperCase;
        char upperCase2;
        if (c != c2) {
            return z && ((upperCase = Character.toUpperCase(c)) == (upperCase2 = Character.toUpperCase(c2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2));
        }
        return true;
    }

    public static final Iterator c(awqk awqkVar) {
        awsy awsyVar = new awsy();
        awsyVar.a = JniZero.p(awqkVar, awsyVar, awsyVar);
        return awsyVar;
    }

    public static awsx d(Iterator it) {
        it.getClass();
        return e(new awta(it, 0));
    }

    public static awsx e(awsx awsxVar) {
        return !(awsxVar instanceof awsm) ? new awsm(awsxVar) : awsxVar;
    }

    public static awsx f(Object obj, awqg awqgVar) {
        return obj == null ? awsq.a : new awsw(new yhn(obj, 5), awqgVar);
    }

    public static List g(awsx awsxVar) {
        awsxVar.getClass();
        Iterator itA = awsxVar.a();
        if (!itA.hasNext()) {
            return awno.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            List listSingletonList = Collections.singletonList(next);
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static awsx h(awsx awsxVar, awqg awqgVar) {
        return new awss(new awsu(awsxVar, awqgVar, 2), false, new actf(14));
    }

    public static final boolean i(awuj awujVar, Object obj) {
        Throwable thA = awmn.a(obj);
        return thA == null ? awujVar.a(obj) : awujVar.b(thA);
    }

    public static final awud j(awoq awoqVar) {
        awud awudVar;
        if (!(awoqVar instanceof axda)) {
            return new awud(awoqVar, 1);
        }
        awtr awtrVar = ((axda) awoqVar).f;
        while (true) {
            Object obj = awtrVar.a;
            if (obj == null) {
                awtrVar.c(axdb.b);
                awudVar = null;
                break;
            }
            if (obj instanceof awud) {
                if (awtrVar.d(obj, axdb.b)) {
                    awudVar = (awud) obj;
                    break;
                }
            } else if (obj != axdb.b && !(obj instanceof Throwable)) {
                Objects.toString(obj);
                throw new IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
        if (awudVar == null) {
            return new awud(awoqVar, 2);
        }
        boolean z = awuv.a;
        awtr awtrVar2 = awudVar.d;
        Object obj2 = awtrVar2.a;
        if (obj2 instanceof awul) {
            Object obj3 = ((awul) obj2).d;
        }
        awudVar.c.b = 536870911;
        awtrVar2.c(awtu.a);
        return awudVar;
    }

    public static /* synthetic */ int k(Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof awws) {
            return 0;
        }
        return obj instanceof awuf ? 1 : -2;
    }

    public static final Object l(awou awouVar, awqk awqkVar) throws Throwable {
        awvo awvoVarA;
        awou awouVarB;
        long jM;
        if (((awor) awouVar.get(awor.j)) == null) {
            ThreadLocal threadLocal = awxh.a;
            awvoVarA = awxh.a();
            awouVarB = awup.b(awvx.a, awouVar.plus(awvoVarA));
        } else {
            ThreadLocal threadLocal2 = awxh.a;
            awvoVarA = (awvo) awxh.a.get();
            awouVarB = awup.b(awvx.a, awouVar);
        }
        awty awtyVar = new awty(awouVarB, Thread.currentThread(), awvoVarA);
        awrc.I(1, awqkVar, awtyVar, awtyVar);
        awvo awvoVar = awtyVar.c;
        if (awvoVar != null) {
            awvoVar.p(false);
        }
        while (true) {
            if (awvoVar != null) {
                try {
                    jM = awvoVar.m();
                } catch (Throwable th) {
                    awvo awvoVar2 = awtyVar.c;
                    if (awvoVar2 != null) {
                        awvoVar2.n(false);
                    }
                    throw th;
                }
            } else {
                jM = Long.MAX_VALUE;
            }
            if (awtyVar.kI()) {
                break;
            }
            LockSupport.parkNanos(awtyVar, jM);
            if (Thread.interrupted()) {
                awtyVar.I(new InterruptedException());
            }
        }
        awvo awvoVar3 = awtyVar.c;
        if (awvoVar3 != null) {
            awvoVar3.n(false);
        }
        Object objB = awwl.b(awtyVar.z());
        awum awumVar = objB instanceof awum ? (awum) objB : null;
        if (awumVar == null) {
            return objB;
        }
        throw awumVar.b;
    }

    public static final Object n(awzd awzdVar, awzc[] awzcVarArr, Function0 function0, awql awqlVar, awoq awoqVar) throws Throwable {
        axbu axbuVar = new axbu(awzcVarArr, function0, awqlVar, awzdVar, null);
        axbw axbwVar = new axbw(awoqVar.getContext(), awoqVar);
        Object objU = awrc.U(axbwVar, true, axbwVar, axbuVar);
        if (objU != awox.a) {
            return awmy.a;
        }
        awoqVar.getClass();
        return objU;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(awzc awzcVar, awoq awoqVar) {
        awzw awzwVar;
        awrm awrmVar;
        axbd e;
        air airVar;
        if (awoqVar instanceof awzw) {
            awzwVar = (awzw) awoqVar;
            int i = awzwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzwVar.b = i - Integer.MIN_VALUE;
            } else {
                awzwVar = new awzw(awoqVar);
            }
        } else {
            awzwVar = new awzw(awoqVar);
        }
        Object obj = awzwVar.a;
        Object obj2 = awox.a;
        int i2 = awzwVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            awrm awrmVar2 = new awrm();
            awrmVar2.a = axca.a;
            air airVar2 = new air(awrmVar2, 4);
            try {
                awzwVar.c = awrmVar2;
                awzwVar.d = airVar2;
                awzwVar.b = 1;
                if (awzcVar.collect(airVar2, awzwVar) != obj2) {
                    awrmVar = awrmVar2;
                    obj2 = awrmVar.a;
                    if (obj2 == axca.a) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (axbd e2) {
                awrmVar = awrmVar2;
                e = e2;
                airVar = airVar2;
                if (e.a == airVar) {
                    throw e;
                }
                awro.A(awzwVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            airVar = awzwVar.d;
            awrmVar = awzwVar.c;
            try {
                atqp.j(obj);
            } catch (axbd e3) {
                e = e3;
                if (e.a == airVar) {
                    throw e;
                }
                awro.A(awzwVar.getContext());
            }
            obj2 = awrmVar.a;
            if (obj2 == axca.a) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(awzc awzcVar, awqk awqkVar, awoq awoqVar) throws Throwable {
        awzx awzxVar;
        awrm awrmVar;
        axbd e;
        awzt awztVar;
        if (awoqVar instanceof awzx) {
            awzxVar = (awzx) awoqVar;
            int i = awzxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzxVar.b = i - Integer.MIN_VALUE;
            } else {
                awzxVar = new awzx(awoqVar);
            }
        } else {
            awzxVar = new awzx(awoqVar);
        }
        Object obj = awzxVar.a;
        Object obj2 = awox.a;
        int i2 = awzxVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            awrm awrmVar2 = new awrm();
            awrmVar2.a = axca.a;
            awzt awztVar2 = new awzt(awqkVar, awrmVar2, 2);
            try {
                awzxVar.c = awrmVar2;
                awzxVar.d = awztVar2;
                awzxVar.b = 1;
                if (awzcVar.collect(awztVar2, awzxVar) != obj2) {
                    awrmVar = awrmVar2;
                    obj2 = awrmVar.a;
                    if (obj2 == axca.a) {
                        throw new NoSuchElementException("Expected at least one element matching the predicate");
                    }
                }
            } catch (axbd e2) {
                awrmVar = awrmVar2;
                e = e2;
                awztVar = awztVar2;
                if (e.a == awztVar) {
                    throw e;
                }
                awro.A(awzxVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awztVar = awzxVar.d;
            awrmVar = awzxVar.c;
            try {
                atqp.j(obj);
            } catch (axbd e3) {
                e = e3;
                if (e.a == awztVar) {
                    throw e;
                }
                awro.A(awzxVar.getContext());
            }
            obj2 = awrmVar.a;
            if (obj2 == axca.a) {
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object q(awzc awzcVar, awoq awoqVar) throws Throwable {
        awzy awzyVar;
        awrm awrmVar;
        axbd e;
        air airVar;
        if (awoqVar instanceof awzy) {
            awzyVar = (awzy) awoqVar;
            int i = awzyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzyVar.b = i - Integer.MIN_VALUE;
            } else {
                awzyVar = new awzy(awoqVar);
            }
        } else {
            awzyVar = new awzy(awoqVar);
        }
        Object obj = awzyVar.a;
        Object obj2 = awox.a;
        int i2 = awzyVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            awrm awrmVar2 = new awrm();
            air airVar2 = new air(awrmVar2, 5);
            try {
                awzyVar.c = awrmVar2;
                awzyVar.d = airVar2;
                awzyVar.b = 1;
                if (awzcVar.collect(airVar2, awzyVar) == obj2) {
                    return obj2;
                }
                awrmVar = awrmVar2;
            } catch (axbd e2) {
                awrmVar = awrmVar2;
                e = e2;
                airVar = airVar2;
                if (e.a == airVar) {
                    throw e;
                }
                awro.A(awzyVar.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            airVar = awzyVar.d;
            awrmVar = awzyVar.c;
            try {
                atqp.j(obj);
            } catch (axbd e3) {
                e = e3;
                if (e.a == airVar) {
                    throw e;
                }
                awro.A(awzyVar.getContext());
            }
        }
        return awrmVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(awzc awzcVar, awzd awzdVar, awoq awoqVar) throws Throwable {
        awzm awzmVar;
        Throwable th;
        awrm awrmVar;
        Throwable th2;
        awwd awwdVar;
        if (awoqVar instanceof awzm) {
            awzmVar = (awzm) awoqVar;
            int i = awzmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzmVar.b = i - Integer.MIN_VALUE;
            } else {
                awzmVar = new awzm(awoqVar);
            }
        } else {
            awzmVar = new awzm(awoqVar);
        }
        Object obj = awzmVar.a;
        Object obj2 = awox.a;
        int i2 = awzmVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awrmVar = awzmVar.c;
            try {
                atqp.j(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th2 = (Throwable) awrmVar.a;
                if (!B(th, th2)) {
                    throw th;
                }
                awwdVar = (awwd) awzmVar.getContext().get(awwd.d);
                if (awwdVar == null && awwdVar.r() && B(th, awwdVar.m())) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    avkz.d(th2, th);
                    throw th2;
                }
                avkz.d(th, th2);
                throw th;
            }
        }
        atqp.j(obj);
        awrm awrmVar2 = new awrm();
        try {
            awzd axabVar = new axab(awzdVar, awrmVar2, 1);
            awzmVar.c = awrmVar2;
            awzmVar.b = 1;
            if (awzcVar.collect(axabVar, awzmVar) != obj2) {
                return null;
            }
            return obj2;
        } catch (Throwable th4) {
            th = th4;
            awrmVar = awrmVar2;
            th2 = (Throwable) awrmVar.a;
            if (!B(th, th2)) {
                throw th;
            }
            awwdVar = (awwd) awzmVar.getContext().get(awwd.d);
            if (awwdVar == null) {
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                avkz.d(th2, th);
                throw th2;
            }
            avkz.d(th, th2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [awql] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final Object s(awzd awzdVar, awql awqlVar, Throwable th, awoq awoqVar) throws Throwable {
        awzg awzgVar;
        if (awoqVar instanceof awzg) {
            awzgVar = (awzg) awoqVar;
            int i = awzgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awzgVar.c = i - Integer.MIN_VALUE;
            } else {
                awzgVar = new awzg(awoqVar);
            }
        } else {
            awzgVar = new awzg(awoqVar);
        }
        Object obj = awzgVar.b;
        awox awoxVar = awox.a;
        int i2 = awzgVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                awzgVar.a = th;
                awzgVar.c = 1;
                Object objInvoke = awqlVar.invoke(awzdVar, th, awzgVar);
                th = th;
                if (objInvoke == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = awzgVar.a;
                atqp.j(obj);
                th = obj2;
            }
            return awmy.a;
        } catch (Throwable th2) {
            if (th != 0 && th != th2) {
                avkz.d(th2, (Throwable) th);
            }
            throw th2;
        }
    }

    public static final void t(awzd awzdVar) throws Throwable {
        if (awzdVar instanceof axbc) {
            throw ((axbc) awzdVar).a;
        }
    }

    public static final awzc u(awzc awzcVar, int i, int i2) {
        if (i < 0) {
            i = -1;
        }
        if (i == -1 && i2 != 1) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            i2 = 2;
        }
        if (i == -1) {
            i = 0;
        }
        return awzcVar instanceof axbx ? awrc.ah((axbx) awzcVar, null, i, i2, 1) : new axbk(awzcVar, i, i2);
    }

    public static final Object v(awzc awzcVar, awoq awoqVar) {
        Object objCollect = awzcVar.collect(axbz.a, awoqVar);
        return objCollect != awox.a ? awmy.a : objCollect;
    }

    public static final Object w(awzc awzcVar, awqk awqkVar, awoq awoqVar) {
        Object objV = v(u(awzu.a(awzcVar, awqkVar), 0, 1), awoqVar);
        return objV != awox.a ? awmy.a : objV;
    }

    public static final Object x(awzd awzdVar, awzc awzcVar, awoq awoqVar) throws Throwable {
        t(awzdVar);
        Object objCollect = awzcVar.collect(awzdVar, awoqVar);
        return objCollect != awox.a ? awmy.a : objCollect;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7 A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4 A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:113:0x01dc, B:115:0x01e4, B:117:0x01ea, B:119:0x01f0, B:122:0x0207, B:123:0x0211, B:124:0x0212, B:125:0x0219), top: B:164:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ea A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:113:0x01dc, B:115:0x01e4, B:117:0x01ea, B:119:0x01f0, B:122:0x0207, B:123:0x0211, B:124:0x0212, B:125:0x0219), top: B:164:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01f0 A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:113:0x01dc, B:115:0x01e4, B:117:0x01ea, B:119:0x01f0, B:122:0x0207, B:123:0x0211, B:124:0x0212, B:125:0x0219), top: B:164:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:178:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: all -> 0x0237, TryCatch #5 {all -> 0x0237, blocks: (B:26:0x0066, B:28:0x0079, B:32:0x0088, B:33:0x0090, B:35:0x0096, B:38:0x00a6, B:39:0x00aa, B:40:0x00ab), top: B:169:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[Catch: all -> 0x0237, TryCatch #5 {all -> 0x0237, blocks: (B:26:0x0066, B:28:0x0079, B:32:0x0088, B:33:0x0090, B:35:0x0096, B:38:0x00a6, B:39:0x00aa, B:40:0x00ab), top: B:169:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[Catch: all -> 0x0237, TRY_LEAVE, TryCatch #5 {all -> 0x0237, blocks: (B:26:0x0066, B:28:0x0079, B:32:0x0088, B:33:0x0090, B:35:0x0096, B:38:0x00a6, B:39:0x00aa, B:40:0x00ab), top: B:169:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:42:0x00bb, B:44:0x00c4, B:50:0x00d3, B:52:0x00e5, B:54:0x00e9, B:56:0x00f1, B:58:0x00f7, B:60:0x00fb), top: B:165:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5 A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:42:0x00bb, B:44:0x00c4, B:50:0x00d3, B:52:0x00e5, B:54:0x00e9, B:56:0x00f1, B:58:0x00f7, B:60:0x00fb), top: B:165:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #3 {all -> 0x0235, blocks: (B:42:0x00bb, B:44:0x00c4, B:50:0x00d3, B:52:0x00e5, B:54:0x00e9, B:56:0x00f1, B:58:0x00f7, B:60:0x00fb), top: B:165:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116 A[Catch: all -> 0x01bd, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x011e A[Catch: all -> 0x01bd, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013d A[Catch: all -> 0x01bd, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0143 A[Catch: all -> 0x01bd, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x01bd, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0159 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #9 {all -> 0x01bd, blocks: (B:61:0x0103, B:63:0x0110, B:65:0x0116, B:67:0x011e, B:68:0x0121, B:69:0x0125, B:71:0x012b, B:73:0x013d, B:74:0x0143, B:76:0x0147, B:77:0x014b, B:79:0x0159), top: B:176:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183 A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x018b A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0196 A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x019f A[Catch: all -> 0x01bb, TryCatch #7 {all -> 0x01bb, blocks: (B:81:0x0163, B:83:0x016c, B:87:0x0175, B:89:0x017d, B:91:0x0183, B:93:0x018b, B:97:0x0196, B:101:0x01b1, B:98:0x019f, B:99:0x01a6, B:100:0x01a7), top: B:172:0x0163 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0204 -> B:169:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object y(defpackage.awzd r22, defpackage.awyr r23, boolean r24, defpackage.awoq r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awqx.y(awzd, awyr, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z(awyp awypVar, Function0 function0, awoq awoqVar) throws Throwable {
        awyn awynVar;
        if (awoqVar instanceof awyn) {
            awynVar = (awyn) awoqVar;
            int i = awynVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awynVar.c = i - Integer.MIN_VALUE;
            } else {
                awynVar = new awyn(awoqVar);
            }
        } else {
            awynVar = new awyn(awoqVar);
        }
        Object obj = awynVar.b;
        awox awoxVar = awox.a;
        int i2 = awynVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (awynVar.getContext().get(awwd.d) != awypVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                awynVar.a = function0;
                awynVar.c = 1;
                awud awudVar = new awud(JniZero.q(awynVar), 1);
                awudVar.w();
                awypVar.s(new tio(awudVar, 2));
                if (awudVar.j() == awoxVar) {
                    function0 = function0;
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = awynVar.a;
                atqp.j(obj);
                function0 = obj2;
            }
            function0 = function0;
            function0.invoke();
            return awmy.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }
}
