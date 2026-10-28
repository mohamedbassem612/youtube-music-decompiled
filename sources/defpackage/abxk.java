package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxk implements abxp, abxh {
    public static final abxk a = new abxk(false);
    public final boolean b;

    public abxk(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abxk) && this.b == ((abxk) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return a.aj(this.b);
    }

    public final String toString() {
        return "SkipSilenceSettingModel(enabled=" + this.b + ')';
    }
}
