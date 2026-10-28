package defpackage;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyr implements adme {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ axlj b;

    public wyr(axlj axljVar, xgv xgvVar, int i) {
        this.$cid = i;
        this.b = axljVar;
        this.a = xgvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xgn] */
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
    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        if (this.$cid != 0) {
            ViewGroup viewGroup2 = (ViewGroup) tuk.e(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker);
            return this.b.p(((srd) this.a).b(), viewGroup2);
        }
        ViewGroup viewGroup3 = (ViewGroup) tuk.e(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker);
        ColorStateList colorStateListK = tzk.k(viewGroup.getContext(), R.attr.ytTextPrimary);
        ImageView imageView = (ImageView) viewGroup3.findViewById(R.id.keyboard_button);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.yt_outline_keyboard_grey600_24);
            imageView.setImageTintList(colorStateListK);
            imageView.setClickable(true);
            imageView.setFocusable(true);
        }
        ImageView imageView2 = (ImageView) viewGroup3.findViewById(R.id.backspace_button);
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.yt_outline_backspace_grey600_24);
            imageView2.setImageTintList(colorStateListK);
            imageView2.setClickable(true);
            imageView2.setFocusable(true);
        }
        return this.b.p(this.a, viewGroup3);
    }

    public wyr(srd srdVar, axlj axljVar, int i) {
        this.$cid = i;
        this.b = axljVar;
        this.a = srdVar;
    }
}
