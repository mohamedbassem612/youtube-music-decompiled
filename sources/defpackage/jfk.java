package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import j$.util.Optional;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfk {
    final /* synthetic */ SwipeLayout a;
    final /* synthetic */ float b;
    final /* synthetic */ Optional c;
    final /* synthetic */ Consumer d;
    final /* synthetic */ jfg e;
    final /* synthetic */ anxy f;
    final /* synthetic */ boolean g;
    final /* synthetic */ jlh h;
    final /* synthetic */ Context i;
    final /* synthetic */ Object j;

    public jfk(SwipeLayout swipeLayout, float f, Optional optional, Consumer consumer, jfg jfgVar, anxy anxyVar, boolean z, jlh jlhVar, Context context, Object obj) {
        this.a = swipeLayout;
        this.b = f;
        this.c = optional;
        this.d = consumer;
        this.e = jfgVar;
        this.f = anxyVar;
        this.g = z;
        this.h = jlhVar;
        this.i = context;
        this.j = obj;
    }

    public final void a(int i, int i2) {
        int i3;
        anxv anxvVarA;
        SwipeLayout swipeLayout = this.a;
        float width = swipeLayout.getWidth();
        if (i == 0) {
            i = 0;
            if (i2 != 0) {
                Optional optional = this.c;
                final Consumer consumer = this.d;
                optional.ifPresentOrElse(consumer, new Runnable() { // from class: jfi
                    @Override // java.lang.Runnable
                    public final void run() {
                        consumer.accept(null);
                    }
                });
                jfg jfgVar = this.e;
                jfgVar.c.setVisibility(0);
                LottieAnimationView lottieAnimationView = jfgVar.d;
                lottieAnimationView.o(0.0f, 0.5f);
                lottieAnimationView.f();
                swipeLayout.d.setBackground(swipeLayout.s);
            }
        }
        int i4 = (int) (width * this.b);
        if ((i2 >= i4 && i < i4) || (i2 <= (i3 = -i4) && i > i3)) {
            jfg jfgVar2 = this.e;
            LottieAnimationView lottieAnimationView2 = jfgVar2.d;
            lottieAnimationView2.o(0.5f, 1.0f);
            lottieAnimationView2.f();
            Consumer consumer2 = this.d;
            anxy anxyVar = this.f;
            if (jfgVar2.g(anxyVar)) {
                anxw anxwVar = anxyVar.d;
                if (anxwVar == null) {
                    anxwVar = anxw.a;
                }
                anxvVarA = anxv.a(anxwVar.d);
                if (anxvVarA == null) {
                    anxvVarA = anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNKNOWN;
                }
            } else {
                anxw anxwVar2 = anxyVar.c;
                if (anxwVar2 == null) {
                    anxwVar2 = anxw.a;
                }
                anxvVarA = anxv.a(anxwVar2.d);
                if (anxvVarA == null) {
                    anxvVarA = anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNKNOWN;
                }
            }
            agkj agkjVar = jfg.a;
            consumer2.accept(agkjVar.containsKey(anxvVarA) ? new ColorDrawable(jfgVar2.b.getColor(((Integer) agkjVar.get(anxvVarA)).intValue())) : new ColorDrawable(jfgVar2.b.getColor(R.color.music_full_transparent)));
            if (this.g) {
                this.h.b();
            }
        } else if ((i2 < i4 && i >= i4) || (i2 > i3 && i <= i3)) {
            Optional optional2 = this.c;
            final Consumer consumer3 = this.d;
            optional2.ifPresentOrElse(consumer3, new Runnable() { // from class: jfj
                @Override // java.lang.Runnable
                public final void run() {
                    consumer3.accept(null);
                }
            });
            if (this.g) {
                this.h.c();
            }
        }
        float fAbs = Math.abs(i2);
        Context context = this.i;
        float fH = afxw.H(fAbs / context.getResources().getDimensionPixelSize(R.dimen.icon_full_visible_threshold), 0.0f, 1.0f);
        float fL = ahng.L(i2, -i4, i4) * 0.15f;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            if (fL < 0.0f) {
                ixt.h(swipeLayout.g, fL, fH);
                return;
            } else {
                ixt.h(swipeLayout.j, fL, fH);
                return;
            }
        }
        if (fL > 0.0f) {
            ixt.h(swipeLayout.g, fL, fH);
        } else {
            ixt.h(swipeLayout.j, fL, fH);
        }
    }

    public final void b(float f) {
        if (f >= this.b) {
            this.e.d(this.f, this.j);
        }
        this.e.c.setVisibility(8);
        this.a.j();
    }
}
