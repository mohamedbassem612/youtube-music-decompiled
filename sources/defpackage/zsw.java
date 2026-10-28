package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsw {
    public static final zsw a;
    public static final zsw b;
    public static final zsw c;
    public static final zsw d;
    public static final zsw e;
    private static final /* synthetic */ zsw[] f;

    static {
        zsw zswVar = new zsw("FAILURE_TRY_AGAIN", 0);
        a = zswVar;
        zsw zswVar2 = new zsw("FAILURE_DONE_WITH_DISPATCH", 1);
        b = zswVar2;
        zsw zswVar3 = new zsw("SUCCESS_AWAIT_RESPONSE", 2);
        c = zswVar3;
        zsw zswVar4 = new zsw("SUCCESS_DONE_WITH_DISPATCH", 3);
        d = zswVar4;
        zsw zswVar5 = new zsw("CANT_SEND_NOT_ACTIVE", 4);
        e = zswVar5;
        f = new zsw[]{zswVar, zswVar2, zswVar3, zswVar4, zswVar5};
    }

    public static zsw[] values() {
        return (zsw[]) f.clone();
    }
}
