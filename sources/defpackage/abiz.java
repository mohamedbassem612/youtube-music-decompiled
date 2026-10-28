package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class abiz implements abje, abts {
    public static final agrf j = agrf.h("com/google/android/libraries/youtube/player/features/queue/AbstractNavigablePlaybackQueue");
    private final abmt a;
    private final hfn b;
    public final abjl k;

    public abiz(abjl abjlVar, hfn hfnVar, abmt abmtVar) {
        abjlVar.getClass();
        this.k = abjlVar;
        hfnVar.getClass();
        this.b = hfnVar;
        abmtVar.getClass();
        this.a = abmtVar;
    }

    private final Optional c(abke abkeVar) {
        if (abkeVar != null) {
            int[] iArr = abjl.F;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                abjl abjlVar = this.k;
                int iGZ = abjlVar.gZ(i2, abkeVar);
                if (iGZ != -1) {
                    abke abkeVarO = abjlVar.O(i2, iGZ);
                    if (i2 != 0) {
                        iGZ += abjlVar.hc(0);
                    }
                    return Optional.of(new abiy(abkeVarO, iGZ));
                }
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.abjl
    public final int M(abke abkeVar) {
        return this.k.M(abkeVar);
    }

    @Override // defpackage.abjl
    public final abjw N() {
        return this.k.N();
    }

    @Override // defpackage.abjl
    public final abke O(int i, int i2) {
        return this.k.O(i, i2);
    }

    @Override // defpackage.abjl
    public final void P(int i) {
        this.k.P(i);
    }

    @Override // defpackage.abjl
    public final boolean Q() {
        return this.k.Q();
    }

    @Override // defpackage.abje
    public int a(abtu abtuVar) {
        Optional optionalJw = jw(abtuVar);
        if (true == optionalJw.isPresent()) {
            optionalJw = Optional.ofNullable(Integer.valueOf(((abiy) optionalJw.get()).b));
        }
        return ((Integer) optionalJw.orElse(-1)).intValue();
    }

    @Override // defpackage.abjl
    public abjk b() {
        return this.k.b();
    }

    protected abke e(abtu abtuVar) {
        Optional optionalJw = jw(abtuVar);
        if (true == optionalJw.isPresent()) {
            optionalJw = Optional.ofNullable(((abiy) optionalJw.get()).a);
        }
        return (abke) optionalJw.orElse(null);
    }

    @Override // defpackage.abjl
    public int gZ(int i, abke abkeVar) {
        return this.k.gZ(i, abkeVar);
    }

    @Override // defpackage.abjl
    public void ha(int i, int i2, Collection collection) {
        this.k.ha(i, i2, collection);
    }

    @Override // defpackage.abjl
    public void hb() {
        this.k.hb();
    }

    @Override // defpackage.abjl
    public final int hc(int i) {
        return this.k.hc(i);
    }

    @Override // defpackage.abjl
    public final int hd() {
        return this.k.hd();
    }

    @Override // defpackage.abjl
    public void he(abjh abjhVar) {
        this.k.he(abjhVar);
    }

    @Override // defpackage.abjl
    public void hf(abji abjiVar) {
        this.k.hf(abjiVar);
    }

    @Override // defpackage.abjl
    public void hg(abjj abjjVar) {
        this.k.hg(abjjVar);
    }

    @Override // defpackage.abjl
    public void hh(int i, int i2, int i3, int i4) {
        this.k.hh(i, i2, i3, i4);
    }

    @Override // defpackage.abjl
    public void hi(int i, int i2, int i3) {
        this.k.hi(i, i2, i3);
    }

    @Override // defpackage.abjl
    public void hj(abjh abjhVar) {
        this.k.hj(abjhVar);
    }

    @Override // defpackage.abjl
    public void hk(abji abjiVar) {
        this.k.hk(abjiVar);
    }

    @Override // defpackage.abjl
    public void hl(abjj abjjVar) {
        this.k.hl(abjjVar);
    }

    @Override // defpackage.abjl
    public boolean hm() {
        return this.k.hm();
    }

    protected Optional jw(abtu abtuVar) {
        hzf hzfVar;
        q();
        hc(0);
        int iHd = hd() + 1;
        q();
        hc(0);
        int iMax = Math.max(hd(), 0) - 1;
        q();
        abnl abnlVar = abtuVar.f;
        if (abnlVar != null) {
            aihh aihhVar = (aihh) aoun.a.createBuilder();
            ajwo ajwoVar = abnlVar.b;
            String strS = gzj.S(ajwoVar);
            aihhVar.copyOnWrite();
            aoun aounVar = (aoun) aihhVar.instance;
            strS.getClass();
            aounVar.b |= 524288;
            aounVar.s = strS;
            String strW = abnlVar.w();
            aihhVar.copyOnWrite();
            aoun aounVar2 = (aoun) aihhVar.instance;
            strW.getClass();
            aounVar2.b |= SemanticState.Obscured;
            aounVar2.n = strW;
            if (ajwoVar != null) {
                aihhVar.copyOnWrite();
                aoun aounVar3 = (aoun) aihhVar.instance;
                aounVar3.l = ajwoVar;
                aounVar3.b |= SemanticState.Hidden;
            }
            hzfVar = new hzf(this.b.t().longValue(), (aoun) aihhVar.build(), false);
        } else {
            hzfVar = null;
        }
        abtt abttVar = abtuVar.e;
        abjl abjlVar = this.k;
        int iHc = abjlVar.hc(0);
        int iHc2 = abjlVar.hc(1);
        int iOrdinal = abttVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return tym.C(iMax, iHc) ? Optional.of(new abiy(abjlVar.O(0, iMax), iMax)) : Optional.empty();
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (abjlVar.hd() != iHc + (-1) || iHc2 <= 0) ? Optional.empty() : Optional.of(new abiy(abjlVar.O(1, 0), abjlVar.hc(0)));
                }
                if (iOrdinal == 4) {
                    return c(hzfVar);
                }
                if (iOrdinal != 5) {
                    return Optional.empty();
                }
                if (hzfVar == null) {
                    return Optional.empty();
                }
                if (this.a.g.l(111, 45627804L, false)) {
                    return c(hzfVar).or(new uqq(this, hzfVar, 13));
                }
                int iGZ = abjlVar.gZ(0, hzfVar);
                if (iGZ == -1) {
                    iGZ = hd() + 1;
                }
                return Optional.of(new abiy(hzfVar, iGZ));
            }
            if (abjlVar.hd() == -1) {
                return Optional.empty();
            }
        }
        if (tym.C(iHd, iHc)) {
            return Optional.of(new abiy(abjlVar.O(0, iHd), iHd));
        }
        return (abttVar != abtt.NEXT || iHc2 <= 0) ? Optional.empty() : Optional.of(new abiy(abjlVar.O(1, 0), abjlVar.hc(0)));
    }

    @Override // defpackage.abje
    public int n(abtu abtuVar) {
        if (!this.a.m.l(96, 45663714L, false)) {
            abke abkeVarE = e(abtuVar);
            if (abtuVar.e != abtt.AUTOPLAY || abkeVarE != null) {
                return abtu.b(abkeVarE != null);
            }
        }
        return 3;
    }
}
