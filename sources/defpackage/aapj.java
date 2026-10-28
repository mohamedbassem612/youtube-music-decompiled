package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aapj {
    public final vyo a;
    public final awmd b;
    public final awmd c;
    public final abmt d;
    public final wco e;
    public final mbc f;
    public String g;
    public String h;
    public boolean i;
    private final Executor j;
    private final vxz k;

    public aapj(vyo vyoVar, awmd awmdVar, awmd awmdVar2, Executor executor, vxz vxzVar, abmt abmtVar, wco wcoVar, mbc mbcVar) {
        this.a = vyoVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.j = executor;
        this.k = vxzVar;
        this.d = abmtVar;
        this.e = wcoVar;
        this.f = mbcVar;
    }

    public final void a(aazj aazjVar) {
        wjf wjfVar;
        String str = aazjVar.g;
        if (str == null || (wjfVar = aazjVar.b) == null || str.equals(this.g)) {
            return;
        }
        this.g = str;
        this.h = wjfVar.G();
        this.i = false;
    }

    public final void b(abwg abwgVar) {
        new avmm(((avlh) abwgVar.a).ak(new aawl(new xwu(this, 20), "OVSC", 1)), ((avlh) abwgVar.p).ak(new aapk(this, 1)));
    }

    @tcc
    protected synchronized void handleVideoStageEvent(aazj aazjVar) {
        if (this.d.bx(16L)) {
            return;
        }
        afvn afvnVarB = aawb.b(aazjVar, "OVSC");
        try {
            a(aazjVar);
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @tcc
    protected synchronized void onFormatStreamChangedEvent(final yvu yvuVar) {
        if (this.k.l(51, 45656339L, false)) {
            wgs wgsVar = yvuVar.f;
            wgs wgsVar2 = yvuVar.c;
            if ((wgsVar2 == null || !wgsVar2.W()) && (wgsVar == null || !wgsVar.W())) {
                return;
            }
        }
        this.j.execute(afwl.i(new Runnable() { // from class: aapi
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                aamd aamdVar;
                aamm aammVar;
                aaml aamlVar;
                aaml aamlVar2;
                aamm aammVar2;
                aaml aamlVar3;
                aaml aamlVar4;
                aknu aknuVar;
                agke agkeVarE;
                aapj aapjVar = this.a;
                vyo vyoVar = aapjVar.a;
                String str = aapjVar.h;
                String str2 = aapjVar.g;
                aoev aoevVar = vyoVar.b().i;
                if (aoevVar == null) {
                    aoevVar = aoev.a;
                }
                if (!aoevVar.f || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || aapjVar.i) {
                    return;
                }
                awmd awmdVar = aapjVar.b;
                if (((aanb) awmdVar.io()).g()) {
                    aaqn aaqnVarB = ((aanb) awmdVar.io()).b();
                    aamt aamtVarA = aaqnVarB.l().a(str);
                    if (aamtVarA != null) {
                        if (aapjVar.d.j.l(249, 45860960L, false)) {
                            wcn wcnVarB = aapjVar.e.b(aaqnVarB.b());
                            mbc mbcVar = aapjVar.f;
                            int i = aamd.b;
                            mbcVar.getClass();
                            str.getClass();
                            aoop aoopVar = (aoop) wcnVarB.g(wfs.g(119, str)).g(aoop.class).E();
                            if (aoopVar == null) {
                                aamdVar = null;
                                z = true;
                            } else {
                                aohk aohkVarE = aoopVar.e();
                                aooq aooqVar = aoopVar.d;
                                if ((aooqVar.b & SemanticState.LiveRegion) != 0) {
                                    String str3 = aooqVar.n;
                                    weh wehVarD = aoopVar.c.d(str3);
                                    z = true;
                                    ahno.P(wehVarD == null || (wehVarD instanceof aknu), a.ch((byte) 41, str3, wehVarD == null ? "null" : wehVarD.getClass().getSimpleName(), "drm_license should be of type DrmLicenseEntityModel, but was a ", " (key="));
                                    aknuVar = (aknu) wehVarD;
                                } else {
                                    z = true;
                                    aknuVar = null;
                                }
                                aqph aqphVarH = aoopVar.h();
                                if (aqphVarH == null || (agkeVarE = aqphVarH.e()) == null) {
                                    agkeVarE = agpi.a;
                                    agkeVarE.getClass();
                                }
                                aamdVar = new aamd(str, mbcVar, aoopVar, aohkVarE, aknuVar, aqphVarH, agkeVarE);
                            }
                        } else {
                            z = true;
                            aamdVar = null;
                        }
                        if (aamdVar != null) {
                            if (aamdVar.a()) {
                                return;
                            }
                            if (!aamdVar.b() && (aamdVar.a() || (aammVar2 = aamdVar.a) == null || (aamlVar3 = aammVar2.b) == null || !aamlVar3.i() || (aamlVar4 = aammVar2.a) == null || aamlVar4.e <= 0 || aamlVar4.i())) {
                                return;
                            }
                        } else if (aamtVarA.f() != aamp.PLAYABLE && (aamtVarA.l() || (aammVar = aamtVarA.p) == null || (aamlVar = aammVar.b) == null || !aamlVar.i() || (aamlVar2 = aammVar.a) == null || aamlVar2.e <= 0 || aamlVar2.i())) {
                            return;
                        }
                        aamm aammVarG = aamdVar != null ? aamdVar.a : aaqnVarB.f().g(str, null);
                        if (aammVarG != null) {
                            yvu yvuVar2 = yvuVar;
                            wgs wgsVar3 = yvuVar2.f;
                            wgs wgsVar4 = yvuVar2.c;
                            wgs wgsVarA = aammVarG.a();
                            wgs wgsVarC = aammVarG.c();
                            if ((wgsVar3 == null || wgsVarA == null || wgsVar3.e() != wgsVarA.e()) && (wgsVar4 == null || wgsVarC == null || wgsVar4.e() != wgsVarC.e())) {
                                return;
                            }
                            aihf aihfVarCreateBuilder = argn.a.createBuilder();
                            int i2 = aamtVarA.c;
                            byte[] bArr = aamtVarA.d;
                            if (i2 != -1 && i2 != 0) {
                                aihfVarCreateBuilder.copyOnWrite();
                                argn argnVar = (argn) aihfVarCreateBuilder.instance;
                                argnVar.b |= 2;
                                argnVar.d = i2;
                            } else if (bArr != null) {
                                aigj aigjVarV = aigj.v(bArr);
                                aihfVarCreateBuilder.copyOnWrite();
                                argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
                                aigjVarV.getClass();
                                argnVar2.b |= 1;
                                argnVar2.c = aigjVarV;
                            } else {
                                aigj aigjVarV2 = aigj.v(vzh.b);
                                aihfVarCreateBuilder.copyOnWrite();
                                argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
                                aigjVarV2.getClass();
                                argnVar3.b |= 1;
                                argnVar3.c = aigjVarV2;
                            }
                            aaml aamlVar5 = aammVarG.b;
                            aaml aamlVar6 = aammVarG.a;
                            ((aalv) aapjVar.c.io()).b(str2, aamtVarA.o.b(), (argn) aihfVarCreateBuilder.build(), wgsVarA == null ? 0 : wgsVarA.e(), wgsVarC == null ? 0 : wgsVarC.e(), !((aamlVar6 != null && aamlVar6.i() && (aamlVar5 == null || aamlVar5.i())) ? z : false));
                            aapjVar.i = z;
                        }
                    }
                }
            }
        }));
    }
}
