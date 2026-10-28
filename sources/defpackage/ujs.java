package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujs {
    public final auhp a;
    public final auho b;
    public final float c;

    public ujs(auhp auhpVar, auho auhoVar, float f) {
        if (auhpVar == null) {
            throw new NullPointerException("Null translation");
        }
        this.a = auhpVar;
        if (auhoVar == null) {
            throw new NullPointerException("Null scale");
        }
        this.b = auhoVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujs) {
            ujs ujsVar = (ujs) obj;
            if (this.a.equals(ujsVar.a) && this.b.equals(ujsVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(ujsVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        auho auhoVar = this.b;
        return "Transformation{translation=" + this.a.toString() + ", scale=" + auhoVar.toString() + ", rotationDegrees=" + this.c + '}';
    }

    public ujs() {
        throw null;
    }
}
