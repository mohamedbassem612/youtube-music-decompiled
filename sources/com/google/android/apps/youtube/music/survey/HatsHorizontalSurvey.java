package com.google.android.apps.youtube.music.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class HatsHorizontalSurvey extends HatsSurvey {
    public TextView a;
    public TextView b;

    public HatsHorizontalSurvey(Context context) {
        super(context);
    }

    @Override // com.google.android.apps.youtube.music.survey.HatsSurvey
    protected final boolean a() {
        return true;
    }

    @Override // com.google.android.apps.youtube.music.survey.HatsSurvey, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.hats_low_text);
        this.b = (TextView) findViewById(R.id.hats_high_text);
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
