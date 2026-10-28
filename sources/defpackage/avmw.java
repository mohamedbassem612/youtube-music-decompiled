package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avmw extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    public final List a;
    private final String b;
    private Throwable c;

    public avmw(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof avmw) {
                    linkedHashSet.addAll(((avmw) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        this.a = listUnmodifiableList;
        this.b = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    private final void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private final void b(avmt avmtVar) {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        avmtVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            avms avmsVar = new avms();
            HashSet hashSet = new HashSet();
            avms avmsVar2 = avmsVar;
            for (Throwable runtimeException : this.a) {
                if (!hashSet.contains(runtimeException)) {
                    hashSet.add(runtimeException);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = runtimeException.getCause();
                    if (cause != null && cause != runtimeException) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th : arrayList) {
                        if (hashSet.contains(th)) {
                            runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        avmsVar2.initCause(runtimeException);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = avmsVar2.getCause();
                    if (cause3 != null && avmsVar2 != cause3) {
                        do {
                            avmsVar2 = cause3;
                            cause3 = avmsVar2.getCause();
                            if (cause3 == null) {
                                break;
                            }
                        } while (cause3 != avmsVar2);
                    }
                }
            }
            this.c = avmsVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new avmu(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new avmv(printWriter));
    }

    public avmw(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
