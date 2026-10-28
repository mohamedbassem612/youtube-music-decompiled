package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jny {
    public final aunn a;
    public final avlh b;
    public final avlh c;
    public final avlh d;
    public final awku e;
    public final iwm f;
    public final avmb g;
    public final avlh h;
    public final aunn i;
    public boolean m;
    public anzw n;
    public aqmf o;
    public final vxz p;
    private final hcb r;
    private final jnj s;
    public final jnd q = new jnd(this);
    public final avmm j = new avmm();
    public iwl l = iwl.b;
    public final iwl k = iwl.d;

    public jny(aunn aunnVar, avlh avlhVar, avlh avlhVar2, awku awkuVar, avlh avlhVar3, avlh avlhVar4, iwm iwmVar, hcb hcbVar, jnj jnjVar, avmb avmbVar, vxz vxzVar, aunn aunnVar2) {
        this.a = aunnVar;
        this.b = avlhVar;
        this.c = avlhVar2;
        this.e = awkuVar;
        this.d = avlhVar3;
        this.h = avlhVar4;
        this.f = iwmVar;
        this.r = hcbVar;
        this.s = jnjVar;
        this.g = avmbVar;
        this.p = vxzVar;
        this.i = aunnVar2;
    }

    public final void a(iwl iwlVar) {
        anme anmeVarE = anmg.e(wfs.g(395, "YTM_PLAYER_COLOR_SAMPLE_PALETTE_ENTITY_KEY"));
        anmeVarE.am(a.bw(iwlVar.f));
        anmeVarE.an(a.bw(iwlVar.e));
        hcb hcbVar = this.r;
        hcbVar.c();
        hcbVar.e(anmeVarE.ao());
    }

    public final void b(int i) {
        String strAM = kro.aM();
        strAM.getClass();
        ahno.P(!strAM.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ambt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ambt ambtVar = (ambt) aihfVarCreateBuilder.instance;
        ambtVar.b |= 1;
        ambtVar.c = strAM;
        ambq ambqVar = new ambq(aihfVarCreateBuilder);
        aihf aihfVar = ambqVar.a;
        Integer.valueOf(i).getClass();
        aihfVar.copyOnWrite();
        ambt ambtVar2 = (ambt) aihfVar.instance;
        ambtVar2.b |= 2;
        ambtVar2.d = i;
        hcb hcbVar = this.r;
        hcbVar.c();
        hcbVar.e(ambqVar.am());
    }

    public final void c() {
        anzw anzwVar;
        if (!this.m && (anzwVar = this.n) != null && igs.a(anzwVar)) {
            this.e.kk(this.l);
            a(this.l);
            if (!this.s.t() || this.p.l(105, 45795183L, false)) {
                return;
            }
            b(this.l.f.b);
            return;
        }
        awku awkuVar = this.e;
        iwl iwlVar = this.k;
        awkuVar.kk(iwlVar);
        a(iwlVar);
        if (!this.s.t() || this.p.l(105, 45795183L, false)) {
            return;
        }
        b(iwlVar.f.b);
    }

    public final void d(iwl iwlVar) {
        taq.d();
        if (iwlVar.equals(this.l)) {
            return;
        }
        this.l = iwlVar;
        c();
    }

    public final void e(aqmh aqmhVar) {
        iwl iwlVar;
        aqmf aqmfVar = null;
        if (aqmhVar != null && (aqmhVar.b & SemanticState.LiveRegion) != 0 && (aqmfVar = aqmhVar.g) == null) {
            aqmfVar = aqmf.a;
        }
        if (Objects.equals(aqmfVar, this.o)) {
            return;
        }
        this.o = aqmfVar;
        if (aqmfVar == null) {
            iwlVar = new iwl(iwm.a, iwm.b);
        } else {
            ahwp ahwpVarA = ahwo.a(new ahws(((double) aqmfVar.b) / 255.0d, ((double) aqmfVar.c) / 255.0d, ((double) aqmfVar.d) / 255.0d));
            iwlVar = new iwl(atqo.x(ahwpVarA), atqo.w(ahwpVarA));
        }
        d(iwlVar);
    }
}
