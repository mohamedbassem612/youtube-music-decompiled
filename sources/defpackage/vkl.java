package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.RoundedCornersEditText;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkl extends aevq implements View.OnClickListener, vio {
    private static final agrf Q = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/AddTextController");
    public SeekBar A;
    public CoordinatorLayout B;
    ugc C;
    public boolean D;
    public boolean E;
    public boolean F;
    public vkw G;
    public auir H;
    public xgn I;
    public boolean J;
    public ajwo K;
    public int L;
    public TextWatcher M;
    public final umf N;
    public xpl P;
    private final vkk R;
    private final xgn S;
    private final adxj T;
    private final uko U;
    private final qrx V;
    private final aaok W;
    public final Activity a;
    public final cc b;
    public final vkt c;
    public final vyo d;
    public final awlo e;
    public final uwi f;
    public final awmd g;
    public final awmd h;
    public final vkv j;
    public final ujp k;
    public vkr l;
    public View m;
    public View n;
    public Integer o;
    public final Optional p;
    public RoundedCornersEditText q;
    public View r;
    public View s;
    public ImageView t;
    public View u;
    public View v;
    public LinearLayout w;
    public View x;
    public ImageView y;
    public TextView z;
    public final avmm i = new avmm();
    public int O = 2;

    public vkl(cc ccVar, umf umfVar, vkv vkvVar, ujp ujpVar, vkk vkkVar, xgn xgnVar, vyo vyoVar, vkt vktVar, qrx qrxVar, uwi uwiVar, awmd awmdVar, awmd awmdVar2, uko ukoVar, adxj adxjVar, aaok aaokVar) {
        this.N = umfVar;
        this.j = vkvVar;
        this.k = ujpVar;
        ujpVar.j = this;
        this.R = vkkVar;
        this.b = ccVar;
        this.a = ccVar.getActivity();
        this.S = xgnVar;
        this.d = vyoVar;
        this.c = vktVar;
        this.V = qrxVar;
        this.e = new awlo();
        this.p = Optional.empty();
        this.H = auir.FONT_FAMILY_UNSPECIFIED;
        this.f = uwiVar;
        this.g = awmdVar;
        this.h = awmdVar2;
        this.U = ukoVar;
        this.T = adxjVar;
        this.W = aaokVar;
    }

    private final Drawable s(arqz arqzVar) {
        if (this.W.J()) {
            return aecm.p(this.a, arqzVar, R.attr.ytStaticBrandWhite, this.T);
        }
        return null;
    }

    private final void t(ugc ugcVar) {
        this.C = ugcVar;
        this.U.a(ugcVar);
    }

    private final void u(int i) {
        Activity activity = this.a;
        this.z.setContentDescription(activity.getString(R.string.reel_advanced_text_font_button_a11y_label, new Object[]{activity.getString(i)}));
    }

    private final void v(int i) {
        this.c.e.setVisibility(i);
        SeekBar seekBar = this.A;
        if (seekBar != null) {
            seekBar.setVisibility(i);
        }
    }

    private final void w(auzc auzcVar) {
        int i;
        int i2;
        int i3;
        Drawable drawableP;
        int i4 = auzcVar.a;
        agjt agjtVar = ujq.a;
        if (i4 == 0) {
            i = 1;
        } else if (i4 != 1) {
            i = i4 != 2 ? 2 : 4;
        } else {
            i = 3;
        }
        RoundedCornersEditText roundedCornersEditText = this.q;
        roundedCornersEditText.b = i4 == 3;
        roundedCornersEditText.requestLayout();
        ImageView imageView = this.t;
        if (i4 == 3) {
            imageView.setScaleX(0.8f);
            this.t.setScaleY(0.8f);
            i4 = 3;
        } else {
            imageView.setScaleX(1.0f);
            this.t.setScaleY(1.0f);
        }
        vkw vkwVar = this.G;
        if (vkwVar != null) {
            vkwVar.d(i);
        }
        aaok aaokVar = this.W;
        if (aaokVar.J()) {
            if (!aaokVar.J()) {
                drawableP = null;
            } else if (i4 == 0) {
                drawableP = aecm.p(this.a, arqz.hx, R.attr.ytStaticBrandWhite, this.T);
            } else if (i4 != 1) {
                Activity activity = this.a;
                if (i4 != 2) {
                    drawableP = aecm.p(activity, arqz.ht, R.attr.ytStaticBrandWhite, this.T);
                } else {
                    drawableP = aecm.o(activity, arqz.aA, avv.f(tzk.i(activity, R.attr.ytStaticBrandWhite), SemanticState.Focused), this.T);
                }
            } else {
                drawableP = aecm.p(this.a, arqz.aA, R.attr.ytStaticBrandWhite, this.T);
            }
            this.t.setImageDrawable(drawableP);
            this.t.setBackground(null);
        } else {
            this.t.setImageDrawable(null);
            ImageView imageView2 = this.t;
            int i5 = auzcVar.a;
            if (i5 == 0) {
                i2 = R.drawable.ic_background_off;
            } else if (i5 != 1) {
                i2 = i5 != 3 ? R.drawable.ic_background_translucent : R.drawable.ic_outline;
            } else {
                i2 = R.drawable.ic_background_on;
            }
            imageView2.setBackgroundResource(i2);
        }
        View view = this.s;
        Activity activity2 = this.a;
        int i6 = auzcVar.a;
        if (i6 == 0) {
            i3 = R.string.text_background_off;
        } else if (i6 != 1) {
            i3 = i6 != 3 ? R.string.text_background_translucent : R.string.text_background_outline;
        } else {
            i3 = R.string.text_background_on;
        }
        view.setContentDescription(activity2.getString(i3));
        int iBc = a.bc(i);
        if (iBc != 0) {
            xgn xgnVar = this.S;
            ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
            xgj xgjVar = new xgj(xhb.b(173028));
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amdr.a.createBuilder();
            aihf aihfVarCreateBuilder3 = amdq.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            amdq amdqVar = (amdq) aihfVarCreateBuilder3.instance;
            amdqVar.c = iBc - 1;
            amdqVar.b |= 1;
            amdq amdqVar2 = (amdq) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            amdr amdrVar = (amdr) aihfVarCreateBuilder2.instance;
            amdqVar2.getClass();
            amdrVar.c = amdqVar2;
            amdrVar.b |= 16777216;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amdr amdrVar2 = (amdr) aihfVarCreateBuilder2.build();
            amdrVar2.getClass();
            amddVar.u = amdrVar2;
            amddVar.c |= 262144;
            xgnVar.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
        }
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        if (i == 5) {
            tym.j(this.w, -1, -1);
            v(0);
        } else {
            v(8);
            if (i == 2) {
                tym.h(this.w, new tyl(this.B.getHeight() / 2, 1), ViewGroup.LayoutParams.class);
            }
        }
    }

    public final int c() {
        Editable text = this.q.getText();
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    public final void d() {
        this.O = 2;
        this.G = null;
        this.F = true;
        this.q.setVisibility(4);
        f();
        j();
        n(false);
        Integer num = this.o;
        if (num != null) {
            View view = this.n;
            view.getClass();
            tym.h(view, new tyl(num.intValue(), 1), ViewGroup.LayoutParams.class);
            this.o = null;
        }
        this.k.h = false;
    }

    public final void e() {
        int i;
        jrr jrrVar;
        auho auhoVar;
        int i2;
        final int i3;
        xpl xplVar;
        vkw vkwVar = this.G;
        if (vkwVar != null) {
            int iC = c();
            uxi uxiVar = vkwVar.a;
            if (iC > 0) {
                this.q.clearComposingText();
                this.q.setCursorVisible(false);
                Optional.empty();
                Optional.empty();
                Optional optionalEmpty = Optional.empty();
                if (this.E && (xplVar = this.P) != null) {
                    Rect rect = new Rect();
                    ((View) xplVar.b).getHitRect(rect);
                    Optional.of(rect);
                    Optional.of(Float.valueOf(((View) xplVar.a).getWidth()));
                    optionalEmpty = Optional.of(xplVar.s());
                }
                Optional optional = optionalEmpty;
                RoundedCornersEditText roundedCornersEditText = this.q;
                roundedCornersEditText.setDrawingCacheEnabled(true);
                roundedCornersEditText.buildDrawingCache(true);
                Context context = roundedCornersEditText.getContext();
                int width = roundedCornersEditText.getWidth();
                int height = roundedCornersEditText.getLayout() != null ? roundedCornersEditText.getLayout().getHeight() : roundedCornersEditText.getHeight();
                LinearLayout linearLayout = (LinearLayout) roundedCornersEditText.getParent();
                linearLayout.removeView(roundedCornersEditText);
                ViewGroup.LayoutParams layoutParams = roundedCornersEditText.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(layoutParams);
                tym.j(roundedCornersEditText, width, height);
                roundedCornersEditText.scrollTo(-((roundedCornersEditText.getTextAlignment() == 5 && roundedCornersEditText.b) ? (int) roundedCornersEditText.d() : 0), 0);
                Bitmap bitmapFu = yno.fu(context, roundedCornersEditText);
                linearLayout.addView(roundedCornersEditText, layoutParams2);
                roundedCornersEditText.setDrawingCacheEnabled(false);
                Activity activity = this.a;
                RoundedCornersEditText roundedCornersEditText2 = this.q;
                boolean zD = this.W.D();
                Drawable background = roundedCornersEditText2.getBackground();
                int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
                Editable text = roundedCornersEditText2.getText();
                vky vkyVar = new vky(text == null ? "" : text.toString(), nqx.e(roundedCornersEditText2.getTextSize(), activity.getResources().getDisplayMetrics().densityDpi), roundedCornersEditText2.getCurrentTextColor(), color, roundedCornersEditText2.getTextAlignment());
                vkwVar.c(vkyVar.a);
                vkwVar.f = vkyVar.b;
                vkwVar.e = vkyVar.e;
                vkwVar.g = vkyVar.c;
                vkwVar.h = vkyVar.d;
                if (zD) {
                    int i4 = vkx.g[roundedCornersEditText2.e.ordinal()];
                    float f = roundedCornersEditText2.f;
                }
                boolean z = roundedCornersEditText2.c;
                this.q.getHitRect(new Rect());
                umf umfVar = this.N;
                yhi yhiVar = new yhi(this, uxiVar);
                Optional optionalEmpty2 = Optional.empty();
                Optional optionalEmpty3 = Optional.empty();
                Optional optionalEmpty4 = Optional.empty();
                Optional optional2 = umfVar.f.f;
                umc umcVar = new umc(activity, bitmapFu, vkwVar, optional, yhiVar, optionalEmpty2, optionalEmpty3, optionalEmpty4);
                if (true != optional2.isPresent()) {
                    i2 = 0;
                } else {
                    Object obj = optional2.get();
                    Activity activity2 = umcVar.a;
                    Bitmap bitmap = umcVar.b;
                    vkw vkwVar2 = umcVar.c;
                    Optional optionalOfNullable = umcVar.d;
                    yhi yhiVar2 = umcVar.h;
                    Optional optional3 = umcVar.e;
                    Optional optional4 = umcVar.f;
                    Optional optional5 = umcVar.g;
                    Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
                    uql uqlVar = (uql) obj;
                    auho auhoVarB = uqlVar.b(size);
                    optional5.isPresent();
                    auho auhoVar2 = (auho) optional5.orElse(auhoVarB);
                    uxi uxiVar2 = vkwVar2.a;
                    if (uxiVar2 == null) {
                        jrrVar = (jrr) augy.a.createBuilder();
                        optional4.isPresent();
                        i = 2;
                        aigu aiguVar = aikw.a;
                        jrrVar.copyOnWrite();
                        augy augyVar = (augy) jrrVar.instance;
                        aiguVar.getClass();
                        augyVar.i = aiguVar;
                        augyVar.b |= 16;
                        optional4.isPresent();
                        aigu aiguVarAu = ahng.au(uqlVar.f.d());
                        jrrVar.copyOnWrite();
                        augy augyVar2 = (augy) jrrVar.instance;
                        aiguVarAu.getClass();
                        augyVar2.j = aiguVarAu;
                        augyVar2.b |= 32;
                        optional5.isPresent();
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVarCreateBuilder = auhp.a.createBuilder();
                            PointF pointF = (PointF) obj2;
                            float f2 = pointF.x;
                            aihfVarCreateBuilder.copyOnWrite();
                            auhp auhpVar = (auhp) aihfVarCreateBuilder.instance;
                            auhpVar.b |= 1;
                            auhpVar.c = f2;
                            float f3 = pointF.y;
                            aihfVarCreateBuilder.copyOnWrite();
                            auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
                            auhpVar2.b |= 2;
                            auhpVar2.d = f3;
                            optionalOfNullable = Optional.ofNullable((auhp) aihfVarCreateBuilder.build());
                        }
                        auhp auhpVar3 = (auhp) optionalOfNullable.orElse(uql.b);
                        jrrVar.copyOnWrite();
                        augy augyVar3 = (augy) jrrVar.instance;
                        auhpVar3.getClass();
                        augyVar3.k = auhpVar3;
                        augyVar3.b |= 64;
                        jrrVar.copyOnWrite();
                        augy augyVar4 = (augy) jrrVar.instance;
                        auhoVar2.getClass();
                        augyVar4.l = auhoVar2;
                        augyVar4.b |= SemanticState.Focused;
                        optional5.isPresent();
                        jrrVar.copyOnWrite();
                        augy augyVar5 = (augy) jrrVar.instance;
                        augyVar5.b |= SemanticState.ReadOnly;
                        augyVar5.o = 0.0d;
                        aihf aihfVarCreateBuilder2 = auhn.a.createBuilder();
                        int width2 = size.getWidth();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auhn auhnVar = (auhn) aihfVarCreateBuilder2.instance;
                        auhnVar.b |= 1;
                        auhnVar.c = width2;
                        int height2 = size.getHeight();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auhn auhnVar2 = (auhn) aihfVarCreateBuilder2.instance;
                        auhnVar2.b |= 2;
                        auhnVar2.d = height2;
                        jrrVar.copyOnWrite();
                        augy augyVar6 = (augy) jrrVar.instance;
                        auhn auhnVar3 = (auhn) aihfVarCreateBuilder2.build();
                        auhnVar3.getClass();
                        augyVar6.r = auhnVar3;
                        augyVar6.b |= SemanticState.Obscured;
                        optional3.isPresent();
                    } else {
                        i = 2;
                        augy augyVar7 = ((uxk) uxiVar2).a;
                        jrrVar = (jrr) augyVar7.toBuilder();
                        augu auguVar = augyVar7.c == 101 ? (augu) augyVar7.d : augu.a;
                        auhn auhnVar4 = auhn.a;
                        aihf aihfVarCreateBuilder3 = auhnVar4.createBuilder();
                        int width3 = size.getWidth();
                        aihfVarCreateBuilder3.copyOnWrite();
                        auhn auhnVar5 = (auhn) aihfVarCreateBuilder3.instance;
                        auhnVar5.b |= 1;
                        auhnVar5.c = width3;
                        int height3 = size.getHeight();
                        aihfVarCreateBuilder3.copyOnWrite();
                        auhn auhnVar6 = (auhn) aihfVarCreateBuilder3.instance;
                        auhnVar6.b |= 2;
                        auhnVar6.d = height3;
                        auhn auhnVar7 = (auhn) aihfVarCreateBuilder3.build();
                        agrf agrfVar = usj.a;
                        if ((augyVar7.b & SemanticState.Focused) != 0) {
                            auhoVar = augyVar7.l;
                            if (auhoVar == null) {
                                auhoVar = auho.a;
                            }
                        } else {
                            auhoVar = usj.b;
                        }
                        jrrVar.copyOnWrite();
                        augy augyVar8 = (augy) jrrVar.instance;
                        auhoVar.getClass();
                        augyVar8.l = auhoVar;
                        augyVar8.b |= SemanticState.Focused;
                        jrrVar.copyOnWrite();
                        augy augyVar9 = (augy) jrrVar.instance;
                        auhnVar7.getClass();
                        augyVar9.r = auhnVar7;
                        augyVar9.b |= SemanticState.Obscured;
                        if ((augyVar7.b & SemanticState.Obscured) != 0) {
                            auhn auhnVar8 = augyVar7.r;
                            if (auhnVar8 == null) {
                                auhnVar8 = auhnVar4;
                            }
                            if (!auhnVar8.equals(auhnVar7)) {
                                auhn auhnVar9 = augyVar7.r;
                                if (auhnVar9 != null) {
                                    auhnVar4 = auhnVar9;
                                }
                                auho auhoVarC = uqlVar.c(auhnVar4, auhnVar7, auhoVar);
                                jrrVar.copyOnWrite();
                                augy augyVar10 = (augy) jrrVar.instance;
                                auhoVarC.getClass();
                                augyVar10.l = auhoVarC;
                                augyVar10.b |= SemanticState.Focused;
                            }
                        }
                        if (auguVar.d != vkwVar2.f) {
                            auho auhoVarB2 = uqlVar.b(size);
                            jrrVar.copyOnWrite();
                            augy augyVar11 = (augy) jrrVar.instance;
                            auhoVarB2.getClass();
                            augyVar11.l = auhoVarB2;
                            augyVar11.b |= SemanticState.Focused;
                        }
                    }
                    jrr jrrVar2 = jrrVar;
                    ListenableFuture listenableFutureA = ((vlc) uqlVar.c.io()).a(vkwVar2.d);
                    ListenableFuture listenableFutureF = ape.f(new dzx(obj, bitmap, 3, null));
                    int i5 = i;
                    ListenableFuture[] listenableFutureArr = new ListenableFuture[i5];
                    listenableFutureArr[0] = listenableFutureA;
                    listenableFutureArr[1] = listenableFutureF;
                    ahud ahudVarAv = ahno.av(listenableFutureArr);
                    uqj uqjVar = new uqj(uqlVar, listenableFutureA, vkwVar2, listenableFutureF, bitmap, activity2, jrrVar2, yhiVar2);
                    Executor executor = uqlVar.h;
                    i2 = 0;
                    taf.i(ahudVarAv.m(uqjVar, executor), executor, new tsq(i5), new uqk(i2), null);
                }
                this.q.setVisibility(4);
                if (this.D) {
                    vkw vkwVar3 = this.G;
                    if (vkwVar3 == null) {
                        i3 = i2;
                    } else {
                        int i6 = vkwVar3.k;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        }
                        i3 = i7;
                    }
                    qrx qrxVar = this.V;
                    final int currentTextColor = this.q.getCurrentTextColor();
                    final int color2 = ((ColorDrawable) this.q.getBackground()).getColor();
                    final int textAlignment = this.q.getTextAlignment();
                    final int number = this.H.getNumber();
                    taf.j(qrxVar.a(new agek() { // from class: vke
                        @Override // defpackage.agek
                        public final Object apply(Object obj3) {
                            aihf builder = ((vlg) obj3).toBuilder();
                            builder.copyOnWrite();
                            ((vlg) builder.instance).e = currentTextColor;
                            builder.copyOnWrite();
                            ((vlg) builder.instance).f = color2;
                            builder.copyOnWrite();
                            ((vlg) builder.instance).g = textAlignment;
                            builder.copyOnWrite();
                            ((vlg) builder.instance).h = number;
                            builder.copyOnWrite();
                            ((vlg) builder.instance).i = i3;
                            return (vlg) builder.build();
                        }
                    }, MoreExecutors.directExecutor()), new tsq(7));
                }
                this.G = null;
            } else {
                if (uxiVar != null) {
                    if (p()) {
                        uxiVar.a();
                    }
                    this.N.m(uxiVar);
                }
                f();
            }
            l(4);
        }
    }

    public final void f() {
        this.q.setEnabled(false);
        vkv vkvVar = this.j;
        View view = vkvVar.e;
        view.getClass();
        vkvVar.c.getClass();
        vkvVar.f.getClass();
        view.removeOnLayoutChangeListener(vkvVar);
        vkvVar.c.removeOnLayoutChangeListener(vkvVar);
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        this.k.a();
        inputMethodManager.hideSoftInputFromWindow(this.q.getWindowToken(), 2);
        n(false);
        this.S.t();
        this.R.g(false);
    }

    public final void i(uxi uxiVar) {
        t(new vkj(this, uxiVar));
    }

    public final void j() {
        this.q.setCursorVisible(true);
        this.q.setText((CharSequence) null);
        this.q.setTextSize(2, 36.0f);
    }

    @Override // defpackage.vio
    public final void jb(uxi uxiVar) {
        i(uxiVar);
    }

    public final void k(boolean z) {
        vkw vkwVar = this.G;
        if (vkwVar != null) {
            vkwVar.c = z;
        }
    }

    public final void l(int i) {
        if (i == 5) {
            Drawable drawableS = s(arqz.nC);
            ImageView imageView = this.y;
            if (drawableS == null) {
                drawableS = this.a.getDrawable(R.drawable.quantum_ic_format_align_left_white_24);
            }
            imageView.setImageDrawable(drawableS);
            this.x.setContentDescription(this.a.getString(R.string.text_alignment_left));
            this.q.setTextAlignment(5);
            this.w.setGravity(19);
            return;
        }
        if (i == 6) {
            Drawable drawableS2 = s(arqz.nD);
            ImageView imageView2 = this.y;
            if (drawableS2 == null) {
                drawableS2 = this.a.getDrawable(R.drawable.quantum_ic_format_align_right_white_24);
            }
            imageView2.setImageDrawable(drawableS2);
            this.x.setContentDescription(this.a.getString(R.string.text_alignment_right));
            this.q.setTextAlignment(6);
            this.w.setGravity(21);
            return;
        }
        Drawable drawableS3 = s(arqz.nB);
        ImageView imageView3 = this.y;
        if (drawableS3 == null) {
            drawableS3 = this.a.getDrawable(R.drawable.quantum_ic_format_align_center_white_24);
        }
        imageView3.setImageDrawable(drawableS3);
        this.x.setContentDescription(this.a.getString(R.string.text_alignment_center));
        this.q.setTextAlignment(4);
        this.w.setGravity(17);
    }

    public final void m(boolean z) {
        uxi uxiVar;
        if (z && this.D) {
            taf.a(this.b, this.V.c(), new vdm(this, 5));
            return;
        }
        vkw vkwVar = this.G;
        if (vkwVar != null) {
            int i = vkwVar.e;
            auir auirVar = vkwVar.b;
            float f = vkwVar.f;
            String str = vkwVar.d;
            int i2 = vkwVar.g;
            int i3 = vkwVar.h;
            int i4 = vkwVar.k;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            q(i, auirVar, f, str, i2, i3, i5);
            if (!p() || (uxiVar = vkwVar.a) == null) {
                return;
            }
            Optional.of(Long.valueOf(uxiVar.a()));
        }
    }

    final void n(boolean z) {
        ugc ugcVar = this.C;
        if (!z) {
            this.C = null;
        }
        this.m.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(250L).setListener(new vkg(this, z, ugcVar));
    }

    public final void o() {
        vkr vkrVar = this.l;
        if (vkrVar != null) {
            Optional optionalB = vkrVar.b(this.H);
            if (optionalB.isEmpty()) {
                return;
            }
            RoundedCornersEditText roundedCornersEditText = this.q;
            Optional optionalOfNullable = ((vkq) optionalB.get()).g;
            sla slaVar = new sla(this, 20);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Integer.valueOf((int) (((vkl) slaVar.a).q.getTextSize() * ((Float) optionalOfNullable.get()).floatValue())));
            }
            int iIntValue = ((Integer) optionalOfNullable.orElse(0)).intValue();
            if (roundedCornersEditText.a) {
                uia uiaVar = roundedCornersEditText.d;
                if (iIntValue != uiaVar.d) {
                    uiaVar.b.setPathEffect(new CornerPathEffect(iIntValue));
                    uiaVar.d = iIntValue;
                }
                roundedCornersEditText.invalidate();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vkr vkrVar;
        vkq vkqVarA;
        Object objC;
        int i = 2;
        ajwo ajwoVar = null;
        if (view == this.u) {
            if (this.J) {
                int i2 = this.L;
                if (i2 != 0) {
                    ajwoVar = ajwo.a;
                    xgn xgnVar = this.I;
                    if (xgnVar != null && xgnVar.a() != null) {
                        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                        String str = this.I.a().a;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                        str.getClass();
                        aoarVar.b |= 1;
                        aoarVar.c = str;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                        aoarVar2.b |= 2;
                        aoarVar2.d = i2;
                        aoar aoarVar3 = (aoar) aihfVarCreateBuilder.build();
                        aihh aihhVar = (aihh) ajwoVar.toBuilder();
                        aihhVar.e(aoaq.b, aoarVar3);
                        aihhVar.copyOnWrite();
                        ajwo ajwoVar2 = (ajwo) aihhVar.instance;
                        ajwoVar2.b &= -2;
                        ajwoVar2.c = ajwoVar.c;
                        ajwoVar = (ajwo) aihhVar.build();
                    }
                }
                this.K = ajwoVar;
            } else {
                this.S.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(37172)), null);
            }
            t(new vki(this));
            return;
        }
        if (view == this.m || view == this.v) {
            e();
            return;
        }
        if (view == this.s) {
            k(false);
            vkt vktVar = this.c;
            auzc auzcVar = vktVar.i;
            int i3 = auzcVar.a;
            if (i3 == 0) {
                auzcVar.a = 1;
            } else if (i3 == 1) {
                auzcVar.a = i;
            } else if (i3 != 2) {
                auzcVar.a = 0;
            } else {
                i = 3;
                auzcVar.a = i;
            }
            vktVar.a(vktVar.g);
            w(auzcVar);
            return;
        }
        if (view == this.x) {
            k(false);
            Editable text = this.q.getText();
            if (this.q.getTextAlignment() == 4) {
                l(5);
            } else if (this.q.getTextAlignment() == 5) {
                l(6);
            } else {
                l(4);
            }
            this.q.setText(text);
            this.q.setSelection(c());
            return;
        }
        if (view != this.z) {
            if (view == null) {
                vkw vkwVar = this.G;
                this.S.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(204577)), null);
                if (vkwVar == null || !p()) {
                    return;
                }
                String str2 = vkwVar.d;
                Editable text2 = this.q.getText();
                if (text2 != null) {
                    String string = text2.toString();
                    if (!yno.D(string)) {
                        str2 = string;
                    }
                }
                String str3 = vkwVar.i;
                int i4 = uwh.a;
                agkz agkzVar = uwi.a;
                str3.getClass();
                if (uwi.a.contains(str3)) {
                    Map map = ((ujd) this.g.io()).b;
                    vkwVar.c(str2);
                    throw null;
                }
                return;
            }
            return;
        }
        k(false);
        vkw vkwVar2 = this.G;
        if (vkwVar2 != null && (vkrVar = this.l) != null) {
            auir auirVar = this.H;
            agke agkeVar = vkrVar.b;
            int iIndexOf = agkeVar.indexOf(auirVar);
            if (iIndexOf != -1) {
                int i5 = ((agpi) agkeVar).d;
                int i6 = (iIndexOf + 1) % i5;
                while (true) {
                    if (i6 != iIndexOf) {
                        vkq vkqVarF = vkrVar.f.F((auir) agkeVar.get(i6));
                        if (vkqVarF != null && vkqVarF.a().isPresent()) {
                            vkqVarA = vkqVarF;
                            break;
                        }
                        i6 = (i6 + 1) % i5;
                    } else {
                        vkqVarA = vkrVar.a();
                        break;
                    }
                }
            } else {
                vkqVarA = vkrVar.a();
            }
            RoundedCornersEditText roundedCornersEditText = this.q;
            Optional optionalA = vkqVarA.a();
            hly hlyVar = new hly(this, 13);
            if (true != optionalA.isPresent()) {
                Object obj = hlyVar.a;
                auir auirVar2 = vkn.a;
                objC = ackm.YOUTUBE_SANS_BOLD.c(((vkl) obj).a, 1);
            } else {
                objC = optionalA.get();
            }
            roundedCornersEditText.setTypeface((Typeface) objC);
            TextView textView = this.z;
            int i7 = vkqVarA.f;
            textView.setText(i7);
            u(i7);
            auir auirVar3 = vkqVarA.e;
            vkwVar2.e(auirVar3, vkqVarA.p);
            this.H = auirVar3;
            o();
            this.q.h(vkn.a(auirVar3));
            if (this.W.D()) {
                this.q.f(((Float) vkqVarA.i.orElse(Float.valueOf(0.0625f))).floatValue(), (Paint.Join) vkqVarA.j.orElse(vkq.a), ((Float) vkqVarA.k.orElse(Float.valueOf(2.0f))).floatValue());
                this.q.g(vkqVarA.l);
            }
        }
        this.S.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(41711)), null);
    }

    public final boolean p() {
        vkw vkwVar = this.G;
        if (vkwVar == null || vkwVar.l != 3) {
            return this.F;
        }
        return false;
    }

    public final void q(int i, auir auirVar, float f, String str, int i2, int i3, int i4) {
        vkr vkrVar;
        this.q.setEnabled(true);
        xgn xgnVar = this.S;
        xgnVar.b(xhb.a(37169), this.K, null);
        xgnVar.d(new xgj(xhb.b(173028)));
        if (p()) {
            xgnVar.d(new xgj(xhb.b(204577)));
        }
        vkw vkwVar = this.G;
        if (vkwVar != null && (vkrVar = this.l) != null) {
            if (!(vkrVar.e ? agkz.n(vkrVar.b) : agkz.n(vkrVar.f.G())).contains(auirVar)) {
                auirVar = vkrVar.a().e;
            }
            this.q.h(vkn.a(auirVar));
            l(i);
            Optional optionalB = vkrVar.b(auirVar);
            vkq vkqVarA = optionalB.isEmpty() ? vkrVar.a() : (vkq) optionalB.get();
            if (vkqVarA.a().isEmpty()) {
                vkqVarA = vkrVar.a();
            }
            Optional optionalA = vkqVarA.a();
            Object objC = true != optionalA.isPresent() ? ackm.YOUTUBE_SANS_BOLD.c(((vkl) new hly(this, 13).a).a, 1) : optionalA.get();
            auir auirVar2 = vkqVarA.e;
            this.H = auirVar2;
            this.q.setTypeface((Typeface) objC);
            if (this.W.D()) {
                this.q.f(((Float) vkqVarA.i.orElse(Float.valueOf(0.0625f))).floatValue(), (Paint.Join) vkqVarA.j.orElse(vkq.a), ((Float) vkqVarA.k.orElse(Float.valueOf(2.0f))).floatValue());
                this.q.g(vkqVarA.l);
            }
            TextView textView = this.z;
            int i5 = vkqVarA.f;
            textView.setText(i5);
            u(i5);
            vkwVar.e(auirVar2, vkqVarA.p);
            if (f == 0.0f) {
                f = 36.0f;
            }
            this.A.setProgress((int) ((-12.0f) + f));
            vkwVar.d(i4);
            int i6 = 0;
            this.q.postDelayed(new vkd(this, f, str, i6), 300L);
            vkt vktVar = this.c;
            auzc auzcVar = vktVar.i;
            if (i3 == 0) {
                auzcVar.a = 0;
            } else if (Color.alpha(i3) == 255) {
                auzcVar.a = i4 == 2 ? 3 : 1;
                i2 = i3;
            } else {
                auzcVar.a = 2;
                i2 = i3 == -2134061876 ? ((Activity) auzcVar.b).getResources().getColor(R.color.text_color_white, null) : Color.argb(255, Color.red(i3), Color.green(i3), Color.blue(i3));
            }
            if (i2 == 0) {
                i2 = vktVar.a.getResources().getColor(R.color.text_color_white, null);
            } else {
                i6 = i2;
            }
            vis visVar = (vis) ((RecyclerView) vktVar.d).m;
            if (visVar != null && (i6 == 0 || vktVar.h.isEmpty() || ((Integer) vktVar.h.get()).intValue() != i2)) {
                visVar.z(new vjo(Integer.valueOf(i2), 1));
            }
            vktVar.h = Optional.of(Integer.valueOf(i6));
            w(auzcVar);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        this.k.b();
        this.q.getViewTreeObserver().addOnGlobalLayoutListener(new vkf(this, getClass().getSimpleName(), inputMethodManager));
        n(true);
        this.R.g(true);
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
    }
}
