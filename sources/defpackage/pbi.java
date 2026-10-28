package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbi implements pbg {
    public final int a;
    public final String b;

    public pbi(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.pbg
    public final /* synthetic */ ahzx a() {
        return nvh.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pbi) {
            pbi pbiVar = (pbi) obj;
            if (this.a == pbiVar.a && awrc.c(this.b, pbiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimitInfo(limit=" + this.a + ", slotKey=" + this.b + ')';
    }
}
