package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkh {
    public static final Throwable a = new awkg();

    public static Exception a(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static RuntimeException b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    public static String c(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + ' ' + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static Throwable d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static boolean e(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
        } while (!a.av(atomicReference, th2, th2 == null ? th : new avmw(th2, th)));
        return true;
    }
}
