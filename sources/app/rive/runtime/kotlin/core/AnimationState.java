package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AnimationState extends LayerState {
    public static final int $stable = LayerState.$stable;

    public AnimationState(long j) {
        super(j);
    }

    private final native String cppName(long j);

    public final String getName() {
        return cppName(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.LayerState
    public String toString() {
        return getName();
    }
}
