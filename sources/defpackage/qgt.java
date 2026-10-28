package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgt {
    public final qhb a;
    public final axgh b;
    public final agev c;
    public final agev d;
    public final agev e;
    public final agev f;
    public final boolean g;

    public qgt(qhb qhbVar, axgh axghVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, boolean z) {
        this.a = qhbVar;
        this.b = axghVar;
        if (agevVar == null) {
            throw new NullPointerException("Null perfettoTimeoutOverride");
        }
        this.c = agevVar;
        if (agevVar2 == null) {
            throw new NullPointerException("Null perfettoBucketOverride");
        }
        this.d = agevVar2;
        if (agevVar3 == null) {
            throw new NullPointerException("Null perfettoTriggerJankFrameRatioThresholdOverride");
        }
        this.e = agevVar3;
        if (agevVar4 == null) {
            throw new NullPointerException("Null perfettoTriggerJankDurationThresholdOverride");
        }
        this.f = agevVar4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        axgh axghVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgt) {
            qgt qgtVar = (qgt) obj;
            if (this.a.equals(qgtVar.a) && ((axghVar = this.b) != null ? axghVar.equals(qgtVar.b) : qgtVar.b == null) && this.c.equals(qgtVar.c) && this.d.equals(qgtVar.d) && this.e.equals(qgtVar.e) && this.f.equals(qgtVar.f) && this.g == qgtVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        axgh axghVar = this.b;
        return (((((((((((((iHashCode * 1000003) ^ (axghVar == null ? 0 : axghVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        agev agevVar = this.f;
        agev agevVar2 = this.e;
        agev agevVar3 = this.d;
        agev agevVar4 = this.c;
        axgh axghVar = this.b;
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=" + String.valueOf(axghVar) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + String.valueOf(agevVar4) + ", perfettoBucketOverride=" + String.valueOf(agevVar3) + ", perfettoTriggerJankFrameRatioThresholdOverride=" + String.valueOf(agevVar2) + ", perfettoTriggerJankDurationThresholdOverride=" + String.valueOf(agevVar) + ", triggerPerfettoFromBackground=" + this.g + '}';
    }

    public qgt() {
        throw null;
    }
}
