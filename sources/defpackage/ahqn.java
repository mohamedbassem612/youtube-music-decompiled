package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahqn implements ahqr {
    private final int a;
    private final ahqq b;

    public ahqn(int i, ahqq ahqqVar) {
        this.a = i;
        this.b = ahqqVar;
    }

    @Override // defpackage.ahqr
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ahqr.class;
    }

    @Override // defpackage.ahqr
    public final ahqq b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahqr) {
            ahqr ahqrVar = (ahqr) obj;
            if (this.a == ahqrVar.a() && this.b.equals(ahqrVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
