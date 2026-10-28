package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akua implements aihr {
    ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN(0),
    ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER(1),
    ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER(4),
    ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED(2),
    ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT(3);

    public final int f;

    akua(int i) {
        this.f = i;
    }

    public static akua a(int i) {
        if (i == 0) {
            return ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN;
        }
        if (i == 1) {
            return ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER;
        }
        if (i == 2) {
            return ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED;
        }
        if (i == 3) {
            return ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT;
        }
        if (i != 4) {
            return null;
        }
        return ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
