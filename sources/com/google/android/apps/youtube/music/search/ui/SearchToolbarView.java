package com.google.android.apps.youtube.music.search.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.text.PlainTextEditText;
import defpackage.ackm;
import defpackage.adxj;
import defpackage.arqz;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.gxv;
import defpackage.hdf;
import defpackage.inx;
import defpackage.tuk;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchToolbarView extends inx {
    public adxj a;
    public final PlainTextEditText b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final View f;
    public final View g;
    public final RelativeLayout h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public vxz m;
    private final ImageView n;
    private final ImageView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.l = 2;
        if (k().l(9, 45780438L, false)) {
            View.inflate(context, R.layout.search_toolbar_view_v2, this);
        } else {
            View.inflate(context, R.layout.search_toolbar_view, this);
        }
        View viewFindViewById = findViewById(R.id.search_edit_text);
        viewFindViewById.getClass();
        PlainTextEditText plainTextEditText = (PlainTextEditText) viewFindViewById;
        this.b = plainTextEditText;
        View viewFindViewById2 = findViewById(R.id.toolbar_back_navigation);
        viewFindViewById2.getClass();
        this.n = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.toolbar_search_logo);
        viewFindViewById3.getClass();
        this.o = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.search_clear);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.c = imageView;
        View viewFindViewById5 = findViewById(R.id.voice_search);
        viewFindViewById5.getClass();
        this.d = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.sound_search);
        viewFindViewById6.getClass();
        this.e = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.voice_search_container);
        viewFindViewById7.getClass();
        this.f = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.navigation_or_logo_container);
        viewFindViewById8.getClass();
        this.g = viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.search_toolbar_layout);
        viewFindViewById9.getClass();
        this.h = (RelativeLayout) viewFindViewById9;
        plainTextEditText.setPrivateImeOptions("nm");
        plainTextEditText.setTypeface(ackm.ROBOTO_MEDIUM.c(plainTextEditText.getContext(), 0));
        j();
        if (TextUtils.getTrimmedLength(plainTextEditText.getText()) > 0) {
            tuk.j(plainTextEditText);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        plainTextEditText.addTextChangedListener(new gxv(this, 4));
        l();
    }

    private final void l() {
        int i = true != this.i ? 0 : 8;
        ImageView imageView = this.n;
        imageView.setVisibility(i);
        int i2 = this.l;
        if (i2 == 1 || i2 == 3) {
            if (this.i) {
                this.o.setVisibility(0);
            }
        } else {
            this.o.setVisibility(8);
            imageView.setOnClickListener(new hdf(this, 19));
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
        }
    }

    public final adxj c() {
        adxj adxjVar = this.a;
        if (adxjVar != null) {
            return adxjVar;
        }
        awrc.b("iconResolver");
        return null;
    }

    public final void d() {
        tuk.i(this.b);
    }

    public final void e() {
        this.l = 2;
        if (k().l(8, 45764180L, false) && !k().l(9, 45780438L, false)) {
            this.o.setVisibility(8);
            this.n.setVisibility(true != this.i ? 0 : 8);
        }
        PlainTextEditText plainTextEditText = this.b;
        tuk.m(plainTextEditText);
        plainTextEditText.requestFocus();
        h();
    }

    public final void f() {
        if (this.k) {
            return;
        }
        this.l = 1;
        if (k().l(8, 45764180L, false) && !k().l(9, 45780438L, false)) {
            this.o.setVisibility(8);
            this.n.setVisibility(8);
        }
        h();
        this.b.clearFocus();
    }

    public final void g(String str) {
        str.getClass();
        this.b.setHint(str);
    }

    public final void h() {
        PlainTextEditText plainTextEditText = this.b;
        int length = String.valueOf(plainTextEditText.getText()).length();
        if (!k().l(9, 45780438L, false)) {
            this.c.setVisibility(String.valueOf(plainTextEditText.getText()).length() <= 0 ? 8 : 0);
            return;
        }
        int i = this.l;
        if (i == 3) {
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        } else if (i == 2) {
            this.d.setVisibility(length > 0 ? 8 : 0);
            this.c.setVisibility(length <= 0 ? 8 : 0);
        } else if (i == 1) {
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        }
    }

    public final void i(boolean z) {
        this.i = z;
        l();
    }

    public final void j() {
        PlainTextEditText plainTextEditText;
        Drawable background;
        int iB = c().b(arqz.oQ);
        ImageView imageView = this.c;
        imageView.setImageResource(iB);
        this.n.setImageResource(c().b(arqz.er));
        this.d.setImageResource(c().b(arqz.iS));
        this.e.setImageResource(c().b(arqz.oH));
        if (k().l(2, 45727006L, false) && this.j && (background = (plainTextEditText = this.b).getBackground()) != null) {
            background.mutate().setColorFilter(getContext().getColor(R.color.yt_white1), PorterDuff.Mode.SRC);
            plainTextEditText.setBackground(background);
            plainTextEditText.setTextColor(getContext().getColor(R.color.yt_black4));
            plainTextEditText.setHintTextColor(getContext().getColor(R.color.yt_black4));
            imageView.setColorFilter(getContext().getColor(R.color.yt_black4), PorterDuff.Mode.SRC_IN);
        }
    }

    public final vxz k() {
        vxz vxzVar = this.m;
        if (vxzVar != null) {
            return vxzVar;
        }
        awrc.b("musicSearchClientConfig");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchToolbarView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SearchToolbarView(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
