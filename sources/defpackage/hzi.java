package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzi implements abdz {
    public static final /* synthetic */ int c = 0;
    private static final agkj d;
    private static final agkj e;
    public xir a;
    public boolean b;
    private final xit f;
    private final abea g;
    private final vxz h;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(abtt.NEXT, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT);
        agkhVar.e(abtt.PREVIOUS, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS);
        agkhVar.e(abtt.AUTOPLAY, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV);
        agkhVar.e(abtt.AUTONAV, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV);
        agkhVar.e(abtt.JUMP, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP);
        d = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        agkhVar2.e(abtt.NEXT, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT);
        agkhVar2.e(abtt.PREVIOUS, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS);
        agkhVar2.e(abtt.AUTOPLAY, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV);
        agkhVar2.e(abtt.AUTONAV, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV);
        agkhVar2.e(abtt.JUMP, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP);
        agkhVar2.e(abtt.INSERT, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP);
        e = agkhVar2.d(true);
    }

    public hzi(xit xitVar, abvn abvnVar, abea abeaVar, vxz vxzVar) {
        this.f = xitVar;
        this.g = abeaVar;
        this.h = vxzVar;
        abvnVar.C().H(new hbz(14)).al(new hxi(this, 7), new hyx(2));
        abeaVar.e(this);
    }

    public static xir a(xit xitVar, amjr amjrVar) {
        xir xirVarN = xitVar.n(4);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiuVar.b |= SemanticState.Focused;
        amiuVar.j = "warm";
        aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
        amiwVar.e = amjrVar.o;
        amiwVar.b |= 8;
        amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
        amiwVar2.getClass();
        amiuVar2.N = amiwVar2;
        amiuVar2.d |= 8;
        xirVarN.h((amiu) aihfVarCreateBuilder.build());
        return xirVarN;
    }

    public static void d(xir xirVar, amjr amjrVar) {
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiuVar.b |= SemanticState.Focused;
        amiuVar.j = "warm";
        aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
        amiwVar.e = amjrVar.o;
        amiwVar.b |= 8;
        amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
        amiwVar2.getClass();
        amiuVar2.N = amiwVar2;
        amiuVar2.d |= 8;
        xirVar.h((amiu) aihfVarCreateBuilder.build());
    }

    public static xir e(xit xitVar, vxz vxzVar, abtt abttVar) {
        return a(xitVar, vxzVar.m(17, 45648164L) ? (amjr) e.getOrDefault(abttVar, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_UNKNOWN) : (amjr) d.getOrDefault(abttVar, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_UNKNOWN));
    }

    public final abtu c(abtt abttVar, abnl abnlVar, Map map) {
        xit xitVar = this.f;
        abno abnoVarA = abnp.a();
        abnoVarA.a = e(xitVar, this.h, abttVar);
        return new abtu(abttVar, abnlVar, abnoVarA.a(), map);
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        xgn xgnVarA;
        if (!this.b || !abdy.b.equals(abdyVar) || this.a == null || (xgnVarA = this.g.a()) == null) {
            return;
        }
        this.b = false;
        this.a.m(xgnVarA.i());
    }
}
