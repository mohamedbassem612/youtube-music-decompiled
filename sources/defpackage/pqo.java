package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 pqo[], still in use, count: 1, list:
  (r9v2 pqo[]) from 0x0041: INVOKE (r9v2 pqo[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m), WRAPPED] (LINE:66)
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
public final class pqo {
    UNKNOWN(0),
    SIGNED_IN(1),
    SIGNED_OUT_ZWIEBACK(2),
    SIGNED_OUT_YOUTUBE_VISITOR(3),
    SIGNED_IN_FITBIT(4);

    public static final /* synthetic */ awpl f;
    public final int g;

    static {
        f = JniZero.m(pqoVarArr);
    }

    private pqo(int i) {
        super(str, i);
        this.g = i;
    }

    public static pqo[] values() {
        return (pqo[]) h.clone();
    }
}
