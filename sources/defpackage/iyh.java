package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iyh extends bak {
    final /* synthetic */ iyk a;

    public iyh(iyk iykVar) {
        this.a = iykVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        iyk iykVar = this.a;
        ixt ixtVar = iykVar.e;
        if (ixtVar != null) {
            jcm jcmVar = (jcm) ixtVar;
            jcmVar.b.c = jcmVar.a;
        }
        qcb qcbVar = iykVar.f;
        jit jitVarA = jit.a();
        synchronized (jitVarA.a) {
            if (jitVarA.g(qcbVar)) {
                jitVarA.c(jitVarA.b);
            }
        }
        iyk iykVar2 = this.a;
        int i = twb.a;
        iykVar2.d.sendAccessibilityEvent(32);
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = this.a.d;
        if (musicMealbar$MealbarLayout.a.getVisibility() == 0) {
            TextView textView = musicMealbar$MealbarLayout.a;
            int i = bac.a;
            textView.setAlpha(0.0f);
            ci ciVarX = bac.x(musicMealbar$MealbarLayout.a);
            ciVarX.q(1.0f);
            ciVarX.r(180L);
            ciVarX.u(70L);
            ciVarX.p();
        }
        TextView textView2 = musicMealbar$MealbarLayout.b;
        int i2 = bac.a;
        textView2.setAlpha(0.0f);
        ci ciVarX2 = bac.x(musicMealbar$MealbarLayout.b);
        ciVarX2.q(1.0f);
        ciVarX2.r(180L);
        ciVarX2.u(70L);
        ciVarX2.p();
        if (musicMealbar$MealbarLayout.c.getVisibility() == 0) {
            musicMealbar$MealbarLayout.c.setAlpha(0.0f);
            ci ciVarX3 = bac.x(musicMealbar$MealbarLayout.c);
            ciVarX3.q(1.0f);
            ciVarX3.r(180L);
            ciVarX3.u(70L);
            ciVarX3.p();
        }
        if (musicMealbar$MealbarLayout.d.getVisibility() == 0) {
            musicMealbar$MealbarLayout.d.setAlpha(0.0f);
            ci ciVarX4 = bac.x(musicMealbar$MealbarLayout.d);
            ciVarX4.q(1.0f);
            ciVarX4.r(180L);
            ciVarX4.u(70L);
            ciVarX4.p();
        }
    }
}
