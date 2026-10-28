package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 xyw[], still in use, count: 1, list:
  (r3v5 xyw[]) from 0x0121: INVOKE (r3v5 xyw[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:290)
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
/* JADX INFO: loaded from: classes4.dex */
public final class xyw {
    AD_UNSTARTED(1080, true, false, false, null),
    AD_PLAYING(1081, true, true, false, null),
    AD_SKIPPED(1082, true, false, false, null),
    AD_ENDED(1083, true, false, false, null),
    AD_PAUSED(1084, true, false, false, null),
    AD_BUFFERING(1085, true, false, false, null),
    UNSTARTED(-1, false, false, false, AD_UNSTARTED),
    ENDED(0, false, false, false, AD_ENDED),
    PLAYING(1, false, true, true, AD_PLAYING),
    PAUSED(2, false, false, true, AD_PAUSED),
    BUFFERING(3, false, false, true, AD_BUFFERING),
    VIDEO_CUED(5, false, false, true, null),
    ERROR(-1000, false, false, false, null);

    public static final String a;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final xyw s;

    static {
        JniZero.m(xywVarArr);
        a = twu.b("MDX.remote");
    }

    private xyw(int i, boolean z, boolean z2, boolean z3, xyw xywVar) {
        super(str, i);
        this.o = i;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = xywVar;
    }

    public static xyw[] values() {
        return (xyw[]) t.clone();
    }
}
