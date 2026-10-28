package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class absf implements absn {
    public final alvl a;
    public final sxu b;
    public final /* synthetic */ absg c;
    private final String d;

    public absf(absg absgVar, alvl alvlVar, String str, sxu sxuVar) {
        this.c = absgVar;
        this.a = alvlVar;
        this.d = str;
        this.b = sxuVar;
    }

    @Override // defpackage.absn
    public final void a() {
        absh.a(this.b, this.c.i(this.d));
    }
}
