package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdi {
    public final wgs a;

    public vdi(wgs wgsVar) {
        this.a = wgsVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof vdi) && awrc.c(this.a, ((vdi) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(formatStreamModel=" + this.a + ')';
    }
}
