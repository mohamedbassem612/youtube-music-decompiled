package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gif implements aupr {
    public final ght a;
    public final gkg b;
    public final gjx c;
    public final gjt d;
    private final int e;

    public gif(ght ghtVar, gkg gkgVar, gjt gjtVar, gjx gjxVar, int i) {
        this.a = ghtVar;
        this.b = gkgVar;
        this.d = gjtVar;
        this.c = gjxVar;
        this.e = i;
    }

    private final Object b() {
        Object jaxVar;
        Object ahudVar;
        Object aeodVar;
        Object ynoVar;
        int i = this.e;
        switch (i) {
            case 0:
                return aguu.aC((cc) this.c.b.io());
            case 1:
                ght ghtVar = this.a;
                ahud ahudVarGz = ghtVar.gz();
                ght.ey();
                return aeff.i(ahudVarGz, (ahey) ghtVar.A.io(), (awou) ghtVar.eK.io(), agdf.b(), (agev) ghtVar.i.io(), agdf.b());
            case 2:
                gjx gjxVar = this.c;
                ght ghtVar2 = this.a;
                gjt gjtVar = this.d;
                ghx ghxVar = ghtVar2.a;
                aupr auprVar = ghxVar.hu;
                aupr auprVar2 = ghtVar2.jG;
                aupr auprVar3 = ghtVar2.dC;
                aupr auprVar4 = ghtVar2.dA;
                aupr auprVar5 = gjtVar.i;
                aupr auprVar6 = gjtVar.R;
                aupr auprVar7 = ghtVar2.dP;
                aupr auprVar8 = ghxVar.ip;
                aupr auprVar9 = gjtVar.ah;
                aupr auprVar10 = ghtVar2.jR;
                aupr auprVar11 = ghxVar.ir;
                aupr auprVar12 = ghxVar.is;
                aupr auprVar13 = ghtVar2.fK;
                aupr auprVar14 = gjtVar.aR;
                aupr auprVarB = aups.b(ghtVar2.nj);
                aupr auprVar15 = gjtVar.d;
                aupr auprVarB2 = aups.b(ghtVar2.nq);
                jaxVar = new jax(gjxVar.e, gjxVar.f, gjxVar.g, auprVar, auprVar2, auprVar3, auprVar4, ghtVar2.cD, auprVar5, gjxVar.j, auprVar6, auprVar7, auprVar8, auprVar9, gjxVar.k, ghtVar2.cu, auprVar10, auprVar11, auprVar12, gjxVar.m, auprVar13, auprVar14, auprVarB, auprVar15, auprVarB2, gjxVar.n, ghtVar2.bd, aups.b(gjxVar.o), ghtVar2.es, ghtVar2.na, ghtVar2.et, ghtVar2.nb);
                return jaxVar;
            case 3:
                return new ahek(this.d.d, (tqj) this.a.q.io());
            case 4:
                ght ghtVar3 = this.a;
                return new adws((tbt) ghtVar3.I.io(), (ttm) ghtVar3.cJ.io(), (vyo) ghtVar3.av.io(), (tqj) ghtVar3.q.io(), (Executor) ghtVar3.u.io(), (vxz) ghtVar3.dP.io(), this.d.ar(), (vxz) ghtVar3.pD.io(), (Executor) ghtVar3.B.io(), (vxz) ghtVar3.jP.io());
            case 5:
                ahudVar = new ahud(this.a.a.ar(), (byte[]) null);
                return ahudVar;
            case 6:
                return new mlo((ntr) this.c.i.io());
            case 7:
                gjx gjxVar2 = this.c;
                gjt gjtVar2 = this.d;
                agkj agkjVarD = gjxVar2.D();
                agkj agkjVarL = gjtVar2.L();
                agkz agkzVarP = agkz.p();
                nuc nucVar = (nuc) gjtVar2.R.io();
                agev agevVarI = agev.i(gjtVar2.j());
                ght ghtVar4 = this.a;
                agev agevVarI2 = agev.i((Boolean) ghtVar4.ed.io());
                ghx ghxVar2 = ghtVar4.a;
                jaxVar = new meo(agkjVarD, agkjVarL, agkzVarP, nucVar, agevVarI, agevVarI2, agev.i(Boolean.valueOf(ghxVar2.bZ())), agev.i(Boolean.valueOf(ghxVar2.ce())), agev.i(Integer.valueOf(ghxVar2.f())), agev.i((nvn) ghxVar2.f16if.io()), agev.i((Boolean) ghxVar2.hS.io()), agev.i(Boolean.valueOf(ghxVar2.bk())), agev.i(Boolean.valueOf(ghxVar2.bv())));
                return jaxVar;
            case 8:
                ahudVar = new ahud((afvq) this.b.d.io(), (byte[]) null);
                return ahudVar;
            case 9:
                ght ghtVar5 = this.a;
                return new afip(ghtVar5.v, ghtVar5.a.eU, ghtVar5.ce, this.c.l, ghtVar5.jR, ghtVar5.aL, ghtVar5.cL, ghtVar5.q, (byte[]) null);
            case 10:
                ght ghtVar6 = this.a;
                vxu vxuVar = (vxu) ghtVar6.at.io();
                vyo vyoVar = (vyo) ghtVar6.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "LoggingClientExtended");
            case 11:
                return new aduh((awut) this.a.bo.io());
            case 12:
                ght ghtVar7 = this.a;
                ahudVar = new aciz((awmd) ghtVar7.dA, (awmd) ghtVar7.a.hG, (char[]) null);
                return ahudVar;
            case 13:
                aeodVar = new aeod(this.d.f, this.a.nj, this.c.q, (byte[]) null);
                return aeodVar;
            case 14:
                return Optional.of((ci) this.a.a.hp.io());
            case 15:
                ght ghtVar8 = this.a;
                gjt gjtVar3 = this.d;
                gjx gjxVar3 = this.c;
                jaxVar = new jaz(ghtVar8.I, gjtVar3.aS, ghtVar8.cJ, gjxVar3.s, gjxVar3.u, gjxVar3.v, gjxVar3.w, gjxVar3.x, gjxVar3.y, gjxVar3.z, gjxVar3.A, gjxVar3.B, gjxVar3.C, gjxVar3.D, gjxVar3.E, gjxVar3.F, gjxVar3.G, gjxVar3.H, gjxVar3.I, gjxVar3.J, ghtVar8.jP, ghtVar8.fK);
                return jaxVar;
            case 16:
                ght ghtVar9 = this.a;
                return new jnm((awmd) ghtVar9.v, (awmd) ghtVar9.I, (awmd) ghtVar9.cJ, (awmd) this.d.i);
            case 17:
                ght ghtVar10 = this.a;
                jaxVar = new joo(ghtVar10.nj, ghtVar10.I, ghtVar10.cJ, ghtVar10.z, ghtVar10.dA, ghtVar10.jP, this.c.t, this.d.e, ghtVar10.a.iu, ghtVar10.es, ghtVar10.bd, ghtVar10.cu, null);
                return jaxVar;
            case 18:
                gjt gjtVar4 = this.d;
                return new aciz((Context) gjtVar4.e.io(), gjtVar4.F());
            case 19:
                ahudVar = new hfn(this.a.I, (char[]) null, (byte[]) null);
                return ahudVar;
            case 20:
                ahudVar = new hfn(this.a.I, (byte[]) null, (byte[]) null, (byte[]) null);
                return ahudVar;
            case 21:
                return new kro();
            case 22:
                ahudVar = new hfn(this.a.I, (byte[]) null, (char[]) null);
                return ahudVar;
            case 23:
                gjt gjtVar5 = this.d;
                ght ghtVar11 = this.a;
                return new jnj(gjtVar5.e, ghtVar11.I, ghtVar11.cJ, ghtVar11.a.ip, ghtVar11.mp, ghtVar11.cu);
            case 24:
                return new kro();
            case 25:
                ght ghtVar12 = this.a;
                jaxVar = new isi((awmd) ghtVar12.I, (awmd) this.d.aS, (awmd) ghtVar12.mp, (byte[]) null);
                return jaxVar;
            case 26:
                ahudVar = new hfn(this.a.I, (char[]) null, (byte[]) null, (byte[]) null);
                return ahudVar;
            case 27:
                gjt gjtVar6 = this.d;
                ght ghtVar13 = this.a;
                return new jan(gjtVar6.aS, ghtVar13.I, ghtVar13.cJ, gjtVar6.aT, ghtVar13.fK, ghtVar13.cu, ghtVar13.a.hx, ghtVar13.dA);
            case 28:
                return new kro();
            case 29:
                return new kro();
            case 30:
                return new gzj();
            case 31:
                return new kro();
            case 32:
                ght ghtVar14 = this.a;
                return new isi(ghtVar14.v, ghtVar14.cJ, this.d.i, (byte[]) null, (byte[]) null);
            case 33:
                ght ghtVar15 = this.a;
                ahudVar = new jan(ghtVar15.v, ghtVar15.I, ghtVar15.a.iv, ghtVar15.B, ghtVar15.z, ghtVar15.l, ghtVar15.md, ghtVar15.mC, (byte[]) null);
                return ahudVar;
            case 34:
                return new advn();
            case 35:
                ght ghtVar16 = this.a;
                vxu vxuVar2 = (vxu) ghtVar16.at.io();
                vyo vyoVar2 = (vyo) ghtVar16.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "YouthClient");
            case 36:
                ght ghtVar17 = this.a;
                gjx gjxVar4 = this.c;
                jaxVar = new aehs(ghtVar17.B, gjxVar4.ah, gjxVar4.O, gjxVar4.Z, gjxVar4.ai, gjxVar4.at, gjxVar4.aw, gjxVar4.X, this.d.e, null, null, null);
                return jaxVar;
            case 37:
                gjx gjxVar5 = this.c;
                return rsb.i(gjxVar5.ag, (cc) gjxVar5.b.io(), agkj.i());
            case 38:
                gjx gjxVar6 = this.c;
                aeodVar = new uvz((vkl) gjxVar6.ad.io(), (umf) gjxVar6.Z.io(), (avmb) this.a.dA.io(), (roq) gjxVar6.af.io());
                return aeodVar;
            case 39:
                gjx gjxVar7 = this.c;
                cc ccVar = (cc) gjxVar7.b.io();
                umf umfVar = (umf) gjxVar7.Z.io();
                vkv vkvVarX = gjxVar7.x();
                ujp ujpVar = new ujp();
                vkk vkkVar = (vkk) gjxVar7.aa.io();
                ght ghtVar18 = this.a;
                xgn xgnVar = (xgn) ghtVar18.kk.io();
                vyo vyoVar3 = (vyo) ghtVar18.av.io();
                vkt vktVarW = gjxVar7.w();
                ghx ghxVar3 = ghtVar18.a;
                qrx qrxVar = (qrx) ghxVar3.iL.io();
                return new vkl(ccVar, umfVar, vkvVarX, ujpVar, vkkVar, xgnVar, vyoVar3, vktVarW, qrxVar, (uwi) gjxVar7.P.io(), this.d.bh, gjxVar7.U, (uko) gjxVar7.ac.io(), (adxj) ghtVar18.Ad.io(), (aaok) ghxVar3.iz.io());
            case 40:
                gjx gjxVar8 = this.c;
                cc ccVar2 = (cc) gjxVar8.b.io();
                ght ghtVar19 = this.a;
                Executor executor = (Executor) ghtVar19.B.io();
                avmb avmbVar = (avmb) ghtVar19.dA.io();
                ukp ukpVar = (ukp) gjxVar8.O.io();
                ghx ghxVar4 = ghtVar19.a;
                return new umf(ccVar2, executor, avmbVar, ukpVar, gjxVar8.Q, (qcb) gjxVar8.Y.io(), (aaok) ghxVar4.iz.io());
            case 41:
                return new ukp((uks) this.c.N.io());
            case 42:
                return new uks();
            case 43:
                return new uwg();
            case 44:
                gjx gjxVar9 = this.c;
                return new urt((cc) gjxVar9.b.io(), (urv) gjxVar9.N.io(), (aaok) this.a.a.iz.io());
            case 45:
                return new qcb(this);
            case 46:
                ght ghtVar20 = this.a;
                qcb qcbVar = (qcb) ghtVar20.yO.io();
                return new zf(qcbVar);
            case 47:
                return new vle();
            case 48:
                return new umj();
            case 49:
                gjt gjtVar7 = this.d;
                Context context = (Context) gjtVar7.aW.io();
                ght ghtVar21 = this.a;
                zvl zvlVar = (zvl) ghtVar21.dO.io();
                Executor executor2 = (Executor) ghtVar21.u.io();
                gjx gjxVar10 = this.c;
                qcb qcbVarQ = gjxVar10.Q();
                xsc xscVarT = gjxVar10.T();
                gjxVar10.J();
                ghx ghxVar5 = ghtVar21.a;
                aaok aaokVar = (aaok) ghxVar5.iz.io();
                aeda aedaVar = (aeda) gjtVar7.W.io();
                afip afipVar = (afip) gjtVar7.bf.io();
                qcb qcbVar2 = (qcb) gjxVar10.V.io();
                vko vkoVarV = gjxVar10.v();
                utg utgVarQ = ghxVar5.Q();
                return new uld(context, zvlVar, executor2, qcbVarQ, xscVarT, aaokVar, aedaVar, afipVar, gjxVar10.U, qcbVar2, gjxVar10.W, vkoVarV, utgVarQ);
            case 50:
                ght ghtVar22 = this.a;
                return vkz.t((Context) ghtVar22.v.io(), this.c.P(), (aaok) ghtVar22.a.iz.io());
            case 51:
                return new qcb(this);
            case 52:
                return Optional.empty();
            case 53:
                return vkz.b((cc) this.c.b.io());
            case 54:
                return new uko((ulj) this.c.X.io());
            case 55:
                ahudVar = new roq((xgn) this.c.ae.io(), (char[]) null);
                return ahudVar;
            case 56:
                gjx gjxVar11 = this.c;
                ght ghtVar23 = this.a;
                return new xsc(gjxVar11.af, ghtVar23.a.iz, ghtVar23.Ad, (char[]) null, (byte[]) null);
            case 57:
                gjx gjxVar12 = this.c;
                return rsb.t((cc) gjxVar12.b.io(), agkj.i(), gjxVar12.as);
            case 58:
                gjx gjxVar13 = this.c;
                return new aczl(gjxVar13.b, this.a.dA, gjxVar13.am, gjxVar13.an, gjxVar13.ap, gjxVar13.aq, gjxVar13.ar, (byte[]) null);
            case 59:
                gjx gjxVar14 = this.c;
                cc ccVar3 = (cc) gjxVar14.b.io();
                ght ghtVar24 = this.a;
                zvl zvlVar2 = (zvl) ghtVar24.dO.io();
                gjt gjtVar8 = this.d;
                vxe vxeVar = (vxe) gjtVar8.i.io();
                xsc xscVarAx = gjtVar8.ax();
                avmb avmbVar2 = (avmb) ghtVar24.dA.io();
                roq roqVar = (roq) gjxVar14.af.io();
                return new vbp(ccVar3, zvlVar2, gjxVar14.aj, vxeVar, xscVarAx, avmbVar2, roqVar, (roq) gjxVar14.al.io(), (adxj) ghtVar24.Ad.io(), (aeda) gjtVar8.W.io());
            case 60:
                return new vbr((aduv) this.a.cD.io());
            case 61:
                Optional.empty();
                ynoVar = new yno((byte[]) null);
                return ynoVar;
            case 62:
                ynoVar = new roq(null, null, null);
                return ynoVar;
            case 63:
                gjx gjxVar15 = this.c;
                cc ccVar4 = (cc) gjxVar15.b.io();
                ght ghtVar25 = this.a;
                zvl zvlVar3 = (zvl) ghtVar25.dO.io();
                gjt gjtVar9 = this.d;
                aupr auprVar16 = gjtVar9.bi;
                vxe vxeVar2 = (vxe) gjtVar9.i.io();
                xsc xscVarAx2 = gjtVar9.ax();
                avmb avmbVar3 = (avmb) ghtVar25.dA.io();
                roq roqVar2 = (roq) gjxVar15.af.io();
                return new vbp(ccVar4, zvlVar3, auprVar16, vxeVar2, xscVarAx2, avmbVar3, roqVar2, (roq) gjxVar15.al.io(), (adxj) ghtVar25.Ad.io(), (aeda) gjtVar9.W.io());
            case 64:
                gjx gjxVar16 = this.c;
                cc ccVar5 = (cc) gjxVar16.b.io();
                ght ghtVar26 = this.a;
                return new ums(ccVar5, (avmb) ghtVar26.dA.io(), (xsc) this.d.bj.io(), (zf) gjxVar16.ao.io(), gjxVar16.L(), (aaok) ghtVar26.a.iz.io());
            case 65:
                ynoVar = new zf((char[]) null, (byte[]) null);
                return ynoVar;
            case 66:
                return new uyg(this.d.ah());
            case 67:
                return new vqv((avmb) this.a.dA.io(), this.d.ah());
            case 68:
                ght ghtVar27 = this.a;
                gjx gjxVar17 = this.c;
                jaxVar = new xte(ghtVar27.a.iz, gjxVar17.au, gjxVar17.av, gjxVar17.X, this.d.e, gjxVar17.Z, (byte[]) null);
                return jaxVar;
            case 69:
                return new uwj();
            case 70:
                ynoVar = new yno((byte[]) null);
                return ynoVar;
            case 71:
                ynoVar = new yno((byte[]) null);
                return ynoVar;
            case 72:
                gjx gjxVar18 = this.c;
                gjt gjtVar10 = this.d;
                return gjxVar18.n().a((vfq) gjtVar10.aY.io(), (uxj) gjtVar10.bo.io());
            case 73:
                return new vao((aaok) this.a.a.iz.io());
            case 74:
                return new abix((ulj) this.c.X.io());
            case 75:
                gjx gjxVar19 = this.c;
                ght ghtVar28 = this.a;
                ynoVar = new yno((byte[]) null);
                return ynoVar;
            case 76:
                return rsb.j(agkj.i(), (cc) this.c.b.io());
            case 77:
                return new vae();
            case 78:
                gjx gjxVar20 = this.c;
                return new vaq((cc) gjxVar20.b.io(), (avmb) this.a.dA.io(), (vao) gjxVar20.az.io(), (uxj) this.d.bo.io(), gjxVar20.r(), (vbf) gjxVar20.aG.io(), (vab) gjxVar20.aD.io());
            case 79:
                gjx gjxVar21 = this.c;
                return rsb.l((cc) gjxVar21.b.io(), gjxVar21.F());
            case 80:
                gjx gjxVar22 = this.c;
                return yno.gJ((cc) gjxVar22.b.io(), (vao) gjxVar22.az.io(), (qcb) gjxVar22.aE.io());
            case 81:
                return new qcb(this);
            case 82:
                zvl zvlVar4 = (zvl) this.a.dO.io();
                gjx gjxVar23 = this.c;
                cc ccVar6 = (cc) gjxVar23.b.io();
                gjt gjtVar11 = this.d;
                return new van(zvlVar4, ccVar6, gjtVar11.A(), (vxe) gjtVar11.i.io(), gjxVar23.S(), (val) gjxVar23.aK.io(), (vbf) gjxVar23.aG.io(), (zf) gjtVar11.bp.io());
            case 83:
                gjx gjxVar24 = this.c;
                return rsb.k((vbf) gjxVar24.aG.io(), gjxVar24.aH, gjxVar24.aJ);
            case 84:
                zvl zvlVar5 = (zvl) this.a.dO.io();
                bog bogVar = (bog) this.c.b.io();
                gjt gjtVar12 = this.d;
                return rsb.v(zvlVar5, bogVar, gjtVar12.A(), (xpl) gjtVar12.T(), gjtVar12.ag());
            case 85:
                gjx gjxVar25 = this.c;
                return rsb.r(aupm.b(gjxVar25.O), this.d.A(), aupm.b(gjxVar25.Q), (aaok) this.a.a.iz.io(), aupm.b(gjxVar25.aI), aupm.b(gjxVar25.X));
            case 86:
                return hmy.ao();
            case 87:
                zvl zvlVar6 = (zvl) this.a.dO.io();
                gjx gjxVar26 = this.c;
                cc ccVar7 = (cc) gjxVar26.b.io();
                bog bogVar2 = (bog) gjxVar26.b.io();
                gjt gjtVar13 = this.d;
                uys uysVarA = gjtVar13.A();
                Object objT = gjtVar13.T();
                ynoVar = new vak(zvlVar6, ccVar7, bogVar2, uysVarA, (xpl) objT, gjtVar13.ag(), (vxe) gjtVar13.i.io(), agkz.q("asset_item_selected_entity", "editor_asset_item_selected_entity"), (vao) gjxVar26.az.io());
                return ynoVar;
            case 88:
                gjx gjxVar27 = this.c;
                cc ccVar8 = (cc) gjxVar27.b.io();
                gjt gjtVar14 = this.d;
                xsc xscVarAx3 = gjtVar14.ax();
                vab vabVar = (vab) gjxVar27.aD.io();
                ght ghtVar29 = this.a;
                vam vamVarR = gjxVar27.r();
                avmb avmbVar4 = (avmb) ghtVar29.dA.io();
                xpl xplVar = (xpl) gjtVar14.w.io();
                aunn aunnVarB = aupm.b(gjxVar27.aG);
                vao vaoVar = (vao) gjxVar27.az.io();
                uxj uxjVar = (uxj) gjtVar14.bo.io();
                return new vat(ccVar8, xscVarAx3, vabVar, vamVarR, avmbVar4, xplVar, aunnVarB, vaoVar, uxjVar, aupm.b(gjxVar27.O));
            case 89:
                cf cfVar = (cf) this.d.k.io();
                ght ghtVar30 = this.a;
                Executor executor3 = (Executor) ghtVar30.B.io();
                ahey aheyVar = (ahey) ghtVar30.u.io();
                aaok aaokVar2 = (aaok) ghtVar30.a.iz.io();
                zvl zvlVar7 = (zvl) ghtVar30.dO.io();
                gjx gjxVar28 = this.c;
                vab vabVar2 = (vab) gjxVar28.aD.io();
                vkc vkcVarU = gjxVar28.u();
                zdj zdjVar = (zdj) gjxVar28.aQ.io();
                zdj zdjVar2 = (zdj) gjxVar28.aT.io();
                vhu vhuVarT = gjxVar28.t();
                umf umfVar2 = (umf) gjxVar28.Z.io();
                urt urtVar = (urt) gjxVar28.Q.io();
                ynoVar = new ukz(cfVar, executor3, aheyVar, aaokVar2, zvlVar7, vabVar2, vkcVarU, zdjVar, zdjVar2, vhuVarT, umfVar2, urtVar, gjxVar28.R());
                return ynoVar;
            case 90:
                return new zdj((Context) this.a.v.io());
            case 91:
                gjt gjtVar15 = this.d;
                gjx gjxVar29 = this.c;
                ght ghtVar31 = this.a;
                ynoVar = new yno((int[]) null, (byte[]) null);
                return ynoVar;
            case 92:
                ght ghtVar32 = this.a;
                return new zdj((Context) ghtVar32.v.io(), (aaok) ghtVar32.a.iz.io());
            case 93:
                cc ccVar9 = (cc) this.c.b.io();
                return new usw(ccVar9);
            case 94:
                gjt gjtVar16 = this.d;
                acwq acwqVar = (acwq) gjtVar16.X.io();
                gjtVar16.F();
                return new roq(acwqVar, (Context) this.a.v.io());
            case 95:
                ynoVar = new aeiv((char[]) null);
                return ynoVar;
            case 96:
                gjx gjxVar30 = this.c;
                return new umy((bog) gjxVar30.b.io(), (cc) gjxVar30.b.io(), this.d.ah(), (aeiv) gjxVar30.aY.io(), (avmb) this.a.dA.io());
            case 97:
                ght ghtVar33 = this.a;
                awut awutVar = (awut) ghtVar33.bm.io();
                Executor executor4 = (Executor) ghtVar33.B.io();
                gjx gjxVar31 = this.c;
                zdj zdjVar3 = (zdj) gjxVar31.aT.io();
                afki afkiVar = (afki) gjxVar31.c.io();
                umk umkVar = (umk) gjxVar31.ba.io();
                aaok aaokVar3 = (aaok) gjxVar31.bc.io();
                xsc xscVar = (xsc) gjxVar31.be.io();
                gjt gjtVar17 = this.d;
                return new yno(awutVar, executor4, zdjVar3, afkiVar, umkVar, aaokVar3, xscVar, gjtVar17.aY, gjtVar17.i);
            case 98:
                ght ghtVar34 = this.a;
                Context context2 = (Context) ghtVar34.v.io();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ghtVar34.a.iQ.io();
                gjx gjxVar32 = this.c;
                return new umr(context2, extensionRegistryLite, (ukp) gjxVar32.O.io(), (zdj) gjxVar32.aT.io(), (aeiv) gjxVar32.aY.io(), (zvl) ghtVar34.dO.io());
            case 99:
                gjx gjxVar33 = this.c;
                return new aaok(gjxVar33.O(), gjxVar33.N(), (awut) this.a.bm.io());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object xscVar;
        Object aaokVar;
        Object vjfVar;
        Object uztVar;
        int i = this.e;
        if (i / 100 == 0) {
            return b();
        }
        switch (i) {
            case 100:
                xscVar = new xsc(this.c.O(), (awut) this.a.bm.io());
                return xscVar;
            case 101:
                gjx gjxVar = this.c;
                ght ghtVar = gjxVar.a;
                zf zfVar = new zf((tgg) ghtVar.zQ.io(), (vxz) ghtVar.aL.io());
                gjxVar.O();
                ahgb ahgbVar = new ahgb(zfVar, (aaok) gjxVar.bc.io(), (xsc) gjxVar.be.io(), (awut) ghtVar.bm.io(), gjxVar.N());
                ukp ukpVar = (ukp) gjxVar.O.io();
                ght ghtVar2 = this.a;
                xscVar = new vdv(ahgbVar, ukpVar, (awut) ghtVar2.bm.io(), (afki) gjxVar.c.io(), (umk) gjxVar.ba.io(), (aeiv) gjxVar.aY.io(), (aaok) ghtVar2.a.iz.io());
                return xscVar;
            case 102:
                ght ghtVar3 = this.a;
                aaokVar = new aaok((aaok) ghtVar3.a.iz.io(), (vat) this.c.aO.io(), (zvl) ghtVar3.dO.io());
                return aaokVar;
            case 103:
                gjx gjxVar2 = this.c;
                uko ukoVar = (uko) gjxVar2.ac.io();
                vxe vxeVar = (vxe) gjxVar2.cn.i.io();
                ght ghtVar4 = gjxVar2.a;
                agkj agkjVarJ = agkj.j(0, new ahgb(gjxVar2.ad, ukoVar, vxeVar, (aaok) ghtVar4.a.iz.io(), (adxj) ghtVar4.Ad.io()));
                cc ccVar = (cc) ((aupo) gjxVar2.b).b;
                ccVar.getClass();
                vxz vxzVar = (vxz) ghtVar4.cA.io();
                vxzVar.getClass();
                uko ukoVar2 = (uko) gjxVar2.ac.io();
                ukoVar2.getClass();
                aaokVar = new uwf(ccVar, agkjVarJ, vxzVar, ukoVar2);
                return aaokVar;
            case 104:
                gjx gjxVar3 = this.c;
                cc ccVar2 = (cc) ((aupo) gjxVar3.b).b;
                vhn vhnVar = (vhn) gjxVar3.G().e.io();
                vhnVar.getClass();
                vge vgeVarO = rsb.o(gjxVar3.G());
                cc ccVar3 = (cc) ((aupo) gjxVar3.b).b;
                ght ghtVar5 = gjxVar3.a;
                xscVar = new uvx(ccVar2, vhnVar, vgeVarO, new vhi(ccVar3, (Context) ghtVar5.v.io(), (Handler) ghtVar5.cY.io(), (Executor) ghtVar5.u.io(), rsb.p(gjxVar3.G()), rsb.m(gjxVar3.G())), (umf) gjxVar3.Z.io(), (avmb) this.a.dA.io());
                return xscVar;
            case 105:
                gjx gjxVar4 = this.c;
                gjt gjtVar = gjxVar4.cn;
                xgm xgmVar = (xgm) gjtVar.D.io();
                afip afipVar = (afip) gjxVar4.bn.io();
                ght ghtVar6 = gjxVar4.a;
                aerj aerjVar = new aerj(xgmVar, afipVar, (vxz) ghtVar6.cA.io(), aupm.b(gjxVar4.j), (afip) gjxVar4.m.io(), (acyx) gjtVar.bt.io(), ghtVar6.ew);
                gjt gjtVar2 = this.d;
                aaokVar = new aefv(aerjVar, (vxe) gjtVar2.i.io(), (xgm) gjtVar2.D.io());
                return aaokVar;
            case 106:
                gjt gjtVar3 = this.d;
                ght ghtVar7 = this.a;
                gjx gjxVar5 = this.c;
                aaokVar = new afip(gjtVar3.i, ghtVar7.cD, ghtVar7.Ad, gjtVar3.d, gjxVar5.bl, gjtVar3.aF, gjxVar5.bm, gjtVar3.W);
                return aaokVar;
            case 107:
                return new lqa((aeda) this.d.W.io());
            case 108:
                return new adxl();
            case 109:
                aaokVar = new aeeu((aefv) this.c.bo.io(), (vxe) this.d.i.io(), (vxu) this.a.at.io());
                return aaokVar;
            case 110:
                gjx gjxVar6 = this.c;
                qcb qcbVar = (qcb) gjxVar6.bq.io();
                ght ghtVar8 = this.a;
                aaok aaokVar2 = (aaok) ghtVar8.a.iz.io();
                vxz vxzVar2 = (vxz) ghtVar8.um.io();
                gjt gjtVar4 = gjxVar6.cn;
                Context context = (Context) gjtVar4.e.io();
                xsc xscVar2 = new xsc(gjtVar4.a(), (aeda) gjtVar4.W.io(), (awmd) gjtVar4.be);
                ght ghtVar9 = gjxVar6.a;
                xscVar = new uwa(qcbVar, aaokVar2, vxzVar2, new xte(context, xscVar2, (aduv) ghtVar9.cD.io(), (vxe) gjtVar4.i.io(), (adxj) ghtVar9.Ad.io(), (aaok) ghtVar9.a.iz.io()), (ukp) gjxVar6.O.io(), (vxz) ghtVar8.cB.io());
                return xscVar;
            case 111:
                return new qcb(this);
            case 112:
                ufs ufsVar = ufs.CREATION_FLOW_IMAGE_POSTS;
                ulv ulvVarA = ulx.a();
                ulvVarA.c(true);
                ulvVarA.e = 2;
                ulvVarA.d(true);
                ulvVarA.b(1.0f);
                ulx ulxVarA = ulvVarA.a();
                ufs ufsVar2 = ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL;
                ulv ulvVarA2 = ulx.a();
                ulvVarA2.c(true);
                ulvVarA2.e = 2;
                ulvVarA2.d(true);
                ulvVarA2.b(1.0f);
                return agkj.k(ufsVar, ulxVarA, ufsVar2, ulvVarA2.a());
            case 113:
                gjt gjtVar5 = this.d;
                cf cfVar = (cf) gjtVar5.k.io();
                ght ghtVar10 = this.a;
                ghx ghxVar = ghtVar10.a;
                aaok aaokVar3 = (aaok) ghxVar.iz.io();
                xpl xplVar = (xpl) ghxVar.iy.io();
                gjx gjxVar7 = this.c;
                xscVar = new vjq(cfVar, aaokVar3, xplVar, (vjf) gjxVar7.bt.io(), gjxVar7.K(), (zf) gjxVar7.R.io(), (Executor) ghtVar10.B.io(), (vxe) gjtVar5.i.io(), agkj.k(ufs.CREATION_FLOW_IMAGE_POSTS, (vjy) gjxVar7.bu.io(), ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL, (vjy) gjxVar7.bu.io()), Optional.empty());
                return xscVar;
            case 114:
                Context context2 = (Context) this.d.e.io();
                ghx ghxVar2 = this.a.a;
                vjfVar = new vjf(context2, (xpl) ghxVar2.iy.io(), new ujp(), ghxVar2.cS(), (xgn) this.c.ae.io());
                return vjfVar;
            case 115:
                return new vjx((xsc) this.d.bj.io());
            case 116:
                gjt gjtVar6 = this.d;
                roq roqVar = (roq) gjtVar6.bu.io();
                roq roqVar2 = (roq) gjtVar6.bv.io();
                vxe vxeVar2 = (vxe) gjtVar6.i.io();
                roq roqVar3 = (roq) this.c.af.io();
                awut awutVar = (awut) gjtVar6.bx.io();
                awutVar.getClass();
                qpj.c();
                xscVar = new uof(roqVar, roqVar2, vxeVar2, roqVar3, awutVar);
                return xscVar;
            case 117:
                ufs ufsVar3 = ufs.CREATION_FLOW_IMAGE_POSTS;
                xyh xyhVar = new xyh();
                xyhVar.e();
                xyhVar.f();
                umt umtVarD = xyhVar.d();
                ufs ufsVar4 = ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL;
                xyh xyhVar2 = new xyh();
                xyhVar2.e();
                xyhVar2.f();
                return agkj.k(ufsVar3, umtVarD, ufsVar4, xyhVar2.d());
            case 118:
                gjx gjxVar8 = this.c;
                ums umsVar = (ums) gjxVar8.ap.io();
                umf umfVar = (umf) gjxVar8.Z.io();
                vat vatVar = (vat) gjxVar8.aO.io();
                usw uswVar = (usw) gjxVar8.aW.io();
                uyd uydVar = (uyd) gjxVar8.bz.io();
                uwv uwvVar = (uwv) gjxVar8.bB.io();
                ght ghtVar11 = this.a;
                aunn aunnVarB = aupm.b(gjxVar8.bD);
                ghx ghxVar3 = ghtVar11.a;
                aaok aaokVar4 = (aaok) ghxVar3.iz.io();
                vxz vxzVarCw = ghxVar3.cw();
                vatVar.j = true;
                vatVar.k = true;
                agjz agjzVar = new agjz(4);
                agjzVar.i(umsVar, umfVar, vatVar, uswVar, uydVar, uwvVar);
                if (vxzVarCw.l(599, 45838846L, false)) {
                    agjzVar.h((ukf) gjxVar8.bA.io());
                }
                if (aaokVar4.K()) {
                    agjzVar.h((ukf) gjxVar8.Q.io());
                }
                if (aaokVar4.F()) {
                    agjzVar.h((ukf) aunnVarB.io());
                }
                agjzVar.h((ukf) gjxVar8.bF.io());
                agke agkeVarG = agjzVar.g();
                agkeVarG.getClass();
                return agkeVarG;
            case 119:
                gjx gjxVar9 = this.c;
                xscVar = new uyd((cc) ((aupo) gjxVar9.b).b, (uye) gjxVar9.by.io());
                return xscVar;
            case 120:
                gjt gjtVar7 = this.d;
                aaokVar = new uye((ViewGroup) gjtVar7.bz.io(), gjtVar7.ah(), (aaok) this.a.a.iz.io());
                return aaokVar;
            case 121:
                gjx gjxVar10 = this.c;
                aaokVar = new uyh((cc) ((aupo) gjxVar10.b).b, (vqv) gjxVar10.ar.io(), this.a.a.cw());
                return aaokVar;
            case 122:
                gjx gjxVar11 = this.c;
                xscVar = new uwv((cc) ((aupo) gjxVar11.b).b, aupm.b(gjxVar11.O));
                return xscVar;
            case 123:
                gjx gjxVar12 = this.c;
                gjt gjtVar8 = this.d;
                ght ghtVar12 = this.a;
                cc ccVar4 = (cc) ((aupo) gjxVar12.b).b;
                aunn aunnVarB2 = aupm.b(gjxVar12.O);
                uys uysVarA = gjtVar8.A();
                vbk vbkVarAg = gjtVar8.ag();
                zvl zvlVar = (zvl) ghtVar12.dO.io();
                vao vaoVar = (vao) gjxVar12.az.io();
                awou awouVar = (awou) ghtVar12.bl.io();
                awou awouVar2 = (awou) ghtVar12.eK.io();
                Object objT = gjtVar8.T();
                awut awutVar2 = (awut) gjxVar12.bC.io();
                awutVar2.getClass();
                qpj.c();
                uztVar = new uzt(ccVar4, aunnVarB2, uysVarA, vbkVarAg, zvlVar, vaoVar, awouVar, awouVar2, (xpl) objT, awutVar2);
                return uztVar;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                awou awouVar3 = (awou) this.d.bw.io();
                cc ccVar5 = (cc) ((aupo) this.c.b).b;
                awouVar3.getClass();
                ccVar5.getClass();
                boc lifecycle = ccVar5.getLifecycle();
                lifecycle.getClass();
                return aewp.l(awouVar3, lifecycle);
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                gjx gjxVar13 = this.c;
                aaokVar = new uwn((cc) ((aupo) gjxVar13.b).b, (uwq) gjxVar13.bE.io(), (vfq) this.d.aY.io(), (aaok) this.a.a.iz.io(), (ukp) gjxVar13.O.io(), gjxVar13.Q);
                return aaokVar;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return new uwq((cc) ((aupo) this.c.b).b);
            case 127:
                agke agkeVar = agpi.a;
                agkeVar.getClass();
                return agkeVar;
            case SemanticState.Focused /* 128 */:
                return new qcb(this);
            case 129:
                ght ghtVar13 = this.a;
                Context context3 = (Context) ghtVar13.v.io();
                Executor executor = (Executor) ghtVar13.u.io();
                this.d.B();
                return new xsc(context3, executor, (aaok) ghtVar13.a.iz.io());
            case 130:
                return new qcb(this);
            case 131:
                qcb qcbVar2 = (qcb) this.c.bL.io();
                agpr agprVar = agpr.a;
                qcbVar2.getClass();
                agprVar.getClass();
                gif gifVar = (gif) qcbVar2.a;
                aaokVar = new xsc((cc) ((aupo) gifVar.c.b).b, (roq) gifVar.a.a.iT.io(), (Set) agprVar);
                return aaokVar;
            case 132:
                return new qcb(this);
            case 133:
                return new qcb(this);
            case 134:
                ght ghtVar14 = this.a;
                uztVar = new aend((abxv) ghtVar14.gK.io(), (zwh) this.b.c.io(), (tgg) ghtVar14.zP.io(), (aend) this.c.bN.io());
                return uztVar;
            case 135:
                ght ghtVar15 = this.a;
                vjfVar = new aend((wlp) ghtVar15.kE.io(), (abxv) ghtVar15.gK.io(), (tgg) ghtVar15.zP.io(), new addn(this.c.a.jC));
                return vjfVar;
            case 136:
                awou awouVar4 = (awou) this.c.bP.io();
                awouVar4.getClass();
                return new axcw(awouVar4, 1);
            case 137:
                awou awouVarPlus = new afmk((ahey) this.c.a.d.io()).plus(afme.a).plus(afws.a());
                awouVarPlus.getClass();
                return awouVarPlus;
            case 138:
                gjx gjxVar14 = this.c;
                ght ghtVar16 = this.a;
                xscVar = new uhk(aupm.b(gjxVar14.bR), aupm.b(ghtVar16.a.iz), (ahex) ghtVar16.u.io(), (Executor) ghtVar16.B.io());
                return xscVar;
            case 139:
                ght ghtVar17 = this.a;
                Context context4 = (Context) ghtVar17.v.io();
                ghx ghxVar4 = ghtVar17.a;
                Optional optionalOf = Optional.of(ghxVar4.R());
                Optional optionalEmpty = Optional.empty();
                ahex ahexVar = (ahex) ghtVar17.u.io();
                ght ghtVar18 = this.c.a;
                xscVar = new uhc(context4, optionalOf, optionalEmpty, ahexVar, new uhg((Context) ghtVar18.v.io(), (mbc) ghtVar18.l.io(), (zvl) ghtVar18.dO.io(), Optional.of((yno) ghtVar18.a.iI.io())), (aaok) ghxVar4.iz.io());
                return xscVar;
            case 140:
                return new qcb(this);
            case 141:
                return new aedi();
            case 142:
                gjx gjxVar15 = this.c;
                hef hefVar = new hef((gkt) gjxVar15.a.a.bN.io());
                ght ghtVar19 = this.a;
                aaokVar = new aeoc(hefVar, (tre) ghtVar19.Q.io(), (avmb) ghtVar19.dA.io(), (avmb) ghtVar19.dC.io(), (tqj) ghtVar19.q.io(), aupm.b(gjxVar15.bX), aupm.b(gjxVar15.bY), aupm.b(gjxVar15.bZ), aupm.b(gjxVar15.ch), aupm.b(gjxVar15.ci), aupm.b(gjxVar15.cj), aupm.b(ghtVar19.aZ));
                return aaokVar;
            case 143:
                return new tdg(agkj.j("MusicNavControllerInitializer", this.c.bW));
            case 144:
                gjt gjtVar9 = this.d;
                aunn aunnVarB3 = aupm.b(gjtVar9.bB);
                aunn aunnVarB4 = aupm.b(gjtVar9.bZ);
                vxz vxzVar3 = (vxz) this.a.cu.io();
                aunnVarB3.getClass();
                aunnVarB4.getClass();
                vxzVar3.getClass();
                aaokVar = new isf(vxzVar3, aunnVarB3, aunnVarB4);
                return aaokVar;
            case 145:
                return new tdg(agpn.b);
            case 146:
                return new tdg(agpn.b);
            case 147:
                gjx gjxVar16 = this.c;
                return new tdg(agkj.m("MdxPermissionController", gjxVar16.cb, "PrimesMemoryLifecycleObserver", gjxVar16.cd, "DogfoodWarningController", gjxVar16.cf, "MusicScreenshotDetectionLogger", gjxVar16.cg));
            case 148:
                gjx gjxVar17 = this.c;
                ght ghtVar20 = this.a;
                aunn aunnVarB5 = aupm.b(gjxVar17.ca);
                vxz vxzVar4 = (vxz) ghtVar20.dd.io();
                aunnVarB5.getClass();
                vxzVar4.getClass();
                xscVar = new ise(vxzVar4, aunnVarB5);
                return xscVar;
            case 149:
                cf cfVar2 = (cf) this.d.k.io();
                ght ghtVar21 = this.a;
                xscVar = new xpq(cfVar2, ghtVar21.oR, (awut) ghtVar21.bo.io(), (awou) ghtVar21.eK.io(), (xeu) ghtVar21.aZ.io(), (vxz) ghtVar21.dd.io());
                return xscVar;
            case 150:
                gjx gjxVar18 = this.c;
                vxz vxzVar5 = (vxz) this.a.ca.io();
                vxzVar5.getClass();
                return vxzVar5.l(179, 45679021L, false) ? (tdh) gjxVar18.cc.io() : tdq.a;
            case 151:
                ght ghtVar22 = this.a;
                aaokVar = new aerc((aerd) ghtVar22.a.iY.io(), (mbc) ghtVar22.l.io(), (tqj) ghtVar22.q.io());
                return aaokVar;
            case 152:
                xscVar = new hbd((cf) this.d.k.io(), aupm.b(this.c.ce));
                return xscVar;
            case 153:
                cf cfVar3 = (cf) this.d.k.io();
                ght ghtVar23 = this.a;
                xscVar = new ink(cfVar3, (Executor) ghtVar23.u.io(), (xeu) ghtVar23.aZ.io(), (aclk) ghtVar23.nd.io());
                return xscVar;
            case 154:
                return new tdg(agpn.b);
            case 155:
                return new tdg(agpn.b);
            default:
                throw new AssertionError(i);
        }
    }
}
