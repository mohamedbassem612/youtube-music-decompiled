package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wkw implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wkw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v33, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v52, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v57, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v64, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v89, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        xid xidVar;
        boolean zA = true;
        switch (this.$cid) {
            case 0:
                return this.a.getClass();
            case 1:
                return Boolean.valueOf(((tmn) this.a).H());
            case 2:
                Object obj = this.a;
                wkx wkxVar = (wkx) obj;
                int i = wkxVar.l.B - 1;
                if (i == 0 || i == 1) {
                    zA = wkxVar.n.a();
                } else if (i == 2) {
                    zA = wkxVar.o.a();
                }
                ((tmn) obj).K(zA ? wlv.b : wlv.a);
                return Boolean.valueOf(zA);
            case 3:
                return Double.valueOf(((vxz) this.a).b(1, 45417017L));
            case 4:
                return (tgg) this.a.io();
            case 5:
                int i2 = tqr.a;
                return Boolean.valueOf(this.a.k(1073828824));
            case 6:
                return (tgg) this.a.io();
            case 7:
                int i3 = tqr.a;
                return Boolean.valueOf(this.a.k(1073828824));
            case 8:
                return Boolean.valueOf(((vxz) this.a).l(73, 45614663L, false));
            case 9:
                return Boolean.valueOf(((vxz) this.a).l(83, 45623208L, false));
            case 10:
                xidVar = new xid(((xej) this.a.io()).a());
                break;
            case 11:
                ajvu ajvuVarC = ((vxu) this.a).c();
                anhb anhbVar = ajvuVarC.j;
                if (anhbVar == null) {
                    anhbVar = anhb.a;
                }
                if ((anhbVar.b & SemanticState.Modal) != 0) {
                    anhb anhbVar2 = ajvuVarC.j;
                    if (anhbVar2 == null) {
                        anhbVar2 = anhb.a;
                    }
                    amdz amdzVar = anhbVar2.f;
                    return amdzVar == null ? amdz.a : amdzVar;
                }
                aihf aihfVarCreateBuilder = amdz.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amdz amdzVar2 = (amdz) aihfVarCreateBuilder.instance;
                amdzVar2.b |= 1;
                amdzVar2.c = true;
                return (amdz) aihfVarCreateBuilder.build();
            case 12:
                int i4 = tqr.a;
                return Boolean.valueOf(this.a.k(1073828605));
            case 13:
                return Boolean.valueOf(((vxz) this.a.io()).l(80, 45620856L, false));
            case 14:
                return Double.valueOf(((vxz) this.a.io()).a(2, 45620857L, 0.0d));
            case 15:
                xidVar = new xid(((xej) this.a).a());
                break;
            case 16:
                return Boolean.valueOf(((vxz) this.a.io()).l(101, 45642407L, false));
            case 17:
                return Integer.valueOf(((xkd) this.a).e().a());
            case 18:
                ajvu ajvuVarC2 = ((vxu) this.a).c();
                if (ajvuVarC2 == null) {
                    return "https://www.youtube.com/csi_204";
                }
                anhb anhbVar3 = ajvuVarC2.j;
                if (anhbVar3 == null) {
                    anhbVar3 = anhb.a;
                }
                akja akjaVar = anhbVar3.o;
                if (akjaVar == null) {
                    akjaVar = akja.a;
                }
                amuo amuoVar = akjaVar.b;
                if (amuoVar == null) {
                    amuoVar = amuo.a;
                }
                if (amuoVar.c.isEmpty()) {
                    return "https://www.youtube.com/csi_204";
                }
                anhb anhbVar4 = ajvuVarC2.j;
                if (anhbVar4 == null) {
                    anhbVar4 = anhb.a;
                }
                akja akjaVar2 = anhbVar4.o;
                if (akjaVar2 == null) {
                    akjaVar2 = akja.a;
                }
                amuo amuoVar2 = akjaVar2.b;
                if (amuoVar2 == null) {
                    amuoVar2 = amuo.a;
                }
                return amuoVar2.c;
            case 19:
                return ((ytx) this.a.io()).io();
            default:
                return Long.valueOf(((yyv) this.a).d());
        }
        return xidVar;
    }
}
