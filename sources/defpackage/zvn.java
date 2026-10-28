package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zvn {
    public static final zvn a;
    public static final zvn b;
    private static final /* synthetic */ zvn[] c;

    static {
        zvn zvnVar = new zvn("WARNING", 0);
        a = zvnVar;
        zvn zvnVar2 = new zvn("ERROR", 1);
        b = zvnVar2;
        c = new zvn[]{zvnVar, zvnVar2};
    }

    public static zvn[] values() {
        return (zvn[]) c.clone();
    }
}
