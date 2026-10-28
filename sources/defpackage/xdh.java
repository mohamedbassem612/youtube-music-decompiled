package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdh {
    public final ViewGroup a;
    public final ViewGroup b;
    public final vxe c;
    public xdb d;
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final advb g;
    private final acyx h;
    private final adly i;
    private final cf j;
    private final View k;
    private final aaok l;
    private final xpl m;
    private final xpl n;

    public xdh(acyx acyxVar, advb advbVar, cf cfVar, xpl xplVar, vxe vxeVar, xgn xgnVar, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        adly adlyVar = new adly();
        this.i = adlyVar;
        this.h = acyxVar;
        this.g = advbVar;
        this.j = cfVar;
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = vxeVar;
        this.n = xplVar;
        advbVar.b(amej.class);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.anchored_container_1);
        viewGroup4.getClass();
        this.m = new xpl(viewGroup4, (ViewGroup) viewGroup3.findViewById(R.id.anchored_container_2), (short[]) null);
        this.l = new aaok(viewGroup3.getContext(), viewGroup, viewGroup2);
        this.k = viewGroup3.findViewById(R.id.chat_feed);
        adlyVar.a(xgnVar);
    }

    public static final String i(String str) {
        return String.valueOf(str).concat("__companion");
    }

    private final avlb j(final xdg xdgVar) {
        return xdgVar == null ? avlb.e() : avlb.g(new avld() { // from class: xdc
            @Override // defpackage.avld
            public final void a(avpr avprVar) {
                xdg xdgVar2 = xdgVar;
                View view = xdgVar2.c;
                if (view != null) {
                    xdh xdhVar = this.a;
                    amen amenVar = xdgVar2.g;
                    xdf xdfVar = new xdf(xdhVar, xdgVar2, avprVar);
                    ViewGroup viewGroup = xdgVar2.d;
                    boolean z = amenVar == amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_AND_FADE_OUT_CLIPPED;
                    viewGroup.setClipChildren(z);
                    viewGroup.setClipToPadding(z);
                    viewGroup.setClipToOutline(z);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f).setDuration(300L);
                    Interpolator interpolator = aedd.a;
                    duration.setInterpolator(interpolator);
                    int iOrdinal = amenVar.ordinal();
                    if (iOrdinal == 4 || iOrdinal == 5) {
                        float height = 200.0f;
                        if (view.getHeight() > 0 && view.getHeight() < 200) {
                            height = view.getHeight();
                        }
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -height).setDuration(300L);
                        duration2.addListener(xdfVar);
                        duration2.setInterpolator(interpolator);
                        animatorSet.play(duration2).with(duration);
                    } else {
                        duration.addListener(xdfVar);
                        animatorSet.play(duration);
                    }
                    animatorSet.start();
                    xdgVar2.e = animatorSet;
                }
            }
        });
    }

    private final boolean k(amer amerVar, String str) {
        if ((amerVar.c & 8) == 0) {
            return true;
        }
        amep amepVar = amerVar.f;
        if (amepVar == null) {
            amepVar = amep.a;
        }
        Map map = this.e;
        if (map.containsKey(str) && ((xdg) map.get(str)).i.isPresent() && Objects.equals(((xdg) map.get(str)).i.get(), yno.dw(amerVar))) {
            return true;
        }
        if (!yno.dx(amepVar)) {
            if (amepVar.b != 1) {
                return true;
            }
            return Collection.EL.stream(map.values()).noneMatch(new uso(yno.dw(amerVar), 19));
        }
        xpl xplVar = this.m;
        Object obj = xplVar.a;
        if (obj == null) {
            if (((ViewGroup) xplVar.b).getChildCount() <= 0) {
                return true;
            }
        } else if (((ViewGroup) xplVar.b).getChildCount() <= 0 || ((ViewGroup) obj).getChildCount() <= 0) {
            return true;
        }
        return false;
    }

    public final avlb a(String str) {
        Map map = this.e;
        if (!map.containsKey(str)) {
            Map map2 = this.f;
            return map2.containsKey(str) ? j((xdg) map2.get(str)) : avlb.e();
        }
        xdg xdgVar = (xdg) map.get(str);
        avlb avlbVarJ = j(xdgVar);
        if (xdgVar == null) {
            return avlbVarJ;
        }
        Optional optional = xdgVar.b;
        return optional.isPresent() ? a((String) optional.get()).q(avlbVarJ) : avlbVarJ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b() {
        Iterator it = this.l.d.iterator();
        if (it.hasNext()) {
            adhg adhgVar = (adhg) it.next();
            ((ViewGroup) adhgVar.b).removeAllViews();
            adhgVar.a = true;
        }
        xpl xplVar = this.m;
        ((ViewGroup) xplVar.b).removeAllViews();
        Object obj = xplVar.a;
        if (obj != null) {
            ((ViewGroup) obj).removeAllViews();
        }
        Map map = this.f;
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((acxm) ((xdg) it2.next()).k).d();
        }
        Map map2 = this.e;
        Iterator it3 = map2.values().iterator();
        while (it3.hasNext()) {
            ((acxm) ((xdg) it3.next()).k).d();
        }
        map2.clear();
        map.clear();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    public final void c(amer amerVar, final String str, Optional optional, Optional optional2) {
        int i;
        Map map;
        Object obj;
        int i2;
        int i3;
        int i4;
        if ((amerVar.c & SemanticState.Hidden) != 0) {
            apji apjiVar = amerVar.m;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                boolean z = (amerVar.c & 8) != 0;
                Map map2 = this.f;
                boolean z2 = map2.containsKey(str) || this.e.containsKey(str);
                f(str, true, z);
                acyx acyxVar = this.h;
                apji apjiVar2 = amerVar.m;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                acxm acxmVarC = acyxVar.c((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
                adma admaVarE = adul.e((admh) this.g.io(), acxmVarC, z ? this.a : this.b);
                if (admaVarE == null || admaVarE.a() == null) {
                    return;
                }
                admaVarE.hU(this.i, acxmVarC);
                View viewA = admaVarE.a();
                if (z) {
                    i = 2;
                    map = map2;
                } else {
                    int iBh = a.bh(amerVar.d);
                    if (iBh == 0) {
                        iBh = 1;
                    }
                    int i5 = iBh - 1;
                    i = 2;
                    if (i5 == 2) {
                        i4 = R.string.live_chat_prompt_sticker_cd;
                    } else if (i5 != 5) {
                        i4 = i5 != 7 ? 0 : R.string.live_chat_countdown_sticker_cd;
                    } else {
                        i4 = R.string.live_chat_poll_sticker_cd;
                    }
                    if (i4 != 0) {
                        viewA.setContentDescription(this.j.getString(i4));
                        viewA.setFocusable(true);
                    }
                    int iBh2 = a.bh(amerVar.d);
                    if (iBh2 == 0) {
                        iBh2 = 1;
                    }
                    map = map2;
                    if (((vxz) this.n.a).m(22, 45796232L) && (iBh2 == 6 || iBh2 == 3 || iBh2 == 8)) {
                        bac.a(viewA, this.j.getString(R.string.delete_sticker_action), new bcl() { // from class: xde
                            @Override // defpackage.bcl
                            public final boolean a(View view) {
                                xdb xdbVar = this.a.d;
                                if (xdbVar == null) {
                                    return false;
                                }
                                String str2 = str;
                                if (str2 != null) {
                                    Map map3 = xdbVar.a;
                                    if (map3.containsKey(str2)) {
                                        amer amerVar2 = (amer) map3.get(str2);
                                        if ((amerVar2.c & SemanticState.ReadOnly) != 0) {
                                            ajwo ajwoVar = amerVar2.n;
                                            if (ajwoVar == null) {
                                                ajwoVar = ajwo.a;
                                            }
                                            xdbVar.f.a(ajwoVar);
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    xdbVar.e(str2);
                                }
                                xdbVar.j();
                                return true;
                            }
                        });
                    }
                }
                viewA.setVisibility(8);
                amep amepVar = amerVar.f;
                if (amepVar == null) {
                    amepVar = amep.a;
                }
                if (yno.dx(amepVar)) {
                    xpl xplVar = this.m;
                    obj = xplVar.b;
                    if (((ViewGroup) obj).getChildCount() != 0 && ((obj = xplVar.a) == null || ((ViewGroup) obj).getChildCount() != 0)) {
                        obj = null;
                    }
                    if (obj == null) {
                        twu.c(6, "Trying to display an ephemeral widget but can't get a valid ABOVE_CHAT container", null);
                        return;
                    } else {
                        ViewGroup viewGroup = (ViewGroup) obj;
                        viewGroup.addView(viewA);
                        viewGroup.setVisibility(0);
                    }
                } else {
                    int i6 = amepVar.b;
                    if (i6 == 1) {
                        ameo ameoVar = i6 == 1 ? (ameo) amepVar.c : ameo.a;
                        aaok aaokVar = this.l;
                        ?? r10 = aaokVar.d;
                        Iterator it = r10.iterator();
                        Object obj2 = null;
                        while (obj2 == null) {
                            if (!it.hasNext()) {
                                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from((Context) aaokVar.b).inflate(R.layout.live_widget_matrix_container, (ViewGroup) null);
                                r10.add(new adhg(viewGroup2));
                                obj2 = viewGroup2;
                                break;
                            } else {
                                adhg adhgVar = (adhg) it.next();
                                if (adhgVar.a) {
                                    Object obj3 = adhgVar.b;
                                    adhgVar.a = false;
                                    obj2 = obj3;
                                }
                            }
                        }
                        ViewGroup viewGroup3 = (ViewGroup) obj2;
                        if (viewGroup3.getParent() != null) {
                            ((ViewGroup) viewGroup3.getParent()).removeView((View) obj2);
                        }
                        View view = (View) obj2;
                        ((ViewGroup) (z ? aaokVar.a : aaokVar.c)).addView(view);
                        aihf aihfVarCreateBuilder = aimy.a.createBuilder();
                        int i7 = ameoVar.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        aimy aimyVar = (aimy) aihfVarCreateBuilder.instance;
                        aimyVar.b |= 1;
                        aimyVar.c = i7;
                        int i8 = ameoVar.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        aimy aimyVar2 = (aimy) aihfVarCreateBuilder.instance;
                        aimyVar2.b |= 2;
                        aimyVar2.d = i8;
                        int iAU = a.aU(ameoVar.f);
                        int i9 = (iAU == 0 || iAU != (i2 = i)) ? 1 : i2;
                        aihfVarCreateBuilder.copyOnWrite();
                        aimy aimyVar3 = (aimy) aihfVarCreateBuilder.instance;
                        aimyVar3.f = i9 - 1;
                        aimyVar3.b |= 4;
                        for (float f : afxw.K(ameoVar.e)) {
                            aihfVarCreateBuilder.aA(f);
                        }
                        aimy aimyVar4 = (aimy) aihfVarCreateBuilder.build();
                        View view2 = (View) view.getParent();
                        if (view2 == null) {
                            ((agrc) ((agrc) xdp.a.b()).k("com/google/android/libraries/youtube/livechat/widget/utils/WidgetPositionUtil", "applyMatrixToView", 33, "WidgetPositionUtil.java")).t("Live widget doesn't have a parent container.");
                        } else {
                            view.setX(0.0f);
                            view.setY(0.0f);
                            view.setRotation(0.0f);
                            view.setScaleX(1.0f);
                            view.setScaleY(1.0f);
                            Optional optionalF = ujt.f(aimyVar4);
                            if (optionalF.isPresent()) {
                                float[] fArr = new float[9];
                                ((Matrix) optionalF.get()).getValues(fArr);
                                int width = view2.getWidth();
                                int height = view2.getHeight();
                                Matrix matrix = new Matrix();
                                matrix.setValues(fArr);
                                Matrix matrix2 = new Matrix();
                                Matrix matrix3 = new Matrix();
                                matrix2.setScale(width, height);
                                matrix3.setTranslate(0.0f, 0.0f);
                                matrix.postConcat(matrix2);
                                matrix.postConcat(matrix3);
                                float[] fArr2 = new float[9];
                                matrix.getValues(fArr2);
                                ujt.g(view, fArr2);
                            }
                        }
                        viewGroup3.addView(viewA);
                        viewGroup3.setVisibility(0);
                        obj = obj2;
                    } else {
                        obj = null;
                    }
                }
                if (obj == null) {
                    twu.c(6, "No position is specified for the widget", null);
                    return;
                }
                amen amenVarA = amen.a(amerVar.j);
                if (amenVarA == null) {
                    amenVarA = amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_UNSPECIFIED;
                }
                amen amenVarA2 = amen.a(amerVar.k);
                if (amenVarA2 == null) {
                    amenVarA2 = amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_UNSPECIFIED;
                }
                ViewGroup viewGroup4 = (ViewGroup) obj;
                xdg xdgVar = new xdg(str, optional, viewA, viewGroup4, amenVarA, amenVarA2, z, yno.dw(amerVar), optional2, acxmVarC);
                if (z) {
                    this.e.put(str, xdgVar);
                } else {
                    map.put(str, xdgVar);
                }
                if (z2) {
                    viewGroup4.setVisibility(0);
                    viewA.setVisibility(0);
                    return;
                }
                View view3 = xdgVar.c;
                if (view3 != null) {
                    amen amenVar = xdgVar.f;
                    view3.setVisibility(0);
                    ViewGroup viewGroup5 = xdgVar.d;
                    View view4 = this.k;
                    float height2 = view4 != null ? view4.getHeight() : 0.0f;
                    boolean z3 = amenVar == amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_NOT_COVER_CHAT || amenVar == amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_DOWN_AND_FADE_IN_CLIPPED;
                    viewGroup5.setClipChildren(z3);
                    viewGroup5.setClipToPadding(z3);
                    viewGroup5.setClipToOutline(z3);
                    AnimatorSet animatorSet = new AnimatorSet();
                    float height3 = view3.getHeight() > 0 ? view3.getHeight() : 300.0f;
                    int iOrdinal = amenVar.ordinal();
                    if (iOrdinal != 3) {
                        if (iOrdinal == 6) {
                            i3 = 2;
                        } else if (iOrdinal != 7) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f, view3.getAlpha());
                            yno.dy(amenVar);
                            ObjectAnimator duration = objectAnimatorOfFloat.setDuration(300L);
                            duration.setInterpolator(aedd.a);
                            animatorSet.play(duration);
                        } else {
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, -height3, 0.0f);
                            yno.dy(amenVar);
                            ObjectAnimator duration2 = objectAnimatorOfFloat2.setDuration(300L);
                            duration2.setInterpolator(aedd.a);
                            animatorSet.play(duration2);
                        }
                        animatorSet.start();
                        xdgVar.e = animatorSet;
                    }
                    i3 = 2;
                    height3 = Math.max(height3, height2 / 2.0f);
                    Property property = View.TRANSLATION_Y;
                    float[] fArr3 = new float[i3];
                    fArr3[0] = height3;
                    fArr3[1] = 0.0f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, fArr3);
                    yno.dy(amenVar);
                    ObjectAnimator duration3 = objectAnimatorOfFloat3.setDuration(300L);
                    duration3.setInterpolator(aedd.a);
                    animatorSet.play(duration3);
                    animatorSet.start();
                    xdgVar.e = animatorSet;
                }
            }
        }
    }

    public final void d(boolean z) {
        ViewGroup viewGroup = this.a;
        if (z) {
            yno.dI(viewGroup);
            yno.dI(this.b);
        } else {
            viewGroup.setVisibility(8);
            this.b.setVisibility(8);
        }
    }

    public final void e(String str) {
        xdg xdgVar;
        Map map = this.e;
        if (map.containsKey(str)) {
            xdgVar = (xdg) map.get(str);
            if (xdgVar != null) {
                vrl vrlVar = new vrl(this, 20);
                Optional optional = xdgVar.b;
                if (true == optional.isPresent()) {
                    ((xdh) vrlVar.a).e((String) optional.get());
                }
            }
        } else {
            Map map2 = this.f;
            xdgVar = map2.containsKey(str) ? (xdg) map2.get(str) : null;
        }
        if (xdgVar != null) {
            f(xdgVar.a, true, xdgVar.h);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public final void f(String str, boolean z, boolean z2) {
        AnimatorSet animatorSet;
        Map map = z2 ? this.e : this.f;
        if (map.containsKey(str)) {
            xdg xdgVar = (xdg) map.get(str);
            if (xdgVar == null) {
                map.remove(str);
                return;
            }
            xdd xddVar = new xdd(this.c, 0);
            Optional optional = xdgVar.j;
            if (true == optional.isPresent()) {
                xddVar.a.a((ajwo) optional.get());
            }
            if (z && (animatorSet = xdgVar.e) != null && animatorSet.isStarted()) {
                xdgVar.e.cancel();
            }
            View view = xdgVar.c;
            if (view != null) {
                xdgVar.d.removeView(view);
                ((acxm) xdgVar.k).d();
            }
            aaok aaokVar = this.l;
            ViewGroup viewGroup = xdgVar.d;
            for (adhg adhgVar : aaokVar.d) {
                if (adhgVar.b == viewGroup) {
                    viewGroup.removeAllViews();
                    adhgVar.a = true;
                    if (viewGroup.getParent() == null) {
                        break;
                    }
                    ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                    break;
                }
            }
            map.remove(str);
        }
    }

    public final void g(boolean z) {
        ViewGroup viewGroup = this.a;
        if (z) {
            yno.dH(viewGroup);
            yno.dH(this.b);
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        ViewGroup viewGroup2 = this.b;
        viewGroup2.setVisibility(0);
        viewGroup2.setAlpha(1.0f);
    }

    public final boolean h(amej amejVar) {
        amer amerVarDu = yno.du(amejVar);
        if (!k(amerVarDu, amerVarDu.e)) {
            return false;
        }
        Optional optionalDv = yno.dv(amejVar);
        if (!optionalDv.isPresent()) {
            return true;
        }
        amer amerVar = (amer) optionalDv.get();
        if ((amerVar.c & 8) != 0 && (amerVarDu.c & 8) != 0 && Objects.equals(yno.dw(amerVar), yno.dw(amerVarDu))) {
            return false;
        }
        return k((amer) optionalDv.get(), i(((amer) optionalDv.get()).e));
    }
}
