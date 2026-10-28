package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.concurrent.Executor;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 dyu[], still in use, count: 1, list:
  (r1v1 dyu[]) from 0x000f: INVOKE (r1v1 dyu[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:16)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyu implements Executor {
    INSTANCE;

    static {
        JniZero.m(dyuVarArr);
    }

    private dyu() {
        super("INSTANCE", 0);
    }

    public static dyu[] values() {
        return (dyu[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
