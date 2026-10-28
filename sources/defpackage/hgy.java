package defpackage;

import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgy {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController");
    private final Optional A;
    private final abvn B;
    private final xit C;
    private final aunn D;
    private final aunn E;
    private final ilx F;
    private final Executor G;
    private final Executor H;
    private final vxz I;
    private final vxz J;
    private final hhb K;
    private final hwz L;
    public final Context b;
    public final aunn c;
    public final aunn d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final hwv h;
    public final awmd i;
    public final awmd j;
    public final hfy k;
    public final zwb l;
    public final aunn m;
    public final acdq n;
    public final Handler o;
    public final avmb p;
    public final AudioManager q;
    public aazn r;
    public final hxd s;
    public final tfq t;
    public final wqm u;
    public final hfn v;
    public final jnm w;
    private final abnc x;
    private final aunn y;
    private final Optional z;

    public hgy(Context context, aunn aunnVar, abnc abncVar, aunn aunnVar2, awmd awmdVar, awmd awmdVar2, abvn abvnVar, aunn aunnVar3, Optional optional, Optional optional2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, jnm jnmVar, hxd hxdVar, xit xitVar, wqm wqmVar, hfy hfyVar, tfq tfqVar, hfn hfnVar, hwz hwzVar, zwb zwbVar, hwv hwvVar, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, ilx ilxVar, acdq acdqVar, tbt tbtVar, Handler handler, Executor executor, avmb avmbVar, Executor executor2, vxz vxzVar, vxz vxzVar2) {
        hhb hhbVar = new hhb(this);
        this.K = hhbVar;
        this.b = context;
        this.c = aunnVar;
        this.x = abncVar;
        this.d = aunnVar2;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.y = aunnVar3;
        this.g = awmdVar3;
        this.i = awmdVar4;
        this.j = awmdVar5;
        this.w = jnmVar;
        this.s = hxdVar;
        this.C = xitVar;
        this.u = wqmVar;
        this.k = hfyVar;
        this.t = tfqVar;
        this.v = hfnVar;
        this.L = hwzVar;
        this.l = zwbVar;
        this.h = hwvVar;
        this.D = aunnVar4;
        this.E = aunnVar5;
        this.m = aunnVar6;
        this.n = acdqVar;
        this.A = optional;
        this.z = optional2;
        this.B = abvnVar;
        this.F = ilxVar;
        this.G = executor;
        this.p = avmbVar;
        this.o = handler;
        this.H = executor2;
        this.I = vxzVar;
        this.J = vxzVar2;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        this.q = audioManager;
        ((avlh) abvnVar.r().n).L(((hgy) hhbVar.a).p).al(new gem(hhbVar, 14), new gfh(10));
        abvnVar.P().L(((hgy) hhbVar.a).p).al(new gem(hhbVar, 15), new gfh(10));
        ((ied) aunnVar4.io()).a().x(new hgu(0)).L(avmbVar).al(new gem(this, 13), new gfh(9));
        tbtVar.f(this);
        if (txz.g(context)) {
            ((acdo) aunnVar2.io()).d = new acef() { // from class: hgt
                @Override // defpackage.acef
                public final void a() {
                    ((abvk) this.a.e.io()).aq(false, 32);
                }
            };
            if (vxzVar.l(69, 45388989L, false)) {
                ((acdo) aunnVar2.io()).e = new aceg() { // from class: hgv
                    @Override // defpackage.aceg
                    public final void a() {
                        hgy hgyVar = this.a;
                        aazn aaznVar = hgyVar.r;
                        if (aaznVar != null && aaznVar.a == 7 && !hgyVar.n.B()) {
                            awmd awmdVar6 = hgyVar.g;
                            if (!((abjp) awmdVar6.io()).o(0).isEmpty()) {
                                agrx agrxVar = agso.a;
                                abnl abnlVarN = ((hyz) ((abjp) awmdVar6.io()).o(0).get(0)).n();
                                if (abnlVarN != null) {
                                    aihf builder = abnlVarN.a.toBuilder();
                                    builder.copyOnWrite();
                                    jrk jrkVar = (jrk) builder.instance;
                                    jrkVar.b |= SemanticState.Hidden;
                                    jrkVar.m = true;
                                    abnlVarN.a = (jrk) builder.build();
                                    ((abvc) hgyVar.f.io()).g(abnlVarN);
                                    return;
                                }
                                return;
                            }
                        }
                        ((abvk) hgyVar.e.io()).A();
                    }
                };
            }
        }
    }

    public static void k(awlx awlxVar, Throwable th) {
        zvp.a(zvn.b, zvm.n, "MBS onPlayFromSearch SearchOfflineMediaItems failed: ".concat(String.valueOf(th != null ? th.getMessage() : "null exception")));
        ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MediaSessionPlayerCtlr")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "handleOfflineSearchError", (char) 600, "MusicMediaSessionPlayerController.java")).t("MBS onPlayFromSearch SearchOfflineMediaItems failed");
        awlxVar.ki(hgg.b);
    }

    public static void l(awlx awlxVar, Throwable th) {
        zvp.a(zvn.b, zvm.n, "MBS onPlayFromSearch SearchMediaItems failed: ".concat(String.valueOf(th != null ? th.getMessage() : "null exception")));
        ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MediaSessionPlayerCtlr")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "handleOnlineSearchError", (char) 542, "MusicMediaSessionPlayerController.java")).t("MBS onPlayFromSearch SearchMediaItems failed");
        awlxVar.ki(hgg.b);
    }

    private final ieb s() {
        try {
            return ((aimn) ((tpq) this.E.io()).a().get(3000L, TimeUnit.MILLISECONDS)).d ? ieb.b : ieb.a;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return ieb.b;
        }
    }

    private final anaf t(ieb iebVar) {
        agrx agrxVar = agso.a;
        if (!((ied) this.D.io()).i(iebVar, false)) {
            m();
        }
        return hgg.a;
    }

    private final void u() {
        aunn aunnVar = this.y;
        if (aunnVar.io() instanceof hwm) {
            hwm hwmVar = (hwm) aunnVar.io();
            hwmVar.f.c();
            ((aerz) hwmVar.c.io()).e();
            ((igk) hwmVar.d.io()).c = false;
        }
        ((abvk) this.e.io()).r();
    }

    private final void v() {
        xit xitVar = this.C;
        if (xitVar.r(81)) {
            xitVar.u(tau.MEDIA_BROWSER_ALARM_PLAY_COMPLETED.du, 81);
            xitVar.q(81);
        }
    }

    private final void w() {
        v();
        this.s.a();
        this.n.E(jrj.AUDIO_ROUTE_ALARM);
    }

    final anaf a() {
        if (p()) {
            return hgg.a;
        }
        acfw acfwVarH = ((abvk) this.e.io()).h();
        if (acfwVarH == null) {
            return hgg.a;
        }
        wjf wjfVarC = acfwVarH.c();
        if (wjfVarC == null) {
            return hgg.a;
        }
        alvl alvlVarT = wjfVarC.t();
        if (alvlVarT == null) {
            return hgg.a;
        }
        return aaje.o(alvlVarT) ? hgg.a : hgg.d;
    }

    public final anaf b() {
        if (q()) {
            return hgg.e;
        }
        acdq acdqVar = this.n;
        if (!acdqVar.A()) {
            return hgg.e;
        }
        ((acdo) this.d.io()).g(true != acdqVar.D() ? 10000L : 30000L);
        return hgg.a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aunn, java.lang.Object] */
    public final anaf c() {
        if (!this.h.b()) {
            ((acdo) this.d.io()).c();
            return hgg.a;
        }
        if (q()) {
            Optional optional = this.z;
            hge hgeVar = new hge(this, 2);
            optional.isPresent();
            Object obj = hgeVar.a;
            ?? r0 = optional.get();
            if (((hgy) obj).r()) {
                ((acdo) r0.io()).c();
            } else {
                ((acdo) r0.io()).d();
            }
        } else {
            ((acdo) this.d.io()).c();
            this.F.c = false;
        }
        return hgg.a;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aunn, java.lang.Object] */
    public final anaf d() {
        if (this.q.getMode() == 2) {
            return hgg.e;
        }
        hwv hwvVar = this.h;
        if (!hwvVar.a()) {
            return t(s());
        }
        anaf anafVarA = a();
        if (anafVarA.c) {
            return anafVarA;
        }
        if (!hwvVar.b()) {
            ((acdo) this.d.io()).d();
            return hgg.a;
        }
        if (q()) {
            Optional optional = this.z;
            hge hgeVar = new hge(this, 3);
            optional.isPresent();
            Object obj = hgeVar.a;
            ?? r0 = optional.get();
            if (((hgy) obj).r()) {
                ((acdo) r0.io()).c();
            } else {
                ((acdo) r0.io()).d();
            }
        } else {
            ((acdo) this.d.io()).d();
            this.F.c = false;
        }
        return hgg.a;
    }

    public final anaf e() {
        if (q()) {
            return hgg.e;
        }
        if (!this.n.A()) {
            return hgg.e;
        }
        ((acdo) this.d.io()).g(-10000L);
        return hgg.a;
    }

    public final anaf f() {
        if (this.q.getMode() == 2) {
            return hgg.e;
        }
        if (!this.h.a()) {
            return t(ieb.c);
        }
        if (q()) {
            return hgg.e;
        }
        if (((abjp) this.g.io()).b.isEmpty()) {
            return hgg.e;
        }
        if (!((abvc) this.f.io()).n(abtu.a)) {
            return hgg.f;
        }
        anaf anafVarA = a();
        if (anafVarA.c) {
            return anafVarA;
        }
        ((acdo) this.d.io()).j();
        return hgg.a;
    }

    public final anaf g() {
        if (this.q.getMode() == 2) {
            return hgg.e;
        }
        if (!this.h.a()) {
            return t(ieb.d);
        }
        if (q()) {
            return hgg.e;
        }
        if (!this.n.C()) {
            return hgg.e;
        }
        anaf anafVarA = a();
        if (anafVarA.c) {
            return anafVarA;
        }
        ((acdo) this.d.io()).k();
        return hgg.a;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Type inference failed for: r0v36, types: [abvn, java.lang.Object] */
    public final anaf h(ajwo ajwoVar, Bundle bundle) {
        KeyguardManager keyguardManager;
        if (ajwoVar == null || !gzj.W(ajwoVar)) {
            return hgg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d) && !this.l.u()) {
            return hgg.c;
        }
        if (this.h.b()) {
            if (q() && r()) {
                Optional optional = this.A;
                optional.isPresent();
                optional.get().o().ap(false, 19);
            }
            this.F.c = false;
        }
        awmd awmdVar = this.i;
        yco ycoVar = ((ycp) awmdVar.io()).e;
        ajwo ajwoVarO = gzj.O(ajwoVar, ycoVar);
        abnk abnkVar = new abnk();
        abnkVar.a = ajwoVarO;
        hxd hxdVar = this.s;
        abno abnoVarA = abnp.a();
        if (bundle != null && bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 0) == 4) {
            if (ycoVar != null) {
                ycoVar.J();
            }
            jrj jrjVar = jrj.AUDIO_ROUTE_ALARM;
            abnoVarA.b(jrjVar);
            abnkVar.n = jrjVar;
        } else if (hxdVar.b) {
            hxdVar.b();
        }
        abnkVar.f(bundle.getBoolean("EXTRA_START_PAUSED", false));
        abnl abnlVarA = abnkVar.a();
        abnp abnpVarA = abnoVarA.a();
        jrj jrjVarE = this.J.l(SemanticState.LiveRegion, 45844977L, false) ? abnpVarA.n : abnlVarA.e();
        if (p() || o()) {
            abtu abtuVar = new abtu(abtt.JUMP, abnlVarA, abnpVarA, null);
            awmd awmdVar2 = this.e;
            if (((abvk) awmdVar2.io()).S(abnlVarA) && jrjVarE != jrj.AUDIO_ROUTE_ALARM && !((abjp) this.g.io()).b.isEmpty()) {
                if (!abnlVarA.P()) {
                    ((abvk) awmdVar2.io()).A();
                }
                return hgg.a;
            }
            awmd awmdVar3 = this.f;
            if (((abvc) awmdVar3.io()).n(abtuVar)) {
                yco ycoVar2 = ((ycp) awmdVar.io()).e;
                if (ycoVar2 != null && ycoVar2.A().equals(abnlVarA.u())) {
                    ((ico) this.m.io()).f(abnlVarA);
                    return hgg.a;
                }
                ((abvc) awmdVar3.io()).i(abtuVar);
            } else {
                boolean zO = o();
                if (this.I.l(230, 45776742L, false)) {
                    if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                        w();
                    }
                    if (ycoVar == null) {
                        j();
                    }
                } else {
                    if (ycoVar == null) {
                        j();
                    }
                    if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                        v();
                        hxdVar.a();
                    }
                }
                if (((ycp) awmdVar.io()).e != null) {
                    ((ico) this.m.io()).f(abnlVarA);
                    return hgg.a;
                }
                ((abvc) awmdVar3.io()).h(abnlVarA, abnpVarA);
                if (zO) {
                    ((abvk) awmdVar2.io()).ah();
                }
            }
        } else if (bundle.getBoolean("skip_entitlement_check", false) || this.w.C() || gzj.P(ajwoVarO) == anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE) {
            if (this.I.l(230, 45776742L, false)) {
                if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                    w();
                }
                j();
            } else {
                j();
                if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                    v();
                    hxdVar.a();
                }
            }
            ((abvc) this.f.io()).h(abnlVarA, abnpVarA);
            ((abvk) this.e.io()).ah();
        } else {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
            ajwoVarO.c(aihlVarCheckIsLite2);
            if (ajwoVarO.j.n(aihlVarCheckIsLite2.d)) {
                if (this.I.l(230, 45776742L, false)) {
                    if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                        w();
                    }
                    j();
                } else {
                    j();
                    if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                        v();
                        hxdVar.a();
                    }
                }
                ((abvc) this.f.io()).h(abnlVarA, abnpVarA);
                ((abvk) this.e.io()).ah();
            } else {
                Context context = this.b;
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                if ((uiModeManager != null && uiModeManager.getCurrentModeType() == 3) || ((keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && keyguardManager.inKeyguardRestrictedInputMode())) {
                    return hgg.d;
                }
                if (jrjVarE == jrj.AUDIO_ROUTE_ALARM) {
                    return hgg.d;
                }
                if (txz.g(context) || txz.d(context)) {
                    return hgg.d;
                }
                Bundle bundle2 = new Bundle();
                ahng.aG(bundle2, "command_bundle_key", ajwoVarO);
                afwl.m(context, new Intent().setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity").setFlags(335544320).setAction("com.google.android.youtube.music.action.play").addCategory("android.intent.category.LAUNCHER").putExtra("intent_extra_command_bundle", bundle2));
            }
        }
        if (this.q.getMode() == 2) {
            ((avlh) this.B.r().n).x(new gkq(6)).at().C(new hgl(this, 7), new gfh(9));
        }
        return hgg.a;
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        u();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [abvn, java.lang.Object] */
    public final anaf i() {
        if (q()) {
            Optional optional = this.A;
            optional.isPresent();
            optional.get().o().aq(false, 33);
        } else {
            ((abvk) this.e.io()).aq(false, 33);
        }
        hxd hxdVar = this.s;
        if (hxdVar.b) {
            hxdVar.b();
        }
        return hgg.a;
    }

    public final void j() {
        awmd awmdVar = this.g;
        if (awmdVar.io() != null) {
            abjr abjrVar = ((abjp) awmdVar.io()).b;
            if (((abjp) awmdVar.io()).b.isEmpty()) {
                return;
            }
            ((abjp) awmdVar.io()).r();
        }
    }

    public final void m() {
        if (this.h.a()) {
            return;
        }
        agrx agrxVar = agso.a;
        u();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public final void n(awlx awlxVar, ajwo ajwoVar, Bundle bundle) {
        ListenableFuture listenableFutureN;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                aoht aohtVar = (aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                aohs aohsVar = aohtVar.h;
                if (aohsVar == null) {
                    aohsVar = aohs.a;
                }
                listenableFutureN = !aohsVar.g ? ahng.n(ajwoVar) : ahno.ar(this.L.m(aohtVar.c), new gqa(ajwoVar, aohtVar, 5), this.H);
            } else {
                listenableFutureN = ahng.n(ajwoVar);
            }
        } else {
            listenableFutureN = ahng.n(ajwoVar);
        }
        taf.i(listenableFutureN, this.G, new hfg(this, awlxVar, ajwoVar, bundle, 4), new gsu(this, awlxVar, bundle, 12, (char[]) null), null);
    }

    public final boolean o() {
        return this.x.i;
    }

    final boolean p() {
        abnc abncVar = this.x;
        return abncVar.d != null || abncVar.k || q();
    }

    public final boolean q() {
        return this.F.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [abvn, java.lang.Object] */
    public final boolean r() {
        Optional optional = this.A;
        optional.isPresent();
        return optional.get().o().X();
    }
}
