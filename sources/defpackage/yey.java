package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yey extends ygr {
    public final zhz a;
    public final boolean b;

    public yey(zhz zhzVar, boolean z) {
        this.a = zhzVar;
        this.b = z;
    }

    @Override // defpackage.ygr
    public final zhz a() {
        return this.a;
    }

    @Override // defpackage.ygr
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygr) {
            ygr ygrVar = (ygr) obj;
            if (this.a.equals(ygrVar.a()) && this.b == ygrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "SkippableMedialibErrorEvent{medialibErrorEvent=" + this.a.toString() + ", canSkip=" + this.b + '}';
    }
}
