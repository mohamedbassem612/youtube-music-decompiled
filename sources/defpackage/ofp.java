package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ofp {
    VISIBLE_50_PERCENT(1, 0, 0),
    VIEWABLE(0, 1, 1),
    AUDIBLE_MEASURABLE(2, 2, 2),
    AUDIBLE(4, 4, 4),
    FULLSCREEN(8, 8, 8),
    BACKGROUNDED_MEASURABLE(16, 16, 16),
    BACKGROUNDED(32, 32, 32),
    AUDIBLE_AND_VISIBLE_50_PERCENT(64, 0, 0),
    AUDIBLE_AND_VIEWABLE(0, 64, 64),
    COVERAGE_MEASURABLE(SemanticState.Focused, SemanticState.Focused, SemanticState.Focused),
    PARTIALLY_VIEWABLE(SemanticState.Hidden, SemanticState.Hidden, SemanticState.Hidden),
    GROUPM_DURATION_REACHED(0, SemanticState.LiveRegion, SemanticState.LiveRegion),
    PMX_VIEWABLE(0, 16777216, 16777216),
    MUTED(33554432, 33554432, 33554432),
    UNMUTED_AND_BACKGROUNDED(67108864, 67108864, 67108864),
    YT_SHORTS_ONE_SECOND_VIEWABLE(268435456, 268435456, 268435456);

    public final int q;
    public final int r;
    public final int s;

    ofp(int i, int i2, int i3) {
        this.q = i;
        this.r = i2;
        this.s = i3;
    }
}
