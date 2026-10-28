package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgb implements rem {
    private final rfs a;
    private final rgh b;

    public rgb(rfs rfsVar, rgh rghVar) {
        this.a = rfsVar;
        this.b = rghVar;
    }

    @Override // defpackage.rem
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.rem
    public final void b(rfs rfsVar) throws bvn {
        rgh rghVar = this.b;
        rfs rfsVar2 = this.a;
        rghVar.c(rfsVar2);
        if (!rfsVar2.i().isEmpty()) {
            rfsVar.o(rfsVar2.i());
        } else if (rfsVar2.m() != null) {
            rfsVar.c.h.add(new rfp(rfsVar2.m(), rfsVar2.n()));
        }
    }
}
