package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aggc implements Runnable {
    private static final Logger a = Logger.getLogger(aggc.class.getName());
    private static final Constructor b;
    private static final Field c;
    private final WeakReference d;
    private final PhantomReference e;
    private final ReferenceQueue f;

    static {
        Constructor constructor;
        Field field = null;
        try {
            constructor = Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            constructor = null;
        }
        b = constructor;
        if (constructor == null) {
            String property = System.getProperty("java.runtime.name", "");
            property.getClass();
            if (!property.contains("Android")) {
                try {
                    Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Throwable unused2) {
                    a.logp(Level.INFO, "com.google.common.base.internal.Finalizer", "getInheritableThreadLocalsField", "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
                }
            }
        }
        c = field;
    }

    private aggc(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.f = referenceQueue;
        this.d = new WeakReference(cls);
        this.e = phantomReference;
    }

    private final boolean a(Reference reference, Method method) {
        reference.clear();
        if (reference == this.e) {
            return false;
        }
        try {
            method.invoke(reference, null);
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "com.google.common.base.internal.Finalizer", "finalizeReference", "Error cleaning up after reference.", th);
        }
        return true;
    }

    public static void startFinalizer(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        Thread thread;
        aggc aggcVar = new aggc(cls, referenceQueue, phantomReference);
        Constructor constructor = b;
        if (constructor != null) {
            try {
                thread = (Thread) constructor.newInstance(null, aggcVar, "com.google.common.base.internal.Finalizer", 0L, Boolean.FALSE);
            } catch (Throwable th) {
                a.logp(Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, aggcVar, "com.google.common.base.internal.Finalizer");
        }
        thread.setDaemon(true);
        try {
            Field field = c;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th2) {
            a.logp(Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Reference referencePoll;
        while (true) {
            try {
                Reference referenceRemove = this.f.remove();
                Class cls = (Class) this.d.get();
                Method method = null;
                if (cls != null) {
                    try {
                        method = cls.getMethod("finalizeReferent", null);
                    } catch (NoSuchMethodException e) {
                        throw new AssertionError(e);
                    }
                }
                if (method == null || !a(referenceRemove, method)) {
                    return;
                }
                do {
                    referencePoll = this.f.poll();
                    if (referencePoll == null) {
                        continue;
                    }
                } while (a(referencePoll, method));
                return;
            } catch (InterruptedException unused) {
            }
        }
    }
}
