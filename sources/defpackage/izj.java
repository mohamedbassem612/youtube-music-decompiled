package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izj {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/image/CompoundThumbnailImageViewController");
    public final ImageView b;
    public final glk c;
    public jiu d;
    public Canvas e;
    public Bitmap f;
    private final adhv g;
    private final izh h;
    private final List i;
    private anmm j;
    private List k;
    private int l;

    public izj(adhv adhvVar, ImageView imageView) {
        adhvVar.getClass();
        this.g = adhvVar;
        imageView.getClass();
        this.b = imageView;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.c = new glk(looperMyLooper, this);
        this.h = new izh(this);
        this.i = new ArrayList();
    }

    public final void a() {
        Bitmap bitmap;
        c();
        ImageView imageView = this.b;
        Drawable drawable = imageView.getDrawable();
        imageView.setImageDrawable(null);
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            bitmap.recycle();
        }
        this.j = null;
        this.k = null;
    }

    public final void b() {
        ImageView imageView = this.b;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width == 0 || height == 0) {
            this.h.a();
            return;
        }
        this.f = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
        this.e = new Canvas(this.f);
        int i = this.l;
        int height2 = imageView.getHeight();
        int width2 = imageView.getWidth();
        this.d = i >= 4 ? new jix(height2, width2, 0) : new jix(height2, width2, 1);
        if (this.k == null) {
            e();
            return;
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            Uri uriG = aawb.G((aqmh) this.k.get(i2), width, height);
            if (uriG != null) {
                sxw sxwVar = new sxw(new izi(this, i2, this.l));
                this.i.add(sxwVar);
                adhv adhvVar = this.g;
                adhq adhqVarA = adhr.a();
                adhqVarA.b(true);
                adhvVar.l(uriG, sxwVar, adhqVarA.a());
            }
        }
        this.h.b();
    }

    public final void c() {
        this.c.removeCallbacksAndMessages(null);
        List<sxw> list = this.i;
        for (sxw sxwVar : list) {
            if (sxwVar != null) {
                sxwVar.c();
            }
        }
        list.clear();
    }

    public final void d(anmm anmmVar) {
        if (!Objects.equals(anmmVar, this.j)) {
            a();
            this.j = anmmVar;
            this.h.b();
        }
        if (anmmVar != null) {
            this.l = anmmVar.b.size() < 4 ? 1 : 4;
            this.k = new ArrayList();
            for (int i = 0; i < anmmVar.b.size(); i++) {
                aqmh aqmhVar = (aqmh) anmmVar.b.get(i);
                if (ixt.z(aqmhVar)) {
                    this.k.add(aqmhVar);
                }
                if (this.k.size() >= this.l) {
                    break;
                }
            }
            if (this.k.size() < this.l) {
                e();
            } else if (this.b.isLayoutRequested()) {
                this.h.a();
            } else {
                b();
            }
        }
    }

    public final void e() {
        ImageView imageView = this.b;
        anmm anmmVar = this.j;
        Context context = imageView.getContext();
        aqmh aqmhVar = null;
        if (anmmVar != null && anmmVar.b.size() > 0) {
            aqmhVar = (aqmh) anmmVar.b.get(0);
        }
        imageView.setImageDrawable(ixt.v(context, aqmhVar));
    }
}
