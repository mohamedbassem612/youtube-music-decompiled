package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfn {
    public final String a;
    public final int b;

    public wfn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static wfm a() {
        wfm wfmVar = new wfm();
        wfmVar.a = aigj.d.B();
        wfmVar.b(Integer.MIN_VALUE);
        return wfmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wfn) {
            wfn wfnVar = (wfn) obj;
            if (this.a.equals(wfnVar.a) && this.b == wfnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "EntityIdTypeValue{entityId=" + this.a + ", entityType=" + this.b + '}';
    }

    public wfn() {
        throw null;
    }
}
