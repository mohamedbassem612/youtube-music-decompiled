package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spb {
    public static final spb a = new spb(null, null);
    private final String b;
    private final abuz c;

    public spb(String str, abuz abuzVar) {
        this.b = str;
        this.c = abuzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spb) {
            spb spbVar = (spb) obj;
            String str = this.b;
            if (str != null ? str.equals(spbVar.b) : spbVar.b == null) {
                abuz abuzVar = this.c;
                if (abuzVar == null) {
                    if (spbVar.c == null) {
                        return true;
                    }
                } else if (abuzVar.equals(spbVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        abuz abuzVar = this.c;
        return ((iHashCode ^ 1000003) * 1000003) ^ (abuzVar != null ? abuzVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdOverlayContentMetadata{title=" + this.b + ", videoThumbnailDetails=" + String.valueOf(this.c) + '}';
    }

    public spb() {
        throw null;
    }
}
