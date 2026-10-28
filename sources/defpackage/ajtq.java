package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajtq implements aihr {
    TERMINATION_EVENT_TYPE_UNSPECIFIED(0),
    TERMINATION_EVENT_TYPE_RETURNED_TO_APP(1),
    TERMINATION_EVENT_TYPE_OVERLAY_CLOSED(2),
    TERMINATION_EVENT_TYPE_DISCOVERY_VIDEO_PLAYBACK_COMPLETED(3),
    TERMINATION_EVENT_TYPE_WEBVIEW_CLOSED(4);

    private final int g;

    ajtq(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
