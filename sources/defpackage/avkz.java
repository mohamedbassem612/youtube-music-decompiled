package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.JniZero;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avkz {
    public static final awvb A(awou awouVar) {
        awos awosVar = awouVar.get(awor.j);
        awvb awvbVar = awosVar instanceof awvb ? (awvb) awosVar : null;
        return awvbVar == null ? awuy.a : awvbVar;
    }

    private static final Object B(awxj awxjVar, awqk awqkVar) {
        awro.y(awxjVar, true, new awvm(A(awxjVar.c.getContext()).c(awxjVar.b, awxjVar, ((awtt) awxjVar).a)));
        return awrc.U(awxjVar, false, awxjVar, awqkVar);
    }

    public static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(SemanticState.Multiline, inputStream.available()));
        c(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[SemanticState.Multiline];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static final void d(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = awpp.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = awpo.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final Object e(Collection collection, awoq awoqVar) {
        if (collection.isEmpty()) {
            return awno.a;
        }
        axoz axozVar = new axoz((awuz[]) collection.toArray(new awuz[0]));
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        awuz[] awuzVarArr = (awuz[]) axozVar.b;
        int length = awuzVarArr.length;
        awtv[] awtvVarArr = new awtv[length];
        for (int i = 0; i < length; i++) {
            awuz awuzVar = awuzVarArr[i];
            awuzVar.v();
            awtv awtvVar = new awtv(axozVar, awudVar);
            awtvVar.a = awro.y(awuzVar, true, awtvVar);
            awtvVarArr[i] = awtvVar;
        }
        awtw awtwVar = new awtw(awtvVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            awtvVarArr[i2].b.c(awtwVar);
        }
        if (awudVar.h()) {
            awtwVar.a();
        } else {
            awudVar.x(awtwVar);
        }
        return awudVar.j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static final Object f(Collection collection, awoq awoqVar) throws Throwable {
        awtx awtxVar;
        ?? it;
        if (awoqVar instanceof awtx) {
            awtxVar = (awtx) awoqVar;
            int i = awtxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awtxVar.c = i - Integer.MIN_VALUE;
            } else {
                awtxVar = new awtx(awoqVar);
            }
        } else {
            awtxVar = new awtx(awoqVar);
        }
        Object obj = awtxVar.b;
        awox awoxVar = awox.a;
        int i2 = awtxVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = awtxVar.a;
            atqp.j(obj);
            it = obj2;
        }
        while (it.hasNext()) {
            awwd awwdVar = (awwd) it.next();
            awtxVar.a = it;
            awtxVar.c = 1;
            if (awwdVar.l(awtxVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    public static final awtg g(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new awth(matcher, charSequence);
        }
        return null;
    }

    public static int h(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final void i(Appendable appendable, Class cls) throws IOException {
        while (cls.isArray()) {
            appendable.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (awrc.c(cls, Void.TYPE)) {
            appendable.append("V");
            return;
        }
        if (awrc.c(cls, Integer.TYPE)) {
            appendable.append("I");
            return;
        }
        if (awrc.c(cls, Long.TYPE)) {
            appendable.append("J");
            return;
        }
        if (awrc.c(cls, Short.TYPE)) {
            appendable.append("S");
            return;
        }
        if (awrc.c(cls, Byte.TYPE)) {
            appendable.append("B");
            return;
        }
        if (awrc.c(cls, Boolean.TYPE)) {
            appendable.append("Z");
            return;
        }
        if (awrc.c(cls, Character.TYPE)) {
            appendable.append("C");
            return;
        }
        if (awrc.c(cls, Float.TYPE)) {
            appendable.append("F");
            return;
        }
        if (awrc.c(cls, Double.TYPE)) {
            appendable.append("D");
            return;
        }
        appendable.append("L");
        String name = cls.getName();
        name.getClass();
        String strReplace = name.replace('.', '/');
        strReplace.getClass();
        appendable.append(strReplace);
        appendable.append(";");
    }

    public static final Object j(avle avleVar, awoq awoqVar) {
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        avleVar.kp(new xda(awudVar, 3));
        Object objJ = awudVar.j();
        return objJ != awox.a ? awmy.a : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(avlp avlpVar, awoq awoqVar) throws Throwable {
        axes axesVar;
        if (awoqVar instanceof axes) {
            axesVar = (axes) awoqVar;
            int i = axesVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                axesVar.b = i - Integer.MIN_VALUE;
            } else {
                axesVar = new axes(awoqVar);
            }
        } else {
            axesVar = new axes(awoqVar);
        }
        Object objJ = axesVar.a;
        awox awoxVar = awox.a;
        int i2 = axesVar.b;
        if (i2 == 0) {
            atqp.j(objJ);
            axesVar.b = 1;
            awud awudVar = new awud(JniZero.q(axesVar), 1);
            awudVar.w();
            avlpVar.F(new avys(awudVar, 2));
            objJ = awudVar.j();
            if (objJ == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objJ);
        }
        if (objJ != null) {
            return objJ;
        }
        throw new NoSuchElementException();
    }

    public static final void l(awuc awucVar, avmn avmnVar) {
        awucVar.b(new awnf(avmnVar, 5));
    }

    public static final void m(awou awouVar, Throwable th) {
        Iterator it = axcx.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(awouVar, th);
            } catch (axdc unused) {
                return;
            } catch (Throwable th2) {
                axcx.a(awrc.P(th, th2));
            }
        }
        try {
            d(th, new axcz(awouVar));
        } catch (Throwable unused2) {
        }
        axcx.a(th);
    }

    public static final Object n(awou awouVar, Object obj, Object obj2, awqk awqkVar, awoq awoqVar) {
        Object objInvoke;
        Object objB = axea.b(awouVar, obj2);
        try {
            axcf axcfVar = new axcf(awoqVar, awouVar);
            if (awqkVar instanceof awpe) {
                awro.c(awqkVar, 2);
                objInvoke = awqkVar.invoke(obj, axcfVar);
            } else {
                objInvoke = JniZero.n(awqkVar, obj, axcfVar);
            }
            axea.c(awouVar, objB);
            if (objInvoke == awox.a) {
                awoqVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            axea.c(awouVar, objB);
            throw th;
        }
    }

    public static /* synthetic */ int o(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final Object p(long j, awqk awqkVar, awoq awoqVar) {
        if (j > 0) {
            return B(new awxj(j, awoqVar), awqkVar);
        }
        throw new awxi("Timed out immediately", null);
    }

    public static final Object q(long j, awqk awqkVar, awoq awoqVar) {
        return p(w(j), awqkVar, awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(long j, awqk awqkVar, awoq awoqVar) throws Throwable {
        awxk awxkVar;
        awxi e;
        awrm awrmVar;
        if (awoqVar instanceof awxk) {
            awxkVar = (awxk) awoqVar;
            int i = awxkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awxkVar.b = i - Integer.MIN_VALUE;
            } else {
                awxkVar = new awxk(awoqVar);
            }
        } else {
            awxkVar = new awxk(awoqVar);
        }
        Object obj = awxkVar.a;
        awox awoxVar = awox.a;
        int i2 = awxkVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            if (j > 0) {
                awrm awrmVar2 = new awrm();
                try {
                    awxkVar.c = awrmVar2;
                    awxkVar.b = 1;
                    awxj awxjVar = new awxj(j, awxkVar);
                    awrmVar2.a = awxjVar;
                    Object objB = B(awxjVar, awqkVar);
                    return objB == awoxVar ? awoxVar : objB;
                } catch (awxi e2) {
                    e = e2;
                    awrmVar = awrmVar2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awrmVar = awxkVar.c;
        try {
            atqp.j(obj);
            return obj;
        } catch (awxi e3) {
            e = e3;
        }
        if (e.a != awrmVar.a) {
            throw e;
        }
        return null;
    }

    public static final Object s(long j, awqk awqkVar, awoq awoqVar) {
        return r(w(j), awqkVar, awoqVar);
    }

    public static awph t(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return new awwz(i, list);
    }

    public static boolean u(StackTraceElement stackTraceElement) {
        return awrc.n(stackTraceElement.getMethodName(), "runBlocking", false) && awrc.n(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt", false);
    }

    public static final CancellationException v(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final long w(long j) {
        int i = awtl.b;
        if (j > 0) {
            return awtl.b(awtl.f(j, awrc.j(999999L, awtn.NANOSECONDS)));
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(awoq awoqVar) throws Throwable {
        awvc awvcVar;
        if (awoqVar instanceof awvc) {
            awvcVar = (awvc) awoqVar;
            int i = awvcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awvcVar.b = i - Integer.MIN_VALUE;
            } else {
                awvcVar = new awvc(awoqVar);
            }
        } else {
            awvcVar = new awvc(awoqVar);
        }
        Object obj = awvcVar.a;
        awox awoxVar = awox.a;
        int i2 = awvcVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            awvcVar.b = 1;
            awud awudVar = new awud(JniZero.q(awvcVar), 1);
            awudVar.w();
            if (awudVar.j() == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        throw new awmh();
    }

    public static final Object y(long j, awoq awoqVar) {
        if (j > 0) {
            awud awudVar = new awud(JniZero.q(awoqVar), 1);
            awudVar.w();
            if (j < Long.MAX_VALUE) {
                A(awudVar.b).d(j, awudVar);
            }
            Object objJ = awudVar.j();
            if (objJ == awox.a) {
                return objJ;
            }
        }
        return awmy.a;
    }

    public static final Object z(long j, awoq awoqVar) {
        Object objY = y(w(j), awoqVar);
        return objY != awox.a ? awmy.a : objY;
    }
}
