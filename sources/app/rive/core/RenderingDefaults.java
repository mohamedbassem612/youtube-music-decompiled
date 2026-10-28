package app.rive.core;

import app.rive.Fit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderingDefaults {
    public static final int $stable = 0;
    public static final int CLEAR_COLOR = 0;
    public static final RenderingDefaults INSTANCE = new RenderingDefaults();

    private RenderingDefaults() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Fit defaultFit() {
        return new Fit.Contain(null, 1, 0 == true ? 1 : 0);
    }
}
