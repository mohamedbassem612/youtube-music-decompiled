package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzi {
    private final String a;

    public uzi(String str) {
        this.a = str;
    }

    public static auym a() {
        auym auymVar = new auym();
        auymVar.j("");
        return auymVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzi) {
            return this.a.equals(((uzi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AdditionalEffectInfo{unpublishedAssetId=" + this.a + '}';
    }

    public uzi() {
        throw null;
    }
}
