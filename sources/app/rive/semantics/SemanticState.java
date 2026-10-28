package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticState {
    public static final int $stable = 0;
    private static final int CHECK_STATE_MASK = 12;
    private static final int CHECK_STATE_OFFSET = 2;
    public static final int Disabled = 64;
    public static final int Expanded = 1;
    public static final int Focused = 128;
    public static final int Hidden = 256;
    public static final SemanticState INSTANCE = new SemanticState();
    public static final int LiveRegion = 512;
    public static final int Modal = 2048;
    public static final int Multiline = 8192;
    public static final int Obscured = 4096;
    public static final int ReadOnly = 1024;
    public static final int Required = 32;
    public static final int Selected = 2;
    public static final int Toggled = 16;

    private SemanticState() {
    }

    public final SemanticCheckState checkState(int i) {
        int i2 = (i & 12) >>> 2;
        if (i2 != 0) {
            return i2 != 1 ? SemanticCheckState.Mixed : SemanticCheckState.Checked;
        }
        return SemanticCheckState.Unchecked;
    }

    public final boolean effectiveChecked(int i) {
        return checkState(i) == SemanticCheckState.Checked;
    }

    public final boolean effectiveMixed(int i) {
        return checkState(i) == SemanticCheckState.Mixed;
    }

    public final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }
}
