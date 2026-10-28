package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iby extends abiz implements abjy, abkd, abka {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/player/queue/MusicNavigablePlaybackQueue");
    public final abea a;
    private final icj c;
    private final jkp d;
    private final aunn e;
    private final abnc f;
    private final awmd g;
    private final hxd h;
    private final vxz i;
    private final khn l;
    private final hfn m;
    private final jnm n;

    public iby(icj icjVar, hfn hfnVar, jkp jkpVar, aunn aunnVar, abea abeaVar, hxd hxdVar, abnc abncVar, jnm jnmVar, awmd awmdVar, hfn hfnVar2, vxz vxzVar, abmt abmtVar, khn khnVar) {
        super(icjVar, hfnVar, abmtVar);
        this.c = icjVar;
        this.d = jkpVar;
        this.e = aunnVar;
        this.a = abeaVar;
        this.h = hxdVar;
        this.f = abncVar;
        this.n = jnmVar;
        this.g = awmdVar;
        this.m = hfnVar2;
        this.i = vxzVar;
        this.l = khnVar;
    }

    private static final List r(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        agrx agrxVar = agso.a;
        return aguu.r(aguu.I(list, new bym(13)));
    }

    @Override // defpackage.abiz, defpackage.abje
    public final int a(abtu abtuVar) {
        Optional optionalJw = jw(abtuVar);
        hlx hlxVar = new hlx(this, 9);
        if (true == optionalJw.isPresent()) {
            Object obj = optionalJw.get();
            abiy abiyVar = (abiy) obj;
            ((iby) hlxVar.a).p((hyz) abiyVar.a);
            optionalJw = Optional.ofNullable(Integer.valueOf(abiyVar.b));
        }
        return ((Integer) optionalJw.orElse(-1)).intValue();
    }

    @Override // defpackage.abiz, defpackage.abjl
    public final abjk b() {
        return abjk.a;
    }

    @Override // defpackage.abjy
    public final abjm c(abjk abjkVar, abjl abjlVar, abjx abjxVar) {
        acfw acfwVarI;
        Long lValueOf = null;
        if (abjlVar == null) {
            return new abkc(null);
        }
        hb();
        int iHd = abjlVar.hd();
        if (abjkVar != abjk.b || abjlVar.Q()) {
            int[] iArr = abjl.F;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                ha(i2, 0, abjg.c(abjlVar, i2));
            }
        } else {
            agrx agrxVar = agso.a;
            List listC = abjg.c(abjlVar, 0);
            int size = listC.size();
            List listSubList = listC.subList(0, Math.max(0, iHd));
            List listSubList2 = listC.subList(Math.max(0, iHd), listC.size());
            List listR = r(listSubList);
            List listR2 = r(listSubList2);
            agjz agjzVar = new agjz(4);
            agjzVar.j(listR);
            agjzVar.j(listR2);
            agke agkeVarG = agjzVar.g();
            if (iHd != -1) {
                iHd = Math.max(0, listR2.isEmpty() ? listR.size() - 1 : listR.size());
            }
            if (true == agkeVarG.isEmpty()) {
                iHd = -1;
            }
            Collection collectionR = r(abjg.c(abjlVar, 1));
            ha(0, 0, agkeVarG);
            ha(1, 0, collectionR);
            int i3 = size - ((agpi) agkeVarG).d;
            if (i3 > 0) {
                this.l.g(R.string.mdx_remove_unavailable_content);
                ((agrc) ((agrc) b.c().i(agrxVar, "MNPQueue")).k("com/google/android/apps/youtube/music/player/queue/MusicNavigablePlaybackQueue", "onPreReplaceQueue", 395, "MusicNavigablePlaybackQueue.java")).u("Removed %d unavailable items when switching queues.", i3);
            }
        }
        if (iHd != -1) {
            P(iHd);
            if (g() != null && (acfwVarI = g().i()) != null) {
                lValueOf = Long.valueOf(acfwVarI.a());
            }
        } else {
            icj icjVar = this.c;
            if (icjVar.Q()) {
                agrx agrxVar2 = agso.a;
                if (!icjVar.Q()) {
                    icjVar.hb();
                }
                icjVar.j.c(new gse());
            }
        }
        return abjx.b.equals(abjxVar) ? new abkb(lValueOf) : new abkc(lValueOf);
    }

    @Override // defpackage.abka
    public final abjz d() {
        return this.c.d();
    }

    @Override // defpackage.abiz
    public final /* synthetic */ abke e(abtu abtuVar) {
        Optional optionalJw = jw(abtuVar);
        hlx hlxVar = new hlx(this, 8);
        if (true == optionalJw.isPresent()) {
            Object obj = optionalJw.get();
            Object obj2 = hlxVar.a;
            hyz hyzVar = (hyz) ((abiy) obj).a;
            ((iby) obj2).p(hyzVar);
            optionalJw = Optional.ofNullable(hyzVar);
        }
        return (hyz) optionalJw.orElse(null);
    }

    @Override // defpackage.abje
    public final abtu f(abnl abnlVar, abnp abnpVar) {
        abtu abtuVar = new abtu(abtt.JUMP, abnlVar, abnpVar, null);
        if (aajg.g(n(abtuVar))) {
            return abtuVar;
        }
        return null;
    }

    public final abvk g() {
        return (abvk) this.g.io();
    }

    @Override // defpackage.abka
    public final void i() {
        this.c.i();
    }

    @Override // defpackage.abka
    public final void j() {
        this.c.j();
    }

    @Override // defpackage.abiz
    protected final Optional jw(abtu abtuVar) {
        abtt abttVar = abtuVar.e;
        if (abttVar == abtt.JUMP || abttVar == abtt.INSERT) {
            abnl abnlVar = abtuVar.f;
            if (abnlVar == null) {
                return Optional.empty();
            }
            int[] iArr = F;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                int iHc = 0;
                while (true) {
                    icj icjVar = this.c;
                    if (iHc < icjVar.hc(i2)) {
                        hyz hyzVar = (hyz) icjVar.O(i2, iHc);
                        if (hyzVar != null) {
                            if (hyzVar instanceof hzg ? ((hzg) hyzVar).y(abnlVar) : gzj.ae(abnlVar, hyzVar.n())) {
                                if (i2 == 1) {
                                    iHc += icjVar.hc(0);
                                }
                                return Optional.of(new abiy(hyzVar, iHc));
                            }
                        }
                        iHc++;
                    }
                }
            }
            return Optional.empty();
        }
        icj icjVar2 = this.c;
        int iHc2 = icjVar2.hc(0);
        int iOrdinal = abttVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iMax = Math.max(icjVar2.hd(), 0) - 1;
                if (((aesp) this.e.io()).q().equals(ibv.LOOP_ALL) && iHc2 > 0) {
                    iMax = (iMax + iHc2) % iHc2;
                }
                return tym.C(iMax, iHc2) ? Optional.of(new abiy((hyz) icjVar2.O(0, iMax), iMax)) : Optional.empty();
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                return Optional.empty();
            }
        }
        boolean z = this.d.getBoolean(gzj.AUTOPLAY_ENABLED, true);
        int iHc3 = icjVar2.hc(0);
        int iHc4 = icjVar2.hc(1);
        aunn aunnVar = this.e;
        int iHd = (!((aesp) aunnVar.io()).q().equals(ibv.LOOP_ONE) || abttVar == abtt.NEXT) ? icjVar2.hd() + 1 : icjVar2.hd();
        if (((aesp) aunnVar.io()).q().equals(ibv.LOOP_ALL) && iHc3 > 0) {
            iHd %= iHc3;
        }
        if (this.h.b && iHc3 > 0) {
            iHd %= iHc3;
        }
        if (tym.C(iHd, iHc3)) {
            return Optional.of(new abiy((hyz) icjVar2.O(0, iHd), iHd));
        }
        if (!this.i.l(67, 45387992L, false) && !this.n.C()) {
            z = z && !this.f.i;
        }
        return (iHc4 <= 0 || !z) ? Optional.empty() : Optional.of(new abiy((hyz) icjVar2.O(1, 0), icjVar2.hc(0)));
    }

    @Override // defpackage.abkd
    public final void k(wgi wgiVar, boolean z, abjm abjmVar) {
        this.c.k(wgiVar, z, abjmVar);
    }

    @Override // defpackage.abka
    public final void l() {
        this.c.l();
    }

    @Override // defpackage.abjy
    public final boolean m(List list, List list2, int i, abjm abjmVar) {
        return this.c.m(list, list2, i, abjmVar);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // defpackage.abiz, defpackage.abje
    public final int n(abtu abtuVar) {
        if (abtuVar == abtu.c) {
            hfn hfnVar = this.m;
            if (hfnVar.q()) {
                ?? r3 = hfnVar.a;
                j$.util.Collection.EL.stream(r3).forEach(new hgi(2));
                r3.clear();
                return 1;
            }
        }
        Optional optionalJw = jw(abtuVar);
        if (true == optionalJw.isPresent()) {
            optionalJw = Optional.ofNullable((hyz) ((abiy) optionalJw.get()).a);
        }
        return abtu.b(((abke) optionalJw.orElse(null)) != null);
    }

    public final void p(hyz hyzVar) {
        if (!(hyzVar instanceof hzf)) {
            if (hyzVar instanceof hzg) {
                ((hzg) hyzVar).f = new iat(this, 10);
                return;
            }
            return;
        }
        hzf hzfVar = (hzf) hyzVar;
        aoun aounVar = hzfVar.a;
        if (aounVar == null || (aounVar.b & SemanticState.Hidden) == 0) {
            return;
        }
        ajwo ajwoVar = aounVar.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        ajwo ajwoVarF = this.a.a().f(ajwoVar);
        if (ajwoVarF != null) {
            aihh aihhVar = (aihh) aounVar.toBuilder();
            aihhVar.copyOnWrite();
            aoun aounVar2 = (aoun) aihhVar.instance;
            aounVar2.l = ajwoVarF;
            aounVar2.b |= SemanticState.Hidden;
            hzfVar.u((aoun) aihhVar.build());
        }
    }

    @Override // defpackage.abts
    @Deprecated
    public final void q() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.abjy
    public final /* synthetic */ void o() {
    }
}
