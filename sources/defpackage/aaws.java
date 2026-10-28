package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaws extends aaxg {
    private final String a;
    private final String b;
    private final int c;

    private aaws(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.aaxg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aaxg
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aaxg
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaxg) {
            aaxg aaxgVar = (aaxg) obj;
            if (this.a.equals(aaxgVar.b()) && this.b.equals(aaxgVar.c()) && this.c == aaxgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "PlaybackLoopingEvent{cpn=" + this.a + ", videoId=" + this.b + ", loopCount=" + this.c + '}';
    }

    public /* synthetic */ aaws(String str, String str2, int i, aawr aawrVar) {
        this(str, str2, i);
    }
}
