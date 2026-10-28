package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ttg {
    IMMERSIVE(2, 0, true),
    IMMERSIVE_FLEX(2, 2, true),
    IMMERSIVE_SHOW_UI(2, 1, true),
    IMMERSIVE_SHOW_NAV_BAR_ONLY(2, 2, true),
    VR(2, 0, true),
    LAYOUT_FULLSCREEN(1, 1, true),
    DEFAULT(0, 1, false),
    NON_STICKY_FULLSCREEN(2, 0, false);

    public final int i;
    public final boolean j;
    public final int k;

    ttg(int i, int i2, boolean z) {
        this.i = i;
        this.j = z;
        this.k = i2;
    }
}
