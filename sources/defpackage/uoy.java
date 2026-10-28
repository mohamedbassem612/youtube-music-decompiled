package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.lang.Iterable$EL;
import j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoy implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ View a;
    final /* synthetic */ Object b;

    public /* synthetic */ uoy(View view, adze adzeVar, int i) {
        this.$cid = i;
        this.a = view;
        this.b = adzeVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.$cid;
        int i2 = 2;
        int i3 = 0;
        if (i == 0) {
            ImageView imageView = (ImageView) this.a;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                RectF rectF = new RectF(drawable.getBounds());
                imageView.getImageMatrix().mapRect(rectF);
                if (imageView.getLayoutParams() != null) {
                    int i4 = (int) rectF.left;
                    int i5 = (int) rectF.bottom;
                    if (i4 == 0 && i5 == 0) {
                        return;
                    }
                    if (imageView.getMeasuredWidth() == 0 && imageView.getMeasuredHeight() == 0) {
                        return;
                    }
                    upg upgVar = (upg) this.b;
                    uoq uoqVar = upgVar.a;
                    View view = uoqVar.getView();
                    View viewFindViewById = view != null ? view.findViewById(R.id.ai_image_edit_image_container) : null;
                    int iRound = Math.round(rectF.width());
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iRound;
                            layoutParams.height = Math.round(rectF.height());
                            viewFindViewById.setLayoutParams(layoutParams);
                        }
                        viewFindViewById.setTranslationX(rectF.left);
                        viewFindViewById.setTranslationY(rectF.top);
                    }
                    Iterable$EL.forEach((upgVar.b.b & SemanticState.Focused) != 0 ? agpi.a : agke.q(uoqVar.requireView().requireViewById(R.id.ai_image_edit_bottom_controller_container)), new ulc(iRound, i2));
                    Iterable$EL.forEach((agke) Stream.CC.of((Object[]) new Integer[]{Integer.valueOf(R.id.ai_image_edit_quality_disclaimer), Integer.valueOf(R.id.ai_image_edit_bottom_controller_container)}).map(new uot(uoqVar.requireView(), i3)).collect(aghu.a), new ulc(i5 - imageView.getMeasuredHeight(), 3));
                    if (upgVar.k != null) {
                        imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ScrollView scrollView = (ScrollView) this.b;
            this.a.setVisibility(true != (scrollView.getChildCount() > 0 && scrollView.getChildAt(0).getHeight() > scrollView.getHeight()) ? 8 : 0);
            return;
        }
        if (i == 2) {
            View viewFindViewById2 = this.a.getRootView().findViewById(R.id.action_bar_container);
            if (viewFindViewById2 == null) {
                Log.e("UseTvCodeController", "action bar container not found");
                return;
            }
            xqi xqiVar = (xqi) this.b;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xqiVar.g.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = viewFindViewById2.getHeight();
                xqiVar.g.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        adze adzeVar = (adze) this.b;
        int[] iArr = adzeVar.i;
        View view2 = this.a;
        view2.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (i6 == adzeVar.j && i7 == adzeVar.k && width == adzeVar.l && height == adzeVar.m) {
            return;
        }
        adzeVar.j = i6;
        adzeVar.k = i7;
        adzeVar.l = width;
        adzeVar.m = height;
        adzf adzfVar = adzeVar.d;
        if (adzfVar != null) {
            adzfVar.d();
        }
        adzf adzfVar2 = adzeVar.d;
        if (adzfVar2 != null) {
            adzfVar2.requestLayout();
        }
    }

    public uoy(ScrollView scrollView, View view, int i) {
        this.$cid = i;
        this.b = scrollView;
        this.a = view;
    }

    public uoy(upg upgVar, ImageView imageView, int i) {
        this.$cid = i;
        this.a = imageView;
        this.b = upgVar;
    }

    public /* synthetic */ uoy(xqi xqiVar, View view, int i) {
        this.$cid = i;
        this.b = xqiVar;
        this.a = view;
    }
}
