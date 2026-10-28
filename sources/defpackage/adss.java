package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adss {
    public advz a;
    public avlh b;
    public byte c;
    private adwt d;
    private admh e;

    public final adwh a() {
        int i = ~this.c;
        if ((i & 3) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" commonConfig");
            }
            if ((this.c & 2) == 0) {
                sb.append(" viewPool");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        adwt adwtVar = this.d;
        admh admhVar = this.e;
        advz advzVar = this.a;
        avlh avlhVar = this.b;
        if ((i & 4) != 0) {
            advzVar = adwg.aw;
        }
        return new adwh(adwtVar, admhVar, advzVar, avlhVar);
    }

    public final void b(adwt adwtVar) {
        this.d = adwtVar;
        this.c = (byte) (this.c | 1);
    }

    public final void c(admh admhVar) {
        if (admhVar == null) {
            throw new NullPointerException("Null viewPool");
        }
        this.e = admhVar;
        this.c = (byte) (this.c | 2);
    }
}
