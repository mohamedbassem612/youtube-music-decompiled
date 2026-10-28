package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auze {
    public final auzd a;
    public final Status b;

    public auze(auzd auzdVar, Status status) {
        this.a = auzdVar;
        status.getClass();
        this.b = status;
    }

    public static auze a(auzd auzdVar) {
        ahno.G(auzdVar != auzd.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new auze(auzdVar, Status.OK);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auze)) {
            return false;
        }
        auze auzeVar = (auze) obj;
        return this.a.equals(auzeVar.a) && this.b.equals(auzeVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        boolean zE = status.e();
        auzd auzdVar = this.a;
        if (zE) {
            return auzdVar.toString();
        }
        return auzdVar.toString() + '(' + status.toString() + ')';
    }
}
