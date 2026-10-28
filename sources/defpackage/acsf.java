package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsf extends acsh {
    public final aazb a;

    public acsf(aazb aazbVar) {
        super(null);
        this.a = aazbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof acsf) && awrc.c(this.a, ((acsf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubtitleTrack(event=" + this.a + ')';
    }
}
