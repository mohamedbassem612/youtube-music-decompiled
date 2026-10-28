package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ogj implements ofo {
    START(true, false, 0, false, true),
    FIRST_QUARTILE(true, false, 1, false, true),
    MIDPOINT(true, false, 2, false, true),
    THIRD_QUARTILE(true, false, 3, false, true),
    COMPLETE(false, false, 4, true, true),
    RESUME(true, false, -1, false, true),
    PAUSE(false, false, -1, true, true),
    SUSPEND(false, false, -1, true, true),
    ABANDON(false, true, -1, true, true),
    SKIP_SHOWN(true, false, -1, false, false),
    SKIP(false, false, -1, true, true),
    SWIPE(false, false, -1, true, true),
    MUTE(false, false, -1, false, true),
    UNMUTE(false, false, -1, false, true),
    VIEWABLE_IMPRESSION(false, false, -1, false, true),
    MEASURABLE_IMPRESSION(false, false, -1, false, true),
    GROUPM_VIEWABLE_IMPRESSION(false, false, -1, false, true),
    FULLSCREEN(false, false, -1, false, true),
    EXIT_FULLSCREEN(false, false, -1, false, true),
    AUDIO_AUDIBLE(false, false, -1, false, true),
    AUDIO_MEASURABLE(false, false, -1, false, true);

    private final boolean A;
    public final boolean v;
    public final int w;
    public final boolean x;
    private final boolean z;

    ogj(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.z = z;
        this.v = z2;
        this.w = i;
        this.A = z3;
        this.x = z4;
    }

    @Override // defpackage.ofo
    public final boolean a() {
        return this.z;
    }

    @Override // defpackage.ofo
    public final boolean b() {
        return this.A;
    }

    public final boolean c() {
        return this.w != -1;
    }

    public final boolean d() {
        return this == SKIP || this == COMPLETE || this == ABANDON || this == SWIPE;
    }
}
