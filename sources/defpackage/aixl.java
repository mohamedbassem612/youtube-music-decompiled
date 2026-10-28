package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aixl implements aihr {
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED(0),
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ATTEMPT_ERROR(1),
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_NORMAL(2),
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ERROR(3),
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ABANDONED(4),
    PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_SKIP(5);

    public final int g;

    aixl(int i) {
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
