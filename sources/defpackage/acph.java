package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acph implements actu {
    public final acqz d;
    public final acvf e;
    public final avmb f;
    public final aunn g;
    public final boolean h;
    public final acpl l;
    public final hno m;
    private final abvn n;
    private final actt o;
    private final actv p;
    private final ahey q;
    public final avmm a = new avmm();
    public final avmm b = new avmm();
    public final avmm c = new avmm();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public Optional k = Optional.empty();

    public acph(tqj tqjVar, acpl acplVar, abvn abvnVar, acqz acqzVar, actt acttVar, actv actvVar, acvf acvfVar, hno hnoVar, ahey aheyVar, avmb avmbVar, aunn aunnVar) {
        int i = tqr.a;
        this.h = tqjVar.k(1073830488);
        this.l = acplVar;
        this.n = abvnVar;
        this.d = acqzVar;
        this.e = acvfVar;
        this.o = acttVar;
        this.p = actvVar;
        this.m = hnoVar;
        this.q = aheyVar;
        this.f = avmbVar;
        this.g = aunnVar;
    }

    public final void a(Optional optional) {
        acpl acplVar = this.l;
        acvq acvqVarA = this.e.A();
        afuu afuuVarC = afwt.c(88, "captureCurrentFrameSnapshot");
        try {
            if (acplVar.f == null || acvqVarA == null || acvqVarA.b() == null) {
                optional.isPresent();
            } else {
                zki zkiVarB = acvqVarA.b();
                int iE = zkiVarB.e();
                int iD = zkiVarB.d();
                if (iE == 0 || iD == 0) {
                    acplVar.b = null;
                    optional.isPresent();
                } else {
                    int i = acplVar.c;
                    if (iE > i || iD > i) {
                        double d = ((double) iD) / ((double) iE);
                        double d2 = i;
                        if (iE > iD) {
                            iD = (int) ((d2 * d) + 0.5d);
                            iE = i;
                        } else {
                            iE = (int) ((d2 / d) + 0.5d);
                            iD = i;
                        }
                    }
                    if (iE < 8 || iD < 8) {
                        acplVar.b = null;
                        optional.isPresent();
                    } else {
                        acplVar.f.setImageDrawable(null);
                        acplVar.b = acvqVarA;
                        if (acplVar.m.aH()) {
                            Bitmap bitmapCreateBitmap = (Bitmap) acplVar.a.pollFirst();
                            int i2 = iE * iD;
                            if (bitmapCreateBitmap == null || !bitmapCreateBitmap.isMutable() || bitmapCreateBitmap.getAllocationByteCount() < (i2 << 1)) {
                                bitmapCreateBitmap = Bitmap.createBitmap(iE, iD, Bitmap.Config.RGB_565);
                            } else {
                                bitmapCreateBitmap.reconfigure(iE, iD, Bitmap.Config.RGB_565);
                            }
                            acplVar.e(bitmapCreateBitmap, zkiVarB, optional);
                        } else {
                            acplVar.e(Bitmap.createBitmap(iE, iD, Bitmap.Config.RGB_565), zkiVarB, optional);
                        }
                    }
                }
            }
            afuuVarC.close();
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        f();
        g();
    }

    public final void c() {
        avmm avmmVar = this.b;
        avmmVar.b();
        acpf acpfVar = new acpf(this, 0);
        int i = 19;
        abxq abxqVar = new abxq(i);
        actv actvVar = this.p;
        abvn abvnVar = this.n;
        int i2 = 18;
        avmmVar.e(actvVar.a.ag(acpfVar, abxqVar), abvnVar.C().p().W(new ablh(i2)).al(new acnt(this, 17), new abxq(i)), ((avlh) abvnVar.r().m).al(new acnt(this, i2), new abxq(i)));
        actvVar.z(this);
    }

    public final void d(apfp apfpVar) {
        hno hnoVar = this.m;
        if (hnoVar.aC()) {
            this.l.g = this.e.r();
        }
        if (!hnoVar.aL()) {
            boolean zC = this.o.c(apfpVar);
            acpl acplVar = this.l;
            if (zC) {
                acplVar.g(apfpVar);
                return;
            } else {
                acplVar.g(apfpVar);
                acplVar.h();
                return;
            }
        }
        this.l.g(apfpVar);
        Optional optionalJ = this.d.j();
        boolean zBooleanValue = ((Boolean) (true != optionalJ.isPresent() ? optionalJ : Optional.ofNullable(Boolean.valueOf(((acra) optionalJ.get()).n))).orElse(Boolean.FALSE)).booleanValue();
        if (this.o.c(apfpVar)) {
            if (!zBooleanValue) {
                return;
            }
        } else if (!zBooleanValue) {
            f();
            return;
        }
        ((acra) optionalJ.get()).n = false;
    }

    public final void e() {
        tuk.l(this.l.f, true);
    }

    public final void f() {
        if (this.i.isEmpty() || (((apfp) this.i.get()).c & SemanticState.ReadOnly) == 0) {
            return;
        }
        this.l.h();
    }

    public final void g() {
        this.a.b();
        h();
    }

    public final void h() {
        this.b.b();
        this.p.F(this);
    }

    public final boolean i(String str) {
        return this.i.isEmpty() || TextUtils.isEmpty(str) || ((apfp) this.i.get()).o.isEmpty() || ((apfp) this.i.get()).o.equals(str);
    }

    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        acsuVar.getClass();
        Objects.checkIndex(0, 3);
        if (!(acsuVar instanceof acso)) {
            if (acsuVar instanceof acsm) {
                wjf wjfVar = ((acsm) acsuVar).b;
                if ((this.d.N() || !this.m.bc()) && !this.m.ad()) {
                    return;
                }
                if (i(wjfVar != null ? wjfVar.G() : "")) {
                    this.l.f();
                    return;
                }
                return;
            }
            return;
        }
        acso acsoVar = (acso) acsuVar;
        ajwo ajwoVar = acsoVar.a;
        alqc alqcVar = acsoVar.b;
        if (alqcVar == null || (alqcVar.b & SemanticState.ReadOnly) == 0 || this.i.isEmpty()) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        String str = ((apfp) this.i.get()).o;
        if (!this.m.aX() || (apfpVar.c & 8) == 0 || apfpVar.o.equals(str)) {
            ajwo ajwoVar2 = alqcVar.k;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVar2 = (apfp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            this.i = Optional.of(apfpVar2);
            if ((apfpVar2.c & SemanticState.ReadOnly) != 0) {
                this.q.execute(afwl.i(new acnp(this, apfpVar2, 4)));
            }
        }
    }
}
