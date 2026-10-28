package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aktz implements aihr {
    ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_UNSPECIFIED(0),
    ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP(1),
    ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP(2),
    ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK(3);

    public final int e;

    aktz(int i) {
        this.e = i;
    }

    public static aktz a(int i) {
        if (i == 0) {
            return ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP;
        }
        if (i == 2) {
            return ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP;
        }
        if (i != 3) {
            return null;
        }
        return ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
