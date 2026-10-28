package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 pqk[], still in use, count: 1, list:
  (r6v1 pqk[]) from 0x0029: INVOKE (r6v1 pqk[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m), WRAPPED] (LINE:42)
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
public final class pqk {
    CHIME(1),
    GNP(2),
    NONE(3);

    public static final /* synthetic */ awpl d;
    public final int e;

    static {
        d = JniZero.m(pqkVarArr);
    }

    private pqk(int i) {
        super(str, i);
        this.e = i;
    }

    public static pqk[] values() {
        return (pqk[]) f.clone();
    }
}
