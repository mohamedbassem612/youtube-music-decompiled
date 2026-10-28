package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeog implements tdk, zwj {
    public final abvk a;
    public final abvk b;
    public final zwi c;
    public final zwb d;
    public final aeoh e;
    public ViewGroup g;
    public ViewGroup h;
    public SlimStatusBar i;
    public SlimStatusBar j;
    public boolean k;
    public final tbt l;
    public final rmw m;
    public final avmb n;
    public final avmb o;
    public final Optional p;
    public final aunn q;
    public final awlo r = new awlo();
    public final awli s = new awli(Boolean.FALSE);
    public final tfq t;
    public final vxz u;
    public final vwt v;
    private final abvn w;
    private final LayoutInflater x;
    private avmn y;

    public aeog(Context context, tfq tfqVar, spa spaVar, abvk abvkVar, abvk abvkVar2, aeoh aeohVar, zwi zwiVar, zwb zwbVar, abvn abvnVar, tbt tbtVar, rmw rmwVar, vwt vwtVar, avmb avmbVar, avmb avmbVar2, Optional optional, vxz vxzVar, aunn aunnVar) {
        this.t = tfqVar;
        this.a = abvkVar;
        this.b = abvkVar2;
        this.e = aeohVar;
        this.c = zwiVar;
        this.d = zwbVar;
        this.w = abvnVar;
        this.x = LayoutInflater.from(context);
        this.k = !spaVar.a;
        this.l = tbtVar;
        this.m = rmwVar;
        this.v = vwtVar;
        this.n = avmbVar;
        this.o = avmbVar2;
        this.p = optional;
        this.u = vxzVar;
        this.q = aunnVar;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsi.m(this);
    }

    @Override // defpackage.zwj
    public final void b() {
        e();
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    public final SlimStatusBar d(boolean z) {
        if (z) {
            SlimStatusBar slimStatusBar = this.j;
            if (slimStatusBar != null) {
                return slimStatusBar;
            }
            SlimStatusBar slimStatusBar2 = (SlimStatusBar) this.x.inflate(R.layout.slim_status_bar, this.h, false);
            this.j = slimStatusBar2;
            return slimStatusBar2;
        }
        SlimStatusBar slimStatusBar3 = this.i;
        if (slimStatusBar3 != null) {
            return slimStatusBar3;
        }
        SlimStatusBar slimStatusBar4 = (SlimStatusBar) this.x.inflate(R.layout.slim_status_bar, this.g, false);
        this.i = slimStatusBar4;
        return slimStatusBar4;
    }

    public final void e() {
        if (h()) {
            rmw rmwVar = this.m;
            aeoh aeohVar = this.e;
            Optional optional = this.p;
            rmv rmvVarC = rmwVar.c();
            optional.isPresent();
            aeohVar.t(((Boolean) optional.orElse(Boolean.FALSE)).booleanValue(), this.t.h(), this.d.e().m(), rmvVarC == null ? null : rmvVarC.e, g());
        }
    }

    public final boolean f() {
        rmv rmvVarC = this.m.c();
        return rmvVarC != null && rmvVarC.f;
    }

    public final boolean g() {
        Boolean bool = (Boolean) this.s.au();
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsi.n(this);
    }

    public final boolean h() {
        return (this.g == null || this.h == null) ? false : true;
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        this.r.kk(Boolean.TRUE);
        e();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.r.kk(Boolean.TRUE);
        e();
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.y = ((avlh) this.w.r().o).al(new acym(this, 10), new achk(6));
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        Object obj = this.y;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.y = null;
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
