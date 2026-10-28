package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxz {
    public static final abxz a = new abxz(null, null, null);
    public final abyc b;
    public final abyc c;
    public final abyc d;
    private final abyc e;

    public abxz(abyc abycVar, abyc abycVar2, abyc abycVar3) {
        this.b = abycVar;
        this.c = abycVar2;
        this.d = abycVar3;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxz) {
            abxz abxzVar = (abxz) obj;
            if (awrc.c(this.b, abxzVar.b) && awrc.c(this.c, abxzVar.c) && awrc.c(this.d, abxzVar.d)) {
                abyc abycVar = abxzVar.e;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        abyc abycVar = this.b;
        int iHashCode = abycVar == null ? 0 : abycVar.hashCode();
        abyc abycVar2 = this.c;
        int iHashCode2 = abycVar2 == null ? 0 : abycVar2.hashCode();
        int i = iHashCode * 31;
        abyc abycVar3 = this.d;
        return (((i + iHashCode2) * 31) + (abycVar3 != null ? abycVar3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "PlaybackStartSettingsParameters(skipSilenceSetting=" + this.b + ", videoQualitySetting=" + this.c + ", playbackRateSetting=" + this.d + ", audioSetting=null)";
    }

    public abxz() {
        this(null, null, null);
    }
}
