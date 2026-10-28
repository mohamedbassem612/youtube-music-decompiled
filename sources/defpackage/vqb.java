package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vqb {
    public static final vqb a;
    public static final vqb b;
    public static final vqb c;
    public static final vqb d;
    public static final vqb e;
    public static final vqb f;
    public static final vqb g;
    private static final /* synthetic */ vqb[] h;

    static {
        vqb vqbVar = new vqb("UNSPECIFIED", 0);
        a = vqbVar;
        vqb vqbVar2 = new vqb("BEFORE_FIRST_VISIBLE", 1);
        b = vqbVar2;
        vqb vqbVar3 = new vqb("BEFORE_ANCHOR", 2);
        c = vqbVar3;
        vqb vqbVar4 = new vqb("ANCHORED", 3);
        d = vqbVar4;
        vqb vqbVar5 = new vqb("AFTER_ANCHOR", 4);
        e = vqbVar5;
        vqb vqbVar6 = new vqb("AFTER_LAST_VISIBLE", 5);
        f = vqbVar6;
        vqb vqbVar7 = new vqb("USER_SCROLLING", 6);
        g = vqbVar7;
        h = new vqb[]{vqbVar, vqbVar2, vqbVar3, vqbVar4, vqbVar5, vqbVar6, vqbVar7};
    }

    public static vqb[] values() {
        return (vqb[]) h.clone();
    }
}
