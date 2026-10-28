package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class swu {
    final TextView a;
    final ImageView b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final View f;
    final View g;
    final TextView h;
    public final int i;
    public final aeaa j;
    public int[] k;
    final /* synthetic */ swv l;
    public final zdj m;

    public swu(swv swvVar, int i) {
        View viewC;
        this.l = swvVar;
        this.i = i;
        if (i != 0) {
            viewC = c(R.layout.unlimited_page_header_v2).findViewById(R.id.unlimited_page_header);
            this.g = viewC;
        } else {
            viewC = c(R.layout.unlimited_page_header);
            this.g = viewC;
        }
        this.b = (ImageView) viewC.findViewById(R.id.promo_background);
        this.c = (ImageView) viewC.findViewById(R.id.promo_logo);
        this.a = (TextView) viewC.findViewById(R.id.promo_header_description);
        TextView textView = (TextView) viewC.findViewById(R.id.subscription_button);
        this.d = textView;
        this.e = (TextView) viewC.findViewById(R.id.metadata);
        View viewFindViewById = viewC.findViewById(R.id.background_scrim);
        this.f = viewFindViewById;
        this.j = swvVar.i.d(textView);
        this.m = tsv.j(viewFindViewById);
        this.h = (TextView) viewC.findViewById(R.id.promotion_text);
        textView.addOnLayoutChangeListener(new aeab(textView, swvVar.d.getResources().getDimensionPixelSize(R.dimen.price_icon_size), 0));
    }

    public static final aqmh b(aqmj aqmjVar, boolean z) {
        if (aqmjVar == null) {
            return null;
        }
        aqmi aqmiVar = aqmjVar.b;
        if (aqmiVar == null) {
            aqmiVar = aqmi.a;
        }
        if (z) {
            aqmh aqmhVar = aqmiVar.d;
            return aqmhVar == null ? aqmh.a : aqmhVar;
        }
        aqmh aqmhVar2 = aqmiVar.c;
        return aqmhVar2 == null ? aqmh.a : aqmhVar2;
    }

    private final View c(int i) {
        swv swvVar = this.l;
        return LayoutInflater.from(swvVar.d).inflate(i, (ViewGroup) swvVar.c, false);
    }

    public final void a(ImageView imageView, aqmh aqmhVar) {
        adhv adhvVar = this.l.a;
        if (aqmhVar != null) {
            adhvVar.h(imageView, aqmhVar);
        } else {
            adhvVar.f(imageView);
        }
    }
}
