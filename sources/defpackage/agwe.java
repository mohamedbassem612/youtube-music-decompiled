package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwe extends agwf {
    public final boolean equals(Object obj) {
        if (obj instanceof agwe) {
            return this.a.equals(((agwe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return agwe.class.hashCode() + this.a.hashCode();
    }
}
