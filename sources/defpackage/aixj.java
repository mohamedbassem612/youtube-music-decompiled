package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aixj implements aihr {
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_UNSPECIFIED(0),
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_AD_PLAYBACK_STARTED(1),
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_NON_VIDEO_AD_ACTIVE(2),
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT25(3),
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT50(4),
    PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT75(5);

    public final int g;

    aixj(int i) {
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
