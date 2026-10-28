package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etg {
    public static final etg a;
    public static final etg b;
    public static final etg c;
    private static final /* synthetic */ etg[] d;

    static {
        etg etgVar = new etg("PREFER_ARGB_8888", 0);
        a = etgVar;
        etg etgVar2 = new etg("PREFER_RGB_565", 1);
        b = etgVar2;
        d = new etg[]{etgVar, etgVar2};
        c = etgVar;
    }

    public static etg[] values() {
        return (etg[]) d.clone();
    }
}
