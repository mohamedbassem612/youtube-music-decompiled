package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeeq implements aeeo {
    public final int a;
    public final asmv b;
    public final xgn c;
    public final aeem d;
    public final int e;
    public final nrv f;
    private final aigj g;
    private final int h;
    private final int i;

    public aeeq(int i, asmv asmvVar, xgn xgnVar, aigj aigjVar, aeem aeemVar, int i2, int i3, int i4, nrv nrvVar) {
        this.a = i;
        this.b = asmvVar;
        this.c = xgnVar;
        this.g = aigjVar;
        this.d = aeemVar;
        this.e = i2;
        this.h = i3;
        this.i = i4;
        this.f = nrvVar;
    }

    @Override // defpackage.aeeo
    public final int a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        asmv asmvVar;
        xgn xgnVar;
        aeem aeemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeeq) {
            aeeq aeeqVar = (aeeq) obj;
            if (this.a == aeeqVar.a && ((asmvVar = this.b) != null ? asmvVar.equals(aeeqVar.b) : aeeqVar.b == null) && ((xgnVar = this.c) != null ? xgnVar.equals(aeeqVar.c) : aeeqVar.c == null) && this.g.equals(aeeqVar.g) && ((aeemVar = this.d) != null ? aeemVar.equals(aeeqVar.d) : aeeqVar.d == null) && this.e == aeeqVar.e && this.h == aeeqVar.h) {
                int i = this.i;
                int i2 = aeeqVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    nrv nrvVar = this.f;
                    if (nrvVar == null) {
                        if (aeeqVar.f == null) {
                            return true;
                        }
                    } else if (nrvVar.equals(aeeqVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aeeo
    public final void f() {
        throw null;
    }

    public final int hashCode() {
        asmv asmvVar = this.b;
        int iHashCode = asmvVar == null ? 0 : asmvVar.hashCode();
        int i = this.a;
        xgn xgnVar = this.c;
        int iHashCode2 = ((((((i ^ 385623362) * 1000003) ^ iHashCode) * 1000003) ^ (xgnVar == null ? 0 : xgnVar.hashCode())) * 1000003) ^ this.g.hashCode();
        aeem aeemVar = this.d;
        int iHashCode3 = ((((((((iHashCode2 * 1000003) ^ (aeemVar == null ? 0 : aeemVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ this.e) * 1000003) ^ this.h) * 1000003;
        int i2 = this.i;
        a.by(i2);
        int i3 = (((iHashCode3 ^ i2) * 1000003) ^ 1237) * 1000003;
        nrv nrvVar = this.f;
        return i3 ^ (nrvVar != null ? nrvVar.hashCode() : 0);
    }

    public final String toString() {
        int i = this.i;
        return "DefaultElementsTransientUiModel{counterfactual=false, duration=" + this.a + ", element=" + String.valueOf(this.b) + ", interactionLogger=" + String.valueOf(this.c) + ", clickTrackingParams=" + String.valueOf(this.g) + ", transientUiCallback=" + String.valueOf(this.d) + ", rateLimited=false, bottomUiType=" + this.e + ", largeFormFactorWidthDp=" + this.h + ", snackbarAnimationStyle=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", shownOnFullscreen=false, commandEventData=" + String.valueOf(this.f) + '}';
    }

    public aeeq() {
        throw null;
    }
}
