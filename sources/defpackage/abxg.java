package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxg implements abxh {
    public static final abxg a = new abxg(1.0f, abxj.a);
    public final float b;
    public final abxj c;

    public abxg(float f, abxj abxjVar) {
        abxjVar.getClass();
        this.b = f;
        this.c = abxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxg) {
            abxg abxgVar = (abxg) obj;
            if (Float.compare(this.b, abxgVar.b) == 0 && awrc.c(this.c, abxgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActivePlaybackRateSettingModel(activeRate=" + this.b + ", requestedRateModel=" + this.c + ')';
    }

    public abxg() {
        this(1.0f, abxj.a);
    }
}
