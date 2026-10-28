package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vpy implements vny {
    public yhi a;
    private final Context b;
    private final int c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private ImageView k;
    private ViewStub l;
    private CharSequence m;
    private boolean n = true;
    private final Typeface o;
    private adzx p;
    private yhi q;
    private final axlj r;
    private final aciz s;

    public vpy(Context context, aciz acizVar, axlj axljVar) {
        this.b = context;
        this.s = acizVar;
        this.c = tzk.i(context, R.attr.ytTextSecondary);
        this.o = ackm.YOUTUBE_SANS_BOLD.c(context, 0);
        this.r = axljVar;
    }

    private final void t() {
        View view = this.d;
        if (view != null) {
            view.setContentDescription(null);
        }
    }

    @Override // defpackage.vny
    public final View a() {
        return null;
    }

    @Override // defpackage.vny
    public final View b() {
        if (this.d == null) {
            Context context = this.b;
            aciz acizVar = this.s;
            View viewInflate = LayoutInflater.from(context).inflate(true != acizVar.C() ? R.layout.playlist_engagement_panel_header : R.layout.playlist_engagement_panel_header_modern_type, (ViewGroup) null);
            this.d = viewInflate;
            this.e = (TextView) viewInflate.findViewById(R.id.title);
            this.f = (TextView) this.d.findViewById(R.id.subtitle);
            this.g = (TextView) this.d.findViewById(R.id.position);
            this.h = (ImageView) this.d.findViewById(R.id.icon);
            ImageView imageView = (ImageView) this.d.findViewById(R.id.save_playlist);
            this.i = imageView;
            this.p = this.r.q(imageView);
            this.j = (ImageView) this.d.findViewById(R.id.three_dots_menu);
            this.l = (ViewStub) this.d.findViewById(R.id.back_button);
            TextView textView = this.e;
            if (textView != null) {
                tuk.u(textView, null);
                t();
            }
            n(this.m);
            TextView textView2 = this.g;
            if (textView2 != null) {
                tuk.u(textView2, null);
                t();
            }
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                tuk.l(imageView2, false);
            }
            if (this.f != null) {
                if (acizVar.C()) {
                    acizVar.B(aedv.b(3, 2), context, (YouTubeAppCompatTextView) this.f);
                } else {
                    this.f.setTextAppearance(context, tzk.j(context, R.attr.ytTextAppearanceBody1a));
                    this.f.setTextColor(this.c);
                }
            }
            if (this.g != null) {
                if (acizVar.C()) {
                    acizVar.B(aedv.b(3, 3), context, (YouTubeAppCompatTextView) this.g);
                } else {
                    this.g.setTextAppearance(context, tzk.j(context, R.attr.ytTextAppearanceTitle2));
                    this.g.setTextColor(this.c);
                }
            }
            adzx adzxVar = this.p;
            if (adzxVar != null) {
                adzxVar.a(null, null, null);
            }
            ImageView imageView3 = this.j;
            if (imageView3 != null) {
                tuk.l(imageView3, false);
                this.j.setOnClickListener(null);
            }
        }
        return this.d;
    }

    @Override // defpackage.vny
    public final /* synthetic */ View c(Context context) {
        return b();
    }

    @Override // defpackage.vny
    public final void i(boolean z) {
        ViewStub viewStub;
        ImageView imageView = this.k;
        if (imageView != null) {
            tuk.l(imageView, z);
        } else {
            if (!z || (viewStub = this.l) == null) {
                return;
            }
            ImageView imageView2 = (ImageView) viewStub.inflate();
            this.k = imageView2;
            imageView2.setOnClickListener(new vhv(this, 9));
        }
    }

    @Override // defpackage.vny
    public final void j(boolean z) {
        if (this.n != z) {
            this.n = z;
            yhi yhiVar = this.q;
            if (yhiVar != null) {
                yhiVar.c(z);
            }
        }
    }

    @Override // defpackage.vny
    public final void n(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.f;
        if (textView != null) {
            tuk.u(textView, charSequence);
            t();
        }
        if (this.e != null) {
            aciz acizVar = this.s;
            if (acizVar.C()) {
                acizVar.B(aedv.b(2, 2), this.b, (YouTubeAppCompatTextView) this.e);
                return;
            }
            TextView textView2 = this.e;
            Context context = this.b;
            textView2.setTextAppearance(context, tzk.j(context, R.attr.ytTextAppearanceTitle2));
            Typeface typeface = this.o;
            if (typeface != null) {
                this.e.setTypeface(typeface);
            }
        }
    }

    @Override // defpackage.vny
    public final void o(TextUtils.TruncateAt truncateAt) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setEllipsize(truncateAt);
        }
    }

    @Override // defpackage.vny
    public final boolean p() {
        return this.n;
    }

    @Override // defpackage.vny
    public final void r(yhi yhiVar) {
        this.a = yhiVar;
    }

    @Override // defpackage.vny
    public final void s(yhi yhiVar) {
        if (this.q != yhiVar) {
            this.q = yhiVar;
        }
    }

    @Override // defpackage.vny
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.vny
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.vny
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.vny
    public final void g() {
    }

    @Override // defpackage.vny
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vny
    public final void k(aqaw aqawVar) {
    }

    @Override // defpackage.vny
    public final void l(voa voaVar) {
    }

    @Override // defpackage.vny
    public final void m(apji apjiVar) {
    }

    @Override // defpackage.vny
    public final /* synthetic */ void q(vnr vnrVar) {
    }
}
