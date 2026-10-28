package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydb extends ydc {
    private final ydd a;

    public ydb(ydd yddVar) {
        yddVar.getClass();
        this.a = yddVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ydb) && this.a == ((ydb) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unauthorized(error=" + this.a + ')';
    }
}
