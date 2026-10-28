package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afod implements auph {
    public static final agrf a = agrf.h("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager");
    private final affd b;
    private final bpp c;
    private final Object d;

    public afod(affd affdVar, afol afolVar, Object obj) {
        this.b = affdVar;
        this.c = afolVar;
        this.d = obj;
    }

    public final afoa a() {
        bpn bpnVar = new bpn(this.c, new auoa(this, 1));
        affd affdVar = this.b;
        return (afoa) bpnVar.c("tt_screen_account_retained:".concat((affdVar == null ? "null" : Integer.valueOf(affdVar.a)).toString()), afoa.class);
    }

    @Override // defpackage.auph
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final afoz generatedComponent() {
        afoz afozVar;
        Object objC = c();
        afoa afoaVarA = a();
        synchronized (afoaVarA.d) {
            if (afoaVarA.e == null) {
                afoaVarA.a = objC;
                acda acdaVarC = ((afnz) atqp.a(objC, afnz.class)).c();
                acdaVarC.c = afoaVarA.b;
                acdaVarC.d = afoaVarA.c;
                atqq.b(acdaVarC.c, auor.class);
                atqq.b(acdaVarC.d, aupf.class);
                Object obj = acdaVarC.e;
                afoaVarA.e = new gkc((ght) acdaVarC.a, (gkg) acdaVarC.b, (gju) obj);
            } else if (afoaVarA.a != objC) {
                ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager$ScreenAccountRetainedComponentViewModel", "component", 173, "ScreenAccountRetainedComponentManager.java")).t("ScreenAccountRetainedComponent already created with a different ActivityAccountRetainedComponent");
            }
            afozVar = afoaVarA.e;
        }
        return afozVar;
    }

    public final Object c() {
        return ((afoc) atqp.a(this.d, afoc.class)).ar().b(this.b);
    }
}
