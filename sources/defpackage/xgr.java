package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xgr {
    private argn a;
    private atqd b;
    private byte c;

    public final xgs a() {
        argn argnVar;
        atqd atqdVar;
        if (this.c == 1 && (argnVar = this.a) != null && (atqdVar = this.b) != null) {
            return new xgs(argnVar, atqdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" describeContents");
        }
        if (this.a == null) {
            sb.append(" ve");
        }
        if (this.b == null) {
            sb.append(" fvlCriteria");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = (byte) 1;
    }

    public final void c(atqd atqdVar) {
        if (atqdVar == null) {
            throw new NullPointerException("Null fvlCriteria");
        }
        this.b = atqdVar;
    }

    public final void d(argn argnVar) {
        if (argnVar == null) {
            throw new NullPointerException("Null ve");
        }
        this.a = argnVar;
    }
}
