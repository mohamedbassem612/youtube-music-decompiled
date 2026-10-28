package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgk {
    private Drawable a;
    private abgj b;
    private abgj c;
    private dtf d;
    private dtf e;
    private Drawable f;
    private Drawable g;
    private abgi h;
    private ImageView i;
    private final Context j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final adxj n;

    public abgk(ImageView imageView, Context context, agev agevVar, boolean z, boolean z2, boolean z3) {
        context.getClass();
        this.j = context;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = (adxj) agevVar.f();
        b(imageView);
    }

    public final void a(abgi abgiVar) {
        ImageView imageView = this.i;
        imageView.getClass();
        this.c.getClass();
        this.b.getClass();
        Drawable drawable = imageView.getDrawable();
        abgi abgiVar2 = this.h;
        boolean z = (abgiVar2 == null || abgiVar == null || abgiVar.a != abgiVar2.a) ? false : true;
        boolean z2 = drawable != null && drawable.isVisible();
        if (abgiVar != null) {
            if (z && z2) {
                return;
            }
            abgh abghVar = abgiVar.a;
            abgh abghVar2 = abgh.c;
            if (abghVar == abghVar2) {
                this.i.setContentDescription(this.j.getText(R.string.accessibility_play));
                abgi abgiVar3 = this.h;
                if (abgiVar3 == null || abgiVar3.a != abgh.b) {
                    if (this.k) {
                        ImageView imageView2 = this.i;
                        Drawable drawable2 = this.f;
                        drawable2.getClass();
                        imageView2.setImageDrawable(drawable2);
                    } else {
                        this.c.b();
                    }
                } else if (this.k) {
                    this.i.setImageDrawable(this.e);
                    boolean z3 = this.l;
                    dtf dtfVar = this.e;
                    if (!z3) {
                        dtfVar.getClass();
                        dtfVar.start();
                    } else if (dtfVar != null && !dtfVar.isRunning()) {
                        this.e.start();
                    }
                } else {
                    this.c.a();
                }
            } else {
                abgh abghVar3 = abgh.b;
                ImageView imageView3 = this.i;
                if (abghVar == abghVar3) {
                    imageView3.setContentDescription(this.j.getText(R.string.accessibility_pause));
                    abgi abgiVar4 = this.h;
                    if (abgiVar4 == null || abgiVar4.a != abghVar2) {
                        if (this.k) {
                            ImageView imageView4 = this.i;
                            Drawable drawable3 = this.g;
                            drawable3.getClass();
                            imageView4.setImageDrawable(drawable3);
                        } else {
                            this.b.b();
                        }
                    } else if (this.k) {
                        this.i.setImageDrawable(this.d);
                        boolean z4 = this.l;
                        dtf dtfVar2 = this.d;
                        if (!z4) {
                            dtfVar2.getClass();
                            dtfVar2.start();
                        } else if (dtfVar2 != null && !dtfVar2.isRunning()) {
                            this.d.start();
                        }
                    } else {
                        this.b.a();
                    }
                } else {
                    Context context = this.j;
                    imageView3.setContentDescription(context.getText(R.string.accessibility_replay));
                    ImageView imageView5 = this.i;
                    Drawable drawable4 = this.a;
                    if (drawable4 == null) {
                        drawable4 = context.getDrawable(R.drawable.player_replay);
                        this.a = drawable4;
                    }
                    imageView5.setImageDrawable(drawable4);
                }
            }
            this.h = abgiVar;
        }
    }

    public final void b(ImageView imageView) {
        int iA;
        adxj adxjVar;
        adxj adxjVar2;
        imageView.getClass();
        this.i = imageView;
        boolean z = this.m;
        if (!z || (adxjVar2 = this.n) == null) {
            iA = this.k ? R.drawable.player_pause_new : R.drawable.player_pause;
        } else {
            iA = adxjVar2.a(arqz.bl);
        }
        int iA2 = R.drawable.player_play;
        if (z && (adxjVar = this.n) != null) {
            iA2 = adxjVar.a(arqz.bC);
        }
        this.b = new abgj(imageView, R.drawable.player_play_pause_transition, iA);
        this.c = new abgj(imageView, R.drawable.player_pause_play_transition, iA2);
        if (this.k) {
            Context context = this.j;
            int i = z ? R.drawable.player_play_pause_vector_transition_delhi : R.drawable.player_play_pause_vector_transition;
            this.d = dtf.a(context, i);
            int i2 = z ? R.drawable.player_pause_play_vector_transition_delhi : R.drawable.player_pause_play_vector_transition;
            this.e = dtf.a(context, i2);
            this.f = context.getDrawable(i);
            this.g = context.getDrawable(i2);
        }
    }

    public abgk(ImageView imageView, Context context, boolean z, boolean z2) {
        this(imageView, context, agdf.a, z, z2, false);
    }
}
