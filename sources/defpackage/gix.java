package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.blocks.YoutubeSingletonAccountContainer;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gix implements aupr {
    public final ght a;
    public final gkg b;
    private final int c;

    public gix(ght ghtVar, gkg gkgVar, int i) {
        this.a = ghtVar;
        this.b = gkgVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object vwdVar;
        Object rqxVar;
        Set setSingleton;
        Object xscVar;
        switch (this.c) {
            case 0:
                ght ghtVar = this.a;
                gkg gkgVar = this.b;
                vwdVar = new vwd(ghtVar.nP, gkgVar.c, ghtVar.bw, (ahey) ghtVar.u.io(), ghtVar.cd, (mbc) ghtVar.l.io(), ghtVar.ft, ghtVar.aw, ghtVar.gF, ghtVar.q, ghtVar.nR, Optional.empty(), ghtVar.av, gkgVar.e);
                return vwdVar;
            case 1:
                gkg gkgVar2 = this.b;
                ght ghtVar2 = this.a;
                rqxVar = new rqx(gkgVar2.o(), (axqr) ghtVar2.ad.io(), (rmd) ghtVar2.bd.io(), (tqj) ghtVar2.q.io(), (Executor) ghtVar2.T.io());
                return rqxVar;
            case 2:
                gkg gkgVar3 = this.b;
                afvq afvqVar = (afvq) gkgVar3.d.io();
                return new trs(afvqVar);
            case 3:
                ght ghtVar3 = this.a;
                afwd afwdVar = (afwd) ghtVar3.vh.io();
                gkg gkgVar4 = this.b;
                ahud ahudVarGq = ghtVar3.gq();
                affd affdVar = gkgVar4.a;
                if (affdVar == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    afuw afuwVarC = afux.a.c();
                    affe.a(afuwVarC, affdVar);
                    setSingleton = Collections.singleton(((afuy) afuwVarC).f());
                }
                setSingleton.getClass();
                return ahno.aG(afwdVar, ahudVarGq, agkz.n(setSingleton));
            case 4:
                gkg gkgVar5 = this.b;
                ght ghtVar4 = this.a;
                xscVar = new xsc((Object) gkgVar5.o(), (Object) aupm.b(ghtVar4.cw), (Object) aupm.b(ghtVar4.cv), (byte[]) null);
                return xscVar;
            case 5:
                vwdVar = new iqk(aupm.b(this.b.i), (Executor) this.a.z.io());
                return vwdVar;
            case 6:
                Executor executor = (Executor) this.a.z.io();
                bec becVar = (bec) this.b.h.io();
                becVar.getClass();
                executor.getClass();
                return azu.f(becVar, awuw.f(executor));
            case 7:
                afqx afqxVarA = afqy.a();
                afqxVarA.a = "MusicDownloadsPrefsStore";
                afqxVarA.c(ailq.a);
                return this.b.G().k(afqxVarA.a());
            case 8:
                ght ghtVar5 = this.a;
                gkg gkgVar6 = this.b;
                boolean zEi = ghtVar5.ei();
                ght ghtVar6 = gkgVar6.b;
                aupr auprVar = ghtVar6.md;
                aupr auprVar2 = gkgVar6.k;
                aupr auprVar3 = ghtVar6.dE;
                aupr auprVar4 = ghtVar6.z;
                aupr auprVar5 = ghtVar6.dC;
                aupr auprVar6 = ghtVar6.u;
                aupr auprVar7 = ghtVar6.v;
                aupr auprVar8 = ghtVar6.cz;
                YoutubeSingletonAccountContainer youtubeSingletonAccountContainer = new YoutubeSingletonAccountContainer(new hoq(new abzi(auprVar, auprVar2, auprVar3, auprVar4, auprVar5, auprVar6, auprVar7, auprVar8, gkgVar6.l, ghtVar6.cd, ghtVar6.lS, ghtVar6.mC, ghtVar6.et, null, null)), new hoq(new jmm(ghtVar6.md, ghtVar6.mC, ghtVar6.l, ghtVar6.z, ghtVar6.bl, ghtVar6.nq, ghtVar6.v, ghtVar6.lS, ghtVar6.nr, auprVar8, ghtVar6.ct, gkgVar6.j, ghtVar6.fa, ghtVar6.et, new aups(ghtVar6.cF), ghtVar6.a.hf, null)), new hoq((qcb) gkgVar6.n.io()));
                aupr auprVar9 = ghtVar5.nn;
                aupr auprVar10 = ghtVar5.no;
                aupr auprVar11 = ghtVar5.np;
                auprVar9.getClass();
                auprVar10.getClass();
                auprVar11.getClass();
                if (zEi) {
                    return ((sqs) auprVar9.io()).a(youtubeSingletonAccountContainer, (Container) auprVar11.io());
                }
                meg.a();
                Object objIo = auprVar10.io();
                objIo.getClass();
                wag wagVar = (wag) objIo;
                asbr asbrVar = (asbr) wagVar.c(242).io();
                return youtubeSingletonAccountContainer.d(wagVar.d(asbrVar.c), asbrVar, (Container) auprVar11.io());
            case 9:
                return this.a.af().e(((zwh) this.b.c.io()).hw());
            case 10:
                rqxVar = new qcb(this);
                return rqxVar;
            case 11:
                return ((wda) this.a.jx.io()).b(((zwh) this.b.c.io()).hw());
            case 12:
                Executor executor2 = (Executor) this.a.z.io();
                bec becVar2 = (bec) this.b.o.io();
                becVar2.getClass();
                executor2.getClass();
                return azu.f(becVar2, awuw.f(executor2));
            case 13:
                afqx afqxVarA2 = afqy.a();
                afqxVarA2.a = "MusicLibraryPrefsStore";
                afqxVarA2.c(ails.a);
                return this.b.G().k(afqxVarA2.a());
            case 14:
                rqxVar = new tpn(omj.U((qrx) this.b.q.io()), ailr.a);
                return rqxVar;
            case 15:
                afqz afqzVarA = afra.a();
                afqzVarA.c(ailr.a);
                afqzVarA.a = "musiciteratecommandscommandhistory";
                return this.b.J().E(afqzVarA.a(), (ayq) this.a.Y.io());
            case 16:
                afqz afqzVarA2 = afra.a();
                afqzVarA2.a = "OneTimeDisclaimerPrefsStore";
                afqzVarA2.c(aimo.a);
                return this.b.J().E(afqzVarA2.a(), (ayq) this.a.Y.io());
            case 17:
                afqz afqzVarA3 = afra.a();
                afqzVarA3.a = "GeneratedThumbnailsPrefsStore";
                afqzVarA3.c(ailf.a);
                return this.b.J().E(afqzVarA3.a(), (ayq) this.a.Y.io());
            case 18:
                ght ghtVar7 = this.a;
                vwdVar = new aaqf((wlp) ghtVar7.kE.io(), (abxv) ghtVar7.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar7.EZ.io(), (Executor) ghtVar7.u.io(), (byte[]) null);
                return vwdVar;
            case 19:
                vwdVar = new iqg(aupm.b(this.b.w), (Executor) this.a.z.io());
                return vwdVar;
            case 20:
                Executor executor3 = (Executor) this.a.z.io();
                bec becVar3 = (bec) this.b.v.io();
                becVar3.getClass();
                executor3.getClass();
                return azu.f(becVar3, awuw.f(executor3));
            case 21:
                afqx afqxVarA3 = afqy.a();
                afqxVarA3.c(ailp.a);
                afqxVarA3.a = "musicbrowserclientsprefs";
                return this.b.G().k(afqxVarA3.a());
            case 22:
                Executor executor4 = (Executor) this.a.z.io();
                bec becVar4 = (bec) this.b.y.io();
                becVar4.getClass();
                executor4.getClass();
                return azu.f(becVar4, awuw.f(executor4));
            case 23:
                afqx afqxVarA4 = afqy.a();
                afqxVarA4.c(aimb.a);
                afqxVarA4.a = "datasavingsettings";
                return this.b.G().k(afqxVarA4.a());
            case 24:
                vwdVar = new iqn(aupm.b(this.b.B), (Executor) this.a.z.io());
                return vwdVar;
            case 25:
                Executor executor5 = (Executor) this.a.z.io();
                bec becVar5 = (bec) this.b.A.io();
                becVar5.getClass();
                executor5.getClass();
                return azu.f(becVar5, awuw.f(executor5));
            case 26:
                afqx afqxVarA5 = afqy.a();
                afqxVarA5.c(ailu.a);
                afqxVarA5.a = "musicplaybacksettings";
                return this.b.G().k(afqxVarA5.a());
            case 27:
                ght ghtVar8 = this.a;
                vwdVar = new aaqf((wlp) ghtVar8.kE.io(), (abxv) ghtVar8.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar8.EZ.io(), (Executor) ghtVar8.u.io());
                return vwdVar;
            case 28:
                afqx afqxVarA6 = afqy.a();
                afqxVarA6.c(rov.a);
                afqxVarA6.a = "offline_account_proto_data_store";
                afqxVarA6.b(new bgr(new prq(10)));
                return this.b.G().k(afqxVarA6.a());
            case 29:
                afqx afqxVarA7 = afqy.a();
                afqxVarA7.a = "youtube_engagementpanel";
                afqxVarA7.c(vsw.a);
                afqxVarA7.b(new bgr(new uhd(12)));
                return this.b.G().k(afqxVarA7.a());
            case 30:
                gkg gkgVar7 = this.b;
                wjr wjrVar = new wjr((bec) gkgVar7.G.io(), (bec) gkgVar7.H.io());
                ght ghtVar9 = this.a;
                vwdVar = new aesp(wjrVar, (mbc) ghtVar9.l.io(), (awut) ghtVar9.bm.io(), aupm.b(ghtVar9.qu), aupm.b(gkgVar7.c));
                return vwdVar;
            case 31:
                afqx afqxVarA8 = afqy.a();
                afqxVarA8.a = "YTAccountStaticConfigStore";
                aihf aihfVarCreateBuilder = vzg.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                afqxVarA8.c((vzg) aihnVarBuild);
                return this.b.G().k(afqxVarA8.a());
            case 32:
                afqx afqxVarA9 = afqy.a();
                afqxVarA9.a = "YTAccountDynamicConfigStore";
                aihf aihfVarCreateBuilder2 = vzf.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                afqxVarA9.c((vzf) aihnVarBuild2);
                return this.b.G().k(afqxVarA9.a());
            case 33:
                rqxVar = new wjr((mbc) this.a.l.io());
                return rqxVar;
            case 34:
                ght ghtVar10 = this.a;
                vwdVar = new wud((abxv) ghtVar10.gK.io(), (tgg) ghtVar10.qg.io(), (zwh) this.b.c.io(), (vxu) ghtVar10.at.io(), (wlp) ghtVar10.kE.io());
                return vwdVar;
            case 35:
                ght ghtVar11 = this.a;
                vwdVar = new aend((wlp) ghtVar11.kE.io(), (abxv) ghtVar11.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar11.ms.io(), (byte[]) null, (byte[]) null);
                return vwdVar;
            case 36:
                ght ghtVar12 = this.a;
                xscVar = new wsy((wlp) ghtVar12.kE.io(), (abxv) ghtVar12.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar12.zQ.io());
                return xscVar;
            case 37:
                ght ghtVar13 = this.a;
                vwdVar = new aaqf((wlp) ghtVar13.kE.io(), (abxv) ghtVar13.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar13.zQ.io(), (wjz) ghtVar13.lF.io(), Optional.of(ghtVar13.gQ()));
                return vwdVar;
            case 38:
                ght ghtVar14 = this.a;
                vwdVar = new wtr((wlp) ghtVar14.kE.io(), (abxv) ghtVar14.gK.io(), (zwb) this.b.O.io(), (tgg) ghtVar14.ms.io(), (tfq) ghtVar14.cd.io(), (tqa) ghtVar14.iC.io(), ghtVar14.gM);
                return vwdVar;
            case 39:
                vwdVar = new rqy((zwh) this.b.c.io(), (zwb) this.a.bd.io());
                return vwdVar;
            case 40:
                ght ghtVar15 = this.a;
                vwdVar = new aapz((wlp) ghtVar15.kE.io(), (abxv) ghtVar15.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar15.ms.io(), (vxu) ghtVar15.at.io(), (Executor) ghtVar15.u.io());
                return vwdVar;
            case 41:
                ght ghtVar16 = this.a;
                vwdVar = new aend((wlp) ghtVar16.kE.io(), (abxv) ghtVar16.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar16.ms.io(), (byte[]) null);
                return vwdVar;
            case 42:
                ght ghtVar17 = this.a;
                wlp wlpVar = (wlp) ghtVar17.kE.io();
                abxv abxvVar = (abxv) ghtVar17.gK.io();
                tgg tggVar = (tgg) ghtVar17.ms.io();
                vwdVar = new wnn(wlpVar, abxvVar, tggVar);
                return vwdVar;
            case 43:
                ght ghtVar18 = this.a;
                vwdVar = new aaqf((wlp) ghtVar18.kE.io(), (abxv) ghtVar18.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar18.ms.io(), (vxu) ghtVar18.at.io());
                return vwdVar;
            case 44:
                ght ghtVar19 = this.a;
                wlp wlpVar2 = (wlp) ghtVar19.kE.io();
                abxv abxvVar2 = (abxv) ghtVar19.gK.io();
                gkg gkgVar8 = this.b;
                rqxVar = new wnn(wlpVar2, abxvVar2, (tgg) ghtVar19.zV.io(), (byte[]) null);
                return rqxVar;
            case 45:
                ght ghtVar20 = this.a;
                vxu vxuVar = (vxu) ghtVar20.at.io();
                vyo vyoVar = (vyo) ghtVar20.av.io();
                ght.fp();
                rqxVar = new vxz(vxuVar, vyoVar, "CommercePlatformClient");
                return rqxVar;
            case 46:
                ght ghtVar21 = this.a;
                wlp wlpVar3 = (wlp) ghtVar21.kE.io();
                abxv abxvVar3 = (abxv) ghtVar21.gK.io();
                gkg gkgVar9 = this.b;
                vwdVar = new aapz(wlpVar3, abxvVar3, (zwh) gkgVar9.c.io(), (vxz) gkgVar9.T.io(), (zwy) ghtVar21.fa.io(), (tgg) ghtVar21.zV.io());
                return vwdVar;
            case 47:
                ght ghtVar22 = this.a;
                wlp wlpVar4 = (wlp) ghtVar22.kE.io();
                abxv abxvVar4 = (abxv) ghtVar22.gK.io();
                gkg gkgVar10 = this.b;
                vwdVar = new wnn(wlpVar4, abxvVar4, (tgg) ghtVar22.zV.io(), (char[]) null);
                return vwdVar;
            case 48:
                bec becVar6 = (bec) this.b.V.io();
                Executor executor6 = (Executor) this.a.z.io();
                becVar6.getClass();
                executor6.getClass();
                return azu.f(becVar6, awuw.f(executor6));
            case 49:
                afqx afqxVarA10 = afqy.a();
                afqxVarA10.c(abwt.a);
                afqxVarA10.a = "captions_settings";
                return this.b.G().k(afqxVarA10.a());
            case 50:
                rqxVar = new rlc((vze) this.b.X.io());
                return rqxVar;
            case 51:
                aesp aespVar = (aesp) this.b.I.io();
                zvl zvlVar = (zvl) this.a.dO.io();
                aespVar.getClass();
                zvlVar.getClass();
                rqxVar = new vze(((vza) aespVar.g).c);
                return rqxVar;
            case 52:
                ght ghtVar23 = this.a;
                Context context = (Context) ghtVar23.v.io();
                gkg gkgVar11 = this.b;
                affd affdVarO = gkgVar11.o();
                afho afhoVar = (afho) ghtVar23.ac.io();
                ghx ghxVar = ghtVar23.a;
                abhh abhhVar = (abhh) ghxVar.bz.io();
                mbc mbcVar = (mbc) ghtVar23.l.io();
                Executor executor7 = (Executor) ghtVar23.u.io();
                Executor executor8 = (Executor) ghtVar23.T.io();
                Executor executor9 = (Executor) ghtVar23.B.io();
                vxz vxzVar = (vxz) ghtVar23.cA.io();
                ght ghtVar24 = gkgVar11.b;
                vxu vxuVar2 = (vxu) ghtVar24.at.io();
                vyo vyoVar2 = (vyo) ghtVar24.av.io();
                ght.fp();
                vwdVar = new aegn(context, affdVarO, afhoVar, abhhVar, mbcVar, executor7, executor8, executor9, vxzVar, new vxz(vxuVar2, vyoVar2, "CommercePlatformClientShared"), (vxz) gkgVar11.Z.io(), aupm.b(ghxVar.hg), aupm.b(ghxVar.hi), aupm.b(gkgVar11.aa), aupm.b(gkgVar11.ad));
                return vwdVar;
            case 53:
                ght ghtVar25 = this.a;
                vxu vxuVar3 = (vxu) ghtVar25.at.io();
                vyo vyoVar3 = (vyo) ghtVar25.av.io();
                ght.fp();
                rqxVar = new vxz(vxuVar3, vyoVar3, "WebviewClient");
                return rqxVar;
            case 54:
                return new aehn();
            case 55:
                gkg gkgVar12 = this.b;
                bec becVar7 = (bec) gkgVar12.ab.io();
                ght ghtVar26 = this.a;
                vwdVar = new ahgb(becVar7, (awut) ghtVar26.bm.io(), aupm.b(gkgVar12.ac), gkgVar12.o(), (mbc) ghtVar26.l.io());
                return vwdVar;
            case 56:
                afqx afqxVarA11 = afqy.a();
                afqxVarA11.a = "WebViewAuthentication";
                afqxVarA11.c(arjw.a);
                return this.b.G().k(afqxVarA11.a());
            case 57:
                return new auym();
            case 58:
                afqx afqxVarA12 = afqy.a();
                afqxVarA12.a = "WebViewProfileSettings";
                afqxVarA12.c(arkk.a);
                return this.b.G().k(afqxVarA12.a());
            case 59:
                aend aendVar = (aend) this.b.ag.io();
                ght ghtVar27 = this.a;
                vwdVar = new iky(aendVar, (wom) ghtVar27.a.ho.io(), (awou) ghtVar27.bl.io(), (awou) ghtVar27.bn.io(), (Executor) ghtVar27.B.io());
                return vwdVar;
            case 60:
                ght ghtVar28 = this.a;
                xscVar = new aend((wlp) ghtVar28.kE.io(), (abxv) ghtVar28.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar28.zV.io());
                return xscVar;
            case 61:
                afqx afqxVarA13 = afqy.a();
                afqxVarA13.a = "ToolbeltStateStorageSchema";
                aihf aihfVarCreateBuilder3 = uje.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
                aihnVarBuild3.getClass();
                afqxVarA13.c((uje) aihnVarBuild3);
                return this.b.G().k(afqxVarA13.a());
            case 62:
                afqx afqxVarA14 = afqy.a();
                afqxVarA14.a = "ShortsCreationXenoEffectsState";
                afqxVarA14.c(uzd.a);
                return this.b.G().k(afqxVarA14.a());
            case 63:
                vbj vbjVar = (vbj) this.b.al.io();
                vbjVar.getClass();
                return vbjVar.a(new vbi(0));
            case 64:
                rqxVar = new giw(this, 0);
                return rqxVar;
            case 65:
                ght ghtVar29 = this.a;
                vwdVar = new aend((wlp) ghtVar29.kE.io(), (abxv) ghtVar29.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar29.rn.io(), (byte[]) null, (byte[]) null, (byte[]) null);
                return vwdVar;
            case 66:
                return new zf((byte[]) null, (byte[]) null);
            case 67:
                afqx afqxVarA15 = afqy.a();
                afqxVarA15.a = "media_gen_block_references";
                afqxVarA15.c(vcr.a);
                return this.b.G().k(afqxVarA15.a());
            default:
                afqx afqxVarA16 = afqy.a();
                afqxVarA16.a = "MediaGenImageEditorSchema";
                afqxVarA16.c(upy.a);
                return this.b.G().k(afqxVarA16.a());
        }
    }
}
