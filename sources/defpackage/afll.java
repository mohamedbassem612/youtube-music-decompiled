package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afll {
    public final String a;
    public final int b;

    public afll(String str) {
        this.a = str;
        this.b = 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afll) {
            afll afllVar = (afll) obj;
            if (this.a.equals(afllVar.a) && this.b == afllVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "UPDATE" : "KEEP";
        } else {
            str = "REPLACE";
        }
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + str + '}';
    }

    public afll() {
        throw null;
    }
}
