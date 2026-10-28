package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aclt {
    public boolean a;
    public acls b;
    public avlh c;
    public byte d;
    private boolean e;

    public final aclu a() {
        avlh avlhVar;
        if (this.d == -1 && (avlhVar = this.c) != null) {
            return new aclu(this.e, this.a, this.b, avlhVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" shouldRestartPlaybackOnVideoQualityChangeEnabled");
        }
        if ((this.d & 2) == 0) {
            sb.append(" shouldShowCurrentFrameSnapshotOnPause");
        }
        if ((this.d & 4) == 0) {
            sb.append(" shouldShowCurrentFrameSnapshotOnScroll");
        }
        if ((this.d & 8) == 0) {
            sb.append(" allowLandscapeOrientation");
        }
        if ((this.d & 16) == 0) {
            sb.append(" shouldShowTopBarOnEndscreen");
        }
        if ((this.d & 32) == 0) {
            sb.append(" shouldDisplayCloseInterstitialOnPlaybackError");
        }
        if ((this.d & 64) == 0) {
            sb.append(" pauseOnActivityFocusLoss");
        }
        if ((this.d & 128) == 0) {
            sb.append(" isBottomActionBarEnabled");
        }
        if (this.c == null) {
            sb.append(" reelThumbnailViewOffset");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.d = (byte) (this.d | 2);
    }
}
