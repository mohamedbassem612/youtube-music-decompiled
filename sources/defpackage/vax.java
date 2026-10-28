package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vax implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    private final Object b;
    private final Object c;

    public vax(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, xtl] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, xtl] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, mfy] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wco] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, wbz] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        akrn akrnVar;
        int i = this.$cid;
        int i2 = 3;
        int i3 = 4;
        if (i == 0) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajgg.b);
            ajwoVar.c(aihlVarCheckIsLite);
            ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajgg.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            Object obj = this.b;
            ajgg ajggVar = (ajgg) objC;
            String strG = ajggVar.d;
            if (TextUtils.isEmpty(strG)) {
                String str = ajggVar.c;
                if (TextUtils.isEmpty(str)) {
                    yno.fP(((xsc) obj).b, "Error updating in-memory AssetItemUsageStateEntity: No assetId or entityKey filled in AssetItemUsedNewAssetCommand.");
                } else {
                    strG = wfs.g(ajge.b.a(), "asset_item_usage_state_entity_".concat(String.valueOf(str)));
                }
            }
            String str2 = strG;
            if (!TextUtils.isEmpty(str2)) {
                xsc xscVar = (xsc) obj;
                wby wbyVarB = xscVar.c.e(xscVar.a.e());
                wbyVarB.g(str2).g(ajgd.class).j(new var(obj, i2)).i(new mgd((Object) wbyVarB, (Object) str2, (Object) ajggVar, 12, (byte[]) null)).k(new var(wbyVarB, i3)).H();
            }
            Object obj2 = this.a;
            String str3 = ajggVar.c;
            if (TextUtils.isEmpty(str3)) {
                yno.fP(((xsc) obj2).c, "Error creating new AssetItemUsageStateEntity: No assetId filled in AssetItemUsedNewAssetCommand.");
                avlb.e();
            } else {
                String strG2 = ajggVar.d;
                if (TextUtils.isEmpty(strG2)) {
                    strG2 = wfs.g(ajge.b.a(), "asset_item_usage_state_entity_".concat(String.valueOf(str3)));
                }
                xsc xscVar2 = (xsc) obj2;
                wcn wcnVarB = xscVar2.b.b(xscVar2.a.e());
                ajgc ajgcVarE = ajgd.e(strG2);
                ajgcVarE.am(str3);
                ajgcVarE.an(ajgf.ASSET_ITEM_USAGE_STATE_USED);
                wer werVarE = wcnVarB.e();
                werVarE.m(ajgcVarE);
                werVarE.b();
            }
            this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(189204)), null);
            return;
        }
        if (i == 1) {
            if (((vxz) this.c).m(14, 45634041L)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aleo.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aleo.b);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    Object objC2 = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                    ?? r14 = this.a;
                    aleo aleoVar = (aleo) objC2;
                    ajwn ajwnVar = aleoVar.d;
                    if (ajwnVar == null) {
                        ajwnVar = ajwn.a;
                    }
                    nsh.g(r14, ajwnVar);
                    Object obj3 = this.b;
                    alep alepVar = aleoVar.c;
                    if (alepVar == null) {
                        alepVar = alep.a;
                    }
                    byte[] bArrG = alepVar.b.G();
                    yhi yhiVar = new yhi(this, aleoVar, (char[]) null);
                    svr svrVar = (svr) obj3;
                    cf cfVar = svrVar.b;
                    char[] cArr = null;
                    taf.k(cfVar, hed.C(), new gyr(obj3, bArrG, yhiVar, 14, cArr), new gyr(obj3, bArrG, yhiVar, 15, cArr));
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            aihl aihlVar = ajoa.c;
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                this.a.g();
                vxz vxzVar = (vxz) this.b;
                if (vxzVar.l(165, 45676577L, false) && vxzVar.l(164, 45673420L, false)) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                    ajoa ajoaVar = (ajoa) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    if (ajoaVar.d.size() != 0) {
                        Object obj4 = this.c;
                        Iterator it = agke.n(new aihx(ajoaVar.d, ajoa.a)).iterator();
                        while (it.hasNext()) {
                            if (((amyg) it.next()).ordinal() == 4) {
                                yar yarVar = (yar) obj4;
                                vxz vxzVar2 = yarVar.x;
                                if (vxzVar2.l(164, 45673420L, false) && vxzVar2.l(165, 45676577L, false)) {
                                    yarVar.h();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            aihl aihlVar2 = apkg.b;
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar2);
            ajwoVar.c(aihlVarCheckIsLite7);
            if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                this.a.f();
                vxz vxzVar3 = (vxz) this.b;
                if (vxzVar3.l(165, 45676577L, false) && vxzVar3.l(164, 45673420L, false)) {
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar2);
                    ajwoVar.c(aihlVarCheckIsLite8);
                    Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                    apkg apkgVar = (apkg) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                    if (apkgVar.c.size() != 0) {
                        Object obj5 = this.c;
                        for (amyi amyiVar : agke.n(apkgVar.c)) {
                            amyg amygVarA = amyg.a(amyiVar.c);
                            if (amygVarA == null) {
                                amygVarA = amyg.MDX_DEVICE_DISCOVERY_STRATEGY_UNKNOWN;
                            }
                            if (amygVarA.ordinal() == 4) {
                                yar yarVar2 = (yar) obj5;
                                vxz vxzVar4 = yarVar2.x;
                                if (vxzVar4.l(164, 45673420L, false) && vxzVar4.l(165, 45676577L, false)) {
                                    yarVar2.p(amyiVar);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apxo.b);
        ajwoVar.c(aihlVarCheckIsLite9);
        if (ajwoVar.j.n(aihlVarCheckIsLite9.d)) {
            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apxo.b);
            ajwoVar.c(aihlVarCheckIsLite10);
            Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
            apxo apxoVar = (apxo) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5));
            mfv mfvVarA = mfx.a();
            mfvVarA.o = 1;
            if (((abfv) this.a).l()) {
                nrt nrtVarD = nrv.d();
                nrtVarD.d = new adaq(null, null, null, ajwoVar);
                mfvVarA.g = nrtVarD.a();
            }
            if ((apxoVar.c & 4) != 0) {
                mfvVarA.k = Boolean.valueOf(apxoVar.e);
            }
            Object obj6 = this.c;
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apxo.b);
            ajwoVar.c(aihlVarCheckIsLite11);
            if (ajwoVar.j.n(aihlVarCheckIsLite11.d)) {
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(apxo.b);
                ajwoVar.c(aihlVarCheckIsLite12);
                Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite12.d);
                apxo apxoVar2 = (apxo) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6));
                aoli aoliVar = apxoVar2.d;
                if (aoliVar == null) {
                    aoliVar = aoli.a;
                }
                if ((aoliVar.c == 1 ? (aoln) aoliVar.d : aoln.a).b == 153515154) {
                    aoli aoliVar2 = apxoVar2.d;
                    if (aoliVar2 == null) {
                        aoliVar2 = aoli.a;
                    }
                    aoln aolnVar = aoliVar2.c == 1 ? (aoln) aoliVar2.d : aoln.a;
                    akrnVar = aolnVar.b == 153515154 ? (akrn) aolnVar.c : akrn.a;
                } else {
                    akrnVar = null;
                }
            } else {
                akrnVar = null;
            }
            byte[] bArr = akrnVar != null ? ((acyx) obj6).c(akrnVar).c : null;
            if (bArr != null) {
                this.b.d(bArr, mfvVarA.a());
            }
        }
    }

    public vax(mfy mfyVar, acyx acyxVar, abfv abfvVar, int i) {
        this.$cid = i;
        this.b = mfyVar;
        this.c = acyxVar;
        this.a = abfvVar;
    }

    public vax(xsc xscVar, xsc xscVar2, xgn xgnVar, int i) {
        this.$cid = i;
        this.b = xscVar;
        this.a = xscVar2;
        this.c = xgnVar;
    }
}
