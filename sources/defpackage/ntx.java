package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ntx {
    public final awmd a;
    public final String b;
    public final ntu c;
    public final nug d;
    public final boolean e;
    public final nvy f;
    public final boolean g;
    public final agke h;
    public final adfx i;
    private final agkj j;

    public ntx(awmd awmdVar, String str, ntu ntuVar, nug nugVar, adfx adfxVar, boolean z, nvy nvyVar, boolean z2, agke agkeVar, agkj agkjVar) {
        this.a = awmdVar;
        this.b = str;
        this.c = ntuVar;
        this.d = nugVar;
        this.i = adfxVar;
        this.e = z;
        this.f = nvyVar;
        this.g = z2;
        this.h = agkeVar;
        this.j = agkjVar;
    }

    public static ntw a(ntr ntrVar) {
        return b(new glj(ntrVar, 6));
    }

    public static ntw b(awmd awmdVar) {
        ntw ntwVar = new ntw();
        if (awmdVar == null) {
            throw new NullPointerException("Null converterProvider");
        }
        ntwVar.b = awmdVar;
        ntwVar.c(true);
        ntwVar.d = ntu.a;
        ntwVar.e = nug.a;
        ntwVar.b(true);
        byte b = ntwVar.h;
        ntwVar.c = "Elements";
        ntwVar.h = (byte) (b | 22);
        return ntwVar;
    }

    public final boolean equals(Object obj) {
        adfx adfxVar;
        nvy nvyVar;
        agke agkeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntx) {
            ntx ntxVar = (ntx) obj;
            if (this.a.equals(ntxVar.a) && this.b.equals(ntxVar.b) && this.c.equals(ntxVar.c) && this.d.equals(ntxVar.d) && ((adfxVar = this.i) != null ? adfxVar.equals(ntxVar.i) : ntxVar.i == null) && this.e == ntxVar.e && ((nvyVar = this.f) != null ? nvyVar.equals(ntxVar.f) : ntxVar.f == null) && this.g == ntxVar.g && ((agkeVar = this.h) != null ? aguu.v(agkeVar, ntxVar.h) : ntxVar.h == null) && aguu.q(this.j, ntxVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        adfx adfxVar = this.i;
        int iHashCode2 = ((((((((iHashCode * 1000003) ^ (adfxVar == null ? 0 : adfxVar.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * (-721379959);
        nvy nvyVar = this.f;
        int iHashCode3 = (((((iHashCode2 ^ (nvyVar == null ? 0 : nvyVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        agke agkeVar = this.h;
        return (((iHashCode3 ^ (agkeVar != null ? agkeVar.hashCode() : 0)) * (-721379959)) ^ this.j.hashCode()) * 1000003;
    }

    public final String toString() {
        agkj agkjVar = this.j;
        agke agkeVar = this.h;
        nvy nvyVar = this.f;
        adfx adfxVar = this.i;
        nug nugVar = this.d;
        ntu ntuVar = this.c;
        return "ElementsConfig{converterProvider=" + String.valueOf(this.a) + ", layoutExecutor=null, logTag=" + this.b + ", perfLoggerFactory=" + String.valueOf(ntuVar) + ", elementsLifeCycleLogger=" + String.valueOf(nugVar) + ", elementsInteractionLogger=" + String.valueOf(adfxVar) + ", useIncrementalMount=" + this.e + ", enableLithoReconciliation=false, useSizeSpec=false, userData=null, recyclerConfig=" + String.valueOf(nvyVar) + ", nestedScrollingEnabled=" + this.g + ", clearComponentOnDetach=false, globalCommandEventDataDecorators=" + String.valueOf(agkeVar) + ", globalCommandEventWithViewDataDecorators=null, userDataMap=" + String.valueOf(agkjVar) + ", composableRepository=null}";
    }

    public ntx() {
        throw null;
    }
}
