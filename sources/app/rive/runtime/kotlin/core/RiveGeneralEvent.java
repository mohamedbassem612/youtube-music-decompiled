package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveGeneralEvent extends RiveEvent {
    public static final int $stable = RiveEvent.$stable;

    public RiveGeneralEvent(long j, float f) {
        super(j, f);
    }

    @Override // app.rive.runtime.kotlin.core.RiveEvent
    public String toString() {
        return "GeneralRiveEvent, name: " + getName() + ", properties: " + getProperties();
    }
}
