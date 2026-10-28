package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anh extends anx {
    private final awqg a;

    public anh(awqg awqgVar) {
        this.a = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof anh) && this.a == ((anh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
