package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipLoadingIndicator;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ixe implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ixe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.animation.ValueAnimator$AnimatorUpdateListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.Object, jum] */
    /* JADX WARN: Type inference failed for: r15v44, types: [java.lang.Object, jum] */
    @Override // java.lang.Runnable
    public final void run() {
        int iAV;
        int iAV2;
        Drawable.ConstantState constantState;
        Surface surface;
        switch (this.$cid) {
            case 0:
                ?? r15 = this.a;
                ChipCloudChipLoadingIndicator chipCloudChipLoadingIndicator = (ChipCloudChipLoadingIndicator) r15;
                Path path = chipCloudChipLoadingIndicator.c;
                path.reset();
                float dimensionPixelSize = chipCloudChipLoadingIndicator.getContext().getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_corner_radius);
                path.addRoundRect(chipCloudChipLoadingIndicator.getLeft() + 2.0f, chipCloudChipLoadingIndicator.getTop() + 2.0f, chipCloudChipLoadingIndicator.getRight() - 2.0f, chipCloudChipLoadingIndicator.getBottom() - 2.0f, dimensionPixelSize, dimensionPixelSize, Path.Direction.CW);
                chipCloudChipLoadingIndicator.f = new PathMeasure(path, true);
                if (chipCloudChipLoadingIndicator.e == null) {
                    chipCloudChipLoadingIndicator.e = ValueAnimator.ofFloat(0.0f, 1.0f);
                    chipCloudChipLoadingIndicator.e.setDuration(1000L).setInterpolator(chipCloudChipLoadingIndicator.d);
                    chipCloudChipLoadingIndicator.e.setRepeatCount(-1);
                    chipCloudChipLoadingIndicator.e.addUpdateListener(r15);
                    chipCloudChipLoadingIndicator.e.start();
                }
                break;
            case 1:
                ((ivc) this.a).d.c(new hag());
                break;
            case 2:
                ((jah) this.a).d();
                break;
            case 3:
                jbo jboVar = (jbo) this.a;
                ixi ixiVar = jboVar.b;
                if (ixiVar != null) {
                    int i = jboVar.e.i;
                    int iAV3 = a.aV(i);
                    if ((iAV3 != 0 && iAV3 == 2) || (((iAV = a.aV(i)) != 0 && iAV == 4) || (iAV2 = a.aV(i)) == 0 || iAV2 == 1)) {
                        Iterator it = ixiVar.c.iterator();
                        while (it.hasNext()) {
                            if (gzj.I((ajsy) it.next())) {
                                if (jboVar.e.k) {
                                }
                                jboVar.b.i(jboVar.e);
                            }
                        }
                        jboVar.b.i(jboVar.e);
                    }
                    int iAV4 = a.aV(jboVar.e.i);
                    if (iAV4 != 0 && iAV4 == 4) {
                        ixi ixiVar2 = jboVar.b;
                        ixiVar2.h((List) Collection.EL.stream(ixiVar2.c).filter(new iui(6)).collect(aghu.a));
                        break;
                    }
                }
                break;
            case 4:
                Object obj = this.a;
                ((jbw) obj).b.postDelayed(new ixe(obj, 5), 750L);
                break;
            case 5:
                jbw jbwVar = (jbw) this.a;
                ixi ixiVar3 = jbwVar.c;
                if (ixiVar3 != null && !Collection.EL.stream(ixiVar3.b()).anyMatch(new iui(9))) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder builderPlay = animatorSet.play(ValueAnimator.ofInt(0));
                    int i2 = 0;
                    while (true) {
                        RecyclerView recyclerView = jbwVar.b;
                        if (i2 >= recyclerView.getChildCount()) {
                            animatorSet.start();
                        } else {
                            View childAt = recyclerView.getChildAt(i2);
                            if (childAt != null) {
                                Drawable background = childAt.getBackground();
                                if ((background instanceof GradientDrawable) && (constantState = background.getConstantState()) != null) {
                                    GradientDrawable gradientDrawable = (GradientDrawable) constantState.newDrawable().mutate();
                                    childAt.setBackground(gradientDrawable);
                                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                                    Context context = jbwVar.a;
                                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, Integer.valueOf(context.getColor(R.color.yt_white1_opacity10)), Integer.valueOf(context.getColor(R.color.yt_white1_opacity30)));
                                    valueAnimatorOfObject.addUpdateListener(new pr(gradientDrawable, 10, null));
                                    valueAnimatorOfObject.setDuration(200L);
                                    ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(context.getColor(R.color.yt_white1_opacity30)), Integer.valueOf(context.getColor(R.color.yt_white1_opacity10)));
                                    valueAnimatorOfObject2.setDuration(600L);
                                    valueAnimatorOfObject2.addUpdateListener(new pr(gradientDrawable, 11, null));
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
                                    animatorSet2.setStartDelay(((long) i2) * 100);
                                    builderPlay.with(animatorSet2);
                                }
                            }
                            i2++;
                        }
                        break;
                    }
                }
                break;
            case 6:
                ((jkh) this.a).b.f();
                break;
            case 7:
                ((jmg) this.a).u();
                break;
            case 8:
                ((WatchFragment) this.a).W.setTranslationY(0.0f);
                break;
            case 9:
                ((WatchFragment) this.a).e();
                break;
            case 10:
                MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) this.a;
                musicPlaybackControls.i.j();
                musicPlaybackControls.h.v(musicPlaybackControls.i);
                break;
            case 11:
                jol jolVar = (jol) this.a;
                RecyclerView recyclerView2 = jolVar.q;
                int iE = jolVar.e();
                np npVar = recyclerView2.n;
                if (npVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                    if (iE >= 0) {
                        recyclerView2.an();
                        linearLayoutManager.scrollToPositionWithOffset(iE, 0);
                        jolVar.A = false;
                    }
                }
                break;
            case 12:
                jon jonVar = (jon) this.a;
                jonVar.q = hna.h(jonVar.e, jonVar.l, jonVar.m, null);
                break;
            case 13:
                joz jozVar = (joz) this.a;
                jozVar.p.N();
                jozVar.s();
                break;
            case 14:
                ((joz) this.a).at = null;
                break;
            case 15:
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
                watchWhileLayout.O(watchWhileLayout.bE);
                watchWhileLayout.I(watchWhileLayout.bE, watchWhileLayout.bF);
                break;
            case 16:
                ((jth) this.a).h(true);
                break;
            case 17:
                this.a.v();
                break;
            case 18:
                ((jui) this.a).e();
                break;
            case 19:
                this.a.v();
                break;
            default:
                zlm zlmVar = ((juv) this.a).ae.M().b.l;
                if (zlmVar instanceof zkt) {
                    zlm zlmVar2 = ((zkt) zlmVar).d;
                    if (zlmVar2 instanceof zkn) {
                        zkn zknVar = (zkn) zlmVar2;
                        if (zknVar.f.eG()) {
                            TextureView textureView = zknVar.m;
                            if (textureView != null) {
                                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                                if (surfaceTexture != null) {
                                    zll zllVar = zknVar.c;
                                    if (zllVar instanceof yzo) {
                                        yzo yzoVar = (yzo) zllVar;
                                        Surface surface2 = zknVar.n;
                                        if (surface2 == null || !surface2.isValid()) {
                                            Surface surface3 = zknVar.n;
                                            if (surface3 != null) {
                                                surface3.release();
                                            }
                                            zknVar.n = new Surface(surfaceTexture);
                                        }
                                        yzoVar.j(zknVar.n, zknVar.h.get());
                                    }
                                }
                            } else {
                                zknVar.D();
                            }
                            break;
                        } else {
                            SurfaceView surfaceView = zknVar.k;
                            if (surfaceView == null) {
                                zknVar.C();
                                break;
                            } else if (zknVar.l != null && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                                zll zllVar2 = zknVar.c;
                                if (zllVar2 instanceof yzo) {
                                    ((yzo) zllVar2).j(surface, zknVar.h.get());
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
