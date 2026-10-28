package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.player.PlayerPanel;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igw implements igy {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/watchcontroller/MusicActivityWatchController");
    private final aunn A;
    private final aunn B;
    private final aunn C;
    private final aunn D;
    private final cf E;
    private final aunn F;
    private final aunn G;
    private final Executor H;
    private final aunn I;
    private final vxz J;
    private final aesp K;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final aunn k;
    public final aunn l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final aunn p;
    public final aunn q;
    public final aunn r;
    public final aunn s;
    public final aunn t;
    public final avmb u;
    public final vxz v;
    public final hws w = new hws(this);
    private final aunn x;
    private final aunn y;
    private final aunn z;

    public igw(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, cf cfVar, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19, aesp aespVar, aunn aunnVar20, aunn aunnVar21, Executor executor, vxz vxzVar, vxz vxzVar2, aunn aunnVar22, aunn aunnVar23, aunn aunnVar24, aunn aunnVar25, aunn aunnVar26, avmb avmbVar) {
        this.b = aunnVar;
        this.x = aunnVar2;
        this.c = aunnVar3;
        this.y = aunnVar4;
        this.z = aunnVar5;
        this.d = aunnVar6;
        this.A = aunnVar7;
        this.e = aunnVar8;
        this.B = aunnVar9;
        this.C = aunnVar10;
        this.D = aunnVar11;
        this.E = cfVar;
        this.F = aunnVar12;
        this.f = aunnVar13;
        this.g = aunnVar14;
        this.h = aunnVar15;
        this.i = aunnVar16;
        this.j = aunnVar17;
        this.k = aunnVar18;
        this.l = aunnVar19;
        this.K = aespVar;
        this.G = aunnVar20;
        this.p = aunnVar21;
        this.H = executor;
        this.v = vxzVar;
        this.J = vxzVar2;
        this.q = aunnVar22;
        this.r = aunnVar23;
        this.s = aunnVar24;
        this.t = aunnVar25;
        this.u = avmbVar;
        this.I = aunnVar26;
    }

    public final void a(boolean z) {
        ((WatchWhileLayout) this.p.io()).P(this.v.l(19, 45649951L, false));
        if (z) {
            ((abvk) this.e.io()).s();
        }
    }

    public final void b(abnl abnlVar, boolean z, boolean z2) {
        boolean z3 = false;
        this.o = gzj.ag(abnlVar) == 5;
        if (((jnj) this.C.io()).s() && gzj.ag(abnlVar) == 4) {
            z3 = true;
        }
        if (z2 && z) {
            this.n = true;
            ((WatchWhileLayout) this.p.io()).N();
            return;
        }
        if (this.o) {
            aunn aunnVar = this.p;
            ((WatchWhileLayout) aunnVar.io()).H();
            ((WatchWhileLayout) aunnVar.io()).K();
        } else if (!z3 || ((hfn) this.x.io()).x().e()) {
            if (z2) {
                ((WatchWhileLayout) this.p.io()).C();
            }
        } else {
            aunn aunnVar2 = this.p;
            ((WatchWhileLayout) aunnVar2.io()).H();
            ((WatchWhileLayout) aunnVar2.io()).M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0165  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, xir] */
    @Override // defpackage.igy
    public final void i(abnl abnlVar, hxb hxbVar) {
        abnp abnpVarA;
        aunn aunnVar = this.I;
        if (((Optional) aunnVar.io()).isEmpty()) {
            return;
        }
        if (!this.m) {
            ((tbt) this.j.io()).e(new haj());
        }
        ((tbt) this.j.io()).e(new hat());
        Optional optional = hxbVar.e;
        if (optional.isPresent()) {
            ?? r1 = optional.get();
            r1.n("w_st");
            hzi.d(r1, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START);
            abno abnoVarA = abnp.a();
            abnoVarA.a = r1;
            abnpVarA = abnoVarA.a();
        } else {
            aunn aunnVar2 = this.b;
            abno abnoVarA2 = abnp.a();
            abnoVarA2.a = hzi.a((xit) aunnVar2.io(), amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START);
            abnpVarA = abnoVarA2.a();
        }
        boolean zBooleanValue = ((Boolean) hxbVar.c.orElse(Boolean.valueOf(gzj.ag(abnlVar) == 2))).booleanValue();
        abvk abvkVar = (abvk) this.e.io();
        aunn aunnVar3 = this.p;
        abvkVar.I(((WatchWhileLayout) aunnVar3.io()).af() && zBooleanValue);
        a(!gzj.T(abnlVar.b));
        abor aborVarA = ((abvn) this.B.io()).i().a(abnlVar);
        if (aborVarA instanceof abon) {
            ((abon) aborVarA).j(abnlVar, abnlVar.w(), this.H, abnpVarA);
        }
        boolean zBooleanValue2 = ((Boolean) hxbVar.d.orElse(Boolean.FALSE)).booleanValue();
        WatchFragment watchFragment = (WatchFragment) ((Optional) aunnVar.io()).get();
        acda acdaVar = watchFragment.aq;
        acdaVar.d = null;
        ((PlayerPanel) acdaVar.a).a();
        absi absiVarJ = watchFragment.m.j();
        if (absiVarJ != null) {
            absiVarJ.b();
        }
        if (!watchFragment.ag.l(104, 45794521L, false) && ((ycp) watchFragment.j.io()).e != null) {
            watchFragment.I.f(abnlVar);
        } else if (zBooleanValue2) {
            ico icoVar = watchFragment.I;
            qcb qcbVar = new qcb(watchFragment);
            if (icoVar.g(abnlVar)) {
                if (icoVar.k.l(49, 45694858L, false)) {
                    awmd awmdVar = icoVar.d;
                    if (!((abvk) awmdVar.io()).X()) {
                        agrx agrxVar = agso.a;
                        ((abvk) awmdVar.io()).A();
                    }
                }
                ((axfd) icoVar.e.io()).p(abnlVar, new icn(icoVar, abnlVar, qcbVar), null);
            } else if (((ycp) watchFragment.j.io()).e != null || !TextUtils.isEmpty(abnlVar.u()) || TextUtils.isEmpty(abnlVar.r()) || gzj.X(abnlVar)) {
                agrx agrxVar2 = agso.a;
                ((abvc) watchFragment.Q.io()).h(abnlVar, abnpVarA);
            } else {
                ((agrc) ((agrc) WatchFragment.a.c().i(agso.a, "WatchFragment")).k("com/google/android/apps/youtube/music/watch/WatchFragment", "startPlayback", 806, "WatchFragment.java")).w("Requesting watch data for templist, %s", abnlVar);
                watchFragment.av.p(abnlVar, new gml(watchFragment, abnpVarA, 6), null);
            }
        } else if (((ycp) watchFragment.j.io()).e != null) {
            agrx agrxVar3 = agso.a;
            ((abvc) watchFragment.Q.io()).h(abnlVar, abnpVarA);
        } else {
            agrx agrxVar4 = agso.a;
            ((abvc) watchFragment.Q.io()).h(abnlVar, abnpVarA);
        }
        aesp aespVar = this.K;
        if (!((ibv) ((heg) aespVar.i).a).equals(ibv.LOOP_DISABLED)) {
            aespVar.t(ibv.LOOP_OFF, true);
        }
        b(abnlVar, zBooleanValue, !(((WatchWhileLayout) aunnVar3.io()).W() || ((WatchWhileLayout) aunnVar3.io()).Y()));
        ((dov) this.G.io()).v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [xir] */
    @Override // defpackage.igy
    public final void s(ajwo ajwoVar, final hxb hxbVar) {
        hly hlyVar = new hly(this, 4);
        Optional optional = hxbVar.e;
        final ?? N = true != optional.isPresent() ? ((xit) ((igw) hlyVar.a).b.io()).p(4) : optional.get();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            int i = arijVar.b;
            if ((i & 1) != 0) {
                String str = arijVar.d;
            }
            if ((i & 2) != 0) {
                String str2 = arijVar.e;
                int i2 = arijVar.f;
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arix.a);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                String str3 = ((ariw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).c;
            } else {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite5);
                if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                    aoht aohtVar = (aoht) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    String str4 = aohtVar.d;
                    int i3 = aohtVar.e;
                    if (!aohtVar.c.isEmpty()) {
                        String str5 = aohtVar.c;
                    }
                }
            }
        }
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(arix.a);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(arix.a);
            ajwoVar.c(aihlVarCheckIsLite8);
            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
            ajwo ajwoVar2 = ((ariw) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            if (fhz.R(ajwoVar2)) {
                ((vxe) this.c.io()).c(ajwoVar2, null);
            }
        }
        final hww hwwVarX = ((hfn) this.x.io()).x();
        ((ivu) this.y.io()).d();
        if (gzj.W(ajwoVar)) {
            ((hzx) this.z.io()).b();
            final yco ycoVar = ((ycp) this.d.io()).e;
            ajwo ajwoVarO = gzj.O(ajwoVar, ycoVar);
            boolean z = hxbVar.b;
            abnk abnkVar = new abnk();
            abnkVar.a = ajwoVarO;
            abnkVar.f(z);
            Optional optional2 = hxbVar.f;
            if (optional2.isPresent()) {
                abnkVar.o = (abnh) optional2.get();
            }
            final boolean zC = igs.c(gzj.P(ajwoVarO));
            final boolean zC2 = ((jnm) this.A.io()).C();
            if (zC && !zC2) {
                vxz vxzVar = (vxz) ((jnj) this.C.io()).e;
                Optional optionalOf = vxzVar.c(0, 45413814L, 0L) > 0 ? Optional.of(Integer.valueOf((int) vxzVar.c(0, 45413814L, 0L))) : Optional.empty();
                hun hunVar = new hun(abnkVar, 18);
                if (true == optionalOf.isPresent()) {
                    ((abnk) hunVar.a).p = ((Integer) optionalOf.get()).intValue();
                }
            }
            final abnl abnlVarA = abnkVar.a();
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(arik.a);
            ajwoVarO.c(aihlVarCheckIsLite9);
            if (ajwoVarO.j.n(aihlVarCheckIsLite9.d)) {
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(arik.a);
                ajwoVarO.c(aihlVarCheckIsLite10);
                Object objK5 = ajwoVarO.j.k(aihlVarCheckIsLite10.d);
                arij arijVar2 = (arij) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5));
                if (arijVar2.i) {
                    String strW = abnlVarA.w();
                    aunn aunnVar = this.e;
                    if (strW.equals(((abvk) aunnVar.io()).n())) {
                        if ((arijVar2.b & SemanticState.Hidden) != 0) {
                            ((abvk) aunnVar.io()).ag(TimeUnit.SECONDS.toMillis((long) arijVar2.k), appa.SEEK_SOURCE_TIMESTAMP_IN_DESCRIPTION);
                            return;
                        } else {
                            ((WatchWhileLayout) this.p.io()).C();
                            return;
                        }
                    }
                }
            }
            vxz vxzVar2 = this.J;
            if (vxzVar2.l(247, 45825186L, false) && ycoVar != null && ycoVar.b() != 2) {
                String strW2 = abnlVarA.w();
                if (!strW2.isEmpty() ? strW2.equals(ycoVar.D()) || strW2.equals(ycoVar.z()) : abnlVarA.u().isEmpty() && abnlVarA.x() == null) {
                    ((WatchWhileLayout) this.p.io()).C();
                    return;
                }
            }
            if (ycoVar == null || ycoVar.b() != 0) {
                taf.k(this.E, zC ? ((ire) this.F.io()).b() : ahng.n(Boolean.FALSE), new igt(0), new twi() { // from class: igu
                    @Override // defpackage.twi
                    public final void a(Object obj) {
                        ibh ibhVar;
                        Boolean bool = (Boolean) obj;
                        HashMap map = new HashMap();
                        igw igwVar = this.a;
                        boolean z2 = false;
                        boolean zEquals = ((jkp) igwVar.f.io()).getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false);
                        if (zC) {
                            zEquals = Objects.equals(bool, Boolean.TRUE);
                        }
                        abnl abnlVar = abnlVarA;
                        if (gzj.T(abnlVar.b)) {
                            ibhVar = ibh.ATV_PREFERRED;
                        } else if (zEquals) {
                            ibhVar = ibh.DONT_PLAY_VIDEO_OVERRIDE;
                        } else {
                            ibhVar = (gzj.P(abnlVar.b) == anzw.MUSIC_VIDEO_TYPE_UNKNOWN && zC2) ? ibh.ATV_PREFERRED : ibh.OMV_PREFERRED;
                        }
                        map.put("avSwitchTargetMode", ibhVar);
                        aihf aihfVarCreateBuilder = ants.a.createBuilder();
                        int i4 = true != hwz.k(ibhVar) ? 3 : 2;
                        aihfVarCreateBuilder.copyOnWrite();
                        ants antsVar = (ants) aihfVarCreateBuilder.instance;
                        antsVar.c = i4 - 1;
                        antsVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        ants antsVar2 = (ants) aihfVarCreateBuilder.instance;
                        antsVar2.b |= 2;
                        antsVar2.d = false;
                        aunn aunnVar2 = igwVar.g;
                        if (((xeu) aunnVar2.io()).b) {
                            xff xffVarA = ((xeu) aunnVar2.io()).a(aihfVarCreateBuilder, alot.MUSIC_PLAYBACK_CONTENT_MODE_CHANGE_EVENT);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            ants antsVar3 = (ants) aihfVarCreateBuilder.build();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            antsVar3.getClass();
                            alouVar.d = antsVar3;
                            alouVar.c = 231;
                            ((xeu) aunnVar2.io()).b((alou) alosVar.build());
                        }
                        xir xirVar = N;
                        abno abnoVarA = abnp.a();
                        abnoVarA.a = xirVar;
                        abtu abtuVar = new abtu(abtt.JUMP, abnlVar, abnoVarA.a(), map);
                        aunn aunnVar3 = igwVar.h;
                        if (((abvc) aunnVar3.io()).n(abtuVar)) {
                            yco ycoVar2 = ((ycp) igwVar.d.io()).e;
                            if (ycoVar2 != null && !igwVar.v.l(104, 45794521L, false) && !ycoVar2.A().equals(abnlVar.u())) {
                                ((ico) igwVar.i.io()).f(abnlVar);
                                return;
                            }
                            if (!igwVar.m) {
                                ((tbt) igwVar.j.io()).e(new haj());
                            }
                            ((tbt) igwVar.j.io()).e(new hat());
                            hzi.d(xirVar, amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP);
                            igwVar.a(!hwz.k(ibhVar));
                            ((abvc) aunnVar3.io()).i(abtuVar);
                            igwVar.b(abnlVar, false, false);
                            return;
                        }
                        xzc xzcVar = ycoVar;
                        hxb hxbVar2 = hxbVar;
                        if (((Boolean) hxbVar2.d.orElse(Boolean.TRUE)).booleanValue() && hwwVarX.e() && xzcVar == null && ((ico) igwVar.i.io()).g(abnlVar)) {
                            z2 = true;
                        }
                        aunn aunnVar4 = igwVar.k;
                        if (!((abjp) aunnVar4.io()).b.isEmpty() && !z2) {
                            if (xzcVar == null) {
                                ((abjp) aunnVar4.io()).r();
                            } else {
                                ((idk) igwVar.l.io()).j();
                            }
                        }
                        aase aaseVar = new aase(hxbVar2);
                        aaseVar.e(z2);
                        igwVar.i(abnlVar, aaseVar.d());
                    }
                });
                return;
            }
            if (vxzVar2.l(247, 45825186L, false)) {
                ((WatchWhileLayout) this.p.io()).C();
            }
            hvv hvvVar = (hvv) this.D.io();
            cf cfVar = this.E;
            cfVar.getClass();
            ahno.F(ycoVar.b() == 0);
            hvvVar.g.a();
            hvvVar.g = new hvu(hvvVar, hvvVar.e, abnlVarA, cfVar, ycoVar);
        }
    }
}
