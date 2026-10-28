package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adyr {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/ui/bottomsheet/MenuBottomSheetController");
    private final cf b;
    private final vxe c;
    private final aduv d;
    private final xgm e;
    private final aunn f;
    private final aeda g;
    private final adxl h;
    private final awmd i;
    private final awmd j;
    private final vxz k;
    private final vxz l;
    private final vxz m;
    private final vxz n;
    private final ahek o;
    private final hef p;
    private final aeod q;
    private final jnj r;
    private final abfv s;

    public adyr(cf cfVar, vxe vxeVar, aduv aduvVar, xgm xgmVar, aeod aeodVar, jnj jnjVar, aunn aunnVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, aeda aedaVar, hef hefVar, abfv abfvVar, adxl adxlVar, awmd awmdVar, awmd awmdVar2, ahek ahekVar, vxz vxzVar4) {
        this.b = cfVar;
        this.c = vxeVar;
        this.d = aduvVar;
        this.e = xgmVar;
        this.q = aeodVar;
        this.r = jnjVar;
        this.f = aunnVar;
        this.k = vxzVar;
        this.l = vxzVar2;
        this.m = vxzVar3;
        this.g = aedaVar;
        this.p = hefVar;
        this.s = abfvVar;
        this.h = adxlVar;
        this.i = awmdVar;
        this.j = awmdVar2;
        this.o = ahekVar;
        this.n = vxzVar4;
    }

    public final void a(adyq adyqVar) {
        vxz vxzVar;
        boolean zB = this.g.b();
        aebi aebiVar = (aebi) this.i.io();
        vxe vxeVar = this.c;
        anfy anfyVar = adyqVar.a;
        if (anfyVar.i && (anfyVar.b & 131072) != 0) {
            ajwo ajwoVar = anfyVar.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
            return;
        }
        vxz vxzVar2 = this.m;
        cf cfVar = this.b;
        if (vxzVar2 != null && !cfVar.getLifecycle().a().a(bob.e)) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/rendering/ui/bottomsheet/MenuBottomSheetController", "showMenuBottomSheet", 322, "MenuBottomSheetController.java")).t("Bottom Sheet show called before fragment is in resume state");
            zvp.a(zvn.a, zvm.B, "Bottom Sheet show called before Fragment is in resume state");
            return;
        }
        xgm adymVar = this.e;
        if (adymVar == null) {
            adymVar = new adym(0);
        }
        agkj agkjVar = adyqVar.b;
        hef hefVar = this.p;
        jnj jnjVar = this.r;
        axlj axljVar = new axlj(vxeVar, (Map) agkjVar, adymVar);
        if (aecm.x(anfyVar, null, hefVar, jnjVar)) {
            aihf builder = anfyVar.toBuilder();
            agke agkeVarW = aecm.w(anfyVar, null, hefVar, jnjVar);
            builder.copyOnWrite();
            ((anfy) builder.instance).c = anfy.emptyProtobufList();
            builder.bH(agkeVarW);
            anfyVar = (anfy) builder.build();
        }
        ajwo ajwoVar2 = adyqVar.d;
        ahgr ahgrVar = new ahgr(null, null);
        if (ajwoVar2 != null && (vxzVar = this.k) != null && vxzVar.l(33, 45414861L, false)) {
            ahgrVar.d(ajwoVar2);
        }
        boolean z = adyqVar.c;
        vxz vxzVar3 = this.n;
        ahek ahekVar = this.o;
        awmd awmdVar = this.j;
        adxl adxlVar = this.h;
        vxz vxzVar4 = this.l;
        abfv abfvVar = this.s;
        aunn aunnVar = this.f;
        aeod aeodVar = this.q;
        aduv aduvVar = this.d;
        adyy adyyVarB = aeodVar.b(ahgrVar.c());
        adyn adynVar = new adyn(adyyVarB, 0);
        adys adysVar = new adys();
        adysVar.v = jnjVar;
        adysVar.n = z;
        adysVar.l = aunnVar;
        adysVar.w = abfvVar;
        adysVar.s = vxzVar4;
        adysVar.t = vxzVar3;
        adysVar.o = aebiVar;
        adysVar.p = awmdVar;
        adysVar.u = ahekVar;
        adysVar.q = adxlVar;
        adysVar.r = zB;
        if (anfyVar != null) {
            Bundle bundle = new Bundle();
            ahng.aG(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", anfyVar);
            adysVar.setArguments(bundle);
        }
        aduvVar.getClass();
        adysVar.k = aduvVar;
        adysVar.setRetainInstance(true);
        adysVar.m = adynVar.hB();
        adysVar.x(adyyVarB);
        if (agkjVar != null && agkjVar.containsKey("VIDEO_QUALITY_DETAIL_TEXT")) {
            Bundle arguments = adysVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                adysVar.setArguments(arguments);
            }
            Object obj = agkjVar.get("VIDEO_QUALITY_DETAIL_TEXT");
            if (obj != null) {
                arguments.putString("VIDEO_QUALITY_DETAIL_TEXT", obj.toString());
            }
        }
        adysVar.S = vxzVar3;
        adysVar.x = axljVar;
        adysVar.h(cfVar.getSupportFragmentManager(), "MenuSheetDialogFragment");
    }
}
