package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/chime/SurveyNotificationProcessor");
    public static final agke b = agke.u(Integer.valueOf(R.id.first_survey_option), Integer.valueOf(R.id.second_survey_option), Integer.valueOf(R.id.third_survey_option), Integer.valueOf(R.id.fourth_survey_option), Integer.valueOf(R.id.fifth_survey_option));
    public static final agke c = agke.u(Integer.valueOf(R.id.first_survey_option_click), Integer.valueOf(R.id.second_survey_option_click), Integer.valueOf(R.id.third_survey_option_click), Integer.valueOf(R.id.fourth_survey_option_click), Integer.valueOf(R.id.fifth_survey_option_click));
    public final Context d;
    public final aduv e;
    public final Intent f;
    public final vxz g;
    public final elr h;

    public zzv(Context context, elr elrVar, vxz vxzVar, aduv aduvVar, Intent intent) {
        this.d = context;
        this.h = elrVar;
        this.g = vxzVar;
        this.e = aduvVar;
        this.f = intent;
    }
}
