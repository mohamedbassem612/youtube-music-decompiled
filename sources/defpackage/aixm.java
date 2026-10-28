package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aixm implements aihr {
    RENDERING_EVENT_TIER_UNSPECIFIED(0),
    RENDERING_EVENT_TIER_DEBUG(1),
    RENDERING_EVENT_TIER_PERMANENT(2);

    public final int d;

    aixm(int i) {
        this.d = i;
    }

    public static aixm a(int i) {
        if (i == 0) {
            return RENDERING_EVENT_TIER_UNSPECIFIED;
        }
        if (i == 1) {
            return RENDERING_EVENT_TIER_DEBUG;
        }
        if (i != 2) {
            return null;
        }
        return RENDERING_EVENT_TIER_PERMANENT;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
