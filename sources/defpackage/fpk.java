package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpk {
    public static final fpk a;
    public static final fpk b;
    public static final fpk c;
    public static final fpk d;
    private static final /* synthetic */ fpk[] e;

    static {
        fpk fpkVar = new fpk("LOADING", 0);
        a = fpkVar;
        fpk fpkVar2 = new fpk("LOADED", 1);
        b = fpkVar2;
        fpk fpkVar3 = new fpk("EMPTY", 2);
        c = fpkVar3;
        fpk fpkVar4 = new fpk("ERROR", 3);
        d = fpkVar4;
        e = new fpk[]{fpkVar, fpkVar2, fpkVar3, fpkVar4};
    }

    public static fpk[] values() {
        return (fpk[]) e.clone();
    }
}
