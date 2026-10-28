package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mgf extends AnimatorListenerAdapter {
    final /* synthetic */ nrv a;
    final /* synthetic */ aamo b;

    public mgf(aamo aamoVar, nrv nrvVar) {
        this.a = nrvVar;
        this.b = aamoVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aamo aamoVar = this.b;
        nry nryVar = (nry) aamoVar.e.io();
        CommandOuterClass$Command defaultInstance = ((asqr) aamoVar.b).h;
        if (defaultInstance == null) {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        nryVar.a(defaultInstance, this.a).D();
    }
}
