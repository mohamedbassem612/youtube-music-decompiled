package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxb implements abxc {
    public final abxp a;

    public abxb(abxp abxpVar) {
        abxpVar.getClass();
        this.a = abxpVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abxb) && awrc.c(this.a, ((abxb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServiceSettingChangedEvent(setting=" + this.a + ')';
    }
}
