package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egw {
    public static final egw a;
    public static final egw b;
    public static final egw c;
    public static final egw d;
    public static final egw e;
    public static final egw f;
    private static final /* synthetic */ egw[] g;

    static {
        egw egwVar = new egw("SET_ANIMATION", 0);
        a = egwVar;
        egw egwVar2 = new egw("SET_PROGRESS", 1);
        b = egwVar2;
        egw egwVar3 = new egw("SET_REPEAT_MODE", 2);
        c = egwVar3;
        egw egwVar4 = new egw("SET_REPEAT_COUNT", 3);
        d = egwVar4;
        egw egwVar5 = new egw("SET_IMAGE_ASSETS", 4);
        e = egwVar5;
        egw egwVar6 = new egw("PLAY_OPTION", 5);
        f = egwVar6;
        g = new egw[]{egwVar, egwVar2, egwVar3, egwVar4, egwVar5, egwVar6};
    }

    public static egw[] values() {
        return (egw[]) g.clone();
    }
}
