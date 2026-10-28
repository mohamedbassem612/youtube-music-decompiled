package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvk {
    public final String a;
    public final apho b;

    public gvk(String str, apho aphoVar) {
        this.a = str;
        this.b = aphoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gvk) {
            gvk gvkVar = (gvk) obj;
            if (awrc.c(this.a, gvkVar.a) && awrc.c(this.b, gvkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MusicSectionReloadEvent(sectionId=" + this.a + ", reloadContinuationData=" + this.b + ')';
    }
}
