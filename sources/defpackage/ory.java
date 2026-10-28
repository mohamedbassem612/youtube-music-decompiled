package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ory {
    public final String a;
    private final int b;
    private final int c;

    public ory(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ory) {
            ory oryVar = (ory) obj;
            if (this.a.equals(oryVar.a) && this.b == oryVar.b && this.c == oryVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditableTextInputDetails{text=" + this.a + ", width=" + this.b + ", height=" + this.c + '}';
    }

    public ory() {
        throw null;
    }
}
