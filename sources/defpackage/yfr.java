package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yfr implements Comparable {
    public long a;
    public long b;

    public yfr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(yfr yfrVar) {
        return yfrVar != null && this.b >= yfrVar.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        yfr yfrVar = (yfr) obj;
        int iCompare = Long.compare(this.a, yfrVar.a);
        return iCompare == 0 ? Long.compare(this.b, yfrVar.b) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yfr) {
            yfr yfrVar = (yfr) obj;
            if (this.a == yfrVar.a && this.b == yfrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }
}
