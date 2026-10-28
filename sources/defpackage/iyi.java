package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iyi extends bak {
    final /* synthetic */ iyk a;

    public iyi(iyk iykVar) {
        this.a = iykVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        iyk iykVar = this.a;
        iykVar.e();
        int i = twb.a;
        iykVar.d.sendAccessibilityEvent(32);
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = this.a.d;
        if (musicMealbar$MealbarLayout.a.getVisibility() == 0) {
            TextView textView = musicMealbar$MealbarLayout.a;
            int i = bac.a;
            textView.setAlpha(1.0f);
            ci ciVarX = bac.x(musicMealbar$MealbarLayout.a);
            ciVarX.q(0.0f);
            ciVarX.r(180L);
            ciVarX.u(0L);
            ciVarX.p();
        }
        TextView textView2 = musicMealbar$MealbarLayout.b;
        int i2 = bac.a;
        textView2.setAlpha(1.0f);
        ci ciVarX2 = bac.x(musicMealbar$MealbarLayout.b);
        ciVarX2.q(0.0f);
        ciVarX2.r(180L);
        ciVarX2.u(0L);
        ciVarX2.p();
        if (musicMealbar$MealbarLayout.c.getVisibility() == 0) {
            musicMealbar$MealbarLayout.c.setAlpha(1.0f);
            ci ciVarX3 = bac.x(musicMealbar$MealbarLayout.c);
            ciVarX3.q(0.0f);
            ciVarX3.r(180L);
            ciVarX3.u(0L);
            ciVarX3.p();
        }
        if (musicMealbar$MealbarLayout.d.getVisibility() == 0) {
            musicMealbar$MealbarLayout.d.setAlpha(1.0f);
            ci ciVarX4 = bac.x(musicMealbar$MealbarLayout.d);
            ciVarX4.q(0.0f);
            ciVarX4.r(180L);
            ciVarX4.u(0L);
            ciVarX4.p();
        }
    }
}
