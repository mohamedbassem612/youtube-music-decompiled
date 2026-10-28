package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 pya[], still in use, count: 1, list:
  (r4v1 pya[]) from 0x001d: INVOKE (r4v1 pya[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:30)
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
public final class pya {
    SYSTEM_TRAY(1),
    IN_APP(2);

    public final int c;

    static {
        JniZero.m(pyaVarArr);
    }

    private pya(int i) {
        super(str, i);
        this.c = i;
    }

    public static pya[] values() {
        return (pya[]) d.clone();
    }
}
