package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wkb {
    public static final wkb a;
    public static final wkb b;
    public static final wkb c;
    public static final wkb d;
    private static final /* synthetic */ wkb[] e;

    static {
        wkb wkbVar = new wkb("PAUSED", 0);
        a = wkbVar;
        wkb wkbVar2 = new wkb("STOPPED", 1);
        b = wkbVar2;
        wkb wkbVar3 = new wkb("DRAINING", 2);
        c = wkbVar3;
        wkb wkbVar4 = new wkb("SLEEPING", 3);
        d = wkbVar4;
        e = new wkb[]{wkbVar, wkbVar2, wkbVar3, wkbVar4};
    }

    public static wkb[] values() {
        return (wkb[]) e.clone();
    }
}
