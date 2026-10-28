package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeaa extends adzx {
    public final TextView f;
    public final boolean g;
    public boolean h;
    public boolean i;
    private final aduv j;
    private final adxj k;
    private final adxl l;
    private int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final aeda t;
    private int u;
    private boolean v;
    private int w;
    private Optional x;
    private final lqa y;
    private final aciz z;

    /* JADX WARN: Type inference failed for: r2v9, types: [aeda, java.lang.Object] */
    public aeaa(vxe vxeVar, aduv aduvVar, adxj adxjVar, ci ciVar, lqa lqaVar, aciz acizVar, adxl adxlVar, aeda aedaVar, TextView textView) {
        super(vxeVar, ciVar, textView, null);
        this.x = Optional.empty();
        this.j = aduvVar;
        this.k = adxjVar;
        this.l = adxlVar;
        this.f = textView;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            this.m = layoutParams.height;
        }
        this.n = textView.getGravity();
        this.o = textView.getPaddingTop();
        this.p = textView.getPaddingStart();
        Resources resources = textView.getResources();
        this.q = resources != null ? resources.getDimensionPixelSize(R.dimen.button_corner_radius) : 0;
        this.r = resources != null ? twm.m(resources.getDisplayMetrics(), resources.getDimensionPixelSize(R.dimen.fully_rounded_corner_radius)) : 0;
        this.s = resources != null ? resources.getDimensionPixelSize(R.dimen.button_outline_width) : 0;
        this.y = lqaVar;
        this.z = acizVar;
        this.t = aedaVar;
        this.g = lqaVar.a.c();
        this.u = -1;
        this.w = -1;
        this.v = false;
    }

    private final int e(int i) {
        TextView textView = this.f;
        Resources resources = textView.getResources();
        Resources.Theme theme = textView.getContext().getTheme();
        int i2 = avt.a;
        return resources.getColor(i, theme);
    }

    private final int f(int i, int i2) {
        return tzk.n(this.f.getContext(), i).orElse(e(i2));
    }

    private final Drawable g(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(e(i));
        gradientDrawable.setShape(0);
        if (this.y.P() && z) {
            float height = this.f.getHeight();
            if (height > 0.0f) {
                gradientDrawable.setCornerRadius(height / 2.0f);
            }
            this.x = Optional.of(gradientDrawable);
        }
        return gradientDrawable;
    }

    private final Drawable h(int i) {
        return dl.d(this.f.getContext(), i);
    }

    private final GradientDrawable i(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        if (z) {
            float f = this.q;
            if (this.y.P()) {
                float height = this.f.getHeight();
                if (height > 0.0f) {
                    f = height / 2.0f;
                }
                this.x = Optional.of(gradientDrawable);
            }
            gradientDrawable.setCornerRadius(f);
        }
        return gradientDrawable;
    }

    private final GradientDrawable j(int i, int i2) {
        GradientDrawable gradientDrawableI = i(i, true);
        gradientDrawableI.setStroke(this.s, i2);
        return gradientDrawableI;
    }

    private final GradientDrawable k(int i, boolean z) {
        return i(tzk.n(this.f.getContext(), i).orElse(0), z);
    }

    private final void l(ajnf ajnfVar, Drawable drawable, boolean z) {
        int iAS = a.aS(ajnfVar.x);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (z) {
            if (i == 0 || i == 1) {
                this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            } else {
                this.f.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                return;
            }
        }
        if (i == 0 || i == 1) {
            this.f.setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            this.f.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    private static final boolean m(ajnf ajnfVar) {
        aihl aihlVar = ajnd.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajnfVar.c(aihlVarCheckIsLite);
        if (!ajnfVar.j.n(aihlVarCheckIsLite.d)) {
            return true;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajnfVar.c(aihlVarCheckIsLite2);
        Object objK = ajnfVar.j.k(aihlVarCheckIsLite2.d);
        int iAU = a.aU(((ajnd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c);
        return iAU == 0 || iAU == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:215:0x0327  */
    /* JADX WARN: Code duplicated, block: B:216:0x032f  */
    /* JADX WARN: Code duplicated, block: B:217:0x033a  */
    /* JADX WARN: Code duplicated, block: B:224:0x038a  */
    /* JADX WARN: Code duplicated, block: B:225:0x038f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0394  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:316:0x04f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:319:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:321:0x050f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0569  */
    /* JADX WARN: Code duplicated, block: B:335:0x056d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0575  */
    /* JADX WARN: Code duplicated, block: B:338:0x057f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0581 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:340:0x0583  */
    /* JADX WARN: Code duplicated, block: B:341:0x0592  */
    /* JADX WARN: Code duplicated, block: B:343:0x0598  */
    /* JADX WARN: Code duplicated, block: B:344:0x059c  */
    /* JADX WARN: Code duplicated, block: B:346:0x05a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:349:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:351:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:352:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:354:0x05be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:355:0x05c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:356:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:357:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:358:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:360:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:361:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:363:0x0601  */
    /* JADX WARN: Code duplicated, block: B:365:0x060b  */
    /* JADX WARN: Code duplicated, block: B:368:0x061a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:369:0x061c  */
    /* JADX WARN: Code duplicated, block: B:370:0x062c  */
    /* JADX WARN: Code duplicated, block: B:403:0x0690  */
    /* JADX WARN: Code duplicated, block: B:405:0x069e  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:409:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:411:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:412:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:417:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:420:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:426:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:428:0x0701  */
    /* JADX WARN: Code duplicated, block: B:431:0x0706  */
    /* JADX WARN: Code duplicated, block: B:440:0x0717  */
    /* JADX WARN: Code duplicated, block: B:441:0x071b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:442:0x071d  */
    /* JADX WARN: Code duplicated, block: B:443:0x0721  */
    /* JADX WARN: Code duplicated, block: B:446:0x0732  */
    /* JADX WARN: Code duplicated, block: B:450:0x075a  */
    /* JADX WARN: Code duplicated, block: B:452:0x075d  */
    /* JADX WARN: Code duplicated, block: B:454:0x0764  */
    /* JADX WARN: Code duplicated, block: B:455:0x0768  */
    /* JADX WARN: Code duplicated, block: B:476:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:477:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:508:0x086f  */
    /* JADX WARN: Code duplicated, block: B:515:0x0885  */
    /* JADX WARN: Code duplicated, block: B:518:0x088a  */
    /* JADX WARN: Code duplicated, block: B:519:0x0898  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:282:0x0444. Please report as an issue. */
    @Override // defpackage.adzx
    public final void a(ajnf ajnfVar, xgn xgnVar, Map map) {
        alay alayVar;
        Optional optionalEmpty;
        int i;
        int iC;
        int iAr;
        int iF;
        int iF2;
        boolean z;
        int iAr2;
        int i2;
        int i3;
        int i4;
        arqz arqzVarA;
        int iB;
        boolean z2;
        boolean z3;
        Optional optionalEmpty2;
        Drawable drawableD;
        aqle aqleVar;
        Integer numValueOf;
        int i5;
        boolean zJ;
        int iBt;
        int i6;
        int i7;
        Optional optionalM;
        aqle aqleVar2;
        aqlc aqlcVarA;
        int iAr3;
        int i8;
        Drawable drawableG;
        boolean z4;
        Drawable drawable;
        GradientDrawable gradientDrawable;
        Drawable drawableG2;
        float height;
        Drawable drawable2;
        int i9;
        int i10;
        Drawable drawableG3;
        boolean z5;
        int i11;
        int iBt2;
        super.a(ajnfVar, xgnVar, map);
        if (ajnfVar == null) {
            TextView textView = this.f;
            textView.setText((CharSequence) null);
            textView.setContentDescription(null);
            if (this.j != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setCompoundDrawablePadding(0);
            }
        } else {
            lqa lqaVar = this.y;
            if (lqaVar.O()) {
                this.f.setAllCaps(false);
            }
            if ((ajnfVar.b & 64) != 0) {
                alayVar = ajnfVar.m;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            CharSequence charSequenceK = ackj.k(null, alayVar, null, false);
            TextView textView2 = this.f;
            textView2.setText(charSequenceK);
            aiqe aiqeVar = ajnfVar.v;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = ajnfVar.v;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                textView2.setContentDescription(aiqdVar.c);
            } else {
                textView2.setContentDescription(null);
            }
            int i12 = 2;
            boolean z6 = (ajnfVar.b & 1) != 0 && ((iBt2 = a.bt(ajnfVar.i)) == 0 || iBt2 != 2);
            int iAS = a.aS(ajnfVar.k);
            if (iAS == 0) {
                iAS = 1;
            }
            aeda aedaVar = this.t;
            if (aedaVar.E()) {
                Context context = textView2.getContext();
                int i13 = ajnfVar.b;
                int i14 = i13 & 1;
                int i15 = R.attr.yt_sys_measurement_action_height_standard;
                if (i14 != 0) {
                    int iBt3 = a.bt(ajnfVar.i);
                    if (iBt3 == 0) {
                        iBt3 = 1;
                    }
                    int i16 = iBt3 - 1;
                    if (i16 != 1) {
                        if (i16 == 2) {
                            i15 = R.attr.yt_sys_measurement_action_height_compact;
                        } else if (i16 == 3) {
                            i15 = R.attr.yt_sys_measurement_action_height_prominent;
                        } else if (i16 == 4) {
                            i15 = R.attr.yt_sys_measurement_action_height_hero;
                        } else if (i16 == 5) {
                            i15 = R.attr.yt_sys_measurement_action_height_tiny;
                        }
                    }
                } else if ((i13 & 2) != 0) {
                    int iAS2 = a.aS(ajnfVar.k);
                    if (iAS2 == 0) {
                        iAS2 = 1;
                    }
                    int i17 = iAS2 - 1;
                    if (i17 != 1 && i17 == 2) {
                        i15 = R.attr.yt_sys_measurement_action_height_compact;
                    }
                }
                optionalEmpty = tzk.m(context, i15);
            } else {
                optionalEmpty = Optional.empty();
            }
            int i18 = 32;
            if (optionalEmpty.isPresent()) {
                iC = ((Float) optionalEmpty.get()).intValue();
            } else {
                int iBt4 = a.bt(ajnfVar.i);
                if (iBt4 == 0) {
                    iBt4 = 1;
                }
                int i19 = iBt4 - 1;
                if (i19 == 2) {
                    i = 32;
                } else if (i19 == 3) {
                    i = 48;
                } else if (i19 == 4) {
                    i = 56;
                } else if (i19 != 5) {
                    int iAS3 = a.aS(ajnfVar.k);
                    if (iAS3 == 0) {
                        iAS3 = 1;
                    }
                    int i20 = iAS3 - 1;
                    if (i20 == 1) {
                        i = 36;
                    } else if (i20 != 2) {
                        i = -1;
                    } else {
                        i = 32;
                    }
                } else {
                    i = 24;
                }
                iC = i != -1 ? twm.c(textView2.getContext().getResources().getDisplayMetrics(), i) : this.m;
            }
            int i21 = this.o;
            if (aedaVar.F() && aedaVar.j()) {
                boolean zJ2 = aedaVar.j();
                int iBt5 = a.bt(ajnfVar.i);
                if (iBt5 == 0) {
                    iBt5 = 1;
                }
                int i22 = iBt5 - 1;
                if (i22 == 2) {
                    if (zJ2) {
                        i18 = 12;
                    } else {
                        i18 = 16;
                    }
                    i11 = i18;
                } else if (i22 == 3) {
                    i11 = zJ2 ? 20 : 24;
                } else if (i22 != 4) {
                    if (i22 == 5) {
                        i11 = 8;
                    } else if (zJ2) {
                        i18 = 16;
                        i11 = i18;
                    }
                } else if (!zJ2) {
                    i11 = i18;
                }
                int iC2 = twm.c(textView2.getContext().getResources().getDisplayMetrics(), i11);
                if (iC > 0) {
                    i21 = 0;
                }
                textView2.setPadding(iC2, i21, iC2, i21);
                textView2.setGravity(17);
            } else if (z6 || iAS == 2 || iAS == 3) {
                int i23 = this.p;
                textView2.setPadding(i23, 0, i23, 0);
                textView2.setGravity(17);
            } else {
                int i24 = this.p;
                textView2.setPadding(i24, i21, i24, i21);
                textView2.setGravity(this.n);
            }
            if (iC != 0) {
                tym.h(textView2, new tyl(iC, 1), ViewGroup.LayoutParams.class);
            }
            int i25 = (ajnfVar.c == 17 ? (ajne) ajnfVar.d : ajne.a).b;
            int i26 = 6;
            int i27 = R.attr.ytTextPrimary;
            if (i25 == 118483990) {
                ajne ajneVar = ajnfVar.c == 17 ? (ajne) ajnfVar.d : ajne.a;
                textView2.setTextColor((ajneVar.b == 118483990 ? (ajkx) ajneVar.c : ajkx.a).d);
            } else if (((ajnfVar.c == 20 ? (aqle) ajnfVar.d : aqle.a).b & 1) != 0) {
                Context context2 = textView2.getContext();
                aqlc aqlcVarA2 = aqlc.a((ajnfVar.c == 20 ? (aqle) ajnfVar.d : aqle.a).c);
                if (aqlcVarA2 == null) {
                    aqlcVarA2 = aqlc.THEME_ATTRIBUTE_UNKNOWN;
                }
                textView2.setTextColor(aedn.b(context2, aqlcVarA2));
            } else {
                if (ajnfVar.l) {
                    if (ajnfVar.c != 1 || (iAr2 = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0) {
                        iAr2 = 1;
                    }
                    int i28 = iAr2 - 1;
                    if (i28 != 35 && i28 != 42) {
                        switch (i28) {
                            case 20:
                                iF = f(R.attr.ytIconDisabled, R.color.yt_grey1);
                                break;
                            case 21:
                            case 22:
                                iF = e(R.color.yt_grey4);
                                break;
                            default:
                                iF = f(R.attr.ytTextDisabled, R.color.yt_grey3);
                                break;
                        }
                    } else {
                        iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_black1);
                        d();
                    }
                } else {
                    if (ajnfVar.c != 1 || (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0) {
                        iAr = 1;
                    }
                    int i29 = iAr - 1;
                    if (i29 == 1) {
                        iF = f(R.attr.ytTextSecondary, R.color.yt_grey5);
                    } else if (i29 == 2) {
                        iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_white1);
                    } else if (i29 == 3) {
                        iF = e(R.color.yt_white1);
                    } else if (i29 == 6) {
                        iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_white1);
                    } else if (i29 == 7) {
                        iF = f(R.attr.ytTextSecondary, R.color.yt_grey5);
                    } else if (i29 == 26) {
                        textView2.getContext().setTheme(R.style.Themed_YouTube_Dark_AppCompat);
                        iF = tzk.i(textView2.getContext(), R.attr.ytTextPrimaryInverse);
                    } else if (i29 == 28) {
                        iF = tzk.n(textView2.getContext(), R.attr.ytTextPrimary).orElse(0);
                    } else if (i29 == 30) {
                        iF = tzk.i(textView2.getContext(), R.attr.ytOverlayTextPrimary);
                    } else if (i29 == 46) {
                        textView2.getContext().setTheme(R.style.Themed_YouTube_Dark_AppCompat);
                        iF = tzk.i(textView2.getContext(), R.attr.ytTextPrimary);
                        d();
                    } else if (i29 == 51) {
                        iF2 = f(R.attr.ytCallToAction, R.color.yt_dark_blue);
                        d();
                        z = true;
                    } else if (i29 == 34) {
                        iF = f(R.attr.ytTextPrimary, R.color.yt_grey3);
                        d();
                    } else if (i29 != 35) {
                        switch (i29) {
                            case 9:
                                iF = e(R.color.yt_white1);
                                break;
                            case 10:
                            case 11:
                                iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_white1);
                                break;
                            default:
                                switch (i29) {
                                    case 13:
                                        iF2 = f(R.attr.ytCallToAction, R.color.yt_dark_blue);
                                        d();
                                        z = true;
                                        break;
                                    case 14:
                                        iF = f(R.attr.ytStaticBrandRed, true != aedaVar.y() ? R.color.yt_youtube_red : R.color.yt_youtube_red_cairo);
                                        break;
                                    case 15:
                                        iF = e(R.color.yt_white1);
                                        break;
                                    case 16:
                                        iF = f(R.attr.ytBrandLinkText, R.color.yt_medium_red);
                                        break;
                                    case 17:
                                        iF = tzk.i(textView2.getContext(), R.attr.ytStaticBrandBlack);
                                        break;
                                    default:
                                        switch (i29) {
                                            case 20:
                                                iF2 = f(R.attr.ytCallToAction, R.color.yt_dark_blue);
                                                z = true;
                                                break;
                                            case 21:
                                            case 22:
                                                iF = e(R.color.yt_white1);
                                                break;
                                            case 23:
                                                iF = f(R.attr.ytCallToActionInverse, R.color.yt_light_blue);
                                                d();
                                                break;
                                            default:
                                                switch (i29) {
                                                    case 39:
                                                    case 43:
                                                        iF = f(R.attr.ytTextPrimary, R.color.yt_grey3);
                                                        d();
                                                        break;
                                                    case 40:
                                                        iF = f(R.attr.ytOverlayTextPrimary, R.color.yt_white1);
                                                        d();
                                                        break;
                                                    case 41:
                                                        iF = f(R.attr.ytStaticBrandBlack, R.color.yt_black4);
                                                        d();
                                                        break;
                                                    case 42:
                                                        iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_white1);
                                                        d();
                                                        break;
                                                    case 44:
                                                        iF = tzk.i(textView2.getContext(), R.attr.ytTextPrimary);
                                                        break;
                                                    default:
                                                        z = false;
                                                        iF2 = 0;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        iF = f(R.attr.ytTextPrimaryInverse, R.color.yt_white1);
                        d();
                    }
                    if (z) {
                        textView2.setTextColor(iF2);
                    }
                }
                iF2 = iF;
                z = true;
                if (z) {
                    textView2.setTextColor(iF2);
                }
            }
            if (!this.i) {
                this.h = false;
                boolean zM = m(ajnfVar);
                int i30 = ajnfVar.c;
                if ((i30 == 17 ? (ajne) ajnfVar.d : ajne.a).b == 118483990) {
                    ajne ajneVar2 = i30 == 17 ? (ajne) ajnfVar.d : ajne.a;
                    GradientDrawable gradientDrawableI = i((ajneVar2.b == 118483990 ? (ajkx) ajneVar2.c : ajkx.a).c, zM);
                    this.x = Optional.of(gradientDrawableI);
                    ajne ajneVar3 = ajnfVar.c == 17 ? (ajne) ajnfVar.d : ajne.a;
                    b(textView2, gradientDrawableI, (ajneVar3.b == 118483990 ? (ajkx) ajneVar3.c : ajkx.a).c != 0);
                } else {
                    boolean z7 = ajnfVar.l;
                    if (i30 != 1 || (iAr3 = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0) {
                        iAr3 = 1;
                    }
                    int i31 = iAr3 - 1;
                    if (i31 == 1) {
                        if (zM) {
                            i8 = 0;
                            drawableG = i(f(R.attr.ytBrandBackgroundSolid, R.color.yt_white1), true);
                        } else {
                            i8 = 0;
                            drawableG = g(R.color.yt_white1, false);
                        }
                        z4 = true;
                        drawable = drawableG;
                    } else {
                        if (i31 == 2) {
                            if (!zM) {
                                if (!z7) {
                                    drawableG2 = g(R.color.yt_black_pure_opacity10, true);
                                } else {
                                    drawableG2 = i(f(R.attr.ytCallToAction, R.color.yt_dark_blue), true);
                                }
                            } else if (!z7) {
                                drawableG2 = g(R.color.yt_black_pure_opacity10, false);
                            } else {
                                gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(f(R.attr.ytCallToAction, R.color.yt_dark_blue));
                                gradientDrawable.setShape(0);
                                if (lqaVar.P()) {
                                    height = textView2.getHeight();
                                    if (height > 0.0f) {
                                        gradientDrawable.setCornerRadius(height / 2.0f);
                                    }
                                    this.x = Optional.of(gradientDrawable);
                                }
                                drawableG2 = gradientDrawable;
                            }
                            z4 = true;
                            drawable2 = drawableG2;
                        } else if (i31 == 3) {
                            if (zM) {
                                if (z7) {
                                    i9 = R.color.yt_black_pure_opacity10;
                                } else if (aedaVar.y()) {
                                    i9 = R.color.yt_medium_red_cairo;
                                } else {
                                    i9 = R.color.yt_youtube_red;
                                }
                                drawableG2 = g(i9, false);
                            } else if (!z7) {
                                drawableG2 = i(f(R.attr.ytIconDisabled, R.color.yt_grey1), true);
                            } else {
                                if (true != aedaVar.y()) {
                                    i10 = R.drawable.button_color_brand_primary_background;
                                } else {
                                    i10 = R.drawable.button_color_error_background;
                                }
                                drawableG2 = h(i10);
                            }
                            z4 = true;
                            drawable2 = drawableG2;
                        } else if (i31 == 6) {
                            if (!zM) {
                                if (!z7) {
                                    drawableG2 = g(R.color.yt_black_pure_opacity10, true);
                                } else {
                                    drawableG2 = i(f(R.attr.ytCallToAction, R.color.yt_dark_blue), true);
                                }
                            } else if (!z7) {
                                drawableG2 = g(R.color.yt_black_pure_opacity10, false);
                            } else {
                                gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(f(R.attr.ytCallToAction, R.color.yt_dark_blue));
                                gradientDrawable.setShape(0);
                                if (lqaVar.P()) {
                                    height = textView2.getHeight();
                                    if (height > 0.0f) {
                                        gradientDrawable.setCornerRadius(height / 2.0f);
                                    }
                                    this.x = Optional.of(gradientDrawable);
                                }
                                drawableG2 = gradientDrawable;
                            }
                            z4 = true;
                            drawable2 = drawableG2;
                        } else if (i31 == 7) {
                            this.h = true;
                            if (zM) {
                                drawableG3 = h(R.drawable.button_color_transparent_background);
                            } else {
                                drawableG3 = g(android.R.color.transparent, false);
                            }
                            z4 = false;
                            drawable2 = drawableG3;
                        } else {
                            if (i31 == 26) {
                                GradientDrawable gradientDrawableK = k(R.attr.ytStaticBrandWhite, zM);
                                gradientDrawableK.setCornerRadius(twm.c(textView2.getContext().getResources().getDisplayMetrics(), 1000));
                                drawableG2 = gradientDrawableK;
                            } else if (i31 == 28) {
                                this.h = true;
                                if (zM) {
                                    drawableG3 = h(R.drawable.button_color_transparent_background);
                                } else {
                                    drawableG3 = g(android.R.color.transparent, false);
                                }
                                z4 = false;
                                drawable2 = drawableG3;
                            } else if (i31 == 30) {
                                if (!zM) {
                                    z5 = false;
                                } else if (lqaVar.P()) {
                                    z5 = true;
                                } else {
                                    drawableG2 = j(tzk.i(textView2.getContext(), R.attr.ytOverlayButtonPrimary), 0);
                                }
                                drawableG2 = k(R.attr.ytOverlayButtonPrimary, z5);
                            } else if (i31 == 46) {
                                drawableG2 = new aedm(textView2.getContext(), aedl.b);
                            } else if (i31 == 51 || i31 == 34) {
                                if (!zM) {
                                    if (true == lqaVar.P()) {
                                        i27 = R.attr.ytOutline;
                                    }
                                    drawableG2 = j(0, f(i27, R.color.yt_black1));
                                } else {
                                    drawableG2 = g(android.R.color.transparent, false);
                                }
                            } else if (i31 != 35) {
                                switch (i31) {
                                    case 9:
                                        if (zM) {
                                            if (z7) {
                                                i9 = R.color.yt_black_pure_opacity10;
                                            } else if (aedaVar.y()) {
                                                i9 = R.color.yt_medium_red_cairo;
                                            } else {
                                                i9 = R.color.yt_youtube_red;
                                            }
                                            drawableG2 = g(i9, false);
                                        } else if (!z7) {
                                            if (true != aedaVar.y()) {
                                                i10 = R.drawable.button_color_brand_primary_background;
                                            } else {
                                                i10 = R.drawable.button_color_error_background;
                                            }
                                            drawableG2 = h(i10);
                                        } else {
                                            drawableG2 = i(f(R.attr.ytIconDisabled, R.color.yt_grey1), true);
                                        }
                                        break;
                                    case 10:
                                    case 11:
                                        if (!zM) {
                                            if (!z7) {
                                                gradientDrawable = new GradientDrawable();
                                                gradientDrawable.setColor(f(R.attr.ytCallToAction, R.color.yt_dark_blue));
                                                gradientDrawable.setShape(0);
                                                if (lqaVar.P()) {
                                                    height = textView2.getHeight();
                                                    if (height > 0.0f) {
                                                        gradientDrawable.setCornerRadius(height / 2.0f);
                                                    }
                                                    this.x = Optional.of(gradientDrawable);
                                                }
                                                drawableG2 = gradientDrawable;
                                            } else {
                                                drawableG2 = g(R.color.yt_black_pure_opacity10, false);
                                            }
                                        } else if (!z7) {
                                            drawableG2 = i(f(R.attr.ytCallToAction, R.color.yt_dark_blue), true);
                                        } else {
                                            drawableG2 = g(R.color.yt_black_pure_opacity10, true);
                                        }
                                        break;
                                    default:
                                        switch (i31) {
                                            case 13:
                                            case 15:
                                            case 16:
                                            case 17:
                                                this.h = true;
                                                if (zM) {
                                                    drawableG3 = h(R.drawable.button_color_transparent_background);
                                                } else {
                                                    drawableG3 = g(android.R.color.transparent, false);
                                                }
                                                z4 = false;
                                                drawable2 = drawableG3;
                                                break;
                                            case 14:
                                                if (zM) {
                                                    i8 = 0;
                                                    drawableG = i(f(R.attr.ytBrandBackgroundSolid, R.color.yt_white1), true);
                                                } else {
                                                    i8 = 0;
                                                    drawableG = g(R.color.yt_white1, false);
                                                }
                                                z4 = true;
                                                drawable = drawableG;
                                                break;
                                            default:
                                                switch (i31) {
                                                    case 20:
                                                        if (!zM) {
                                                            drawableG2 = g(R.color.yt_pale_blue, false);
                                                        } else {
                                                            drawableG2 = j(0, z7 ? f(true != lqaVar.P() ? R.attr.ytIconDisabled : R.attr.ytBadgeChipBackground, R.color.yt_grey1) : f(true != lqaVar.P() ? R.attr.ytCallToAction : R.attr.ytOutline, R.color.yt_dark_blue));
                                                        }
                                                        break;
                                                    case 21:
                                                        drawableG2 = !zM ? g(R.color.yt_white1_opacity10, false) : h(true != z7 ? R.drawable.button_translucent_white_with_border_background : R.drawable.disabled_button_translucent_white_with_border_background);
                                                        break;
                                                    case 22:
                                                        drawableG2 = k(R.attr.ytStaticBrandBlack, zM);
                                                        break;
                                                    default:
                                                        switch (i31) {
                                                            case 39:
                                                                drawableG2 = k(R.attr.ytAdditiveBackground, zM);
                                                                break;
                                                            case 40:
                                                                drawableG2 = i(f(R.attr.ytOverlayButtonSecondary, R.color.yt_white1_opacity10), true);
                                                                break;
                                                            case 41:
                                                                drawableG2 = i(f(R.attr.ytOverlayTextPrimary, R.color.yt_white1), true);
                                                                break;
                                                            case 42:
                                                                drawableG2 = !z7 ? k(R.attr.ytTextPrimary, zM) : k(R.attr.ytTextSecondaryInverse, zM);
                                                                break;
                                                            case 43:
                                                                if (!zM) {
                                                                    drawableG2 = g(android.R.color.transparent, false);
                                                                } else {
                                                                    if (true == lqaVar.P()) {
                                                                        i27 = R.attr.ytOutline;
                                                                    }
                                                                    drawableG2 = j(0, f(i27, R.color.yt_black1));
                                                                }
                                                                break;
                                                            case 44:
                                                                this.h = true;
                                                                if (zM) {
                                                                    drawableG3 = h(R.drawable.button_color_transparent_background);
                                                                } else {
                                                                    drawableG3 = g(android.R.color.transparent, false);
                                                                }
                                                                z4 = false;
                                                                drawable2 = drawableG3;
                                                                break;
                                                            default:
                                                                z4 = true;
                                                                drawable2 = null;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                drawableG2 = k(R.attr.ytTextPrimary, zM);
                            }
                            z4 = true;
                            drawable2 = drawableG2;
                        }
                        i8 = 0;
                        drawable = drawable2;
                    }
                    Drawable background = drawable;
                    if (this.g) {
                        b(textView2, drawable, z4);
                    } else {
                        if (drawable == null) {
                            background = textView2.getBackground();
                        }
                        tuk.k(textView2, background, i8);
                    }
                }
            }
            aduv aduvVar = this.j;
            if (aduvVar != null) {
                int i32 = ajnfVar.e;
                i2 = 8;
                if (i32 == 8) {
                    aliz alizVarA = aliz.a((i32 == 8 ? (alja) ajnfVar.f : alja.a).c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    iB = aduvVar.a(alizVarA);
                }
                i3 = iB;
                if (i3 != 0) {
                    drawableD = dl.d(textView2.getContext(), i3);
                    if (ajnfVar.c == 20) {
                        aqleVar = (aqle) ajnfVar.d;
                    } else {
                        aqleVar = aqle.a;
                    }
                    if ((aqleVar.b & 2) != 0) {
                        Context context3 = textView2.getContext();
                        if (ajnfVar.c == 20) {
                            aqleVar2 = (aqle) ajnfVar.d;
                        } else {
                            aqleVar2 = aqle.a;
                        }
                        aqlcVarA = aqlc.a(aqleVar2.d);
                        if (aqlcVarA == null) {
                            aqlcVarA = aqlc.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        numValueOf = Integer.valueOf(aedn.b(context3, aqlcVarA));
                    } else if (this.v) {
                        numValueOf = Integer.valueOf(textView2.getCurrentTextColor());
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null && drawableD != null) {
                        drawableD = drawableD.mutate();
                        ttk.a(drawableD, numValueOf.intValue(), PorterDuff.Mode.SRC_IN);
                    }
                    if (aedaVar.F()) {
                        zJ = aedaVar.j();
                        boolean zK = aedaVar.k();
                        iBt = a.bt(ajnfVar.i);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        i6 = iBt - 1;
                        if (i6 != 2) {
                            if (i6 != 3 || i6 == 4) {
                                i7 = R.attr.yt_sys_measurement_icon_size_comfortable;
                            } else if (i6 != 5) {
                                if (zK) {
                                    i7 = R.attr.yt_sys_measurement_icon_size_compact;
                                } else {
                                    i7 = R.attr.yt_sys_measurement_icon_size_comfortable;
                                }
                            } else if (zJ) {
                                i7 = R.attr.yt_sys_measurement_icon_size_mini;
                            } else {
                                i7 = R.attr.yt_sys_measurement_icon_size_condensed;
                            }
                        } else if (zJ) {
                            i7 = R.attr.yt_sys_measurement_icon_size_compact;
                        } else {
                            i7 = R.attr.yt_sys_measurement_icon_size_condensed;
                        }
                        optionalM = tzk.m(textView2.getContext(), i7);
                        if (true == optionalM.isPresent()) {
                            optionalM = Optional.ofNullable(Integer.valueOf(((Float) optionalM.get()).intValue()));
                        }
                        this.w = ((Integer) optionalM.orElse(-1)).intValue();
                    }
                    i5 = this.w;
                    if (i5 != -1) {
                        if (drawableD != null) {
                            drawableD.setBounds(0, 0, i5, i5);
                        }
                        l(ajnfVar, drawableD, false);
                    } else {
                        l(ajnfVar, drawableD, true);
                    }
                } else {
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (!TextUtils.isEmpty(textView2.getText()) || i3 == 0) {
                    z2 = false;
                    textView2.setCompoundDrawablePadding(0);
                } else {
                    if (aedaVar.F()) {
                        boolean zJ3 = aedaVar.j();
                        int iBt6 = a.bt(ajnfVar.i);
                        if (iBt6 == 0) {
                            iBt6 = 1;
                        }
                        int i33 = iBt6 - 1;
                        if (i33 == 2) {
                            i12 = 4;
                        } else if (i33 == 3) {
                            i12 = i2;
                        } else if (i33 != 4) {
                            if (i33 != 5) {
                                i12 = 6;
                            } else if (zJ3) {
                                i12 = 4;
                            }
                        } else if (zJ3) {
                            i12 = i2;
                        } else {
                            i12 = 12;
                        }
                        textView2.setCompoundDrawablePadding(twm.c(textView2.getContext().getResources().getDisplayMetrics(), i12));
                    } else {
                        int i34 = this.u;
                        if (i34 != -1) {
                            textView2.setCompoundDrawablePadding(i34);
                        } else {
                            if ((ajnfVar.b & 1) != 0) {
                                optionalEmpty2 = Optional.empty();
                                int iBt7 = a.bt(ajnfVar.i);
                                if (iBt7 == 0) {
                                    iBt7 = 1;
                                }
                                int i35 = iBt7 - 1;
                                if (i35 == 1) {
                                    optionalEmpty2 = Optional.of(Integer.valueOf(R.dimen.default_text_button_icon_padding));
                                } else if (i35 == 2) {
                                    optionalEmpty2 = Optional.of(Integer.valueOf(R.dimen.small_text_button_icon_padding));
                                } else if (i35 == 3) {
                                    optionalEmpty2 = Optional.of(Integer.valueOf(R.dimen.large_text_button_icon_padding));
                                } else if (i35 == 4) {
                                    optionalEmpty2 = Optional.of(Integer.valueOf(R.dimen.xlarge_text_button_icon_padding));
                                } else if (i35 == 5) {
                                    optionalEmpty2 = Optional.of(Integer.valueOf(R.dimen.xsmall_text_button_icon_padding));
                                }
                                adha adhaVar = new adha(this, i26);
                                if (true == optionalEmpty2.isPresent()) {
                                    optionalEmpty2 = Optional.ofNullable(Integer.valueOf(((aeaa) adhaVar.a).f.getResources().getDimensionPixelOffset(((Integer) optionalEmpty2.get()).intValue())));
                                }
                            } else {
                                optionalEmpty2 = Optional.empty();
                            }
                            textView2.getClass();
                            adyu adyuVar = new adyu(textView2, i12);
                            if (true == optionalEmpty2.isPresent()) {
                                ((TextView) adyuVar.a).setCompoundDrawablePadding(((Integer) optionalEmpty2.get()).intValue());
                            }
                        }
                    }
                    z2 = false;
                }
                boolean zM2 = m(ajnfVar);
                if (lqaVar.P() || !zM2 || this.i) {
                    z3 = z2;
                } else {
                    z3 = true;
                }
                if (textView2 instanceof YouTubeAppCompatTextView) {
                    ((YouTubeAppCompatTextView) textView2).k = new aeds(this.z, this.x, aedaVar, z3);
                } else {
                    textView2.addOnLayoutChangeListener(new adzz(z3, this.x));
                }
            } else {
                i2 = 8;
            }
            adxj adxjVar = this.k;
            if (adxjVar == null || (i4 = ajnfVar.e) != 35) {
                i3 = 0;
            } else {
                if (i4 != 35 || (arqzVarA = arqz.a(((Integer) ajnfVar.f).intValue())) == null) {
                    arqzVarA = arqz.a;
                }
                iB = adxjVar.b(arqzVarA);
                i3 = iB;
            }
            if (i3 != 0) {
                drawableD = dl.d(textView2.getContext(), i3);
                if (ajnfVar.c == 20) {
                    aqleVar = (aqle) ajnfVar.d;
                } else {
                    aqleVar = aqle.a;
                }
                if ((aqleVar.b & 2) != 0) {
                    Context context4 = textView2.getContext();
                    if (ajnfVar.c == 20) {
                        aqleVar2 = (aqle) ajnfVar.d;
                    } else {
                        aqleVar2 = aqle.a;
                    }
                    aqlcVarA = aqlc.a(aqleVar2.d);
                    if (aqlcVarA == null) {
                        aqlcVarA = aqlc.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    numValueOf = Integer.valueOf(aedn.b(context4, aqlcVarA));
                } else if (this.v) {
                    numValueOf = Integer.valueOf(textView2.getCurrentTextColor());
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    drawableD = drawableD.mutate();
                    ttk.a(drawableD, numValueOf.intValue(), PorterDuff.Mode.SRC_IN);
                }
                if (aedaVar.F()) {
                    zJ = aedaVar.j();
                    boolean zK2 = aedaVar.k();
                    iBt = a.bt(ajnfVar.i);
                    if (iBt == 0) {
                        iBt = 1;
                    }
                    i6 = iBt - 1;
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i7 = R.attr.yt_sys_measurement_icon_size_comfortable;
                        } else {
                            i7 = R.attr.yt_sys_measurement_icon_size_comfortable;
                        }
                    } else if (zJ) {
                        i7 = R.attr.yt_sys_measurement_icon_size_compact;
                    } else {
                        i7 = R.attr.yt_sys_measurement_icon_size_condensed;
                    }
                    optionalM = tzk.m(textView2.getContext(), i7);
                    if (true == optionalM.isPresent()) {
                        optionalM = Optional.ofNullable(Integer.valueOf(((Float) optionalM.get()).intValue()));
                    }
                    this.w = ((Integer) optionalM.orElse(-1)).intValue();
                }
                i5 = this.w;
                if (i5 != -1) {
                    if (drawableD != null) {
                        drawableD.setBounds(0, 0, i5, i5);
                    }
                    l(ajnfVar, drawableD, false);
                } else {
                    l(ajnfVar, drawableD, true);
                }
            } else {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (TextUtils.isEmpty(textView2.getText())) {
                z2 = false;
                textView2.setCompoundDrawablePadding(0);
            } else {
                z2 = false;
                textView2.setCompoundDrawablePadding(0);
            }
            boolean zM3 = m(ajnfVar);
            if (lqaVar.P()) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            if (textView2 instanceof YouTubeAppCompatTextView) {
                ((YouTubeAppCompatTextView) textView2).k = new aeds(this.z, this.x, aedaVar, z3);
            } else {
                textView2.addOnLayoutChangeListener(new adzz(z3, this.x));
            }
        }
        this.l.a(this.f);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [aeda, java.lang.Object] */
    public final void b(TextView textView, Drawable drawable, boolean z) {
        if (z) {
            if (drawable != null) {
                tym.Z(textView, drawable);
            }
            Interpolator interpolator = aedd.a;
            textView.setOnTouchListener(new aedc());
            return;
        }
        int i = this.y.a.d() ? this.r : 0;
        int iOrElse = tzk.n(textView.getContext(), R.attr.ytTouchResponse).orElse(0);
        if (drawable == null) {
            drawable = textView.getBackground();
        }
        aedd.c(textView, iOrElse, i, drawable);
    }

    @Deprecated
    public final void c() {
        this.u = this.f.getResources().getDimensionPixelOffset(R.dimen.price_icon_compound_padding);
    }

    public final void d() {
        this.v = true;
    }
}
