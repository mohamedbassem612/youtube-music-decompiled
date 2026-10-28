package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icj extends abjc implements abjy, abkd, abka {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue");
    public final jnj A;
    public final isi B;
    public final axfd C;
    public final jij D;
    private final awku G;
    private final aunn H;
    private final SecureRandom I;
    private final aunn J;
    private final aunn K;
    private final aunn L;
    private List M;
    private Optional N;
    private final vxz O;
    private final hwf P;
    private final hwz Q;
    private final hfn R;
    public final icl b;
    public final icq c;
    public final Map d;
    public final ice e;
    public final awku f;
    public final aunn g;
    public final awku h;
    public final aunn i;
    public final tbt j;
    public final aunn k;
    public final icx l;
    public final aerv m;
    public boolean n;
    public icf o;
    public boolean p;
    public final awkx q;
    public Optional r;
    public Optional s;
    public Optional t;
    public Optional u;
    public ixi v;
    public ajik w;
    public Optional x;
    public Optional y;
    public ixi z;

    public icj(icl iclVar, axfd axfdVar, hwz hwzVar, icq icqVar, tbt tbtVar, hfn hfnVar, hpy hpyVar, avmb avmbVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, jij jijVar, icx icxVar, SecureRandom secureRandom, jnj jnjVar, aunn aunnVar4, aunn aunnVar5, isi isiVar, aunn aunnVar6, aerv aervVar, vxz vxzVar, abmt abmtVar, aunn aunnVar7, awkx awkxVar) {
        super(abmtVar);
        this.r = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        this.u = Optional.empty();
        this.N = Optional.empty();
        this.v = new ixi();
        this.w = ajik.AUTOMIX_MODE_UNKNOWN;
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.z = new ixi();
        this.b = iclVar;
        this.C = axfdVar;
        this.Q = hwzVar;
        this.d = new HashMap();
        this.c = icqVar;
        this.j = tbtVar;
        this.R = hfnVar;
        this.H = aunnVar;
        this.i = aunnVar3;
        this.g = aunnVar2;
        this.D = jijVar;
        this.l = icxVar;
        this.I = secureRandom;
        this.A = jnjVar;
        this.J = aunnVar4;
        this.k = aunnVar5;
        this.B = isiVar;
        this.K = aunnVar6;
        this.m = aervVar;
        this.O = vxzVar;
        this.L = aunnVar7;
        this.q = awkxVar;
        gzj.aw(hpyVar).O(avmbVar).af(new hxi(this, 15));
        ice iceVar = new ice(this);
        this.e = iceVar;
        hg(iceVar);
        he(iceVar);
        hwf hwfVar = new hwf(this);
        this.P = hwfVar;
        this.E.add(hwfVar);
        iclVar.d = this;
        Boolean bool = Boolean.FALSE;
        this.h = new awku(bool);
        this.f = new awku(bool);
        this.G = new awku(abjz.a);
    }

    private static ajwo V(String str, String str2, ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aihf builder = ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
        builder.copyOnWrite();
        arij arijVar = (arij) builder.instance;
        str.getClass();
        arijVar.b |= 1;
        arijVar.d = str;
        builder.copyOnWrite();
        arij arijVar2 = (arij) builder.instance;
        str2.getClass();
        arijVar2.b |= 8;
        arijVar2.g = str2;
        arij arijVar3 = (arij) builder.build();
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(arik.a, arijVar3);
        return (ajwo) aihhVar.build();
    }

    private final void W() {
        this.s = Optional.empty();
        this.r = Optional.empty();
        this.G.kk(abjz.a);
    }

    private final boolean X() {
        return ((ycp) this.J.io()).b == 1;
    }

    private final boolean Y() {
        return Boolean.TRUE.equals(((awku) this.H.io()).aD());
    }

    public final void A(aouj aoujVar, acjw acjwVar) {
        acjw acjwVar2;
        acjw acjwVar3;
        acjw acjwVar4;
        if (acjwVar == null || !E()) {
            w();
        } else {
            this.d.remove(acjwVar);
        }
        for (aouo aouoVar : aoujVar.p) {
            int i = aouoVar.b;
            if ((i & 1) != 0 && (acjwVar == (acjwVar4 = acjw.b) || acjwVar == null)) {
                aobx aobxVar = aouoVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                acjx acjxVarAe = aawb.ae(aobxVar);
                if (acjxVarAe != null) {
                    this.d.put(acjwVar4, acjxVarAe);
                }
            } else if ((i & 2) != 0 && (acjwVar == (acjwVar3 = acjw.h) || acjwVar == null)) {
                aobz aobzVar = aouoVar.d;
                if (aobzVar == null) {
                    aobzVar = aobz.a;
                }
                acjx acjxVarAe2 = aawb.ae(aobzVar);
                if (acjxVarAe2 != null) {
                    this.d.put(acjwVar3, acjxVarAe2);
                }
            } else if ((i & 4) != 0 && (acjwVar == (acjwVar2 = acjw.c) || acjwVar == null)) {
                aoyh aoyhVar = aouoVar.e;
                if (aoyhVar == null) {
                    aoyhVar = aoyh.a;
                }
                acjx acjxVarAe3 = aawb.ae(aoyhVar);
                if (acjxVarAe3 != null) {
                    this.d.put(acjwVar2, acjxVarAe3);
                }
            }
        }
        icl iclVar = this.b;
        Map map = this.d;
        iclVar.b = map;
        B(map);
        if (E()) {
            return;
        }
        acjw acjwVar5 = acjw.c;
        if (iclVar.b(acjwVar5)) {
            iclVar.a(acjwVar5, null);
        }
    }

    public final void B(Map map) {
        icf icfVar = this.o;
        if (icfVar != null) {
            idr idrVar = (idr) icfVar;
            idrVar.o();
            if (nsj.g(idrVar.j)) {
                ((agrc) ((agrc) idr.a.c().i(agso.a, "PersistentQueueCtlrImpl")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl", "performContinuationUpdate", 759, "PersistentMusicPlaybackQueueControllerImpl.java")).t("Skipping continuation update, low on memory");
            } else {
                idrVar.s = idrVar.k.submit(afwl.i(new hhy(icfVar, map, 3)));
            }
        }
    }

    public final void C(Optional optional, boolean z) {
        this.u = optional;
        ica icaVar = new ica(this, z, 1);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = icaVar.b;
            boolean z2 = icaVar.a;
            ajta ajtaVar = (ajta) obj;
            icj icjVar = (icj) obj2;
            icjVar.v.h((agke) Collection.EL.stream(ajtaVar.c).filter(new hud(9)).map(new iaa(10)).collect(aghu.a));
            ajsx ajsxVarA = ajsx.a(ajtaVar.f);
            if (ajsxVarA == null) {
                ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
            }
            if (icjVar.F()) {
                if (ajsxVarA == ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN) {
                    ajsxVarA = icjVar.a(z2);
                }
                icjVar.v.d = ajsxVarA;
            }
        }
        this.v.g();
    }

    public final boolean D(int i, hyz hyzVar) {
        Iterator it = abjg.c(this, i).iterator();
        while (it.hasNext()) {
            if (Collection.EL.stream(((hyz) it.next()).k()).anyMatch(new ibz(hyzVar.k(), 2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        return this.O.l(117, 45822245L, false);
    }

    public final boolean F() {
        return this.O.l(64, 45725508L, false);
    }

    public final boolean G() {
        return Boolean.TRUE.equals(this.f.aD());
    }

    @Override // defpackage.abjc
    public final boolean H() {
        return false;
    }

    public final void I(ajwo ajwoVar, int i) {
        if (gzj.W(ajwoVar)) {
            if (i == 3) {
                this.q.kk(new idf(ide.b));
            }
            w();
            W();
            icg icgVar = new icg(this, i);
            axfd axfdVar = this.C;
            abnk abnkVar = new abnk();
            abnkVar.a = ajwoVar;
            abnkVar.d((aigj) this.D.j().orElse(null));
            ahno.at(axfdVar.q(abnkVar.a(), null), icgVar, MoreExecutors.directExecutor());
        }
    }

    public final aae J(aouj aoujVar) {
        aoun aounVar;
        ArrayList arrayList = new ArrayList();
        Optional optionalEmpty = Optional.empty();
        int i = 0;
        int i2 = -1;
        for (aoui aouiVar : aoujVar.g) {
            int i3 = aouiVar.b;
            if ((i3 & 1) != 0) {
                aoun aounVar2 = aouiVar.c;
                if (aounVar2 == null) {
                    aounVar2 = aoun.a;
                }
                boolean z = aounVar2.k;
                if (gzj.ac(aounVar2)) {
                    int i4 = i + 1;
                    arrayList.add(this.R.s(aounVar2));
                    if (true == z) {
                        i2 = i;
                    }
                    i = i4;
                }
            } else if ((i3 & 64) != 0) {
                aouu aouuVar = aouiVar.e;
                if (aouuVar == null) {
                    aouuVar = aouu.a;
                }
                apji apjiVar = aouuVar.b;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aouq.b);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = aouuVar.b;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aouq.b);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    aounVar = (aoun) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                } else {
                    aounVar = null;
                }
                if (aounVar != null) {
                    boolean z2 = aounVar.k;
                    if (gzj.ac(aounVar)) {
                        int i5 = i + 1;
                        arrayList.add(this.R.C(aouuVar, this.Q));
                        if (true == z2) {
                            i2 = i;
                        }
                        i = i5;
                    }
                }
            } else if ((i3 & 8) != 0) {
                ajin ajinVar = aouiVar.d;
                if (ajinVar == null) {
                    ajinVar = ajin.a;
                }
                Optional optionalOf = Optional.of(ajinVar);
                optionalOf.isPresent();
                ajim ajimVar = ((ajin) optionalOf.get()).b;
                if (ajimVar == null) {
                    ajimVar = ajim.a;
                }
                if ((ajimVar.b & 1) == 0) {
                    optionalOf = Optional.empty();
                }
                if (true == optionalOf.isPresent()) {
                    ajim ajimVar2 = ((ajin) optionalOf.get()).b;
                    if (ajimVar2 == null) {
                        ajimVar2 = ajim.a;
                    }
                    ajil ajilVar = ajimVar2.c;
                    if (ajilVar == null) {
                        ajilVar = ajil.a;
                    }
                    optionalOf = Optional.ofNullable(ajilVar);
                }
                Optional optionalEmpty2 = (true == optionalOf.isPresent() && (((ajil) optionalOf.get()).b & 8) == 0) ? Optional.empty() : optionalOf;
                if (true == optionalEmpty2.isPresent()) {
                    ajwo ajwoVar = ((ajil) optionalEmpty2.get()).c;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    optionalEmpty2 = Optional.ofNullable(ajwoVar);
                }
                if (true == optionalOf.isPresent()) {
                    ajik ajikVarA = ajik.a(((ajil) optionalOf.get()).d);
                    if (ajikVarA == null) {
                        ajikVarA = ajik.AUTOMIX_MODE_UNKNOWN;
                    }
                    optionalOf = Optional.ofNullable(ajikVarA);
                }
                this.w = (ajik) optionalOf.orElse(ajik.AUTOMIX_MODE_UNKNOWN);
                optionalEmpty = optionalEmpty2;
            }
        }
        return new aae((List) arrayList, optionalEmpty, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void K(aouj aoujVar, aae aaeVar, abjm abjmVar) {
        ?? r0 = aaeVar.c;
        if (!r0.isEmpty()) {
            int iMax = r0.isEmpty() ? -1 : Math.max(0, aaeVar.a);
            int iHd = hd();
            r0.size();
            if (hc(0) <= 0 || iHd == -1) {
                int iHc = hc(0);
                ha(0, iHc, r0);
                hi(0, 0, iHc);
                T(iMax, abjmVar);
            } else {
                if (iHd > 0) {
                    hi(0, 0, iHd);
                }
                if (iMax > 0) {
                    ha(0, 0, r0.subList(0, iMax));
                }
                int iHd2 = hd();
                if (this.O.l(72, 45732409L, false)) {
                    hyz hyzVar = (hyz) O(0, iHd2);
                    hyz hyzVar2 = (hyz) r0.get(iMax);
                    if (!hyzVar.t().equals(hyzVar2.t())) {
                        ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "maybeUpdateCurrentPlaybackItem", 952, "MusicPlaybackQueue.java")).B("Current playback item does not match the new playback item. Current: %s, New: %s. Performing local rectification.", hyzVar.t(), hyzVar2.t());
                    } else if (hyzVar instanceof hzf) {
                        hzf hzfVar = (hzf) hyzVar;
                        if (hyzVar2 instanceof hzf) {
                            hzf hzfVar2 = (hzf) hyzVar2;
                            abnl abnlVarN = hyzVar2.n();
                            hyzVar2.t();
                            if (abnlVarN != null) {
                                abnlVarN.u();
                                abnlVarN.v();
                            }
                            hzfVar.u(hzfVar2.a);
                        }
                    } else if (hyzVar instanceof hzg) {
                        hzg hzgVar = (hzg) hyzVar;
                        if (hyzVar2 instanceof hzg) {
                            hzg hzgVar2 = (hzg) hyzVar2;
                            abnl abnlVarN2 = hyzVar2.n();
                            hyzVar2.t();
                            if (abnlVarN2 != null) {
                                abnlVarN2.u();
                                abnlVarN2.v();
                            }
                            hzgVar.x(hzgVar2.a);
                        }
                    }
                    ha(0, iHd2, agke.q((hyz) r0.get(iMax)));
                    iHd2++;
                } else {
                    abke abkeVarO = O(0, iHd2);
                    if (abkeVarO instanceof hzf) {
                        hzf hzfVar3 = (hzf) abkeVarO;
                        if (!hzfVar3.b) {
                            abke abkeVar = (abke) r0.get(iMax);
                            if (abkeVar instanceof hzf) {
                                hzfVar3.u(((hzf) abkeVar).a);
                            }
                        }
                    }
                }
                int i = iHd2 + 1;
                int iHc2 = hc(0) - i;
                if (iHc2 > 0) {
                    hi(0, i, iHc2);
                }
                if (iMax < r0.size() - 1) {
                    ha(0, i, r0.subList(iMax + 1, r0.size()));
                }
            }
        }
        Optional optional = (Optional) aaeVar.b;
        if (optional.isPresent()) {
            v((ajwo) optional.get(), false);
        } else {
            A(aoujVar, null);
        }
        isi isiVar = this.B;
        agrx agrxVar = agso.a;
        isiVar.i(false);
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void L(aouj aoujVar, aae aaeVar) {
        if (hd() >= 0 && hc(0) > 0 && aoujVar.g.size() > 0) {
            int iHd = hd() + 1;
            hi(0, iHd, hc(0) - iHd);
            r(0, iHd, aaeVar.c);
            A(aoujVar, acjw.h);
        }
        this.v.g();
    }

    public final ajsx a(boolean z) {
        if (!this.O.l(112, 45808651L, false)) {
            ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "getDefaultSelectionBehavior", 2060, "MusicPlaybackQueue.java")).t("Chip selection behavior is UNKNOWN, setting to SINGLE_SELECT_ALWAYS_SELECTED");
            return ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED;
        }
        agrf agrfVar = a;
        if (z) {
            ((agrc) ((agrc) agrfVar.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "getDefaultSelectionBehavior", 2049, "MusicPlaybackQueue.java")).t("Chip selection behavior is UNKNOWN and is podcast, setting to SINGLE_SELECT_ALWAYS_SELECTED");
            return ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED;
        }
        ((agrc) ((agrc) agrfVar.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "getDefaultSelectionBehavior", 2055, "MusicPlaybackQueue.java")).t("Chip selection behavior is UNKNOWN and is music, setting to SINGLE_SELECT");
        return ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    @Override // defpackage.abjy
    public final abjm c(abjk abjkVar, abjl abjlVar, abjx abjxVar) {
        if (abjxVar == abjx.a && abjkVar == abjk.b) {
            return new abkc(null);
        }
        return null;
    }

    @Override // defpackage.abka
    public final abjz d() {
        abjz abjzVar = (abjz) this.G.aD();
        return abjzVar == null ? abjz.a : abjzVar;
    }

    public final avlh e() {
        return this.f.P().p();
    }

    public final Optional f() {
        return hna.A(this.x, this.z);
    }

    public final Optional g() {
        return Q() ? Optional.empty() : Optional.of((hyz) O(0, Math.max(0, hd())));
    }

    public final Optional h() {
        return X() ? Optional.empty() : hna.A(this.u, this.v);
    }

    @Override // defpackage.abjc, defpackage.abjl
    public final void ha(int i, int i2, java.util.Collection collection) {
        if (collection != null && i == 0) {
            if (this.M != null && !Y()) {
                this.M.addAll(collection);
            }
            i = 0;
        }
        super.ha(i, i2, collection);
    }

    @Override // defpackage.abjc, defpackage.abjl
    public final synchronized void hb() {
        ice iceVar = this.e;
        hl(iceVar);
        icf icfVar = this.o;
        if (icfVar != null) {
            ((idr) icfVar).i();
        }
        this.f.kk(Boolean.FALSE);
        w();
        vxz vxzVar = this.O;
        if (vxzVar.l(24, 45656334L, false)) {
            this.t = Optional.empty();
            if (vxzVar.l(69, 45728267L, false)) {
                ((awku) ((aczl) this.L.io()).c).kk(Optional.empty());
            }
        }
        this.u = Optional.empty();
        this.N = Optional.empty();
        this.v = new ixi();
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.z = new ixi();
        ((awku) this.D.a).kk(Optional.empty());
        this.l.e();
        i();
        super.hb();
        hg(iceVar);
    }

    @Override // defpackage.abka
    public final synchronized void i() {
        this.M = null;
        W();
    }

    @Override // defpackage.abka
    public final synchronized void j() {
        y(false);
    }

    @Override // defpackage.abkd
    public final void k(wgi wgiVar, boolean z, abjm abjmVar) {
        if (z) {
            hb();
            u(wgiVar, abjmVar);
        } else {
            i();
            w();
            hi(1, 0, hc(1));
            u(wgiVar, null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [hyz, java.lang.Object] */
    @Override // defpackage.abka
    public final synchronized void l() {
        if (this.B.j() || !this.s.isPresent()) {
            List list = this.M;
            if (list != null) {
                this.M = null;
                int iHd = hd();
                if (iHd >= 0 && iHd < hc(0)) {
                    hyz hyzVar = (hyz) O(0, iHd);
                    if (list.contains(hyzVar)) {
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                i = -1;
                                break;
                            } else if (hyzVar.equals(list.get(i))) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i != -1) {
                            aunn aunnVar = this.H;
                            ((awku) aunnVar.io()).kk(Boolean.TRUE);
                            hi(0, 0, iHd);
                            hi(0, 1, hc(0) - 1);
                            ha(0, 1, list.subList(i + 1, list.size()));
                            ha(0, 0, list.subList(0, i));
                            ((awku) aunnVar.io()).kk(Boolean.FALSE);
                            s();
                        }
                    }
                }
            }
        } else {
            ajwo ajwoVar = (ajwo) this.s.get();
            Optional optionalG = g();
            if (optionalG.isEmpty()) {
                ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "requestServerUnshuffle", 1244, "MusicPlaybackQueue.java")).t("Requested server unshuffle but the queue was empty.");
                return;
            }
            String strT = optionalG.get().t();
            String strS = optionalG.get().s();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                ajwo ajwoVarV = V(strT, strS, ajwoVar);
                adrx adrxVar = new adrx(null, null);
                adrxVar.c(amac.WATCH_NEXT_TYPE_MUSIC_UNSHUFFLE);
                abnh abnhVarB = adrxVar.b();
                ici iciVar = new ici(this, optionalG);
                axfd axfdVar = this.C;
                abnk abnkVar = new abnk();
                abnkVar.a = ajwoVarV;
                abnkVar.d((aigj) this.D.j().orElse(null));
                abnkVar.o = abnhVarB;
                ahno.at(axfdVar.q(abnkVar.a(), null), iciVar, MoreExecutors.directExecutor());
                return;
            }
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "requestServerUnshuffle", 1271, "MusicPlaybackQueue.java")).t("Requested server unshuffle but was missing expected WatchEndpoint.");
        }
    }

    @Override // defpackage.abjy
    public final synchronized boolean m(List list, List list2, int i, abjm abjmVar) {
        hb();
        if (list.isEmpty()) {
            return false;
        }
        ha(0, 0, list);
        if (list2 != null && !list2.isEmpty()) {
            super.ha(1, 0, list2);
            this.n = true;
        }
        T(i, abjmVar);
        return true;
    }

    public final Optional n() {
        return X() ? Optional.empty() : this.N;
    }

    public final void r(int i, int i2, List list) {
        if (!this.p) {
            ha(i, i2, list);
        } else {
            ha(i, i2, (agke) Collection.EL.stream(list).filter(new ibz(this, 0)).collect(aghu.a));
            this.p = false;
        }
    }

    public final void s() {
        t(hd());
    }

    public final void t(int i) {
        if ((hc(0) + hc(1)) - i >= 10 || Y()) {
            this.h.kk(Boolean.FALSE);
            return;
        }
        icl iclVar = this.b;
        acjw acjwVar = acjw.b;
        if (iclVar.b(acjwVar)) {
            iclVar.a(acjwVar, null);
            return;
        }
        acjw acjwVar2 = acjw.h;
        if (iclVar.b(acjwVar2)) {
            iclVar.a(acjwVar2, null);
        }
    }

    public final void u(wgi wgiVar, abjm abjmVar) {
        amae amaeVar;
        aouj aoujVarAb;
        if (wgiVar == null || (aoujVarAb = fhz.ab((amaeVar = wgiVar.a))) == null) {
            return;
        }
        ((awku) this.g.io()).kk(new icw(amaeVar, null));
        icq icqVar = this.c;
        boolean z = false;
        if (icqVar.x.k(45860884L, false)) {
            icqVar.h = wgiVar.d();
        } else {
            icqVar.g = wgiVar;
        }
        afx afxVar = icqVar.l;
        afxVar.clear();
        afxVar.add(wgiVar.d());
        icf icfVar = this.o;
        if (icfVar != null) {
            icfVar.a(wgiVar.d());
        }
        Optional optionalC = hna.C(fhz.ah(amaeVar));
        hun hunVar = new hun(this, 9);
        if (true == optionalC.isPresent()) {
            ((icj) hunVar.a).t = Optional.of((anvo) optionalC.get());
        }
        ajwo ajwoVar = wgiVar.d;
        if (ajwoVar != null && gzj.U(ajwoVar)) {
            z = true;
        }
        C(hna.D(fhz.ah(amaeVar)), z);
        this.N = hna.E(fhz.ah(amaeVar));
        Optional optionalOf = Optional.of(aoujVarAb);
        optionalOf.isPresent();
        if (((aouj) optionalOf.get()).d != 34) {
            optionalOf = Optional.empty();
        }
        if (true == optionalOf.isPresent()) {
            aouj aoujVar = (aouj) optionalOf.get();
            optionalOf = Optional.ofNullable(aoujVar.d == 34 ? (apji) aoujVar.e : apji.a);
        }
        if (true == optionalOf.isPresent()) {
            apji apjiVar = (apji) optionalOf.get();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (true != apjiVar.j.n(aihlVarCheckIsLite.d)) {
                optionalOf = Optional.empty();
            }
        }
        if (true == optionalOf.isPresent()) {
            apji apjiVar2 = (apji) optionalOf.get();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.b);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            optionalOf = Optional.ofNullable((ajno) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        }
        if (optionalOf.isPresent()) {
            Optional optionalOf2 = Optional.of((ajno) optionalOf.get());
            optionalOf2.isPresent();
            if ((((ajno) optionalOf2.get()).b & SemanticState.LiveRegion) == 0) {
                optionalOf2 = Optional.empty();
            }
            if (true == optionalOf2.isPresent()) {
                ajwo ajwoVar2 = ((ajno) optionalOf2.get()).g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                optionalOf2 = Optional.ofNullable(ajwoVar2);
            }
            if (true == optionalOf2.isPresent()) {
                ajwo ajwoVar3 = (ajwo) optionalOf2.get();
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                ajwoVar3.c(aihlVarCheckIsLite3);
                if (true != ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                    optionalOf2 = Optional.empty();
                }
            }
            this.r = optionalOf2;
            Optional optionalOf3 = Optional.of((ajno) optionalOf.get());
            optionalOf3.isPresent();
            if ((((ajno) optionalOf3.get()).b & 32768) == 0) {
                optionalOf3 = Optional.empty();
            }
            if (true == optionalOf3.isPresent()) {
                ajwo ajwoVar4 = ((ajno) optionalOf3.get()).j;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                optionalOf3 = Optional.ofNullable(ajwoVar4);
            }
            if (true == optionalOf3.isPresent()) {
                ajwo ajwoVar5 = (ajwo) optionalOf3.get();
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                ajwoVar5.c(aihlVarCheckIsLite4);
                if (true != ajwoVar5.j.n(aihlVarCheckIsLite4.d)) {
                    optionalOf3 = Optional.empty();
                }
            }
            this.s = optionalOf3;
            jan janVar = (jan) this.K.io();
            if (((ajno) optionalOf.get()).c) {
                ((awku) janVar.h).kk(icz.b);
            }
        }
        wgiVar.f();
        this.D.k(wgiVar);
        this.f.kk(Boolean.valueOf(aoujVarAb.n));
        G();
        K(aoujVarAb, J(aoujVarAb), abjmVar);
    }

    public final void v(ajwo ajwoVar, boolean z) {
        if (gzj.W(ajwoVar)) {
            abnk abnkVar = new abnk();
            abnkVar.a = ajwoVar;
            abnkVar.d((aigj) this.D.j().orElse(null));
            Optional optionalA = this.l.a();
            hun hunVar = new hun(abnkVar, 8);
            if (true == optionalA.isPresent()) {
                ((abnk) hunVar.a).e((apla) optionalA.get());
            }
            ahno.at(this.C.q(abnkVar.a(), null), new icb(this, z), MoreExecutors.directExecutor());
        }
    }

    final void w() {
        this.n = false;
        this.d.clear();
        this.h.kk(Boolean.FALSE);
        HashMap map = new HashMap();
        icl iclVar = this.b;
        iclVar.b = map;
        iclVar.c = null;
    }

    public final void x(wgi wgiVar) {
        w();
        hi(1, 0, hc(1));
        u(wgiVar, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [hyz, java.lang.Object] */
    public final synchronized void y(boolean z) {
        int i;
        if (!z) {
            if (!this.B.j() && this.r.isPresent()) {
                this.G.kk(abjz.c);
                ajwo ajwoVar = (ajwo) this.r.get();
                Optional optionalG = g();
                if (optionalG.isEmpty()) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "requestServerShuffle", 1209, "MusicPlaybackQueue.java")).t("Requested server shuffle but the queue was empty.");
                    return;
                }
                String strT = optionalG.get().t();
                String strS = optionalG.get().s();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "requestServerShuffle", 1236, "MusicPlaybackQueue.java")).t("Requested server shuffle but was missing expected WatchEndpoint.");
                    return;
                }
                ajwo ajwoVarV = V(strT, strS, ajwoVar);
                adrx adrxVar = new adrx(null, null);
                adrxVar.c(amac.WATCH_NEXT_TYPE_MUSIC_SHUFFLE);
                abnh abnhVarB = adrxVar.b();
                ich ichVar = new ich(this, optionalG);
                axfd axfdVar = this.C;
                abnk abnkVar = new abnk();
                abnkVar.a = ajwoVarV;
                abnkVar.d((aigj) this.D.j().orElse(null));
                abnkVar.o = abnhVarB;
                ahno.at(axfdVar.q(abnkVar.a(), null), ichVar, MoreExecutors.directExecutor());
                return;
            }
        }
        this.G.kk(abjz.b);
        ArrayList arrayList = new ArrayList();
        this.M = arrayList;
        U(arrayList);
        int iHc = hc(0);
        if (iHc <= 1) {
            return;
        }
        aunn aunnVar = this.H;
        ((awku) aunnVar.io()).kk(Boolean.TRUE);
        int iHd = hd();
        if (iHd == -1) {
            i = 0;
        } else {
            hh(0, iHd, 0, 0);
            i = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        U(arrayList2);
        int i2 = i;
        while (i2 < iHc - 1) {
            int iNextInt = this.I.nextInt(iHc - i2) + i2;
            arrayList2.add(i2, (hyz) arrayList2.remove(iNextInt));
            i2++;
            arrayList2.add(iNextInt, (hyz) arrayList2.remove(i2));
        }
        if (i == 1) {
            arrayList2.remove(0);
        }
        hi(0, i, iHc - i);
        ha(0, i, arrayList2);
        ((awku) aunnVar.io()).kk(Boolean.FALSE);
    }

    public final void z(Optional optional, boolean z) {
        this.x = optional;
        ica icaVar = new ica(this, z, 0);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = icaVar.b;
            boolean z2 = icaVar.a;
            ajta ajtaVar = (ajta) obj;
            icj icjVar = (icj) obj2;
            icjVar.z.h((agke) Collection.EL.stream(ajtaVar.c).filter(new hud(9)).map(new iaa(10)).collect(aghu.a));
            ajsx ajsxVarA = ajsx.a(ajtaVar.f);
            if (ajsxVarA == null) {
                ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
            }
            if (icjVar.F()) {
                if (ajsxVarA == ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN) {
                    ajsxVarA = icjVar.a(z2);
                }
                icjVar.z.d = ajsxVarA;
            }
        }
        this.z.g();
    }

    @Override // defpackage.abjy
    public final /* synthetic */ void o() {
    }
}
