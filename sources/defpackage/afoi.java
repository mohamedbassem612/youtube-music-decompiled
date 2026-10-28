package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afoi {
    private static final agrf c = agrf.h("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager");
    public final afpa a;
    public final ahpu b;

    public afoi(ahpu ahpuVar, agev agevVar, afpa afpaVar) {
        this.b = ahpuVar;
        if (agevVar.g() && !(agevVar.c() instanceof qe)) {
            throw new IllegalStateException();
        }
        this.a = afpaVar;
    }

    public final afog a(affd affdVar) {
        try {
            return (afog) new bpn(this.a, new afoh(this, affdVar)).c("tt_activity_account_retained:".concat((affdVar == null ? "null" : Integer.valueOf(affdVar.a)).toString()), afog.class);
        } catch (IllegalArgumentException e) {
            afpa afpaVar = this.a;
            ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager", "getViewModel", 89, "TikTokActivityAccountRetainedComponentManager.java")).B("Failed to get ViewModel for ActivityAccountRetained, fragmentHost: %s, lifecycle: %s", new qdv(afpaVar instanceof afpa ? afpaVar.a.getClass() : afpaVar.getClass()), new qdv(afpaVar.getLifecycle().a()));
            throw e;
        }
    }

    public final Object b(affd affdVar) {
        Object obj;
        afog afogVarA = a(affdVar);
        synchronized (afogVarA.e) {
            if (afogVarA.f == null) {
                afuu afuuVarD = afwt.d(136, "ActAccRet#comp", afux.a, true);
                try {
                    ggu gguVarV = ((afoe) atqp.a(afogVarA.g.j(afogVarA.b), afoe.class)).v();
                    gguVarV.b = afogVarA.a;
                    aunt auntVar = afogVarA.c;
                    auntVar.getClass();
                    gguVarV.c = auntVar;
                    gguVarV.d = afogVarA.d;
                    atqq.b(gguVarV.b, boy.class);
                    atqq.b(gguVarV.c, aunt.class);
                    atqq.b(gguVarV.d, aupf.class);
                    afogVarA.f = new gju((ght) gguVarV.a, (gkg) gguVarV.e);
                    afuuVarD.close();
                } catch (Throwable th) {
                    try {
                        afuuVarD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            obj = afogVarA.f;
        }
        return obj;
    }
}
