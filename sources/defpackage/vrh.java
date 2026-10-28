package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrh implements mfw, vri {
    public final apxv a;
    public final nrv b;
    public final aunn c;
    private final mfy d;
    private final acxn e;
    private final xgm f;
    private final xgn g;
    private final aeba h;
    private mfx i = null;
    private boolean j = false;
    private final vxz k;

    public vrh(apxv apxvVar, nrv nrvVar, mfy mfyVar, acxn acxnVar, aunn aunnVar, xgm xgmVar, xgn xgnVar, aeba aebaVar, vxz vxzVar) {
        this.a = apxvVar;
        this.b = nrvVar;
        this.d = mfyVar;
        this.e = acxnVar;
        this.c = aunnVar;
        this.f = xgmVar;
        this.g = xgnVar;
        this.h = aebaVar;
        this.k = vxzVar;
    }

    public static void d(xgm xgmVar, xgn xgnVar, apxv apxvVar, boolean z) {
        ajwo ajwoVarF;
        if ((apxvVar.c & 8) != 0) {
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aigj aigjVar = apxvVar.g;
            aihhVar.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVar.instance;
            aigjVar.getClass();
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVar;
            ajwoVarF = (ajwo) aihhVar.build();
            if (apxvVar.h) {
                ajwoVarF = xgmVar.hB().f(ajwoVarF);
            }
        } else {
            ajwoVarF = null;
        }
        xgnVar.b(xhb.a(16906), ajwoVarF, null);
        akrl akrlVar = apxvVar.e;
        if (akrlVar == null) {
            akrlVar = akrl.a;
        }
        if ((akrlVar.b & 4) != 0) {
            akrl akrlVar2 = apxvVar.e;
            if (akrlVar2 == null) {
                akrlVar2 = akrl.a;
            }
            aigj aigjVar2 = akrlVar2.d;
            xgnVar.d(new xgj(aigjVar2, (amud) null));
            if (z) {
                xgnVar.w(new xgj(aigjVar2, (amud) null), null);
            }
        }
    }

    private final boolean g() {
        return this.k.m(0, 45545796L);
    }

    @Override // defpackage.mfw
    public final void a() {
        this.j = true;
    }

    @Override // defpackage.vri
    public final void b(aoln aolnVar) {
        c(this.e.a(aolnVar.b == 153515154 ? (akrn) aolnVar.c : akrn.a).c);
    }

    public final void c(byte[] bArr) {
        int iAU;
        if (g()) {
            apxv apxvVar = this.a;
            if (apxvVar.o.size() != 0 && !this.h.c(apxvVar.o)) {
                return;
            }
        }
        apxv apxvVar2 = this.a;
        mfv mfvVarA = mfx.a();
        if (apxvVar2.k) {
            mfvVarA.o = 2;
        } else {
            mfvVarA.o = 3;
        }
        nrt nrtVarE = this.b.e();
        agkh agkhVar = nrtVarE.a;
        Boolean bool = Boolean.TRUE;
        agkhVar.e("221293762", bool);
        mfvVarA.g = nrtVarE.a();
        if (apxvVar2.i) {
            mfvVarA.b(1);
        }
        int i = apxvVar2.c;
        if ((i & SemanticState.Multiline) != 0 && (iAU = a.aU(apxvVar2.n)) != 0 && iAU == 2) {
            mfvVarA.m = bool;
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            mfvVarA.h = new vrg(this);
        }
        if ((apxvVar2.c & SemanticState.Modal) != 0) {
            mfvVarA.k = Boolean.valueOf(!apxvVar2.m);
        }
        if ((apxvVar2.c & 64) != 0) {
            mfvVarA.l = Boolean.valueOf(apxvVar2.j);
        }
        mfvVarA.i = this;
        xgn xgnVar = this.g;
        mfvVarA.j = xgnVar;
        mfx mfxVarA = mfvVarA.a();
        this.i = mfxVarA;
        d(this.f, xgnVar, apxvVar2, false);
        this.d.d(bArr, mfxVarA);
        if (g()) {
            this.h.a(apxvVar2.o);
        }
    }

    @Override // defpackage.vri
    public final void f(aoln aolnVar, byte[] bArr) {
        byte[] bArr2 = this.e.a(aolnVar.b == 153515154 ? (akrn) aolnVar.c : akrn.a).c;
        if (aolnVar.b != 153515154 || this.j || this.i == null) {
            return;
        }
        this.g.d(new xgj(bArr));
        mfy mfyVar = this.d;
        mfx mfxVar = this.i;
        mfxVar.getClass();
        mfyVar.b(bArr2, mfxVar);
    }

    @Override // defpackage.vri
    public final void e() {
    }
}
