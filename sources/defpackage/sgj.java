package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgj extends sgi {
    private final ofi k;
    private final String l;
    private final alvt m;

    /* JADX WARN: Illegal instructions before constructor call */
    public sgj(sko skoVar, alvt alvtVar, axfd axfdVar, boolean z, ofi ofiVar, ofe ofeVar) {
        alvw alvwVar = alvtVar.g;
        super(skoVar, 1000 * (alvwVar == null ? alvw.a : alvwVar).e, z, false, axfdVar);
        this.m = alvtVar;
        String string = UUID.randomUUID().toString();
        this.l = string;
        this.k = ofiVar;
        aizq aizqVarD = ((ovo) ofiVar.c.a).d();
        if (aizqVarD != null) {
            aisp aispVar = aizqVarD.e;
            if ((aispVar == null ? aisp.a : aispVar).b) {
                ogh oghVar = (ogh) ofiVar.a.get(string);
                if (oghVar != null && oghVar.m() != null) {
                    oghVar.t(null);
                    oghVar.s.c = this;
                    return;
                }
                ogn ognVar = new ogn(this);
                nrm nrmVar = ofiVar.b;
                ogh oghVar2 = new ogh(ognVar, ofeVar);
                oghVar2.a = a().d;
                oghVar2.t(null);
                ofiVar.a.put(string, oghVar2);
            }
        }
    }

    @Override // defpackage.ogi
    public final Set b(ogj ogjVar) {
        agke agkeVarA;
        for (alvn alvnVar : this.m.m) {
            for (aisv aisvVar : (alvnVar.b == 84813246 ? (aisu) alvnVar.c : aisu.a).e) {
                if ((aisvVar.b & 32) != 0) {
                    arci arciVar = aisvVar.f;
                    if (arciVar == null) {
                        arciVar = arci.a;
                    }
                    aivn aivnVar = arciVar.c;
                    if (aivnVar == null) {
                        aivnVar = aivn.a;
                    }
                    switch (ogjVar) {
                        case START:
                            agkeVarA = sng.a(aivnVar.s);
                            break;
                        case FIRST_QUARTILE:
                            agkeVarA = sng.a(aivnVar.t);
                            break;
                        case MIDPOINT:
                            agkeVarA = sng.a(aivnVar.u);
                            break;
                        case THIRD_QUARTILE:
                            agkeVarA = sng.a(aivnVar.v);
                            break;
                        case COMPLETE:
                            agkeVarA = sng.a(aivnVar.w);
                            break;
                        case RESUME:
                            agkeVarA = sng.a(aivnVar.g);
                            break;
                        case PAUSE:
                            agkeVarA = sng.a(aivnVar.f);
                            break;
                        case SUSPEND:
                            agkeVarA = agpi.a;
                            break;
                        case ABANDON:
                            agkeVarA = sng.a(aivnVar.r);
                            break;
                        case SKIP_SHOWN:
                            agkeVarA = sng.a((List) Collection.EL.stream(aivnVar.j).filter(sng.a).collect(Collectors.toList()));
                            break;
                        case SKIP:
                            agkeVarA = sng.a(aivnVar.h);
                            break;
                        case SWIPE:
                            agkeVarA = sng.a(aivnVar.z);
                            break;
                        case MUTE:
                            agkeVarA = sng.a(aivnVar.d);
                            break;
                        case UNMUTE:
                            agkeVarA = sng.a(aivnVar.e);
                            break;
                        case VIEWABLE_IMPRESSION:
                            agkeVarA = sng.a(aivnVar.n);
                            break;
                        case MEASURABLE_IMPRESSION:
                            agkeVarA = sng.a(aivnVar.o);
                            break;
                        case GROUPM_VIEWABLE_IMPRESSION:
                            agkeVarA = sng.a(aivnVar.p);
                            break;
                        case FULLSCREEN:
                            agkeVarA = sng.a(aivnVar.l);
                            break;
                        case EXIT_FULLSCREEN:
                            agkeVarA = sng.a(aivnVar.q);
                            break;
                        case AUDIO_AUDIBLE:
                            aive aiveVar = aivnVar.m;
                            if (aiveVar == null) {
                                aiveVar = aive.a;
                            }
                            agkeVarA = sng.a(aiveVar.b);
                            break;
                        case AUDIO_MEASURABLE:
                            aive aiveVar2 = aivnVar.m;
                            if (aiveVar2 == null) {
                                aiveVar2 = aive.a;
                            }
                            agkeVarA = sng.a(aiveVar2.c);
                            break;
                        default:
                            throw new RuntimeException(null, null);
                    }
                    return zzj.b(agkeVarA, a);
                }
            }
        }
        return agpr.a;
    }

    @Override // defpackage.sgi
    public final ofg h(int i) {
        if (i == 1) {
            this.g = this.k.a(this.l, ogj.FIRST_QUARTILE);
            return this.g;
        }
        if (i == 2) {
            this.g = this.k.a(this.l, ogj.MIDPOINT);
            return this.g;
        }
        if (i != 3) {
            return null;
        }
        this.g = this.k.a(this.l, ogj.THIRD_QUARTILE);
        return this.g;
    }

    @Override // defpackage.sgi
    public final void j() {
        this.g = this.k.a(this.l, ogj.ABANDON);
    }

    @Override // defpackage.sgi
    public final void k() {
        this.g = this.k.a(this.l, ogj.COMPLETE);
    }

    @Override // defpackage.sgi
    protected final void l() {
        this.g = this.k.a(this.l, ogj.START);
    }

    @Override // defpackage.sgi
    protected final void m() {
        this.g = this.k.a(this.l, ogj.PAUSE);
    }

    @Override // defpackage.sgi
    protected final void n() {
        this.g = this.k.a(this.l, ogj.RESUME);
    }

    @Override // defpackage.sgi
    public final void o() {
        this.g = this.k.a(this.l, ogj.SWIPE);
    }

    @Override // defpackage.sgi
    public final void p() {
        this.g = this.k.a(this.l, ogj.ABANDON);
    }

    @Override // defpackage.sgi
    public final void q() {
        ofi ofiVar = this.k;
        String str = this.l;
        ofiVar.a(str, ogj.SUSPEND);
        this.g = ofiVar.a(str, ogj.ABANDON);
    }

    @Override // defpackage.sgi
    public final void s(boolean z, long j) {
        this.b = j;
        if (!z || this.d) {
            return;
        }
        l();
        this.d = true;
    }

    @Override // defpackage.sgi
    public final void t(int i) {
        super.t(i);
        if (i == 7) {
            k();
        }
    }

    @Override // defpackage.sgi
    public final void r(abnr abnrVar) {
    }
}
