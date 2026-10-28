package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.survey.HatsContainer;
import com.google.android.apps.youtube.music.survey.HatsHorizontalSurvey;
import com.google.android.apps.youtube.music.survey.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ivy {
    public final aduv a;
    public final vxe b;
    final HatsContainer c;
    final YouTubeTextView d;
    final HatsSurvey e;
    final HatsHorizontalSurvey f;
    public final Map g = new HashMap();
    qcb h;

    public ivy(aduv aduvVar, vxe vxeVar, HatsContainer hatsContainer) {
        this.a = aduvVar;
        this.b = vxeVar;
        this.c = hatsContainer;
        ivq ivqVarA = hatsContainer.a();
        if (ivqVarA.a == null) {
            ivqVarA.a = (YouTubeTextView) ivqVarA.a(R.layout.hats_prompt);
        }
        this.d = ivqVarA.a;
        ivq ivqVarA2 = hatsContainer.a();
        if (ivqVarA2.c == null) {
            ivqVarA2.c = (HatsHorizontalSurvey) ivqVarA2.a(R.layout.hats_horizontal_survey);
        }
        this.f = ivqVarA2.c;
        ivq ivqVarA3 = hatsContainer.a();
        if (ivqVarA3.b == null) {
            ivqVarA3.b = (HatsSurvey) ivqVarA3.a(R.layout.hats_survey);
        }
        this.e = ivqVarA3.b;
    }

    public static final boolean a(ivw ivwVar) {
        if (ivwVar.e != 2) {
            return true;
        }
        aqgt aqgtVar = ivwVar.a;
        if (aqgtVar != null && (aqgtVar.b & 1) != 0) {
            aqgw aqgwVar = aqgtVar.c;
            if (aqgwVar == null) {
                aqgwVar = aqgw.a;
            }
            int iAS = a.aS(aqgwVar.b);
            if (iAS != 0 && iAS == 3) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.g.clear();
        qcb qcbVar = this.h;
        if (qcbVar != null) {
            ((ivu) qcbVar.a).a().start();
            this.h = null;
        }
    }
}
