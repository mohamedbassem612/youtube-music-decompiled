package com.google.android.apps.youtube.music.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.drp;
import defpackage.dse;
import defpackage.dsi;
import defpackage.ivp;
import defpackage.ivq;
import defpackage.ivr;
import defpackage.tuk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class HatsContainer extends GridLayout {
    public View a;
    ImageView b;
    View c;
    YouTubeTextView d;
    HatsSurvey e;
    public ViewGroup f;
    public boolean g;
    public int h;
    private ivq i;

    public HatsContainer(Context context) {
        super(context);
        this.h = 1;
    }

    private final boolean e() {
        return this.d != null;
    }

    public final ivq a() {
        ivq ivqVar = this.i;
        if (ivqVar != null) {
            return ivqVar;
        }
        ivq ivqVar2 = new ivq(this);
        this.i = ivqVar2;
        return ivqVar2;
    }

    public final void b() {
        if (this.h == 1 && e()) {
            tuk.l(this.b, true);
            tuk.l(this.c, true);
            tuk.l(this.d, true);
            tuk.l(this.e, false);
            tuk.l(this.a, this.g);
            this.h = 2;
            return;
        }
        if (e() && this.d != null && this.e != null) {
            dsi dsiVar = new dsi();
            dsiVar.P(1);
            dsiVar.I(new LinearInterpolator());
            drp drpVar = new drp(2);
            drpVar.b = 75L;
            drpVar.E(this.d);
            dsiVar.O(drpVar);
            drp drpVar2 = new drp(1);
            drpVar2.b = 150L;
            drpVar2.E(this.e);
            dsiVar.O(drpVar2);
            ivr ivrVar = new ivr();
            ivrVar.b = 300L;
            ivrVar.E(this);
            dsi dsiVar2 = new dsi();
            dsiVar2.P(0);
            dsiVar2.O(dsiVar);
            dsiVar2.O(ivrVar);
            dse.b(this, dsiVar2);
        }
        tuk.l(this.b, false);
        tuk.l(this.c, false);
        YouTubeTextView youTubeTextView = this.d;
        if (youTubeTextView != null) {
            tuk.l(youTubeTextView, false);
        }
        tuk.l(this.e, true);
        tuk.l(this.a, this.g);
        this.h = 3;
    }

    public final void c(YouTubeTextView youTubeTextView) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        YouTubeTextView youTubeTextView2 = this.d;
        if (youTubeTextView2 != null && (viewGroup2 = this.f) != null) {
            viewGroup2.removeView(youTubeTextView2);
        }
        this.d = youTubeTextView;
        if (youTubeTextView == null || (viewGroup = this.f) == null) {
            return;
        }
        viewGroup.addView(youTubeTextView);
        this.d.setOnClickListener(new ivp(this, 0));
    }

    public final void d(HatsSurvey hatsSurvey) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        HatsSurvey hatsSurvey2 = this.e;
        if (hatsSurvey2 != null && (viewGroup2 = this.f) != null) {
            viewGroup2.removeView(hatsSurvey2);
        }
        this.e = hatsSurvey;
        if (hatsSurvey == null || (viewGroup = this.f) == null) {
            return;
        }
        viewGroup.addView(hatsSurvey);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ViewGroup) findViewById(R.id.hats_content_container);
        this.a = findViewById(R.id.hats_dismiss);
        this.c = findViewById(R.id.hats_expand_spacing);
        ImageView imageView = (ImageView) findViewById(R.id.hats_expand);
        this.b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new ivp(this, 2));
        }
    }

    public HatsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 1;
    }

    public HatsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 1;
    }
}
