package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yuh {
    public final wiu a;
    public final wja b;
    public final zhu c;

    public yuh(wiu wiuVar, wja wjaVar, zhu zhuVar) {
        wiuVar.getClass();
        wjaVar.getClass();
        this.a = wiuVar;
        this.b = wjaVar;
        this.c = zhuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yuh) {
            yuh yuhVar = (yuh) obj;
            if (awrc.c(this.a, yuhVar.a) && awrc.c(this.b, yuhVar.b) && this.c == yuhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RetrySuggestion(playerConfig=" + this.a + ", streamingData=" + this.b + ", action=" + this.c + ')';
    }
}
