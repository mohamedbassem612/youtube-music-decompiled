package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihs implements hzv {
    public ihn a;
    public final hzp c;
    private boolean d;
    public ihl b = ihl.STATE_INDIFFERENT;
    private amlg e = amlg.INDIFFERENT;

    public ihs(hzp hzpVar) {
        this.c = hzpVar;
        hzpVar.a(this);
    }

    private final void b() {
        ihn ihnVar = this.a;
        if (ihnVar != null) {
            ihr ihrVar = (ihr) ihnVar;
            if (ihrVar.h || ihrVar.i) {
                return;
            }
            agrx agrxVar = agso.a;
            if (ihr.f(ihrVar.c.b()) != 0) {
                ihrVar.e();
            }
        }
    }

    public final ihl a(amlg amlgVar) {
        if (!this.d) {
            return ihl.STATE_HIDDEN;
        }
        ihl ihlVar = ihl.STATE_INDIFFERENT;
        int iOrdinal = amlgVar.ordinal();
        if (iOrdinal == 0) {
            return ihl.STATE_LIKED;
        }
        if (iOrdinal == 1) {
            return ihl.STATE_DISLIKED;
        }
        if (iOrdinal == 2) {
            return ihl.STATE_INDIFFERENT;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.hzv
    public final void h(Optional optional) {
        this.d = true;
        hlx hlxVar = new hlx(this, 10);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            optional = Optional.ofNullable(((ihs) hlxVar.a).a((amlg) obj));
        }
        this.b = (ihl) optional.orElse(ihl.STATE_HIDDEN);
        b();
    }

    @Override // defpackage.hzv
    public final void m(aihh aihhVar) {
        amlg amlgVarEa = aihhVar != null ? yno.ea(aihhVar) : amlg.INDIFFERENT;
        boolean z = false;
        if (aihhVar != null && ((amks) aihhVar.instance).f) {
            z = true;
        }
        if (this.e == amlgVarEa && this.d == z) {
            return;
        }
        this.e = amlgVarEa;
        this.d = z;
        this.b = a(amlgVarEa);
        b();
    }
}
