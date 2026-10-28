package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdw {
    public static final tdw a;
    public static final tdw b;
    public static final tdw c;
    private static final /* synthetic */ tdw[] d;

    static {
        tdw tdwVar = new tdw("CREATED", 0);
        a = tdwVar;
        tdw tdwVar2 = new tdw("STARTED", 1);
        b = tdwVar2;
        tdw tdwVar3 = new tdw("RESUMED", 2);
        c = tdwVar3;
        d = new tdw[]{tdwVar, tdwVar2, tdwVar3};
    }

    public static tdw[] values() {
        return (tdw[]) d.clone();
    }
}
