package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.survey.HatsContainer;
import com.google.android.apps.youtube.music.survey.HatsHorizontalSurvey;
import com.google.android.apps.youtube.music.survey.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ivq {
    public YouTubeTextView a;
    public HatsSurvey b;
    public HatsHorizontalSurvey c;
    private final HatsContainer d;

    public ivq(HatsContainer hatsContainer) {
        this.d = hatsContainer;
    }

    public final View a(int i) {
        HatsContainer hatsContainer = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(hatsContainer.getContext());
        ViewGroup viewGroup = hatsContainer.f;
        viewGroup.getClass();
        return layoutInflaterFrom.inflate(i, viewGroup, false);
    }
}
