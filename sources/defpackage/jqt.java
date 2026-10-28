package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqt extends oh {
    public static final /* synthetic */ int x = 0;
    public final View s;
    public final CardView t;
    public final adia u;
    public boolean v;
    final /* synthetic */ jqv w;
    private final FixedAspectRatioFrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqt(jqv jqvVar, View view) {
        super(view);
        this.w = jqvVar;
        this.s = view;
        CardView cardView = (CardView) view.findViewById(R.id.card_view_container);
        this.t = cardView;
        cardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cardView.setOnTouchListener(new jfs(this, jqvVar, 5, null));
        this.y = (FixedAspectRatioFrameLayout) view.findViewById(R.id.swipeable_thumbnail_aspect_ratio_container);
        this.u = adul.l(jqvVar.e, (ImageView) view.findViewById(R.id.swipeable_thumbnail));
        C(jqvVar.k);
    }

    public final void C(int i) {
        jqv jqvVar = this.w;
        if (((vxz) jqvVar.f.io()).l(95, 45762151L, false) && jqvVar.m) {
            this.s.setPadding(0, 0, 0, 0);
        } else {
            this.s.setPadding(i, 0, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    public final void D(jqu jquVar) {
        float fMax;
        hww hwwVar;
        jqv jqvVar = this.w;
        boolean zK = hwz.k(jqvVar.p.f());
        vxz vxzVar = (vxz) jqvVar.f.io();
        int i = 0;
        boolean zL = vxzVar.l(85, 45746502L, false);
        boolean z = vxzVar.l(41, 45679250L, false) && ((hwwVar = jquVar.a) == hww.d || hwwVar == hww.g);
        boolean z2 = vxzVar.l(95, 45762151L, false) && jquVar.b;
        float f = 1.0f;
        if (z2) {
            kjc kjcVar = jqvVar.o;
            Point pointL = kjcVar.l();
            if (pointL.y > 0) {
                fMax = (pointL.x * (true != kjcVar.n() ? 1.0f : 0.5f)) / pointL.y;
                if (vxzVar.c(7, 45818042L, 100L) > 0 && vxzVar.c(7, 45818042L, 100L) < 100) {
                    if (jqvVar.n == null) {
                        jqvVar.n = jqvVar.h.findViewById(R.id.watch_fragment_container);
                    }
                    View view = jqvVar.n;
                    int measuredWidth = (view == null || view.getMeasuredWidth() <= 0) ? this.s.getMeasuredWidth() : view.getMeasuredWidth();
                    int measuredHeight = (view == null || view.getMeasuredHeight() <= 0) ? this.s.getMeasuredHeight() : view.getMeasuredHeight();
                    if (measuredHeight > 0 && measuredWidth > 0) {
                        fMax = Math.max(fMax, measuredWidth / measuredHeight);
                    }
                }
            } else {
                fMax = 1.0f;
            }
        } else {
            fMax = 1.0f;
        }
        if (!zL || !z) {
            if (z2) {
                f = fMax;
            } else if (true != zK) {
                f = 1.7777778f;
            }
        }
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.y;
        if (Math.abs(fixedAspectRatioFrameLayout.a - f) > 0.001f) {
            fixedAspectRatioFrameLayout.a = f;
        }
        if (!z2) {
            if (z) {
                if (!zL) {
                    i = jqvVar.j;
                }
            } else if (zK) {
                i = jqvVar.i;
            }
        }
        this.t.b(i);
        if (z2 && !z) {
            this.u.c(ImageView.ScaleType.CENTER_CROP);
        } else if (zL) {
            this.u.c((z && this.v) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
        }
    }
}
