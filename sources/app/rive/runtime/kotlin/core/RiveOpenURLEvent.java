package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveOpenURLEvent extends RiveEvent {
    public static final int $stable = RiveEvent.$stable;

    public RiveOpenURLEvent(long j, float f) {
        super(j, f);
    }

    private final native String cppTarget(long j);

    private final native String cppURL(long j);

    public final String getTarget() {
        return cppTarget(getCppPointer());
    }

    public final String getUrl() {
        return cppURL(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.RiveEvent
    public String toString() {
        return "OpenURLRiveEvent, name: " + getName() + ", url: " + getUrl() + ", target: " + getTarget() + ", properties: " + getProperties();
    }
}
