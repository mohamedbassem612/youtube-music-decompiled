package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vkd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vkd(uiv uivVar, CreationButtonView creationButtonView, float f, int i) {
        this.$cid = i;
        this.c = uivVar;
        this.b = creationButtonView;
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            float f = this.a;
            vkl vklVar = (vkl) this.b;
            vklVar.q.setTextSize(2, f);
            vklVar.q.setText((CharSequence) this.c);
            vklVar.q.setSelection(vklVar.c());
            vklVar.o();
            return;
        }
        if (i != 1) {
            ((ytv) this.c).y(this.a, (wiu) this.b);
            return;
        }
        uiv uivVar = (uiv) this.c;
        CreationButtonView creationButtonView = uivVar.m;
        if (creationButtonView != null) {
            creationButtonView.clearAnimation();
            ImageView imageView = uivVar.m.b;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
        float f2 = this.a;
        Object obj = this.b;
        obj.getClass();
        uivVar.m = (CreationButtonView) obj;
        int[] iArr = new int[2];
        uivVar.m.getLocationOnScreen(iArr);
        uivVar.m.setTranslationY(f2 - iArr[1]);
        uivVar.m.setAlpha(1.0f);
        uivVar.m.animate().translationY(0.0f).setInterpolator(new bnm()).setDuration(200L).start();
        boolean zJ = uivVar.v.J();
        int i2 = true != zJ ? R.drawable.ic_expandy_expand_anim : R.drawable.delhi_expandy_expand_anim;
        int i3 = true != zJ ? R.drawable.ic_expandy_collapse_anim : R.drawable.delhi_expandy_collapse_anim;
        CreationButtonView creationButtonView2 = uivVar.m;
        CreationButtonView creationButtonView3 = uivVar.f;
        if (creationButtonView2 != null) {
            if (creationButtonView2 == creationButtonView3) {
                i2 = i3;
            }
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) creationButtonView2.getResources().getDrawable(i2);
            uivVar.m.b.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
        }
    }

    public /* synthetic */ vkd(vkl vklVar, float f, String str, int i) {
        this.$cid = i;
        this.b = vklVar;
        this.a = f;
        this.c = str;
    }

    public /* synthetic */ vkd(ytv ytvVar, float f, wiu wiuVar, int i) {
        this.$cid = i;
        this.c = ytvVar;
        this.a = f;
        this.b = wiuVar;
    }
}
