package defpackage;

import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvv {
    public final MediaSource$MediaSourceInfo a;
    public final MediaSource$MediaSourceInfo b;

    public yvv(MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo2) {
        this.a = mediaSource$MediaSourceInfo;
        this.b = mediaSource$MediaSourceInfo2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yvv) {
            yvv yvvVar = (yvv) obj;
            MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = this.a;
            if (mediaSource$MediaSourceInfo != null ? mediaSource$MediaSourceInfo.equals(yvvVar.a) : yvvVar.a == null) {
                MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo2 = this.b;
                if (mediaSource$MediaSourceInfo2 == null) {
                    if (yvvVar.b == null) {
                        return true;
                    }
                } else if (mediaSource$MediaSourceInfo2.equals(yvvVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = this.a;
        int iHashCode = mediaSource$MediaSourceInfo == null ? 0 : mediaSource$MediaSourceInfo.hashCode();
        MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (mediaSource$MediaSourceInfo2 != null ? mediaSource$MediaSourceInfo2.hashCode() : 0);
    }

    public final String toString() {
        MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = this.b;
        return "MediaSourceInfoForTracks{videoMediaSourceInfo=" + String.valueOf(this.a) + ", audioMediaSourceInfo=" + String.valueOf(mediaSource$MediaSourceInfo) + '}';
    }

    public yvv() {
        throw null;
    }
}
