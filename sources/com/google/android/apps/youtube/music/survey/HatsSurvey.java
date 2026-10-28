package com.google.android.apps.youtube.music.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.ackj;
import defpackage.ajnf;
import defpackage.alay;
import defpackage.tuk;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class HatsSurvey extends GridLayout {
    TextView c;
    public ViewGroup d;
    TextView e;
    View f;

    public HatsSurvey(Context context) {
        super(context);
    }

    protected boolean a() {
        return false;
    }

    public final void b(CharSequence charSequence) {
        TextView textView = this.c;
        textView.getClass();
        tuk.u(textView, charSequence);
    }

    public final void c(List list) {
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                this.d.addView((View) list.get(i));
                if (a() && i < list.size() - 1) {
                    ViewGroup viewGroup2 = this.d;
                    Space space = new Space(getContext());
                    space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                    viewGroup2.addView(space);
                }
            }
        }
    }

    public final void d(ajnf ajnfVar, View.OnClickListener onClickListener) {
        TextView textView;
        boolean z = ajnfVar != null;
        tuk.l(this.e, z);
        tuk.l(this.f, z);
        if (!z || (textView = this.e) == null) {
            return;
        }
        alay alayVar = ajnfVar.m;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        this.e.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.hats_survey_question);
        this.e = (TextView) findViewById(R.id.hats_submit_button);
        this.f = findViewById(R.id.hats_submit_button_spacing);
        this.d = (ViewGroup) findViewById(R.id.hats_survey_response);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
