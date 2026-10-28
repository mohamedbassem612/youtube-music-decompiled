package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aajj {
    public final aajy a;
    public final akne b;

    public aajj(aajy aajyVar, akne akneVar) {
        this.a = aajyVar;
        this.b = akneVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajj) {
            aajj aajjVar = (aajj) obj;
            if (this.a.equals(aajjVar.a) && this.b.equals(aajjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        akne akneVar = this.b;
        return "LoggableAppSearchDocument{appSearchDocument=" + String.valueOf(this.a) + ", downloadsSearchDocument=" + String.valueOf(akneVar) + '}';
    }

    public aajj() {
        throw null;
    }
}
