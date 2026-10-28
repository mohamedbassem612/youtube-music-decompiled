package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticTrait {
    public static final int $stable = 0;
    public static final int Checkable = 4;
    public static final int Enablable = 32;
    public static final int Expandable = 1;
    public static final int Focusable = 64;
    public static final SemanticTrait INSTANCE = new SemanticTrait();
    public static final int Requirable = 16;
    public static final int Selectable = 2;
    public static final int Toggleable = 8;

    private SemanticTrait() {
    }

    public final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }
}
