package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class var implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ var(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, wby] */
    /* JADX WARN: Type inference failed for: r12v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v75, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        ajfz ajfzVarL;
        adlq adlqVar;
        String str;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ajfx ajfxVar = (ajfx) obj;
                boolean zIsEmpty = ajfxVar.d.isEmpty();
                Object obj2 = this.a;
                if (!zIsEmpty) {
                    for (String str2 : ajfxVar.d) {
                        vat vatVar = (vat) obj2;
                        String strM = vatVar.m(ajfxVar.e, str2);
                        vatVar.n.F(strM, str2);
                        uzx uzxVar = vatVar.i;
                        if (uzxVar != null) {
                            uzxVar.e(str2);
                        }
                        if (vatVar.k && (ajfzVarL = vatVar.l(str2)) != null) {
                            Iterator it = ajfzVarL.d.iterator();
                            while (it.hasNext()) {
                                String str3 = ((ajfy) it.next()).d;
                            }
                        }
                        vatVar.d.remove(strM);
                        vatVar.g.remove(str2);
                    }
                    return;
                }
                vat vatVar2 = (vat) obj2;
                if (vatVar2.h && ajfxVar.e.isEmpty()) {
                    vatVar2.n();
                } else {
                    String strM2 = vatVar2.m(ajfxVar.e, null);
                    vatVar2.n.D(strM2);
                    vatVar2.d.remove(strM2);
                    ArrayList arrayList = new ArrayList();
                    ConcurrentHashMap concurrentHashMap = vatVar2.g;
                    for (String str4 : concurrentHashMap.keySet()) {
                        ajfz ajfzVar = (ajfz) concurrentHashMap.get(str4);
                        if (ajfzVar != null && vatVar2.m(ajfzVar.f, str4).equals(strM2)) {
                            arrayList.add(str4);
                        }
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        concurrentHashMap.remove((String) arrayList.get(i));
                    }
                }
                uzx uzxVar2 = vatVar2.i;
                if (uzxVar2 != null) {
                    if (!vatVar2.h || ajfxVar.e.isEmpty()) {
                        uzxVar2.b();
                        return;
                    } else {
                        uzxVar2.c(ajfxVar.e);
                        return;
                    }
                }
                return;
            case 1:
                ((vat) this.a).q((ajfz) obj);
                return;
            case 2:
                Object obj3 = this.a;
                List list = ((vat) obj3).m;
                Boolean bool = (Boolean) obj;
                synchronized (list) {
                    ((vat) obj3).i = bool.booleanValue() ? ((vat) obj3).c : ((vat) obj3).b;
                    ((vat) obj3).p();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((vat) obj3).q((ajfz) it2.next());
                    }
                    list.clear();
                    ((vat) obj3).l = true;
                    break;
                }
                return;
            case 3:
                Throwable th = (Throwable) obj;
                yno.fQ(((xsc) this.a).b, "Error retrieving AssetItemUsageStateEntityModel, error = ".concat(String.valueOf(th.getLocalizedMessage())), th);
                return;
            case 4:
                ajgc ajgcVarF = ((ajgd) obj).d();
                ajgcVarF.an(ajgf.ASSET_ITEM_USAGE_STATE_USED);
                xsc.al(ajgcVarF, this.a);
                return;
            case 5:
                ajfu ajfuVar = (ajfu) ((weo) obj).c;
                vbp vbpVar = (vbp) this.a;
                vbpVar.k = "";
                if (ajfuVar != null && !ajfuVar.getSelectedAssetIds().isEmpty() && ajfuVar.getAssetItemSelectedState() == ajga.ASSET_ITEM_SELECTED_STATE_SELECTED) {
                    vbpVar.k = ((ajfv) ajfuVar.getSelectedAssetIds().get(0)).c;
                }
                if (vbpVar.k.isEmpty()) {
                    vbpVar.e.a();
                    return;
                } else {
                    vbpVar.e.b();
                    return;
                }
            case 6:
                apji apjiVar = (apji) obj;
                aihl aihlVar = apxd.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                boolean zN = apjiVar.j.n(aihlVarCheckIsLite.d);
                Object obj4 = this.a;
                if (zN) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    ((vbp) obj4).j = agke.n(((apxc) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b);
                    return;
                }
                zvl zvlVar = ((vbp) obj4).b;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 40;
                zvjVarA.i = 258;
                zvjVarA.d("[Creation][Android][Effects]Renderer missing ShortsSwipeAssetRenderer extension.");
                zvlVar.a(zvjVarA.a());
                return;
            case 7:
                boolean zContains = ((Set) obj).contains(akha.CREATION_FEATURE_COLOR_FILTERS);
                Object obj5 = this.a;
                if (!zContains) {
                    ((vbp) obj5).m = false;
                    return;
                }
                vbp vbpVar2 = (vbp) obj5;
                vbpVar2.m = true;
                vbpVar2.l(false);
                return;
            case 8:
                this.a.invoke(obj);
                return;
            case 9:
                this.a.invoke(obj);
                return;
            case 10:
                agke agkeVar = (agke) Collection.EL.stream((agke) obj).filter(new uvm(6)).filter(new uvm(7)).filter(new uvm(8)).map(new ush(17)).collect(aghu.a);
                if (agkeVar.isEmpty()) {
                    return;
                }
                if (agkeVar.size() > 1) {
                    Log.e(vjx.a, "Unexpected: Found more than one promptStickerButtonRenderer");
                }
                if ((((ajnf) agkeVar.get(0)).b & SemanticState.Multiline) != 0) {
                    ajwo ajwoVar = ((ajnf) agkeVar.get(0)).s;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    ((vjx) this.a).b = Optional.of(ajwoVar);
                }
                Optional.of((ajnf) agkeVar.get(0));
                return;
            case 11:
                this.a.invoke(obj);
                return;
            case 12:
                this.a.invoke(obj);
                return;
            case 13:
                agev agevVar = (agev) obj;
                boolean zG = agevVar.g();
                if (zG && ((vob) agevVar.c()).F()) {
                    z = true;
                }
                wwb wwbVar = ((vna) this.a).t;
                if (wwbVar.e != zG || wwbVar.f != z) {
                    wwbVar.e = zG;
                    wwbVar.f = z;
                    Iterator it3 = wwbVar.a.iterator();
                    while (it3.hasNext()) {
                        ((wwa) it3.next()).d();
                    }
                }
                if (!zG) {
                    wwbVar.b();
                    return;
                }
                if (z) {
                    if (wwbVar.b != 1) {
                        wwbVar.b = 1;
                        if (wwbVar.c) {
                            return;
                        }
                        Iterator it4 = wwbVar.a.iterator();
                        while (it4.hasNext()) {
                            ((wwa) it4.next()).c();
                        }
                        return;
                    }
                    return;
                }
                if (wwbVar.b == 1) {
                    wwbVar.b = 2;
                    if (wwbVar.c) {
                        return;
                    }
                    Iterator it5 = wwbVar.a.iterator();
                    while (it5.hasNext()) {
                        ((wwa) it5.next()).b();
                    }
                    return;
                }
                return;
            case 14:
                ((vnr) this.a).n = (Optional) obj;
                return;
            case 15:
                vnr vnrVar = (vnr) this.a;
                afwv afwvVar = vnrVar.z;
                vqc vqcVar = (vqc) obj;
                Object obj6 = afwvVar.b;
                Optional optional = (Optional) obj6;
                Object objOfNullable = obj6;
                if (true == optional.isPresent()) {
                    objOfNullable = Optional.ofNullable(Integer.valueOf(((avju) optional.get()).b));
                }
                int iIntValue = ((Integer) ((Optional) objOfNullable).orElse(0)).intValue();
                Optional optionalF = vnrVar.f();
                if (optionalF.isEmpty()) {
                    return;
                }
                np npVar = ((RecyclerView) optionalF.get()).n;
                if (npVar instanceof LinearScrollToItemLayoutManager) {
                    LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = (LinearScrollToItemLayoutManager) npVar;
                    if (afwvVar.e()) {
                        ((vpt) afwvVar.c).r();
                    }
                    int i2 = vqcVar.b;
                    Optional optional2 = vqcVar.c;
                    if (optional2.isPresent() && !((String) optional2.get()).isEmpty()) {
                        vro vroVar = vnrVar.m;
                        if (vroVar instanceof vrx) {
                            vrx vrxVar = (vrx) vroVar;
                            ?? r13 = optional2.get();
                            int i3 = -1;
                            if (vrxVar.h != null && !TextUtils.isEmpty(r13) && (adlqVar = vrxVar.h.j) != null) {
                                for (int i4 = 0; i4 < adlqVar.a(); i4++) {
                                    Object objD = adlqVar.d(i4);
                                    if (objD instanceof acxm) {
                                        akro akroVar = ((acxm) objD).a.c;
                                        if (akroVar == null) {
                                            akroVar = akro.a;
                                        }
                                        if ((akroVar.b & 16777216) != 0) {
                                            str = akroVar.i;
                                        } else {
                                            str = null;
                                        }
                                    } else if (objD instanceof akrn) {
                                        akrn akrnVar = (akrn) objD;
                                        akro akroVar2 = akrnVar.c;
                                        if (akroVar2 == null) {
                                            akroVar2 = akro.a;
                                        }
                                        if ((akroVar2.b & 16777216) != 0) {
                                            akro akroVar3 = akrnVar.c;
                                            if (akroVar3 == null) {
                                                akroVar3 = akro.a;
                                            }
                                            str = akroVar3.i;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (((String) r13).equals(str)) {
                                        i3 = i4;
                                    }
                                }
                            }
                            if (i3 >= 0) {
                                i2 = i3;
                            }
                        }
                    }
                    if (vnrVar.t.l(3, 45368918L, false) && vnrVar.ae()) {
                        vps vpsVar = vnrVar.c;
                        if (!vpsVar.q()) {
                            vpsVar.o(new vno(linearScrollToItemLayoutManager, optionalF, i2, iIntValue));
                            return;
                        }
                    }
                    linearScrollToItemLayoutManager.b((RecyclerView) optionalF.get(), i2, iIntValue);
                    return;
                }
                return;
            case 16:
                GradientDrawable gradientDrawable = new GradientDrawable();
                weh wehVar = ((weo) obj).c;
                if (wehVar == null || !(wehVar instanceof ambs)) {
                    return;
                }
                Object obj7 = this.a;
                int iIntValue2 = ((ambs) wehVar).getValue().intValue();
                gradientDrawable.setColor(iIntValue2);
                ((vor) obj7).C(gradientDrawable, iIntValue2);
                return;
            case 17:
                vor vorVar = (vor) this.a;
                tss tssVar = vorVar.t;
                if (tssVar == null || tssVar.b()) {
                    vorVar.M(true);
                    return;
                }
                return;
            case 18:
                ((vor) this.a).o = ((Integer) obj).intValue();
                return;
            case 19:
                ajmm ajmmVar = (ajmm) obj;
                vnr vnrVar2 = ((vos) this.a).d;
                if (vnrVar2 != null) {
                    vnrVar2.U(ajmmVar);
                    return;
                }
                return;
            default:
                tzk.D(new tss((View) this.a), ((Float) obj).floatValue());
                return;
        }
    }
}
