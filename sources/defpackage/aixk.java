package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aixk implements aihr {
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_UNSPECIFIED(0),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_READY_TO_SCHEDULE(1),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_SUCCESS(2),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_FAILED(3),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_ATTACHED(4),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SUCCESS(5),
    PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SCHEDULING_FAILURE(6);

    public final int h;

    aixk(int i2) {
        this.h = i2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
