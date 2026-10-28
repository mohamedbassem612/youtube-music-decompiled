package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqk extends yno {
    public final cc a;

    public zqk(cc ccVar) {
        this.a = ccVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zqk) && awrc.c(this.a, ((zqk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FragmentCreated(fragment=" + this.a + ')';
    }
}
