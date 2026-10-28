package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wen {
    public static final wen a;
    public static final wen b;
    private static final /* synthetic */ wen[] c;

    static {
        wen wenVar = new wen("UNKNOWN", 0);
        a = wenVar;
        wen wenVar2 = new wen("CLEAR_ON_SIGN_OUT", 1);
        b = wenVar2;
        c = new wen[]{wenVar, wenVar2};
    }

    public static wen[] values() {
        return (wen[]) c.clone();
    }
}
