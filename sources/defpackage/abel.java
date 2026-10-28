package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abel extends acdd implements View.OnClickListener, Animation.AnimationListener {
    public boolean a;
    public boolean b;
    public final ImageView c;
    public final View d;
    public final View e;
    protected final TextView f;
    protected final TextView g;
    public final Animation h;
    public final Animation i;
    public final Animation j;
    public final Animation k;
    public abep l;
    private final int m;
    private final int n;
    private final ImageView o;
    private final View p;
    private final ImageView q;
    private final ImageButton r;
    private final Animation s;
    private final Animation t;

    public abel(Context context, int i) {
        super(context);
        this.l = null;
        Resources resources = context.getResources();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.h = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.i = animationLoadAnimation2;
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.left_translate_in);
        this.s = animationLoadAnimation3;
        Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.left_translate_out);
        this.j = animationLoadAnimation4;
        this.t = AnimationUtils.loadAnimation(context, R.anim.left_translate_in);
        Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(context, R.anim.left_translate_out);
        this.k = animationLoadAnimation5;
        long integer = resources.getInteger(R.integer.fade_duration_fast);
        animationLoadAnimation.setDuration(integer);
        animationLoadAnimation2.setDuration(integer);
        LayoutInflater.from(context).inflate(R.layout.invideo_programming_overlay, this);
        this.c = (ImageView) findViewById(R.id.branding_watermark);
        View viewFindViewById = findViewById(R.id.promo_collapsed);
        this.d = viewFindViewById;
        this.o = (ImageView) viewFindViewById.findViewById(R.id.promo_thumbnail_collapsed);
        this.p = viewFindViewById.findViewById(R.id.promo_expand_arrow);
        View viewFindViewById2 = findViewById(R.id.promo_website_expanded);
        this.e = viewFindViewById2;
        this.q = (ImageView) viewFindViewById2.findViewById(R.id.promo_website_thumbnail_expanded);
        this.f = (TextView) viewFindViewById2.findViewById(R.id.promo_website_title);
        this.g = (TextView) viewFindViewById2.findViewById(R.id.promo_website_description);
        ImageButton imageButton = (ImageButton) viewFindViewById2.findViewById(R.id.promo_website_dismiss);
        this.r = imageButton;
        this.m = resources.getDimensionPixelSize(R.dimen.annotation_banner_ads_cta_bottom_margin) + resources.getDimensionPixelSize(R.dimen.invideo_ad_progress_bar_height) + i;
        this.n = resources.getDimensionPixelOffset(R.dimen.annotation_banner_ads_right_margin);
        igp igpVar = new igp(this);
        viewFindViewById2.setOnTouchListener(new affa(viewFindViewById2, igpVar));
        viewFindViewById.setOnTouchListener(new affa(viewFindViewById, igpVar));
        animationLoadAnimation2.setAnimationListener(this);
        animationLoadAnimation4.setAnimationListener(this);
        animationLoadAnimation5.setAnimationListener(this);
        animationLoadAnimation3.setAnimationListener(this);
        viewFindViewById.setOnClickListener(this);
        viewFindViewById2.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        c();
    }

    private static void h(Animation animation, Animation animation2, View view) {
        if (animation == animation2) {
            view.setVisibility(8);
        }
    }

    private final void i(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    private static final void j(View view, int i, int i2) {
        tym.h(view, new tye(new tyi(i2, 0), new tyi(i, 1)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void c() {
        this.b = false;
        setVisibility(8);
        ImageView imageView = this.c;
        imageView.setVisibility(8);
        imageView.setImageBitmap(null);
        this.d.setVisibility(8);
        this.p.setVisibility(0);
        ImageView imageView2 = this.o;
        imageView2.setImageBitmap(null);
        imageView2.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setText((CharSequence) null);
        this.g.setText((CharSequence) null);
        ImageView imageView3 = this.q;
        imageView3.setImageBitmap(null);
        imageView3.setVisibility(8);
        f();
    }

    public final void d(Bitmap bitmap) {
        ImageView imageView = this.q;
        imageView.setImageBitmap(bitmap);
        int i = bitmap == null ? 8 : 0;
        imageView.setVisibility(i);
        ImageView imageView2 = this.o;
        imageView2.setImageBitmap(bitmap);
        imageView2.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.annotation_banner_icon_height);
        }
    }

    public final void e(boolean z, boolean z2) {
        if (z) {
            this.p.setVisibility(8);
            View view = this.e;
            view.setVisibility(0);
            if (z2) {
                view.startAnimation(this.s);
            }
        } else {
            View view2 = this.e;
            if (view2.getVisibility() == 0) {
                this.d.setVisibility(0);
                if (z2 && getVisibility() == 0) {
                    this.p.setVisibility(8);
                    view2.startAnimation(this.j);
                } else {
                    view2.setVisibility(8);
                    this.p.setVisibility(0);
                }
            } else {
                this.p.setVisibility(0);
                View view3 = this.d;
                view3.setVisibility(0);
                if (z2) {
                    view3.startAnimation(this.t);
                }
            }
        }
        g();
    }

    public final void f() {
        int i;
        int i2;
        int i3 = 0;
        if (this.b) {
            i = this.m;
            i2 = this.n;
        } else {
            i = 0;
            i2 = 0;
        }
        j(this.d, i, i2);
        j(this.e, i, i2);
        if (this.b && !getResources().getBoolean(R.bool.annonations_banner_ads_show_thumbnail)) {
            i3 = 8;
        }
        this.q.setVisibility(i3);
        this.o.setVisibility(i3);
    }

    public final boolean g() {
        boolean z = (this.c.getVisibility() == 0 || this.e.getVisibility() == 0 || this.d.getVisibility() == 0) && !this.a;
        setVisibility(true != z ? 8 : 0);
        if (!z) {
            i(this);
        }
        return z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.i) {
            setVisibility(8);
            i(this);
        }
        Animation animation2 = this.k;
        View view = this.d;
        h(animation, animation2, view);
        Animation animation3 = this.j;
        h(animation, animation3, this.e);
        h(animation, this.s, view);
        if (animation == animation3) {
            this.p.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        abep abepVar = this.l;
        if (abepVar != null) {
            if (view == this.e) {
                abes abesVar = (abes) abepVar.a;
                ajdw ajdwVar = abesVar.m;
                if (ajdwVar == null || (ajdwVar.b & 64) == 0) {
                    return;
                }
                vxe vxeVar = abesVar.b;
                ajwo ajwoVar = ajdwVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, null);
                return;
            }
            if (view == this.d) {
                abes abesVar2 = (abes) abepVar.a;
                boolean[] zArr = abesVar2.k;
                if (!abesVar2.o || zArr == null) {
                    return;
                }
                zArr[abesVar2.l] = true;
                abesVar2.g(true, true, 0);
                return;
            }
            if (view == this.r) {
                abes abesVar3 = (abes) abepVar.a;
                boolean[] zArr2 = abesVar3.j;
                int i = abesVar3.l;
                if (i >= 0 && zArr2 != null) {
                    zArr2[i] = true;
                }
                ajdw ajdwVar2 = abesVar3.m;
                if (ajdwVar2 != null) {
                    abesVar3.d.a(ajdwVar2.l);
                }
                abesVar3.c(true);
                abesVar3.c.postDelayed(abesVar3.w, 500L);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
