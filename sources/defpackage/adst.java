package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adst {
    private tbt A;
    private advd B;
    private ttm C;
    private xgn D;
    private adww E;
    private adwj F;
    private vyo G;
    private avlh H;
    private vxz I;
    public adxd a;
    public advo b;
    public adtq c;
    public avlh d;
    public long e;
    public avmb f;
    public Queue g;
    public aecs h;
    public aunn i;
    public awmd j;
    public tqj k;
    public aunn l;
    public Executor m;
    public Executor n;
    public awmd o;
    public boolean p;
    public int q;
    public byte r;
    public vxz s;
    public vxz t;
    public vwt u;
    public abhh v;
    private View w;
    private admc x;
    private advo y;
    private wnf z;

    public final adwt a() {
        avlh avlhVarK;
        int i = ~this.q;
        if ((51078 & i) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.q & 2) == 0) {
                sb.append(" view");
            }
            if ((this.q & 4) == 0) {
                sb.append(" presenterAdapter");
            }
            if ((this.q & SemanticState.Focused) == 0) {
                sb.append(" eventBus");
            }
            if ((this.q & SemanticState.Hidden) == 0) {
                sb.append(" uiControllerFactory");
            }
            if ((this.q & SemanticState.LiveRegion) == 0) {
                sb.append(" errorHelper");
            }
            if ((this.q & SemanticState.ReadOnly) == 0) {
                sb.append(" interactionLogger");
            }
            if ((this.q & 16384) == 0) {
                sb.append(" hotConfigSupplier");
            }
            if ((this.q & 32768) == 0) {
                sb.append(" sectionListContinuationEventFlowable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        adxd adxdVar = this.a;
        View view = this.w;
        admc admcVar = this.x;
        advo advoVar = this.y;
        advo advoVar2 = this.b;
        wnf wnfVar = this.z;
        tbt tbtVar = this.A;
        advd advdVar = this.B;
        ttm ttmVar = this.C;
        xgn xgnVar = this.D;
        adtq adtqVar = this.c;
        adww adwwVar = this.E;
        adwj adwjVar = this.F;
        vyo vyoVar = this.G;
        wnf wnfVar2 = wnfVar;
        avlh avlhVar = this.H;
        avlh avlhVar2 = this.d;
        long j = this.e;
        avmb avmbVar = this.f;
        Queue arrayDeque = this.g;
        aecs aecsVar = this.h;
        aunn aunnVar = this.i;
        awmd awmdVar = this.j;
        vwt vwtVar = this.u;
        vxz vxzVar = this.I;
        vxz vxzVar2 = this.s;
        vxz vxzVar3 = this.t;
        abhh abhhVar = this.v;
        tqj tqjVar = this.k;
        aunn aunnVar2 = this.l;
        Executor executor = this.m;
        Executor executor2 = this.n;
        awmd awmdVar2 = this.o;
        boolean z = this.p;
        int i2 = ~this.r;
        if ((i & 64) != 0) {
            wnfVar2 = wnf.q;
        }
        if ((i & SemanticState.Obscured) != 0) {
            adwwVar = adww.yS;
        }
        if ((i & SemanticState.Multiline) != 0) {
            adwjVar = adwj.c;
        }
        if ((65536 & i) != 0) {
            avlhVarK = avlh.K();
            avlhVarK.getClass();
        } else {
            avlhVarK = avlhVar2;
        }
        long j2 = (i & 131072) != 0 ? 1000L : j;
        if ((i & 524288) != 0) {
            arrayDeque = new ArrayDeque();
        }
        if ((i & 1048576) != 0) {
            aecsVar = aecs.b;
        }
        if ((i & 268435456) != 0) {
            vxzVar3 = null;
        }
        if ((i2 & 4) != 0) {
            executor2 = null;
        }
        return new adwt(adxdVar, view, admcVar, advoVar, advoVar2, wnfVar2, tbtVar, advdVar, ttmVar, xgnVar, adtqVar, adwwVar, adwjVar, vyoVar, avlhVar, avlhVarK, j2, avmbVar, arrayDeque, aecsVar, aunnVar, awmdVar, vwtVar, vxzVar, vxzVar2, vxzVar3, abhhVar, tqjVar, aunnVar2, executor, executor2, awmdVar2, ((i2 & 32) == 0) & z);
    }

    public final void b(ttm ttmVar) {
        if (ttmVar == null) {
            throw new NullPointerException("Null errorHelper");
        }
        this.C = ttmVar;
        this.q |= SemanticState.LiveRegion;
    }

    public final void c(tbt tbtVar) {
        if (tbtVar == null) {
            throw new NullPointerException("Null eventBus");
        }
        this.A = tbtVar;
        this.q |= SemanticState.Focused;
    }

    public final void d(vyo vyoVar) {
        if (vyoVar == null) {
            throw new NullPointerException("Null hotConfigSupplier");
        }
        this.G = vyoVar;
        this.q |= 16384;
    }

    public final void e(xgn xgnVar) {
        if (xgnVar == null) {
            throw new NullPointerException("Null interactionLogger");
        }
        this.D = xgnVar;
        this.q |= SemanticState.ReadOnly;
    }

    public final void f(advo advoVar) {
        this.y = advoVar;
        this.q |= 8;
    }

    public final void g(admc admcVar) {
        this.x = admcVar;
        this.q |= 4;
    }

    public final void h(adwj adwjVar) {
        this.F = adwjVar;
        this.q |= SemanticState.Multiline;
    }

    public final void i(avlh avlhVar) {
        if (avlhVar == null) {
            throw new NullPointerException("Null sectionListContinuationEventFlowable");
        }
        this.H = avlhVar;
        this.q |= 32768;
    }

    public final void j(adww adwwVar) {
        this.E = adwwVar;
        this.q |= SemanticState.Obscured;
    }

    public final void k(wnf wnfVar) {
        if (wnfVar == null) {
            throw new NullPointerException("Null service");
        }
        this.z = wnfVar;
        this.q |= 64;
    }

    public final void l(advd advdVar) {
        this.B = advdVar;
        this.q |= SemanticState.Hidden;
    }

    public final void m(vxz vxzVar) {
        this.I = vxzVar;
        this.q |= 33554432;
    }

    public final void n(View view) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.w = view;
        this.q |= 2;
    }
}
