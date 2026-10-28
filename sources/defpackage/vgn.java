package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vgn extends bp implements vhj {
    public viz k;
    public xgm l;
    protected vhh m = new vgk();
    public int n;
    public boolean o;
    private AnimatorSet p;

    protected abstract View i();

    protected abstract View j();

    public final void k(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList;
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.p.end();
        }
        float f = true != z ? 0.0f : 1.0f;
        float f2 = z ? 0 : this.n;
        if (this.o) {
            arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(j(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(i(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(i(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ObjectAnimator.ofFloat(j(), (Property<View, Float>) View.ALPHA, f).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(i(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(i(), (Property<View, Float>) View.ALPHA, f).setDuration(300L));
            arrayList = arrayList2;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        if (!z) {
            animatorSet2.addListener(new vgm(this, 0));
        } else if (animatorListener != null) {
            animatorSet2.addListener(animatorListener);
        }
        animatorSet2.start();
        this.p = animatorSet2;
        if (z) {
            this.k.e();
        } else {
            this.l.hB().t();
            this.k.d();
        }
    }

    protected final void l(apji apjiVar, alay alayVar, View view) {
        if (apjiVar != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.sticker_catalog_close);
            imageView.setOnClickListener(new uit(this, 19));
            imageView.setVisibility(0);
        }
        if (alayVar != null) {
            ((TextView) view.findViewById(R.id.sticker_catalog_title)).setText(ackj.k(null, alayVar, null, false));
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(2, R.style.ReelTheme_StickerCatalog);
        this.m = new vhh() { // from class: vgl
            @Override // defpackage.vhh
            public final void a() {
                this.a.k(false, null);
            }
        };
    }
}
