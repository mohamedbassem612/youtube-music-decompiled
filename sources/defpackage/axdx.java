package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axdx {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object objI;
        Object objI2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objI = Class.forName("awpe").getCanonicalName();
        } catch (Throwable th) {
            objI = atqp.i(th);
        }
        if (awmn.a(objI) != null) {
            objI = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objI;
        try {
            objI2 = Class.forName("axdx").getCanonicalName();
        } catch (Throwable th2) {
            objI2 = atqp.i(th2);
        }
        if (awmn.a(objI2) != null) {
            objI2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objI2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    public static final Throwable a(Throwable th, awph awphVar) {
        awml awmlVar;
        boolean z = axcn.a;
        int i = 0;
        if (axcn.a) {
            th.getClass();
            awphVar.getClass();
            if (th instanceof CancellationException) {
                return th;
            }
            axcj axcjVar = new axcj(awqx.g(awqx.h(awqx.f(awphVar, new awrf() { // from class: axcl
                @Override // defpackage.awrf
                public final Object a(Object obj) {
                    return ((awph) obj).getCallerFrame();
                }
            }), axcm.a)));
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            while (i < suppressed.length) {
                Throwable th2 = suppressed[i];
                if (th2 instanceof axcj) {
                    List list = axcjVar.a;
                    List list2 = ((axcj) th2).a;
                    if (list.size() <= list2.size() && awrc.c(list, list2.subList(list2.size() - list.size(), list2.size()))) {
                        return th;
                    }
                }
                i++;
            }
            avkz.d(th, axcjVar);
            return th;
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            awmlVar = new awml(th, new StackTraceElement[0]);
        } else if (awrc.c(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    awmlVar = new awml(th, new StackTraceElement[0]);
                    break;
                }
                if (d(stackTrace[i2])) {
                    awmlVar = new awml(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            awmlVar = new awml(th, new StackTraceElement[0]);
        }
        Object obj = awmlVar.b;
        Throwable th3 = (Throwable) awmlVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        Throwable thA = axdi.a(th3);
        if (thA == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = awphVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (true != (awphVar instanceof awph)) {
                awphVar = null;
            }
            if (awphVar == null || (awphVar = awphVar.getCallerFrame()) == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = awphVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th3 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                }
                if (d(stackTraceElementArr[i3])) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    StackTraceElement stackTraceElement3 = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && awrc.c(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && awrc.c(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && awrc.c(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3--;
                }
            }
        }
        arrayDeque.addFirst(a);
        StackTraceElement[] stackTrace2 = th3.getStackTrace();
        int iE = e(stackTrace2, b);
        if (iE == -1) {
            thA.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + iE];
            for (int i5 = 0; i5 < iE; i5++) {
                stackTraceElementArr2[i5] = stackTrace2[i5];
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + iE] = (StackTraceElement) it.next();
                i++;
            }
            thA.setStackTrace(stackTraceElementArr2);
        }
        return thA;
    }

    public static final Throwable b(Throwable th) {
        Throwable thA;
        boolean z = axcn.a;
        if (axcn.a || !awuv.b || (thA = axdi.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i < 0) {
            i = -1;
            break;
        }
        while (true) {
            int i2 = i - 1;
            if (!awrc.c(c, stackTrace[i].getClassName())) {
                if (i2 < 0) {
                    i = -1;
                    break;
                }
                i = i2;
            } else {
                break;
            }
        }
        int iE = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (iE == -1 ? 0 : length - iE);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null) {
            return th;
        }
        if (!awrc.c(cause.getClass(), th.getClass())) {
            return th;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (d(stackTraceElement)) {
                return cause;
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return awrc.n(stackTraceElement.getClassName(), "_COROUTINE", false);
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (awrc.c(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
