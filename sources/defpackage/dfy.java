package defpackage;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.mediarouter.app.OverlayListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.youtube.creation.common.ui.CreationFeatureDescriptionView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dfy implements Animation.AnimationListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public dfy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = 8;
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                ((dge) this.a).n(true);
                break;
            case 2:
                ((SwipeRefreshLayout) this.a).n(null);
                break;
            case 3:
                ((gpl) this.a).f.post(new gnc(this, 12));
                break;
            case 4:
                jdm jdmVar = (jdm) this.a;
                if (!jdmVar.g) {
                    jdmVar.b.b(jdmVar.j);
                }
                jdmVar.a.setHasTransientState(false);
                break;
            case 5:
                jlr jlrVar = (jlr) this.a;
                ImageView imageView = jlrVar.a;
                if (imageView != null) {
                    imageView.setAlpha(0.0f);
                }
                jlrVar.m();
                break;
            case 6:
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
                if (!watchWhileLayout.bM) {
                    watchWhileLayout.at.setVisibility(8);
                    watchWhileLayout.G();
                    hhb hhbVar = watchWhileLayout.bZ;
                    if (hhbVar != null) {
                        hhbVar.o();
                    }
                }
                watchWhileLayout.bN = false;
                watchWhileLayout.bM = false;
                break;
            case 7:
                tsx tsxVar = (tsx) this.a;
                tsxVar.c();
                ImageView imageView2 = tsxVar.a;
                if (imageView2.hasOverlappingRendering()) {
                    imageView2.setLayerType(0, null);
                }
                break;
            case 8:
                CreationFeatureDescriptionView creationFeatureDescriptionView = (CreationFeatureDescriptionView) this.a;
                creationFeatureDescriptionView.e = false;
                creationFeatureDescriptionView.setVisibility(4);
                break;
            default:
                TextView textView = ((vpt) this.a).f;
                if (textView != null) {
                    textView.post(new vlj(this, i));
                    break;
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.$cid;
        if (i == 0) {
            dge dgeVar = (dge) this.a;
            OverlayListView overlayListView = dgeVar.n;
            for (dgi dgiVar : overlayListView.a) {
                if (!dgiVar.k) {
                    dgiVar.j = overlayListView.getDrawingTime();
                    dgiVar.k = true;
                }
            }
            dgeVar.n.postDelayed(dgeVar.U, dgeVar.P);
            return;
        }
        if (i == 8) {
            CreationFeatureDescriptionView creationFeatureDescriptionView = (CreationFeatureDescriptionView) this.a;
            creationFeatureDescriptionView.e = true;
            creationFeatureDescriptionView.setAlpha(1.0f);
            creationFeatureDescriptionView.setVisibility(0);
            return;
        }
        if (i == 4) {
            jdm jdmVar = (jdm) this.a;
            if (jdmVar.g) {
                jdmVar.b.b(Alert.DURATION_SHOW_INDEFINITELY);
                return;
            }
            return;
        }
        if (i == 5) {
            ImageView imageView = ((jlr) this.a).a;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
                return;
            }
            return;
        }
        if (i == 6) {
            WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
            watchWhileLayout.bN = true;
            watchWhileLayout.bM = false;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
