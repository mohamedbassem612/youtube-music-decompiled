package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ini {
    public final int a;
    public final int b;
    public final String c;

    public ini(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static vzq a() {
        vzq vzqVar = new vzq(null);
        vzqVar.f(-1);
        return vzqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ini) {
            ini iniVar = (ini) obj;
            if (this.a == iniVar.a && this.b == iniVar.b && this.c.equals(iniVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PlaylistPanelVideoContext{index=" + this.a + ", playbackPosition=" + this.b + ", containerId=" + this.c + '}';
    }

    public ini() {
        throw null;
    }
}
