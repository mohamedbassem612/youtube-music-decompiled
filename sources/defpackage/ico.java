package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ico {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager");
    public final Executor b;
    public final abjp c;
    public final awmd d;
    public final awmd e;
    public final ict f;
    public final aunn g;
    public final aunn h;
    public final aerv i;
    public final awku j;
    public final vxz k;
    public final jnj l;
    public final isi m;
    public final hwz n;
    public final hfn o;
    public final jnm p;
    public final jnm q;
    private final awmd r;
    private final tbt s;
    private final awmd t;
    private final hzi u;
    private final ict v;

    public ico(Executor executor, abjp abjpVar, awmd awmdVar, awmd awmdVar2, jnm jnmVar, tbt tbtVar, aerj aerjVar, hwz hwzVar, awmd awmdVar3, awmd awmdVar4, hfn hfnVar, jnj jnjVar, hzi hziVar, jnm jnmVar2, aunn aunnVar, isi isiVar, aunn aunnVar2, aerv aervVar, vxz vxzVar, awku awkuVar) {
        this.b = executor;
        this.c = abjpVar;
        this.d = awmdVar;
        this.r = awmdVar2;
        this.s = tbtVar;
        this.n = hwzVar;
        this.e = awmdVar3;
        this.t = awmdVar4;
        this.o = hfnVar;
        this.p = jnmVar;
        this.l = jnjVar;
        this.u = hziVar;
        this.q = jnmVar2;
        this.g = aunnVar;
        this.m = isiVar;
        this.h = aunnVar2;
        this.i = aervVar;
        this.k = vxzVar;
        this.j = awkuVar;
        ict ictVarP = aerjVar.p(0);
        this.f = ictVarP;
        ict ictVarP2 = aerjVar.p(1);
        this.v = ictVarP2;
        ictVarP.h();
        ictVarP.f = new igp(aunnVar, null);
        ictVarP2.h();
    }

    private final int l(hyz hyzVar, int i) {
        List listO = this.c.o(i);
        for (int i2 = 0; i2 < listO.size(); i2++) {
            hyz hyzVar2 = (hyz) listO.get(i2);
            if (hyzVar2 instanceof hzg) {
                if (((hzg) hyzVar2).y(hyzVar.n())) {
                    return i2;
                }
            } else if (Objects.equals(hyzVar2, hyzVar)) {
                return i2;
            }
        }
        return -1;
    }

    public final int a(apcc apccVar, int i) {
        int iOrdinal = apccVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return -1;
            }
            return this.c.d(0).size();
        }
        abjp abjpVar = this.c;
        int iA = abjpVar.a();
        return (i < 0 || i > iA) ? abjpVar.a() + 1 : iA;
    }

    public final ict b(int i) {
        return i == 0 ? this.f : this.v;
    }

    public final void c(ajwo ajwoVar) {
        apcc apccVarA;
        String str;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ish.c);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                return;
            }
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apcb.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            apccVarA = apcc.a(((apcb) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK))).f);
            if (apccVarA == null) {
                apccVarA = apcc.MODE_UNSPECIFIED;
            }
        } else {
            aigw aigwVar = ish.c;
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aigwVar);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aigwVar);
                ajwoVar.c(aihlVarCheckIsLite6);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                apccVarA = apcc.a(((apzd) (objK2 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK2))).e);
                if (apccVarA == null) {
                    apccVarA = apcc.MODE_UNSPECIFIED;
                }
            } else {
                apccVarA = null;
            }
        }
        if (apccVarA != null) {
            agrc agrcVar = (agrc) ((agrc) a.c().i(agso.a, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager", "enqueue", 188, "MusicPlaybackQueueOperationsManager.java");
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apcb.b);
            ajwoVar.c(aihlVarCheckIsLite7);
            if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(apcb.b);
                ajwoVar.c(aihlVarCheckIsLite8);
                Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                apcb apcbVar = (apcb) (objK3 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK3));
                apcd apcdVar = apcbVar.d;
                if (apcdVar == null) {
                    apcdVar = apcd.a;
                }
                String str2 = apcdVar.c;
                apcd apcdVar2 = apcbVar.d;
                if (apcdVar2 == null) {
                    apcdVar2 = apcd.a;
                }
                str = String.format("{videoId: %s, playlistId: %s}", str2, apcdVar2.d);
            } else {
                aigw aigwVar2 = ish.c;
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aigwVar2);
                ajwoVar.c(aihlVarCheckIsLite9);
                if (ajwoVar.j.n(aihlVarCheckIsLite9.d)) {
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aigwVar2);
                    ajwoVar.c(aihlVarCheckIsLite10);
                    Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
                    apzd apzdVar = (apzd) (objK4 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK4));
                    apze apzeVar = apzdVar.d;
                    if (apzeVar == null) {
                        apzeVar = apze.a;
                    }
                    String str3 = apzeVar.c;
                    apze apzeVar2 = apzdVar.d;
                    if (apzeVar2 == null) {
                        apzeVar2 = apze.a;
                    }
                    str = String.format("{uri: %s, containerUri: %s}", str3, apzeVar2.d);
                } else {
                    str = "Missing QueueTarget";
                }
            }
            agrcVar.B("enqueue item, QueueTarget: %s, position: %s", str, apccVarA);
            ahng.x(this.p.e(ajwoVar, MoreExecutors.directExecutor()), afwl.g(new icm(this, apccVarA)), this.b);
        }
    }

    public final void d(String str, boolean z) {
        this.i.d(str, z);
    }

    public final void e(hyz hyzVar) {
        ict ictVar = this.f;
        if (!ictVar.contains(hyzVar)) {
            ict ictVar2 = this.v;
            if (ictVar2.contains(hyzVar)) {
                if (hyzVar.o() != null) {
                    aczl aczlVar = (aczl) this.g.io();
                    aczlVar.getClass();
                    aczlVar.A(hyzVar, false);
                }
                ictVar2.remove(ictVar2.indexOf(hyzVar));
                return;
            }
            return;
        }
        aczl aczlVar2 = (aczl) this.g.io();
        aczlVar2.getClass();
        aczlVar2.A(hyzVar, true);
        awmd awmdVar = this.r;
        boolean zN = ((abvc) awmdVar.io()).n(abtu.a);
        int iIndexOf = ictVar.indexOf(hyzVar);
        abjp abjpVar = this.c;
        if (iIndexOf == abjpVar.a() && zN && ((abvk) this.d.io()).X()) {
            ((abvc) awmdVar.io()).i(this.u.c(abtt.NEXT, null, null));
        }
        ictVar.remove(iIndexOf);
        if (ictVar.isEmpty()) {
            abjpVar.r();
            this.s.e(new gse());
        }
    }

    public final void f(abnl abnlVar) {
        taf.i(abnlVar.J() ? ((iao) this.t.io()).b(abnlVar, false) : ((axfd) this.e.io()).q(abnlVar, null), this.b, new hou(15), new gov(this, abnlVar, 20), null);
    }

    public final boolean g(abnl abnlVar) {
        hyz hyzVar;
        if (!abnlVar.u().startsWith("RD")) {
            return false;
        }
        abjp abjpVar = this.c;
        return (abjg.a(abjpVar.c) == null || (hyzVar = (hyz) abjpVar.l()) == null || TextUtils.isEmpty(hyzVar.t()) || !hyzVar.t().equals(abnlVar.w())) ? false : true;
    }

    public final boolean h() {
        return this.c.b.isEmpty();
    }

    public final boolean i() {
        if (!h()) {
            abjp abjpVar = this.c;
            jnj jnjVar = this.l;
            if (abjpVar.k(jnjVar.q()) != null && gzj.X(((hyz) abjpVar.k(jnjVar.q())).n())) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (!h()) {
            abjp abjpVar = this.c;
            jnj jnjVar = this.l;
            if (abjpVar.k(jnjVar.q()) != null && !gzj.X(((hyz) abjpVar.k(jnjVar.q())).n())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final boolean k(hyz hyzVar, apcc apccVar) {
        int iL = l(hyzVar, 0);
        int iL2 = l(hyzVar, 1);
        int iA = a(apccVar, iL);
        if (iA == -1) {
            return false;
        }
        if (iL != -1) {
            abjp abjpVar = this.c;
            if (iL != abjpVar.a() && apccVar == apcc.INSERT_AFTER_CURRENT_VIDEO) {
                abjpVar.d(0).j(iL, iA);
                ((aczl) this.g.io()).z((abkg) abjpVar.d(0).get(iA), iA <= 0 ? null : (abkg) abjpVar.d(0).get(iA - 1));
            } else {
                if (iL2 != -1) {
                    return false;
                }
                abjp abjpVar2 = this.c;
                abjpVar2.d(0).add(iA, (hyz) abjpVar2.d(1).remove(iL2));
                aczl aczlVar = (aczl) this.g.io();
                aczlVar.getClass();
                aczlVar.x(hyzVar);
            }
        } else {
            if (iL2 != -1) {
                return false;
            }
            abjp abjpVar3 = this.c;
            abjpVar3.d(0).add(iA, (hyz) abjpVar3.d(1).remove(iL2));
            aczl aczlVar2 = (aczl) this.g.io();
            aczlVar2.getClass();
            aczlVar2.x(hyzVar);
        }
        return true;
    }
}
