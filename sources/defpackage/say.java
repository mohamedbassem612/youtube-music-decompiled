package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {shx.class, sjy.class, sid.class, sic.class})
public class say implements sba, rsu {
    protected final smr a;
    private final acfw b;
    private final slm c;
    private final tbt d;
    private final Executor e;
    private final vyo f;
    private final wjf g;
    private final awmd h;
    private final Context i;
    private final abvn j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private final rsk n;
    private final sbr o;
    private final sbj p;
    private final acm q;

    public say(rsk rskVar, vyo vyoVar, acm acmVar, sbr sbrVar, smr smrVar, tbt tbtVar, Executor executor, sbj sbjVar, awmd awmdVar, Context context, abvn abvnVar) {
        this.n = rskVar;
        this.f = vyoVar;
        this.q = acmVar;
        this.o = sbrVar;
        this.a = smrVar;
        this.b = (acfw) smrVar.d(sjy.class);
        slm slmVar = (slm) smrVar.d(shx.class);
        this.c = slmVar;
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        this.g = wjfVar;
        this.k = sdi.c(vyoVar, slmVar, wjfVar);
        this.d = tbtVar;
        this.e = executor;
        this.p = sbjVar;
        this.l = false;
        this.m = false;
        this.h = awmdVar;
        this.i = context;
        this.j = abvnVar;
    }

    private final boolean d(shh shhVar) {
        Long lValueOf;
        aciw aciwVarG;
        aopn aopnVar;
        vyo vyoVar = this.f;
        if (taq.ar(vyoVar)) {
            smr smrVar = this.a;
            if (smrVar.e(sjf.class) && (aopnVar = (aopn) smrVar.d(sjf.class)) != null && (aopnVar.b & 2) != 0) {
                apji apjiVar = aopnVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                arcg arcgVar = (arcg) aavv.s(apjiVar, arch.a);
                if (arcgVar != null && arcgVar.w) {
                    return false;
                }
            }
        }
        if (this.k) {
            return false;
        }
        wjf wjfVar = this.g;
        slm slmVar = this.c;
        boolean zV = wjfVar.V();
        boolean zP = wjfVar.P();
        boolean zEquals = slmVar.equals(slm.PRE_ROLL);
        boolean zEquals2 = slmVar.equals(slm.MID_ROLL);
        slm slmVar2 = slm.POST_ROLL;
        if (taq.at(vyoVar, zV, zP, zEquals, zEquals2, slmVar.equals(slmVar2), false) && (!shhVar.e(siy.class) || !((Boolean) shhVar.d(siy.class)).booleanValue() || (slmVar.equals(slmVar2) && taq.aQ(vyoVar)))) {
            smr smrVar2 = this.a;
            int i = 0;
            while (true) {
                agke agkeVar = smrVar2.d;
                if (i >= ((agpi) agkeVar).d) {
                    if (slmVar != slmVar2 || !taq.aQ(vyoVar)) {
                        lValueOf = null;
                        break;
                    }
                    lValueOf = Long.valueOf(this.b.b());
                    break;
                }
                snk snkVar = (snk) agkeVar.get(i);
                i++;
                if (snkVar instanceof slk) {
                    lValueOf = Long.valueOf(((slk) snkVar).b.a);
                    break;
                }
            }
            if (lValueOf != null) {
                try {
                    acfw acfwVar = this.b;
                    String str = (String) smrVar2.d(sic.class);
                    long jLongValue = lValueOf.longValue();
                    acjb acjbVarD = acfwVar.d();
                    if (acjbVarD == null) {
                        throw new rso("Null playback timeline when checking if Ad is queued", 74);
                    }
                    acjd acjdVarC = acjbVarD.c(str);
                    if (acjdVarC == null) {
                        throw new rso("No Content Segment found for CPN ".concat(String.valueOf(str)), 77);
                    }
                    if ((acjdVarC instanceof aciw) && (aciwVarG = ((aciw) acjdVarC).g(jLongValue)) != null && aciwVarG.j == 1) {
                        if ((this.p.d.contains(this.a.a) || (this.c.equals(slm.MID_ROLL) && taq.aP(this.f))) && (!this.c.equals(slm.POST_ROLL) || taq.aQ(this.f))) {
                            return false;
                        }
                    }
                } catch (rso e) {
                    rmp.n(this.a, e.toString());
                }
            }
        }
        return true;
    }

    @Override // defpackage.rsu
    public final void Q() {
        if (this.c.equals(slm.PRE_ROLL)) {
            t();
        } else {
            this.e.execute(afwl.i(new rxn(this, 7)));
        }
    }

    @Override // defpackage.rsu
    public final void R() {
        this.l = false;
        ArrayList arrayList = new ArrayList();
        sbr sbrVar = this.o;
        for (sni sniVar : sbrVar.g.aa()) {
            smr smrVar = this.a;
            if (TextUtils.equals(smrVar.a, sniVar.c.a)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) sbrVar.a.io()).q(arrayList);
    }

    @Override // defpackage.sba
    public void a(shh shhVar) {
        aloj alojVar;
        if (afxw.e(this.f).bP && this.c == slm.POST_ROLL) {
            Context context = this.i;
            int iK = twm.k(context);
            if (iK == 1 || iK == 2) {
                alojVar = aloj.SMALL_FORM_FACTOR;
            } else {
                alojVar = (iK == 3 || iK == 4) ? aloj.LARGE_FORM_FACTOR : aloj.UNKNOWN_FORM_FACTOR;
            }
            if (alojVar != aloj.LARGE_FORM_FACTOR) {
                ((aazw) this.h.io()).a();
                if (this.j.Y().e() == abnr.FULLSCREEN && yno.H(context)) {
                    return;
                }
            }
        }
        this.l = true;
        if (d(shhVar)) {
            try {
                this.q.e(this.b, this);
            } catch (rso e) {
                this.n.v(this.a, new sau(e.toString(), e.a), 7);
                return;
            }
        } else {
            this.l = false;
            this.n.j(this.a);
        }
        if (!this.c.equals(slm.PRE_ROLL)) {
            this.d.c(new ses());
        }
        if (d(shhVar)) {
            this.d.c(new seu());
        }
    }

    @Override // defpackage.sba
    public void b() {
        this.d.c(new ser());
        if (this.l) {
            this.m = true;
            this.n.l(this.a);
            return;
        }
        this.m = false;
        this.n.l(this.a);
        if (this.k) {
            return;
        }
        this.q.d();
    }

    public final void t() {
        this.l = false;
        if (this.m) {
            this.q.d();
        } else {
            this.d.c(new set());
            this.n.j(this.a);
        }
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }
}
