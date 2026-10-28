package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mcd extends Exception {
    public mcd(Thread thread) {
        Throwable mccVar;
        Object blocker = LockSupport.getBlocker(thread);
        Thread.State state = thread.getState();
        String strValueOf = String.valueOf(thread);
        String strConcat = state == null ? "" : " in state ".concat(state.toString());
        String strConcat2 = blocker == null ? "" : " blocked on ".concat(blocker.toString());
        Thread threadA = a(blocker);
        StringBuilder sb = new StringBuilder();
        sb.append(strValueOf);
        sb.append(strConcat);
        sb.append(strConcat2);
        sb.append(threadA != null ? " (see cause for owner state)" : "");
        String string = sb.toString();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread threadA2 = a(LockSupport.getBlocker(thread));
        if (threadA2 != null) {
            String name = threadA2.getName();
            mccVar = name.startsWith("Lite") ? new mcc(threadA2) : name.startsWith("BG") ? new mca(threadA2) : name.startsWith("Blocking") ? new mcb(threadA2) : new mcd(threadA2);
        } else {
            mccVar = null;
        }
        super(string);
        if (mccVar != null) {
            initCause(mccVar);
        }
        setStackTrace(stackTrace);
    }

    static Thread a(Object obj) {
        if (!(obj instanceof AbstractOwnableSynchronizer)) {
            return null;
        }
        try {
            Method declaredMethod = AbstractOwnableSynchronizer.class.getDeclaredMethod("getExclusiveOwnerThread", null);
            declaredMethod.setAccessible(true);
            return (Thread) declaredMethod.invoke(obj, null);
        } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
