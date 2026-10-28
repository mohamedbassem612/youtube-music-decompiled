package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pfm {
    public static final pfm a;
    public static final pfm b;
    public static final pfm c;
    public static final pfm d;
    private static final /* synthetic */ pfm[] e;

    static {
        pfm pfmVar = new pfm("INSERTED", 0);
        a = pfmVar;
        pfm pfmVar2 = new pfm("REPLACED", 1);
        b = pfmVar2;
        pfm pfmVar3 = new pfm("REJECTED_SAME_VERSION", 2);
        c = pfmVar3;
        pfm pfmVar4 = new pfm("REJECTED_DB_ERROR", 3);
        d = pfmVar4;
        e = new pfm[]{pfmVar, pfmVar2, pfmVar3, pfmVar4};
    }

    public static pfm[] values() {
        return (pfm[]) e.clone();
    }
}
