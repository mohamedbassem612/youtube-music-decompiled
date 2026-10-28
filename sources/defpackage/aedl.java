package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedl {
    public static final aedl a;
    public static final aedl b;
    public static final aedl c;
    private static final /* synthetic */ aedl[] d;

    static {
        aedl aedlVar = new aedl("FULL", 0);
        a = aedlVar;
        aedl aedlVar2 = new aedl("PRIMARY", 1);
        b = aedlVar2;
        aedl aedlVar3 = new aedl("SECONDARY", 2);
        c = aedlVar3;
        d = new aedl[]{aedlVar, aedlVar2, aedlVar3};
    }

    public static aedl[] values() {
        return (aedl[]) d.clone();
    }
}
