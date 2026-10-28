package defpackage;

import android.R;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tsy extends tym {
    protected final Context a;
    private Animation b;

    public tsy(Context context) {
        super(null);
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.tym
    public final Animation a() {
        if (this.b == null) {
            Context context = this.a;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
            this.b = animationLoadAnimation;
            animationLoadAnimation.setDuration(context.getResources().getInteger(R.integer.config_shortAnimTime));
        }
        return this.b;
    }
}
