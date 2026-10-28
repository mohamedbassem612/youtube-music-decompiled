package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ibv {
    LOOP_OFF(0),
    LOOP_ALL(1),
    LOOP_ONE(2),
    LOOP_DISABLED(3);

    public static final agkj e;
    public static final agkj f;
    public final int g;

    static {
        ibv ibvVar = LOOP_OFF;
        ibv ibvVar2 = LOOP_ALL;
        ibv ibvVar3 = LOOP_ONE;
        ibv ibvVar4 = LOOP_DISABLED;
        e = agkj.m(Integer.valueOf(ibvVar.g), ibvVar, Integer.valueOf(ibvVar2.g), ibvVar2, Integer.valueOf(ibvVar3.g), ibvVar3, Integer.valueOf(ibvVar4.g), ibvVar4);
        f = agkj.m(Integer.valueOf(ibvVar.g), 0, Integer.valueOf(ibvVar2.g), 1, Integer.valueOf(ibvVar3.g), 2, Integer.valueOf(ibvVar4.g), 0);
    }

    ibv(int i) {
        this.g = i;
    }
}
