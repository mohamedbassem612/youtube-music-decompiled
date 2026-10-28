package defpackage;

/* JADX INFO: renamed from: try, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum Ctry implements trz {
    SHELL_CREATE("[YT][SH] c", 255),
    YTA_CREATE("[YT][YTA] c", 1),
    MA_CREATE("[YT][MA] c", 1),
    BROWSE_RENDER("[YT][B] r", 1),
    FIRST_THUMB_LOAD("[YT][FT] l", 255),
    SEARCH_RENDER("[YT][SE] r", 255),
    SEARCH_E2E("[YT][SE] e2e", 255),
    WATCH_PLAYBACK("[YT][W] n2p", 255),
    WATCH_RENDER("[YT][W] r", 255),
    SHORTS_PLAYBACK("[YT][S] n2p", 255),
    STARTUP_ANIMATION("[YT][SU] anim", 255),
    INLINE_PLAYBACK("[YT][Inline] s2p", 255),
    PAGE_TRANSITION("[YT][PT] a", 1),
    SCROLL_STATE("[YT][SC] s", 255);

    private final qci p;
    private final int q;

    Ctry(String str, int i) {
        this.p = new qci(str);
        this.q = i;
    }

    @Override // defpackage.trz
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.trz
    public final qci b() {
        return this.p;
    }

    @Override // defpackage.trz
    public final boolean c() {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.a(1074288756) >= this.q) {
                return true;
            }
        }
        return false;
    }
}
