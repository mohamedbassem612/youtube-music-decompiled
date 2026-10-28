package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acoh {
    public Optional a = Optional.empty();
    final /* synthetic */ acoi b;

    public acoh(acoi acoiVar) {
        this.b = acoiVar;
    }

    public final void a(aazn aaznVar) {
        ajwo ajwoVar;
        this.a = Optional.empty();
        acoi acoiVar = this.b;
        Optional optionalOfNullable = Optional.ofNullable(acoiVar.z());
        abyy abyyVar = new abyy(aaznVar, 17);
        if (true == optionalOfNullable.isPresent()) {
            ((acrp) optionalOfNullable.get()).N((aazn) abyyVar.a);
        }
        int i = aaznVar.a;
        if (i == 5) {
            acoiVar.o();
            return;
        }
        if (i != 7) {
            if (i == 8) {
                acoiVar.Q(true);
                return;
            }
            return;
        }
        if (acoiVar.bm.isEmpty()) {
            if (acoiVar.bD.isPresent()) {
                if (((String) ((ijt) acoiVar.bD.get()).a).equals(aaznVar.b)) {
                    acoiVar.bD = Optional.empty();
                    acoiVar.bT.e(new acqy(2, false));
                    return;
                }
            }
            this.a = Optional.of(aaznVar);
            return;
        }
        apdw apdwVarD = acoiVar.D((alqc) acoiVar.bm.get(), acoiVar.bA);
        if (apdwVarD != apdw.REEL_LOOP_BEHAVIOR_SINGLE_PLAY || (ajwoVar = acoiVar.bA) == null) {
            if (apdwVarD == apdw.REEL_LOOP_BEHAVIOR_AUTO_ADVANCE) {
                acoiVar.bT.e(new acqy(2, false));
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((apfpVar.d & 131072) != 0) {
            ajwo ajwoVar2 = apfpVar.T;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            acoiVar.L.a(ajwoVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000c, B:8:0x0012, B:10:0x0023, B:12:0x002c, B:20:0x005c, B:22:0x0060, B:23:0x007d, B:14:0x0032, B:16:0x0042, B:17:0x0045, B:19:0x004d, B:25:0x007f), top: B:50:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000c, B:8:0x0012, B:10:0x0023, B:12:0x002c, B:20:0x005c, B:22:0x0060, B:23:0x007d, B:14:0x0032, B:16:0x0042, B:17:0x0045, B:19:0x004d, B:25:0x007f), top: B:50:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000c, B:8:0x0012, B:10:0x0023, B:12:0x002c, B:20:0x005c, B:22:0x0060, B:23:0x007d, B:14:0x0032, B:16:0x0042, B:17:0x0045, B:19:0x004d, B:25:0x007f), top: B:50:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[Catch: all -> 0x00f3, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000c, B:8:0x0012, B:10:0x0023, B:12:0x002c, B:20:0x005c, B:22:0x0060, B:23:0x007d, B:14:0x0032, B:16:0x0042, B:17:0x0045, B:19:0x004d, B:25:0x007f), top: B:50:0x0007 }] */
    public final void b(String str) {
        long j;
        trd trdVar;
        zhk zhkVar;
        actm actmVar = this.b.y;
        synchronized (actmVar.b) {
            if (actmVar.i || !actmVar.k(str)) {
                j = 0;
            } else {
                tre treVar = actmVar.e;
                trd trdVar2 = treVar.h;
                tqj tqjVar = treVar.c;
                int i = tqr.a;
                if (tqjVar.k(1073831078)) {
                    treVar.d();
                    if (!trdVar2.l() && !trdVar2.k()) {
                        trdVar2.p(62);
                        trdVar = treVar.h;
                        trj.d(SemanticState.Hidden);
                        zhkVar = treVar.i;
                        if (zhkVar != null) {
                            zhkVar.a();
                        }
                        if (treVar.g(204, 1)) {
                            trdVar.r(33);
                            trdVar.i(33);
                            trdVar.b.h(32);
                        }
                    }
                } else {
                    trdVar2.p(62);
                    trdVar = treVar.h;
                    trj.d(SemanticState.Hidden);
                    zhkVar = treVar.i;
                    if (zhkVar != null) {
                        zhkVar.a();
                    }
                    if (treVar.g(204, 1)) {
                        trdVar.r(33);
                        trdVar.i(33);
                        trdVar.b.h(32);
                    }
                }
                if (actmVar.g != null) {
                    tsv.e(actmVar.f, Ctry.SHORTS_PLAYBACK, "");
                    long epochMilli = actmVar.c.f().toEpochMilli();
                    actmVar.f("r_tr");
                    actmVar.i = true;
                    j = epochMilli - actmVar.h;
                } else {
                    j = 0;
                }
            }
        }
        acoi acoiVar = this.b;
        wgs wgsVar = acoiVar.bU.a;
        if (wgsVar != null) {
            actm actmVar2 = acoiVar.y;
            int iE = wgsVar.e();
            synchronized (actmVar2.b) {
                if (actmVar2.g != null && actmVar2.k(str)) {
                    aihf aihfVarCreateBuilder = amiw.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    amiw amiwVar = (amiw) aihfVarCreateBuilder.instance;
                    amiwVar.b |= 1;
                    amiwVar.c = iE;
                    amiw amiwVar2 = (amiw) aihfVarCreateBuilder.build();
                    aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
                    amiwVar2.getClass();
                    amiuVar.N = amiwVar2;
                    amiuVar.d |= 8;
                    actmVar2.g.h((amiu) aihfVarCreateBuilder2.build());
                }
            }
        }
        acoi acoiVar2 = this.b;
        acoz acozVar = acoiVar2.aZ;
        if (acozVar != null) {
            acozVar.d.b(j);
            acoiVar2.aZ.d();
        }
    }
}
