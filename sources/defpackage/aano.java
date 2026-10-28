package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aano {
    public boolean a;
    public byte b = 1;
    public int c;
    public int d;
    public Object e;

    public aano(aanp aanpVar) {
        this.c = aanpVar.f;
        this.d = aanpVar.g;
        this.a = aanpVar.d;
        this.e = aanpVar.e;
    }

    public static /* synthetic */ Object d(Object obj) {
        aanq aanqVar = (aanq) obj;
        int iBc = a.bc(aanqVar.c.c);
        if (iBc == 0) {
            iBc = 1;
        }
        return String.format("[%s, %s]", agvp.F(iBc), aanqVar.d());
    }

    public final aanp a() {
        boolean z = true;
        if (this.b == 1 && this.c != 0 && this.d != 0 && this.e != null) {
            aanp aanpVar = new aanp(this.c, this.d, this.a, (agke) this.e);
            int i = aanpVar.f;
            if (i == 1) {
                throw new IllegalArgumentException();
            }
            if (i != 2 && !aanpVar.e.isEmpty()) {
                z = false;
            }
            ahno.P(z, "Failed EntityControllerResult cannot contain additional actions.");
            return aanpVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" orchestrationActionResult");
        }
        if (this.d == 0) {
            sb.append(" orchestrationFailureReason");
        }
        if (this.b == 0) {
            sb.append(" retryable");
        }
        if (this.e == null) {
            sb.append(" additionalActions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null additionalActions");
        }
        this.e = agkeVar;
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ahey, java.lang.Object] */
    public final qcr e() {
        if (this.b == 7) {
            qcr qcrVar = new qcr(this.e, this.d, this.c, this.a);
            ahno.Q(qcrVar.c > 0, "Thread pool size must be less than or equal to %s", 2);
            return qcrVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.b & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.b & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
