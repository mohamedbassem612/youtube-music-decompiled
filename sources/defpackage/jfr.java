package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.makeramen.RoundedImageView;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfr implements adma {
    public final RoundedImageView a;
    private Context b;
    private adhv c;
    private awlo d = new awlo();
    private String e = null;
    private avmn f = null;
    private adly g;
    private abxv h;

    public jfr(Context context, adhv adhvVar, abxv abxvVar) {
        this.a = (RoundedImageView) View.inflate(context, R.layout.music_thumbnail, null);
        g(context, adhvVar, abxvVar);
    }

    private final void g(Context context, adhv adhvVar, abxv abxvVar) {
        this.b = context;
        this.c = adhvVar;
        this.h = abxvVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        adhv adhvVar = this.c;
        RoundedImageView roundedImageView = this.a;
        adhvVar.f(roundedImageView);
        roundedImageView.setForeground(null);
        String str = this.e;
        if (str != null) {
            this.h.L(str);
            this.e = null;
        }
        Object obj = this.f;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.f = null;
        }
        this.d = new awlo();
        if (roundedImageView.hasOnClickListeners()) {
            roundedImageView.setOnClickListener(null);
        }
        roundedImageView.setBackgroundDrawable(null);
        if (roundedImageView.getPaddingTop() != 0) {
            roundedImageView.setPadding(0, 0, 0, 0);
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
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
    @Override // defpackage.adma
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, anyi anyiVar) {
        aqmh aqmhVar;
        adly adlyVar2;
        Drawable drawable;
        this.g = adlyVar;
        this.d = new awlo();
        adly adlyVar3 = this.g;
        int i = 1;
        if (adlyVar3 != null) {
            RoundedImageView roundedImageView = this.a;
            Optional optionalB = adxc.b(adlyVar3);
            roundedImageView.getClass();
            jfn jfnVar = new jfn(roundedImageView, 0);
            if (true == optionalB.isPresent()) {
                ((RoundedImageView) jfnVar.a).a(((Integer) optionalB.get()).intValue());
            }
        }
        RoundedImageView roundedImageView2 = this.a;
        int iAU = a.aU(anyiVar.d);
        roundedImageView2.a = iAU != 0 && iAU == 2;
        roundedImageView2.c();
        roundedImageView2.b(false);
        roundedImageView2.invalidate();
        int iAS = a.aS(anyiVar.e);
        if (iAS == 0 || iAS != 3) {
            roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            aqmh aqmhVar2 = anyiVar.c;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            if (ixt.z(aqmhVar2)) {
                roundedImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
        if ((anyiVar.b & 1) != 0) {
            aqmhVar = anyiVar.c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
        } else {
            aqmhVar = null;
        }
        if (ixt.z(aqmhVar)) {
            jfp jfpVar = new jfp(this.d, hde.b(this.g) ? new adhl(this.b.getApplicationContext()) : null);
            adhv adhvVar = this.c;
            adhq adhqVarA = adhr.a();
            adhqVarA.h = 3;
            adhqVarA.d = new jfo(this, aqmhVar);
            adhqVarA.f = jfpVar;
            adhvVar.j(roundedImageView2, aqmhVar, adhqVarA.a());
        } else {
            e(aqmhVar);
        }
        adly adlyVar4 = this.g;
        if (adlyVar4 != null) {
            Object objC = adlyVar4.c("applyThumbnailRipple");
            if ((objC instanceof Boolean) && ((Boolean) objC).booleanValue()) {
                int iAU2 = a.aU(anyiVar.d);
                if (iAU2 == 0 || iAU2 != 2) {
                    RippleDrawable rippleDrawable = (RippleDrawable) this.b.getDrawable(R.drawable.thumbnail_ripple);
                    Optional optionalB2 = adxc.b(this.g);
                    if (optionalB2.isPresent() && rippleDrawable != null && (rippleDrawable.getDrawable(0) instanceof GradientDrawable)) {
                        ((GradientDrawable) rippleDrawable.getDrawable(0)).setCornerRadius(this.b.getResources().getDimensionPixelSize(((Integer) optionalB2.get()).intValue()));
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = this.b.getDrawable(R.drawable.circle_thumbnail_ripple);
                }
                roundedImageView2.setForeground(drawable);
            }
        }
        if ((anyiVar.b & SemanticState.Focused) != 0) {
            String str = anyiVar.h;
            this.e = str;
            this.h.J(str, roundedImageView2);
        }
        if (!ixt.z(aqmhVar) || (adlyVar2 = this.g) == null || adlyVar2.c("thumbnailSelectionController") == null || this.g.c("positionInAdapter") == null || this.g.c("selectableThumbnailConfig") == null) {
            return;
        }
        lqa lqaVar = (lqa) this.g.c("thumbnailSelectionController");
        Integer num = (Integer) this.g.c("positionInAdapter");
        jfq jfqVar = (jfq) this.g.c("selectableThumbnailConfig");
        this.f = lqaVar.L().p().i(new abwr(i)).al(new gto(this, num, jfqVar, 6, (char[]) null), new jeh(2));
        roundedImageView2.setOnClickListener(new jip(lqaVar, num, 1));
        f(num.intValue(), lqaVar.M(), jfqVar);
        bac.n(roundedImageView2, bby.a, this.b.getString(R.string.accessibility_select_thumbnail), null);
    }

    public final void e(aqmh aqmhVar) {
        if (hde.b(this.g)) {
            return;
        }
        this.a.setImageDrawable(ixt.v(this.b, aqmhVar));
    }

    public final void f(int i, Integer num, jfq jfqVar) {
        ValueAnimator valueAnimatorOfInt;
        if (num == null || i != num.intValue()) {
            RoundedImageView roundedImageView = this.a;
            roundedImageView.setBackgroundDrawable(null);
            valueAnimatorOfInt = ValueAnimator.ofInt(roundedImageView.getPaddingTop(), 0);
        } else {
            Resources resources = this.b.getResources();
            int i2 = jfqVar.b;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.selected_generated_thumbnail_border_width);
            RoundedImageView roundedImageView2 = this.a;
            Context context = this.b;
            int i3 = jfqVar.a;
            roundedImageView2.setBackgroundDrawable(context.getDrawable(R.drawable.generated_thumbnail_selected_background));
            valueAnimatorOfInt = ValueAnimator.ofInt(roundedImageView2.getPaddingTop(), dimensionPixelSize);
        }
        valueAnimatorOfInt.addUpdateListener(new pr(this, 12, null));
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.start();
    }

    public jfr(Context context, adhv adhvVar, abxv abxvVar, RoundedImageView roundedImageView) {
        this.a = roundedImageView;
        g(context, adhvVar, abxvVar);
    }
}
