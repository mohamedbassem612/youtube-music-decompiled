package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uww {
    private final Set a;
    private final uxb b;
    private final boolean c;
    private final uws d = null;
    private final int e;

    public uww(Set set, uxb uxbVar, boolean z, int i) {
        this.a = set;
        this.b = uxbVar;
        this.c = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uww) {
            uww uwwVar = (uww) obj;
            if (awrc.c(this.a, uwwVar.a) && awrc.c(this.b, uwwVar.b) && this.c == uwwVar.c && this.e == uwwVar.e) {
                uws uwsVar = uwwVar.d;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.aj(this.c)) * 31) + this.e) * 31;
    }

    public final String toString() {
        return "VolumeRepositoryState(trackTypesInUse=" + this.a + ", volumes=" + this.b + ", hasGeneratedVoiceover=" + this.c + ", visualRemixTrackType=" + ((Object) Integer.toString(this.e - 1)) + ", musicMetadata=null)";
    }
}
