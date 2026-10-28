package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerVideoView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ulz extends ufx {
    final /* synthetic */ uma b;
    private final View c;
    private final ulj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulz(uma umaVar, View view, ulj uljVar, ukd ukdVar) {
        super(umaVar.e, ukdVar);
        this.b = umaVar;
        this.c = view;
        this.d = uljVar;
    }

    @Override // defpackage.ufx, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        uma umaVar = this.b;
        uwf uwfVar = umaVar.h;
        aefs aefsVar = uwfVar.e;
        if (aefsVar == null || !aefsVar.h()) {
            umf umfVar = umaVar.i;
            View view2 = this.c;
            boolean z = !this.d.k().B();
            Optional optionalOfNullable = umfVar.f.f;
            umb umbVar = new umb(view, motionEvent, view2, z);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((uql) optionalOfNullable.get()).i(umbVar.a, umbVar.b, umbVar.c, umbVar.d)));
            }
            if (!((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue() && !view.onTouchEvent(motionEvent)) {
                ShortsPlayerView shortsPlayerView = umaVar.a;
                if (!shortsPlayerView.f()) {
                    super.onTouch(view, motionEvent);
                    return true;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    shortsPlayerView.k = motionEvent.getRawX();
                    shortsPlayerView.l = motionEvent.getRawY();
                } else if (action == 2) {
                    float rawX = motionEvent.getRawX() - shortsPlayerView.k;
                    float rawY = motionEvent.getRawY() - shortsPlayerView.l;
                    if (shortsPlayerView.f()) {
                        ulx ulxVar = shortsPlayerView.h;
                        float f = ulxVar != null ? ulxVar.b : 1.0f;
                        if (shortsPlayerView.i > f && Math.abs(rawX) > 0.0f) {
                            int width = shortsPlayerView.getWidth();
                            ShortsPlayerVideoView shortsPlayerVideoView = shortsPlayerView.b;
                            shortsPlayerView.b(afxw.H(shortsPlayerVideoView.getTranslationX() + rawX, width - shortsPlayerVideoView.getWidth(), 0.0f));
                        } else if (shortsPlayerView.i < f && Math.abs(rawY) > 0.0f) {
                            int height = shortsPlayerView.getHeight();
                            ShortsPlayerVideoView shortsPlayerVideoView2 = shortsPlayerView.b;
                            shortsPlayerView.c(afxw.H(shortsPlayerVideoView2.getTranslationY() + rawY, height - shortsPlayerVideoView2.getHeight(), 0.0f));
                        }
                    }
                    shortsPlayerView.k = motionEvent.getRawX();
                    shortsPlayerView.l = motionEvent.getRawY();
                }
            }
        } else if (motionEvent.getAction() == 1) {
            uwfVar.a();
            return true;
        }
        return true;
    }
}
