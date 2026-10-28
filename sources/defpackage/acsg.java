package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsg extends acsh {
    public final String a;

    public acsg(String str) {
        super(null);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof acsg) && awrc.c(this.a, ((acsg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VideoStage(cpn=" + this.a + ')';
    }
}
