package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xop implements tdj {
    public final xou b;
    private final boolean d;
    private final tre e;
    private final ycp h;
    private final xkw i;
    private final vxz j;
    private final dov k;
    public final Map a = new ConcurrentHashMap();
    final avmm c = new avmm();
    private boolean g = false;

    public xop(dov dovVar, xou xouVar, ycp ycpVar, xkw xkwVar, vxz vxzVar, tqj tqjVar, tre treVar) {
        this.k = dovVar;
        this.b = xouVar;
        this.h = ycpVar;
        this.i = xkwVar;
        this.j = vxzVar;
        int i = tqr.a;
        this.d = tqjVar.a(1073951412) != 0 || vxzVar.l(224, 45789833L, false);
        this.e = treVar;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsh.b(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.c;
    }

    public final void d() {
        this.c.b();
        this.a.clear();
    }

    public final void e() {
        if (this.h.e != null) {
            agrx agrxVar = agso.a;
            this.b.a(false);
            return;
        }
        trd trdVar = this.e.h;
        if (trdVar.a(SemanticState.Hidden) == 13 || trdVar.a(260) == 13) {
            this.g = true;
        }
        if (this.g) {
            agrx agrxVar2 = agso.a;
            this.b.a(false);
            return;
        }
        dov dovVar = this.k;
        aihf aihfVarCreateBuilder = algu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        algu alguVar = (algu) aihfVarCreateBuilder.instance;
        alguVar.c = 5;
        alguVar.b |= 2;
        algp algpVar = algp.HANDOFF_FEATURE_TYPE_UNKNOWN;
        aihfVarCreateBuilder.copyOnWrite();
        algu alguVar2 = (algu) aihfVarCreateBuilder.instance;
        alguVar2.d = algpVar.x;
        alguVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        algu alguVar3 = (algu) aihfVarCreateBuilder.instance;
        alguVar3.e = 1;
        alguVar3.b |= 16;
        algu alguVar4 = (algu) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = alrf.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        alrf alrfVar = (alrf) aihfVarCreateBuilder2.instance;
        alguVar4.getClass();
        alrfVar.d = alguVar4;
        alrfVar.c = 3;
        ListenableFuture listenableFutureA = ((xow) dovVar.a).a(aihfVarCreateBuilder2);
        xou xouVar = this.b;
        xouVar.getClass();
        hvf hvfVar = new hvf(xouVar, 3);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(hvfVar, null, taf.b);
        long j = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public final void f() {
        vxz vxzVar = this.j;
        if (vxzVar.l(142, 45645382L, false)) {
            this.b.a(false);
            return;
        }
        if (vxzVar.l(105, 45615440L, false)) {
            e();
            return;
        }
        avmm avmmVar = this.c;
        xkw xkwVar = this.i;
        awcu awcuVar = new awcu(new avlu[]{xkwVar.g.r(), xkwVar.h.r(), xkwVar.i.r()});
        avnn avnnVar = atqp.l;
        avmmVar.c(awcuVar.C(avoi.a, 3).R().af(new vub(this, 19)));
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsh.c(this);
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        if (this.d) {
            return;
        }
        d();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (this.d) {
            return;
        }
        f();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
