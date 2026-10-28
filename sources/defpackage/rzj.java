package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzj implements sah {
    public final awmd a;
    private final awmd b;
    private final agkz c;

    public rzj(awmd awmdVar, awmd awmdVar2, agkz agkzVar) {
        this.b = awmdVar;
        this.a = awmdVar2;
        this.c = agkzVar;
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        apji apjiVar;
        if (this.c.contains(aixo.SLOT_TYPE_IN_PLAYER) && smrVar.g(aixo.SLOT_TYPE_PLAYBACK_TRACKING, sic.class, sid.class) && skoVar.f(aixg.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, new Class[0])) {
            String str = (String) smrVar.d(sic.class);
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            alvt alvtVarU = wjfVar.u();
            if ((alvtVarU.c & 2) != 0) {
                apjiVar = alvtVarU.E;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
            } else {
                apjiVar = null;
            }
            apji apjiVar2 = apjiVar;
            if (apjiVar2 != null) {
                ((roq) this.b.io()).f(19, skh.a(str, wjfVar), new rzo(this, skoVar, str, apjiVar2, 1));
            }
        }
    }
}
