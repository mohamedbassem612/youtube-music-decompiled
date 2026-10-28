package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afha {
    private boolean a;
    private byte b;
    private Object c;
    private Object d;

    public final afhb a() {
        Object obj = this.c;
        if (obj != null) {
            this.d = ((agjz) obj).g();
        } else if (this.d == null) {
            this.d = agpi.a;
        }
        if (this.b == 1) {
            return new afhb(this.a, (agke) this.d);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    public final void b(Class cls) {
        if (this.c == null) {
            this.c = new agjz(4);
        }
        ((agjz) this.c).h(cls);
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final xvq d() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.c) != null && (obj2 = this.d) != null) {
            return new xvq((dii) obj, this.a, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" route");
        }
        if (this.b == 0) {
            sb.append(" isEnabled");
        }
        if (this.d == null) {
            sb.append(" connectedBluetooth");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null connectedBluetooth");
        }
        this.d = str;
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void g(dii diiVar) {
        if (diiVar == null) {
            throw new NullPointerException("Null route");
        }
        this.c = diiVar;
    }
}
