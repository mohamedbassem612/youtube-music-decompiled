package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xxx extends abiz implements xzf, abjy, abka {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue");
    public final awmd b;
    public final Optional c;
    public boolean d;
    String e;
    public boolean f;
    String g;
    public final jnm h;
    final zik i;
    private final xxt l;
    private final awmd m;
    private final txp n;
    private final tbt o;
    private final xla p;
    private final SecureRandom q;
    private final abmt r;
    private xzc s;
    private List t;
    private final ycp u;
    private final aboi v;
    private final vxz w;

    public xxx(ycp ycpVar, jnm jnmVar, awmd awmdVar, awmd awmdVar2, hfn hfnVar, aboi aboiVar, txp txpVar, tbt tbtVar, xla xlaVar, vxz vxzVar, abmt abmtVar, Optional optional, SecureRandom secureRandom) {
        super(new abjc(abmtVar), hfnVar, abmtVar);
        this.l = new xxt();
        this.i = new xxv(this);
        this.d = false;
        this.f = false;
        this.u = ycpVar;
        this.h = jnmVar;
        this.b = awmdVar;
        this.m = awmdVar2;
        this.v = aboiVar;
        this.n = txpVar;
        this.o = tbtVar;
        this.p = xlaVar;
        this.w = vxzVar;
        this.r = abmtVar;
        this.c = optional;
        this.q = secureRandom;
    }

    private final long R() {
        acfw acfwVarH = ((abvk) this.b.io()).h();
        if (acfwVarH == null) {
            return 0L;
        }
        return acfwVarH.a();
    }

    private final void S() {
        String strS;
        xzc xzcVar = this.s;
        if (xzcVar == null || (strS = s(xzcVar.D(), xzcVar.z())) == null) {
            return;
        }
        String strS2 = s(xzcVar.x(), xzcVar.A());
        if (strS2 == null) {
            xyv xyvVar = xyv.a;
            xyu xyuVar = new xyu();
            xyuVar.n(strS);
            handleMdxSyncNewVideoPlaylistEvent(new xyd(xyuVar.a()));
            return;
        }
        xyv xyvVar2 = xyv.a;
        xyu xyuVar2 = new xyu();
        xyuVar2.n(strS);
        xyuVar2.f(strS2);
        handleMdxSyncRemoteQueueEvent(new xye(xyuVar2.a()));
    }

    private final boolean T() {
        xzc xzcVar = this.s;
        return xzcVar != null && xzcVar.b() == 1;
    }

    private static final List U(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            abke abkeVar = (abke) it.next();
            abnl abnlVarN = abkeVar.n();
            arrayList.add(xzv.a(abkeVar.t(), abnlVarN == null ? "" : abnlVarN.u()));
        }
        return arrayList;
    }

    private static final List V(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((abke) it.next()).t());
        }
        return arrayList;
    }

    private static final boolean W(int i) {
        return i == 0;
    }

    public static String s(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public final void D() {
        aboi aboiVar = this.v;
        abke abkeVarR = r();
        xyv xyvVarA = null;
        String strC = aboiVar.m() ? aboiVar.c() : null;
        if (strC == null || !awrc.n(strC, "RQ", false)) {
            strC = null;
        }
        if (strC != null && abkeVarR != null) {
            xyv xyvVar = xyv.a;
            xyu xyuVar = new xyu();
            xyuVar.n(abkeVarR.t());
            xyuVar.f(strC);
            xyvVarA = xyuVar.a();
        }
        if (xyvVarA == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "resync", 1398, "MdxPlaybackQueue.java")).t("resync | No current MDX playback descriptor, not resyncing.");
        } else {
            agrx agrxVar = agso.a;
            handleMdxSyncRemoteQueueEvent(new xye(xyvVarA, true));
        }
    }

    public final void E(String str) {
        int i = 0;
        while (true) {
            abjl abjlVar = this.k;
            if (i >= abjlVar.hc(0)) {
                agrx agrxVar = agso.a;
                return;
            } else {
                if (str.equals(abjlVar.O(0, i).t())) {
                    P(i);
                    return;
                }
                i++;
            }
        }
    }

    public final void F(List list) {
        abjl abjlVar = this.k;
        abjlVar.hi(0, 0, abjlVar.hc(0));
        abjlVar.ha(0, 0, list);
        abke abkeVarR = r();
        if (abkeVarR == null || abkeVarR.t().isEmpty()) {
            return;
        }
        E(abkeVarR.t());
    }

    public final boolean H() {
        vxz vxzVar = this.w;
        return vxzVar.l(81, 45418016L, false) || vxzVar.l(79, 45418013L, false) || vxzVar.l(78, 45418012L, false) || vxzVar.l(80, 45418015L, false);
    }

    public final boolean I() {
        vxz vxzVar = this.w;
        return vxzVar.l(110, 45620291L, false) && vxzVar.l(262, 45847159L, false);
    }

    public final synchronized void J(List list) {
        list.addAll(abjg.c(this, 0));
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final abjk b() {
        return abjk.b;
    }

    @Override // defpackage.abjy
    public final abjm c(abjk abjkVar, abjl abjlVar, abjx abjxVar) {
        this.o.f(this);
        ycp ycpVar = this.u;
        yco ycoVar = ycpVar.e;
        this.s = ycoVar;
        if (ycoVar != null) {
            ycoVar.ay(this.i);
        }
        ycpVar.a(this);
        if (abjlVar == null) {
            hb();
            if (!I()) {
                return null;
            }
            S();
            return null;
        }
        if (I()) {
            xzc xzcVar = this.s;
            String strS = xzcVar != null ? s(xzcVar.D(), xzcVar.z()) : null;
            abke abkeVarB = abjg.b(abjlVar);
            boolean z = strS != null && (abkeVarB == null || !strS.equals(abkeVarB.t()));
            boolean zX = ((abvk) this.b.io()).X();
            if (z || !zX) {
                this.k.hb();
                S();
                return new xxw();
            }
        }
        List listC = abjg.c(abjlVar, 0);
        List listC2 = abjg.c(abjlVar, 1);
        abjl abjlVar2 = this.k;
        abjlVar2.hb();
        abjlVar2.ha(0, 0, listC);
        abjlVar2.ha(1, 0, listC2);
        int iHd = abjlVar.hd();
        if (iHd != -1) {
            P(iHd);
        }
        if (I()) {
            S();
        }
        return new xxw();
    }

    @Override // defpackage.abka
    public final /* synthetic */ abjz d() {
        return abjz.a;
    }

    @Override // defpackage.abje
    public final abtu f(abnl abnlVar, abnp abnpVar) {
        aboi aboiVar = this.v;
        if (aboiVar.m()) {
            String strC = aboiVar.c();
            if (awrc.n(strC == null ? "" : strC, "RQ", false)) {
                abnk abnkVarF = abnlVar.f();
                abnkVarF.s = strC;
                abnlVar = abnkVarF.a();
            }
        }
        abtu abtuVar = new abtu(abtt.JUMP, abnlVar, abnpVar, null);
        return e(abtuVar) == null ? new abtu(abtt.INSERT, abnlVar, abnpVar, null) : abtuVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        xzc xzcVar2 = this.s;
        if (xzcVar2 != null) {
            xzcVar2.az(this.i);
            this.s = null;
        }
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final int gZ(int i, abke abkeVar) {
        abnl abnlVarN;
        int iHc = hc(i);
        if (iHc == 0) {
            return -1;
        }
        abnl abnlVarN2 = abkeVar.n();
        for (int i2 = 0; i2 < iHc; i2++) {
            if (abnlVarN2 != null && (abnlVarN = O(i, i2).n()) != null && Objects.equals(abnlVarN2.w(), abnlVarN.w())) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void ha(int i, int i2, Collection collection) {
        boolean zW = W(i);
        abjl abjlVar = this.k;
        agrx agrxVar = agso.a;
        if (!zW) {
            abjlVar.ha(i, i2, collection);
            return;
        }
        if (!T()) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "addToList", 220, "MdxPlaybackQueue.java")).t("addToList | MDx session is not ready. Discarding change.");
            return;
        }
        if (!this.w.l(78, 45418012L, false)) {
            if (i2 == hd() + 1) {
                if (this.p.ay()) {
                    this.s.L(U(collection));
                } else {
                    this.s.K(V(collection));
                }
            } else {
                if (i2 != hc(0)) {
                    throw new IllegalArgumentException("Invalid position. The position must be either after the current playbackPosition or the end of the queue");
                }
                if (this.p.ay()) {
                    this.s.F(U(collection));
                } else {
                    this.s.E(V(collection));
                }
            }
        }
        abjlVar.ha(i, i2, collection);
    }

    @tcc
    public void handleMdxSyncNewVideoPlaylistEvent(xyd xydVar) {
        xzc xzcVar;
        xyv xyvVar = xydVar.a;
        String str = xyvVar.b;
        String strA = xyvVar.g;
        if (I() && strA.isEmpty() && (xzcVar = this.s) != null && !TextUtils.isEmpty(xzcVar.A())) {
            strA = this.s.A();
        }
        agrx agrxVar = agso.a;
        if (strA.isEmpty()) {
            agrf agrfVar = a;
            ((agrc) ((agrc) agrfVar.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "handleMdxSyncNewVideoPlaylistEvent", 1127, "MdxPlaybackQueue.java")).t("Syncing down now playing video but playlist id is empty.");
            if (I() && str.isEmpty()) {
                ((agrc) ((agrc) agrfVar.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "handleMdxSyncNewVideoPlaylistEvent", 1129, "MdxPlaybackQueue.java")).t("Received now playing message without video id, ignore.");
                return;
            }
        } else if (str.isEmpty()) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "handleMdxSyncNewVideoPlaylistEvent", 1133, "MdxPlaybackQueue.java")).t("Received now playing message without video id, ignore.");
            return;
        }
        if (this.d) {
            this.e = str;
        } else {
            w(str, strA, false);
        }
    }

    @tcc
    public void handleMdxSyncRemoteQueueEvent(xye xyeVar) {
        xyv xyvVar = xyeVar.a;
        String str = xyvVar.g;
        String str2 = xyvVar.b;
        agrx agrxVar = agso.a;
        boolean z = xyeVar.b;
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "handleMdxSyncRemoteQueueEvent", 1352, "MdxPlaybackQueue.java")).t("Trying to sync down empty playlistId. Discarding request.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.d = true;
        String strA = this.n.a();
        this.g = strA;
        jnm jnmVar = this.h;
        xxs xxsVar = new xxs(this, strA, xyeVar, xyvVar, 0);
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihf aihfVarCreateBuilder = apcb.a.createBuilder();
        aihf aihfVarCreateBuilder2 = apcd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apcd apcdVar = (apcd) aihfVarCreateBuilder2.instance;
        apcdVar.b |= 2;
        apcdVar.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        apcb apcbVar = (apcb) aihfVarCreateBuilder.instance;
        apcd apcdVar2 = (apcd) aihfVarCreateBuilder2.build();
        apcdVar2.getClass();
        apcbVar.d = apcdVar2;
        apcbVar.c |= 1;
        aihhVar.e(apcb.b, (apcb) aihfVarCreateBuilder.build());
        jnmVar.f((ajwo) aihhVar.build(), xxsVar);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hb() {
        if (T()) {
            this.u.e.H();
            this.k.hb();
            return;
        }
        xzc xzcVar = this.s;
        if (xzcVar == null || xzcVar.b() == 2) {
            boolean zL = this.w.l(110, 45620291L, false);
            agrf agrfVar = a;
            if (!zL) {
                ((agrc) ((agrc) agrfVar.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "clear", 467, "MdxPlaybackQueue.java")).t("clear | MDx session is not ready. Discarding change.");
            } else {
                ((agrc) ((agrc) agrfVar.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "clear", 462, "MdxPlaybackQueue.java")).t("Clearing MdxPlaybackQueue after disconnect.");
                this.k.hb();
            }
        }
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void he(abjh abjhVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.a;
        if (set.isEmpty()) {
            this.k.he(xxtVar);
        }
        set.add(abjhVar);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hf(abji abjiVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.b;
        if (set.isEmpty()) {
            this.k.hf(xxtVar);
        }
        set.add(abjiVar);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hg(abjj abjjVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.c;
        if (set.isEmpty()) {
            this.k.hg(xxtVar);
        }
        set.add(abjjVar);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hh(int i, int i2, int i3, int i4) {
        boolean zW = W(i);
        boolean zW2 = W(i3);
        ycp ycpVar = this.u;
        agrx agrxVar = agso.a;
        yco ycoVar = ycpVar.e;
        if (!zW) {
            abjl abjlVar = this.k;
            if (!zW2) {
                abjlVar.hh(i, i2, i3, i4);
                return;
            }
            if (!T()) {
                ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "moveItemFromAnotherListToQueueList", 432, "MdxPlaybackQueue.java")).t("moveItemInList | MDx session is not ready. Discarding change.");
                return;
            }
            String strT = O(i, i2).t();
            if (i4 == hd() + 1) {
                if (!this.w.l(78, 45418012L, false)) {
                    ycoVar.M(strT);
                }
            } else {
                if (i4 != hc(0)) {
                    throw new IllegalArgumentException("Invalid position. The toPosition must be either after the current playbackPosition or the end of the queue list");
                }
                if (!this.w.l(78, 45418012L, false)) {
                    ycoVar.G(strT);
                }
            }
            abjlVar.hh(i, i2, 0, i4);
            return;
        }
        abjl abjlVar2 = this.k;
        if (!zW2) {
            if (!T()) {
                ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "moveItemFromQueueListToAnotherList", 392, "MdxPlaybackQueue.java")).t("moveItemInList | MDx session is not ready. Discarding change.");
                return;
            }
            String strT2 = O(0, i2).t();
            if (!this.w.l(79, 45418013L, false)) {
                ycoVar.W(strT2);
            }
            abjlVar2.hh(0, i2, i3, i4);
            return;
        }
        if (!T()) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "moveItemFromQueueListToQueueList", 369, "MdxPlaybackQueue.java")).t("moveItemInList | MDx session is not ready. Discarding change.");
            return;
        }
        String strT3 = O(0, i2).t();
        int i5 = i4 - i2;
        if (!this.w.l(81, 45418016L, false)) {
            ycoVar.N(strT3, i5);
        }
        abjlVar2.hh(0, i2, 0, i4);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hi(int i, int i2, int i3) {
        boolean zW = W(i);
        abjl abjlVar = this.k;
        ycp ycpVar = this.u;
        agrx agrxVar = agso.a;
        yco ycoVar = ycpVar.e;
        if (!zW) {
            abjlVar.hi(i, i2, i3);
            return;
        }
        if (!T()) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "removeFromList", 303, "MdxPlaybackQueue.java")).t("removeFromList | MDx session is not ready. Discarding change.");
            return;
        }
        if (!this.w.l(79, 45418013L, false)) {
            if (i3 != 1) {
                throw new IllegalArgumentException("The MDx playback queue only supports removing a single video.");
            }
            ycoVar.W(O(i, i2).t());
        }
        abjlVar.hi(i, i2, i3);
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hj(abjh abjhVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.a;
        set.remove(abjhVar);
        if (set.isEmpty()) {
            this.k.hj(xxtVar);
        }
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hk(abji abjiVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.b;
        set.remove(abjiVar);
        if (set.isEmpty()) {
            this.k.hk(xxtVar);
        }
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final void hl(abjj abjjVar) {
        xxt xxtVar = this.l;
        Set set = xxtVar.c;
        set.remove(abjjVar);
        if (set.isEmpty()) {
            this.k.hl(xxtVar);
        }
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final synchronized boolean hm() {
        return this.k.hm();
    }

    @Override // defpackage.abka
    public final void i() {
        this.t = null;
    }

    @Override // defpackage.abka
    public final void j() {
        int iHc = hc(0);
        int i = 1;
        if (iHc > 1) {
            ArrayList arrayList = new ArrayList();
            this.t = arrayList;
            J(arrayList);
            ArrayList arrayList2 = new ArrayList();
            J(arrayList2);
            int iHd = hd();
            if (iHd == -1 || iHd >= arrayList2.size()) {
                i = 0;
            } else {
                arrayList2.add(0, (abke) arrayList2.remove(iHd));
            }
            while (i < iHc - 1) {
                int iNextInt = this.q.nextInt(iHc - i) + i;
                arrayList2.add(i, (abke) arrayList2.remove(iNextInt));
                i++;
                arrayList2.add(iNextInt, (abke) arrayList2.remove(i));
            }
            long jR = iHd != -1 ? R() : 0L;
            Optional optional = this.c;
            optional.isPresent();
            ((awku) optional.get()).kk(Boolean.TRUE);
            if (m(arrayList2, null, 0, this.w.l(168, 45685936L, false) ? new abkb(Long.valueOf(jR)) : null)) {
                agrx agrxVar = agso.a;
            } else {
                agrx agrxVar2 = agso.a;
            }
        }
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        this.s = xzcVar;
        xzcVar.ay(this.i);
    }

    @Override // defpackage.abka
    public final void l() {
        List list = this.t;
        if (list != null) {
            this.t = null;
            int iHd = hd();
            if (iHd < 0 || iHd >= hc(0)) {
                return;
            }
            abke abkeVarO = O(0, iHd);
            if (list.contains(abkeVarO)) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (abkeVarO.equals(list.get(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    agrx agrxVar = agso.a;
                    return;
                }
                long jR = R();
                Optional optional = this.c;
                optional.isPresent();
                ((awku) optional.get()).kk(Boolean.TRUE);
                if (m(list, null, i, this.w.l(168, 45685936L, false) ? new abkb(Long.valueOf(jR)) : null)) {
                    agrx agrxVar2 = agso.a;
                } else {
                    agrx agrxVar3 = agso.a;
                }
            }
        }
    }

    @Override // defpackage.abjy
    public final boolean m(List list, List list2, int i, abjm abjmVar) {
        boolean z;
        boolean z2;
        ycp ycpVar = this.u;
        agrx agrxVar = agso.a;
        yco ycoVar = ycpVar.e;
        if (i < 0 || i >= list.size()) {
            return false;
        }
        if (!T()) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "replaceQueueContents", 855, "MdxPlaybackQueue.java")).t("replaceQueueContents | MDx session is not ready. Discarding change.");
            return false;
        }
        abke abkeVar = (abke) list.get(i);
        abnl abnlVarA = abjmVar != null ? abjmVar.a(abkeVar) : abkeVar.n();
        if (abnlVarA == null || ahno.aa(abnlVarA.w())) {
            agrc agrcVar = (agrc) ((agrc) a.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "replaceQueueContents", 818, "MdxPlaybackQueue.java");
            if (abnlVarA == null) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = true;
            }
            agrcVar.D("replaceQueueContents | PSD is null (%b) or video id is empty (%b).", z, z2);
            abmt abmtVar = this.r;
            if (abmtVar != null && abmtVar.aN()) {
                return false;
            }
        }
        xyv xyvVar = xyv.a;
        xyu xyuVar = new xyu();
        xyuVar.l(Integer.valueOf(xyv.b(i)));
        xyuVar.n(abnlVarA.w());
        xyuVar.i(V(list));
        xyuVar.c(abnlVarA.c());
        xyuVar.j(abnlVarA.r());
        xyuVar.e(abnlVarA.s());
        xyuVar.k(abnlVarA.Q());
        aboi aboiVar = this.v;
        String strC = aboiVar.m() ? aboiVar.c() : null;
        if (strC != null) {
            xyuVar.f(strC);
        }
        abjl abjlVar = this.k;
        ycoVar.ac(xyuVar.a());
        abjlVar.hi(0, 0, abjlVar.hc(0));
        abjlVar.ha(0, 0, list);
        abjlVar.P(i);
        return true;
    }

    @Override // defpackage.abiz, defpackage.abje
    public final int n(abtu abtuVar) {
        if (abtuVar.e == abtt.AUTOPLAY) {
            return 1;
        }
        return super.n(abtuVar);
    }

    @Override // defpackage.abjy
    public final void o() {
        this.o.l(this);
        this.u.d(this);
    }

    public final abke r() {
        int iHd = hd();
        if (iHd != -1) {
            return this.k.O(0, iHd);
        }
        return null;
    }

    public final void w(String str, String str2, boolean z) {
        ahno.F(!str.isEmpty());
        ahno.F(!str.isEmpty());
        int iHd = hd();
        int i = 0;
        while (true) {
            abjl abjlVar = this.k;
            if (i >= abjlVar.hc(0)) {
                agrf agrfVar = a;
                agru agruVarB = agrfVar.b();
                agrx agrxVar = agso.a;
                ((agrc) ((agrc) agruVarB.i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "findNowPlayingVideoInQueue", 1188, "MdxPlaybackQueue.java")).w("Couldn't find the now playing video: %s", str);
                if (I()) {
                    if (z || TextUtils.isEmpty(str2)) {
                        x(str, str2);
                        return;
                    }
                    ((agrc) ((agrc) agrfVar.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "findNowPlayingVideoInQueue", 1194, "MdxPlaybackQueue.java")).t("Couldn't find the now playing video , attempting to refetch the remote queue.");
                    xyv xyvVar = xyv.a;
                    xyu xyuVar = new xyu();
                    xyuVar.n(str);
                    xyuVar.f(str2);
                    handleMdxSyncRemoteQueueEvent(new xye(xyuVar.a(), true));
                    return;
                }
                if (!this.v.m()) {
                    x(str, str2);
                    return;
                }
                if (z || TextUtils.isEmpty(str2)) {
                    return;
                }
                ((agrc) ((agrc) agrfVar.c().i(agrxVar, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "findNowPlayingVideoInQueue", 1213, "MdxPlaybackQueue.java")).t("Couldn't find the now playing video , attempting to refetch the remote queue.");
                xyv xyvVar2 = xyv.a;
                xyu xyuVar2 = new xyu();
                xyuVar2.n(str);
                xyuVar2.f(str2);
                handleMdxSyncRemoteQueueEvent(new xye(xyuVar2.a(), true));
                return;
            }
            abke abkeVarO = abjlVar.O(0, i);
            if (str.equals(abkeVarO.t())) {
                if (i == iHd && this.v.m()) {
                    agrx agrxVar2 = agso.a;
                    return;
                }
                abvc abvcVar = (abvc) this.m.io();
                abnl abnlVarN = abkeVarO.n();
                if (!TextUtils.isEmpty(str2) && abnlVarN != null) {
                    abnk abnkVarF = abnlVarN.f();
                    abnkVarF.s = str2;
                    abnlVarN = abnkVarF.a();
                }
                if (abnlVarN != null) {
                    agrx agrxVar3 = agso.a;
                    if (I()) {
                        P(i);
                    }
                    abvcVar.g(abnlVarN);
                    return;
                }
                agrx agrxVar4 = agso.a;
            }
            i++;
        }
    }

    public final void x(String str, String str2) {
        abvc abvcVar = (abvc) this.m.io();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihf aihfVarCreateBuilder = arij.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar = (arij) aihfVarCreateBuilder.instance;
        str.getClass();
        arijVar.b |= 1;
        arijVar.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar2 = (arij) aihfVarCreateBuilder.instance;
        arijVar2.b |= 2;
        arijVar2.e = str2;
        aihhVar.e(arik.a, (arij) aihfVarCreateBuilder.build());
        abnk abnkVar = new abnk();
        abnkVar.a = (ajwo) aihhVar.build();
        abnkVar.b();
        abnl abnlVarA = abnkVar.a();
        abke abkeVarR = r();
        boolean z = abkeVarR != null && str.equals(abkeVarR.t());
        if (I() && !TextUtils.isEmpty(str) && !z) {
            this.h.g(str, new xxs(this, str, abnlVarA, abvcVar, 1));
        } else {
            agrx agrxVar = agso.a;
            abvcVar.g(abnlVarA);
        }
    }

    @Override // defpackage.abts
    public final void q() {
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }
}
