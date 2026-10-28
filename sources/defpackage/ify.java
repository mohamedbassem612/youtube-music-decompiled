package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy;
import com.google.protos.youtube.api.innertube.SabrPrefetchConfigOuterClass$SabrPrefetchConfig;
import j$.time.Duration;
import j$.util.Optional;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ify implements abuo {
    public final abea a;
    public final abvk b;
    public final igb c;
    public volatile igc d;
    public final vxz e;
    private final igr f;
    private final abwf g;
    private final xit h;
    private final abwj i;
    private final Predicate j;
    private final hxd k;
    private final isi l;
    private final hfn m;
    private final hef n;

    public ify(abvn abvnVar, isi isiVar, hxd hxdVar, hfn hfnVar, igr igrVar, abwf abwfVar, hef hefVar, abea abeaVar, xit xitVar, abwj abwjVar, vxz vxzVar, avmb avmbVar) {
        abvnVar.getClass();
        hxdVar.getClass();
        hfnVar.getClass();
        igrVar.getClass();
        abwfVar.getClass();
        abeaVar.getClass();
        xitVar.getClass();
        abwjVar.getClass();
        vxzVar.getClass();
        avmbVar.getClass();
        this.l = isiVar;
        this.k = hxdVar;
        this.m = hfnVar;
        this.f = igrVar;
        this.g = abwfVar;
        this.n = hefVar;
        this.a = abeaVar;
        this.h = xitVar;
        this.i = abwjVar;
        this.e = vxzVar;
        this.b = abvnVar.o();
        this.c = new igb(abvnVar, avmbVar);
        int i = 7;
        this.j = new hkn(this, i);
        new avmm().e(((avlh) abvnVar.r().m).x(new ifu(new bfu(9), 0)).L(avmbVar).al(new icy(new agw(this, 14), i), new icy(ifv.a, 8)), abvnVar.J().L(avmbVar).al(new icy(new dmf((Object) this, 3, (short[]) null), 9), new icy(ifw.a, 10)));
    }

    @Override // defpackage.abuo
    public final /* synthetic */ ListenableFuture a(abun abunVar, abug abugVar) {
        abue ifxVar;
        igd igdVarH;
        Duration durationOfMillis;
        igd igdVar = (igd) abunVar;
        igdVar.a().w();
        abjk abjkVar = igdVar.c;
        acfw acfwVarH = this.b.h();
        wjf wjfVarC = acfwVarH != null ? acfwVarH.c() : null;
        if (this.f.h || (wjfVarC != null && wjfVarC.V())) {
            return aher.a;
        }
        hef hefVar = this.n;
        ahsk ahskVarA = abnt.a();
        if (hef.v(wjfVarC).b == 2) {
            aclr aclrVarB = abns.b();
            aclrVarB.b = 5;
            if (wjfVarC == null) {
                durationOfMillis = Duration.ZERO;
                durationOfMillis.getClass();
            } else {
                SabrPrefetchConfigOuterClass$SabrPrefetchConfig sabrPrefetchConfigOuterClass$SabrPrefetchConfigV = hef.v(wjfVarC);
                if ((sabrPrefetchConfigOuterClass$SabrPrefetchConfigV.b == 2 ? (SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy) sabrPrefetchConfigOuterClass$SabrPrefetchConfigV.c : SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy.getDefaultInstance()).b.size() > 0) {
                    Long l = (Long) (sabrPrefetchConfigOuterClass$SabrPrefetchConfigV.b == 2 ? (SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy) sabrPrefetchConfigOuterClass$SabrPrefetchConfigV.c : SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy.getDefaultInstance()).b.get(0);
                    l.getClass();
                    durationOfMillis = Duration.ofMillis(l.longValue());
                    durationOfMillis.getClass();
                } else {
                    durationOfMillis = Duration.ZERO;
                    durationOfMillis.getClass();
                }
            }
            aclrVarB.d((int) durationOfMillis.toSeconds());
            ahskVarA.f(aclrVarB.c());
        }
        vxz vxzVar = (vxz) hefVar.b;
        if (vxzVar.l(100, 45771009L, false) || !((jnm) hefVar.a).C()) {
            ahskVarA.e(vxzVar.c(0, 45631682L, 0L));
        }
        abuf abufVarT = abug.t(abugVar);
        abufVarT.g(ahskVarA.c());
        abug abugVarA = abufVarT.a();
        if (abjkVar == abjk.b) {
            return aher.a;
        }
        boolean zQ = this.m.q();
        igdVar.a().w();
        boolean z = this.i.l;
        if (z) {
            ifxVar = new ifx(this);
        } else {
            ifxVar = abug.b;
            ifxVar.getClass();
        }
        abue abueVar = ifxVar;
        abwf abwfVar = this.g;
        if (igdVar.g()) {
            xir xirVarO = this.h.o(4);
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            agvp.ad(aihfVarCreateBuilder);
            aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            agvp.aa(amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV, aihfVarCreateBuilder2);
            agvp.ac(agvp.Z(aihfVarCreateBuilder2), aihfVarCreateBuilder);
            xirVarO.h(agvp.ab(aihfVarCreateBuilder));
            ajwo ajwoVarF = z ? igdVar.a().b : this.a.a().f(igdVar.a().b);
            abut abutVarI = abuu.i(igdVar.a);
            abnk abnkVarF = igdVar.a().f();
            abnkVarF.b = true;
            abnkVarF.c = true;
            abnkVarF.a = ajwoVarF;
            abutVarI.b(abnkVarF.a());
            abno abnoVarB = abnp.b(igdVar.b());
            abnoVarB.a = xirVarO;
            abnoVarB.h(zQ);
            abutVarI.c(abnoVarB.a());
            igdVarH = igd.h(igdVar, abutVarI.a(), 0L, null, null, 14);
        } else {
            abut abutVarI2 = abuu.i(igdVar.a);
            abnk abnkVarF2 = igdVar.a().f();
            abnkVarF2.b = true;
            abnkVarF2.c = true;
            abutVarI2.b(abnkVarF2.a());
            igdVarH = igd.h(igdVar, abutVarI2.a(), 0L, null, null, 14);
        }
        abuf abufVarT2 = abug.t(abugVarA);
        abufVarT2.b(abueVar);
        return abwfVar.d(igdVarH, abufVarT2.a(), this.j);
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void b(abun abunVar, abuc abucVar) {
        abnl abnlVarA;
        igd igdVar = (igd) abunVar;
        igc igcVarZ = hna.z(igdVar);
        abtz abtzVar = abucVar.b;
        igc igcVar = this.d;
        abtz abtzVar2 = abtz.NONE;
        if (abtzVar == abtzVar2 && igcVar != null && (awrc.c(igcVar, igcVarZ) || (igcVar.a == -1 && awrc.c(igcVar.b, igcVarZ.b)))) {
            this.d = igcVarZ;
            return;
        }
        abnl abnlVarA2 = igdVar.a();
        ajwo ajwoVar = abnlVarA2.b;
        if (abtzVar == abtzVar2) {
            abnk abnkVarG = abnlVarA2.g();
            abnkVarG.a = ajwoVar;
            if (this.e.l(SemanticState.Focused, 45835360L, false)) {
                this.l.c(abnkVarG);
            }
            abnlVarA = abnkVarG.a();
        } else {
            abnk abnkVarF = abnlVarA2.f();
            abnkVarF.a = ajwoVar;
            isi isiVar = this.l;
            if (((hxd) isiVar.a).b) {
                abnkVarF.n = jrj.AUDIO_ROUTE_ALARM;
            }
            isiVar.c(abnkVarF);
            String strW = abnlVarA2.w();
            strW.getClass();
            abtz abtzVar3 = abtz.NEXT;
            if (!abnlVarA2.J()) {
                if (abtzVar == abtzVar3) {
                    icx icxVar = (icx) isiVar.b;
                    aunn aunnVar = icxVar.a;
                    int iA = ((abjp) aunnVar.io()).a();
                    if (iA == -1 || ((abjp) aunnVar.io()).d(0).isEmpty()) {
                        agrx agrxVar = agso.a;
                    } else {
                        icxVar.b(iA);
                        icxVar.c(strW, false, iA + 1);
                    }
                }
                Optional optionalA = ((icx) isiVar.b).a();
                optionalA.getClass();
                apla aplaVar = (apla) awrc.f(optionalA);
                if (aplaVar != null) {
                    abnkVarF.e(aplaVar);
                }
            }
            if (abtzVar == abtzVar3) {
                adrx adrxVar = new adrx(null, null);
                adrxVar.c(amac.WATCH_NEXT_TYPE_SKIP_VIDEO);
                abnkVarF.o = adrxVar.b();
            }
            if (abtzVar == abtz.AUTOPLAY) {
                abnkVarF.c = true;
                abnkVarF.b = true;
            }
            abnlVarA = abnkVarF.a();
        }
        abno abnoVarB = abnp.b(igdVar.b());
        if (this.k.b) {
            abnoVarB.b(jrj.AUDIO_ROUTE_ALARM);
        }
        if (abtzVar == abtz.NEXT) {
            abnoVarB.i(true);
        }
        igdVar.a().w();
        igdVar.a().P();
        abwf abwfVar = this.g;
        abut abutVarI = abuu.i(igdVar);
        abutVarI.b(abnlVarA);
        abutVarI.c(abnoVarB.a());
        abwfVar.k(igd.h(igdVar, abutVarI.a(), 0L, null, null, 14), abucVar, this.c);
        this.d = igcVarZ;
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void c(abun abunVar, abun abunVar2) {
        if (!(abunVar2 instanceof abvz)) {
            this.c.a = null;
            this.d = null;
        }
        this.g.p(abunVar2);
    }
}
