package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quf implements qud {
    public final int a;

    public quf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof quf) && this.a == ((quf) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "SEEK_FAILURE";
        } else if (i == 2) {
            str = "UPDATE_FAILURE";
        } else if (i != 3) {
            str = i != 4 ? "GENERIC_ERROR" : "OPEN_GL_ERROR";
        } else {
            str = "INIT_FAILURE";
        }
        return a.bU((byte) 125, str, "GenericContext{errorType=");
    }

    public quf() {
        throw null;
    }
}
