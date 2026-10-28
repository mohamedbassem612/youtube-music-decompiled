package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adia {
    private static final adhs c = new adhy();
    public final ImageView a;
    public adif b;
    private final tsz d;
    private final adhz e;
    private adhs f;
    private aqmh g;
    private Uri h;
    private tym i;

    public adia(tsz tszVar, tym tymVar, adhs adhsVar, ImageView imageView, boolean z) {
        tszVar.getClass();
        this.d = tszVar;
        imageView.getClass();
        this.a = imageView;
        this.e = new adhz(this, z);
        this.i = tymVar;
        this.f = adhsVar;
    }

    public final void a() {
        b();
        this.a.setImageDrawable(null);
    }

    public final void b() {
        agrf agrfVar = tta.a;
        this.a.setTag(R.id.bitmap_loader_tag, null);
        this.e.a();
        this.b = null;
        this.g = null;
        this.h = null;
    }

    public final void c(ImageView.ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }

    public final void d(int i) {
        this.a.setVisibility(i);
    }

    @Deprecated
    public final void e(abuz abuzVar) {
        f(abuzVar != null ? abuzVar.l() : null, null);
    }

    public final void f(aqmh aqmhVar, qcb qcbVar) {
        if (aqmhVar != this.g) {
            this.b = this.f.a();
            this.g = aqmhVar;
            this.h = null;
            this.a.setImageDrawable(null);
            this.e.a();
        }
        if (aawb.O(aqmhVar)) {
            adhz adhzVar = this.e;
            if (adhzVar.a || !this.a.isLayoutRequested()) {
                g(qcbVar, this.b);
            } else {
                adhzVar.b(qcbVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    public final void g(qcb qcbVar, adif adifVar) {
        aqmg aqmgVar;
        if (this.g != null) {
            ImageView imageView = this.a;
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0) {
                if (this.g.c.size() != 1) {
                    this.e.b(qcbVar);
                    return;
                }
            } else if (height == 0) {
                height = 0;
                if (this.g.c.size() != 1) {
                    this.e.b(qcbVar);
                    return;
                }
            }
            aqmh aqmhVar = this.g;
            if (width < 0) {
                throw new IllegalArgumentException();
            }
            if (height < 0) {
                throw new IllegalArgumentException();
            }
            if (aawb.O(aqmhVar)) {
                ArrayList arrayList = new ArrayList(aqmhVar.c);
                Collections.sort(arrayList, new rit(15));
                aqmgVar = (aqmg) arrayList.get(Math.min(arrayList.indexOf(aawb.K(aqmhVar, width, height)), arrayList.size() - 1));
            } else {
                aqmgVar = null;
            }
            Uri uriD = (aqmgVar == null || (aqmgVar.b & 1) == 0) ? null : tyu.d(aqmgVar.c);
            if (uriD == null || !uriD.equals(this.h)) {
                this.h = uriD;
                if (uriD != null) {
                    tsz tszVar = this.d;
                    tym tymVar = this.i;
                    agrf agrfVar = tta.a;
                    if (adifVar != null) {
                        imageView.setImageDrawable((Drawable) adifVar.a);
                    }
                    if (qcbVar != null) {
                        ((jdt) qcbVar.a).g();
                    }
                    tszVar.b(uriD, new syc(tta.b, new tsx(imageView, tymVar, qcbVar)));
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            this.e.a();
        }
    }

    public adia(tsz tszVar, tym tymVar, ImageView imageView, boolean z) {
        this(tszVar, tymVar, c, imageView, z);
    }

    public adia(tsz tszVar, ImageView imageView, boolean z) {
        this(tszVar, new tsy(imageView.getContext()), imageView, z);
    }
}
