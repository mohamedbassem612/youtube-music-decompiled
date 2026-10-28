package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qci {
    public final String a;

    public qci(String str) {
        this.a = str;
    }

    public static qci a(qci qciVar, qci qciVar2) {
        return new qci(String.valueOf(qciVar.a).concat(String.valueOf(qciVar2.a)));
    }

    public static qci b(String str, Enum r2) {
        if (ahno.aa(str)) {
            return new qci(r2.name());
        }
        return new qci(String.valueOf(str).concat(String.valueOf(r2.name())));
    }

    public static qci c(Class cls) {
        return new qci(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qci) {
            return this.a.equals(((qci) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
