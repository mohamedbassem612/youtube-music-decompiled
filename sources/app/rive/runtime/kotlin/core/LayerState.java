package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class LayerState extends NativeObject {
    public static final int $stable = NativeObject.$stable;

    public LayerState(long j) {
        super(j);
    }

    private final native boolean cppIsAnimationState(long j);

    private final native boolean cppIsAnyState(long j);

    private final native boolean cppIsBlendState(long j);

    private final native boolean cppIsBlendState1D(long j);

    private final native boolean cppIsBlendStateDirect(long j);

    private final native boolean cppIsEntryState(long j);

    private final native boolean cppIsExitState(long j);

    public final boolean isAnimationState() {
        return cppIsAnimationState(getCppPointer());
    }

    public final boolean isAnyState() {
        return cppIsAnyState(getCppPointer());
    }

    public final boolean isBlendState() {
        return cppIsBlendState(getCppPointer());
    }

    public final boolean isBlendState1D() {
        return cppIsBlendState1D(getCppPointer());
    }

    public final boolean isBlendStateDirect() {
        return cppIsBlendStateDirect(getCppPointer());
    }

    public final boolean isEntryState() {
        return cppIsEntryState(getCppPointer());
    }

    public final boolean isExitState() {
        return cppIsExitState(getCppPointer());
    }

    public String toString() {
        return "LayerState";
    }
}
