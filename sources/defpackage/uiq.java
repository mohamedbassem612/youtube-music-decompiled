package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uiq extends nuo {
    public final String a;
    public final String b;
    public final uir c;
    private final uir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiq(String str, String str2, uir uirVar) {
        super(null);
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = uirVar;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uiq) {
            uiq uiqVar = (uiq) obj;
            if (awrc.c(this.a, uiqVar.a) && awrc.c(this.b, uiqVar.b) && awrc.c(this.c, uiqVar.c)) {
                uir uirVar = uiqVar.d;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "AlertDialog(title=" + this.a + ", message=" + this.b + ", confirmButton=" + this.c + ", cancelButton=null)";
    }
}
