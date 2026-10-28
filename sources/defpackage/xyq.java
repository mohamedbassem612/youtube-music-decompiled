package defpackage;

import com.google.android.apps.youtube.music.R;
import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 xyq[], still in use, count: 1, list:
  (r6v3 xyq[]) from 0x007c: INVOKE (r6v3 xyq[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:125)
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
public final class xyq {
    LAUNCH_CAST_FAIL_TIMEOUT(R.string.error_connecting_to_screen, false),
    LAUNCH_FAIL_DEVICE_BUSY(R.string.error_youtube_device_busy, true),
    LAUNCH_FAIL_NEEDS_INSTALL(R.string.error_youtube_tv_needs_install, false),
    LAUNCH_FAIL_TIMEOUT(R.string.error_connecting_to_screen, true),
    LOUNGE_SERVER_CONNECTION_ERROR(R.string.error_connecting_to_screen, true),
    NETWORK(R.string.error_network, true),
    UNPLAYABLE(R.string.error_unplayable_reason_unknown, true),
    UNKNOWN(R.string.mdx_error_generic, false);

    public final int i;
    public final boolean j;

    static {
        JniZero.m(xyqVarArr);
    }

    private xyq(int i, boolean z) {
        super(str, i);
        this.i = i;
        this.j = z;
    }

    public static xyq[] values() {
        return (xyq[]) k.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RemoteError [name=" + name() + ", canRetry=" + this.j + ']';
    }
}
