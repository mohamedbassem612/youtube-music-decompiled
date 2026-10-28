package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aos extends anx implements ako {
    private final boolean a;
    private final awqg b;

    public aos(boolean z, awqg awqgVar) {
        this.a = z;
        this.b = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aos) {
            aos aosVar = (aos) obj;
            if (this.a == aosVar.a && this.b == aosVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
