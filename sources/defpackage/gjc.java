package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;
import app.rive.RenderBackend;
import app.rive.RiveInitializationException;
import app.rive.core.CommandQueue;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.blocks.QueryEngineContainer;
import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflineAlbumAppSearchDocument;
import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflinePlaylistAppSearchDocument;
import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflineVideoAppSearchDocument;
import com.google.android.apps.youtube.music.player.widget.MusicWidgetProvider;
import com.google.android.apps.youtube.music.player.widget.gm3.FlipWidgetProvider;
import com.google.android.apps.youtube.music.player.widget.gm3.FreeformMusicWidgetProvider;
import com.google.android.apps.youtube.music.player.widget.gm3.NowPlayingWidgetProvider;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;
import com.google.android.libraries.video.mediaengine.logging.QosContainer;
import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorUtil;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjc implements aupr {
    private final /* synthetic */ int $cid;
    public final ght a;
    private final int b;

    public gjc(ght ghtVar, int i, int i2) {
        this.$cid = i2;
        this.a = ghtVar;
        this.b = i;
    }

    private final Object b() {
        Object afnkVar;
        Object syiVar;
        Object aeiyVar;
        int i = this.b;
        switch (i) {
            case 0:
                return new heg(this.a.a.aA());
            case 1:
                ght ghtVar = this.a;
                ghtVar.fM();
                Optional optionalEmpty = Optional.empty();
                Optional.empty();
                ghx ghxVar = ghtVar.a;
                afnkVar = new afnk(optionalEmpty, ghxVar.br, ghxVar.bt, ghxVar.bu, ghxVar.bv);
                return afnkVar;
            case 2:
                ght ghtVar2 = this.a;
                afnkVar = new afnj((Context) ghtVar2.v.io(), ghtVar2.fM(), ghtVar2.da(), ghtVar2.a.aw(), aupt.b(), aupt.b(), (ahex) ghtVar2.t.io(), aupm.b(ghtVar2.al), ghtVar2.mK, ghtVar2.fU(), ghtVar2.tM);
                return afnkVar;
            case 3:
                ght ghtVar3 = this.a;
                return new afsf(ghtVar3.a.bj, ((Boolean) ghtVar3.ae.io()).booleanValue());
            case 4:
                ght ghtVar4 = this.a;
                return afmb.i(((Boolean) ghtVar4.ae.io()).booleanValue(), ghtVar4.uc, ghtVar4.xs, ghtVar4.fM(), ghtVar4.a.av(), ght.ey());
            case 5:
                return new dyl((dyj) this.a.a.bo.io());
            case 6:
                ght ghtVar5 = this.a;
                return adib.o(agev.i((aflg) ghtVar5.tV.io()), (Context) ghtVar5.v.io(), ghtVar5.bi(), (ahey) ghtVar5.t.io(), (awou) ghtVar5.bl.io(), (afkg) ghtVar5.fO.io(), (dzv) ghtVar5.a.bn.io());
            case 7:
                return mda.b(this.a.a.aD());
            case 8:
                ght ghtVar6 = this.a;
                aupr auprVar = ghtVar6.ca;
                ghx ghxVar2 = ghtVar6.a;
                syiVar = new syi(ghxVar2.b, ghxVar2.bg, (vxz) auprVar.io(), (mbc) ghtVar6.l.io());
                return syiVar;
            case 9:
                return new dov((Map) this.a.a.ap());
            case 10:
                ghx ghxVar3 = this.a.a;
                return new zzr(ghxVar3.Z(), ghxVar3.at(), 0);
            case 11:
                aaci aaciVar = (aaci) this.a.a.d.io();
                xwg.h(aaciVar);
                return aaciVar;
            case 12:
                ght ghtVar7 = this.a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar7.T.io();
                Executor executor = (Executor) ghtVar7.B.io();
                aabz aabzVar = (aabz) ghtVar7.xy.io();
                zhg zhgVarCL = ghtVar7.a.cL();
                aupr auprVar2 = ghtVar7.bN;
                vyo vyoVar = (vyo) ghtVar7.av.io();
                return zik.aQ(scheduledExecutorService, executor, aabzVar, zhgVarCL, auprVar2, vyoVar);
            case 13:
                ght ghtVar8 = this.a;
                aeiyVar = new aeiy(ghtVar8.a.b, ghtVar8.cc, ghtVar8.cd, ghtVar8.I, ghtVar8.u, ghtVar8.av, ghtVar8.xD, ghtVar8.bN);
                return aeiyVar;
            case 14:
                ght ghtVar9 = this.a;
                Context context = (Context) ghtVar9.v.io();
                ghx ghxVar4 = ghtVar9.a;
                afnkVar = new qbs(context, (phe) ghxVar4.i.io(), (omm) ghtVar9.yI.io(), (pve) ghtVar9.yF.io(), (pct) ghxVar4.j.io(), (pav) ghtVar9.yG.io(), (pls) ghtVar9.yi.io(), ghtVar9.yj, (tld) ghtVar9.za.io(), (awou) ghtVar9.yu.io(), (awou) ghtVar9.yw.io(), (pgs) ghxVar4.I.io());
                return afnkVar;
            case 15:
                ght ghtVar10 = this.a;
                Context context2 = (Context) ghtVar10.v.io();
                ghx ghxVar5 = ghtVar10.a;
                afnkVar = new pjv(context2, ghtVar10.C(), agev.i(ghxVar5.au()), (pcn) ghxVar5.h.io(), (pgt) ghtVar10.yV.io(), (omm) ghtVar10.yI.io(), (pve) ghtVar10.yF.io(), (pgy) ghtVar10.yn.io(), (piy) ghtVar10.yl.io(), (pav) ghtVar10.yG.io(), (pls) ghtVar10.yi.io(), ghtVar10.cW(), (mbc) ghtVar10.l.io(), ghtVar10.F(), (tld) ghtVar10.za.io(), aupm.b(ghxVar5.j), ghtVar10.yj, aupm.b(ghxVar5.I), aupm.b(ghxVar5.O), aupm.b(ghtVar10.zg), (piz) ghxVar5.Q.io(), aupm.b(ghxVar5.o));
                return afnkVar;
            case 16:
                ght ghtVar11 = this.a;
                return psq.t((qbn) ghtVar11.a.f.io(), ghtVar11.dN());
            case 17:
                return new pco(agev.i(this.a.a.au()));
            case 18:
                ght ghtVar12 = this.a;
                ghx ghxVar6 = ghtVar12.a;
                aeiyVar = new pdb((pcy) ghxVar6.D.io(), (pdk) ghxVar6.F.io(), ghxVar6.y(), (awou) ghtVar12.yw.io(), (pls) ghtVar12.yi.io(), (pwf) ghtVar12.yj.io(), (Context) ghtVar12.v.io());
                return aeiyVar;
            case 19:
                ght ghtVar13 = this.a;
                afnkVar = new pcy((Context) ghtVar13.v.io(), (pls) ghtVar13.yi.io(), (pcb) ghtVar13.a.k.io(), (pav) ghtVar13.yG.io(), ghtVar13.yj, (ppe) ghtVar13.zm.io(), (mbc) ghtVar13.l.io());
                return afnkVar;
            case 20:
                ght ghtVar14 = this.a;
                ghx ghxVar7 = ghtVar14.a;
                aeiyVar = new pcm((phe) ghxVar7.i.io(), aupm.b(aupt.b()), aupm.b(ghtVar14.zb), (pav) ghtVar14.yG.io(), (Context) ghtVar14.v.io(), (pls) ghtVar14.yi.io(), ghtVar14.yj, (tld) ghtVar14.zd.io(), ghtVar14.yI, (mbc) ghtVar14.l.io(), aupm.b(ghxVar7.o), (axff) ghtVar14.zJ.io());
                return aeiyVar;
            case 21:
                ght ghtVar15 = this.a;
                Context context3 = (Context) ghtVar15.v.io();
                qbi qbiVar = (qbi) ghtVar15.ze.io();
                aunn aunnVarB = aupm.b(ghtVar15.zg);
                pfk pfkVar = (pfk) ghtVar15.zh.io();
                pls plsVar = (pls) ghtVar15.yi.io();
                pwf pwfVar = (pwf) ghtVar15.yj.io();
                mbc mbcVar = (mbc) ghtVar15.l.io();
                ghx ghxVar8 = ghtVar15.a;
                afnkVar = new pfa(context3, qbiVar, aunnVarB, pfkVar, plsVar, pwfVar, mbcVar, aupm.b(ghxVar8.r), aupm.b(ghxVar8.s), aupm.b(ghxVar8.t), aupm.b(ghxVar8.u), aupm.b(ghxVar8.v), aupm.b(ghxVar8.w), aupm.b(ghxVar8.x), aupm.b(ghxVar8.y), aupm.b(ghxVar8.z), aupm.b(ghxVar8.A), aupm.b(ghxVar8.B), aupm.b(ghxVar8.C), (awou) ghtVar15.yh.io(), (awou) ghtVar15.yu.io());
                return afnkVar;
            case 22:
                ght ghtVar16 = this.a;
                pfb pfbVar = new pfb((pdr) ghtVar16.zB.io());
                ghtVar16.a.cj(pfbVar);
                return pfbVar;
            case 23:
                ght ghtVar17 = this.a;
                ghx ghxVar9 = ghtVar17.a;
                aeiyVar = new pgp((pct) ghxVar9.j.io(), (pve) ghtVar17.yF.io(), (tld) ghtVar17.zD.io(), (pcb) ghxVar9.k.io(), (pav) ghtVar17.yG.io(), (Set) aupt.b().io(), (mbc) ghtVar17.l.io(), ghtVar17.zz, (pou) ghtVar17.zG.io());
                return aeiyVar;
            case 24:
                ght ghtVar18 = this.a;
                return new pgr((pct) ghtVar18.a.j.io(), (pve) ghtVar18.yF.io(), (pav) ghtVar18.yG.io(), (mbc) ghtVar18.l.io());
            case 25:
                ght ghtVar19 = this.a;
                return new pgk((phe) ghtVar19.a.i.io(), (pav) ghtVar19.yG.io());
            case 26:
                ght ghtVar20 = this.a;
                afnkVar = new qas((pve) ghtVar20.yF.io(), (ppe) ghtVar20.zm.io(), (mbc) ghtVar20.l.io(), (pgi) ghtVar20.a.p.io(), (omm) ghtVar20.yy.io(), (pav) ghtVar20.yG.io());
                return afnkVar;
            case 27:
                ght ghtVar21 = this.a;
                return new pgm((peq) ghtVar21.a.o.io(), (pdr) ghtVar21.zB.io(), (mbc) ghtVar21.l.io(), (awou) ghtVar21.yh.io());
            case 28:
                ght ghtVar22 = this.a;
                pfc pfcVar = new pfc((pdr) ghtVar22.zB.io(), (tld) ghtVar22.zD.io());
                ghtVar22.a.ck(pfcVar);
                return pfcVar;
            case 29:
                ght ghtVar23 = this.a;
                pfd pfdVar = new pfd((pdr) ghtVar23.zB.io());
                ghtVar23.a.cm(pfdVar);
                return pfdVar;
            case 30:
                ght ghtVar24 = this.a;
                pfi pfiVar = new pfi((pdr) ghtVar24.zB.io());
                ghtVar24.a.co(pfiVar);
                return pfiVar;
            case 31:
                ght ghtVar25 = this.a;
                peu peuVar = new peu((pdr) ghtVar25.zB.io(), (pfk) ghtVar25.zh.io());
                ghtVar25.a.ci(peuVar);
                return peuVar;
            case 32:
                ght ghtVar26 = this.a;
                pfh pfhVar = new pfh((pdr) ghtVar26.zB.io(), (pfk) ghtVar26.zh.io());
                ghtVar26.a.cn(pfhVar);
                return pfhVar;
            case 33:
                ght ghtVar27 = this.a;
                return iqf.m(ghtVar27.fQ(), (pfb) ghtVar27.a.r.io());
            case 34:
                ght ghtVar28 = this.a;
                return iqf.n(ghtVar28.fQ(), (pfc) ghtVar28.a.s.io());
            case 35:
                ght ghtVar29 = this.a;
                return iqf.o(ghtVar29.fQ(), (pfd) ghtVar29.a.t.io());
            case 36:
                ght ghtVar30 = this.a;
                return iqf.q(ghtVar30.fQ(), (pfi) ghtVar30.a.u.io());
            case 37:
                ght ghtVar31 = this.a;
                return iqf.l(ghtVar31.fQ(), (peu) ghtVar31.a.v.io());
            case 38:
                ght ghtVar32 = this.a;
                return iqf.p(ghtVar32.fQ(), (pfh) ghtVar32.a.w.io());
            case 39:
                ght ghtVar33 = this.a;
                pfk pfkVar2 = (pfk) ghtVar33.zh.io();
                qbi qbiVar2 = (qbi) ghtVar33.ze.io();
                aunn aunnVarB2 = aupm.b(ghtVar33.zg);
                ghx ghxVar10 = ghtVar33.a;
                pdl pdlVarX = ghxVar10.x();
                ghxVar10.w();
                ppw ppwVarC = ghxVar10.C();
                ghxVar10.D();
                afnkVar = new pdk(pfkVar2, qbiVar2, aunnVarB2, pdlVarX, ppwVarC);
                return afnkVar;
            case 40:
                ght ghtVar34 = this.a;
                return new pdf((pfk) ghtVar34.zh.io(), (pve) ghtVar34.yF.io(), (pcy) ghtVar34.a.D.io(), (mbc) ghtVar34.l.io());
            case 41:
                ghx ghxVar11 = this.a.a;
                return agkj.l(1, (phc) ghxVar11.G.io(), 2, ghxVar11.A(), 3, ghxVar11.J());
            case 42:
                ght ghtVar35 = this.a;
                afnkVar = new phl((Context) ghtVar35.v.io(), (pls) ghtVar35.yi.io(), (pcn) ghtVar35.a.h.io(), (pav) ghtVar35.yG.io(), ghtVar35.yj);
                return afnkVar;
            case 43:
                ght ghtVar36 = this.a;
                afnkVar = new phk(aupm.b(ghtVar36.zK), aupm.b(ghtVar36.zL), (phe) ghtVar36.a.i.io(), (tld) ghtVar36.za.io(), (omm) ghtVar36.yI.io(), (pve) ghtVar36.yF.io(), (awou) ghtVar36.yw.io(), (awou) ghtVar36.yu.io());
                return afnkVar;
            case 44:
                ght ghtVar37 = this.a;
                qbi qbiVar3 = (qbi) ghtVar37.ze.io();
                aunn aunnVarB3 = aupm.b(ghtVar37.zg);
                ghx ghxVar12 = ghtVar37.a;
                pbw pbwVar = (pbw) ghxVar12.K.io();
                paa paaVar = (paa) ghxVar12.L.io();
                ghxVar12.E();
                afnkVar = new ozx(qbiVar3, aunnVarB3, pbwVar, paaVar, aupm.b(ghxVar12.M), ghxVar12.N, ghtVar37.yI, ghtVar37.yF, ghtVar37.za);
                return afnkVar;
            case 45:
                ght ghtVar38 = this.a;
                return new pca((qbi) ghtVar38.ze.io(), aupm.b(ghtVar38.zg), (qbh) ghtVar38.zO.io(), (ppw) ghtVar38.a.J.io());
            case 46:
                ght ghtVar39 = this.a;
                return iqf.k(ghtVar39.fQ(), (pbz) ghtVar39.zO.io());
            case 47:
                ght ghtVar40 = this.a;
                return new paa((pgs) ghtVar40.a.I.io(), (awou) ghtVar40.yu.io());
            case 48:
                return this.a.a.u();
            case 49:
                return agev.i(Boolean.valueOf(this.a.a.aO()));
            case 50:
                return new piz();
            case 51:
                ght ghtVar41 = this.a;
                return xwg.s((Context) ghtVar41.v.io(), (rrq) ghtVar41.bh.io());
            case 52:
                return new zzp(this.a.a.aa());
            case 53:
                return new yno((byte[]) null);
            case 54:
                return new wpq(this.a.a.Y);
            case 55:
                ght ghtVar42 = this.a;
                return vyr.n((vvn) ghtVar42.fL.io(), ghtVar42.a.X);
            case 56:
                ght ghtVar43 = this.a;
                return new wpp(ghtVar43.a.W, (syn) ghtVar43.cc.io(), (vxu) ghtVar43.at.io());
            case 57:
                ght ghtVar44 = this.a;
                afnkVar = new aend(ghtVar44.a.T(), (abxv) ghtVar44.gK.io(), (zwb) ghtVar44.bd.io(), (tgg) ghtVar44.zP.io(), (char[]) null, (byte[]) null);
                return afnkVar;
            case 58:
                return new wpt((aend) this.a.a.W.io());
            case 59:
                ght ghtVar45 = this.a;
                return new zsq((rmu) ghtVar45.bd.io(), (omj) ghtVar45.bI.io(), aupm.b(ghtVar45.a.aq), 1);
            case 60:
                ght ghtVar46 = this.a;
                afnkVar = new aehs((rmu) ghtVar46.bd.io(), (rmw) ghtVar46.bd.io(), (rly) ghtVar46.cm.io(), (rre) ghtVar46.bL.io(), (omj) ghtVar46.ap.io(), (rqa) ghtVar46.zS.io(), ghtVar46.a.ap, (tbt) ghtVar46.I.io(), aupm.b(ghtVar46.bN));
                return afnkVar;
            case 61:
                ght ghtVar47 = this.a;
                ghx ghxVar13 = ghtVar47.a;
                return agkz.u((zwg) ghxVar13.aa.io(), (zwg) ghtVar47.ct.io(), (zwg) ghtVar47.qB.io(), (zwg) ghxVar13.ae.io(), (zwg) ghtVar47.iG.io(), (zwg) ghtVar47.zS.io(), (zwg) ghtVar47.er.io(), (zwg) ghtVar47.ei.io(), (zwg) ghtVar47.jv.io(), (zwg) ghtVar47.jx.io());
            case 62:
                ght ghtVar48 = this.a;
                return new hdq((zwb) ghtVar48.bd.io(), (abvk) ghtVar48.kB.io(), (Handler) ghtVar48.cY.io());
            case 63:
                ght ghtVar49 = this.a;
                Context context4 = (Context) ghtVar49.v.io();
                ghx ghxVar14 = ghtVar49.a;
                aupr auprVar3 = ghxVar14.ad;
                agkz agkzVarR = agkz.r(MusicOfflineVideoAppSearchDocument.class, MusicOfflinePlaylistAppSearchDocument.class, MusicOfflineAlbumAppSearchDocument.class);
                aait aaitVar = (aait) auprVar3.io();
                aupr auprVar4 = ghxVar14.ac;
                aunn aunnVarB4 = aupm.b(ghxVar14.ao);
                isi isiVar = (isi) auprVar4.io();
                afnkVar = new aajt(context4, agkzVarR, aaitVar, aunnVarB4, isiVar, (aajv) ghxVar14.al.io(), (zwb) ghtVar49.bd.io(), (tbt) ghtVar49.I.io(), (Executor) ghtVar49.u.io());
                return afnkVar;
            case 64:
                ght ghtVar50 = this.a;
                ghx ghxVar15 = ghtVar50.a;
                return new aaiu(ghtVar50.cc, (grj) ghxVar15.ab.io(), (isi) ghxVar15.ac.io());
            case 65:
                return new grj((zwb) this.a.bd.io());
            case 66:
                ght ghtVar51 = this.a;
                return new isi((vxu) ghtVar51.at.io(), (vyo) ghtVar51.av.io(), (vxz) ghtVar51.cN.io());
            case 67:
                ghx ghxVar16 = this.a.a;
                return xwg.l(Optional.of((aajm) ghxVar16.am.io()), (aajr) ghxVar16.an.io());
            case 68:
                ght ghtVar52 = this.a;
                hpy hpyVar = (hpy) ghtVar52.md.io();
                ghx ghxVar17 = ghtVar52.a;
                afnkVar = new hng(hpyVar, (aajt) ghxVar17.ae.io(), (grj) ghxVar17.ai.io(), (Executor) ghtVar52.z.io(), (avmb) ghtVar52.dC.io(), (isi) ghxVar17.ac.io(), (grj) ghxVar17.ab.io(), (aajv) ghxVar17.al.io());
                return afnkVar;
            case 69:
                return new grj(this.a.a.ax());
            case 70:
                return new hnn((grj) this.a.a.ab.io());
            case 71:
                ght ghtVar53 = this.a;
                return new hnm((grj) ghtVar53.a.ab.io(), (hpy) ghtVar53.md.io(), (Executor) ghtVar53.u.io(), 0);
            case 72:
                ght ghtVar54 = this.a;
                return new hnm((grj) ghtVar54.a.ab.io(), (hpy) ghtVar54.md.io(), (Executor) ghtVar54.u.io(), 1);
            case 73:
                ghx ghxVar18 = this.a.a;
                return xwg.t((isi) ghxVar18.ac.io(), aupm.b(ghxVar18.aj), aupm.b(ghxVar18.ak));
            case 74:
                return new aaju((xeu) this.a.aZ.io());
            case 75:
                return new aajx((xeu) this.a.aZ.io());
            case 76:
                ght ghtVar55 = this.a;
                ghx ghxVar19 = ghtVar55.a;
                aeiyVar = new aajr((aajt) ghxVar19.ae.io(), (grj) ghxVar19.ai.io(), (Executor) ghtVar55.z.io(), (avmb) ghtVar55.dC.io(), (isi) ghxVar19.ac.io(), (grj) ghxVar19.ab.io(), (aajv) ghxVar19.al.io(), aupm.b(ghtVar55.I), (aanb) ghtVar55.iG.io());
                return aeiyVar;
            case 77:
                ght ghtVar56 = this.a;
                return new rkc((zwb) ghtVar56.bd.io(), (rmc) ghtVar56.tH.io(), ghtVar56.a.cy());
            case 78:
                return new aacx(this.a.a.au, 1);
            case 79:
                ght ghtVar57 = this.a;
                afnkVar = new itd((Context) ghtVar57.v.io(), (ahex) ghtVar57.u.io(), (isz) ghtVar57.a.at.io(), (iup) ghtVar57.mP.io(), (hfn) ghtVar57.mE.io());
                return afnkVar;
            case 80:
                return new isz((ahex) this.a.u.io());
            case 81:
                ght ghtVar58 = this.a;
                syiVar = new isu((iup) ghtVar58.mP.io(), (klc) ghtVar58.mI.io(), (hfn) ghtVar58.mF.io(), (Executor) ghtVar58.t.io());
                return syiVar;
            case 82:
                return new ita(this.a.a.au);
            case 83:
                ght ghtVar59 = this.a;
                return new zzr(ghtVar59.cf, ghtVar59.ck, 1);
            case 84:
                ght ghtVar60 = this.a;
                return new zsq(ghtVar60.cg, (tqj) ghtVar60.q.io(), ghtVar60.ck, 0);
            case 85:
                return new zxd((zxs) this.a.qR.io());
            case 86:
                ght ghtVar61 = this.a;
                return new hlr((aapw) ghtVar61.xT.io(), (tfq) ghtVar61.cd.io());
            case 87:
                ght ghtVar62 = this.a;
                afnkVar = new aacw(ghtVar62.iG, ghtVar62.sN, (aany) ghtVar62.sh.io(), agev.i(28), (aauk) ghtVar62.iL.io(), (Executor) ghtVar62.u.io(), (mbc) ghtVar62.l.io(), (abfv) ghtVar62.iO.io(), (vxz) ghtVar62.cN.io());
                return afnkVar;
            case 88:
                ght ghtVar63 = this.a;
                aeiyVar = new zzr(ghtVar63.iG, ghtVar63.sN, 3, null);
                return aeiyVar;
            case 89:
                ght ghtVar64 = this.a;
                return new zzr(ghtVar64.iG, ghtVar64.a.aI, 4);
            case 90:
                ght ghtVar65 = this.a;
                Context context5 = (Context) ghtVar65.v.io();
                aari aariVar = (aari) ghtVar65.sK.io();
                abfv abfvVar = (abfv) ghtVar65.rq.io();
                hlp hlpVar = (hlp) ghtVar65.iR.io();
                tfq tfqVar = (tfq) ghtVar65.cd.io();
                mbc mbcVar2 = (mbc) ghtVar65.l.io();
                twf twfVar = (twf) ghtVar65.hZ.io();
                jkg jkgVar = (jkg) ghtVar65.st.io();
                abvk abvkVar = (abvk) ghtVar65.kB.io();
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar65.J.io();
                abxv abxvVar = (abxv) ghtVar65.iK.io();
                zwb zwbVar = (zwb) ghtVar65.bd.io();
                hpb hpbVar = (hpb) ghtVar65.mC.io();
                huz huzVar = (huz) ghtVar65.sL.io();
                xsc xscVar = (xsc) ghtVar65.a.aH.io();
                afnkVar = new hoe(context5, aariVar, abfvVar, hlpVar, tfqVar, mbcVar2, twfVar, jkgVar, abvkVar, sharedPreferences, abxvVar, zwbVar, hpbVar, huzVar, xscVar, (hfn) ghtVar65.su.io(), (hpy) ghtVar65.md.io(), (Executor) ghtVar65.z.io(), (vxz) ghtVar65.cN.io());
                return afnkVar;
            case 91:
                ght ghtVar66 = this.a;
                syiVar = new xsc(aupm.b(ghtVar66.iG), aupm.b(ghtVar66.md), (abzo) ghtVar66.a.aF.io(), (boolean[]) null);
                return syiVar;
            case 92:
                ght ghtVar67 = this.a;
                afnkVar = new abzo(aups.b(ghtVar67.jy), aups.b(ghtVar67.bd), ghtVar67.v, ghtVar67.rs, ghtVar67.rt, ghtVar67.sh, aups.b(ghtVar67.iR), ghtVar67.sv, ghtVar67.z, ghtVar67.I, ghtVar67.cx, null, null, null, null);
                return afnkVar;
            case 93:
                ght ghtVar68 = this.a;
                aeiyVar = new zzr(ghtVar68.iG, ghtVar68.a.aM, 2, null);
                return aeiyVar;
            case 94:
                return gly.n(Optional.empty(), this.a.a.aL);
            case 95:
                ghx ghxVar20 = this.a.a;
                return ghxVar20.m().a((aaeg) ghxVar20.aK.io());
            case 96:
                return gzj.l();
            case 97:
                return new aacx((ci) this.a.rv.io(), 0);
            case 98:
                return new aacx((ci) this.a.rv.io(), 3);
            case 99:
                ght ghtVar69 = this.a;
                return new zsq(ghtVar69.a.aX, ghtVar69.iV, ghtVar69.iL, 2);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [afsc, java.lang.Object] */
    private final Object c() {
        Object kyrVar;
        Object zsqVar;
        Object abxvVar;
        int i = this.b;
        byte[] bArr = null;
        switch (i) {
            case 100:
                ght ghtVar = this.a;
                return new aalk((SharedPreferences) ghtVar.J.io(), (vyo) ghtVar.av.io(), (aalm) ghtVar.a.aW.io(), ghtVar.iT, ghtVar.iG, (mbc) ghtVar.l.io());
            case 101:
                ght ghtVar2 = this.a;
                vxz vxzVar = (vxz) ghtVar2.cN.io();
                ghx ghxVar = ghtVar2.a;
                return xwg.j(vxzVar, (aalp) ghxVar.aU.io(), (aals) ghxVar.aV.io());
            case 102:
                ght ghtVar3 = this.a;
                mbc mbcVar = (mbc) ghtVar3.l.io();
                Executor executor = (Executor) ghtVar3.u.io();
                aupr auprVar = ghtVar3.iG;
                wco wcoVar = (wco) ghtVar3.jy.io();
                Optional optionalEmpty = Optional.empty();
                ghx ghxVar2 = ghtVar3.a;
                Optional optionalOf = Optional.of((ahgb) ghxVar2.aR.io());
                Optional optionalEmpty2 = Optional.empty();
                Optional optionalOf2 = Optional.of((kyr) ghxVar2.aT.io());
                Optional optionalEmpty3 = Optional.empty();
                abxv abxvVar2 = (abxv) ghtVar3.iK.io();
                aany aanyVar = (aany) ghtVar3.sh.io();
                aauk aaukVar = (aauk) ghtVar3.iL.io();
                return new aalp(mbcVar, executor, auprVar, wcoVar, optionalEmpty, optionalOf, optionalEmpty2, optionalOf2, optionalEmpty3, abxvVar2, aanyVar, aaukVar);
            case 103:
                ght ghtVar4 = this.a;
                return new ahgb(ghtVar4.md, (wco) ghtVar4.jy.io(), (zwb) ghtVar4.bd.io(), (vxz) ghtVar4.dS.io(), (Executor) ghtVar4.z.io());
            case 104:
                ght ghtVar5 = this.a;
                kyrVar = new kyr(ghtVar5.md, (Executor) ghtVar5.z.io());
                return kyrVar;
            case 105:
                ght ghtVar6 = this.a;
                Executor executor2 = (Executor) ghtVar6.u.io();
                abxv abxvVar3 = (abxv) ghtVar6.iK.io();
                aupr auprVar2 = ghtVar6.iG;
                ghx ghxVar3 = ghtVar6.a;
                agev agevVarI = agev.i((ahgb) ghxVar3.aR.io());
                agev agevVarI2 = agev.i((kyr) ghxVar3.aT.io());
                wco wcoVar2 = (wco) ghtVar6.jy.io();
                agev agevVarI3 = agev.i(28);
                return new aals(executor2, abxvVar3, auprVar2, agevVarI, agevVarI2, wcoVar2, agevVarI3, (aart) ghtVar6.rG.io());
            case 106:
                ght ghtVar7 = this.a;
                kyrVar = new aanm((aann) ghtVar7.tk.io(), (aany) ghtVar7.sh.io());
                return kyrVar;
            case 107:
                return new aacx((ci) this.a.rv.io(), 2);
            case 108:
                ghx ghxVar4 = this.a.a;
                kyrVar = new zzr(ghxVar4.ab(), (grj) ghxVar4.ab.io(), 5);
                return kyrVar;
            case 109:
                ght ghtVar8 = this.a;
                ghx ghxVar5 = ghtVar8.a;
                kyrVar = new hne((aajt) ghxVar5.ae.io(), (grj) ghxVar5.ai.io(), (Executor) ghtVar8.u.io(), (grj) ghxVar5.ab.io(), (isi) ghxVar5.ac.io(), (aajv) ghxVar5.al.io(), (hpk) ghtVar8.nr.io());
                return kyrVar;
            case 110:
                ght ghtVar9 = this.a;
                ghx ghxVar6 = ghtVar9.a;
                kyrVar = new aajp((aajt) ghxVar6.ae.io(), (grj) ghxVar6.ai.io(), (Executor) ghtVar9.u.io(), (grj) ghxVar6.ab.io(), (isi) ghxVar6.ac.io(), (aajv) ghxVar6.al.io(), (aanb) ghtVar9.iG.io());
                return kyrVar;
            case 111:
                ghx ghxVar7 = this.a.a;
                kyrVar = new zzr(ghxVar7.ab(), (grj) ghxVar7.ab.io(), 6);
                return kyrVar;
            case 112:
                ghx ghxVar8 = this.a.a;
                zsqVar = new zsq((aajt) ghxVar8.ae.io(), (grj) ghxVar8.ab.io(), (aajv) ghxVar8.al.io(), 3);
                return zsqVar;
            case 113:
                ght ghtVar10 = this.a;
                abxvVar = new abxv((Context) ghtVar10.v.io(), ghtVar10.aZ, ghtVar10.ca, (mbc) ghtVar10.l.io());
                return abxvVar;
            case 114:
                return new rnj((byte[]) null, (byte[]) null);
            case 115:
                ght ghtVar11 = this.a;
                return aguu.aH(ghtVar11.a.bk, ghtVar11.gK());
            case 116:
                ght ghtVar12 = this.a;
                return new afsi((afrm) ghtVar12.a.bj.io(), (ahrn) ghtVar12.ua.io(), ghtVar12.cD(), (ScheduledExecutorService) ghtVar12.z.io(), ghtVar12.fM(), ghtVar12.ev(), ((Boolean) ghtVar12.ae.io()).booleanValue());
            case 117:
                return new hwf(this.a.a.cW(), bArr);
            case 118:
                ght ghtVar13 = this.a;
                Context context = (Context) ghtVar13.v.io();
                omr omrVarFM = ghtVar13.fM();
                ExecutorService executorService = (ExecutorService) ghtVar13.z.io();
                ahey aheyVar = (ahey) ghtVar13.t.io();
                ahpu ahpuVarFU = ghtVar13.fU();
                int iE = ghtVar13.e();
                Map mapDa = ghtVar13.da();
                ghx ghxVar9 = ghtVar13.a;
                return new afnp(context, omrVarFM, executorService, aheyVar, ahpuVarFU, iE, mapDa, ghxVar9.aw(), aupt.b(), aupt.b(), aupm.b(ghxVar9.bs), ghtVar13.tM);
            case 119:
                ght ghtVar14 = this.a;
                return aewp.P((Context) ghtVar14.v.io(), (ayq) ghtVar14.jl.io());
            case 120:
                return new afle((Executor) this.a.T.io());
            case 121:
                ght ghtVar15 = this.a;
                ahey aheyVar2 = (ahey) ghtVar15.z.io();
                ahey aheyVar3 = (ahey) ghtVar15.T.io();
                ahey aheyVar4 = (ahey) ghtVar15.A.io();
                ghx ghxVar10 = ghtVar15.a;
                return new mcm(aheyVar2, aheyVar3, aheyVar4, Optional.of(Boolean.valueOf(ghxVar10.bK())), Optional.of(Boolean.valueOf(ghxVar10.bV())));
            case 122:
                ghx ghxVar11 = this.a.a;
                return agkz.q((agtz) ghxVar11.bG.io(), (agtz) ghxVar11.bH.io());
            case 123:
                ght ghtVar16 = this.a;
                Context context2 = (Context) ghtVar16.v.io();
                ghx ghxVar12 = ghtVar16.a;
                return afmb.f(context2, ghxVar12.bA.io(), (kje) ghxVar12.bD.io(), (Executor) ghtVar16.t.io(), aupm.b(ghxVar12.bE), aupm.b(ghxVar12.bF));
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new afqs(aupm.b(this.a.a.bz));
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                kyrVar = new abhh(agev.i((abhh) this.a.am.io()), agev.i("youtube-direct"));
                return kyrVar;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return new kjf(this.a.a.bB);
            case 127:
                return new kro();
            case SemanticState.Focused /* 128 */:
                return aguu.az((PackageInfo) this.a.tM.io());
            case 129:
                return ahno.A();
            case 130:
                return new agqj(this.a.cv());
            case 131:
                return geh.j(aupm.b(this.a.a.fA));
            case 132:
                ght ghtVar17 = this.a;
                Application applicationG = ghtVar17.g();
                ghx ghxVar13 = ghtVar17.a;
                return new glb(applicationG, (gkt) ghxVar13.bN.io(), aupm.b(ghtVar17.I), aupm.b(ghtVar17.J), aupm.b(ghxVar13.bP), aupm.b(ghtVar17.xW), (jkg) ghtVar17.st.io(), aupm.b(ghxVar13.bQ), aupm.b(ghxVar13.cC), aupm.b(ghxVar13.cB), aupm.b(ghxVar13.cF), aupm.b(ghxVar13.cI), aupm.b(ghxVar13.cJ), aupm.b(ghxVar13.cL), aupm.b(ghxVar13.dh), aupm.b(ghxVar13.dl), aupm.b(ghxVar13.dm), aupm.b(ghxVar13.dM), aupm.b(ghxVar13.dO), aupm.b(ghxVar13.dQ), aupm.b(ghxVar13.eG), aupm.b(ghtVar17.gz), aupm.b(ghxVar13.eJ), aupm.b(ghxVar13.eK), aupm.b(ghxVar13.eL), aupm.b(ghxVar13.eM), aupm.b(ghxVar13.eQ), aupm.b(ghxVar13.eR), (xir) ghxVar13.bO.io(), aupm.b(ghxVar13.eS), aupm.b(ghxVar13.ft), (avlh) ghxVar13.fv.io(), (tqj) ghtVar17.q.io(), aupm.b(ghxVar13.fx), ghxVar13.fy);
            case 133:
                ght ghtVar18 = this.a;
                ghx ghxVar14 = ghtVar18.a;
                abxvVar = new gkt((aerj) ghxVar14.bL.io(), ghxVar14.bM, (avmb) ghtVar18.dC.io(), (trf) ghtVar18.M.io());
                return abxvVar;
            case 134:
                ght ghtVar19 = this.a;
                aupr auprVar3 = ghtVar19.u;
                aupr auprVar4 = ghtVar19.aC;
                return new aerj(auprVar3, auprVar4, (mbc) ghtVar19.l.io(), new tym(), (tqj) ghtVar19.q.io(), (zhk) ghtVar19.f.io());
            case 135:
                ght ghtVar20 = this.a;
                Context context3 = (Context) ghtVar20.v.io();
                xit xitVar = (xit) ghtVar20.fa.io();
                ghx ghxVar15 = ghtVar20.a;
                return new xki(context3, xitVar, (aerj) ghxVar15.bL.io(), (tre) ghtVar20.Q.io(), ghtVar20.cd, Optional.empty(), (vxz) ghtVar20.dP.io(), (aesp) ghtVar20.zT.io(), (tqj) ghtVar20.q.io(), ghxVar15.bi);
            case 136:
                ght ghtVar21 = this.a;
                return new qkb(ghtVar21.a.aG(), (tqj) ghtVar21.q.io());
            case 137:
                return ((xit) this.a.fa.io()).o(2);
            case 138:
                return new gzj();
            case 139:
                ght ghtVar22 = this.a;
                Application applicationJ = afmb.j(ghtVar22.Gx);
                aunn aunnVarB = aupm.b(ghtVar22.u);
                ghx ghxVar16 = ghtVar22.a;
                return new jan(applicationJ, aunnVarB, aupm.b(ghxVar16.bW), aupm.b(ghxVar16.bX), aupm.b(ghxVar16.bZ), aupm.b(ghxVar16.ca), aupm.b(ghxVar16.cB), (tqj) ghtVar22.q.io());
            case 140:
                ght ghtVar23 = this.a;
                Executor executor3 = (Executor) ghtVar23.u.io();
                aupr auprVar5 = ghtVar23.aq;
                aupr auprVar6 = ghtVar23.aC;
                tqj tqjVar = (tqj) ghtVar23.q.io();
                vxz vxzVar2 = (vxz) ghtVar23.ca.io();
                ghx ghxVar17 = ghtVar23.a;
                return new sxg(executor3, ghxVar17.bR, ghxVar17.bT, ghtVar23.dc, auprVar5, auprVar6, ghxVar17.bU, tqjVar, vxzVar2, Optional.of(ghxVar17.bV));
            case 141:
                return Boolean.valueOf(taq.C((tao) this.a.aq.io()));
            case 142:
                tfo tfoVar = (tfo) this.a.a.bS.io();
                tfoVar.getClass();
                return tfoVar;
            case 143:
                ght ghtVar24 = this.a;
                return new tfo((Context) ghtVar24.v.io(), ghtVar24.N, (wmy) ghtVar24.G.io());
            case 144:
                agev.i(Boolean.TRUE);
                return new aedj();
            case 145:
                return aeff.e();
            case 146:
                ght ghtVar25 = this.a;
                vxz vxzVar3 = (vxz) ghtVar25.dP.io();
                aunn aunnVarB2 = aupm.b(ghtVar25.dT);
                int i2 = adba.a;
                kyrVar = new jbq(vxzVar3, aunnVarB2, 14);
                return kyrVar;
            case 147:
                return new tpp(agkz.p());
            case 148:
                ght ghtVar26 = this.a;
                return new vvm(ghtVar26.dp, (Context) ghtVar26.v.io(), ghtVar26.mq, ghtVar26.zU, ghtVar26.mr, ghtVar26.gT, ghtVar26.jC, ghtVar26.a.bY, ghtVar26.u, (tqj) ghtVar26.q.io());
            case 149:
                ght ghtVar27 = this.a;
                return new xsc(ghtVar27.i(), ghtVar27.m(), (dov) ghtVar27.ft.io());
            case 150:
                ght ghtVar28 = this.a;
                return new zrn((Executor) ghtVar28.u.io(), (tqj) ghtVar28.q.io(), ghtVar28.cg, ghtVar28.ck, ghtVar28.ci, ghtVar28.rf);
            case 151:
                ght ghtVar29 = this.a;
                Application applicationJ2 = afmb.j(ghtVar29.Gx);
                aunn aunnVarB3 = aupm.b(ghtVar29.I);
                aunn aunnVarB4 = aupm.b(ghtVar29.ou);
                ghx ghxVar18 = ghtVar29.a;
                return new zpw(applicationJ2, aunnVarB3, aunnVarB4, aupm.b(ghxVar18.co), aupm.b(ghxVar18.cp), aupm.b(ghtVar29.qY), aupm.b(ghxVar18.cq), aupm.b(ghxVar18.cs), aupm.b(ghxVar18.ca), aupm.b(ghxVar18.bP), aupm.b(ghtVar29.u), aupm.b(ghxVar18.cw), aupm.b(ghxVar18.cf), aupm.b(ghxVar18.cA), ghtVar29.pA);
            case 152:
                ght ghtVar30 = this.a;
                abxvVar = new aeql(ghtVar30.a.cm, (Executor) ghtVar30.B.io(), (ahex) ghtVar30.T.io(), (aerv) ghtVar30.bN.io());
                return abxvVar;
            case 153:
                ght ghtVar31 = this.a;
                ghx ghxVar19 = ghtVar31.a;
                return agkz.u((wfv) ghxVar19.cb.io(), (wfv) ghxVar19.cc.io(), (wfv) ghxVar19.cd.io(), (wfv) ghtVar31.pM.io(), (wfv) ghxVar19.ce.io(), (wfv) ghxVar19.cf.io(), (wfv) ghxVar19.cg.io(), (wfv) ghxVar19.ch.io(), (wfv) ghxVar19.cj.io(), ghxVar19.k(), (wfv) ghxVar19.cl.io());
            case 154:
                return new stk();
            case 155:
                return new waj(this.a.fB, 0);
            case 156:
                return new waj(this.a.mn, 3);
            case 157:
                return new waj((jnm) this.a.cF.io(), 1);
            case 158:
                return new aeqn(this.a.I);
            case 159:
                return new waj((hed) this.a.hD.io(), 2);
            case 160:
                return new abah((abvn) this.a.kp.io());
            case 161:
                ght ghtVar32 = this.a;
                abxvVar = new hcw((syn) ghtVar32.cs.io(), (zwb) ghtVar32.bd.io(), (Context) ghtVar32.v.io(), (Executor) ghtVar32.z.io());
                return abxvVar;
            case 162:
                ght ghtVar33 = this.a;
                abxvVar = new aale((aalm) ghtVar33.a.aW.io(), (vxz) ghtVar33.cN.io(), ghtVar33.iR, ghtVar33.cd);
                return abxvVar;
            case 163:
                ght ghtVar34 = this.a;
                return new zvr((Executor) ghtVar34.u.io(), ghtVar34.hY, aupm.b(ghtVar34.hX), (tao) ghtVar34.aq.io(), ghtVar34.dO, (Context) ghtVar34.v.io());
            case 164:
                ght ghtVar35 = this.a;
                kyrVar = new wjr((Executor) ghtVar35.u.io(), (zvr) ghtVar35.a.co.io());
                return kyrVar;
            case 165:
                ght ghtVar36 = this.a;
                return new aerj((xkd) ghtVar36.pF.io(), ghtVar36.a.cg(), (zho) ghtVar36.hr.io(), (tbt) ghtVar36.I.io(), (tqj) ghtVar36.q.io(), (jnj) ghtVar36.mp.io());
            case 166:
                ght ghtVar37 = this.a;
                return new xds((tqj) ghtVar37.q.io(), ghtVar37.cf, ghtVar37.ch, ghtVar37.aZ, ghtVar37.a.cr, ghtVar37.ii, ghtVar37.ck);
            case 167:
                ght ghtVar38 = this.a;
                return new xdy((vyo) ghtVar38.av.io(), ghtVar38.aZ, ghtVar38.a.aB(), ghtVar38.dO, (abxu) ghtVar38.dG.io(), ghtVar38.bP, ghtVar38.bd, ghtVar38.dJ, (vxz) ghtVar38.ce.io(), (tqj) ghtVar38.q.io());
            case 168:
                ght ghtVar39 = this.a;
                Context context4 = (Context) ghtVar39.v.io();
                vxu vxuVar = (vxu) ghtVar39.at.io();
                ghx ghxVar20 = ghtVar39.a;
                vxp vxpVar = new vxp(context4, vxuVar, ghtVar39.fJ, ghxVar20.cu);
                ghxVar20.cl(vxpVar);
                return vxpVar;
            case 169:
                return taq.O(this.a.a.ct);
            case 170:
                ght ghtVar40 = this.a;
                return new wjr((awmd) ghtVar40.sQ, (tqj) ghtVar40.q.io());
            case 171:
                return geh.l((Context) this.a.v.io());
            case 172:
                ght ghtVar41 = this.a;
                return new iqd((xeu) ghtVar41.aZ.io(), (SharedPreferences) ghtVar41.J.io(), (jkp) ghtVar41.cr.io(), (abww) ghtVar41.cW.io(), (jnm) ghtVar41.a.cx.io(), (Executor) ghtVar41.z.io());
            case 173:
                ght ghtVar42 = this.a;
                return new jnm(ghtVar42.v, ghtVar42.z, ghtVar42.bd, ghtVar42.cs, (byte[]) null);
            case 174:
                ght ghtVar43 = this.a;
                return new aerf(ghtVar43.a.cz, ghtVar43.at, ghtVar43.z, ghtVar43.I, (Context) ghtVar43.v.io());
            case 175:
                return mda.q((Context) this.a.v.io());
            case 176:
                ght ghtVar44 = this.a;
                ghx ghxVar21 = ghtVar44.a;
                kyrVar = new jan(aupm.b(ghxVar21.Y), aupm.b(ghtVar44.be), aupm.b(ghtVar44.bp), aupm.b(ghtVar44.dK), (tqj) ghtVar44.q.io(), aupm.b(ghtVar44.dc), aupm.b(ghxVar21.cD), aupm.b(ghxVar21.cE));
                return kyrVar;
            case 177:
                ght ghtVar45 = this.a;
                kyrVar = new tld(ghtVar45.H, (tqj) ghtVar45.q.io(), (char[]) null);
                return kyrVar;
            case 178:
                ght ghtVar46 = this.a;
                abxvVar = new aaok((awmd) ghtVar46.cd, (awmd) ghtVar46.zV, (mbc) ghtVar46.l.io(), (tqj) ghtVar46.q.io());
                return abxvVar;
            case 179:
                ght ghtVar47 = this.a;
                ghx ghxVar22 = ghtVar47.a;
                zsqVar = new jij(aupm.b(ghxVar22.cG), aupm.b(ghtVar47.I), aupm.b(ghxVar22.cH));
                return zsqVar;
            case 180:
                ght ghtVar48 = this.a;
                return new xxz((abjp) ghtVar48.mf.io(), (iby) ghtVar48.oy.io(), ghtVar48.gm(), (ycp) ghtVar48.kx.io(), ghtVar48.kB, ghtVar48.kC, (hfn) ghtVar48.kD.io(), (aboi) ghtVar48.zW.io(), (tbt) ghtVar48.I.io(), (txp) ghtVar48.aS.io(), (xla) ghtVar48.de.io(), (abmt) ghtVar48.cT.io(), (SecureRandom) ghtVar48.ay.io(), (vxz) ghtVar48.dd.io(), (awku) ghtVar48.mj.io());
            case 181:
                ght ghtVar49 = this.a;
                zsqVar = new hed(aupm.b(ghtVar49.zX), aupm.b(ghtVar49.po), aupm.b(ghtVar49.dA));
                return zsqVar;
            case 182:
                ght ghtVar50 = this.a;
                return new jnj(ghtVar50.g(), aupm.b(ghtVar50.I), aupm.b(ghtVar50.iC), aupm.b(ghtVar50.cc), aupm.b(ghtVar50.at), aupm.b(ghtVar50.q));
            case 183:
                ght ghtVar51 = this.a;
                return new gev(afmb.j(ghtVar51.Gx), aupm.b(ghtVar51.a.cK));
            case 184:
                return new gec();
            case 185:
                ght ghtVar52 = this.a;
                abxvVar = new jnm(afmb.j(ghtVar52.Gx), aupm.b(ghtVar52.xy), aupm.b(ghtVar52.a.dg), (tqj) ghtVar52.q.io());
                return abxvVar;
            case 186:
                ght ghtVar53 = this.a;
                ci ciVarHd = ghtVar53.hd();
                vxz vxzVar4 = (vxz) ghtVar53.cu.io();
                awut awutVar = (awut) ghtVar53.bm.io();
                ghx ghxVar23 = ghtVar53.a;
                return new axfd((awmd) ghxVar23.de, (awmd) ghxVar23.df, ciVarHd, vxzVar4, awutVar);
            case 187:
                ght ghtVar54 = this.a;
                ghx ghxVar24 = ghtVar54.a;
                ghxVar24.cN();
                return new pye((pqg) ghtVar54.yr.io(), (pxv) ghxVar24.da.io(), (awou) ghtVar54.yw.io());
            case 188:
                ght ghtVar55 = this.a;
                return psq.g(aupm.b(ghtVar55.a.cM), (awou) ghtVar55.yu.io());
            case 189:
                ght ghtVar56 = this.a;
                Context context5 = (Context) ghtVar56.v.io();
                awou awouVar = (awou) ghtVar56.yu.io();
                pfz pfzVarE = ghtVar56.E();
                ghtVar56.he();
                return psq.f(context5, awouVar, pfzVarE);
            case 190:
                ght ghtVar57 = this.a;
                ghx ghxVar25 = ghtVar57.a;
                return new pyf((pqp) ghxVar25.dd.io(), (awou) ghtVar57.yw.io(), (omm) ghtVar57.yy.io(), (Context) ghtVar57.v.io(), (pxh) ghtVar57.yo.io(), agev.i(Boolean.TRUE), ((Boolean) ghxVar25.dc.io()).booleanValue(), ghtVar57.yz);
            case 191:
                ght ghtVar58 = this.a;
                agev agevVarI4 = agev.i(ghtVar58.fs());
                ghx ghxVar26 = ghtVar58.a;
                return new pse(agevVarI4, (isi) ghxVar26.cO.io(), ghxVar26.cN(), ghxVar26.G(), (pqm) ghxVar26.cS.io(), (awou) ghtVar58.yw.io(), (omm) ghtVar58.yy.io(), aupm.b(ghxVar26.cT), (pqn) ghxVar26.cX.io(), (ppw) ghxVar26.db.io(), (ppy) ghtVar58.zg.io(), (omr) ghxVar26.cY.io(), aupm.b(ghxVar26.cZ), (mbc) ghtVar58.l.io(), (pls) ghtVar58.yi.io(), ghxVar26.cW, agev.i(ghxVar26.l()), (pqg) ghtVar58.yr.io(), (Context) ghtVar58.v.io(), (pwf) ghtVar58.yj.io(), agev.i(ghxVar26.l()), ghxVar26.cK(), ghtVar58.yz, ghxVar26.dc);
            case 192:
                ght ghtVar59 = this.a;
                return new isi(ghtVar59.a.cN(), (awou) ghtVar59.yw.io());
            case 193:
                ght ghtVar60 = this.a;
                return new pwz((Context) ghtVar60.v.io(), (pls) ghtVar60.yi.io(), agdf.b(), agev.i(ghtVar60.fs()), ghtVar60.L(), (ahex) ghtVar60.yg.io(), ghtVar60.yz, (pwf) ghtVar60.yj.io());
            case 194:
                ght ghtVar61 = this.a;
                return new pqu((Context) ghtVar61.v.io(), aupm.b(ghtVar61.a.cR), (pqg) ghtVar61.yr.io(), (awou) ghtVar61.yh.io(), (awou) ghtVar61.yu.io());
            case 195:
                ght ghtVar62 = this.a;
                Context context6 = (Context) ghtVar62.v.io();
                awut awutVarDM = ghtVar62.dM();
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar62.a.cQ.io();
                pxh pxhVar = (pxh) ghtVar62.yo.io();
                pfz pfzVarE2 = ghtVar62.E();
                ghtVar62.he();
                return psq.d(context6, awutVarDM, sharedPreferences, pxhVar, pfzVarE2);
            case 196:
                ght ghtVar63 = this.a;
                Context context7 = (Context) ghtVar63.v.io();
                ghtVar63.he();
                return psq.c(context7);
            case 197:
                ght ghtVar64 = this.a;
                return psq.m(aupm.b(ghtVar64.a.cR), (awou) ghtVar64.yu.io());
            case 198:
                ght ghtVar65 = this.a;
                ghx ghxVar27 = ghtVar65.a;
                return new pra(ghxVar27.H(), ghxVar27.cN(), (omm) ghtVar65.yy.io(), aupm.b(ghxVar27.cT), (awou) ghtVar65.yh.io(), (awou) ghtVar65.yw.io(), agev.i(ghxVar27.l()), (pls) ghtVar65.yi.io(), (pwf) ghtVar65.yj.io(), (Context) ghtVar65.v.io(), (mbc) ghtVar65.l.io(), agev.i(ghxVar27.cV()), ghxVar27.cK(), ghxVar27.cW);
            case 199:
                ght ghtVar66 = this.a;
                return new poa((Context) ghtVar66.v.io(), (kjc) ghtVar66.yL.io(), (pxh) ghtVar66.yo.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        Object pobVar;
        Object psmVar;
        Object aackVar;
        int i = this.b;
        switch (i) {
            case 200:
                ght ghtVar = this.a;
                pobVar = new pob((mbc) ghtVar.l.io(), (pls) ghtVar.yi.io(), ghtVar.eG(), (pun) ghtVar.yB.io(), (pwl) ghtVar.a.cP.io());
                return pobVar;
            case 201:
                return nyr.m(this.a.cL());
            case 202:
                ght ghtVar2 = this.a;
                ghx ghxVar = ghtVar2.a;
                psmVar = new psm((pqn) ghxVar.cX.io(), (pve) ghtVar2.yF.io(), (awou) ghtVar2.yw.io(), (omr) ghxVar.cY.io(), (omm) ghtVar2.yy.io(), ghxVar.G(), agev.i(ghxVar.l()), (pwf) ghtVar2.yj.io(), (Context) ghtVar2.v.io(), (psz) ghxVar.cZ.io(), (pqg) ghtVar2.yr.io(), (pqm) ghxVar.cS.io(), (ppy) ghtVar2.zg.io(), ghxVar.F(), (pls) ghtVar2.yi.io(), ghxVar.cK());
                return psmVar;
            case 203:
                ght ghtVar3 = this.a;
                return new omr(ghtVar3.a.cN(), (awou) ghtVar3.yw.io());
            case 204:
                return new psz(agev.i(this.a.gG()));
            case 205:
                return Boolean.TRUE;
            case 206:
                return new ijt((pxv) this.a.a.da.io());
            case 207:
                ght ghtVar4 = this.a;
                ghx ghxVar2 = ghtVar4.a;
                return new aerj(aupm.b(ghxVar2.di), aupm.b(ghxVar2.ac), aupm.b(ghxVar2.ae), aupm.b(ghxVar2.dk), aupm.b(ghtVar4.me), aupm.b(ghtVar4.mb), aupm.b(ghtVar4.iD));
            case 208:
                ght ghtVar5 = this.a;
                pobVar = new hno((Context) ghtVar5.v.io(), (tbt) ghtVar5.I.io(), (zwb) ghtVar5.bd.io(), (hnq) ghtVar5.ct.io(), (aanb) ghtVar5.iG.io(), (jnm) ghtVar5.cF.io(), (SharedPreferences) ghtVar5.J.io(), (Executor) ghtVar5.z.io(), (hnz) ghtVar5.a.aM.io(), (aacm) ghtVar5.sz.io(), (huf) ghtVar5.sx.io(), (aany) ghtVar5.sh.io(), (syn) ghtVar5.cs.io(), (vxz) ghtVar5.cu.io(), (vxz) ghtVar5.et.io(), (hef) ghtVar5.zZ.io());
                return pobVar;
            case 209:
                ght ghtVar6 = this.a;
                aackVar = new aack(ghtVar6.sh, ghtVar6.iG, ghtVar6.a.dj, ghtVar6.cd);
                return aackVar;
            case 210:
                ght ghtVar7 = this.a;
                psmVar = new aaop((aany) ghtVar7.sh.io(), (mbc) ghtVar7.l.io(), ghtVar7.bR());
                return psmVar;
            case 211:
                ght ghtVar8 = this.a;
                pobVar = new jan(aupm.b(ghtVar8.v), aupm.b(ghtVar8.cF), aupm.b(ghtVar8.iG), aupm.b(ghtVar8.sz), aupm.b(ghtVar8.iR), aupm.b(ghtVar8.ct), aupm.b(ghtVar8.cs), aupm.b(ghtVar8.bd));
                return pobVar;
            case 212:
                ght ghtVar9 = this.a;
                ghx ghxVar3 = ghtVar9.a;
                return new gli(aupm.b(ghxVar3.dn), aupm.b(ghxVar3.f15do), aupm.b(ghtVar9.pg), aupm.b(ghxVar3.dx), aupm.b(ghtVar9.Af), aupm.b(ghxVar3.dy), aupm.b(ghxVar3.dz), aupm.b(ghxVar3.dA), aupm.b(ghxVar3.dC), aupm.b(ghtVar9.cH), aupm.b(ghtVar9.Ah), aupm.b(ghtVar9.Ae), aupm.b(ghtVar9.kB), aupm.b(ghxVar3.dD), aupm.b(ghxVar3.dE), aupm.b(ghxVar3.dG), aupm.b(ghxVar3.dH), aupm.b(ghtVar9.At), aupm.b(ghtVar9.Au), aupm.b(ghtVar9.lH), aupm.b(ghxVar3.dI), aupm.b(ghtVar9.mo), aupm.b(ghtVar9.mn), aupm.b(ghtVar9.on), aupm.b(ghxVar3.dK), aupm.b(ghxVar3.dL), aupm.b(ghtVar9.Ax), aupm.b(ghtVar9.kt), (tqj) ghtVar9.q.io(), ((Integer) ghtVar9.oi.io()).intValue());
            case 213:
                ght ghtVar10 = this.a;
                abvk abvkVar = (abvk) ghtVar10.kB.io();
                ghtVar10.aK();
                aackVar = new aack(abvkVar, (abvn) ghtVar10.cH.io(), (hwz) ghtVar10.jH.io(), (kro) ghtVar10.ou.io());
                return aackVar;
            case 214:
                ght ghtVar11 = this.a;
                pobVar = new ibn((abjp) ghtVar11.mf.io(), ghtVar11.cH, (hwz) ghtVar11.jH.io(), (jkp) ghtVar11.cr.io(), (jnm) ghtVar11.cF.io(), (xeu) ghtVar11.aZ.io(), (jnj) ghtVar11.mp.io(), (hzi) ghtVar11.nw.io(), (avmb) ghtVar11.dA.io(), (ire) ghtVar11.Aa.io());
                return pobVar;
            case 215:
                ght ghtVar12 = this.a;
                Context context = (Context) ghtVar12.v.io();
                acdq acdqVar = (acdq) ghtVar12.oh.io();
                ghx ghxVar4 = ghtVar12.a;
                pobVar = new ihr(context, acdqVar, (avlh) ghxVar4.dp.io(), ghtVar12.bX(), (ihs) ghxVar4.dq.io(), (xgn) ghtVar12.Ac.io(), (abea) ghtVar12.kt.io(), agkz.s(MusicWidgetProvider.class, FreeformMusicWidgetProvider.class, NowPlayingWidgetProvider.class, FlipWidgetProvider.class), ghxVar4.az(), (iir) ghtVar12.mx.io(), (iio) ghxVar4.dw.io(), (Executor) ghtVar12.u.io(), (avmb) ghtVar12.dE.io());
                return pobVar;
            case ModuleDescriptor.MODULE_VERSION /* 216 */:
                return ((idk) this.a.oj.io()).h();
            case 217:
                return new ihs(this.a.er());
            case 218:
                return new ihd(this.a.a.o());
            case 219:
                ght ghtVar13 = this.a;
                return new iwm((vxz) ghtVar13.aw.io(), (vxz) ghtVar13.ga.io());
            case 220:
                return new iic(this.a.a.o());
            case 221:
                return new iim(this.a.a.o());
            case 222:
                ghx ghxVar5 = this.a.a;
                return new ihy(ghxVar5.o(), (iim) ghxVar5.du.io());
            case 223:
                ght ghtVar14 = this.a;
                aackVar = new iio((hwv) ghtVar14.nW.io(), aupm.b(ghtVar14.og), aupm.b(ghtVar14.Ae), (Executor) ghtVar14.B.io());
                return aackVar;
            case 224:
                ght ghtVar15 = this.a;
                return new hwt((abvc) ghtVar15.kC.io(), (aawa) ghtVar15.gU.io());
            case 225:
                ght ghtVar16 = this.a;
                pobVar = new hvs((SharedPreferences) ghtVar16.J.io(), (tfq) ghtVar16.cd.io(), ghtVar16.kB, (avlh) ghtVar16.gD.io(), (jnm) ghtVar16.cF.io());
                return pobVar;
            case 226:
                ght ghtVar17 = this.a;
                aupr auprVar = ghtVar17.oh;
                aupr auprVar2 = ghtVar17.mf;
                aupr auprVar3 = ghtVar17.pg;
                aupr auprVar4 = ghtVar17.kx;
                Context context2 = (Context) ghtVar17.v.io();
                avlh avlhVar = (avlh) ghtVar17.Ag.io();
                aupr auprVar5 = ghtVar17.cr;
                avlh avlhVarBX = ghtVar17.bX();
                jkp jkpVar = (jkp) auprVar5.io();
                pobVar = new hgd(auprVar, auprVar2, auprVar3, auprVar4, context2, avlhVar, avlhVarBX, jkpVar, (jnj) ghtVar17.mp.io(), (vxz) ghtVar17.cv.io(), (avmb) ghtVar17.dA.io());
                return pobVar;
            case 227:
                ght ghtVar18 = this.a;
                ghx ghxVar6 = ghtVar18.a;
                aupr auprVar6 = ghtVar18.oj;
                aupr auprVar7 = ghtVar18.om;
                avlh avlhVar2 = (avlh) ghxVar6.dB.io();
                aupr auprVar8 = ghtVar18.cu;
                return new aerj(auprVar6, auprVar7, avlhVar2, ghtVar18.bX(), aupm.b(ghtVar18.cH), (vxz) auprVar8.io(), (avmb) ghtVar18.dA.io());
            case 228:
                return ((ied) this.a.op.io()).a();
            case 229:
                ght ghtVar19 = this.a;
                return aaux.u((zjk) ghtVar19.hg.io(), (ci) ghtVar19.cG.io());
            case 230:
                ght ghtVar20 = this.a;
                vxu vxuVar = (vxu) ghtVar20.at.io();
                hed hedVarGB = ghtVar20.gB();
                pobVar = new yen(vxuVar, hedVarGB, aupm.b(ghtVar20.hO), ghtVar20.at(), (yfo) ghtVar20.hS.io(), (yha) ghtVar20.hn.io(), ghtVar20.ho, (xeu) ghtVar20.aZ.io(), (mbc) ghtVar20.l.io(), (zjr) ghtVar20.gI.io(), (afho) ghtVar20.ac.io(), (ahey) ghtVar20.aC.io(), (ahey) ghtVar20.T.io());
                return pobVar;
            case 231:
                ght ghtVar21 = this.a;
                pobVar = new jnj((abvn) ghtVar21.cH.io(), (avlh) ghtVar21.ol.io(), (avlh) ghtVar21.a.dF.io(), (avmb) ghtVar21.dA.io(), (vwx) ghtVar21.mA.io(), (jnj) ghtVar21.mp.io());
                return pobVar;
            case 232:
                return ((awku) this.a.mm.io()).P();
            case 233:
                ght ghtVar22 = this.a;
                acdq acdqVar2 = (acdq) ghtVar22.oh.io();
                hzt hztVar = (hzt) ghtVar22.Aj.io();
                hzt hztVar2 = (hzt) ghtVar22.Ak.io();
                hzt hztVar3 = (hzt) ghtVar22.Al.io();
                ghx ghxVar7 = ghtVar22.a;
                pobVar = new hzs(acdqVar2, hztVar, hztVar2, hztVar3, ghxVar7.cD(), ghxVar7.n(), (List) ghtVar22.Am.io(), aupm.b(ghtVar22.As));
                return pobVar;
            case 234:
                ght ghtVar23 = this.a;
                return new ayq(aupm.b(ghtVar23.cH), (avmb) ghtVar23.dE.io());
            case 235:
                ght ghtVar24 = this.a;
                pobVar = new abib((zwb) ghtVar24.bd.io(), (vxz) ghtVar24.cN.io(), (wco) ghtVar24.jy.io(), (wbz) ghtVar24.es.io(), ghtVar24.a.ac(), (Executor) ghtVar24.u.io(), (ahbw) ghtVar24.cx.io(), (tbt) ghtVar24.I.io());
                return pobVar;
            case 236:
                ght ghtVar25 = this.a;
                psmVar = new abhy((zwb) ghtVar25.bd.io(), (wco) ghtVar25.jy.io(), (avmb) ghtVar25.dC.io());
                return psmVar;
            case 237:
                ght ghtVar26 = this.a;
                return new hwz((heg) ghtVar26.nz.io(), (acgj) ghtVar26.Av.io());
            case 238:
                pobVar = new dov(aupm.b(this.a.a.dN), (byte[]) null);
                return pobVar;
            case 239:
                ght ghtVar27 = this.a;
                return new ite(ghtVar27.cc, ghtVar27.a.au);
            case 240:
                ght ghtVar28 = this.a;
                return new gev(aupm.b(ghtVar28.at), aupm.b(ghtVar28.a.dP));
            case 241:
                return new rrp(this.a.gh);
            case 242:
                ght ghtVar29 = this.a;
                afmb.j(ghtVar29.Gx);
                ghx ghxVar8 = ghtVar29.a;
                return new jnj(ghxVar8.dR, aupm.b(ghxVar8.dS), aupm.b(ghxVar8.eF), aupm.b(ghxVar8.es), ghtVar29.aZ, aupm.b(ghxVar8.bg));
            case 243:
                ght ghtVar30 = this.a;
                Context context3 = (Context) ghtVar30.v.io();
                aupr auprVar9 = ghtVar30.up;
                mbc mbcVar = (mbc) ghtVar30.l.io();
                tbt tbtVar = (tbt) ghtVar30.I.io();
                aupr auprVar10 = ghtVar30.ca;
                pobVar = new aepm(context3, auprVar9, mbcVar, tbtVar, ghtVar30.cd, ghtVar30.hZ, ghtVar30.eU, (vxz) auprVar10.io());
                return pobVar;
            case 244:
                return new kro();
            case 245:
                ght ghtVar31 = this.a;
                aetb aetbVar = (aetb) ghtVar31.uw.io();
                ghx ghxVar9 = ghtVar31.a;
                aerj aerjVar = (aerj) ghxVar9.es.io();
                tqj tqjVar = (tqj) ghtVar31.q.io();
                aupr auprVar11 = ghtVar31.aZ;
                aupr auprVar12 = ghxVar9.ew;
                aupr auprVar13 = ghxVar9.et;
                aupr auprVar14 = ghxVar9.ez;
                Optional.of(ghxVar9.eB);
                pobVar = new aepg(aetbVar, aerjVar, tqjVar, auprVar11, auprVar12, auprVar13, auprVar14, ghxVar9.eC, ghxVar9.er, (vxz) ghtVar31.ca.io(), ghxVar9.eD, ghxVar9.eE, ghtVar31.F);
                return pobVar;
            case 246:
                ght ghtVar32 = this.a;
                aess aessVar = (aess) ghtVar32.E.io();
                ghx ghxVar10 = ghtVar32.a;
                pobVar = new aerj(aessVar, ghxVar10.dU, ghxVar10.dW, ghxVar10.ea, ghtVar32.ur, ghxVar10.ef, ghxVar10.er);
                return pobVar;
            case 247:
                ght ghtVar33 = this.a;
                return new aesh((aess) ghtVar33.E.io(), (ahqj) ghtVar33.a.dT.io());
            case 248:
                return new ahqj((aess) this.a.E.io());
            case 249:
                ght ghtVar34 = this.a;
                pobVar = new aesk((aess) ghtVar34.E.io(), (aesb) ghtVar34.a.dV.io(), (tqj) ghtVar34.q.io(), ghtVar34.T, ghtVar34.aC);
                return pobVar;
            case 250:
                ght ghtVar35 = this.a;
                return new aesb((aess) ghtVar35.E.io(), ghtVar35.aZ);
            case 251:
                ght ghtVar36 = this.a;
                aackVar = new aesn((aess) ghtVar36.E.io(), (aesc) ghtVar36.a.dZ.io(), (tqj) ghtVar36.q.io(), ghtVar36.uk);
                return aackVar;
            case 252:
                ght ghtVar37 = this.a;
                pobVar = new aesc((aess) ghtVar37.E.io(), ghtVar37.aZ, (tqj) ghtVar37.q.io(), ghtVar37.a.dY, ghtVar37.ck);
                return pobVar;
            case 253:
                ght ghtVar38 = this.a;
                aupr auprVar15 = ghtVar38.a.dX;
                return new ahtv((awmd) auprVar15, (awmd) ghtVar38.ca);
            case 254:
                return ((tre) this.a.Q.io()).b();
            case 255:
                return new NativeCrashDetectorUtil();
            case SemanticState.Hidden /* 256 */:
                ghx ghxVar11 = this.a.a;
                psmVar = new abhh((Object) ghxVar11.ed, (Object) ghxVar11.ee, (byte[]) null);
                return psmVar;
            case 257:
                ght ghtVar39 = this.a;
                vxu vxuVar2 = (vxu) ghtVar39.at.io();
                ghx ghxVar12 = ghtVar39.a;
                return new jij(vxuVar2, (hhb) ghxVar12.ec.io());
            case 258:
                return new gzj();
            case 259:
                return new hhb(this);
            case 260:
                pobVar = new ahub(this.a.a.dX, (byte[]) null);
                return pobVar;
            case 261:
                ght ghtVar40 = this.a;
                tqj tqjVar2 = (tqj) ghtVar40.q.io();
                ghx ghxVar13 = ghtVar40.a;
                pobVar = new aerj(tqjVar2, ghxVar13.eq, ghtVar40.uy, (aess) ghtVar40.E.io(), ghtVar40.aZ, ghxVar13.dY, ghtVar40.ij);
                return pobVar;
            case 262:
                qck qckVar = (qck) this.a.a.ep.io();
                pox.m(qckVar);
                return qckVar;
            case 263:
                ght ghtVar41 = this.a;
                return qnl.G(ghtVar41.a.eo, ghtVar41.uN);
            case 264:
                ght ghtVar42 = this.a;
                qcs qcsVar = (qcs) ghtVar42.uJ.io();
                aupr auprVar16 = ghtVar42.xj;
                aupr auprVar17 = ghtVar42.wz;
                aupr auprVar18 = ghtVar42.xc;
                aupr auprVar19 = ghtVar42.a.eh;
                ghtVar42.gn();
                pobVar = new qcm(qcsVar, auprVar16, auprVar17, auprVar18, auprVar18, auprVar19);
                return pobVar;
            case 265:
                ght ghtVar43 = this.a;
                agev.i(ghtVar43.vR);
                return psq.q(ghtVar43.vZ);
            case 266:
                ght ghtVar44 = this.a;
                agev.i(ghtVar44.wa);
                return psq.i(ghtVar44.wc);
            case 267:
                ght ghtVar45 = this.a;
                return new qgp();
            case 268:
                return psq.h(agdf.b());
            case 269:
                ght ghtVar46 = this.a;
                agev.i(ghtVar46.wB);
                return psq.j(ghtVar46.wF);
            case 270:
                return psq.p(this.a.wM);
            case 271:
                ght ghtVar47 = this.a;
                agev.i(ghtVar47.wN);
                return psq.o(ghtVar47.wQ);
            case 272:
                ght ghtVar48 = this.a;
                agev.i(ghtVar48.vk);
                return psq.n(ghtVar48.wT);
            case 273:
                ght ghtVar49 = this.a;
                agev.i(ghtVar49.wN);
                return psq.k(ghtVar49.wQ);
            case 274:
                ght ghtVar50 = this.a;
                ghx ghxVar14 = ghtVar50.a;
                return new afxw(ghtVar50.vj, ghxVar14.ei, ghxVar14.ej, ghxVar14.el, ghxVar14.em, ghxVar14.en);
            case 275:
                return agev.i((nre) this.a.a.ek.io());
            case 276:
                return new nre();
            case 277:
                return new nre();
            case 278:
                return Boolean.valueOf(qnl.F((Context) this.a.v.io()));
            case 279:
                ght ghtVar51 = this.a;
                Context context4 = (Context) ghtVar51.v.io();
                aetb aetbVar2 = (aetb) ghtVar51.uw.io();
                ghx ghxVar15 = ghtVar51.a;
                return adib.l(context4, aetbVar2, (aery) ghxVar15.et.io(), ghxVar15.ev.io(), (vxz) ghtVar51.ca.io(), ghtVar51.up);
            case 280:
                ght ghtVar52 = this.a;
                return new aery((Context) ghtVar52.v.io(), (wmy) ghtVar52.G.io());
            case 281:
                ght ghtVar53 = this.a;
                Context context5 = (Context) ghtVar53.v.io();
                mbc mbcVar2 = (mbc) ghtVar53.l.io();
                ghx ghxVar16 = ghtVar53.a;
                return adib.k(context5, mbcVar2, ghxVar16.eu.io(), (xeu) ghtVar53.aZ.io(), (aery) ghxVar16.et.io(), (aetb) ghtVar53.uw.io(), (tqj) ghtVar53.q.io());
            case 282:
                return new aerz((Context) this.a.v.io());
            case 283:
                ght ghtVar54 = this.a;
                Application applicationG = ghtVar54.g();
                tbt tbtVar2 = (tbt) ghtVar54.I.io();
                mbc mbcVar3 = (mbc) ghtVar54.l.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar54.u.io();
                ahey aheyVar = (ahey) ghtVar54.u.io();
                tqj tqjVar3 = (tqj) ghtVar54.q.io();
                vxz vxzVar = (vxz) ghtVar54.ca.io();
                ghx ghxVar17 = ghtVar54.a;
                pobVar = new aera(applicationG, tbtVar2, mbcVar3, scheduledExecutorService, aheyVar, tqjVar3, vxzVar, ghtVar54.up, ghxVar17.ey, ghxVar17.ex, ghtVar54.uy, ghtVar54.ux, ghtVar54.hF, ghtVar54.F);
                return pobVar;
            case 284:
                ght ghtVar55 = this.a;
                return new aerb((Context) ghtVar55.v.io(), ghtVar55.a.ex, ghtVar55.rb, ghtVar55.at);
            case 285:
                return new aeod(this.a.up);
            case 286:
                return rsb.f((bog) this.a.a.eA.io());
            case 287:
                return new tdx();
            case 288:
                ght ghtVar56 = this.a;
                pobVar = new aesp((Context) ghtVar56.v.io(), (vxz) ghtVar56.ca.io(), ghtVar56.aZ, ghtVar56.up, ghtVar56.uj, (avmb) ghtVar56.dC.io(), ghtVar56.ij, (tqj) ghtVar56.q.io());
                return pobVar;
            case 289:
                ght ghtVar57 = this.a;
                pobVar = new aesx((Context) ghtVar57.v.io(), (mbc) ghtVar57.l.io(), (Executor) ghtVar57.u.io(), (vxz) ghtVar57.ca.io(), ghtVar57.up, ghtVar57.cd, ghtVar57.aZ);
                return pobVar;
            case 290:
                ght ghtVar58 = this.a;
                return new aerq((Context) ghtVar58.v.io(), (Executor) ghtVar58.u.io(), (vxz) ghtVar58.ca.io(), (aerv) ghtVar58.bN.io());
            case 291:
                ght ghtVar59 = this.a;
                ghx ghxVar18 = ghtVar59.a;
                psmVar = new jij((hed) ghxVar18.eH.io(), (hed) ghxVar18.eI.io(), (vxz) ghtVar59.km.io());
                return psmVar;
            case 292:
                return new hed(this.a.g(), NowPlayingWidgetProvider.class);
            case 293:
                return new hed(this.a.g(), FlipWidgetProvider.class);
            case 294:
                ght ghtVar60 = this.a;
                return new gev((Object) aupm.b(ghtVar60.v), (Object) aupm.b(ghtVar60.u));
            case 295:
                return new dov(aupm.b(this.a.v));
            case 296:
                pobVar = new dov(aupm.b(this.a.nn), (byte[]) null);
                return pobVar;
            case 297:
                pobVar = new dov(aupm.b(this.a.a.eP), (byte[]) null);
                return pobVar;
            case 298:
                ght ghtVar61 = this.a;
                pobVar = new rrq((mbc) ghtVar61.l.io(), (rrh) ghtVar61.gh.io(), (xeu) ghtVar61.aZ.io(), ghtVar61.eR(), (rrt) ghtVar61.a.eO.io(), (aepv) ghtVar61.up.io(), (avmb) ghtVar61.dC.io(), (ScheduledExecutorService) ghtVar61.u.io());
                return pobVar;
            case 299:
                ght ghtVar62 = this.a;
                return new rrt(ghtVar62.eR(), (avlh) ghtVar62.a.eN.io(), (avlh) ghtVar62.gi.io(), (avlh) ghtVar62.gD.io(), (mbc) ghtVar62.l.io(), (tfq) ghtVar62.cd.io(), (avmb) ghtVar62.dC.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        Object glhVar;
        Object abxuVar;
        Object tqmVar;
        int i = this.b;
        switch (i) {
            case 300:
                return sxh.n((toj) this.a.aK.io());
            case 301:
                ght ghtVar = this.a;
                tqj tqjVar = (tqj) ghtVar.q.io();
                oml omlVarCQ = ghtVar.a.cQ();
                return new trn(tqjVar, omlVarCQ);
            case 302:
                ght ghtVar2 = this.a;
                glhVar = new glh((avlh) ghtVar2.jG.io(), aupm.b(ghtVar2.qR), aupm.b(ghtVar2.cd), (avmb) ghtVar2.dC.io());
                return glhVar;
            case 303:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                ghx ghxVar = ghtVar3.a;
                return new jnm(context, ghtVar3.kk, ghxVar.eU, ghxVar.fs, ghtVar3.dP);
            case 304:
                ght ghtVar4 = this.a;
                abxuVar = new abxu(ghtVar4.v, ghtVar4.a.eT, ghtVar4.ce, ghtVar4.q, ghtVar4.jR, ghtVar4.ra);
                return abxuVar;
            case 305:
                return Optional.of((nuc) this.a.dU.io());
            case 306:
                ghx ghxVar2 = this.a.a;
                Optional.empty();
                return acgz.l((mew) ghxVar2.eZ.io(), (aga) ghxVar2.ff.io(), (aga) ghxVar2.fh.io(), (ComponentConfig) ghxVar2.fj.io(), (ComponentSharedResources) ghxVar2.fl.io(), (opq) ghxVar2.fm.io(), (adgf) ghxVar2.fq.io(), ghxVar2.fr);
            case 307:
                return adbc.l((ahey) this.a.u.io(), Optional.empty());
            case 308:
                nuc nucVar = (nuc) this.a.dU.io();
                int i2 = adgg.a;
                return new adgh(nucVar);
            case 309:
                return adbc.s();
            case 310:
                ghx ghxVar3 = this.a.a;
                return adbc.o((oui) ghxVar3.eW.io(), ghxVar3.aF());
            case 311:
                ght ghtVar5 = this.a;
                return adbc.q((vxz) ghtVar5.dP.io(), (vxz) ghtVar5.ra.io(), (vxz) ghtVar5.jP.io());
            case 312:
                ght ghtVar6 = this.a;
                Context context2 = (Context) ghtVar6.v.io();
                ghx ghxVar4 = ghtVar6.a;
                return adib.v(context2, (mew) ghxVar4.eZ.io(), (owu) ghxVar4.fb.io(), (oxn) ghxVar4.fc.io(), (oui) ghxVar4.eW.io(), (kjc) ghxVar4.fa.io(), ghxVar4.aI(), (syn) ghxVar4.fe.io());
            case 313:
                ghx ghxVar5 = this.a.a;
                return adbc.u((mew) ghxVar5.eZ.io(), ghxVar5.t(), (oui) ghxVar5.eW.io(), (kjc) ghxVar5.fa.io());
            case 314:
                return adbc.t(agkz.p());
            case 315:
                return adbc.n((vxz) this.a.dP.io());
            case 316:
                return adbc.v(new org(), new qnl(), agkz.p(), (kjc) this.a.a.fd.io());
            case 317:
                return new kjc(aupm.b(this.a.nj), (byte[]) null);
            case 318:
                return adbc.p(this.a.a.aH());
            case 319:
                int i3 = adgg.a;
                return new adef();
            case 320:
                ComponentConfig componentConfig = (ComponentConfig) this.a.a.fi.io();
                adbc.m(componentConfig);
                return componentConfig;
            case 321:
                return adbc.b((vxz) this.a.dP.io());
            case 322:
                ght ghtVar7 = this.a;
                agev agevVarI = agev.i((Boolean) ghtVar7.eA.io());
                ghx ghxVar6 = ghtVar7.a;
                return mda.f(agevVarI, agkj.i(), ghxVar6.al(), agev.i(ghxVar6.s()));
            case 323:
                ght ghtVar8 = this.a;
                aupr auprVar = ghtVar8.eJ;
                agev agevVarI2 = agev.i((Boolean) ghtVar8.ed.io());
                ghx ghxVar7 = ghtVar8.a;
                return idj.l(auprVar, agevVarI2, ghtVar8.ee, agev.i(Integer.valueOf(ghxVar7.d())), agev.i(Integer.valueOf(ghxVar7.g())), agev.i(Boolean.valueOf(ghtVar8.el())), agev.i(Boolean.valueOf(ghtVar8.em())), agev.i(ghtVar8.fU), agev.i(ghtVar8.ff), agev.i(Boolean.valueOf(ghxVar7.bw())), agev.i(ghtVar8.fS), agev.i(ghtVar8.fR), agev.i(Boolean.valueOf(ghtVar8.ed())), agev.i(Boolean.valueOf(ghxVar7.bQ())), agev.i(Boolean.valueOf(ghxVar7.bP())), agev.i(Boolean.valueOf(ghxVar7.bo())));
            case 324:
                return adbc.k((Context) this.a.v.io());
            case 325:
                ghx ghxVar8 = this.a.a;
                Optional optionalEmpty = Optional.empty();
                aupr auprVar2 = ghxVar8.fp;
                int i4 = adgg.a;
                abxuVar = new adgf(auprVar2, optionalEmpty);
                return abxuVar;
            case 326:
                ght ghtVar9 = this.a;
                ghx ghxVar9 = ghtVar9.a;
                return acgz.r((grj) ghxVar9.fn.io(), (ahey) ghtVar9.z.io(), (mbc) ghtVar9.l.io(), (adga) ghxVar9.fo.io());
            case 327:
                nzw nzwVar = (nzw) this.a.fd.io();
                int i5 = adgg.a;
                return new grj(nzwVar);
            case 328:
                wmy wmyVar = (wmy) this.a.G.io();
                int i6 = adgg.a;
                return new adga(wmyVar);
            case 329:
                int i7 = adgg.a;
                return new ReaperThreadJniWrapper();
            case 330:
                return gly.d((awkv) this.a.a.fu.io());
            case 331:
                return gly.e();
            case 332:
                ght ghtVar10 = this.a;
                abxuVar = new gev(aupm.b(ghtVar10.a.fw), (tqj) ghtVar10.q.io());
                return abxuVar;
            case 333:
                return new adom((awut) this.a.bm.io());
            case 334:
                ght ghtVar11 = this.a;
                return new tea((teq) ghtVar11.eO.io(), ghtVar11.eL, (mbc) ghtVar11.l.io(), (ahey) ghtVar11.t.io(), (avmb) ghtVar11.dC.io(), (avmb) ghtVar11.dA.io(), (oml) ghtVar11.F.io(), (rnj) ghtVar11.so.io());
            case 335:
                ght ghtVar12 = this.a;
                tqj tqjVar2 = (tqj) ghtVar12.q.io();
                ghx ghxVar10 = ghtVar12.a;
                return geh.k(tqjVar2, ghxVar10.fE, ghxVar10.fF);
            case 336:
                ght ghtVar13 = this.a;
                return new vxt(ghtVar13.sQ, (Executor) ghtVar13.u.io(), (vxr) ghtVar13.a.fD.io());
            case 337:
                return new vxr(this.a.a.fC);
            case 338:
                ght ghtVar14 = this.a;
                return tym.aE((Context) ghtVar14.v.io(), (ahex) ghtVar14.u.io(), (ahex) ghtVar14.T.io(), (tqj) ghtVar14.q.io(), ght.eF(), (rrq) ghtVar14.bh.io(), Optional.empty());
            case 339:
                ght ghtVar15 = this.a;
                tqmVar = new tqm((tqj) ghtVar15.q.io(), (tqv) ghtVar15.w.io(), ghtVar15.a.dX);
                return tqmVar;
            case 340:
                ght ghtVar16 = this.a;
                abxuVar = new ahgb(ghtVar16.gS, ghtVar16.rB, ghtVar16.a.fH, ghtVar16.u, (tqj) ghtVar16.q.io());
                return abxuVar;
            case 341:
                ght ghtVar17 = this.a;
                glhVar = new aeqx((vxz) ghtVar17.ca.io(), ghtVar17.aZ, ghtVar17.eU, (Executor) ghtVar17.u.io());
                return glhVar;
            case 342:
                return new kro();
            case 343:
                return new kro();
            case 344:
                ght ghtVar18 = this.a;
                tqmVar = new isi(ghtVar18.a.dj(), (zjr) ghtVar18.gI.io(), (ahey) ghtVar18.du.io());
                return tqmVar;
            case 345:
                ght ghtVar19 = this.a;
                return new abbd((Context) ghtVar19.v.io(), (tbt) ghtVar19.I.io(), (abnc) ghtVar19.hA.io(), ghtVar19.a.fL, (ahud) ghtVar19.iZ.io(), (abmt) ghtVar19.cT.io());
            case 346:
                return new abak((Context) this.a.v.io());
            case 347:
                ght ghtVar20 = this.a;
                agev agevVarI3 = agev.i(ghtVar20.te);
                ghx ghxVar11 = ghtVar20.a;
                return new aerj(agevVarI3, agev.i(ghxVar11.fP), ghxVar11.fR, ghxVar11.fS, (tqj) ghtVar20.q.io(), (hhb) ghxVar11.fY.io(), (hhb) ghxVar11.gb.io());
            case 348:
                ght ghtVar21 = this.a;
                ghx ghxVar12 = ghtVar21.a;
                tqmVar = new ayq(ghxVar12.fO, ghxVar12.cx(), (vxz) ghtVar21.aw.io());
                return tqmVar;
            case 349:
                return adib.d((Context) this.a.v.io(), agdf.b());
            case 350:
                ght ghtVar22 = this.a;
                return adib.c((tgm) ghtVar22.rk.io(), (tmo) ghtVar22.a.fQ.io(), sxh.f(), (ExecutorService) ghtVar22.t.io(), (awut) ghtVar22.bm.io(), (ExecutorService) ghtVar22.z.io(), (awut) ghtVar22.bo.io());
            case 351:
                ght ghtVar23 = this.a;
                return adul.k((Context) ghtVar23.v.io(), (Executor) ghtVar23.t.io(), (vxz) ghtVar23.aw.io(), (tqj) ghtVar23.q.io());
            case 352:
                ght ghtVar24 = this.a;
                glhVar = new aeod(ghtVar24.bd, (zwn) ghtVar24.cn.io(), ghtVar24.aw, agkz.p());
                return glhVar;
            case 353:
                return new hhb(this);
            case 354:
                return new ghv(this, 1);
            case 355:
                return new ghu(this);
            case 356:
                ght ghtVar25 = this.a;
                return adib.f((vxz) ghtVar25.aL.io(), (szb) ghtVar25.eU.io(), (tqj) ghtVar25.q.io(), agev.i(ghtVar25.ii));
            case 357:
                ght ghtVar26 = this.a;
                return new GlideImageLoggerImpl((Executor) ghtVar26.u.io(), ghtVar26.aZ, (mbc) ghtVar26.l.io(), (vxz) ghtVar26.aL.io(), (xks) ghtVar26.a.fT.io());
            case 358:
                return new adjm();
            case 359:
                return new hhb(this);
            case 360:
                return new ghv(this, 0);
            case 361:
                return new ghw(this);
            case 362:
                ght ghtVar27 = this.a;
                return new hlv((Context) ghtVar27.v.io(), (zwb) ghtVar27.bd.io(), (mbc) ghtVar27.l.io(), (Executor) ghtVar27.u.io(), (wjr) ghtVar27.jC.io());
            case 363:
                ght ghtVar28 = this.a;
                ghx ghxVar13 = ghtVar28.a;
                abxuVar = new paj((pct) ghxVar13.j.io(), (omm) ghtVar28.yI.io(), (Set) aupt.b().io(), ghxVar13.z(), (awou) ghtVar28.yu.io());
                return abxuVar;
            case 364:
                ght ghtVar29 = this.a;
                ghx ghxVar14 = ghtVar29.a;
                abxuVar = new pmz(ghxVar14.gf, ghxVar14.cU, ghxVar14.cV, ghtVar29.l, ghtVar29.zv, ghxVar14.gg, (Context) ghtVar29.v.io(), ghtVar29.yj, ghtVar29.yi, ghxVar14.gh, ghxVar14.gr, ghxVar14.gs, (awou) ghtVar29.yu.io());
                return abxuVar;
            case 365:
                ght ghtVar30 = this.a;
                return new png((pve) ghtVar30.yF.io(), (ppe) ghtVar30.zm.io());
            case 366:
                return new poe();
            case 367:
                return agev.i((ozu) this.a.a.gq.io());
            case 368:
                ght ghtVar31 = this.a;
                Context context3 = (Context) ghtVar31.v.io();
                ghx ghxVar15 = ghtVar31.a;
                return new ozu(context3, (pct) ghxVar15.j.io(), (pgi) ghxVar15.p.io(), (pav) ghtVar31.yG.io(), (pls) ghtVar31.yi.io(), ghtVar31.yj, ghxVar15.di(), (pve) ghtVar31.yF.io(), (pat) ghxVar15.gp.io(), (phe) ghxVar15.i.io(), aupm.b(aupt.b()), (tld) ghtVar31.zd.io(), (axff) ghtVar31.zJ.io(), ghxVar15.cO(), (pou) ghtVar31.zG.io(), (awou) ghtVar31.yw.io());
            case 369:
                ght ghtVar32 = this.a;
                abk abkVar = new abk();
                ghtVar32.a.cJ(abkVar);
                return abkVar;
            case 370:
                ght ghtVar33 = this.a;
                ghx ghxVar16 = ghtVar33.a;
                paq paqVar = (paq) ghxVar16.gi.io();
                pls plsVar = (pls) ghtVar33.yi.io();
                peq peqVar = (peq) ghxVar16.o.io();
                tld tldVarDh = ghxVar16.dh();
                pwh pwhVar = (pwh) ghxVar16.gj.io();
                abxuVar = new qam(paqVar, plsVar, peqVar, tldVarDh, pwhVar, (Context) ghtVar33.v.io(), (pxh) ghtVar33.yo.io());
                return abxuVar;
            case 371:
                return new pau((pve) this.a.yF.io());
            case 372:
                return this.a.a.I();
            case 373:
                ght ghtVar34 = this.a;
                pve pveVar = (pve) ghtVar34.yF.io();
                pfk pfkVar = (pfk) ghtVar34.zh.io();
                tld tldVar = (tld) ghtVar34.zD.io();
                ghx ghxVar17 = ghtVar34.a;
                phe pheVar = (phe) ghxVar17.i.io();
                pav pavVar = (pav) ghtVar34.yG.io();
                Set set = (Set) aupt.b().io();
                grj grjVarCO = ghxVar17.cO();
                ghtVar34.dL();
                return new pat(pveVar, pfkVar, tldVar, pheVar, pavVar, set, grjVarCO, (awou) ghtVar34.yu.io());
            case 374:
                ght ghtVar35 = this.a;
                rrq rrqVar = (rrq) ghtVar35.a.gn.io();
                Context context4 = (Context) ghtVar35.v.io();
                awut awutVarDM = ghtVar35.dM();
                ghtVar35.he();
                abxuVar = new xsc(rrqVar, context4, awutVarDM);
                return abxuVar;
            case 375:
                ght ghtVar36 = this.a;
                return psq.s((ahex) ghtVar36.yf.io(), (ayq) ghtVar36.a.gm.io());
            case 376:
                return psq.r((Context) this.a.v.io());
            case 377:
                return new pak();
            case 378:
                return new pna(this.a.a.B());
            case 379:
                return iqf.j(new elr(this.a, (byte[]) null));
            case 380:
                ght ghtVar37 = this.a;
                return new pnk((Context) ghtVar37.v.io(), (ExecutorService) ghtVar37.yt.io(), (ScheduledExecutorService) ghtVar37.yf.io());
            case 381:
                return new nxd();
            case 382:
                ght ghtVar38 = this.a;
                ghx ghxVar18 = ghtVar38.a;
                ghxVar18.dh();
                return new qak();
            case 383:
                ghx ghxVar19 = this.a.a;
                ghxVar19.dh();
                return new nrb();
            case 384:
                ght ghtVar39 = this.a;
                abxuVar = new Object((pgi) ghtVar39.a.p.io(), (pve) ghtVar39.yF.io(), (awou) ghtVar39.yu.io(), (awou) ghtVar39.yh.io()) { // from class: nve
                    {
                        pgiVar.getClass();
                        pveVar.getClass();
                        awouVar.getClass();
                        awouVar.getClass();
                    }
                };
                return abxuVar;
            case 385:
                ght ghtVar40 = this.a;
                ghx ghxVar20 = ghtVar40.a;
                final aunn aunnVarB = aupm.b(ghxVar20.j);
                final paq paqVar2 = (paq) ghxVar20.gi.io();
                final omm ommVar = (omm) ghtVar40.yI.io();
                final pwh pwhVar2 = (pwh) ghxVar20.gj.io();
                final pav pavVar2 = (pav) ghtVar40.yG.io();
                final Context context5 = (Context) ghtVar40.v.io();
                final pls plsVar2 = (pls) ghtVar40.yi.io();
                final aupr auprVar3 = ghtVar40.yj;
                final mbc mbcVar = (mbc) ghtVar40.l.io();
                final Random random = (Random) ghtVar40.yM.io();
                final awou awouVar = (awou) ghtVar40.yu.io();
                abxuVar = new Object(aunnVarB, paqVar2, ommVar, pwhVar2, pavVar2, context5, plsVar2, auprVar3, mbcVar, random, awouVar) { // from class: nvd
                    {
                        aunnVarB.getClass();
                        paqVar2.getClass();
                        ommVar.getClass();
                        pwhVar2.getClass();
                        pavVar2.getClass();
                        context5.getClass();
                        plsVar2.getClass();
                        auprVar3.getClass();
                        mbcVar.getClass();
                        random.getClass();
                        awouVar.getClass();
                        new axfi(false);
                    }
                };
                return abxuVar;
            case 386:
                ght ghtVar41 = this.a;
                abxuVar = new pap((pxh) ghtVar41.yo.io(), ghtVar41.a.v());
                return abxuVar;
            case 387:
                ght ghtVar42 = this.a;
                Context context6 = (Context) ghtVar42.v.io();
                ghx ghxVar21 = ghtVar42.a;
                return new pad(context6, ghxVar21.ao(), (pni) ghxVar21.gx.io(), (pls) ghtVar42.yi.io(), (pav) ghtVar42.yG.io(), ghtVar42.yj, (ijt) ghtVar42.zI.io());
            case 388:
                ght ghtVar43 = this.a;
                abxuVar = new pdl((pdd) ghtVar43.a.E.io(), (awou) ghtVar43.yu.io());
                return abxuVar;
            case 389:
                ght ghtVar44 = this.a;
                abxuVar = new pdc((pdd) ghtVar44.a.E.io(), (awou) ghtVar44.yu.io());
                return abxuVar;
            case 390:
                ght ghtVar45 = this.a;
                return new paf((Context) ghtVar45.v.io(), ghtVar45.a.ao(), (pav) ghtVar45.yG.io(), (pls) ghtVar45.yi.io(), (pwf) ghtVar45.yj.io(), (ijt) ghtVar45.zI.io());
            case 391:
                return new zs((byte[]) null, (char[]) null);
            case 392:
                ght ghtVar46 = this.a;
                Context context7 = (Context) ghtVar46.v.io();
                xru xruVar = (xru) ghtVar46.po.io();
                abxv abxvVar = (abxv) ghtVar46.lk.io();
                mbc mbcVar2 = (mbc) ghtVar46.l.io();
                ghx ghxVar22 = ghtVar46.a;
                xlj xljVar = (xlj) ghxVar22.gG.io();
                ycp ycpVar = (ycp) ghtVar46.kx.io();
                aupr auprVar4 = ghtVar46.de;
                Intent intentI = ghxVar22.i();
                elq elqVarCZ = ghxVar22.cZ();
                return new xlc(context7, xruVar, abxvVar, mbcVar2, xljVar, ycpVar, intentI, elqVarCZ);
            case 393:
                ght ghtVar47 = this.a;
                return new xlj((auy) ghtVar47.An.io(), (Context) ghtVar47.v.io(), ghtVar47.d(), ghtVar47.a.V(), Optional.of((sxn) ghtVar47.xM.io()));
            case 394:
                ght ghtVar48 = this.a;
                Context context8 = (Context) ghtVar48.v.io();
                ghx ghxVar23 = ghtVar48.a;
                aunn aunnVarB2 = aupm.b(ghxVar23.gM);
                mbc mbcVar3 = (mbc) ghtVar48.l.io();
                Set setAE = ghxVar23.aE();
                Optional.empty();
                return new acks(context8, aunnVarB2, mbcVar3, setAE);
            case 395:
                return acgz.e(aupm.b(this.a.a.gL), Optional.empty());
            case 396:
                ght ghtVar49 = this.a;
                abxuVar = new ackz((axlj) ghtVar49.a.gK.io(), (awut) ghtVar49.bm.io(), (awou) ghtVar49.bl.io(), (mbc) ghtVar49.l.io(), (Executor) ghtVar49.A.io());
                return abxuVar;
            case 397:
                return acgz.u(aupm.b(this.a.a.gJ), Optional.empty());
            case 398:
                ght ghtVar50 = this.a;
                return new axlj((awou) ghtVar50.bl.io(), (awou) ghtVar50.pI.io(), (aavv) ghtVar50.a.gI.io());
            case 399:
                return new aavv((Context) this.a.v.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        Object lqaVar;
        Object axfdVar;
        float f;
        Object aeqtVar;
        Object adpdVar;
        int i = this.b;
        int i2 = 3;
        int i3 = 5;
        int i4 = 0;
        byte[] bArr = null;
        switch (i) {
            case 400:
                return new acld();
            case 401:
                ght ghtVar = this.a;
                ghx ghxVar = ghtVar.a;
                ahul ahulVar = (ahul) ghxVar.gP.io();
                awou awouVar = (awou) ghtVar.bl.io();
                lqa lqaVar2 = (lqa) ghxVar.gQ.io();
                ahulVar.getClass();
                awouVar.getClass();
                lqaVar2.getClass();
                adpdVar = new adpd(ahulVar, awouVar, lqaVar2);
                return adpdVar;
            case 402:
                ght ghtVar2 = this.a;
                ahex ahexVar = (ahex) ghtVar2.z.io();
                ahex ahexVar2 = (ahex) ghtVar2.t.io();
                ahex ahexVar3 = (ahex) ghtVar2.T.io();
                aupr auprVar = ghtVar2.aI;
                agpr agprVar = agpr.a;
                ahum ahumVar = new ahum();
                ahumVar.b = ahexVar2;
                ahumVar.a = ahexVar;
                ahumVar.c = ahexVar3;
                ahumVar.d = auprVar;
                ahumVar.e.j(agprVar);
                ahumVar.a.getClass();
                ahumVar.b.getClass();
                ahumVar.c.getClass();
                ahumVar.d.getClass();
                return new ahup(ahumVar);
            case 403:
                lqaVar = new lqa(null, null, null, null, null);
                return lqaVar;
            case 404:
                adom adomVar = (adom) this.a.a.fw.io();
                adomVar.getClass();
                synchronized (adomVar.c) {
                    CommandQueue commandQueue = adomVar.d;
                    if (commandQueue == null || commandQueue.isDisposed()) {
                        try {
                            CommandQueue commandQueue2 = new CommandQueue(RenderBackend.Vulkan, false);
                            adomVar.d = commandQueue2;
                            commandQueue2.acquire("RiveAnimationInitializer/getOrCreateWorker");
                            adpdVar = commandQueue2;
                        } catch (RiveInitializationException e) {
                            ((agrc) ((agrc) adom.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveAnimationInitializer", "getOrCreateWorker$<anonymous>", 147, "RiveAnimationInitializer.kt")).t("Failed to create Rive CommandQueue.");
                            throw new IllegalStateException("Failed to initialize Rive CommandQueue", e);
                        }
                    } else {
                        commandQueue.acquire("RiveAnimationInitializer/getOrCreateWorker");
                        adpdVar = commandQueue;
                    }
                }
                return adpdVar;
            case 405:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                ghx ghxVar2 = ghtVar3.a;
                return new adrl(context, Optional.of(ghxVar2.gR), (lqa) ghxVar2.gQ.io(), (awou) ghtVar3.pI.io());
            case 406:
                ght ghtVar4 = this.a;
                return new adro(ghtVar4.a.gS, (awou) ghtVar4.bl.io());
            case 407:
                return new lqa((int[]) null);
            case 408:
                return new ahpu(this.a.a.gW);
            case 409:
                return new hee(this.a, null);
            case 410:
                return new GlideLoaderModule();
            case 411:
                ght ghtVar5 = this.a;
                mbc mbcVar = (mbc) ghtVar5.l.io();
                Context context2 = (Context) ghtVar5.v.io();
                ghx ghxVar3 = ghtVar5.a;
                return new pmg(mbcVar, context2, ghxVar3.an(), (pls) ghtVar5.yi.io(), aupm.b(ghtVar5.yj), aupm.b(ghxVar3.cU), aupm.b(ghxVar3.cV), (awou) ghtVar5.yh.io(), (ijt) ghtVar5.zI.io());
            case 412:
                ght ghtVar6 = this.a;
                axfdVar = new axfd((SharedPreferences) ghtVar6.J.io(), (dov) ghtVar6.gY.io(), (aauk) ghtVar6.iL.io(), (xeu) ghtVar6.aZ.io());
                return axfdVar;
            case 413:
                ght ghtVar7 = this.a;
                ghx ghxVar4 = ghtVar7.a;
                return new aaoh((acaq) ghxVar4.hd.io(), (Executor) ghtVar7.u.io(), (tfq) ghtVar7.cd.io(), (aanb) ghtVar7.iG.io(), ghxVar4.Y());
            case 414:
                ght ghtVar8 = this.a;
                Executor executor = (Executor) ghtVar8.u.io();
                tft tftVar = (tft) ghtVar8.sd.io();
                ghx ghxVar5 = ghtVar8.a;
                return new acbc(executor, tftVar, (tzs) ghxVar5.ha.io(), (mbc) ghtVar8.l.io(), (syp) ghxVar5.hc.io(), (vxz) ghtVar8.aL.io(), (abmt) ghtVar8.cT.io());
            case 415:
                return new tzs(tzs.b);
            case 416:
                ght ghtVar9 = this.a;
                return aawb.c(ghtVar9.eL(), (tqj) ghtVar9.q.io(), ghtVar9.a.hb, ghtVar9.W());
            case 417:
                tes tesVar = (tes) this.a.eO.io();
                tesVar.getClass();
                return new agfa(tesVar);
            case 418:
                ght ghtVar10 = this.a;
                adpdVar = new aaok(ghtVar10.aZ, (mbc) ghtVar10.l.io(), ghtVar10.ce);
                return adpdVar;
            case 419:
                return new aedi();
            case 420:
                ght ghtVar11 = this.a;
                Context context3 = (Context) ghtVar11.v.io();
                awut awutVar = (awut) ghtVar11.bm.io();
                awou awouVar2 = (awou) ghtVar11.bl.io();
                awou awouVar3 = (awou) ghtVar11.eK.io();
                ghx ghxVar6 = ghtVar11.a;
                return new axlj(context3, awutVar, awouVar2, awouVar3, aupm.b(ghxVar6.hh), (aedi) ghxVar6.hg.io());
            case 421:
                return dvy.a("MULTI_PROFILE") ? Optional.of(yi.h()) : Optional.empty();
            case 422:
                ght ghtVar12 = this.a;
                aunn aunnVarB = aupm.b(ghtVar12.kE);
                abxv abxvVar = (abxv) ghtVar12.gK.io();
                zwb zwbVar = (zwb) ghtVar12.bd.io();
                ghx ghxVar7 = ghtVar12.a;
                aunn aunnVarB2 = aupm.b(ghxVar7.hj);
                vxu vxuVar = (vxu) ghtVar12.at.io();
                vyo vyoVar = (vyo) ghtVar12.av.io();
                aunn aunnVarB3 = aupm.b(ghxVar7.hk);
                aunn aunnVarB4 = aupm.b(aupt.a);
                aunn aunnVarB5 = aupm.b(ghxVar7.hm);
                tbt tbtVar = (tbt) ghtVar12.I.io();
                aunn aunnVarB6 = aupm.b(ghtVar12.lr);
                aunn aunnVarB7 = aupm.b(ghxVar7.hl);
                aunn aunnVarB8 = aupm.b(ghxVar7.hn);
                tqj tqjVar = (tqj) ghtVar12.q.io();
                return new wom(aunnVarB, abxvVar, zwbVar, aunnVarB2, vxuVar, vyoVar, aunnVarB3, aunnVarB4, aunnVarB5, tbtVar, aunnVarB6, aunnVarB7, aunnVarB8, tqjVar, aupm.b(ghtVar12.aw), aupm.b(ghtVar12.gF), (Context) ghtVar12.v.io(), aupm.b(ghtVar12.cs));
            case 423:
                tgg tggVar = (tgg) aupm.b(this.a.qf).io();
                tggVar.getClass();
                return tggVar;
            case 424:
                return new agqj(this.a.ap());
            case 425:
                ght ghtVar13 = this.a;
                wlp wlpVar = (wlp) ghtVar13.kE.io();
                ghx ghxVar8 = ghtVar13.a;
                return new wol(wlpVar, (tgg) ghxVar8.hj.io(), (Set) ghxVar8.hl.io());
            case 426:
                return new agqj(this.a.a.S());
            case 427:
                adpdVar = new aaok(Optional.empty(), (zwb) this.a.bd.io(), (zs) ghx.ch());
                return adpdVar;
            case 428:
                return new ci((vxz) this.a.pD.io(), (byte[]) null);
            case 429:
                ght ghtVar14 = this.a;
                szb szbVar = (szb) ghtVar14.eU.io();
                ajvu ajvuVarC = ((vxu) ghtVar14.at.io()).c();
                if ((ajvuVarC.b & SemanticState.Obscured) != 0) {
                    apjn apjnVar = ajvuVarC.k;
                    if (apjnVar == null) {
                        apjnVar = apjn.a;
                    }
                    f = apjnVar.f;
                } else {
                    f = 0.0f;
                }
                return Boolean.valueOf(szbVar.b(f, szc.b));
            case 430:
                ght ghtVar15 = this.a;
                ghx ghxVar9 = ghtVar15.a;
                aupr auprVar2 = ghxVar9.eg;
                aetb aetbVar = (aetb) ghtVar15.uw.io();
                aupr auprVar3 = ghxVar9.hr;
                Optional optionalEmpty = Optional.empty();
                vxz vxzVar = (vxz) ghtVar15.cR.io();
                aeqtVar = new aeqt(auprVar2, aetbVar, auprVar3, optionalEmpty, vxzVar);
                return aeqtVar;
            case 431:
                return new axlj((aetb) this.a.uw.io());
            case 432:
                return ((awkv) this.a.a.ht.io()).E();
            case 433:
                return new awkx().aI();
            case 434:
                ght ghtVar16 = this.a;
                aeqtVar = new hef((Executor) ghtVar16.u.io(), agpr.a, (byte[]) null);
                return aeqtVar;
            case 435:
                return new kvm((Context) this.a.v.io());
            case 436:
                return new dov((short[]) null);
            case 437:
                return new elr((byte[]) null, (byte[]) null, (byte[]) null);
            case 438:
                ght ghtVar17 = this.a;
                aeqtVar = new wbm(ghtVar17.eo, (wbz) ghtVar17.es.io());
                return aeqtVar;
            case 439:
                ght ghtVar18 = this.a;
                ghx ghxVar10 = ghtVar18.a;
                aupr auprVar4 = ghxVar10.hA;
                aupr auprVar5 = ghxVar10.hB;
                tru truVar = ghtVar18.fb().l(17, 45400744L, false) ? (tru) auprVar4.io() : (tru) auprVar5.io();
                truVar.getClass();
                return truVar;
            case 440:
                return new trv((afvq) this.a.mK.io());
            case 441:
                return new trw();
            case 442:
                return new mfu();
            case 443:
                vxz vxzVar2 = (vxz) this.a.dP.io();
                int i5 = adba.a;
                String strN = vxzVar2.n(5, 45791910L);
                if (Objects.equals(strN, "fade_out_fade_in")) {
                    return new mft();
                }
                return Objects.equals(strN, "estimated_target") ? new mft() : new Object();
            case 444:
                int i6 = adba.a;
                return Boolean.FALSE;
            case 445:
                ght ghtVar19 = this.a;
                vxu vxuVar2 = (vxu) ghtVar19.at.io();
                vyo vyoVar2 = (vyo) ghtVar19.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "SearchClientUiShared");
            case 446:
                return new elr(aupm.b(this.a.nj));
            case 447:
                ght ghtVar20 = this.a;
                aupr auprVar6 = ghtVar20.ew;
                ghx ghxVar11 = ghtVar20.a;
                return new adah(auprVar6, ghxVar11.hJ, (vxz) ghtVar20.dP.io(), Optional.of(ghxVar11.hN), (wco) ghtVar20.jy.io(), (zwb) ghtVar20.bd.io(), ghtVar20.bN(), ghtVar20.ng, ghtVar20.no);
            case 448:
                ght ghtVar21 = this.a;
                Context context4 = (Context) ghtVar21.v.io();
                ghx ghxVar12 = ghtVar21.a;
                omj omjVar = (omj) ghxVar12.hI.io();
                mrb mrbVarP = ghxVar12.p();
                Optional optionalOf = Optional.of(ghxVar12.dd());
                int i7 = adba.a;
                return new mrl(context4, omjVar, mrbVarP, optionalOf, Optional.of(Boolean.FALSE), Optional.of(Boolean.valueOf(ghxVar12.bl())), Optional.of(Boolean.valueOf(ghxVar12.bS())), Optional.of(Boolean.valueOf(ghxVar12.bR())));
            case 449:
                return new omj((byte[]) null);
            case 450:
                ght ghtVar22 = this.a;
                return new QueryEngineContainer(ghtVar22.a.cF());
            case 451:
                fhz fhzVar = (fhz) this.a.a.hK.io();
                fhzVar.getClass();
                return new agfa(fhzVar);
            case 452:
                return new fhz();
            case 453:
                return new rnj((Context) this.a.v.io(), (byte[]) null);
            case 454:
                ght ghtVar23 = this.a;
                return Boolean.valueOf(((Boolean) ghtVar23.eV.io()).booleanValue() && ((vxz) ghtVar23.dP.io()).l(110, 45416565L, false));
            case 455:
                ghx ghxVar13 = this.a.a;
                return new nze(Optional.of(ghxVar13.df()), Optional.of((abfv) ghxVar13.hQ.io()), Optional.of((Boolean) ghxVar13.hP.io()), Optional.of(Integer.valueOf(ghxVar13.c())), Optional.of(Integer.valueOf(ghxVar13.b())), new idl(i2), new idl(4), new idl(i3), new idl(6));
            case 456:
                ght ghtVar24 = this.a;
                aeqtVar = new abfv((mbc) ghtVar24.l.io(), (ahey) ghtVar24.u.io(), (byte[]) null);
                return aeqtVar;
            case 457:
                vxz vxzVar3 = (vxz) this.a.dP.io();
                int i8 = adba.a;
                return Boolean.valueOf(vxzVar3.l(185, 45624631L, false));
            case 458:
                vxz vxzVar4 = (vxz) this.a.dP.io();
                int i9 = adba.a;
                String strN2 = vxzVar4.n(2, 45661551L);
                Object objO = strN2.isEmpty() ? agpr.a : agkz.o(strN2.split(","));
                objO.getClass();
                return objO;
            case 459:
                tqj tqjVar2 = (tqj) this.a.q.io();
                int i10 = adba.a;
                int i11 = tqr.a;
                return Boolean.valueOf((tqjVar2.a(1075073767) & 16384) != 0);
            case 460:
                return Boolean.valueOf(((xks) this.a.a.fT.io()).a);
            case 461:
                return Optional.of(Boolean.valueOf(this.a.a.bx()));
            case 462:
                return Optional.of(Boolean.valueOf(this.a.a.bb()));
            case 463:
                return Optional.of(Boolean.valueOf(this.a.a.bF()));
            case 464:
                return new adhn((Context) this.a.v.io());
            case 465:
                return new ci(((adhp) this.a.a.fO.io()).c, (byte[]) null);
            case 466:
                return new axlj((char[]) null);
            case 467:
                ght ghtVar25 = this.a;
                return adba.a(ghtVar25.a.f(), (Context) ghtVar25.v.io());
            case 468:
                ghx ghxVar14 = this.a.a;
                tsr tsrVar = (tsr) ghxVar14.ig.io();
                tsl tslVar = (tsl) ghxVar14.ih.io();
                tslVar.getClass();
                lqaVar = new acyw(tsrVar, new agfa(tslVar));
                return lqaVar;
            case 469:
                ght ghtVar26 = this.a;
                adpdVar = new tsr((Context) ghtVar26.v.io(), ghtVar26.a.cM(), (Executor) ghtVar26.t.io());
                return adpdVar;
            case 470:
                ght ghtVar27 = this.a;
                Context context5 = (Context) ghtVar27.v.io();
                ahey aheyVar = (ahey) ghtVar27.u.io();
                aeiv aeivVarCM = ghtVar27.a.cM();
                aupr auprVar7 = ghtVar27.aI;
                auprVar7.getClass();
                Object obj = new agfa(auprVar7).a;
                int i12 = adba.a;
                return new tsl(context5, aheyVar, aeivVarCM, (awmd) obj, tsc.a);
            case 471:
                ght ghtVar28 = this.a;
                return new woz((wlp) ghtVar28.kE.io(), (abxv) ghtVar28.gK.io(), (zwb) ghtVar28.bd.io(), (tgg) ghtVar28.zP.io(), (syn) ghtVar28.cs.io(), (Context) ghtVar28.v.io());
            case 472:
                int i13 = adba.a;
                return Boolean.FALSE;
            case 473:
                vxu vxuVar3 = (vxu) this.a.at.io();
                int i14 = adba.a;
                return new vzs(vxuVar3, 15);
            case 474:
                ght ghtVar29 = this.a;
                boolean zBooleanValue = ((Boolean) ghtVar29.eV.io()).booleanValue();
                ghx ghxVar15 = ghtVar29.a;
                aunn aunnVarB9 = aupm.b(ghxVar15.im);
                aunn aunnVarB10 = aupm.b(ghtVar29.fd);
                aunn aunnVarB11 = aupm.b(ghtVar29.fe);
                aunn aunnVarB12 = aupm.b(ghtVar29.z);
                vxz vxzVar5 = (vxz) ghtVar29.ce.io();
                return zBooleanValue ? new nzb((aawb) aunnVarB9.io(), (nzw) aunnVarB10.io(), (Executor) aunnVarB12.io(), (adam) aunnVarB11.io(), vxzVar5.c(17, 45653760L, 0L), vxzVar5.l(145, 45715290L, false), ghxVar15.de()) : nsc.a;
            case 475:
                return new aawb();
            case 476:
                vyo vyoVar3 = (vyo) this.a.av.io();
                int i15 = adba.a;
                return new adaz(vyoVar3, i4);
            case 477:
                return new acxq(this.a.nj);
            case 478:
                return ((awkv) this.a.a.iq.io()).E();
            case 479:
                return new awkx().aI();
            case 480:
                ght ghtVar30 = this.a;
                boolean zBooleanValue2 = ((Boolean) ghtVar30.eV.io()).booleanValue();
                ghx ghxVar16 = ghtVar30.a;
                aawb aawbVar = (aawb) ghxVar16.im.io();
                aunn aunnVarB13 = aupm.b(ghtVar30.fd);
                aunn aunnVarB14 = aupm.b(ghtVar30.fe);
                aunn aunnVarB15 = aupm.b(ghtVar30.z);
                vxz vxzVar6 = (vxz) ghtVar30.dP.io();
                vxz vxzVar7 = (vxz) ghtVar30.ce.io();
                ci ciVarDe = ghxVar16.de();
                vxzVar6.l(181, 45622447L, false);
                vxzVar6.l(198, 45634321L, false);
                long jC = vxzVar7.c(17, 45653760L, 0L);
                boolean zL = vxzVar6.l(242, 45664185L, false);
                boolean zL2 = vxzVar7.l(145, 45715290L, false);
                if (zBooleanValue2) {
                    return new nzi(aawbVar, (nzw) aunnVarB13.io(), (Executor) aunnVarB15.io(), (adam) aunnVarB14.io(), jC, zL, zL2, true != zL2 ? null : ciVarDe);
                }
                return ntu.a;
            case 481:
                vxz vxzVar8 = (vxz) this.a.ra.io();
                int i16 = adgg.a;
                return new aber(vxzVar8, bArr);
            case 482:
                AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) this.a.v.io()).getSystemService("accessibility");
                accessibilityManager.getClass();
                return accessibilityManager;
            case 483:
                ght ghtVar31 = this.a;
                axfdVar = new kwq((Context) ghtVar31.v.io(), (hlz) ghtVar31.lS.io(), (hfn) ghtVar31.mQ.io(), (hbf) ghtVar31.cz.io());
                return axfdVar;
            case 484:
                awkv awkvVar = (awkv) this.a.to.io();
                awkvVar.getClass();
                return awkvVar.N();
            case 485:
                ghx ghxVar17 = this.a.a;
                aeqtVar = new xpl(ghxVar17.cv(), (vxz) ghxVar17.ix.io(), (char[]) null);
                return aeqtVar;
            case 486:
                ght ghtVar32 = this.a;
                vxu vxuVar4 = (vxu) ghtVar32.at.io();
                vyo vyoVar4 = (vyo) ghtVar32.av.io();
                ght.fp();
                return new vxz(vxuVar4, vyoVar4, "LiveChatClientGlobalConfig");
            case 487:
                ght ghtVar33 = this.a;
                vyo vyoVar5 = (vyo) ghtVar33.av.io();
                ghx ghxVar18 = ghtVar33.a;
                axfdVar = new aaok(vyoVar5, ghxVar18.cw(), ghxVar18.cq(), ghxVar18.cu());
                return axfdVar;
            case 488:
                ght ghtVar34 = this.a;
                aeqtVar = new ufm((aepx) ghtVar34.ul.io(), ugi.c(ghtVar34.a.cs()));
                return aeqtVar;
            case 489:
                ght ghtVar35 = this.a;
                ghx ghxVar19 = ghtVar35.a;
                aeqtVar = new aczl((rbm) ghxVar19.iC.io(), new adbm((aaok) ghxVar19.iz.io(), (vca) ghtVar35.fP.io(), (aepy) ghtVar35.uk.io()), (mbc) ghtVar35.l.io(), new SecureRandom(), (Executor) ghtVar35.u.io());
                return aeqtVar;
            case 490:
                ght ghtVar36 = this.a;
                ghx ghxVar20 = ghtVar36.a;
                aupr auprVar8 = ghxVar20.iB;
                aaok aaokVar = (aaok) ghxVar20.iz.io();
                meg.a();
                lqaVar = new rbm(auprVar8, new vxi(((vxz) aaokVar.d).l(3, 45856440L, false)));
                return lqaVar;
            case 491:
                ght ghtVar37 = this.a;
                JavaRuntime.ManifestLoader manifestLoader = (JavaRuntime.ManifestLoader) ghtVar37.mV.io();
                gma gmaVarFr = ghtVar37.fr();
                ghx ghxVar21 = ghtVar37.a;
                axfdVar = new QosContainer(manifestLoader, gmaVarFr, ghxVar21.cG(), ghxVar21.cH());
                return axfdVar;
            case 492:
                return (jsk) ((agfr) this.a.ho.io()).io();
            case 493:
                return new yno((byte[]) null);
            case 494:
                return new yno((Executor) this.a.u.io());
            case 495:
                return new yno((byte[]) null);
            case 496:
                return new yno(null, null, null, null);
            case 497:
                ght ghtVar38 = this.a;
                ghtVar38.a.cC();
                return new aehn((byte[]) null);
            case 498:
                return new yno((byte[]) null);
            case 499:
                return new qcb(this);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        Object tldVar;
        Object wrvVar;
        Object ssjVar;
        int i = this.b;
        switch (i) {
            case 500:
                return new fhz();
            case 501:
                ght ghtVar = this.a;
                Context context = (Context) ghtVar.v.io();
                ahex ahexVar = (ahex) ghtVar.u.io();
                String str = (String) Optional.empty().orElse("youtube");
                str.getClass();
                return vkz.o(context, ahexVar, str, ghtVar.J, (rrq) ghtVar.bh.io());
            case 502:
                ght ghtVar2 = this.a;
                return rsb.q((Context) ghtVar2.v.io(), ghtVar2.J, (rrq) ghtVar2.bh.io(), (ahex) ghtVar2.u.io());
            case 503:
                ght ghtVar3 = this.a;
                tldVar = new tld((ahex) ghtVar3.u.io(), (ayq) ghtVar3.bg.io());
                return tldVar;
            case 504:
                ght ghtVar4 = this.a;
                wrvVar = new wrv((abxv) ghtVar4.gK.io(), ghtVar4.qg, ghtVar4.qf, (zwb) ghtVar4.bd.io(), (vxu) ghtVar4.at.io(), (wlp) ghtVar4.kE.io(), (vxz) ghtVar4.aL.io(), (Executor) ghtVar4.B.io(), ghx.cU(), ghtVar4.gF, (Context) ghtVar4.v.io(), (syn) ghtVar4.cs.io());
                return wrvVar;
            case 505:
                return new ugi();
            case 506:
                return aeff.h();
            case 507:
                ght ghtVar5 = this.a;
                ghx ghxVar = ghtVar5.a;
                vfp vfpVar = (vfp) ghxVar.iR.io();
                ghxVar.R();
                return new und(vfpVar);
            case 508:
                ght ghtVar6 = this.a;
                Context context2 = (Context) ghtVar6.v.io();
                ghx ghxVar2 = ghtVar6.a;
                ghxVar2.cB();
                wrvVar = new vfp(context2, ghxVar2.R(), (aaok) ghxVar2.iz.io(), (vxz) ghtVar6.um.io(), (zvl) ghtVar6.dO.io(), ghxVar2.R());
                return wrvVar;
            case 509:
                return new roq((char[]) null, (byte[]) null);
            case 510:
                ght ghtVar7 = this.a;
                wrvVar = new ssr((rly) ghtVar7.cm.io(), (zwb) ghtVar7.bd.io(), nsf.j());
                return wrvVar;
            case 511:
                ght ghtVar8 = this.a;
                Context context3 = (Context) ghtVar8.v.io();
                Executor executor = (Executor) ghtVar8.u.io();
                Executor executor2 = (Executor) ghtVar8.B.io();
                ghx ghxVar3 = ghtVar8.a;
                wrvVar = new xte(context3, executor, executor2, (ssr) ghxVar3.iU.io(), (zsl) ghxVar3.ib.io());
                return wrvVar;
            case SemanticState.LiveRegion /* 512 */:
                wrvVar = new lqa((qrx) this.a.a.iW.io());
                return wrvVar;
            case 513:
                ght ghtVar9 = this.a;
                qrx qrxVarQ = aedi.q((Context) ghtVar9.v.io(), (rrq) ghtVar9.bh.io());
                qrxVarQ.getClass();
                return qrxVarQ;
            case 514:
                ght ghtVar10 = this.a;
                wrvVar = new aerd((trf) ghtVar10.M.io(), (mbc) ghtVar10.l.io(), ghtVar10.es, ghtVar10.bd, ghtVar10.eJ, (ahey) ghtVar10.u.io(), (aetb) ghtVar10.uw.io(), (vxz) ghtVar10.ca.io());
                return wrvVar;
            case 515:
                ght ghtVar11 = this.a;
                wrvVar = new aend((wlp) ghtVar11.kE.io(), (abxv) ghtVar11.gK.io(), (zwb) ghtVar11.bd.io(), (tgg) ghtVar11.zQ.io(), (int[]) null);
                return wrvVar;
            case 516:
                wrvVar = new zs((vyo) this.a.av.io(), (byte[]) null);
                return wrvVar;
            case 517:
                wrvVar = new aebx((tpq) this.a.a.jb.io());
                return wrvVar;
            case 518:
                ght ghtVar12 = this.a;
                Context context4 = (Context) ghtVar12.v.io();
                abxu abxuVar = (abxu) ghtVar12.dy.io();
                String str2 = (String) Optional.empty().orElse("youtube");
                str2.getClass();
                rrq rrqVar = (rrq) ghtVar12.bh.io();
                return acfz.am(context4, abxuVar, str2, rrqVar);
            case 519:
                ght ghtVar13 = this.a;
                wrvVar = new aapw((wlp) ghtVar13.kE.io(), (abxv) ghtVar13.gK.io(), (zwb) ghtVar13.bd.io(), (tgg) ghtVar13.EZ.io(), wjz.a);
                return wrvVar;
            case 520:
                ght ghtVar14 = this.a;
                ssjVar = new ssj((aaps) ghtVar14.sO.io(), ghtVar14.iG, 5, null);
                return ssjVar;
            case 521:
                wrvVar = new rnn((tbt) this.a.I.io(), 3);
                return wrvVar;
            case 522:
                ght ghtVar15 = this.a;
                tldVar = new gvg((xow) ghtVar15.a.jg.io(), (Executor) ghtVar15.u.io());
                return tldVar;
            case 523:
                agfa agfaVar = new agfa("music/get_search_suggestions");
                ght ghtVar16 = this.a;
                wlp wlpVar = (wlp) ghtVar16.kE.io();
                abxv abxvVar = (abxv) ghtVar16.gK.io();
                zwb zwbVar = (zwb) ghtVar16.bd.io();
                tgg tggVar = (tgg) ghtVar16.ms.io();
                ghtVar16.a.ct();
                return new xow(agfaVar, wlpVar, abxvVar, zwbVar, tggVar);
            case 524:
                wrvVar = new rnn((axsp) this.a.a.ht.io(), 5);
                return wrvVar;
            case 525:
                wrvVar = new agfa(Boolean.valueOf(this.a.a.bR()));
                return wrvVar;
            case 526:
                return new khn();
            case 527:
                ght ghtVar17 = this.a;
                tldVar = new fdl(ghtVar17.cH, (hwz) ghtVar17.jH.io());
                return tldVar;
            case 528:
                ght ghtVar18 = this.a;
                ghx ghxVar4 = ghtVar18.a;
                tldVar = new xql(ghxVar4.jp, (Context) ghtVar18.v.io(), (xmr) ghtVar18.dh.io(), (abvn) ghtVar18.kp.io(), (xsa) ghtVar18.pi.io(), Optional.empty(), (yar) ghtVar18.le.io(), (xzm) ghtVar18.pk.io(), (ycp) ghtVar18.kx.io(), (dij) ghtVar18.lf.io(), (did) ghtVar18.lg.io(), (ydu) ghtVar18.ln.io(), (vxz) ghtVar18.dd.io(), (xwv) ghtVar18.oC.io(), ghxVar4.X(), ghtVar18.aq());
                return tldVar;
            case 529:
                ght ghtVar19 = this.a;
                return xer.h((vxz) ghtVar19.dd.io(), ghtVar19.a.jo);
            case 530:
                ght ghtVar20 = this.a;
                dij dijVar = (dij) ghtVar20.lf.io();
                did didVar = (did) ghtVar20.lg.io();
                xru xruVar = (xru) ghtVar20.po.io();
                xsa xsaVar = (xsa) ghtVar20.pi.io();
                ghx ghxVar5 = ghtVar20.a;
                xsj xsjVar = (xsj) ghxVar5.jn.io();
                ycp ycpVar = (ycp) ghtVar20.kx.io();
                ycp ycpVar2 = (ycp) ghtVar20.kx.io();
                wrvVar = new xto(dijVar, didVar, xruVar, xsaVar, xsjVar, ycpVar, ycpVar2, (vxz) ghtVar20.dd.io(), (yar) ghtVar20.le.io(), ghxVar5.X(), (wjr) ghtVar20.ki.io());
                return wrvVar;
            case 531:
                ght ghtVar21 = this.a;
                wrvVar = new xsj((dij) ghtVar21.lf.io(), (ydu) ghtVar21.ln.io(), ghtVar21.aq(), (vxz) ghtVar21.dd.io(), (xrx) ghtVar21.lj.io(), (xmr) ghtVar21.dh.io(), (ycp) ghtVar21.kx.io(), ghtVar21.a.jm, (xpn) ghtVar21.kX.io());
                return wrvVar;
            case 532:
                ght ghtVar22 = this.a;
                tldVar = new hef(ghtVar22.cd.io(), (awmd) ghtVar22.kB);
                return tldVar;
            case 533:
                return new izt();
            case 534:
                ght ghtVar23 = this.a;
                return aeff.c((Context) ghtVar23.v.io(), ghtVar23.bh);
            case 535:
                return new omj((byte[]) null, (byte[]) null);
            case 536:
                return new ijt((byte[]) null);
            case 537:
                return new heg((byte[]) null);
            case 538:
                return new awkx();
            case 539:
                ght ghtVar24 = this.a;
                wrvVar = new yx((abvn) ghtVar24.cH.io(), (avlh) ghtVar24.Ag.io());
                return wrvVar;
            case 540:
                return ((awku) this.a.a.jy.io()).P();
            case 541:
                return awku.aC(Boolean.FALSE);
            case 542:
                ght ghtVar25 = this.a;
                tldVar = new acwe((vyo) ghtVar25.av.io(), (Context) ghtVar25.v.io());
                return tldVar;
            case 543:
                return new fhz();
            case 544:
                ght ghtVar26 = this.a;
                wrvVar = new aaqf((wlp) ghtVar26.kE.io(), (abxv) ghtVar26.gK.io(), (zwb) ghtVar26.bd.io(), (tgg) ghtVar26.zV.io(), (Executor) ghtVar26.B.io());
                return wrvVar;
            case 545:
                ght ghtVar27 = this.a;
                wrvVar = new adsa((adhv) ghtVar27.rB.io(), (Executor) ghtVar27.B.io());
                return wrvVar;
            case 546:
                ght ghtVar28 = this.a;
                wrvVar = new aend((wlp) ghtVar28.kE.io(), (abxv) ghtVar28.gK.io(), (zwb) ghtVar28.bd.io(), (tgg) ghtVar28.zP.io(), (byte[]) null, (byte[]) null, (byte[]) null);
                return wrvVar;
            case 547:
                return new aedi();
            case 548:
                ght ghtVar29 = this.a;
                wrvVar = new aend((abxv) ghtVar29.gK.io(), (tgg) ghtVar29.mr.io(), (wlp) ghtVar29.kE.io(), (zwb) ghtVar29.bd.io());
                return wrvVar;
            case 549:
                ght ghtVar30 = this.a;
                wrvVar = new wsg((wlp) ghtVar30.kE.io(), (abxv) ghtVar30.gK.io(), (zwb) ghtVar30.bd.io(), (tgg) ghtVar30.ms.io(), (Executor) ghtVar30.u.io());
                return wrvVar;
            case 550:
                ght ghtVar31 = this.a;
                wrvVar = new aapw((wlp) ghtVar31.kE.io(), (abxv) ghtVar31.gK.io(), (zwb) ghtVar31.bd.io(), (tgg) ghtVar31.zP.io(), (byte[]) null, (byte[]) null);
                return wrvVar;
            case 551:
                ght ghtVar32 = this.a;
                tldVar = new abhh((Context) ghtVar32.v.io(), ghtVar32.a.cI());
                return tldVar;
            case 552:
                ght ghtVar33 = this.a;
                wrvVar = new aend((wlp) ghtVar33.kE.io(), (abxv) ghtVar33.gK.io(), (zwb) ghtVar33.bd.io(), (tgg) ghtVar33.zQ.io(), (byte[]) null, (byte[]) null);
                return wrvVar;
            case 553:
                return new adul();
            case 554:
                ght ghtVar34 = this.a;
                wrvVar = new aend((wlp) ghtVar34.kE.io(), (abxv) ghtVar34.gK.io(), (zwb) ghtVar34.bd.io(), (tgg) ghtVar34.ms.io(), (short[]) null);
                return wrvVar;
            case 555:
                return new nsh();
            case 556:
                return new taq();
            case 557:
                return gzj.bQ((axfd) this.a.cE.io());
            case 558:
                ght ghtVar35 = this.a;
                wrvVar = new xkw((tbt) ghtVar35.I.io(), (avmb) ghtVar35.dC.io(), (zwb) ghtVar35.bd.io(), (vyo) ghtVar35.av.io(), (xla) ghtVar35.de.io(), ghtVar35.eI(), (rre) ghtVar35.bL.io(), (vxz) ghtVar35.dd.io(), (xmr) ghtVar35.dh.io(), (tqj) ghtVar35.q.io());
                return wrvVar;
            case 559:
                ght ghtVar36 = this.a;
                wrvVar = new xow((wlp) ghtVar36.kE.io(), (abxv) ghtVar36.gK.io(), (zwb) ghtVar36.bd.io(), (tgg) ghtVar36.bv.io(), (Executor) ghtVar36.u.io());
                return wrvVar;
            case 560:
                ght ghtVar37 = this.a;
                return hmy.Y((Context) ghtVar37.v.io(), (rrq) ghtVar37.bh.io());
            case 561:
                return ((abvn) this.a.cH.io()).aB();
            case 562:
                return new aewo(null);
            case 563:
                ght ghtVar38 = this.a;
                wrvVar = new itu((Context) ghtVar38.v.io(), (iup) ghtVar38.mP.io(), (hfn) ghtVar38.mQ.io(), (hef) ghtVar38.iQ.io(), (Executor) ghtVar38.B.io(), (hfn) ghtVar38.mG.io());
                return wrvVar;
            case 564:
                ght ghtVar39 = this.a;
                zxj zxjVar = (zxj) ghtVar39.Bq.io();
                spr sprVar = (spr) ghtVar39.dK.io();
                Executor executor3 = (Executor) ghtVar39.u.io();
                return new nrm(zxjVar, sprVar, executor3);
            case 565:
                wrvVar = new xsc((vxz) this.a.km.io());
                return wrvVar;
            case 566:
                return new lqa((byte[]) null, (byte[]) null);
            case 567:
                return new vwt((short[]) null, (byte[]) null);
            case 568:
                return new nsh();
            case 569:
                ght ghtVar40 = this.a;
                wrvVar = new abqx((wlp) ghtVar40.kE.io(), (abxv) ghtVar40.gK.io(), (zwb) ghtVar40.bd.io(), (vxz) ghtVar40.a.kd.io(), (zwy) ghtVar40.fa.io(), (tgg) ghtVar40.zV.io(), (vxz) ghtVar40.gF.io(), (Context) ghtVar40.v.io(), (syn) ghtVar40.cs.io());
                return wrvVar;
            case 570:
                ght ghtVar41 = this.a;
                vxu vxuVar = (vxu) ghtVar41.at.io();
                vyo vyoVar = (vyo) ghtVar41.av.io();
                ght.fp();
                wrvVar = new vxz(vxuVar, vyoVar, "CommercePlatformClient");
                return wrvVar;
            case 571:
                ght ghtVar42 = this.a;
                qrx qrxVarAz = gzj.az((Context) ghtVar42.v.io(), (rrq) ghtVar42.bh.io());
                qrxVarAz.getClass();
                return qrxVarAz;
            case 572:
                return new rqc();
            case 573:
                return new acfd();
            case 574:
                ght ghtVar43 = this.a;
                wrvVar = new adkp((mbc) ghtVar43.l.io(), (tbt) ghtVar43.I.io());
                return wrvVar;
            case 575:
                return new aeiv((byte[]) null);
            case 576:
                return this.a.an().a(xgu.b);
            case 577:
                ght ghtVar44 = this.a;
                wlp wlpVar2 = (wlp) ghtVar44.kE.io();
                abxv abxvVar2 = (abxv) ghtVar44.gK.io();
                zwb zwbVar2 = (zwb) ghtVar44.bd.io();
                tgg tggVar2 = (tgg) ghtVar44.zP.io();
                wrvVar = new wpi(wlpVar2, abxvVar2, zwbVar2, tggVar2);
                return wrvVar;
            case 578:
                return new yno((byte[]) null);
            case 579:
                return new lqa((byte[]) null, (char[]) null);
            case 580:
                ght ghtVar45 = this.a;
                wrvVar = new actm(ghtVar45.Go, (mbc) ghtVar45.l.io(), ghtVar45.jZ, (tre) ghtVar45.Q.io(), (tqj) ghtVar45.q.io(), (Context) ghtVar45.v.io());
                return wrvVar;
            case 581:
                ght ghtVar46 = this.a;
                acuw acuwVar = (acuw) ghtVar46.Gj.io();
                mbc mbcVar = (mbc) ghtVar46.l.io();
                hno hnoVar = (hno) ghtVar46.jZ.io();
                tqj tqjVar = (tqj) ghtVar46.q.io();
                ghx ghxVar6 = ghtVar46.a;
                wrvVar = new acrq(acuwVar, mbcVar, hnoVar, ghtVar46.Gm, tqjVar, (actm) ghxVar6.ko.io(), (acsj) ghtVar46.Gq.io(), (aeid) ghxVar6.kp.io(), (aeid) ghxVar6.kq.io(), ghtVar46.eO);
                return wrvVar;
            case 582:
                wrvVar = new aeid((hno) this.a.jZ.io());
                return wrvVar;
            case 583:
                return new aeid();
            case 584:
                ght ghtVar47 = this.a;
                wrvVar = new aend((wlp) ghtVar47.kE.io(), (abxv) ghtVar47.gK.io(), (zwb) ghtVar47.bd.io(), (tgg) ghtVar47.bv.io(), (byte[]) null);
                return wrvVar;
            case 585:
                ght ghtVar48 = this.a;
                ssjVar = new jod((abvn) ghtVar48.cH.io(), (avmb) ghtVar48.dE.io(), (avmb) ghtVar48.dA.io());
                return ssjVar;
            case 586:
                ght ghtVar49 = this.a;
                return new aend((wlp) ghtVar49.kE.io(), (abxv) ghtVar49.gK.io(), (zwb) ghtVar49.bd.io(), (tgg) ghtVar49.ms.io());
            case 587:
                ght ghtVar50 = this.a;
                wrvVar = new wrb((wlp) ghtVar50.kE.io(), (abxv) ghtVar50.gK.io(), (zwb) ghtVar50.bd.io(), (tgg) ghtVar50.rn.io(), agpr.a);
                return wrvVar;
            case 588:
                wrvVar = new zs((xeu) this.a.aZ.io());
                return wrvVar;
            case 589:
                ght ghtVar51 = this.a;
                wrvVar = new wqx((wlp) ghtVar51.kE.io(), (abxv) ghtVar51.gK.io(), (zwb) ghtVar51.bd.io(), (tgg) ghtVar51.zQ.io());
                return wrvVar;
            case 590:
                return new wyv();
            case 591:
                return new xsc();
            case 592:
                return new wyz();
            case 593:
                return new yno((byte[]) null);
            case 594:
                ght ghtVar52 = this.a;
                adhv adhvVar = (adhv) ghtVar52.rB.io();
                Executor executor4 = (Executor) ghtVar52.B.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar52.u.io();
                abnc abncVar = (abnc) ghtVar52.hA.io();
                abvn abvnVar = (abvn) ghtVar52.kp.io();
                vyo vyoVar2 = (vyo) ghtVar52.av.io();
                wrvVar = new ablx(adhvVar, executor4, scheduledExecutorService, abncVar, abvnVar, vyoVar2, (vxz) ghtVar52.cQ.io(), (abmt) ghtVar52.cT.io());
                return wrvVar;
            case 595:
                return new rpi();
            case 596:
                ght ghtVar53 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar53.J.io();
                zwb zwbVar3 = (zwb) ghtVar53.bd.io();
                return new hef(sharedPreferences, zwbVar3, (byte[]) null);
            case 597:
                ght ghtVar54 = this.a;
                iup iupVar = (iup) ghtVar54.mP.io();
                hlp hlpVar = (hlp) ghtVar54.iR.io();
                abfv abfvVar = (abfv) ghtVar54.iD.io();
                ghx ghxVar7 = ghtVar54.a;
                wrvVar = new inl(iupVar, hlpVar, abfvVar, (isi) ghxVar7.ac.io(), ghxVar7.cp());
                return wrvVar;
            case 598:
                return new aciz((char[]) null);
            case 599:
                return new lqa((short[]) null, (char[]) null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        Object tceVar;
        Object aegjVar;
        Object axljVar;
        aeoq aeoqVar;
        int i = this.b;
        switch (i) {
            case 600:
                return new lqa((short[]) null);
            case 601:
                tceVar = new tce(Optional.of((tbt) this.a.I.io()), avla.e);
                return tceVar;
            case 602:
                ght ghtVar = this.a;
                wbz wbzVar = (wbz) ghtVar.es.io();
                abte abteVar = (abte) ghtVar.iS.io();
                xit xitVar = (xit) ghtVar.fa.io();
                ttm ttmVar = (ttm) ghtVar.cJ.io();
                ghx ghxVar = ghtVar.a;
                vxz vxzVarCA = ghxVar.cA();
                vxz vxzVarCr = ghxVar.cr();
                vxz vxzVarCz = ghxVar.cz();
                vxz vxzVar = (vxz) ghtVar.cA.io();
                mbc mbcVar = (mbc) ghtVar.l.io();
                aciz acizVar = (aciz) ghxVar.kL.io();
                ahex ahexVar = (ahex) ghtVar.u.io();
                ahey aheyVar = (ahey) ghtVar.du.io();
                return new aegs(ghxVar.kK, wbzVar, abteVar, xitVar, ttmVar, vxzVarCA, vxzVarCr, vxzVarCz, vxzVar, mbcVar, acizVar, ahexVar, aheyVar, (acwd) ghxVar.jA.io(), ghxVar.aj(), (ahqj) ghxVar.kM.io(), (ahnz) ghtVar.uo.io(), (xeu) ghtVar.aZ.io(), (zvl) ghtVar.dO.io(), (vxz) ghxVar.kN.io());
            case 603:
                ght ghtVar2 = this.a;
                aegjVar = new aegj((Context) ghtVar2.v.io(), (syn) ghtVar2.cs.io());
                return aegjVar;
            case 604:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                aegjVar = new aciz(context, (awmd) ghtVar3.a.kK);
                return aegjVar;
            case 605:
                tceVar = new ahqj((txp) this.a.aS.io());
                return tceVar;
            case 606:
                ght ghtVar4 = this.a;
                vxu vxuVar = (vxu) ghtVar4.at.io();
                vyo vyoVar = (vyo) ghtVar4.av.io();
                ght.fp();
                tceVar = new vxz(vxuVar, vyoVar, "WebviewClient");
                return tceVar;
            case 607:
                ght ghtVar5 = this.a;
                ghx ghxVar2 = ghtVar5.a;
                lqa lqaVar = (lqa) ghxVar2.kP.io();
                wbz wbzVar2 = (wbz) ghtVar5.es.io();
                vxz vxzVar2 = (vxz) ghxVar2.kN.io();
                abte abteVar2 = (abte) ghtVar5.iS.io();
                xit xitVar2 = (xit) ghtVar5.fa.io();
                ttm ttmVar2 = (ttm) ghtVar5.cJ.io();
                mbc mbcVar2 = (mbc) ghtVar5.l.io();
                aciz acizVar2 = (aciz) ghxVar2.kL.io();
                ahex ahexVar2 = (ahex) ghtVar5.u.io();
                ahey aheyVar2 = (ahey) ghtVar5.du.io();
                aegjVar = new aehd(lqaVar, ghxVar2.kK, wbzVar2, vxzVar2, abteVar2, xitVar2, ttmVar2, mbcVar2, acizVar2, ahexVar2, aheyVar2, (acwd) ghxVar2.jA.io(), ghxVar2.aj(), ghxVar2.kQ, (vxz) ghtVar5.cA.io(), ghxVar2.ak(), (zvl) ghtVar5.dO.io());
                return aegjVar;
            case 608:
                return new lqa((char[]) null, (char[]) null);
            case 609:
                ght ghtVar6 = this.a;
                axljVar = new axlj((syn) ghtVar6.cs.io(), (ahex) ghtVar6.u.io(), (Context) ghtVar6.v.io());
                return axljVar;
            case 610:
                ght ghtVar7 = this.a;
                ghx ghxVar3 = ghtVar7.a;
                axljVar = new lqa((zj) ghxVar3.kS.io(), (ScheduledExecutorService) ghtVar7.du.io(), ghxVar3.cr());
                return axljVar;
            case 611:
                return new zj(null, null, null);
            case 612:
                return new lqa((byte[]) null, (byte[]) null, (byte[]) null);
            case 613:
                return new nsg();
            case 614:
                return new adul();
            case 615:
                ght ghtVar8 = this.a;
                aegjVar = new abxv(ghtVar8.a.cX(), (vxz) ghtVar8.jP.io());
                return aegjVar;
            case 616:
                return Boolean.valueOf(!((axfd) this.a.cE.io()).as());
            case 617:
                ght ghtVar9 = this.a;
                Context context2 = (Context) ghtVar9.v.io();
                rrq rrqVar = (rrq) ghtVar9.bh.io();
                Pattern pattern = qpr.a;
                qpq qpqVar = new qpq(context2);
                qpqVar.c("batteryrestrictionspersistencemodule");
                qpqVar.d("batteryrestrictionsimpressions.pb");
                Uri uriA = qpqVar.a();
                qrl qrlVarA = qrm.a();
                qrlVarA.f(uriA);
                qrlVarA.e(aild.a);
                qrx qrxVarC = rrqVar.c(qrlVarA.a());
                qrxVarC.getClass();
                return qrxVarC;
            case 618:
                ght ghtVar10 = this.a;
                axljVar = new vmy((wbz) ghtVar10.es.io(), (wco) ghtVar10.jy.io(), (avmb) ghtVar10.dC.io());
                return axljVar;
            case 619:
                ght ghtVar11 = this.a;
                axljVar = new abfp((yqg) ghtVar11.jF.io(), (abvn) ghtVar11.kp.io(), (vxu) ghtVar11.at.io());
                return axljVar;
            case 620:
                tceVar = new elr(this.a.a.v(), (byte[]) null);
                return tceVar;
            case 621:
                ght ghtVar12 = this.a;
                return new jmr((Context) ghtVar12.v.io(), (acda) ghtVar12.cX.io(), (abvn) ghtVar12.cH.io(), (ycp) ghtVar12.kx.io());
            case 622:
                return ((awkx) this.a.or.io()).P();
            case 623:
                tceVar = new tce(Optional.of((tbt) this.a.I.io()), avla.e);
                return tceVar;
            case 624:
                ght ghtVar13 = this.a;
                tceVar = new xun((xql) ghtVar13.a.jm.io(), (ycp) ghtVar13.kx.io(), (wbz) ghtVar13.es.io(), (zwb) ghtVar13.bd.io(), (vxz) ghtVar13.dd.io(), (aerv) ghtVar13.bN.io(), (mbc) ghtVar13.l.io(), ghtVar13.la);
                return tceVar;
            case 625:
                tceVar = new abuz((rya) this.a.CY.io());
                return tceVar;
            case 626:
                return new vwt(null, null, null, null);
            case 627:
                ght ghtVar14 = this.a;
                rmu rmuVar = (rmu) ghtVar14.bd.io();
                rmw rmwVar = (rmw) ghtVar14.bd.io();
                wnw wnwVar = (wnw) ghtVar14.zR.io();
                ghtVar14.a.K();
                tceVar = new rrq(rmuVar, rmwVar, wnwVar, (tbt) ghtVar14.I.io(), (Executor) ghtVar14.u.io(), (rre) ghtVar14.bL.io(), (rqa) ghtVar14.zS.io());
                return tceVar;
            case 628:
                tceVar = new inn((tbt) this.a.I.io());
                return tceVar;
            case 629:
                return new kro();
            case 630:
                ght ghtVar15 = this.a;
                tceVar = new axfd((abhh) ghtVar15.am.io(), ghtVar15.a.ay(), (Map) agpn.b, (Set) agpr.a, (afgj) ghtVar15.tE.io());
                return tceVar;
            case 631:
                return new afje();
            case 632:
                ght ghtVar16 = this.a;
                tceVar = new rqz((abhh) ghtVar16.am.io(), (afho) ghtVar16.ac.io(), ghtVar16.gi(), (zwb) ghtVar16.bd.io(), (afid) ghtVar16.tF.io(), ghtVar16.a.cP());
                return tceVar;
            case 633:
                return new ahub((char[]) null, (byte[]) null);
            case 634:
                ght ghtVar17 = this.a;
                Context context3 = (Context) ghtVar17.v.io();
                rrq rrqVar2 = (rrq) ghtVar17.bh.io();
                Pattern pattern2 = qpr.a;
                qpq qpqVar2 = new qpq(context3);
                qpqVar2.c("reeleduschemamap");
                qpqVar2.d("reeleduschemamap.pb");
                Uri uriA2 = qpqVar2.a();
                qrl qrlVarA2 = qrm.a();
                qrlVarA2.e(acuy.a);
                qrlVarA2.f(uriA2);
                qrx qrxVarC2 = rrqVar2.c(qrlVarA2.a());
                qrxVarC2.getClass();
                return qrxVarC2;
            case 635:
                return new aawo();
            case 636:
                return new adif((char[]) null);
            case 637:
                ght ghtVar18 = this.a;
                tceVar = new aclz((actv) ghtVar18.Bd.io(), (hno) ghtVar18.jZ.io(), (vyo) ghtVar18.av.io(), (spv) ghtVar18.Bt.io(), ghtVar18.eY());
                return tceVar;
            case 638:
                return new adyc();
            case 639:
                ght ghtVar19 = this.a;
                aegjVar = new aeqq((vxz) ghtVar19.cR.io(), (mbc) ghtVar19.l.io());
                return aegjVar;
            case 640:
                return new aecm();
            case 641:
                ght ghtVar20 = this.a;
                tceVar = new actr((acrz) ghtVar20.Gr.io(), (actv) ghtVar20.Bd.io(), (Executor) ghtVar20.u.io(), (hno) ghtVar20.jZ.io(), (acts) ghtVar20.Bc.io(), (acsv) ghtVar20.Gu.io(), (acul) ghtVar20.Gv.io(), (Executor) ghtVar20.B.io());
                return tceVar;
            case 642:
                ght ghtVar21 = this.a;
                Context context4 = (Context) ghtVar21.v.io();
                rrq rrqVar3 = (rrq) ghtVar21.bh.io();
                Pattern pattern3 = qpr.a;
                qpq qpqVar3 = new qpq(context4);
                qpqVar3.c("reeledu");
                qpqVar3.d("reeledu.pb");
                Uri uriA3 = qpqVar3.a();
                qrl qrlVarA3 = qrm.a();
                qrlVarA3.e(acuz.a);
                qrlVarA3.f(uriA3);
                qrx qrxVarC3 = rrqVar3.c(qrlVarA3.a());
                qrxVarC3.getClass();
                return qrxVarC3;
            case 643:
                return new xhu();
            case 644:
                return new hmy();
            case 645:
                tceVar = new acva((abvn) this.a.mW.io());
                return tceVar;
            case 646:
                return new acno();
            case 647:
                return new ahub((char[]) null, (byte[]) null);
            case 648:
                tceVar = new adif((avmb) this.a.dA.io());
                return tceVar;
            case 649:
                tceVar = new inr((ahey) this.a.du.io());
                return tceVar;
            case 650:
                ght ghtVar22 = this.a;
                abxv abxvVar = (abxv) ghtVar22.gK.io();
                zwb zwbVar = (zwb) ghtVar22.bd.io();
                ghx ghxVar4 = ghtVar22.a;
                tceVar = new wto(abxvVar, zwbVar, ghxVar4.M(), (vxu) ghtVar22.at.io(), agpr.a, ghxVar4.U(), (tbt) ghtVar22.I.io(), (vyo) ghtVar22.av.io(), (vxz) ghtVar22.aw.io());
                return tceVar;
            case 651:
                ght ghtVar23 = this.a;
                ghx ghxVar5 = ghtVar23.a;
                aegjVar = new itj((kyr) ghxVar5.lH.io(), (iup) ghtVar23.mP.io(), (hfn) ghtVar23.mQ.io(), (kyr) ghxVar5.lI.io(), (abxv) ghtVar23.gK.io(), (xgn) ghtVar23.kk.io(), (Executor) ghtVar23.B.io());
                return aegjVar;
            case 652:
                ght ghtVar24 = this.a;
                aegjVar = new kyr((lns) ghtVar24.a.lG.io(), (Executor) ghtVar24.u.io(), (short[]) null);
                return aegjVar;
            case 653:
                Context context5 = (Context) this.a.v.io();
                kro kroVar = lmy.g;
                tceVar = new lnw(context5);
                return tceVar;
            case 654:
                ght ghtVar25 = this.a;
                aegjVar = new kyr((Context) ghtVar25.v.io(), (ttm) ghtVar25.cJ.io(), (short[]) null);
                return aegjVar;
            case 655:
                ght ghtVar26 = this.a;
                ghx ghxVar6 = ghtVar26.a;
                aajt aajtVar = (aajt) ghxVar6.ae.io();
                grj grjVar = (grj) ghxVar6.ab.io();
                kyr kyrVar = (kyr) ghxVar6.lI.io();
                hfn hfnVar = (hfn) ghtVar26.mQ.io();
                hpy hpyVar = (hpy) ghtVar26.md.io();
                hpk hpkVar = (hpk) ghtVar26.nr.io();
                abxv abxvVar2 = (abxv) ghtVar26.gK.io();
                xit xitVar3 = (xit) ghtVar26.fa.io();
                xgn xgnVar = (xgn) ghtVar26.kk.io();
                Executor executor = (Executor) ghtVar26.u.io();
                Executor executor2 = (Executor) ghtVar26.B.io();
                aegjVar = new hnl(aajtVar, grjVar, kyrVar, hfnVar, hpyVar, hpkVar, abxvVar2, xitVar3, xgnVar, executor, executor2);
                return aegjVar;
            case 656:
                ght ghtVar27 = this.a;
                tceVar = new itr((iup) ghtVar27.mP.io(), (hfn) ghtVar27.mQ.io(), (Executor) ghtVar27.u.io(), (Executor) ghtVar27.B.io(), (mbc) ghtVar27.l.io());
                return tceVar;
            case 657:
                tceVar = new hfn((rre) this.a.bL.io());
                return tceVar;
            case 658:
                ght ghtVar28 = this.a;
                Executor executor3 = (Executor) ghtVar28.z.io();
                bec becVar = (bec) ghtVar28.a.lN.io();
                becVar.getClass();
                executor3.getClass();
                return azu.f(becVar, awuw.f(executor3));
            case 659:
                afqx afqxVarA = afqy.a();
                afqxVarA.c(ailv.a);
                afqxVarA.a = "musicsignindataprefsstoremodule";
                return this.a.gc().i(afqxVarA.a());
            case 660:
                return new aedi();
            case 661:
                tceVar = new kyr((Context) this.a.v.io(), (char[]) null);
                return tceVar;
            case 662:
                ght ghtVar29 = this.a;
                ghx ghxVar7 = ghtVar29.a;
                aegjVar = new aejd((aeoq) ghxVar7.lS.io(), (zwb) ghtVar29.bd.io(), ghtVar29.gU(), (lqa) ghxVar7.iX.io(), (vxz) ghxVar7.lT.io(), (vxz) ghtVar29.aw.io());
                return aegjVar;
            case 663:
                ght ghtVar30 = this.a;
                Context context6 = (Context) ghtVar30.v.io();
                Executor executor4 = (Executor) ghtVar30.u.io();
                File filesDir = context6.getFilesDir();
                if (filesDir == null) {
                    aeoqVar = (aeoq) ghtVar30.a.lR.io();
                } else {
                    aeoo aeooVar = new aeoo(filesDir.getAbsolutePath() + File.separator + "storage", executor4);
                    aeooVar.b(new adge(aeooVar, 10));
                    aeoqVar = aeooVar;
                }
                aeoqVar.getClass();
                return aeoqVar;
            case 664:
                return new aeop();
            case 665:
                ght ghtVar31 = this.a;
                vxu vxuVar2 = (vxu) ghtVar31.at.io();
                vyo vyoVar2 = (vyo) ghtVar31.av.io();
                ght.fp();
                tceVar = new vxz(vxuVar2, vyoVar2, "MainAppCoreClientShared");
                return tceVar;
            case 666:
                tceVar = new qcb(this);
                return tceVar;
            case 667:
                ght ghtVar32 = this.a;
                axljVar = new xsc(ghtVar32.ap.io(), ghtVar32.bd.io(), ghtVar32.u.io(), (int[]) null);
                return axljVar;
            case 668:
                ght ghtVar33 = this.a;
                return new tld((Context) ghtVar33.v.io(), new rnj((xeu) ghtVar33.a.a.aZ.io()), (short[]) null);
            case 669:
                ght ghtVar34 = this.a;
                aegjVar = new xsc((Context) ghtVar34.v.io(), ghtVar34.ao());
                return aegjVar;
            case 670:
                ght ghtVar35 = this.a;
                tceVar = new xyk((tft) ghtVar35.kH.io(), (ListenableFuture) ghtVar35.f13do.io(), (ahex) ghtVar35.u.io(), (vxz) ghtVar35.aL.io(), (zvl) ghtVar35.dO.io());
                return tceVar;
            case 671:
                return new aeng();
            case 672:
                return new aepb();
            case 673:
                ght ghtVar36 = this.a;
                Context context7 = (Context) ghtVar36.v.io();
                mbc mbcVar3 = (mbc) ghtVar36.l.io();
                aunn aunnVarB = aupm.b(ghtVar36.FD);
                aunn aunnVarB2 = aupm.b(ghtVar36.zY);
                aunn aunnVarB3 = aupm.b(ghtVar36.Fe);
                aunn aunnVarB4 = aupm.b(ghtVar36.zZ);
                aunn aunnVarB5 = aupm.b(ghtVar36.cw);
                aunn aunnVarB6 = aupm.b(ghtVar36.cF);
                aunn aunnVarB7 = aupm.b(ghtVar36.bd);
                aunn aunnVarB8 = aupm.b(ghtVar36.cs);
                aunn aunnVarB9 = aupm.b(ghtVar36.cy);
                aunn aunnVarB10 = aupm.b(ghtVar36.aZ);
                aunn aunnVarB11 = aupm.b(ghtVar36.fa);
                aunn aunnVarB12 = aupm.b(ghtVar36.ou);
                aunn aunnVarB13 = aupm.b(ghtVar36.I);
                ghx ghxVar8 = ghtVar36.a;
                tceVar = new hgk(context7, mbcVar3, aunnVarB, aunnVarB2, aunnVarB3, aunnVarB4, aunnVarB5, aunnVarB6, aunnVarB7, aunnVarB8, aunnVarB9, aunnVarB10, aunnVarB11, aunnVarB12, aunnVarB13, aupm.b(ghxVar8.mc), aupm.b(ghtVar36.Fw), aupm.b(ghtVar36.oh), aupm.b(ghtVar36.cv), aupm.b(ghxVar8.md), aupm.b(ghtVar36.Fg), (Executor) ghtVar36.z.io());
                return tceVar;
            case 674:
                return new grj((byte[]) null);
            case 675:
                return new yu(null);
            case 676:
                ght ghtVar37 = this.a;
                tceVar = new hgb((Context) ghtVar37.v.io(), (hfy) ghtVar37.cy.io(), (hwv) ghtVar37.nW.io(), ghtVar37.pf, ghtVar37.d(), (vxz) ghtVar37.cu.io());
                return tceVar;
            case 677:
                ght ghtVar38 = this.a;
                tceVar = new hgf((hwv) ghtVar38.nW.io(), aupm.b(ghtVar38.og), aupm.b(ghtVar38.pg), aupm.b(ghtVar38.Ae), (Executor) ghtVar38.B.io());
                return tceVar;
            case 678:
                xla xlaVar = (xla) this.a.de.io();
                xlaVar.getClass();
                return Boolean.valueOf(!xlaVar.az() || Build.VERSION.SDK_INT < 33);
            case 679:
                ght ghtVar39 = this.a;
                tceVar = new ahgb(aupm.b(ghtVar39.iR), (yu) ghtVar39.a.md.io(), aupm.b(ghtVar39.ct), aupm.b(ghtVar39.iK), (jnm) ghtVar39.cF.io());
                return tceVar;
            case 680:
                ght ghtVar40 = this.a;
                mbc mbcVar4 = (mbc) ghtVar40.l.io();
                ghx ghxVar9 = ghtVar40.a;
                tceVar = new pnm(mbcVar4, (pmk) ghxVar9.gt.io(), (pxh) ghtVar40.yo.io(), aupm.b(ghxVar9.cU), aupm.b(ghxVar9.cV), (awou) ghtVar40.yu.io(), ghxVar9.B());
                return tceVar;
            case 681:
                ght ghtVar41 = this.a;
                tceVar = new abrt((Context) ghtVar41.v.io(), (acdq) ghtVar41.oh.io(), ghtVar41.gS(), (acdo) ghtVar41.oZ.io(), ((abvn) ghtVar41.kp.io()).Z(), (abrp) ghtVar41.Ap.io(), ghtVar41.a.af(), (mbc) ghtVar41.l.io(), (List) ghtVar41.Am.io(), (abmt) ghtVar41.cT.io());
                return tceVar;
            case 682:
                ght ghtVar42 = this.a;
                Context context8 = (Context) ghtVar42.v.io();
                acdq acdqVar = (acdq) ghtVar42.Ds.io();
                abxv abxvVarGS = ghtVar42.gS();
                acdo acdoVar = (acdo) ghtVar42.oZ.io();
                abvn abvnVar = (abvn) ghtVar42.kp.io();
                ghx ghxVar10 = ghtVar42.a;
                tceVar = new abrt(context8, acdqVar, abxvVarGS, acdoVar, abvnVar.Z(), (abrp) ghtVar42.Ap.io(), ghxVar10.ae(), (mbc) ghtVar42.l.io(), (List) ghxVar10.mn.io(), (abmt) ghtVar42.cT.io());
                return tceVar;
            case 683:
                ght ghtVar43 = this.a;
                ghx ghxVar11 = ghtVar43.a;
                List listAsList = Arrays.asList((snx) ghxVar11.ml.io(), (hzt) ghtVar43.Ak.io(), (abro) ghxVar11.mm.io());
                listAsList.getClass();
                return listAsList;
            case 684:
                snv snvVar = (snv) this.a.Dw.io();
                tceVar = new snx(snvVar);
                snvVar.c.add(tceVar);
                return tceVar;
            case 685:
                tceVar = new abro((acdo) this.a.oZ.io());
                return tceVar;
            case 686:
                tceVar = new snw(this.a.Dw);
                return tceVar;
            case 687:
                ght ghtVar44 = this.a;
                aegjVar = new xuu((hzt) ghtVar44.Ak.io(), ghtVar44.Dw, 1);
                return aegjVar;
            case 688:
                ght ghtVar45 = this.a;
                axljVar = new xuu((hzt) ghtVar45.Ak.io(), ghtVar45.kx, 0);
                return axljVar;
            case 689:
                return new awkx().aI();
            case 690:
                return new awkx().aI();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.$cid;
        int i2 = this.b;
        if (i == 0) {
            if (i2 != 0) {
                return new hhb(this);
            }
            ght ghtVar = this.a;
            return new kyr(aupm.b(ghtVar.Ah), aupm.b(ghtVar.Ac), (short[]) null);
        }
        int i3 = i2 / 100;
        if (i3 == 0) {
            return b();
        }
        if (i3 == 1) {
            return c();
        }
        if (i3 == 2) {
            return d();
        }
        if (i3 == 3) {
            return e();
        }
        if (i3 != 4) {
            return i3 != 5 ? h() : g();
        }
        return f();
    }
}
