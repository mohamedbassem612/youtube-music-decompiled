package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ok {
    private static ok b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private kk g;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final agm h = new agm(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        agm agmVar = h;
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) agmVar.b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized ok e() {
        ok okVar;
        okVar = b;
        if (okVar == null) {
            okVar = new ok();
            b = okVar;
        }
        return okVar;
    }

    static void g(Drawable drawable, oz ozVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilterB = null;
            if (ozVar.d) {
                colorStateList = ozVar.a;
            } else {
                if (!ozVar.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = ozVar.c ? ozVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterB);
        }
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        agk agkVar = (agk) this.d.get(context);
        if (agkVar != null && (weakReference = (WeakReference) agkVar.e(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dl.o(agkVar, j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.d;
            agk agkVar = (agk) weakHashMap.get(context);
            if (agkVar == null) {
                agkVar = new agk(10);
                weakHashMap.put(context, agkVar);
            }
            agkVar.i(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        ahb ahbVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateListA = null;
        ColorStateList colorStateList = (weakHashMap == null || (ahbVar = (ahb) weakHashMap.get(context)) == null) ? null : (ColorStateList) ahc.a(ahbVar, i);
        if (colorStateList == null) {
            kk kkVar = this.g;
            if (kkVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_edittext, context.getTheme());
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_switch_track, context.getTheme());
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = ox.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = ox.a;
                        iArr2[0] = ox.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = ox.d;
                        iArr2[1] = ox.b(context, R.attr.colorControlActivated);
                        iArr[2] = ox.e;
                        iArr2[2] = ox.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = ox.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = ox.d;
                        iArr2[1] = ox.b(context, R.attr.colorControlActivated);
                        iArr[2] = ox.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListA = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListA = kk.b(context, ox.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListA = kk.b(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListA = kk.b(context, ox.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_spinner, context.getTheme());
                } else if (kk.a(kkVar.b, i)) {
                    colorStateListA = ox.c(context, R.attr.colorControlNormal);
                } else if (kk.a(kkVar.e, i)) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_default, context.getTheme());
                } else if (kk.a(kkVar.f, i)) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_btn_checkable, context.getTheme());
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListA = avt.a(context.getResources(), R.color.abc_tint_seek_thumb, context.getTheme());
                    i = R.drawable.abc_seekbar_thumb_material;
                }
            }
            if (colorStateListA != null) {
                WeakHashMap weakHashMap2 = this.c;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.c = weakHashMap2;
                }
                ahb ahbVar2 = (ahb) weakHashMap2.get(context);
                if (ahbVar2 == null) {
                    ahbVar2 = new ahb(10);
                    this.c.put(context, ahbVar2);
                }
                int i2 = ahbVar2.d;
                if (i2 == 0 || i > ahbVar2.b[i2 - 1]) {
                    if (ahbVar2.a && i2 >= ahbVar2.b.length) {
                        ahc.c(ahbVar2);
                    }
                    int i3 = ahbVar2.d;
                    int[] iArr4 = ahbVar2.b;
                    if (i3 >= iArr4.length) {
                        int iC = ahe.c((i3 + 1) << 2) / 4;
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iC);
                        iArrCopyOf.getClass();
                        ahbVar2.b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(ahbVar2.c, iC);
                        objArrCopyOf.getClass();
                        ahbVar2.c = objArrCopyOf;
                    }
                    ahbVar2.b[i3] = i;
                    ahbVar2.c[i3] = colorStateListA;
                    ahbVar2.d = i3 + 1;
                } else {
                    ahbVar2.f(i, colorStateListA);
                }
                return colorStateListA;
            }
            colorStateList = colorStateListA;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawable;
        int i2;
        int i3 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f) {
                this.f = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof dto) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            TypedValue typedValue = this.e;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.e = typedValue;
            }
            context.getResources().getValue(i3, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableI = i(context, j);
            drawable = null;
            mode = null;
            PorterDuff.Mode mode = null;
            if (drawableI == null) {
                if (this.g == null) {
                    drawableI = null;
                } else if (i3 == R.drawable.abc_cab_background_top_material) {
                    drawableI = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                } else if (i3 == R.drawable.abc_ratingbar_material) {
                    drawableI = kk.c(this, context, R.dimen.abc_star_big);
                } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                    drawableI = kk.c(this, context, R.dimen.abc_star_medium);
                } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                    drawableI = kk.c(this, context, R.dimen.abc_star_small);
                    i3 = R.drawable.abc_ratingbar_small_material;
                } else {
                    drawableI = null;
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    j(context, j, drawableI);
                }
            }
            if (drawableI == null) {
                drawableI = context.getDrawable(i3);
            }
            if (drawableI == null) {
                drawable = drawableI;
            } else {
                ColorStateList colorStateListA = a(context, i3);
                if (colorStateListA != null) {
                    Drawable drawableMutate = drawableI.mutate();
                    drawableMutate.setTintList(colorStateListA);
                    if (this.g != null && i3 == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        drawableMutate.setTintMode(mode);
                    }
                    drawable = drawableMutate;
                } else {
                    kk kkVar = this.g;
                    if (kkVar != null) {
                        int i4 = R.attr.colorControlNormal;
                        if (i3 == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawableI;
                            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int iB = ox.b(context, R.attr.colorControlNormal);
                            PorterDuff.Mode mode2 = kl.a;
                            kk.d(drawableFindDrawableByLayerId, iB, mode2);
                            kk.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ox.b(context, R.attr.colorControlNormal), mode2);
                            kk.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), ox.b(context, R.attr.colorControlActivated), mode2);
                        } else if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawableI;
                            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                            int iA = ox.a(context, R.attr.colorControlNormal);
                            PorterDuff.Mode mode3 = kl.a;
                            kk.d(drawableFindDrawableByLayerId2, iA, mode3);
                            kk.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ox.b(context, R.attr.colorControlActivated), mode3);
                            kk.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ox.b(context, R.attr.colorControlActivated), mode3);
                        } else {
                            int[] iArr = kkVar.a;
                            PorterDuff.Mode mode4 = kl.a;
                            if (kk.a(iArr, i3)) {
                                i2 = -1;
                                z2 = true;
                            } else {
                                if (kk.a(kkVar.c, i3)) {
                                    i2 = -1;
                                    i4 = R.attr.colorControlActivated;
                                } else {
                                    boolean zA = kk.a(kkVar.d, i3);
                                    i4 = android.R.attr.colorBackground;
                                    if (zA) {
                                        mode4 = PorterDuff.Mode.MULTIPLY;
                                    } else if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                                        i2 = 41;
                                        i4 = 16842800;
                                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                                        i4 = 0;
                                        i2 = -1;
                                    }
                                    i2 = -1;
                                }
                                z2 = true;
                            }
                            if (z2) {
                                Drawable drawableMutate2 = drawableI.mutate();
                                drawableMutate2.setColorFilter(kl.b(ox.b(context, i4), mode4));
                                if (i2 != -1) {
                                    drawableMutate2.setAlpha(i2);
                                }
                            } else if (!z) {
                            }
                        }
                        drawable = drawableI;
                    } else if (!z) {
                        drawable = drawableI;
                    }
                }
            }
            if (drawable != null) {
                lx.b(drawable);
            }
        }
        return drawable;
    }

    public final synchronized void f(Context context) {
        agk agkVar = (agk) this.d.get(context);
        if (agkVar != null) {
            agkVar.h();
        }
    }

    public final synchronized void h(kk kkVar) {
        this.g = kkVar;
    }
}
