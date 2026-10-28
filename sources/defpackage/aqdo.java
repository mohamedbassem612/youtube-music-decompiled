package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqdo {
    public final aqdp a;

    public aqdo(aqdp aqdpVar) {
        this.a = aqdpVar;
    }

    public final Long a() {
        return Long.valueOf(this.a.c);
    }

    public final Long b() {
        return Long.valueOf(this.a.d);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqdo) && this.a.equals(((aqdo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "StreamProgressModel{" + String.valueOf(this.a) + '}';
    }
}
