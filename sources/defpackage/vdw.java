package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdw {
    public final String a;
    public final String b;
    public final aigj c;

    public vdw(String str, String str2, aigj aigjVar) {
        this.a = str;
        this.b = str2;
        this.c = aigjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdw) {
            vdw vdwVar = (vdw) obj;
            if (awrc.c(this.a, vdwVar.a) && awrc.c(this.b, vdwVar.b) && awrc.c(this.c, vdwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AddedSoundPlayerRequestParams(videoId=" + this.a + ", playerParams=" + this.b + ", clickTrackingParams=" + this.c + ')';
    }
}
