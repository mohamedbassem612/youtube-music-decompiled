package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akuc implements aihr {
    ENGAGEMENT_PANEL_SURFACE_UNKNOWN(0),
    ENGAGEMENT_PANEL_SURFACE_WATCH(1),
    ENGAGEMENT_PANEL_SURFACE_BROWSE(2),
    ENGAGEMENT_PANEL_SURFACE_SEARCH(3),
    ENGAGEMENT_PANEL_SURFACE_SHORTS(4),
    ENGAGEMENT_PANEL_SURFACE_NATIVE_ALL(5),
    ENGAGEMENT_PANEL_SURFACE_LIVE_CHAT(6),
    ENGAGEMENT_PANEL_SURFACE_LIVE_CREATION(8);

    public final int i;

    akuc(int i) {
        this.i = i;
    }

    public static akuc a(int i) {
        switch (i) {
            case 0:
                return ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            case 1:
                return ENGAGEMENT_PANEL_SURFACE_WATCH;
            case 2:
                return ENGAGEMENT_PANEL_SURFACE_BROWSE;
            case 3:
                return ENGAGEMENT_PANEL_SURFACE_SEARCH;
            case 4:
                return ENGAGEMENT_PANEL_SURFACE_SHORTS;
            case 5:
                return ENGAGEMENT_PANEL_SURFACE_NATIVE_ALL;
            case 6:
                return ENGAGEMENT_PANEL_SURFACE_LIVE_CHAT;
            case 7:
            default:
                return null;
            case 8:
                return ENGAGEMENT_PANEL_SURFACE_LIVE_CREATION;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
