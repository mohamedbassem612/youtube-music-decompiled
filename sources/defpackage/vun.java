package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vun {
    public static final vun a;
    public static final vun b;
    public static final vun c;
    public static final vun d;
    public static final vun e;
    private static final /* synthetic */ vun[] f;

    static {
        vun vunVar = new vun("FULL_BLEED", 0);
        a = vunVar;
        vun vunVar2 = new vun("EXPANDED_WITH_MINI_PLAYER", 1);
        b = vunVar2;
        vun vunVar3 = new vun("EXPANDED", 2);
        c = vunVar3;
        vun vunVar4 = new vun("HIDDEN", 3);
        d = vunVar4;
        vun vunVar5 = new vun("WRAP_CONTENT", 4);
        e = vunVar5;
        f = new vun[]{vunVar, vunVar2, vunVar3, vunVar4, vunVar5};
    }

    public static vun[] values() {
        return (vun[]) f.clone();
    }
}
