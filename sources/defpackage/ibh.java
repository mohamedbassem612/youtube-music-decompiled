package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ibh {
    ATV_PREFERRED(0),
    OMV_PREFERRED(1),
    DONT_PLAY_VIDEO_OVERRIDE(2),
    ATV_PREFERRED_USER_TRIGGERED(3),
    OMV_PREFERRED_USER_TRIGGERED(4);

    public static final agkj f;
    public final int g;

    static {
        ibh ibhVar = ATV_PREFERRED;
        ibh ibhVar2 = OMV_PREFERRED;
        ibh ibhVar3 = DONT_PLAY_VIDEO_OVERRIDE;
        ibh ibhVar4 = ATV_PREFERRED_USER_TRIGGERED;
        ibh ibhVar5 = OMV_PREFERRED_USER_TRIGGERED;
        int i = ibhVar5.g;
        f = agkj.n(Integer.valueOf(ibhVar.g), ibhVar, Integer.valueOf(ibhVar2.g), ibhVar2, Integer.valueOf(ibhVar3.g), ibhVar3, Integer.valueOf(ibhVar4.g), ibhVar4, Integer.valueOf(i), ibhVar5);
    }

    ibh(int i) {
        this.g = i;
    }
}
