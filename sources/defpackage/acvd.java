package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvd {
    public zwa c;
    private final wbz f;
    private final hno g;
    private final ahub h;
    public final awli a = new awli(Boolean.FALSE);
    public volatile boolean b = false;
    private volatile boolean d = false;
    private volatile apds e = apds.REEL_CONTENT_CLEAR_MODE_STATE_INACTIVE;

    public acvd(hno hnoVar, ahub ahubVar, wbz wbzVar) {
        this.g = hnoVar;
        this.h = ahubVar;
        this.f = wbzVar;
    }

    private final void c(apds apdsVar) {
        if (this.e != apdsVar) {
            this.e = apdsVar;
            ((awli) this.h.a).kk(apdsVar);
        }
    }

    private final void d(zwa zwaVar) {
        wby wbyVarB = this.f.e(zwaVar);
        ajlt ajltVarE = ajlu.e(wfs.g(ajlv.b.a(), "shorts_clear_mode_global_key"));
        ajltVarE.am(Boolean.FALSE);
        ajlu ajluVarAn = ajltVarE.an();
        wer werVarE = wbyVarB.e();
        werVarE.e(ajluVarAn);
        werVarE.b().D();
    }

    public final void a() {
        zwa zwaVar = this.c;
        hno hnoVar = this.g;
        boolean zL = ((vxz) hnoVar.i).l(282, 45824745L, false);
        boolean z = this.b;
        if (!zL) {
            this.b = false;
            if (b()) {
                this.a.kk(Boolean.FALSE);
                if (hnoVar.F()) {
                    c(apds.REEL_CONTENT_CLEAR_MODE_STATE_INACTIVE);
                }
                if (zwaVar != null) {
                    d(zwaVar);
                    return;
                }
                return;
            }
            return;
        }
        if (!b()) {
            boolean z2 = this.d;
            return;
        }
        boolean z3 = this.b;
        this.b = false;
        this.d = false;
        if (b()) {
            this.a.kk(Boolean.FALSE);
            if (hnoVar.F()) {
                c(apds.REEL_CONTENT_CLEAR_MODE_STATE_INACTIVE);
            }
            if (zwaVar != null) {
                d(zwaVar);
            }
        }
    }

    public final boolean b() {
        Boolean bool = (Boolean) this.a.au();
        return bool != null && bool.booleanValue();
    }
}
