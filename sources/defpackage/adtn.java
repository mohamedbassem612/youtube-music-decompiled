package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adtn {
    public acjx a;
    public agev b;
    public twi c;
    public agev d;
    public agke e;
    public adtl f;
    public amdd g;
    private boolean h;
    private boolean i;
    private boolean j;
    private byte k;

    public adtn(adto adtoVar) {
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.d = agdfVar;
        this.a = adtoVar.a;
        this.b = adtoVar.b;
        this.c = adtoVar.c;
        this.d = adtoVar.d;
        this.e = adtoVar.e;
        this.h = adtoVar.f;
        this.f = adtoVar.g;
        this.i = adtoVar.h;
        this.g = adtoVar.i;
        this.j = adtoVar.j;
        this.k = (byte) 7;
    }

    public final adto a() {
        acjx acjxVar;
        twi twiVar;
        adtl adtlVar;
        amdd amddVar;
        if (this.e == null) {
            this.e = agpi.a;
        }
        if (this.k == 7 && (acjxVar = this.a) != null && (twiVar = this.c) != null && (adtlVar = this.f) != null && (amddVar = this.g) != null) {
            return new adto(acjxVar, this.b, twiVar, this.d, this.e, this.h, adtlVar, this.i, amddVar, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" continuation");
        }
        if (this.c == null) {
            sb.append(" requestMutator");
        }
        if ((this.k & 1) == 0) {
            sb.append(" skipDefaultContinuationListener");
        }
        if (this.f == null) {
            sb.append(" continuationContext");
        }
        if ((this.k & 2) == 0) {
            sb.append(" isRequestInfoCachable");
        }
        if (this.g == null) {
            sb.append(" clientData");
        }
        if ((this.k & 4) == 0) {
            sb.append(" isRefresh");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 4);
    }

    public final void c(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 2);
    }

    public final void d(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 1);
    }

    public adtn() {
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.d = agdfVar;
    }
}
