package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Size;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpl {
    public acvq b;
    public final int c;
    public final adhv d;
    public ImageView e;
    public ImageView f;
    public Size g;
    public adia h;
    public aqmh i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final hno m;
    public adif n;
    private final actm p;
    private boolean q;
    public final ArrayDeque a = new ArrayDeque(2);
    public final tym o = new acpj(this);

    public acpl(adhv adhvVar, agfr agfrVar, actm actmVar, hno hnoVar) {
        int i;
        this.d = adhvVar;
        this.p = actmVar;
        this.m = hnoVar;
        Object objIo = agfrVar.io();
        int i2 = 720;
        if (objIo != null && (i = ((apeq) objIo).d) > 0) {
            i2 = i;
        }
        this.c = i2;
    }

    public static Bitmap a(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        double d = width;
        int height = bitmap.getHeight();
        double d2 = height;
        double d3 = d / d2;
        if (d3 < 0.5625d) {
            i2 = (int) (d / 0.5625d);
            i = width;
        } else {
            i = d3 > 0.5625d ? (int) (d2 * 0.5625d) : width;
            i2 = height;
        }
        int i3 = width - i;
        int i4 = height - i2;
        if (i == width && i2 == height) {
            return bitmap;
        }
        return Bitmap.createBitmap(bitmap, i3 / 2, i4 / 2, i, i2);
    }

    private final ImageView i() {
        ImageView imageView = this.e;
        imageView.getClass();
        return imageView;
    }

    private final adia j() {
        adia adiaVar = this.h;
        adiaVar.getClass();
        return adiaVar;
    }

    public final void b(int i) {
        this.q = true;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationY(i);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setTranslationY(i);
        }
    }

    public final void c() {
        Bitmap bitmap;
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setScaleX(1.0f);
            this.f.setScaleY(1.0f);
            hno hnoVar = this.m;
            if (hnoVar.aH() && (this.f.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.f.getDrawable()).getBitmap()) != null && bitmap.isMutable()) {
                ArrayDeque arrayDeque = this.a;
                if (arrayDeque.size() < 2) {
                    arrayDeque.offerLast(bitmap);
                }
            }
            this.f.setImageBitmap(null);
            if (hnoVar.aH() && this.b != null) {
                this.b = null;
            }
            tuk.l(this.f, false);
        }
    }

    public final void d() {
        this.j = false;
        this.l = false;
        this.i = null;
        if (this.q) {
            b(0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setScaleX(1.0f);
            this.e.setScaleY(1.0f);
        }
        adia adiaVar = this.h;
        if (adiaVar != null) {
            adiaVar.a();
        }
        tuk.l(this.e, false);
    }

    public final void e(Bitmap bitmap, zki zkiVar, Optional optional) {
        zkiVar.h(bitmap, new acpk(this, optional, 0));
    }

    public final void f() {
        tuk.l(i(), false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public final void g(apfp apfpVar) {
        boolean z;
        ImageView imageView;
        this.j = aecm.ax(apfpVar) || aecm.ag(apfpVar);
        if (!aecm.am(apfpVar) && (imageView = this.e) != null) {
            Context context = imageView.getContext();
            z = yno.H(context) && !twm.v(context);
        }
        this.k = z;
        this.l = aecm.ah(apfpVar);
        if ((apfpVar.c & SemanticState.ReadOnly) == 0) {
            this.i = null;
            j().a();
            return;
        }
        aqmh aqmhVar = apfpVar.u;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.i = aqmhVar;
        j().f(aqmhVar, null);
    }

    public final void h() {
        tuk.l(i(), true);
        this.p.f("r_ts");
    }
}
