package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ycj extends yau {
    public static final /* synthetic */ int G = 0;
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionImpl");
    public final Optional B;
    public final amyv C;
    protected final ycp D;
    public final ycp E;
    public final wjr F;
    private boolean e;
    private boolean f;
    private final vxz g;
    public final Context r;
    public final ttm s;
    protected final int w;
    protected final xla x;
    protected xze z;
    public xyv t = xyv.a;
    private final List b = new ArrayList();
    private amyu c = amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
    private Optional d = Optional.empty();
    public ycr A = null;
    protected int u = 0;
    protected int v = 0;
    protected abjx y = abjx.a;

    protected ycj(Context context, ycp ycpVar, ycp ycpVar2, wjr wjrVar, ttm ttmVar, xla xlaVar, amyv amyvVar, Optional optional, vxz vxzVar, xze xzeVar) {
        this.r = context;
        this.D = ycpVar;
        this.E = ycpVar2;
        this.F = wjrVar;
        this.s = ttmVar;
        this.w = xlaVar.u();
        this.x = xlaVar;
        this.C = amyvVar;
        this.B = optional;
        this.g = vxzVar;
        this.z = xzeVar;
    }

    @Override // defpackage.xzc
    public void I(xyv xyvVar) {
        xze xzeVar = this.z;
        aihf aihfVarCreateBuilder = amiz.a.createBuilder();
        int i = xzeVar.k;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder.instance;
        amizVar.g = i - 1;
        amizVar.b |= 16;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar2 = (amiz) aihfVarCreateBuilder.instance;
        amizVar2.h = this.C.E;
        amizVar2.b |= 32;
        String str = xzeVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar3 = (amiz) aihfVarCreateBuilder.instance;
        amizVar3.b |= 64;
        amizVar3.i = str;
        long j = xzeVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar4 = (amiz) aihfVarCreateBuilder.instance;
        amizVar4.b |= SemanticState.Focused;
        amizVar4.j = j;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar5 = (amiz) aihfVarCreateBuilder.instance;
        amizVar5.b |= SemanticState.Hidden;
        amizVar5.k = false;
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar6 = (amiz) aihfVarCreateBuilder.instance;
        amizVar6.b |= SemanticState.LiveRegion;
        amizVar6.l = false;
        this.F.y((amiz) aihfVarCreateBuilder.build());
        this.c = amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        this.d = Optional.empty();
        this.v = 0;
        this.y = abjx.a;
        this.u = 0;
        this.t = xyvVar;
        aA();
        this.D.c(this);
    }

    @Override // defpackage.xzc
    public final void J() {
        aP(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER, Optional.empty());
    }

    @Override // defpackage.xzc
    public void Q(xvj xvjVar) {
        xze xzeVar = this.z;
        if (xzeVar == null || xzeVar.k != 2) {
            agrx agrxVar = agso.a;
        }
    }

    @Override // defpackage.xzc
    public final void R() {
        xze xzeVar = this.z;
        if (xzeVar == null || xzeVar.k != 2) {
            agrx agrxVar = agso.a;
            return;
        }
        ycr ycrVar = this.A;
        if (ycrVar != null) {
            Handler handler = ((yam) ycrVar).F;
            Message messageObtain = Message.obtain(handler, 6);
            handler.removeMessages(3);
            handler.sendMessage(messageObtain);
        }
    }

    @Override // defpackage.xzc
    public final void U(xyv xyvVar) {
        ycr ycrVar = this.A;
        if (ycrVar == null) {
            this.t = xyvVar;
            return;
        }
        ahno.F(xyvVar.e());
        yam yamVar = (yam) ycrVar;
        xyv xyvVarD = yamVar.d(xyvVar);
        int i = yamVar.I;
        if (i == 0 || i == 1) {
            agrx agrxVar = agso.a;
            yamVar.D = xyvVar;
            return;
        }
        boolean zH = yamVar.M.h(xyvVarD);
        boolean zH2 = yamVar.L.h(xyvVarD);
        if (!zH && !zH2) {
            yamVar.q(xvu.SET_PLAYLIST, yamVar.c(xyvVarD));
            return;
        }
        agrx agrxVar2 = agso.a;
        if (zH) {
            yamVar.M = xyv.a;
        }
        if (yamVar.K != xyw.PLAYING) {
            yamVar.p();
        }
    }

    @Override // defpackage.yau
    protected final ycr aJ() {
        return this.A;
    }

    @Override // defpackage.yco
    public final int aN() {
        return this.u;
    }

    public final ListenableFuture aO() {
        ycr ycrVar = this.A;
        if (!(ycrVar instanceof yam)) {
            return null;
        }
        yam yamVar = (yam) ycrVar;
        xla xlaVar = yamVar.f;
        if (xlaVar.K() <= 0 || !yamVar.y()) {
            return ahng.n(Boolean.FALSE);
        }
        yamVar.q(xvu.GET_RECEIVER_STATUS, new xvy());
        ahew ahewVar = yamVar.ah;
        if (ahewVar != null) {
            ahewVar.cancel(false);
        }
        yamVar.ah = yamVar.q.schedule(new fxv(15), xlaVar.K(), TimeUnit.MILLISECONDS);
        return afxd.f(yamVar.ah).g(new xwx(3), MoreExecutors.directExecutor()).b(CancellationException.class, new xwx(4), MoreExecutors.directExecutor()).b(Exception.class, new xwx(5), MoreExecutors.directExecutor());
    }

    public final void aP(amyu amyuVar, Optional optional) {
        taf.g(q(amyuVar, optional), new uqk(5));
    }

    @Override // defpackage.yco
    public final void aQ(amyu amyuVar, Integer num) {
        aP(amyuVar, Optional.ofNullable(num));
    }

    public final void aR(yam yamVar) {
        this.A = yamVar;
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yamVar.D((zik) it.next());
        }
        list.clear();
        yamVar.m(this.t, this.B);
    }

    @Override // defpackage.yco
    public final void aS(boolean z) {
        this.e = z;
    }

    @Override // defpackage.yco
    public final boolean aT() {
        if (b() == 2) {
            return ((this.g.l(257, 45840986L, false) && r() == amyu.MDX_SESSION_DISCONNECT_REASON_NO_ACTIVE_PLAYBACK) || this.x.R().contains(Integer.valueOf(r().aa))) ? false : true;
        }
        return false;
    }

    @Override // defpackage.xzc
    public final void aa(boolean z) {
        this.f = z;
    }

    @Override // defpackage.xzc
    public final void ac(xyv xyvVar) {
        ycr ycrVar = this.A;
        if (ycrVar == null) {
            this.t = xyvVar;
            return;
        }
        ahno.F(xyvVar.e());
        yam yamVar = (yam) ycrVar;
        xyv xyvVarD = yamVar.d(xyvVar);
        int i = yamVar.I;
        if (i == 0 || i == 1) {
            agrx agrxVar = agso.a;
            yamVar.D = xyvVar;
        } else {
            yamVar.M = xyvVarD;
            yamVar.q(xvu.SET_PLAYLIST, yamVar.c(xyvVarD));
        }
    }

    @Override // defpackage.xzc
    public final void ad(abjx abjxVar) {
        this.y = abjxVar;
    }

    @Override // defpackage.xzc
    public boolean am() {
        return false;
    }

    @Override // defpackage.xzc
    public final boolean an() {
        return this.f;
    }

    @Override // defpackage.xzc
    public final boolean ao() {
        return this.e;
    }

    @Override // defpackage.xzc
    public final boolean ar() {
        return this.v > 0;
    }

    @Override // defpackage.xzc
    public final boolean av() {
        return this.z.e > 0;
    }

    @Override // defpackage.xzc
    public final void ay(zik zikVar) {
        ycr ycrVar = this.A;
        if (ycrVar != null) {
            ycrVar.D(zikVar);
        } else {
            this.b.add(zikVar);
        }
    }

    @Override // defpackage.xzc
    public final void az(zik zikVar) {
        ycr ycrVar = this.A;
        if (ycrVar != null) {
            ((yam) ycrVar).m.remove(zikVar);
        } else {
            this.b.remove(zikVar);
        }
    }

    @Override // defpackage.xzc
    public final int b() {
        ycr ycrVar = this.A;
        if (!(ycrVar instanceof yam)) {
            return this.u;
        }
        int i = ((yam) ycrVar).I;
        if (i == 0 || i == 1) {
            return 0;
        }
        return i == 3 ? 2 : 1;
    }

    @Override // defpackage.xzc
    public final xze n() {
        return this.z;
    }

    @Override // defpackage.xzc
    public final abjx o() {
        return this.y;
    }

    @Override // defpackage.xzc
    public ListenableFuture q(amyu amyuVar, Optional optional) {
        if (this.c == amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
            this.c = amyuVar;
            if (optional.isPresent()) {
                this.d = optional;
            }
        }
        if (this.u == 2) {
            agrx agrxVar = agso.a;
        } else {
            this.u = 2;
            amyu amyuVarR = r();
            vxz vxzVar = this.g;
            boolean z = false;
            if (!ydw.a(amyuVarR, vxzVar.l(84, 45419306L, false))) {
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "MDX.BaseMdxSession")).l(agsi.MEDIUM)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionImpl", "doDisconnect", 192, "MdxSessionImpl.java")).y("Disconnecting without user initiation, reason: %s, code: %s", amyuVarR.aa, u());
            }
            if (ydw.b(amyuVarR) && ap() && !vxzVar.l(14, 45361021L, false)) {
                z = true;
            }
            agrx agrxVar2 = agso.a;
            aB(z);
            ycr ycrVar = this.A;
            if (ycrVar != null) {
                ycrVar.o(amyuVarR, null);
            } else {
                this.D.c(this);
                this.y = abjx.a;
            }
        }
        return ahng.n(Boolean.TRUE);
    }

    @Override // defpackage.xzc
    public final amyu r() {
        amyu amyuVar = this.c;
        ycr ycrVar = this.A;
        return (amyuVar != amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN || ycrVar == null) ? amyuVar : ((yam) ycrVar).J;
    }

    @Override // defpackage.xzc
    public final amyv s() {
        return this.C;
    }

    @Override // defpackage.xzc
    public final Optional u() {
        return this.d.or(new vnn(this, 10));
    }
}
