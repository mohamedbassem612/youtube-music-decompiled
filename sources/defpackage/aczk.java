package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aczk {
    public final aigj a;

    public aczk(aigj aigjVar) {
        this.a = aigjVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aczk) && awrc.c(this.a, ((aczk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Valid(context=" + this.a + ')';
    }
}
