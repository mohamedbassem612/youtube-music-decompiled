package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum argg implements aihr {
    VIEW_COUNT_VIDEO_TYPE_UNKNOWN(0),
    VIEW_COUNT_VIDEO_TYPE_VOD(1),
    VIEW_COUNT_VIDEO_TYPE_LIVE(2),
    VIEW_COUNT_VIDEO_TYPE_PREMIERE(3);

    private final int f;

    argg(int i) {
        this.f = i;
    }

    public static argg a(int i) {
        if (i == 0) {
            return VIEW_COUNT_VIDEO_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return VIEW_COUNT_VIDEO_TYPE_VOD;
        }
        if (i == 2) {
            return VIEW_COUNT_VIDEO_TYPE_LIVE;
        }
        if (i != 3) {
            return null;
        }
        return VIEW_COUNT_VIDEO_TYPE_PREMIERE;
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
