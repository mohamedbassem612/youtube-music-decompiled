package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akr extends anx {
    private final awqg a;

    public akr(awqg awqgVar) {
        this.a = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof akr) && this.a == ((akr) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
