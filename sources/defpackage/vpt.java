package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vpt extends qa {
    protected final Context a;
    protected boolean b;
    protected RecyclerView c;
    protected FrameLayout d;
    protected FrameLayout e;
    public TextView f;
    protected Animation g;
    protected Animation h;
    protected boolean i;
    protected agev j;
    protected final xgn k;
    protected agev l;
    protected boolean m;
    public int n;
    public boolean o;

    public vpt(Context context, xgn xgnVar) {
        super((byte[]) null);
        this.a = context;
        this.k = xgnVar;
        agdf agdfVar = agdf.a;
        this.j = agdfVar;
        this.l = agdfVar;
    }

    public void m(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.e = frameLayout;
        this.c = recyclerView;
    }

    protected abstract void o();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(boolean z) {
        FrameLayout frameLayout;
        if (this.m != z) {
            this.m = z;
            FrameLayout frameLayout2 = this.d;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(true != z ? 8 : 0);
                if (z) {
                    if (this.d.getParent() == null && (frameLayout = this.e) != null) {
                        frameLayout.addView(this.d);
                    }
                    if (this.l.g()) {
                        this.k.w(this.l.c(), null);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout3 = this.e;
                if (frameLayout3 != null) {
                    frameLayout3.removeView(this.d);
                    if (this.l.g()) {
                        this.k.p(this.l.c(), null);
                    }
                }
            }
        }
    }

    protected final void q(String str) {
        TextView textView = this.f;
        if (textView != null && TextUtils.equals(textView.getText(), str) && this.m) {
            return;
        }
        o();
        if (this.h == null) {
            Context context = this.a;
            this.h = AnimationUtils.loadAnimation(context, R.anim.new_comments_fade_in);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.new_comments_fade_out);
            this.g = animationLoadAnimation;
            animationLoadAnimation.setAnimationListener(new dfy(this, 9));
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText((CharSequence) this.j.e(str));
        }
        p(true);
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        Animation animation = this.g;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.h;
        if (animation2 != null) {
            animation2.cancel();
            TextView textView3 = this.f;
            if (textView3 != null) {
                textView3.startAnimation(this.h);
            }
        }
    }

    public final void r() {
        RecyclerView recyclerView;
        if (this.i || (recyclerView = this.c) == null) {
            return;
        }
        this.i = true;
        recyclerView.aC(this);
    }

    protected final void s() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            tym.h(frameLayout, new tyi(this.n, 1), ViewGroup.MarginLayoutParams.class);
        }
    }
}
