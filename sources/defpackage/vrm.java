package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrm extends vrk {
    public final Context d;
    public final zwb e;
    public final vxe f;
    public final LoadingFrameLayout g;
    public final xgn h;
    public FrameLayout i;
    public Optional j = Optional.empty();
    public boolean k = false;
    private final cf l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private final awmd p;
    private final xit q;
    private LinearLayout r;
    private FrameLayout s;

    public vrm(Context context, cf cfVar, zwb zwbVar, vxe vxeVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, xit xitVar, LoadingFrameLayout loadingFrameLayout, xgn xgnVar) {
        this.d = context;
        this.l = cfVar;
        this.e = zwbVar;
        this.f = vxeVar;
        this.m = awmdVar;
        this.n = awmdVar2;
        this.o = awmdVar3;
        this.p = awmdVar4;
        this.q = xitVar;
        this.g = loadingFrameLayout;
        this.h = xgnVar;
    }

    private final void w() {
        if (this.r == null) {
            Context context = this.d;
            LinearLayout linearLayout = new LinearLayout(context);
            this.r = linearLayout;
            linearLayout.setOrientation(1);
            this.r.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            FrameLayout frameLayout = new FrameLayout(context);
            this.s = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.r.addView(this.s);
            this.i = new FrameLayout(context);
            this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            this.r.addView(this.i);
        }
    }

    private final void x() {
        Optional optional = this.j;
        vrl vrlVar = new vrl(this, 0);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = vrlVar.a;
            ((aehd) obj).a();
            vrm vrmVar = (vrm) obj2;
            vrmVar.j = Optional.empty();
            vrmVar.k = false;
        }
    }

    @Override // defpackage.vox
    public final void b() {
        Object obj = this.b;
        if (obj != null) {
            aitl aitlVar = (aitl) obj;
            if ((aitlVar.b & SemanticState.LiveRegion) != 0) {
                vxe vxeVar = this.f;
                ajwo ajwoVar = aitlVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
        }
    }

    @Override // defpackage.vox
    public final void c() {
        FrameLayout frameLayout = this.s;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        x();
    }

    @Override // defpackage.vox
    public final void d() {
        Object obj = this.b;
        if (obj == null || !((aitl) obj).e) {
            return;
        }
        x();
    }

    @Override // defpackage.vox
    public final void f() {
        if (this.k) {
            return;
        }
        j((aitl) this.b, false, null);
    }

    @Override // defpackage.vro
    public final View k() {
        w();
        LinearLayout linearLayout = this.r;
        linearLayout.getClass();
        return linearLayout;
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
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajvj.b;
        aihf aihfVarCreateBuilder = ajvj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajvj ajvjVar = (ajvj) aihfVarCreateBuilder.instance;
        ajvjVar.c |= 2;
        ajvjVar.d = true;
        aihhVar.e(aihlVar, (ajvj) aihfVarCreateBuilder.build());
        this.f.a((ajwo) aihhVar.build());
        ((hed) this.p.io()).a().am().D(new vqe(4), avoi.e, avoi.c);
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.vrk, defpackage.vro
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void j(aitl aitlVar, boolean z, adxd adxdVar) {
        agev agevVarI;
        aiwg aiwgVar;
        super.j(aitlVar, z, adxdVar);
        w();
        this.r.getClass();
        FrameLayout frameLayout = this.s;
        frameLayout.getClass();
        this.i.getClass();
        frameLayout.removeAllViews();
        this.i.removeAllViews();
        x();
        this.b = aitlVar;
        if (aitlVar != null) {
            int i = aitlVar.b & 1;
            FrameLayout frameLayout2 = this.s;
            arkm arkmVar = null;
            if (i != 0) {
                frameLayout2.setVisibility(0);
                apji apjiVar = aitlVar.c;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVar = aiwg.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = aitlVar.c;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    aiwgVar = (aiwg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                } else {
                    aiwgVar = null;
                }
                FrameLayout frameLayout3 = this.s;
                xxj xxjVar = new xxj(this, null);
                View viewInflate = LayoutInflater.from(frameLayout3.getContext()).inflate(R.layout.ads_webview_header_layout, (ViewGroup) frameLayout3, true);
                ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.close_button);
                if (imageButton != null) {
                    imageButton.setOnClickListener(new aefn(xxjVar, 2));
                }
                View viewFindViewById = viewInflate.findViewById(R.id.bottom_divider);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility((aiwgVar == null || !aiwgVar.c) ? 0 : 8);
                }
            } else {
                frameLayout2.setVisibility(8);
            }
            if ((aitlVar.b & 2) != 0) {
                apji apjiVar3 = aitlVar.d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVar2 = arkn.a;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    apji apjiVar4 = aitlVar.d;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    apjiVar4.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    arkmVar = (arkm) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                }
            }
            arkm arkmVar2 = arkmVar;
            if (arkmVar2 != null) {
                this.j = Optional.of((aehd) this.m.io());
                xir xirVarO = this.q.o(184);
                if (arkmVar2.f == 62) {
                    axlj axljVar = (axlj) this.o.io();
                    cf cfVar = this.l;
                    vlj vljVar = new vlj(this, 9);
                    acwd acwdVar = (acwd) axljVar.c.io();
                    acwdVar.getClass();
                    vxz vxzVar = (vxz) axljVar.b.io();
                    vxzVar.getClass();
                    vxe vxeVar = (vxe) axljVar.a.io();
                    vxeVar.getClass();
                    agevVarI = agev.i(new aehu(arkmVar2, cfVar, vljVar, acwdVar, vxzVar, vxeVar));
                } else {
                    agevVarI = agev.i(((lqa) this.n.io()).I(arkmVar2, this.h));
                }
                agev agevVar = agevVarI;
                Optional optional = this.j;
                hqe hqeVar = new hqe(this, arkmVar2, agevVar, xirVarO, 2);
                if (true == optional.isPresent()) {
                    Object obj = optional.get();
                    Object obj2 = hqeVar.a;
                    Object obj3 = hqeVar.b;
                    Object obj4 = hqeVar.d;
                    ?? r0 = hqeVar.c;
                    vrm vrmVar = (vrm) obj2;
                    FrameLayout frameLayout4 = vrmVar.i;
                    frameLayout4.getClass();
                    ((aehd) obj).d(vrmVar.d, (arkm) obj3, frameLayout4, vrmVar.e.e(), vrmVar.f, new aehe((aehi) ((agfa) obj4).a, vrmVar.g, vrmVar.h, r0));
                }
                this.k = true;
            }
        }
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
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
