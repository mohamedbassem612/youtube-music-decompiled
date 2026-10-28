package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RadioButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vqd implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public vqd(View.OnClickListener onClickListener, addn addnVar, int i) {
        this.$cid = i;
        this.b = onClickListener;
        this.a = addnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cc ccVarG;
        Bitmap bitmap = null;
        switch (this.$cid) {
            case 0:
                vqg vqgVar = (vqg) this.a;
                if (vqgVar.r.g()) {
                    ((vng) vqgVar.r.c()).c();
                } else {
                    vqgVar.v(true);
                }
                Object obj = this.b;
                Animation animation = vqgVar.g;
                animation.getClass();
                ((TextView) obj).startAnimation(animation);
                if (vqgVar.l.g()) {
                    vqgVar.k.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, vqgVar.l.c(), null);
                }
                break;
            case 1:
                ((vpk) this.b).a.a((ajwo) this.a);
                break;
            case 2:
                wzn wznVar = (wzn) this.b;
                wwh wwhVar = wznVar.v;
                if (wwhVar != null) {
                    wwhVar.i((anfv) this.a);
                }
                wznVar.dismiss();
                break;
            case 3:
                ajwo ajwoVar = ((ajnf) this.a).q;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((wzt) this.b).c.a(ajwoVar);
                break;
            case 4:
                apji apjiVar = ((amou) this.a).f;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                ajwo ajwoVar2 = ((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).r;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                ((wzt) this.b).c.a(ajwoVar2);
                break;
            case 5:
                ajwo ajwoVar3 = ((ajnf) this.a).r;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                ((wzx) this.b).b.c(ajwoVar3, null);
                break;
            case 6:
                ampe ampeVar = (ampe) this.a;
                if ((ampeVar.b & 16) != 0) {
                    vxe vxeVarD = ((xag) this.b).d();
                    ajwo ajwoVar4 = ampeVar.h;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    vxeVarD.c(ajwoVar4, null);
                }
                break;
            case 7:
                tuk.o(((xbf) this.b).f(), ((amop) this.a).e, 0);
                break;
            case 8:
                ((xbf) this.b).m.h((ajnf) this.a);
                break;
            case 9:
                xbf xbfVar = (xbf) this.b;
                tuk.i(xbfVar.x());
                wxl wxlVar = xbfVar.m;
                if (wxlVar != null) {
                    wxlVar.d();
                }
                Object obj2 = this.a;
                xgn xgnVar = xbfVar.c;
                vxe vxeVar = xbfVar.d;
                agkj agkjVarJ = agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar);
                ajwo ajwoVar5 = ((amop) obj2).j;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                vxeVar.c(ajwoVar5, agkjVarJ);
                xbfVar.o.g();
                xbfVar.I();
                break;
            case 10:
                ((xbf) this.b).m.o((ajwo) this.a);
                break;
            case 11:
                ajnf ajnfVar = (ajnf) this.a;
                int i = ajnfVar.b & SemanticState.Obscured;
                Object obj3 = this.b;
                if (i != 0) {
                    wxl wxlVar2 = ((xbf) obj3).m;
                    ajwo ajwoVar6 = ajnfVar.r;
                    if (ajwoVar6 == null) {
                        ajwoVar6 = ajwo.a;
                    }
                    wxlVar2.o(ajwoVar6);
                }
                if ((ajnfVar.b & SemanticState.Modal) != 0) {
                    wxl wxlVar3 = ((xbf) obj3).m;
                    ajwo ajwoVar7 = ajnfVar.q;
                    if (ajwoVar7 == null) {
                        ajwoVar7 = ajwo.a;
                    }
                    wxlVar3.o(ajwoVar7);
                }
                if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                    wxl wxlVar4 = ((xbf) obj3).m;
                    ajwo ajwoVar8 = ajnfVar.s;
                    if (ajwoVar8 == null) {
                        ajwoVar8 = ajwo.a;
                    }
                    wxlVar4.o(ajwoVar8);
                }
                break;
            case 12:
                wxl wxlVar5 = ((xbf) this.b).m;
                ajwo ajwoVar9 = ((amqt) this.a).f;
                if (ajwoVar9 == null) {
                    ajwoVar9 = ajwo.a;
                }
                wxlVar5.o(ajwoVar9);
                break;
            case 13:
                ajwo ajwoVar10 = ((ajnf) this.a).s;
                if (ajwoVar10 == null) {
                    ajwoVar10 = ajwo.a;
                }
                ((xbw) this.b).c.c(ajwoVar10, null);
                break;
            case 14:
                xcp xcpVar = (xcp) this.a;
                ajwo ajwoVar11 = xcpVar.h;
                if (ajwoVar11 != null) {
                    if (xcpVar.k) {
                        xcpVar.i = true;
                        Object obj4 = xcpVar.l.a;
                        xbw xbwVar = (xbw) obj4;
                        ahew ahewVar = xbwVar.p;
                        if (ahewVar != null) {
                            ahewVar.cancel(false);
                        }
                        xbwVar.p = xbwVar.i.schedule(xbwVar.h, 2000L, TimeUnit.MILLISECONDS);
                        Iterator it = xbwVar.g.iterator();
                        while (it.hasNext()) {
                            ((xcp) it.next()).a.setClickable(false);
                        }
                        Object obj5 = this.b;
                        HashMap map = new HashMap();
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xbwVar.d);
                        map.put("live_chat_poll_error_listener_key", obj4);
                        xbwVar.c.c(ajwoVar11, map);
                        xbwVar.t = true;
                        xcpVar.e.setVisibility(0);
                        Context context = (Context) obj5;
                        xcpVar.d.setStroke(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_modern_polls_selected_choice_stroke_width), tzk.i(context, R.attr.ytStaticBrandWhite));
                        RadioButton radioButton = xcpVar.g;
                        if (radioButton != null) {
                            radioButton.setVisibility(8);
                        }
                    } else if (xcpVar.j) {
                        ((xbw) xcpVar.l.a).c.a(ajwoVar11);
                    }
                }
                break;
            case 15:
                xsh xshVar = (xsh) this.a;
                xsj xsjVar = xshVar.c;
                xgx xgxVar = xsjVar.G;
                xhb.b(210361);
                xsjVar.y(xgxVar);
                boolean zL = xshVar.j.l(254, 45835026L, false);
                Object obj6 = this.b;
                if (!zL && (ccVarG = ((cf) obj6).getSupportFragmentManager().g("DevicePickerDialogFragment")) != null) {
                    zdj zdjVar = (zdj) xshVar.h.io();
                    agrf agrfVar = twm.a;
                    View view2 = ccVarG.getView();
                    if (view2 == null) {
                        ((agrc) ((agrc) twm.a.b()).k("com/google/android/libraries/youtube/common/util/DisplayUtil", "getMenuScreenshot", 870, "DisplayUtil.java")).t("Couldn't capture screenshot, fragment.getView() view is null.");
                    } else {
                        boolean zIsDrawingCacheEnabled = view2.isDrawingCacheEnabled();
                        view2.setDrawingCacheEnabled(true);
                        Bitmap drawingCache = view2.getDrawingCache();
                        if (drawingCache != null) {
                            drawingCache = twm.n(drawingCache, 0);
                        }
                        if (!zIsDrawingCacheEnabled) {
                            view2.setDrawingCacheEnabled(false);
                            view2.destroyDrawingCache();
                        }
                        bitmap = drawingCache;
                    }
                    if (bitmap != null) {
                        zdjVar.b = bitmap;
                    }
                }
                cf cfVar = (cf) obj6;
                xshVar.h(cfVar, 3);
                dd supportFragmentManager = cfVar.getSupportFragmentManager();
                if (supportFragmentManager != null && supportFragmentManager.g("DevicePickerOverflowMenuFragment") == null) {
                    xsu xsuVar = new xsu();
                    xsuVar.S = xshVar.k;
                    xsuVar.h(supportFragmentManager, "DevicePickerOverflowMenuFragment");
                    break;
                }
                break;
            case 16:
                Object obj7 = this.b;
                xtv xtvVar = (xtv) this.a;
                xtvVar.p((Intent) obj7);
                xtvVar.o(xtvVar.y);
                break;
            case 17:
                ((abmc) this.b).c((arnj) this.a);
                break;
            case 18:
                ((abmc) this.b).c((arnj) this.a);
                break;
            case 19:
                ajnf ajnfVar2 = (ajnf) this.a;
                int i2 = ajnfVar2.b & 2097152;
                Object obj8 = this.b;
                if (i2 != 0) {
                    ((acmg) obj8).a.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajnfVar2.y, (amud) null), null);
                }
                vxe vxeVar2 = ((acmg) obj8).c;
                ajwo ajwoVar12 = ajnfVar2.s;
                if (ajwoVar12 == null) {
                    ajwoVar12 = ajwo.a;
                }
                vxeVar2.a(ajwoVar12);
                break;
            default:
                ?? r0 = this.b;
                if (r0 != 0) {
                    r0.onClick(view);
                }
                ((addn) this.a).d();
                break;
        }
    }

    public /* synthetic */ vqd(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = aihnVar;
    }

    public /* synthetic */ vqd(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public vqd(wzx wzxVar, ajnf ajnfVar, int i) {
        this.$cid = i;
        this.a = ajnfVar;
        this.b = wzxVar;
    }
}
