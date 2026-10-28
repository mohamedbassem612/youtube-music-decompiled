package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class dtc extends AnimatorListenerAdapter {
    final /* synthetic */ dtf a;

    public dtc(dtf dtfVar) {
        this.a = dtfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dtf dtfVar = this.a;
        ArrayList arrayList = new ArrayList(dtfVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dta) arrayList.get(i)).b(dtfVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dtf dtfVar = this.a;
        ArrayList arrayList = new ArrayList(dtfVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dta) arrayList.get(i)).c(dtfVar);
        }
    }
}
