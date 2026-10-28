package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abyz implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abyz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0219  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v19, types: [aceu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object, rsu] */
    /* JADX WARN: Type inference failed for: r15v35, types: [java.lang.Object, rsu] */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.lang.Object, rsu] */
    /* JADX WARN: Type inference failed for: r15v40, types: [acic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v44, types: [acic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v45, types: [acic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        ajwo ajwoVar;
        String str = null;
        apfpVar = null;
        apfp apfpVar = null;
        str = null;
        boolean zB = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((abzc) this.a).v();
                return;
            case 1:
                Object obj = this.a;
                abyx abyxVar = (abyx) obj;
                agfr agfrVar = abyxVar.a;
                agfrVar.io();
                if (agfrVar.io().entrySet() != null) {
                    for (Map.Entry entry : agfrVar.io().entrySet()) {
                        if (entry != null && entry.getValue() != null && "ms".equalsIgnoreCase((String) entry.getKey())) {
                            str = (String) entry.getValue();
                        }
                    }
                }
                Object objIo = abyxVar.e.io();
                try {
                    tqj tqjVar = ((abyx) obj).f;
                    int i = tqr.a;
                    if ((!(tqjVar.k(1073808282) && tqjVar.k(1073808283)) && str == null) || ((Boolean) ((abyx) obj).d.io()).booleanValue()) {
                        zB = true;
                    } else {
                        aihf aihfVarCreateBuilder = anir.a.createBuilder();
                        String str2 = abyxVar.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        anir anirVar = (anir) aihfVarCreateBuilder.instance;
                        anirVar.b |= 1;
                        anirVar.c = str2;
                        if (str != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            anir anirVar2 = (anir) aihfVarCreateBuilder.instance;
                            anirVar2.b |= 2;
                            anirVar2.d = str;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        anir anirVar3 = (anir) aihfVarCreateBuilder.instance;
                        anirVar3.b |= 8;
                        anirVar3.e = (String) objIo;
                        xeu xeuVar = abyxVar.c;
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MOBILE_PLAYBACK_EVENT);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                            zB = true;
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            anir anirVar4 = (anir) aihfVarCreateBuilder.build();
                            anirVar4.getClass();
                            alouVar.d = anirVar4;
                            alouVar.c = 151;
                            zB = xeuVar.b((alou) alosVar.build());
                        }
                    }
                } catch (Exception unused) {
                }
                abyxVar.g = zB;
                return;
            case 2:
                ((abzh) this.a).d();
                return;
            case 3:
                this.a.e(false);
                return;
            case 4:
                ((acfg) this.a).aF();
                return;
            case 5:
                acft acftVar = (acft) this.a;
                if (acftVar.u) {
                    return;
                }
                mbc mbcVar = acftVar.b;
                Object[] objArr = mbcVar.b() >= acftVar.r && acftVar.v == 2;
                avgj avgjVar = acftVar.x;
                if (avgjVar != null) {
                    ((acfs) avgjVar.a).P(objArr != false ? 4 : 1);
                }
                if (acftVar.u) {
                    return;
                }
                long jB = acftVar.d.b();
                if (jB > 0) {
                    acftVar.q = Math.min(acftVar.q, jB);
                }
                if (acftVar.e != 1) {
                    wjf wjfVar = (wjf) acftVar.g.a();
                    if (acftVar.n) {
                        if (acftVar.p == null) {
                            acftVar.p = Boolean.valueOf(acftVar.m.bX());
                        }
                        zBooleanValue = acftVar.p.booleanValue();
                    } else {
                        zBooleanValue = acftVar.m.bX();
                    }
                    if (zBooleanValue || (wjfVar != null && wjfVar.T())) {
                        z = acftVar.s;
                    } else {
                        abnl abnlVar = acftVar.f;
                        if (abnlVar != null && (ajwoVar = abnlVar.b) != null) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                            apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                        }
                        if (apfpVar != null) {
                            if ((apfpVar.c & 1) != 0) {
                                int iF = CommonApis.f(apfpVar.l);
                                if (iF != 0 && iF == 4) {
                                    z = true;
                                }
                            } else if ((apfpVar.c & 4194304) != 0) {
                                apdm apdmVar = apfpVar.C;
                                if (apdmVar == null) {
                                    apdmVar = apdm.a;
                                }
                                if ((apdmVar.b & 1) != 0) {
                                    apdm apdmVar2 = apfpVar.C;
                                    if (apdmVar2 == null) {
                                        apdmVar2 = apdm.a;
                                    }
                                    if (apdmVar2.c) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = true;
                }
                if (objArr != false) {
                    long j = true != z ? 1000L : 100L;
                    long jB2 = mbcVar.b();
                    long j2 = acftVar.r;
                    if (jB2 - j2 > j) {
                        acftVar.r = mbcVar.b() + j;
                    } else {
                        acftVar.r = j2 + j;
                    }
                }
                long j3 = (!abmt.bW(acftVar.c) || z) ? 100L : 1000L;
                ahqj ahqjVar = acftVar.w;
                Runnable runnable = acftVar.a;
                long j4 = acftVar.q;
                if (j4 > 0 && j4 <= j3) {
                    j3 = j4;
                }
                ?? r1 = ahqjVar.b;
                if (r1 != 0) {
                    r1.dispose();
                }
                ahqjVar.b = ((avmb) ahqjVar.a).c(runnable, j3, TimeUnit.MILLISECONDS);
                acftVar.q = Long.MAX_VALUE;
                return;
            case 6:
                agke agkeVarG = ((agjz) this.a).g();
                int i2 = ((agpi) agkeVarG).d;
                for (int i3 = 0; i3 < i2; i3++) {
                    acfy acfyVar = (acfy) agkeVarG.get(i3);
                    if (acfyVar.b == acgd.a) {
                        acfyVar.a.h(acfyVar.c, acfyVar.d, acfyVar.e, acfyVar.f);
                    } else {
                        acfx acfxVar = acfyVar.a;
                        boolean z2 = acfyVar.c;
                        boolean z3 = acfyVar.d;
                        acfxVar.j(acfyVar.f);
                    }
                }
                return;
            case 7:
                ((qcb) this.a).a.c();
                return;
            case 8:
                taq.d();
                acig acigVar = (acig) this.a;
                if (acigVar.e == null && acigVar.d) {
                    acigVar.h = (yhi) acigVar.g.poll();
                    yhi yhiVar = acigVar.h;
                    if (yhiVar == null) {
                        if (acigVar.f) {
                            acigVar.f = false;
                            acigVar.a.b();
                            return;
                        }
                        return;
                    }
                    acie acieVar = new acie(acigVar);
                    acigVar.e = acieVar;
                    if (!acigVar.f) {
                        acigVar.f = true;
                        acigVar.a.e();
                    }
                    ((acm) yhiVar.b).a = acieVar;
                    yhiVar.a.Q();
                    return;
                }
                return;
            case 9:
                ((qcb) this.a).a.s();
                return;
            case 10:
                this.a.a();
                return;
            case 11:
                ((acid) this.a).a.e();
                return;
            case 12:
                this.a.b();
                return;
            case 13:
                this.a.d();
                return;
            case 14:
                ((acnk) this.a).c.n().r();
                return;
            case 15:
                ((acnk) this.a).j(Optional.empty());
                return;
            case 16:
                acoi acoiVar = (acoi) this.a;
                if (!acoiVar.ck.D()) {
                    acoiVar.z.f();
                    if (acoiVar.z.i()) {
                        acoiVar.F.ap(false, 19);
                        return;
                    }
                    return;
                }
                if (!acoiVar.z.i()) {
                    acoiVar.z.f();
                    return;
                } else {
                    acfw acfwVarI = acoiVar.F.i();
                    acoiVar.F.ag(acfwVarI != null ? acfwVarI.a() : 0L, appa.SEEK_SOURCE_ANDROID_LOAD_VIDEO_FRAME_IN_PAUSED_STATE_AFTER_BACKGROUND);
                    return;
                }
            case 17:
                ((acoi) this.a).Y();
                return;
            case 18:
                Object obj2 = this.a;
                synchronized (((acoi) obj2).aV) {
                    if (!((acoi) obj2).bH) {
                        ((acoi) obj2).bH = true;
                        ((acoi) obj2).ad();
                    }
                    break;
                }
                return;
            case 19:
                ((acpe) this.a).f(2);
                return;
            default:
                ((acpe) this.a).c();
                return;
        }
    }
}
