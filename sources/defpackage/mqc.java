package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqc implements nvr {
    private static final aglc c;
    public final nry a;
    public final boolean b;
    private final nuc d;
    private final omj e;

    static {
        agla aglaVar = new agla();
        aglaVar.c(nfe.b, fmg.a, fmg.b);
        aglaVar.c(nfe.c, fmg.c, fmg.d);
        aglaVar.c(nfe.e, fmg.e);
        aglaVar.c(nfe.d, fmg.f);
        aglaVar.c(nfe.f, fmg.g);
        aglaVar.c(nfe.g, fmg.h, fmg.i);
        c = aglaVar.a();
    }

    public mqc(nry nryVar, omj omjVar, nuc nucVar, agev agevVar) {
        this.a = nryVar;
        this.e = omjVar;
        this.d = nucVar;
        this.b = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
    }

    private static float b(DisplayMetrics displayMetrics, ney neyVar, fmh fmhVar, float f) {
        if (neyVar != null) {
            if (fmg.a.equals(fmhVar)) {
                if (neyVar.k() && omj.v(neyVar.h())) {
                    f = neyVar.h().ap();
                }
            } else if (fmg.b.equals(fmhVar)) {
                if (neyVar.k() && omj.v(neyVar.h())) {
                    f = neyVar.h().aq();
                }
            } else if (fmg.c.equals(fmhVar)) {
                if (neyVar.l() && omj.w(neyVar.i())) {
                    f = neyVar.i().cf();
                }
            } else if (fmg.d.equals(fmhVar)) {
                if (neyVar.l() && omj.w(neyVar.i())) {
                    f = neyVar.i().g();
                }
            } else if (fmg.h.equals(fmhVar)) {
                if (neyVar.k() && omj.v(neyVar.h())) {
                    f = neyVar.h().ap();
                }
            } else if (fmg.i.equals(fmhVar)) {
                if (neyVar.k() && omj.v(neyVar.h())) {
                    f = neyVar.h().aq();
                }
            } else if (neyVar.j()) {
                f = neyVar.g();
            }
        }
        return (fmg.a.equals(fmhVar) || fmg.b.equals(fmhVar) || fmg.c.equals(fmhVar) || fmg.d.equals(fmhVar)) ? TypedValue.applyDimension(1, f, displayMetrics) : f;
    }

    @Override // defpackage.nvr
    public final mep a() {
        return nfb.ak;
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6 A[SYNTHETIC] */
    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, final nsl nslVar, String str, Object obj, final ntq ntqVar, nru nruVar) {
        int i;
        float fH;
        int i2;
        nfb nfbVar;
        fll fllVar;
        nyc nycVar;
        nyc nycVar2;
        nfb nfbVar2 = (nfb) obj;
        fgv fgvVarA = ntqVar.a();
        if (nfbVar2.g() != 0) {
            int i3 = 0;
            if (str == null) {
                this.d.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "Key is required with valid transition, but the key is null", new Object[0]);
                return;
            }
            fgy fgyVar = fgvVarA.b;
            fgu fguVarK = fgyVar.k();
            String str2 = fgyVar.k;
            fgt fgtVarD = fguVarK.D();
            fgtVarD.a |= SemanticState.LiveRegion;
            String strConcat = "com.youtube.transition_key.".concat(str);
            fgtVarD.g = strConcat;
            fgtVarD.f = str2;
            if (fgyVar.k().D().h == null) {
                fgvVarA.G(flp.i);
            }
            fgvVarA.G(fln.a);
            flm flmVar = flp.h;
            flj fljVar = new flj(strConcat);
            int i4 = 0;
            while (i4 < nfbVar2.g()) {
                nfc nfcVarI = nfbVar2.i(i4);
                DisplayMetrics displayMetrics = fhdVar.c().getDisplayMetrics();
                agkz agkzVarC = c.c(nfcVarI.l());
                int i5 = 1;
                if (agkzVarC.isEmpty()) {
                    nuc nucVar = this.d;
                    aslh aslhVar = aslh.LOG_LEVEL_WARN;
                    Object[] objArr = new Object[1];
                    objArr[i3] = nfcVarI.l().name();
                    nucVar.c(aslhVar, nslVar, "Unknown TransitionValue specified: %s. Make sure you are using the transition values listed in go/elements-api-transition-value-type", objArr);
                } else {
                    agqr it = agkzVarC.iterator();
                    while (it.hasNext()) {
                        fmh fmhVar = (fmh) it.next();
                        fljVar.b();
                        fljVar.f = new aero(fmhVar);
                        Cnew cnewI = nfcVarI.i();
                        int iG = 1000;
                        if (cnewI != null && cnewI.g() != 0.0f) {
                            iG = (int) (cnewI.g() * 1000.0f);
                        }
                        int iJ = cnewI != null ? cnewI.j() : 3;
                        float fH2 = (cnewI == null || cnewI.i() <= 0) ? 0.0f : cnewI.h(i3);
                        float fH3 = (cnewI == null || cnewI.i() <= i5) ? 0.0f : cnewI.h(i5);
                        float fH4 = (cnewI == null || cnewI.i() <= 2) ? 0.0f : cnewI.h(2);
                        if (cnewI != null) {
                            i = i4;
                            fH = cnewI.i() > 3 ? cnewI.h(3) : 0.0f;
                            i2 = iJ - 1;
                            if (i2 != 1) {
                                nfbVar = nfbVar2;
                                fllVar = new fll(iG, new LinearInterpolator());
                            } else if (i2 != 3) {
                                nfbVar = nfbVar2;
                                if (i2 != 4) {
                                    fllVar = new fll(iG, new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f));
                                } else if (i2 != 5) {
                                    fllVar = new fll(iG, new PathInterpolator(fH2, fH3));
                                } else if (i2 != 6) {
                                    fllVar = new fll(iG, new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                                } else {
                                    fllVar = new fll(iG, new PathInterpolator(fH2, fH3, fH4, fH));
                                }
                            } else {
                                nfbVar = nfbVar2;
                                fllVar = new fll(iG, new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f));
                            }
                            fljVar.b = fllVar;
                            if (nfcVarI.n()) {
                                nycVar2 = new nyc(b(displayMetrics, nfcVarI.k(), fmhVar, nfcVarI.h()));
                                if (fljVar.f != null) {
                                    throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
                                }
                                fljVar.d = nycVar2;
                            }
                            if (nfcVarI.m()) {
                                nycVar = new nyc(b(displayMetrics, nfcVarI.j(), fmhVar, nfcVarI.g()));
                                if (fljVar.f != null) {
                                    throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
                                }
                                fljVar.e = nycVar;
                            }
                            nfbVar2 = nfbVar;
                            i4 = i;
                            i3 = 0;
                            i5 = 1;
                        } else {
                            i = i4;
                        }
                        i2 = iJ - 1;
                        if (i2 != 1) {
                            nfbVar = nfbVar2;
                            fllVar = new fll(iG, new LinearInterpolator());
                        } else if (i2 != 3) {
                            nfbVar = nfbVar2;
                            if (i2 != 4) {
                                fllVar = new fll(iG, new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f));
                            } else if (i2 != 5) {
                                fllVar = new fll(iG, new PathInterpolator(fH2, fH3));
                            } else if (i2 != 6) {
                                fllVar = new fll(iG, new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                            } else {
                                fllVar = new fll(iG, new PathInterpolator(fH2, fH3, fH4, fH));
                            }
                        } else {
                            nfbVar = nfbVar2;
                            fllVar = new fll(iG, new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f));
                        }
                        fljVar.b = fllVar;
                        if (nfcVarI.n()) {
                            nycVar2 = new nyc(b(displayMetrics, nfcVarI.k(), fmhVar, nfcVarI.h()));
                            if (fljVar.f != null) {
                                throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
                            }
                            fljVar.d = nycVar2;
                        }
                        if (nfcVarI.m()) {
                            nycVar = new nyc(b(displayMetrics, nfcVarI.j(), fmhVar, nfcVarI.g()));
                            if (fljVar.f != null) {
                                throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
                            }
                            fljVar.e = nycVar;
                        }
                        nfbVar2 = nfbVar;
                        i4 = i;
                        i3 = 0;
                        i5 = 1;
                    }
                }
                i4++;
                nfbVar2 = nfbVar2;
                i3 = 0;
            }
            nfb nfbVar3 = nfbVar2;
            if (nfbVar3.j()) {
                final omj omjVarB = this.e.B(nfbVar3.h(), nslVar);
                fljVar.c = new fve() { // from class: mqb
                    @Override // defpackage.fve
                    public final void d(Object[] objArr2) {
                        avnq avnqVar;
                        CommandOuterClass$Command commandOuterClass$CommandX = omjVarB.x();
                        nrt nrtVarD = nrv.d();
                        nsl nslVar2 = nslVar;
                        nrtVarD.b(nslVar2);
                        nrtVarD.f = ntqVar;
                        nrv nrvVarA = nrtVarD.a();
                        mqc mqcVar = this.a;
                        avmn avmnVarD = mqcVar.a.a(commandOuterClass$CommandX, nrvVarA).D();
                        if (!mqcVar.b || (avnqVar = nslVar2.i) == null) {
                            return;
                        }
                        avnqVar.c(avmnVarD);
                    }
                };
            }
            fljVar.b();
            fgt fgtVarD2 = fgyVar.k().D();
            fgtVarD2.a |= Integer.MIN_VALUE;
            fgtVarD2.i = fljVar;
        }
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
    }
}
