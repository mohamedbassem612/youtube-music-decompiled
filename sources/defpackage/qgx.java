package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgx {
    public final String a;
    public final qci b;
    public final axgh c;
    public final agev d;
    public final agev e;
    public final agev f;
    public final agev g;
    public final boolean h;

    public qgx(String str, qci qciVar, axgh axghVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, boolean z) {
        this.a = str;
        this.b = qciVar;
        this.c = axghVar;
        this.d = agevVar;
        this.e = agevVar2;
        this.f = agevVar3;
        this.g = agevVar4;
        this.h = z;
    }

    public static qgw a() {
        qgw qgwVar = new qgw();
        qgwVar.g();
        qgwVar.f(false);
        return qgwVar;
    }

    public final boolean equals(Object obj) {
        qci qciVar;
        axgh axghVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgx) {
            qgx qgxVar = (qgx) obj;
            if (this.a.equals(qgxVar.a) && ((qciVar = this.b) != null ? qciVar.equals(qgxVar.b) : qgxVar.b == null) && ((axghVar = this.c) != null ? axghVar.equals(qgxVar.c) : qgxVar.c == null) && this.d.equals(qgxVar.d) && this.e.equals(qgxVar.e) && this.f.equals(qgxVar.f) && this.g.equals(qgxVar.g) && this.h == qgxVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        qci qciVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (qciVar == null ? 0 : qciVar.hashCode())) * 1000003;
        axgh axghVar = this.c;
        return ((((((((((((iHashCode2 ^ (axghVar != null ? axghVar.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        agev agevVar = this.g;
        agev agevVar2 = this.f;
        agev agevVar3 = this.e;
        agev agevVar4 = this.d;
        axgh axghVar = this.c;
        return "JankEventCollectionParameters{eventName=" + this.a + ", noPiiEventName=" + String.valueOf(this.b) + ", metricExtension=" + String.valueOf(axghVar) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + String.valueOf(agevVar4) + ", perfettoBucketOverride=" + String.valueOf(agevVar3) + ", perfettoTriggerJankFrameRatioThresholdOverride=" + String.valueOf(agevVar2) + ", perfettoTriggerJankDurationThresholdOverride=" + String.valueOf(agevVar) + ", triggerPerfettoFromBackground=" + this.h + '}';
    }

    public qgx() {
        throw null;
    }
}
