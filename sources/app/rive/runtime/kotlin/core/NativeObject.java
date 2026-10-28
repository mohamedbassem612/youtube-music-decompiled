package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import defpackage.a;
import defpackage.atqq;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awso;
import defpackage.awsu;
import defpackage.awsx;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeObject implements RefCount {
    public static final long NULL_POINTER = 0;
    private final List dependencies;
    private awsx disposeStackTrace;
    private AtomicInteger refs;
    private final AtomicLong unsafeCppPointer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public NativeObject(long j) {
        this.unsafeCppPointer = new AtomicLong(j);
        this.refs = new AtomicInteger(j == 0 ? 0 : 1);
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.dependencies = listSynchronizedList;
    }

    private final List buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        awsx awsxVar = this.disposeStackTrace;
        if (awsxVar != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", "", null, -1));
            atqq.aB(arrayList, awsxVar);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", "", null, -1));
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        atqq.aB(arrayList, new awso(new awsu(atqq.aT(stackTrace), new awqg() { // from class: app.rive.runtime.kotlin.core.NativeObject$$ExternalSyntheticLambda1
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NativeObject.buildCombinedStackTrace$lambda$1((StackTraceElement) obj));
            }
        }, 1)));
        return arrayList;
    }

    static final boolean buildCombinedStackTrace$lambda$1(StackTraceElement stackTraceElement) {
        return !awrc.c(stackTraceElement.getClassName(), NativeObject.class.getName());
    }

    private final synchronized void dispose() {
        if (this.refs.get() != 0) {
            throw new IllegalArgumentException("Cannot dispose an object with a non-zero reference count.");
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        this.disposeStackTrace = new awsu(atqq.aT(stackTrace), new awqg() { // from class: app.rive.runtime.kotlin.core.NativeObject$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NativeObject.dispose$lambda$1((StackTraceElement) obj));
            }
        }, 1);
        List list = this.dependencies;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        list.clear();
        cppDelete(this.unsafeCppPointer.get());
        this.unsafeCppPointer.set(0L);
    }

    static final boolean dispose$lambda$1(StackTraceElement stackTraceElement) {
        return !awrc.c(stackTraceElement.getClassName(), NativeObject.class.getName());
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() {
        int iIncrementAndGet;
        iIncrementAndGet = getRefs().incrementAndGet();
        if (iIncrementAndGet <= 1) {
            throw new IllegalArgumentException("Cannot acquire a disposed object.");
        }
        return iIncrementAndGet;
    }

    public final long getCppPointer() throws RiveException {
        long j = this.unsafeCppPointer.get();
        if (j != 0) {
            return j;
        }
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        RiveException riveException = new RiveException(a.bU((byte) 46, simpleName, "Accessing disposed C++ object "));
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }

    public final List getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        return this.unsafeCppPointer.get() != 0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public /* synthetic */ int getRefCount() {
        return getRefs().get();
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int release() {
        int iDecrementAndGet = getRefs().decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalArgumentException("Cannot release a disposed object.");
        }
        if (iDecrementAndGet != 0 || !getHasCppObject()) {
            return iDecrementAndGet;
        }
        dispose();
        return 0;
    }

    public final void setCppPointer(long j) {
        this.unsafeCppPointer.set(j);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final void setRefs(AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.refs = atomicInteger;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public void cppDelete(long j) {
    }
}
