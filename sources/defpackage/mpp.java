package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpp implements nvq {
    private final /* synthetic */ int $cid;

    public mpp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.nvq
    public final aigw a() {
        return this.$cid != 0 ? asom.b : asmd.b;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        if (this.$cid == 0) {
            asmd asmdVar = (asmd) obj;
            int i = asmdVar.c;
            if ((i & 1) != 0) {
                ntqVar.y("source-".concat(String.valueOf(asmdVar.d)));
            } else if ((i & 2) != 0) {
                ntqVar.y("target-".concat(String.valueOf(asmdVar.e)));
            }
            if ((asmdVar.c & 4) != 0) {
                asmc asmcVar = asmdVar.f;
                if (asmcVar == null) {
                    asmcVar = asmc.a;
                }
                ntqVar.t(R.id.elements_continuity_animation_config, asmcVar);
                return;
            }
            return;
        }
        asom asomVar = (asom) obj;
        fgv fgvVarA = ntqVar.a();
        if (fgvVarA instanceof mjd) {
            mjd mjdVar = (mjd) fgvVarA;
            float f = asomVar.e;
            mje mjeVar = mjdVar.a;
            ayq ayqVar = mjdVar.c;
            mjeVar.u = ayqVar.z(f);
            if ((asomVar.c & 4) != 0) {
                mjeVar.s = Float.valueOf(ayqVar.z(asomVar.f));
            }
            if ((asomVar.c & 8) != 0) {
                mjeVar.t = Float.valueOf(ayqVar.z(asomVar.g));
            }
            if ((asomVar.c & 1) != 0) {
                mjeVar.v = Integer.valueOf(asomVar.d);
            }
        }
        fgv fgvVarA2 = ntqVar.a();
        if (fgvVarA2 instanceof msk) {
            msk mskVar = (msk) fgvVarA2;
            float f2 = asomVar.e;
            msm msmVar = mskVar.a;
            ayq ayqVar2 = mskVar.c;
            msmVar.x = ayqVar2.z(f2);
            msmVar.v = ayqVar2.z(asomVar.f);
            msmVar.w = ayqVar2.z(asomVar.g);
            if ((asomVar.c & 1) != 0) {
                msmVar.u = Integer.valueOf(asomVar.d);
            }
        } else {
            fgv fgvVarA3 = ntqVar.a();
            if (fgvVarA3 instanceof mso) {
                float fBu = qnl.bu(asomVar.e, fhdVar.c().getDisplayMetrics());
                msp mspVar = ((mso) fgvVarA3).a;
                mspVar.y = fBu;
                mspVar.w = qnl.bu(asomVar.f, fhdVar.c().getDisplayMetrics());
                mspVar.x = qnl.bu(asomVar.g, fhdVar.c().getDisplayMetrics());
                if ((asomVar.c & 1) != 0) {
                    mspVar.v = Integer.valueOf(asomVar.d);
                }
            }
        }
        fgv fgvVarA4 = ntqVar.a();
        if (fgvVarA4 instanceof nqc) {
            nqc nqcVar = (nqc) fgvVarA4;
            float f3 = asomVar.e;
            nqf nqfVar = nqcVar.a;
            ayq ayqVar3 = nqcVar.c;
            nqfVar.G = ayqVar3.z(f3);
            if ((asomVar.c & 4) != 0) {
                nqfVar.E = ayqVar3.z(asomVar.f);
            }
            if ((asomVar.c & 8) != 0) {
                nqfVar.F = ayqVar3.z(asomVar.g);
            }
            if ((asomVar.c & 1) != 0) {
                nqfVar.D = Integer.valueOf(asomVar.d);
            }
        }
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        throw null;
    }
}
