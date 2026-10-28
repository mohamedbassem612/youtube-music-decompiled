package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.creation.common.ui.CreationFeatureDescriptionView;
import com.google.android.libraries.youtube.creation.common.ui.RoundedCornersEditText;
import com.google.android.libraries.youtube.creation.common.ui.ShortsEditTooltipButtonView;
import com.google.android.libraries.youtube.creation.common.ui.toolbelt.ToolbarView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukd implements uvw {
    public final awmd a;
    public final ukp b;
    public final ulp c;
    public final avmm d;
    public unh f;
    public final uvz g;
    private final Executor h;
    private final una i;
    private final uma j;
    private final ShortsPlayerView k;
    private final uwb l;
    private final View m;
    private final int n;
    private final ulx o;
    private final ufs p;
    private final Optional q;
    private final uvy s;
    private final umf t;
    private final umu u;
    private atzv r = atzv.a;
    public boolean e = true;

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [awmd, java.lang.Object] */
    public ukd(Executor executor, uvz uvzVar, ukp ukpVar, umf umfVar, xsc xscVar, aczl aczlVar, xte xteVar, Context context, ukc ukcVar) {
        this.h = executor;
        this.g = uvzVar;
        this.b = ukpVar;
        this.t = umfVar;
        this.l = ukcVar.a;
        awmd awmdVar = ukcVar.d;
        this.a = awmdVar;
        ulp ulpVar = ukcVar.b;
        this.c = ulpVar;
        this.i = ukcVar.c;
        View view = ukcVar.e;
        roq roqVar = (roq) xscVar.b.io();
        roqVar.getClass();
        aaok aaokVar = (aaok) xscVar.c.io();
        aaokVar.getClass();
        adxj adxjVar = (adxj) xscVar.a.io();
        adxjVar.getClass();
        this.s = new uvy(roqVar, aaokVar, adxjVar, view);
        View view2 = ukcVar.e;
        umt umtVar = ukcVar.h;
        cc ccVar = (cc) ((aupo) aczlVar.e).b;
        ccVar.getClass();
        avmb avmbVar = (avmb) aczlVar.b.io();
        avmbVar.getClass();
        ums umsVar = (ums) aczlVar.g.io();
        umsVar.getClass();
        uyg uygVar = (uyg) aczlVar.d.io();
        vqv vqvVar = (vqv) aczlVar.c.io();
        vqvVar.getClass();
        this.u = new umu(ccVar, avmbVar, aczlVar.f, aczlVar.a, umsVar, uygVar, vqvVar, ulpVar, view2, umtVar);
        this.o = ukcVar.f;
        this.q = ukcVar.g;
        this.p = ukcVar.i;
        this.m = ukcVar.e.findViewById(R.id.shorts_edit_top_bar_container);
        this.k = (ShortsPlayerView) ukcVar.e.findViewById(R.id.shorts_edit_player_view);
        View view3 = ukcVar.e;
        uwf uwfVar = (uwf) awmdVar.io();
        aaok aaokVar2 = (aaok) xteVar.a.io();
        aaokVar2.getClass();
        ulj uljVar = (ulj) xteVar.b.io();
        uljVar.getClass();
        Context context2 = (Context) xteVar.e.io();
        context2.getClass();
        umf umfVar2 = (umf) xteVar.f.io();
        umfVar2.getClass();
        uwfVar.getClass();
        this.j = new uma(aaokVar2, uljVar, context2, umfVar2, view3, uwfVar);
        this.d = new avmm();
        this.n = context.getResources().getDimensionPixelOffset(R.dimen.shorts_edit_guidelines_snapping_distance);
    }

    public final void a() {
        unn unnVar;
        uoa uoaVar;
        this.e = false;
        this.l.b();
        this.m.setVisibility(8);
        this.q.isPresent();
        unh unhVar = this.f;
        if (unhVar == null || (unnVar = unhVar.D) == null || (uoaVar = unnVar.o) == null) {
            return;
        }
        Optional optional = uoaVar.x;
        if (true == optional.isPresent()) {
            ((unr) optional.get()).a(false);
        }
        uoaVar.c(false);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, xgn] */
    public final void b(int i) {
        vbp vbpVar;
        char c;
        String str;
        String str2;
        if ((i == 1 || i == 3) && this.e && !this.o.a && (vbpVar = this.u.k) != null) {
            if (i == 1) {
                c = 1;
            } else if (i != 3) {
                return;
            } else {
                c = 3;
            }
            if (vbpVar.j.isEmpty() || !vbpVar.l) {
                return;
            }
            String str3 = vbpVar.k;
            if (str3.isEmpty()) {
                str3 = ((apxb) vbpVar.j.get(0)).b;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= vbpVar.j.size()) {
                    i2 = -1;
                    break;
                } else if (((apxb) vbpVar.j.get(i2)).b.equals(str3)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = c == 3 ? i2 - 1 : i2 + 1;
                agke agkeVar = vbpVar.j;
                int size = agkeVar.size();
                int i4 = i3 % size;
                if (i4 == 0) {
                    i4 = 0;
                } else if ((((i3 ^ size) >> 31) | 1) <= 0) {
                    i4 += size;
                }
                ajwo ajwoVar = ((apxb) agkeVar.get(i4)).c;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vbpVar.d.a(ajwoVar);
                if (vbpVar.t == null || vbpVar.p == null) {
                    return;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfz.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    ajfy ajfyVar = (ajfy) ((ajfz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d.get(0);
                    str2 = ajfyVar.e;
                    str = ajfyVar.d;
                } else {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajfx.b);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajfx.b);
                        ajwoVar.c(aihlVarCheckIsLite4);
                        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                        str2 = ((ajfx) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).f;
                        str = "no_filter";
                    } else {
                        zvl zvlVar = vbpVar.b;
                        zvj zvjVarA = zvk.a();
                        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                        zvjVarA.j = 40;
                        zvjVarA.i = 258;
                        zvjVarA.d("[Creation][Android][Effects] Swipe command did not contain a recognized extension.");
                        zvlVar.a(zvjVarA.a());
                        str = "unknown";
                        str2 = null;
                    }
                }
                xhc xhcVar = vbpVar.o;
                if (xhcVar != null) {
                    roq roqVar = vbpVar.s;
                    ugo ugoVarK = roqVar.k(xhcVar);
                    ugoVarK.h(true);
                    ugoVarK.c();
                    ?? r5 = roqVar.a;
                    xhc xhcVar2 = vbpVar.o;
                    if (r5 != 0 && xhcVar2 != null) {
                        xgj xgjVar = new xgj(xhcVar2);
                        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE;
                        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = amdu.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        amdu amduVar = (amdu) aihfVarCreateBuilder2.instance;
                        str.getClass();
                        amduVar.b |= 1;
                        amduVar.c = str;
                        aihfVarCreateBuilder.copyOnWrite();
                        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                        amdu amduVar2 = (amdu) aihfVarCreateBuilder2.build();
                        amduVar2.getClass();
                        amddVar.g = amduVar2;
                        amddVar.b |= 8;
                        r5.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                float width = c == 3 ? -vbpVar.p.getWidth() : vbpVar.p.getWidth();
                Object obj = vbpVar.t.a;
                if (obj != null) {
                    int i5 = true == str2.isEmpty() ? 8 : 0;
                    CreationFeatureDescriptionView creationFeatureDescriptionView = (CreationFeatureDescriptionView) obj;
                    TextView textView = creationFeatureDescriptionView.a;
                    textView.setVisibility(i5);
                    TextView textView2 = creationFeatureDescriptionView.b;
                    textView2.setVisibility(8);
                    TextView textView3 = creationFeatureDescriptionView.c;
                    textView3.setVisibility(8);
                    Animation animation = creationFeatureDescriptionView.d;
                    if (animation != null) {
                        animation.cancel();
                    }
                    textView.setText(str2);
                    textView2.setText("");
                    textView3.setText("");
                    AnimationSet animationSet = new AnimationSet(true);
                    TranslateAnimation translateAnimation = new TranslateAnimation(width, 0.0f, 0.0f, 0.0f);
                    translateAnimation.setDuration(300L);
                    animationSet.addAnimation(translateAnimation);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setStartOffset(animationSet.getDuration() + 250);
                    alphaAnimation.setDuration(300L);
                    animationSet.addAnimation(alphaAnimation);
                    creationFeatureDescriptionView.a(animationSet);
                    creationFeatureDescriptionView.startAnimation(animationSet);
                }
            }
        }
    }

    public final void c() {
        unn unnVar;
        uoa uoaVar;
        this.e = true;
        this.l.c();
        this.m.setVisibility(0);
        this.q.isPresent();
        unh unhVar = this.f;
        if (unhVar == null || (unnVar = unhVar.D) == null || (uoaVar = unnVar.o) == null) {
            return;
        }
        Optional optional = uoaVar.x;
        if (true == optional.isPresent()) {
            ((unr) optional.get()).a(true);
        }
        uoaVar.c(true);
    }

    public final void d(boolean z) {
        if (z) {
            a();
        } else {
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [byte[], char[]] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r3v122, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v76, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [adxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30, types: [adxj, java.lang.Object] */
    public final void e(View view) {
        int i;
        ?? r12;
        int i2;
        int i3;
        Object obj;
        agke agkeVarN;
        CreationButtonView creationButtonView;
        aihf builder = this.r.toBuilder();
        aihf aihfVarCreateBuilder = atzw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atzw atzwVar = (atzw) aihfVarCreateBuilder.instance;
        atzwVar.b |= 1;
        atzwVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        atzw atzwVar2 = (atzw) aihfVarCreateBuilder.instance;
        atzwVar2.b |= 2;
        atzwVar2.d = this.n;
        builder.copyOnWrite();
        atzv atzvVar = (atzv) builder.instance;
        atzw atzwVar3 = (atzw) aihfVarCreateBuilder.build();
        atzwVar3.getClass();
        atzvVar.c = atzwVar3;
        atzvVar.b |= 1;
        builder.copyOnWrite();
        atzv atzvVar2 = (atzv) builder.instance;
        atzvVar2.b |= 4;
        atzvVar2.d = false;
        atzv atzvVar3 = (atzv) builder.build();
        this.r = atzvVar3;
        umf umfVar = this.t;
        ume umeVar = umfVar.f;
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        umfVar.f = new ume(Optional.of(atzvVar3), umeVar.b, umeVar.c, umeVar.d, umeVar.e, umeVar.f);
        Optional optional = umfVar.f.f;
        uhe uheVar = new uhe(atzvVar3, 7);
        if (true == optional.isPresent()) {
            ((uql) optional.get()).h((atzv) uheVar.a);
        }
        uwb uwbVar = this.l;
        if (uwbVar instanceof uwa) {
            uwa uwaVar = (uwa) uwbVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.m);
            arrayList.add(view.findViewById(R.id.shorts_edit_bottom_bar));
            View viewFindViewById = view.findViewById(R.id.edit_expandy_toolbar);
            ufs ufsVar = this.p;
            uwaVar.b = viewFindViewById;
            viewFindViewById.setVisibility(0);
            qcb qcbVar = uwaVar.j;
            View[] viewArr = (View[]) arrayList.toArray(new View[0]);
            if (ufsVar == ufs.CREATION_FLOW_IMAGE_POSTS || ufsVar == ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL) {
                i2 = -1;
                ArrayList arrayList2 = new ArrayList();
                if (uwaVar.f.l(66, 45751991L, false)) {
                    xte xteVar = uwaVar.h;
                    xhc xhcVarB = xhb.b(301099);
                    Drawable drawableD = xteVar.d.d((Context) xteVar.c, arqz.jJ);
                    if (drawableD == null) {
                        drawableD = ((Resources) xteVar.e).getDrawable(R.drawable.yt_outline_pencil_vd_theme_24);
                    }
                    xteVar.f(drawableD);
                    arrayList2.add(xteVar.d(R.id.ai_image_editor_button, drawableD, xhcVarB, ((Resources) xteVar.e).getString(R.string.ai_image_editor_button_label), "ai_image_editor"));
                }
                xte xteVar2 = uwaVar.h;
                arrayList2.add(xteVar2.e());
                arrayList2.add(uwaVar.a());
                xhc xhcVarB2 = xhb.b(350435);
                arqz arqzVar = arqz.gx;
                Context context = (Context) xteVar2.c;
                Drawable drawableD2 = xteVar2.d.d(context, arqzVar);
                if (drawableD2 == null) {
                    drawableD2 = ((Resources) xteVar2.e).getDrawable(R.drawable.yt_outline_experimental_crop_vd_theme_24, context.getTheme());
                }
                xteVar2.f(drawableD2);
                CreationButtonView creationButtonViewD = xteVar2.d(R.id.crop_image_editor_button, drawableD2, xhcVarB2, ((Resources) xteVar2.e).getString(R.string.crop_image_editor_button_label), "crop_image_editor");
                i3 = 8;
                creationButtonViewD.setVisibility(8);
                arrayList2.add(creationButtonViewD);
                obj = null;
                arrayList2.add(xteVar2.c(xhb.b(157567), null));
                agkeVarN = agke.n(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                xte xteVar3 = uwaVar.h;
                Context context2 = (Context) xteVar3.c;
                Resources.Theme theme = context2.getTheme();
                i2 = -1;
                Resources resources = (Resources) xteVar3.e;
                Drawable drawable = resources.getDrawable(R.drawable.yt_fill_experimental_scissors_vd_theme_24, theme);
                xteVar3.f(drawable);
                CreationButtonView creationButtonViewD2 = xteVar3.d(R.id.shorts_edit_canvas_toolbelt_auto_edit_button, drawable, null, "Temp", "auto_edit");
                creationButtonViewD2.setVisibility(8);
                arrayList3.add(creationButtonViewD2);
                arrayList3.add(xteVar3.e());
                aaok aaokVar = uwaVar.i;
                if (aaokVar.O()) {
                    CreationButtonView creationButtonViewD3 = xteVar3.d(R.id.shorts_edit_effect_picker_button, resources.getDrawable(R.drawable.yt_outline_sparkle_vd_theme_24, context2.getTheme()), xhb.b(271192), resources.getString(R.string.shorts_editor_effect_picker_label), "effect_picker_in_editor");
                    creationButtonViewD3.setVisibility(8);
                    if (uwaVar.g.l(88, 45685201L, false)) {
                        creationButtonView = creationButtonViewD3;
                        creationButtonView.e(creationButtonView.b.getDrawable());
                    } else {
                        creationButtonView = creationButtonViewD3;
                    }
                    arrayList3.add(creationButtonView);
                    uwaVar.d = creationButtonView;
                }
                arrayList3.add(uwaVar.a());
                arrayList3.add(r16.c(xhb.b(211668), "sticker_picker"));
                Object obj2 = r16.a;
                xhc xhcVarB3 = xhb.b(213905);
                aaok aaokVar2 = (aaok) obj2;
                Drawable drawableD3 = aaokVar2.J() ? xteVar3.d.d(context2, arqz.nq) : null;
                if (drawableD3 != null) {
                    r16.f(drawableD3);
                } else {
                    drawableD3 = resources.getDrawable(R.drawable.yt_outline_subtitles_white_24);
                }
                CreationButtonView creationButtonViewD4 = r16.d(R.id.shorts_edit_captions_button, drawableD3, xhcVarB3, resources.getString(R.string.shorts_captions_label), "captions");
                creationButtonViewD4.setOnClickListener(new uit(r16, 14));
                arrayList3.add(creationButtonViewD4);
                Drawable drawableD4 = aaokVar2.J() ? r16.d.d(context2, arqz.iS) : null;
                if (drawableD4 == null) {
                    drawableD4 = resources.getDrawable(R.drawable.ic_shorts_editor_voiceover);
                }
                r16.f(drawableD4);
                arrayList3.add(r16.d(R.id.shorts_edit_voiceover_button, drawableD4, null, resources.getString(R.string.shorts_voiceover_title), "voiceover"));
                vxz vxzVar = (vxz) aaokVar.b;
                if (vxzVar.l(428, 45724859L, false)) {
                    ?? r4 = r16.d;
                    xhc xhcVarB4 = xhb.b(311190);
                    Drawable drawable2 = context2.getDrawable(r4.b(arqz.gN));
                    if (drawable2 == null) {
                        drawable2 = resources.getDrawable(R.drawable.yt_outline_download_white_24);
                    } else {
                        r16.f(drawable2);
                    }
                    arrayList3.add(r16.d(R.id.shorts_edit_save_to_device_button, drawable2, xhcVarB4, resources.getString(R.string.shorts_save_to_device_label), "save_to_device"));
                }
                if (vxzVar.l(497, 45765997L, false)) {
                    Drawable drawable3 = resources.getDrawable(R.drawable.yt_outline_experimental_alert_bubble_black_24);
                    r16.f(drawable3);
                    CreationButtonView creationButtonViewD5 = r16.d(R.id.shorts_edit_generated_asset_report_button, drawable3, null, resources.getString(R.string.shorts_generated_asset_report_label), "gen_ai_report");
                    creationButtonViewD5.setVisibility(8);
                    arrayList3.add(creationButtonViewD5);
                }
                agkeVarN = agke.n(arrayList3);
                i3 = 8;
                obj = null;
            }
            agke agkeVar = agkeVarN;
            gif gifVar = (gif) qcbVar.a;
            gjx gjxVar = gifVar.c;
            bog bogVar = (bog) ((aupo) gjxVar.b).b;
            roq roqVar = (roq) gjxVar.af.io();
            ght ghtVar = gifVar.a;
            i = i3;
            r12 = obj;
            uiv uivVar = new uiv(bogVar, roqVar, (ahey) ghtVar.du.io(), gifVar.d.bh, (aaok) ghtVar.a.iz.io(), viewFindViewById, view, viewArr, agkeVar);
            if (uivVar.v.J()) {
                uivVar.e.a(R.drawable.delhi_expandy_expand);
                uivVar.f.a(R.drawable.delhi_expandy_collapse);
            }
            uivVar.k();
            uivVar.r.addOnLayoutChangeListener(new jfx(uivVar, i));
            ToolbarView toolbarView = uivVar.b;
            toolbarView.a = new qcb(uivVar);
            toolbarView.addOnAttachStateChangeListener(uivVar);
            uivVar.q = (List) Collection.EL.stream(uivVar.q).distinct().collect(Collectors.toCollection(new ieu(14)));
            for (int i4 = 0; i4 < uivVar.q.size(); i4++) {
                if (i4 < uivVar.p) {
                    uivVar.c.addView((View) uivVar.q.get(i4), uivVar.d());
                } else {
                    LinearLayout linearLayout = uivVar.d;
                    linearLayout.addView((View) uivVar.q.get(i4), linearLayout.getChildCount() - 1);
                }
            }
            uivVar.h();
            uivVar.e.setOnClickListener(new rnx(uivVar, 20));
            uivVar.f.setOnClickListener(new uit(uivVar, 1));
            uivVar.g.setOnClickListener(new uit(uivVar, 0));
            uivVar.u.k(uiv.a).c();
            uivVar.j(uivVar.c);
            uivVar.n(1.0f);
            uwaVar.e = uivVar;
            uiv uivVar2 = uwaVar.e;
            Duration duration = uwa.a;
            uivVar2.o = true;
            List listF = uivVar2.f();
            for (int i5 = 0; i5 < listF.size(); i5++) {
                CreationButtonView creationButtonView2 = (CreationButtonView) listF.get(i5);
                if (creationButtonView2.getVisibility() == 0) {
                    uivVar2.l(creationButtonView2);
                }
            }
            uivVar2.k = uivVar2.j.schedule(new szq(uivVar2, 19), duration.toMillis(), TimeUnit.MILLISECONDS);
            uwaVar.d();
        } else {
            i = 8;
            r12 = 0;
            i2 = -1;
        }
        uma umaVar = this.j;
        umaVar.f = new ulz(umaVar, umaVar.c, umaVar.d, this);
        umaVar.b.setOnTouchListener(umaVar.f);
        if (umaVar.j.H()) {
            ShortsPlayerView shortsPlayerView = umaVar.a;
            umf umfVar2 = umaVar.i;
            umaVar.g = new uls(shortsPlayerView, umfVar2);
            bac.p(shortsPlayerView, umaVar.g);
            shortsPlayerView.p = umaVar.g;
            umfVar2.o(new uly(umaVar));
        }
        avmm avmmVar = this.d;
        uvz uvzVar = this.g;
        ulx ulxVar = this.o;
        ShortsPlayerView shortsPlayerView2 = this.k;
        xpl xplVar = new xpl(shortsPlayerView2.b, shortsPlayerView2, (char[]) r12);
        uvzVar.c = view.findViewById(R.id.shorts_edit_text_button);
        uvzVar.c.setVisibility(0);
        View viewFindViewById2 = view.findViewById(R.id.text_container);
        View viewFindViewById3 = view.findViewById(R.id.edit_video_container);
        vkl vklVar = uvzVar.a;
        View view2 = uvzVar.c;
        vklVar.m = viewFindViewById2;
        vklVar.n = viewFindViewById3;
        roq roqVar2 = uvzVar.e;
        ?? r10 = roqVar2.a;
        vklVar.I = r10;
        vklVar.J = r10 != 0;
        vklVar.q = (RoundedCornersEditText) viewFindViewById2.findViewById(R.id.add_text_input);
        RoundedCornersEditText roundedCornersEditText = vklVar.q;
        if (!roundedCornersEditText.a) {
            roundedCornersEditText.a = true;
            roundedCornersEditText.getLayoutParams().width = i2;
            roundedCornersEditText.invalidate();
        }
        boolean z = ulxVar.a;
        viewFindViewById2.setOnClickListener(vklVar);
        vklVar.w = (LinearLayout) viewFindViewById2.findViewById(R.id.text_input_container);
        vklVar.B = (CoordinatorLayout) viewFindViewById2.findViewById(R.id.reel_add_text_coordinator_layout);
        vklVar.E = z;
        vklVar.P = xplVar;
        vklVar.F = false;
        alik alikVarB = vklVar.d.b();
        if (alikVarB != null) {
            ardm ardmVar = alikVarB.q;
            if (ardmVar == null) {
                ardmVar = ardm.a;
            }
            vklVar.D = ardmVar.b;
        }
        taf.j(((ujd) vklVar.g.io()).a(), new tsq(i));
        ((ViewStub) viewFindViewById2.findViewById(R.id.default_text_style_items)).inflate();
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.advanced_text_options_bar);
        vklVar.s = viewFindViewById2.findViewById(R.id.advanced_text_background_color_toggle);
        vklVar.t = (ImageView) viewFindViewById2.findViewById(R.id.advanced_text_background_color_toggle_image);
        vklVar.x = viewFindViewById2.findViewById(R.id.advanced_text_alignment_toggle);
        vklVar.y = (ImageView) viewFindViewById2.findViewById(R.id.advanced_text_alignment_toggle_image);
        vklVar.l(4);
        vklVar.z = (TextView) viewFindViewById2.findViewById(R.id.advanced_text_font_toggle);
        viewFindViewById4.setVisibility(0);
        vklVar.v = viewFindViewById2.findViewById(R.id.advanced_text_done);
        vklVar.v.setOnClickListener(vklVar);
        vklVar.x.setOnClickListener(vklVar);
        vklVar.z.setOnClickListener(vklVar);
        vklVar.A = (SeekBar) viewFindViewById2.findViewById(R.id.seekBar);
        vklVar.A.setVisibility(0);
        LinearLayout linearLayout2 = vklVar.w;
        Activity activity = vklVar.a;
        linearLayout2.setPaddingRelative(0, 0, (int) activity.getResources().getDimension(R.dimen.advanced_text_seekbar_padding), 0);
        vklVar.A.setOnSeekBarChangeListener(new suh(vklVar, 2));
        vklVar.l = (vkr) vklVar.h.io();
        taf.k(vklVar.b, vklVar.l.d, new jco(18), new uny(vklVar, 12));
        vklVar.H = vklVar.l.c;
        vklVar.o();
        vkt vktVar = vklVar.c;
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        RoundedCornersEditText roundedCornersEditText2 = vklVar.q;
        xxj xxjVar = new xxj(vklVar, r12);
        vktVar.a = activity;
        vktVar.f = roundedCornersEditText2;
        vktVar.l = xxjVar;
        aaok aaokVar3 = vktVar.k;
        zf zfVar = vktVar.j;
        boolean zD = aaokVar3.D();
        vktVar.c = zfVar.H(zD ? vku.b : vku.a, zD);
        vktVar.e = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_holder);
        vktVar.d = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_paged);
        RecyclerView recyclerView = (RecyclerView) vktVar.d;
        vktVar.b = new vjc(vktVar, recyclerView);
        vjc.c(recyclerView, activity);
        vktVar.b.a();
        vklVar.r = vktVar.d;
        vklVar.s.setOnClickListener(vklVar);
        vklVar.u = view2;
        view2.setOnClickListener(vklVar);
        vkv vkvVar = vklVar.j;
        RoundedCornersEditText roundedCornersEditText3 = vklVar.q;
        LinearLayout linearLayout3 = vklVar.w;
        View view3 = vklVar.r;
        roundedCornersEditText3.getClass();
        vkvVar.c = roundedCornersEditText3;
        linearLayout3.getClass();
        vkvVar.d = linearLayout3;
        viewFindViewById2.getClass();
        vkvVar.e = viewFindViewById2;
        view3.getClass();
        vkvVar.f = view3;
        vklVar.k.c(viewFindViewById3, false);
        ugo ugoVarK = roqVar2.k(xhb.b(157565));
        ugoVarK.h(true);
        ugoVarK.c();
        vklVar.L = 157565;
        avlr avlrVarO = uvzVar.d.d.H().O(uvzVar.b);
        View view4 = uvzVar.c;
        view4.getClass();
        avmmVar.c(avlrVarO.af(new usn(view4, 4)));
        avmmVar.c(vklVar.e.H().af(new sqk(this, 17)));
    }

    @Override // defpackage.uvw
    public final void v(final auan auanVar) {
        final una unaVar = this.i;
        unaVar.c.post(new Runnable() { // from class: umz
            @Override // java.lang.Runnable
            public final void run() {
                Paint paint;
                una unaVar2 = unaVar;
                if (unaVar2.k == null) {
                    ImageView imageView = unaVar2.c;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), una.b);
                    unaVar2.k = new Canvas(bitmapCreateBitmap);
                    imageView.setImageBitmap(bitmapCreateBitmap);
                }
                auan auanVar2 = auanVar;
                Canvas canvas = unaVar2.k;
                canvas.getClass();
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (auanVar2.b.size() != 0) {
                    Iterator it = auanVar2.b.iterator();
                    while (it.hasNext()) {
                        if (!una.a((auak) it.next())) {
                            ((agrc) ((agrc) una.a.c()).k("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController", "drawGuidelines", 248, "GuidelineController.java")).w("%sInvalid GuidelineData", "[ShortsCreation][Android][Guidelines]");
                            break;
                        }
                    }
                    ImageView imageView2 = unaVar2.c;
                    int width = imageView2.getWidth();
                    int height = imageView2.getHeight();
                    DisplayMetrics displayMetrics = imageView2.getContext().getResources().getDisplayMetrics();
                    for (auak auakVar : auanVar2.b) {
                        if (una.a(auakVar)) {
                            int iBg = a.bg(auakVar.e);
                            if (iBg == 0 || iBg != 8) {
                                if (!auakVar.g) {
                                    unaVar2.g.isPresent();
                                }
                                paint = unaVar2.d;
                            } else {
                                paint = unaVar2.e;
                            }
                            Paint paint2 = unaVar2.f;
                            paint2.set(paint);
                            unaVar2.g.isPresent();
                            if ((auakVar.b & 32) != 0) {
                                aual aualVar = auakVar.h;
                                if (aualVar == null) {
                                    aualVar = aual.a;
                                }
                                if (aualVar.c != 0) {
                                    aual aualVar2 = auakVar.h;
                                    if (aualVar2 == null) {
                                        aualVar2 = aual.a;
                                    }
                                    paint2.setColor(aualVar2.c);
                                }
                                aual aualVar3 = auakVar.h;
                                if ((aualVar3 == null ? aual.a : aualVar3).d != 0.0f) {
                                    if (aualVar3 == null) {
                                        aualVar3 = aual.a;
                                    }
                                    paint2.setStrokeWidth(TypedValue.applyDimension(1, aualVar3.d, displayMetrics));
                                }
                            }
                            auam auamVar = auakVar.c;
                            if (auamVar == null) {
                                auamVar = auam.a;
                            }
                            auam auamVar2 = auakVar.d;
                            if (auamVar2 == null) {
                                auamVar2 = auam.a;
                            }
                            float[] fArr = unaVar2.h;
                            float f = width;
                            fArr[0] = auamVar.c * f;
                            float f2 = height;
                            fArr[1] = auamVar.d * f2;
                            fArr[2] = auamVar2.c * f;
                            fArr[3] = auamVar2.d * f2;
                            Canvas canvas2 = unaVar2.k;
                            canvas2.getClass();
                            canvas2.drawLines(fArr, paint2);
                        }
                    }
                }
                ImageView imageView3 = unaVar2.c;
                imageView3.invalidate();
                long jCount = Collection.EL.stream(auanVar2.b).filter(new sde(13)).count();
                if (jCount > unaVar2.l) {
                    imageView3.performHapticFeedback(1);
                }
                if (auanVar2.b.size() > 0 && unaVar2.m == 0) {
                    unaVar2.i.l(unaVar2.j);
                } else if (auanVar2.b.size() == 0 && unaVar2.m > 0) {
                    unaVar2.i.p(unaVar2.j, null);
                }
                unaVar2.l = jCount;
                unaVar2.m = auanVar2.b.size();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01db  */
    /* JADX WARN: Code duplicated, block: B:52:0x01df  */
    /* JADX WARN: Type inference failed for: r15v7, types: [adxj, java.lang.Object] */
    @Override // defpackage.uvw
    public final void w(uxi uxiVar) {
        aefs aefsVar;
        uwf uwfVar = (uwf) this.a.io();
        taq.d();
        SortedMap sortedMap = uwfVar.c;
        if (sortedMap.isEmpty()) {
            aefsVar = uwfVar.e;
            if (aefsVar != null) {
                if (aefsVar.h()) {
                    uwfVar.a();
                    return;
                }
                ((agrc) ((agrc) uwf.a.b()).k("com/google/android/libraries/youtube/creation/editor/tooltip/DefaultShortsTooltipController", "showTooltip", 104, "DefaultShortsTooltipController.java")).t("STooltipCntr: Unexpected - Tooltip is not null but it's not showing");
            }
        } else {
            Optional optional = ((uxk) uxiVar).b;
            if (optional.isEmpty()) {
                aefsVar = uwfVar.e;
                if (aefsVar != null) {
                    if (aefsVar.h()) {
                        uwfVar.a();
                        return;
                    }
                    ((agrc) ((agrc) uwf.a.b()).k("com/google/android/libraries/youtube/creation/editor/tooltip/DefaultShortsTooltipController", "showTooltip", 104, "DefaultShortsTooltipController.java")).t("STooltipCntr: Unexpected - Tooltip is not null but it's not showing");
                }
            } else {
                aimy aimyVar = (aimy) optional.get();
                if (uwfVar.e != null) {
                    Long l = uwfVar.f;
                    if (l != null && l.longValue() == uxiVar.a()) {
                        uwfVar.a();
                        return;
                    }
                    uwfVar.a();
                }
                ShortsPlayerView shortsPlayerView = this.k;
                Context context = uwfVar.b;
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.shorts_edit_popup, (ViewGroup) null);
                Size size = new Size(shortsPlayerView.getMeasuredWidth(), shortsPlayerView.getMeasuredHeight());
                PointF pointF = new PointF(shortsPlayerView.getX(), shortsPlayerView.getY());
                float f = shortsPlayerView.i;
                aihu aihuVar = aimyVar.e;
                View view = new View(context);
                ahno.O(aihuVar.size() == 9);
                float[] fArrK = afxw.K(aihuVar);
                int width = size.getWidth();
                int height = size.getHeight();
                int width2 = size.getWidth();
                int height2 = size.getHeight();
                float f2 = width2;
                float f3 = height2;
                Point point = f2 / f3 > f ? new Point(width2, (int) (f2 / f)) : new Point((int) (f3 * f), height2);
                Matrix matrix = new Matrix();
                matrix.setValues(fArrK);
                Matrix matrix2 = new Matrix();
                Matrix matrix3 = new Matrix();
                matrix2.setScale(point.x, point.y);
                matrix3.setTranslate((width - point.x) / 2.0f, (height - point.y) / 2.0f);
                matrix.postConcat(matrix2);
                matrix.postConcat(matrix3);
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                ujt.g(view, fArr);
                view.setX(view.getX() + pointF.x);
                view.setY(view.getY() + pointF.y);
                Optional.of(uwfVar.i);
                boolean z = false;
                uwfVar.e = new aefs(viewGroup, view, 2, 2, 2, R.style.ShortsEditTooltip);
                uwfVar.e.d(false);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : sortedMap.entrySet()) {
                    if (ahgb.B(uxiVar) && uwfVar.e != null) {
                        ahgb ahgbVar = (ahgb) entry.getValue();
                        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shorts_edit_add_text_tooltip, viewGroup, z);
                        if (viewInflate instanceof ShortsEditTooltipButtonView) {
                            ShortsEditTooltipButtonView shortsEditTooltipButtonView = (ShortsEditTooltipButtonView) viewInflate;
                            Drawable drawableP = ((aaok) ahgbVar.a).J() ? aecm.p(viewGroup.getContext(), arqz.hB, R.attr.ytTextPrimary, ahgbVar.b) : null;
                            if (drawableP != null) {
                                shortsEditTooltipButtonView.a.setImageDrawable(drawableP);
                            }
                        }
                        viewInflate.setOnClickListener(new jip(ahgbVar, uxiVar, 17));
                        viewGroup.addView(viewInflate);
                        arrayList.add((ahgb) entry.getValue());
                        z = false;
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() != 1) {
                        uwfVar.f = Long.valueOf(uxiVar.a());
                        uwfVar.g = new uwd(uwfVar, view, shortsPlayerView);
                        uwfVar.h.a(uwfVar.g);
                        return;
                    } else {
                        ahgb ahgbVar2 = (ahgb) arrayList.get(0);
                        if (ahgb.B(uxiVar)) {
                            ahgbVar2.A(uxiVar);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.g.jb(uxiVar);
    }

    @Override // defpackage.uvw
    public final void y(boolean z) {
        uvy uvyVar = this.s;
        if (uvyVar.d != z) {
            uvyVar.d = z;
            uvyVar.a.post(new csd(uvyVar, z, 8));
        }
    }

    @Override // defpackage.uvw
    public final void z(boolean z, boolean z2) {
        this.h.execute(afwl.i(new csd(this, z, 6)));
        uvy uvyVar = this.s;
        uvyVar.a.post(new csd(uvyVar, z2, 7));
    }

    @Override // defpackage.uvw
    public final void x() {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void A(augy augyVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void t(uxi uxiVar) {
    }

    @Override // defpackage.uvw
    public final /* synthetic */ void u(auaj auajVar) {
    }
}
