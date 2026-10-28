package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jh implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$cid) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
                break;
            case 2:
                mmf mmfVar = ((mme) this.a).e;
                if (mmfVar.l(view)) {
                    mmfVar.h(view);
                }
                break;
            case 6:
                ((acqz) this.a).k.c();
                break;
            case 7:
                view.getClass();
                break;
            default:
                ((afef) this.a).e();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        switch (this.$cid) {
            case 0:
                ji jiVar = (ji) this.a;
                ViewTreeObserver viewTreeObserver = jiVar.d;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        jiVar.d = view.getViewTreeObserver();
                    }
                    jiVar.d.removeGlobalOnLayoutListener(jiVar.b);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ik ikVar = (ik) this.a;
                ViewTreeObserver viewTreeObserver2 = ikVar.e;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ikVar.e = view.getViewTreeObserver();
                    }
                    ikVar.e.removeGlobalOnLayoutListener(ikVar.c);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ((mme) this.a).e.e(view);
                break;
            case 3:
                ((oxe) this.a).B(view);
                break;
            case 4:
                roe roeVar = (roe) this.a;
                View view2 = roeVar.h;
                ScrollView scrollView = (ScrollView) view2.findViewById(R.id.unicorn_password_auth_scroll_view);
                if (scrollView != null && roeVar.k != null) {
                    ViewTreeObserver viewTreeObserver3 = scrollView.getViewTreeObserver();
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = roeVar.k;
                    onGlobalLayoutListener.getClass();
                    viewTreeObserver3.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    roeVar.k = null;
                }
                if (view2 != null && (onLayoutChangeListener = roeVar.n) != null) {
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    roeVar.n = null;
                    break;
                }
                break;
            case 5:
                ydn ydnVar = (ydn) this.a;
                cf activity = ydnVar.g.getActivity();
                if (!ydnVar.b && activity != null && !activity.isChangingConfigurations()) {
                    ydnVar.b = true;
                    apzk apzkVar = ydnVar.n;
                    if (apzkVar != null && (apzkVar.c & 64) != 0) {
                        vxe vxeVar = ydnVar.i;
                        ajwo ajwoVar = apzkVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                        break;
                    }
                }
                break;
            case 6:
                acqz acqzVar = (acqz) this.a;
                acqzVar.k.c();
                acqzVar.Y.b();
                break;
            case 7:
                view.getClass();
                ((adze) this.a).c();
                break;
            default:
                ((afef) this.a).i();
                break;
        }
    }
}
