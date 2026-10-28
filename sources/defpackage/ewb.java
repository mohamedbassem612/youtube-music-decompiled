package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewb extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private ett c;
    private Class d;
    private String e;
    private int f;

    public ewb(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void c(Throwable th, List list) {
        if (th instanceof ewb) {
            Iterator it = ((ewb) th).b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        ewa ewaVar = new ewa(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                ewaVar.append("Cause (");
                int i2 = i + 1;
                ewaVar.append(String.valueOf(i2));
                ewaVar.append(" of ");
                ewaVar.append(String.valueOf(size));
                ewaVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof ewb) {
                    ((ewb) th).e(ewaVar);
                } else {
                    d(th, ewaVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(ett ettVar, int i, Class cls) {
        this.c = ettVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(ept.h(i)) : "");
        ett ettVar = this.c;
        sb.append(ettVar != null ? ", ".concat(ettVar.toString()) : "");
        List<Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public ewb(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
