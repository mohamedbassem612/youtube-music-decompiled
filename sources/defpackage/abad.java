package defpackage;

import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 abad[], still in use, count: 1, list:
  (r3v3 abad[]) from 0x007a: INVOKE (r3v3 abad[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:123)
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
public final class abad {
    OK(CuePointDataProviderWrapper.CuePointStatus.OK),
    RATE_CONTROL(CuePointDataProviderWrapper.CuePointStatus.RATE_CONTROL),
    SERVER_ERROR(CuePointDataProviderWrapper.CuePointStatus.SERVER_ERROR),
    INACTIVE(CuePointDataProviderWrapper.CuePointStatus.INACTIVE),
    NO_DAI_CONFIG_RETURNED_IN_GAB(CuePointDataProviderWrapper.CuePointStatus.NO_DAI_CONFIG_FROM_GAB),
    NOT_FORWARDED(CuePointDataProviderWrapper.CuePointStatus.RATE_CONTROL_BY_CLIENT),
    CACHE_MISS_AND_ON_DEMAND_DISABLED(CuePointDataProviderWrapper.CuePointStatus.CACHE_MISS),
    REMOVED(CuePointDataProviderWrapper.CuePointStatus.DELETED);

    public final CuePointDataProviderWrapper.CuePointStatus i;

    static {
        JniZero.m(abadVarArr);
    }

    private abad(CuePointDataProviderWrapper.CuePointStatus cuePointStatus) {
        super(str, i);
        this.i = cuePointStatus;
    }

    public static abad[] values() {
        return (abad[]) j.clone();
    }
}
