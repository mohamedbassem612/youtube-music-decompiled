package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jei {
    public static final jei a;
    public static final jei b;
    public static final jei c;
    private static final /* synthetic */ jei[] d;

    static {
        jei jeiVar = new jei("NONE", 0);
        a = jeiVar;
        jei jeiVar2 = new jei("DEFAULT", 1);
        b = jeiVar2;
        jei jeiVar3 = new jei("ACTIVE", 2);
        c = jeiVar3;
        d = new jei[]{jeiVar, jeiVar2, jeiVar3};
    }

    public static jei[] values() {
        return (jei[]) d.clone();
    }
}
