package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dp extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public dp(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
