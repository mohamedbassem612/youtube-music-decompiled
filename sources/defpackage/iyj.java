package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iyj extends SwipeDismissBehavior {
    final /* synthetic */ iyk b;

    public iyj(iyk iykVar) {
        this.b = iykVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ast
    public final /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = (MusicMealbar$MealbarLayout) view;
        if (coordinatorLayout.l(musicMealbar$MealbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                jit.a().e(this.b.f);
            } else if (actionMasked == 1 || actionMasked == 3) {
                jit.a().f(this.b.f);
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, musicMealbar$MealbarLayout, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean q(View view) {
        return view instanceof MusicMealbar$MealbarLayout;
    }
}
