package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tsj {
    public final String a = "AIzaSyC5Hxt_8YjL1MwlZvscmJKrW14SBVqGyUM";
    public final String b = "com.google.android.apps.youtube.app.watch.readables";
    public final String c = "3d7a1223019aa39d9ea0e3436ab7c0896bfb4fb679f4de5fe7c23f326c8f994a";
    private final String e = "youtube-read-along";
    private final String f = "PN:545560155980";
    private final String g = "yt-readalong-android-client";
    public final String d = "en-us-open-server-voicelm#star01";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tsj) {
            tsj tsjVar = (tsj) obj;
            if (awrc.c(this.a, tsjVar.a) && awrc.c(this.b, tsjVar.b) && awrc.c(this.c, tsjVar.c) && awrc.c(this.e, tsjVar.e) && awrc.c(this.f, tsjVar.f) && awrc.c(this.g, tsjVar.g) && awrc.c(this.d, tsjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "S3Config(apiKey=" + this.a + ", packageName=" + this.b + ", certFingerprint=" + this.c + ", applicationId=" + this.e + ", triggerApplicationId=" + this.f + ", clientId=" + this.g + ", voiceName=" + this.d + ')';
    }
}
