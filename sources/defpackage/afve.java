package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afve {
    public static final afve a;
    public static final afve b;
    public static final afve c;
    public static final afve d;
    public static final afve e;
    public static final afve f;
    public static final afve g;
    public static final afve h;
    private static final /* synthetic */ afve[] i;

    static {
        afve afveVar = new afve("APPLICATION_CREATE", 0);
        a = afveVar;
        afve afveVar2 = new afve("ACTIVITY_CREATE", 1);
        b = afveVar2;
        afve afveVar3 = new afve("ACTIVITY_START", 2);
        c = afveVar3;
        afve afveVar4 = new afve("ACTIVITY_RESUME", 3);
        d = afveVar4;
        afve afveVar5 = new afve("ACTIVITY_PAUSE", 4);
        e = afveVar5;
        afve afveVar6 = new afve("ACTIVITY_STOP", 5);
        f = afveVar6;
        afve afveVar7 = new afve("ACTIVITY_DESTROY", 6);
        g = afveVar7;
        afve afveVar8 = new afve("INTENT_TO_ACTIVITY", 7);
        h = afveVar8;
        i = new afve[]{afveVar, afveVar2, afveVar3, afveVar4, afveVar5, afveVar6, afveVar7, afveVar8};
    }

    public static afve[] values() {
        return (afve[]) i.clone();
    }
}
