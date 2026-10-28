package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsf {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g = 3;
    private int h;

    public ahsf(ahsg ahsgVar) {
        this.a = ahsgVar.a;
        this.h = ahsgVar.g;
        this.b = ahsgVar.b;
        this.c = ahsgVar.c;
        this.e = ahsgVar.d;
        this.f = ahsgVar.e;
        this.d = ahsgVar.f;
    }

    public final ahsg a() {
        if (this.g == 3 && this.h != 0) {
            return new ahsg(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }
}
