package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pie {
    public final aieg a;
    public final awuz b;
    public final awuz c;

    public pie(aieg aiegVar, awuz awuzVar, awuz awuzVar2) {
        this.a = aiegVar;
        this.b = awuzVar;
        this.c = awuzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pie) {
            pie pieVar = (pie) obj;
            if (awrc.c(this.a, pieVar.a) && awrc.c(this.b, pieVar.b) && awrc.c(this.c, pieVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aieg aiegVar = this.a;
        int iHashCode = aiegVar == null ? 0 : aiegVar.hashCode();
        awuz awuzVar = this.b;
        int iHashCode2 = awuzVar == null ? 0 : awuzVar.hashCode();
        int i = iHashCode * 31;
        awuz awuzVar2 = this.c;
        return ((i + iHashCode2) * 31) + (awuzVar2 != null ? awuzVar2.hashCode() : 0);
    }

    public final String toString() {
        return "BigPictureDeferreds(media=" + this.a + ", bitmapDeferred=" + this.b + ", fileDeferred=" + this.c + ')';
    }

    public pie() {
        this(null, null, null);
    }
}
