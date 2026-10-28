package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwd extends agwf {
    public final boolean equals(Object obj) {
        if (obj instanceof agwd) {
            return this.a.equals(((agwd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return agwd.class.hashCode() + this.a.hashCode();
    }
}
