package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxl implements cxk {
    private final long a;
    private final long b;
    private final boolean c;
    private final bsg d;

    public cxl(long j, long j2, boolean z, bsg bsgVar) {
        boolean z2 = true;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        }
        ahno.F(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bsgVar;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxl cxlVar = (cxl) obj;
            if (this.a == cxlVar.a && this.b == cxlVar.b && this.c == cxlVar.c && Objects.equals(this.d, cxlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        bsg bsgVar = this.d;
        return ((((((a.ak(this.a) + 527) * 31) + a.ak(this.b)) * 31) + (this.c ? 1 : 0)) * 31) + (bsgVar != null ? bsgVar.hashCode() : 0);
    }

    public final String toString() {
        long j = this.a;
        Object objValueOf = j == -9223372036854775807L ? "UNSET" : Long.valueOf(j);
        long j2 = this.b;
        String string = objValueOf.toString();
        String strBS = j2 == -9223372036854775807L ? "" : a.bS(j2, ", endTimeMs=");
        boolean z = this.c;
        bsg bsgVar = this.d;
        String strConcat = bsgVar == null ? "" : ", title=".concat(bsgVar.toString());
        return "Chapter: startTimeMs=" + string + strBS + (true == z ? ", hidden" : "") + strConcat;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
