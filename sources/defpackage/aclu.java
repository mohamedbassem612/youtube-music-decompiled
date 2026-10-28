package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aclu {
    public final boolean a;
    public final boolean b;
    public final acls c;
    public final boolean d;
    public final avlh e;

    public aclu(boolean z, boolean z2, acls aclsVar, avlh avlhVar) {
        this.a = z;
        this.b = z2;
        this.c = aclsVar;
        this.d = false;
        this.e = avlhVar;
    }

    public static aclt a() {
        aclt acltVar = new aclt();
        acltVar.d = (byte) (((byte) (acltVar.d | 1)) | 8);
        acltVar.b(false);
        int i = acltVar.d | 4;
        acltVar.a = true;
        acltVar.d = (byte) (((byte) (((byte) (((byte) i) | 16)) | 32)) | 64);
        aclr aclrVar = new aclr();
        aclrVar.c = (byte) (aclrVar.c | 3);
        aclrVar.a(0);
        aclrVar.b(0);
        aclrVar.c = (byte) (aclrVar.c | 16);
        aclrVar.a(R.dimen.time_bar_margin_landscape);
        aclrVar.b(R.dimen.time_bar_margin_landscape);
        if (aclrVar.c == 31) {
            acltVar.b = new acls(aclrVar.a, aclrVar.b);
            acltVar.d = (byte) (acltVar.d | (-128));
            acltVar.c = avlh.G(0);
            return acltVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((aclrVar.c & 1) == 0) {
            sb.append(" landscapeTimeBarPaddingPivotBarVisibleRes");
        }
        if ((aclrVar.c & 2) == 0) {
            sb.append(" portraitTimeBarPaddingPivotBarVisibleRes");
        }
        if ((aclrVar.c & 4) == 0) {
            sb.append(" landscapeTimeBarPaddingPivotBarHiddenRes");
        }
        if ((aclrVar.c & 8) == 0) {
            sb.append(" portraitTimeBarPaddingPivotBarHiddenRes");
        }
        if ((aclrVar.c & 16) == 0) {
            sb.append(" customTimeBarDurationMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean equals(Object obj) {
        acls aclsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aclu) {
            aclu acluVar = (aclu) obj;
            if (this.a == acluVar.a && this.b == acluVar.b && ((aclsVar = this.c) != null ? aclsVar.equals(acluVar.c) : acluVar.c == null)) {
                boolean z = acluVar.d;
                if (this.e.equals(acluVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        acls aclsVar = this.c;
        return (((((((((((((((((true != this.a ? 1237 : 1231) ^ (-485106924)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * (-721379959)) ^ (aclsVar == null ? 0 : aclsVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        avlh avlhVar = this.e;
        return "ReelWatchPageConfig{reelPlayerViewModel=null, shouldRestartPlaybackOnVideoQualityChangeEnabled=false, shouldShowCurrentFrameSnapshotOnPause=" + this.a + ", shouldShowCurrentFrameSnapshotOnScroll=false, allowLandscapeOrientation=false, shouldShowTopBarOnEndscreen=" + this.b + ", shouldDisplayCloseInterstitialOnPlaybackError=false, pauseOnActivityFocusLoss=false, reelGhostLoaderConfig=null, reelTimeBarConfig=" + String.valueOf(this.c) + ", isBottomActionBarEnabled=false, reelThumbnailViewOffset=" + String.valueOf(avlhVar) + '}';
    }

    public aclu() {
        throw null;
    }
}
