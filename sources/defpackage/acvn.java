package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvn {
    public static final acvn a;
    public static final acvn b;
    public static final acvn c;
    private static final /* synthetic */ acvn[] d;

    static {
        acvn acvnVar = new acvn("IN_WATCH_WHILE_PIP", 0);
        a = acvnVar;
        acvn acvnVar2 = new acvn("IN_REEL_PIP", 1);
        b = acvnVar2;
        acvn acvnVar3 = new acvn("NOT_IN_PIP", 2);
        c = acvnVar3;
        d = new acvn[]{acvnVar, acvnVar2, acvnVar3};
    }

    public static acvn[] values() {
        return (acvn[]) d.clone();
    }
}
