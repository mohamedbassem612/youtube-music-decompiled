package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odw {
    public static final odw a;
    public static final odw b;
    public static final odw c;
    public static final odw d;
    public static final odw e;
    public static final odw f;
    private static final /* synthetic */ odw[] g;

    static {
        odw odwVar = new odw("RESULT_UNKNOWN", 0);
        a = odwVar;
        odw odwVar2 = new odw("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = odwVar2;
        odw odwVar3 = new odw("RESULT_UPDATED", 2);
        c = odwVar3;
        odw odwVar4 = new odw("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = odwVar4;
        odw odwVar5 = new odw("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = odwVar5;
        odw odwVar6 = new odw("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = odwVar6;
        g = new odw[]{odwVar, odwVar2, odwVar3, odwVar4, odwVar5, odwVar6};
    }

    public static odw[] values() {
        return (odw[]) g.clone();
    }
}
