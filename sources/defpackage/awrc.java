package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awrc {
    private awrc() {
    }

    public static /* synthetic */ int A(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static String B(String str) throws IOException {
        awsu awsuVar = new awsu(new awta(str, 2), new awnf(2), 2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        awtc awtcVar = new awtc(awsuVar);
        int i = 0;
        while (awtcVar.hasNext()) {
            Object next = awtcVar.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            k(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String C(String str, String str2, String str3) {
        int iP = p(str, str2, 0, false);
        if (iP < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, iP);
            sb.append(str3);
            i = iP + length;
            if (iP >= str.length()) {
                break;
            }
            iP = p(str, str2, i, false);
        } while (iP > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String D(String str) {
        int length;
        List listG = awqx.g(new awta(str, 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (!v((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!awqx.a(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) atqq.V(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listG.size();
        awqg awqgVarAi = ai();
        int size = listG.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listG) {
            int i = length + 1;
            if (length < 0) {
                atqq.M();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && v(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.bP(iIntValue, "Requested character count ", " is less than zero."));
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                String strSubstring = str3.substring(length4);
                strSubstring.getClass();
                String str4 = (String) awqgVarAi.invoke(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        atqq.aC(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static List E(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        return aj(charSequence, String.valueOf(cArr[0]));
    }

    public static List F(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        String str = strArr[0];
        if (str.length() > 0) {
            return aj(charSequence, str);
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        awtb<awsa> awtbVar = new awtb(new awsu(charSequence, new acfc(listAsList, 6), 3), 0);
        ArrayList arrayList = new ArrayList(atqq.N(awtbVar, 10));
        for (awsa awsaVar : awtbVar) {
            awsaVar.getClass();
            arrayList.add(charSequence.subSequence(awsaVar.d().intValue(), awsaVar.c().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static Integer G(String str) {
        boolean z;
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = -2147483647;
        if (cCharAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i3 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 != -59652323) {
                    return null;
                }
                i4 = -214748364;
                if (i2 < -214748364) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            if (i5 < i3 + iDigit) {
                return null;
            }
            i2 = i5 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    public static String H(String str) {
        String str2;
        if (v("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listG = awqx.g(new awta(str, 2));
        listG.size();
        awqg awqgVarAi = ai();
        int size = listG.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == size) && v(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!awqx.a(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    str3.getClass();
                    if (str3.startsWith("|", i3)) {
                        str3.getClass();
                        strSubstring = str3.substring(i3 + 1);
                        strSubstring.getClass();
                    }
                }
                if (strSubstring != null && (str2 = (String) awqgVarAi.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        atqq.aC(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static void I(int i, awqk awqkVar, Object obj, awoq awoqVar) throws Throwable {
        Object objInvoke;
        int i2 = i - 1;
        if (i2 == 0) {
            X(awqkVar, obj, awoqVar);
            return;
        }
        if (i2 == 2) {
            JniZero.q(JniZero.p(awqkVar, obj, awoqVar)).resumeWith(awmy.a);
            return;
        }
        if (i2 == 3) {
            try {
                awou context = awoqVar.getContext();
                Object objB = axea.b(context, null);
                try {
                    if (awqkVar instanceof awpe) {
                        awro.c(awqkVar, 2);
                        objInvoke = awqkVar.invoke(obj, awoqVar);
                    } else {
                        objInvoke = JniZero.n(awqkVar, obj, awoqVar);
                    }
                    axea.c(context, objB);
                    if (objInvoke != awox.a) {
                        awoqVar.resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    axea.c(context, objB);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof awve) {
                    th = ((awve) th).a;
                }
                th.getClass();
                awoqVar.resumeWith(new awmm(th));
            }
        }
    }

    public static final Object J(awqk awqkVar, awoq awoqVar) throws Throwable {
        axdv axdvVar = new axdv(awoqVar.getContext(), awoqVar);
        Object objU = U(axdvVar, true, axdvVar, awqkVar);
        if (objU == awox.a) {
            awoqVar.getClass();
        }
        return objU;
    }

    public static final awut K(awou awouVar) {
        if (awouVar.get(awwd.d) == null) {
            awouVar = awouVar.plus(new awwf(null));
        }
        return new axcw(awouVar, 0);
    }

    public static final awut L(awut awutVar, awou awouVar) {
        return new axcw(awutVar.b().plus(awouVar), 0);
    }

    public static final void M(awut awutVar) {
        awro.A(awutVar.b());
    }

    public static final boolean N(awut awutVar) {
        awwd awwdVar = (awwd) awutVar.b().get(awwd.d);
        if (awwdVar != null) {
            return awwdVar.q();
        }
        return true;
    }

    public static final void O(awut awutVar) {
        awwd awwdVar = (awwd) ((axcw) awutVar).a.get(awwd.d);
        if (awwdVar != null) {
            awwdVar.p(null);
        } else {
            Objects.toString(awutVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(awutVar.toString()));
        }
    }

    public static final Throwable P(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        avkz.d(runtimeException, th);
        return runtimeException;
    }

    public static final void Q(awou awouVar, Throwable th) {
        if (th instanceof awve) {
            th = ((awve) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) awouVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(awouVar, th);
            } else {
                avkz.m(awouVar, th);
            }
        } catch (Throwable th2) {
            avkz.m(awouVar, P(th, th2));
        }
    }

    public static final Object R(Object obj, awoq awoqVar) {
        if (!(obj instanceof awum)) {
            return obj;
        }
        Throwable thA = ((awum) obj).b;
        if (awuv.b && (awoqVar instanceof awph)) {
            thA = axdx.a(thA, (awph) awoqVar);
        }
        thA.getClass();
        return new awmm(thA);
    }

    public static final Object S(Object obj) {
        Throwable thA = awmn.a(obj);
        return thA != null ? new awum(thA, false) : obj;
    }

    public static /* synthetic */ int T(Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof awuc) {
            return 0;
        }
        return obj instanceof axfe ? 1 : -2;
    }

    public static final Object U(axdv axdvVar, boolean z, Object obj, awqk awqkVar) throws Throwable {
        Object awumVar;
        Object objKG;
        try {
            if (awqkVar instanceof awpe) {
                awro.c(awqkVar, 2);
                awumVar = awqkVar.invoke(obj, axdvVar);
            } else {
                awumVar = JniZero.n(awqkVar, obj, axdvVar);
            }
        } catch (awve e) {
            Throwable th = e.a;
            axdvVar.L(new awum(th, false));
            awoq awoqVar = axdvVar.c;
            if (awuv.b && (awoqVar instanceof awph)) {
                throw axdx.a(th, (awph) awoqVar);
            }
            throw th;
        } catch (Throwable th2) {
            awumVar = new awum(th2, false);
        }
        awox awoxVar = awox.a;
        if (awumVar == awoxVar || (objKG = axdvVar.kG(awumVar)) == awwl.c) {
            return awoxVar;
        }
        axdvVar.c();
        if (objKG instanceof awum) {
            if (!z) {
                Throwable th3 = ((awum) objKG).b;
                if ((th3 instanceof awxi) && ((awxi) th3).a == axdvVar) {
                    if (awumVar instanceof awum) {
                        Throwable th4 = ((awum) awumVar).b;
                        awoq awoqVar2 = axdvVar.c;
                        if (awuv.b && (awoqVar2 instanceof awph)) {
                            throw axdx.a(th4, (awph) awoqVar2);
                        }
                        throw th4;
                    }
                }
            }
            Throwable th5 = ((awum) objKG).b;
            awoq awoqVar3 = axdvVar.c;
            if (awuv.b && (awoqVar3 instanceof awph)) {
                throw axdx.a(th5, (awph) awoqVar3);
            }
            throw th5;
        }
        awumVar = awwl.b(objKG);
        return awumVar;
    }

    public static final void V(awoq awoqVar, Throwable th) throws Throwable {
        if (th instanceof awve) {
            th = ((awve) th).a;
        }
        awoqVar.resumeWith(atqp.i(th));
        throw th;
    }

    public static final void W(awoq awoqVar, awoq awoqVar2) throws Throwable {
        try {
            axdb.a(JniZero.q(awoqVar), awmy.a);
        } catch (Throwable th) {
            V(awoqVar2, th);
        }
    }

    public static final void X(awqk awqkVar, Object obj, awoq awoqVar) throws Throwable {
        try {
            axdb.a(JniZero.q(JniZero.p(awqkVar, obj, awoqVar)), awmy.a);
        } catch (Throwable th) {
            V(awoqVar, th);
        }
    }

    public static final boolean Y(String str, boolean z) {
        String property;
        int i = axdz.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property != null ? Boolean.parseBoolean(property) : z;
    }

    public static final int Z(String str, int i, int i2) {
        return (int) aa(str, i, i2);
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c A[PHI: r15
      0x005c: PHI (r15v2 long) = (r15v1 long), (r15v3 long) binds: [B:26:0x004d, B:30:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[LOOP:0: B:22:0x003d->B:34:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0067 A[SYNTHETIC] */
    public static final long aa(String str, long j, long j2) {
        String property;
        Long lValueOf;
        int i;
        long j3;
        long j4;
        int i2 = axdz.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        int length = property.length();
        if (length == 0) {
            lValueOf = null;
            break;
        }
        boolean z = false;
        char cCharAt = property.charAt(0);
        long j5 = -9223372036854775807L;
        if (cCharAt < '0') {
            i = 1;
            if (length != 1) {
                if (cCharAt != '+') {
                    if (cCharAt == '-') {
                        j5 = Long.MIN_VALUE;
                        z = true;
                    }
                }
            }
            lValueOf = null;
            break;
        }
        i = 0;
        long j6 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (true) {
            if (i >= length) {
                if (!z) {
                    lValueOf = Long.valueOf(-j7);
                    break;
                }
                lValueOf = Long.valueOf(j7);
                break;
            }
            int iDigit = Character.digit((int) property.charAt(i), 10);
            if (iDigit >= 0) {
                if (j7 >= j8) {
                    j3 = j7 * 10;
                    j4 = iDigit;
                    if (j3 < j5 + j4) {
                        j7 = j3 - j4;
                        i++;
                        j6 = -256204778801521550L;
                    }
                } else if (j8 == j6) {
                    j8 = -922337203685477580L;
                    if (j7 >= -922337203685477580L) {
                        j3 = j7 * 10;
                        j4 = iDigit;
                        if (j3 < j5 + j4) {
                            j7 = j3 - j4;
                            i++;
                            j6 = -256204778801521550L;
                        }
                    }
                }
            }
            lValueOf = null;
            break;
        }
        if (lValueOf == null) {
            throw new IllegalStateException(a.ch((byte) 39, property, str, "System property '", "' has unrecognized value '"));
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue >= 1 && jLongValue <= j2) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range 1.." + j2 + ", but is '" + jLongValue + '\'');
    }

    public static final void ab(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bR(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final ListenableFuture ac(awuz awuzVar) {
        axcp axcpVar = new axcp(awuzVar);
        awuzVar.kJ(new acjo(axcpVar, awuzVar, 13));
        return axcpVar;
    }

    public static final Object ad(ListenableFuture listenableFuture, awoq awoqVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return a.i(listenableFuture);
            }
            awud awudVar = new awud(JniZero.q(awoqVar), 1);
            awudVar.w();
            listenableFuture.addListener(new eft(listenableFuture, awudVar, 2), MoreExecutors.directExecutor());
            awudVar.b(new tio(listenableFuture, 3));
            return awudVar.j();
        } catch (ExecutionException e) {
            throw ae(e);
        }
    }

    public static final Throwable ae(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static final ListenableFuture ag(awut awutVar, awou awouVar, awqk awqkVar) throws Throwable {
        axcq axcqVar = new axcq(awup.b(awutVar, awouVar));
        I(1, awqkVar, axcqVar, axcqVar);
        return axcqVar.b;
    }

    public static /* synthetic */ awzc ah(axbx axbxVar, awou awouVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            awouVar = awov.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return axbxVar.kK(awouVar, i, i2);
    }

    private static awqg ai() {
        return "".length() == 0 ? new xzn(15) : new awnf(3, (byte[]) null);
    }

    private static List aj(CharSequence charSequence, String str) {
        int iP = p(charSequence, str, 0, false);
        if (iP == -1) {
            List listSingletonList = Collections.singletonList(charSequence);
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iP).toString());
            length = str.length() + iP;
            iP = p(charSequence, str, length, false);
        } while (iP != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static void b(String str) {
        awmx awmxVar = new awmx(a.bT(str, "lateinit property ", " has not been initialized"));
        d(awmxVar, awrc.class.getName());
        throw awmxVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    static void d(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void e() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final Object f(Optional optional) {
        optional.getClass();
        return optional.orElse(null);
    }

    public static final long g(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : awro.j(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if (j2 > -4611686018427387903L) {
            if (j2 < 4611686018427387903L) {
                return j;
            }
            j2 = 4611686018427387903L;
        }
        if ((j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long h(long j) {
        int i = awtl.b;
        int i2 = awtm.a;
        return (j << 1) + 1;
    }

    public static final long i(int i, awtn awtnVar) {
        long j = i;
        if (awtnVar.compareTo(awtn.SECONDS) > 0) {
            return j(j, awtnVar);
        }
        long jConvert = awtn.NANOSECONDS.h.convert(j, awtnVar.h) << 1;
        int i2 = awtl.b;
        int i3 = awtm.a;
        return jConvert;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[PHI: r8
      0x00a3: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:31:0x007a, B:43:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long j(long j, awtn awtnVar) {
        long j2;
        TimeUnit timeUnit = awtn.NANOSECONDS.h;
        TimeUnit timeUnit2 = awtnVar.h;
        long jConvert = timeUnit2.convert(4611686018426999999L, timeUnit);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit.convert(j, timeUnit2) << 1;
            int i = awtl.b;
            int i2 = awtm.a;
            return jConvert2;
        }
        awtn awtnVar2 = awtn.MILLISECONDS;
        if (awtnVar.compareTo(awtnVar2) < 0) {
            long j3 = (awro.j(awtnVar2.h.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
            int i3 = awtl.b;
            int i4 = awtm.a;
            return j3;
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = awtnVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                Objects.toString(awtnVar);
                throw new IllegalStateException("Wrong unit for millisMultiplier: ".concat(awtnVar.toString()));
            }
            j2 = 86400000;
        }
        long j4 = 0;
        if (jAbs == 0) {
            j2 = j4;
            j4 = j2;
        } else if (jAbs != 1) {
            j4 = 4611686018427387903L;
            if (j2 == 1) {
                if (jAbs > 4611686018427387903L) {
                    jAbs = 4611686018427387903L;
                }
                j2 = jAbs;
            } else {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    j2 *= jAbs;
                } else if (iNumberOfLeadingZeros > 63) {
                    j2 = j4;
                } else {
                    long j5 = jAbs * j2;
                    if (j5 <= 4611686018427387903L) {
                        j4 = j5;
                    }
                }
            }
            j4 = j2;
        } else {
            j4 = j2;
        }
        long j6 = ((jSignum * j4) << 1) + 1;
        int i5 = awtl.b;
        int i6 = awtm.a;
        return j6;
    }

    public static final void k(Appendable appendable, Object obj, awqg awqgVar) throws IOException {
        if (awqgVar != null) {
            appendable.append((CharSequence) awqgVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static boolean l(String str, String str2, boolean z) {
        if (!z) {
            return str.endsWith(str2);
        }
        return m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean m(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean n(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : m(str, 0, str2, 0, str2.length(), true);
    }

    public static int o(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int p(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        awsa awsaVar = new awsa(i2, length);
        boolean z2 = charSequence instanceof String;
        int i3 = awsaVar.a;
        if (z2) {
            int i4 = awsaVar.b;
            if (i3 <= i4) {
                int i5 = i3;
                while (!m(str, 0, (String) charSequence, i5, str.length(), z)) {
                    if (i5 != i4) {
                        i5++;
                    }
                }
                return i5;
            }
        } else {
            int i6 = awsaVar.b;
            if (i3 <= i6) {
                int i7 = i3;
                while (!w(str, 0, charSequence, i7, str.length(), z)) {
                    if (i7 != i6) {
                        i7++;
                    }
                }
                return i7;
            }
        }
        return -1;
    }

    public static CharSequence q(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA = awqx.a(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String r(String str, CharSequence charSequence) {
        str.getClass();
        if (!n(str, (String) charSequence, false)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String s(String str, String str2, String str3) {
        int iP = p(str, str2, 0, false);
        if (iP == -1) {
            return str3;
        }
        String strSubstring = str.substring(iP + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String t(String str, char c, String str2) {
        int iA = A(str, c, 0, 6);
        if (iA == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        return p(charSequence, (String) charSequence2, 0, z) >= 0;
    }

    public static boolean v(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!awqx.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!awqx.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String x(String str, int i) {
        str.getClass();
        String strSubstring = str.substring(0, awro.g(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static boolean y(CharSequence charSequence, char c) {
        return ((String) charSequence).indexOf(c, 0) >= 0;
    }

    public static boolean z(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }
}
