package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acse extends acsh {
    public final boolean a;

    public acse(boolean z) {
        super(null);
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof acse) && this.a == ((acse) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return a.aj(this.a);
    }

    public final String toString() {
        return "MuteChanged(isMuted=" + this.a + ')';
    }
}
