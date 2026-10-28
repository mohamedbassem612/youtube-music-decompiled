package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vry extends vrk {
    public final vnr d;
    private final Context e;
    private final xgn f;
    private FrameLayout g;
    private adhf h;
    private adgy i;
    private final adyc j;
    private final aeod k;

    public vry(Context context, aeod aeodVar, adyc adycVar, vnr vnrVar, xgn xgnVar) {
        this.e = context;
        this.k = aeodVar;
        this.j = adycVar;
        this.d = vnrVar;
        this.f = xgnVar;
    }

    private final void y() {
        adhf adhfVar = this.h;
        if (adhfVar != null) {
            adgy adgyVar = this.i;
            if (adgyVar != null) {
                adgyVar.a.b(null);
                adgyVar.e();
                vxz vxzVar = adgyVar.e;
                if (vxzVar.l(31, 45412668L, false)) {
                    adgyVar.b.a = false;
                }
                if (vxzVar.l(32, 45412673L, false)) {
                    adgyVar.c.removeAllViews();
                    adgyVar.d = false;
                }
            }
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.k.g(adhfVar);
            this.h = null;
        }
    }

    @Override // defpackage.vox
    public final void c() {
        adhf adhfVar = this.h;
        if (adhfVar != null) {
            String str = adhfVar.g;
            if (!str.isEmpty()) {
                wer werVarE = adhfVar.b.e();
                werVarE.j(str);
                werVarE.b().G();
            }
        }
        y();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vox
    public final void d() {
        adhf adhfVar = this.h;
        if (adhfVar != null) {
            Map map = adhfVar.d;
            Optional optionalOfNullable = adhfVar.k;
            adha adhaVar = new adha(map, 2);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable((alae) adhaVar.a.get(optionalOfNullable.get()));
            }
            if (optionalOfNullable.isPresent() && (((alae) optionalOfNullable.get()).b & 64) != 0) {
                vxe vxeVar = adhfVar.a;
                ajwo ajwoVar = ((alae) optionalOfNullable.get()).i;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            if (adhfVar.j.isPresent()) {
                adhfVar.a.a((ajwo) adhfVar.j.get());
            }
            adhfVar.d();
        }
    }

    @Override // defpackage.vox
    public final void f() {
        adhf adhfVar = this.h;
        if (adhfVar != null) {
            adhfVar.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.vrk, defpackage.vro
    public final /* bridge */ /* synthetic */ void j(Object obj, boolean z, adxd adxdVar) {
        akzv akzvVar = (akzv) obj;
        super.j(akzvVar, z, adxdVar);
        if (this.g == null) {
            Context context = this.e;
            FrameLayout frameLayout = new FrameLayout(context);
            this.g = frameLayout;
            frameLayout.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            this.g.setClickable(true);
        }
        FrameLayout frameLayout2 = this.g;
        frameLayout2.getClass();
        y();
        if (akzvVar != null) {
            adyc adycVar = this.j;
            Optional optionalOf = Optional.of(this);
            xgn xgnVar = this.f;
            Context context2 = (Context) adycVar.d.io();
            context2.getClass();
            ?? Io = adycVar.e.io();
            Io.getClass();
            acxt acxtVar = (acxt) adycVar.f.io();
            acxtVar.getClass();
            adhg adhgVar = (adhg) adycVar.c.io();
            vxz vxzVar = (vxz) adycVar.a.io();
            vxzVar.getClass();
            adgy adgyVar = new adgy(context2, Io, acxtVar, adhgVar, vxzVar, (adif) adycVar.b.io(), akzvVar, this, this, optionalOf, xgnVar);
            acxt acxtVar2 = adgyVar.a;
            vxz vxzVar2 = adgyVar.e;
            View viewA = acxtVar2.a();
            if (vxzVar2.l(32, 45412673L, false)) {
                if (!adgyVar.d && viewA.getParent() == null) {
                    adgyVar.c.addView(viewA);
                    adgyVar.d = true;
                }
                viewA = adgyVar.c;
            }
            frameLayout2.addView(viewA);
            adhf adhfVarE = this.k.e(akzvVar, adgyVar);
            this.h = adhfVarE;
            adhfVarE.c();
            this.i = adgyVar;
        }
    }

    @Override // defpackage.vro
    public final View k() {
        FrameLayout frameLayout = this.g;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.vro
    public final agev l() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final agev m() {
        return agdf.a;
    }

    public final void p() {
        this.d.W();
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    public final void u(akrn akrnVar) {
        aihf aihfVarCreateBuilder = aksk.a.createBuilder();
        if (akrnVar != null) {
            aihh aihhVar = (aihh) apji.a.createBuilder();
            aihhVar.e(akrs.a, akrnVar);
            apji apjiVar = (apji) aihhVar.build();
            aihfVarCreateBuilder.copyOnWrite();
            aksk akskVar = (aksk) aihfVarCreateBuilder.instance;
            apjiVar.getClass();
            akskVar.c = apjiVar;
            akskVar.b |= 1;
        }
        this.d.X((aksk) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }

    public final void w(akrn akrnVar) {
        if (akrnVar != null) {
            vnr vnrVar = this.d;
            aihf aihfVarCreateBuilder = akui.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akui akuiVar = (akui) aihfVarCreateBuilder.instance;
            akuiVar.c = akrnVar;
            akuiVar.b = 153515154;
            vnrVar.g((akui) aihfVarCreateBuilder.build(), true);
        }
    }

    public final void x(alag alagVar) {
        aihf aihfVarCreateBuilder = akuo.a.createBuilder();
        alay alayVar = alagVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        akuo akuoVar = (akuo) aihfVarCreateBuilder.instance;
        alayVar.getClass();
        akuoVar.e = alayVar;
        akuoVar.b |= 2;
        if ((alagVar.b & 2) != 0) {
            alay alayVar2 = alagVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            akuo akuoVar2 = (akuo) aihfVarCreateBuilder.instance;
            alayVar2.getClass();
            akuoVar2.i = alayVar2;
            akuoVar2.b |= 32;
        }
        if ((alagVar.b & 4) != 0) {
            apji apjiVar = alagVar.e;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            akuo akuoVar3 = (akuo) aihfVarCreateBuilder.instance;
            apjiVar.getClass();
            akuoVar3.q = apjiVar;
            akuoVar3.b |= 2097152;
        }
        if ((alagVar.b & 8) != 0) {
            apji apjiVar2 = alagVar.g;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            anfy anfyVar = (anfy) aavv.s(apjiVar2, angi.a);
            if (anfyVar != null) {
                aihf aihfVarCreateBuilder2 = akup.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                akup akupVar = (akup) aihfVarCreateBuilder2.instance;
                akupVar.c = anfyVar;
                akupVar.b = 66439850;
                akup akupVar2 = (akup) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                akuo akuoVar4 = (akuo) aihfVarCreateBuilder.instance;
                akupVar2.getClass();
                akuoVar4.h = akupVar2;
                akuoVar4.b |= 16;
            }
        }
        if (alagVar.f.size() == 1) {
            apji apjiVar3 = (apji) alagVar.f.get(0);
            aihfVarCreateBuilder.copyOnWrite();
            akuo akuoVar5 = (akuo) aihfVarCreateBuilder.instance;
            apjiVar3.getClass();
            akuoVar5.j = apjiVar3;
            akuoVar5.b |= 64;
        } else if (alagVar.f.size() > 1) {
            for (apji apjiVar4 : alagVar.f) {
                aihfVarCreateBuilder.copyOnWrite();
                akuo akuoVar6 = (akuo) aihfVarCreateBuilder.instance;
                apjiVar4.getClass();
                aiie aiieVar = akuoVar6.k;
                if (!aiieVar.c()) {
                    akuoVar6.k = aihn.mutableCopy(aiieVar);
                }
                akuoVar6.k.add(apjiVar4);
            }
        }
        vnr vnrVar = this.d;
        aihf aihfVarCreateBuilder3 = akui.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        akui akuiVar = (akui) aihfVarCreateBuilder3.instance;
        akuo akuoVar7 = (akuo) aihfVarCreateBuilder.build();
        akuoVar7.getClass();
        akuiVar.c = akuoVar7;
        akuiVar.b = 138681548;
        vnrVar.g((akui) aihfVarCreateBuilder3.build(), true);
    }

    @Override // defpackage.vox
    public final void b() {
    }

    @Override // defpackage.vro
    public final void hP() {
    }

    @Override // defpackage.vro
    public final void o() {
    }

    @Override // defpackage.vro
    public final void q() {
    }

    @Override // defpackage.vro
    public final void r() {
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
    }
}
