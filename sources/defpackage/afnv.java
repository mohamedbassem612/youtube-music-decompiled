package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afnv implements auph {
    public final afod a;
    private final Object b = new Object();
    private final afol c;
    private final afok d;
    private volatile gkb e;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public afnv(affd affdVar, afol afolVar, Object obj) {
        afok afokVar;
        this.c = afolVar;
        axqr axqrVarCg = ((afnt) atqp.a(obj, afnt.class)).cg();
        synchronized (axqrVarCg.a) {
            if (!axqrVarCg.b.containsKey(affdVar)) {
                ?? r2 = axqrVarCg.b;
                ahno.R(a.aJ(((afpa) axqrVarCg.d).a.getApplicationContext()) instanceof auph, "Sting Activity must be attached to an @Sting Application. Found: %s", ((afpa) axqrVarCg.d).a.getApplicationContext());
                ghj ghjVar = ((ghi) ((hhb) axqrVarCg.c).a).b;
                r2.put(affdVar, new afok(affdVar, ghjVar.at(), (afpa) ghjVar.fr.io(), ghjVar.ar()));
            }
            afokVar = (afok) axqrVarCg.b.get(affdVar);
        }
        this.d = afokVar;
        afod afodVar = new afod(affdVar, afolVar, obj);
        this.a = afodVar;
        bpt defaultViewModelCreationExtras = afolVar.getDefaultViewModelCreationExtras();
        auor auorVar = afodVar.a().b;
        auorVar.b(defaultViewModelCreationExtras);
        afolVar.getLifecycle().b(new afns(auorVar, 0));
    }

    @Override // defpackage.auph
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gkb generatedComponent() {
        if (this.e == null) {
            synchronized (this.b) {
                if (this.e == null) {
                    gjt gjtVarA = this.d.generatedComponent();
                    afoz afozVarB = this.a.generatedComponent();
                    gis gisVarAi = ((afnu) atqp.a(gjtVarA, afnu.class)).ai();
                    afozVarB.getClass();
                    gisVarAi.b = afozVarB;
                    gisVarAi.c = this.c;
                    atqq.b(gisVarAi.b, afoz.class);
                    atqq.b(gisVarAi.c, afol.class);
                    gjt gjtVar = gisVarAi.f;
                    gju gjuVar = gisVarAi.e;
                    this.e = new gkb(gisVarAi.a, gisVarAi.d, gjuVar, gjtVar);
                }
            }
        }
        return this.e;
    }
}
