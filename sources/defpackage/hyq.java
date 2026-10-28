package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyq implements hyi {
    private final Activity a;
    private final hbf b;
    private final igk c;

    public hyq(Activity activity, hbf hbfVar, igk igkVar) {
        this.a = activity;
        this.b = hbfVar;
        this.c = igkVar;
    }

    @Override // defpackage.hyi
    public final anfv a() {
        String string;
        igk igkVar = this.c;
        if (igkVar.c) {
            return null;
        }
        aihf aihfVarCreateBuilder = anfw.a.createBuilder();
        igi igiVarA = igkVar.a();
        igi igiVar = igi.a;
        if (igiVarA == igiVar) {
            string = this.b.d();
        } else {
            int hours = (int) igkVar.c().toHours();
            int minutes = (int) igkVar.c().toMinutes();
            Activity activity = this.a;
            int i = minutes % 60;
            String quantityString = activity.getApplicationContext().getResources().getQuantityString(R.plurals.minutes_abbreviated, i, Integer.valueOf(i));
            if (hours == 0) {
                string = ((Context) this.b.a).getString(R.string.sleep_timer_minutes_left, quantityString);
            } else {
                string = ((Context) this.b.a).getString(R.string.sleep_timer_hours_and_minutes_left, activity.getApplicationContext().getResources().getQuantityString(R.plurals.hours_abbreviated, hours, Integer.valueOf(hours)), quantityString);
            }
        }
        alay alayVarC = ackj.c(string);
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        anfwVar.c = alayVarC;
        anfwVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = igkVar.a() == igiVar ? aliz.MOON_Z : aliz.MOON_Z_FILLED;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anfwVar2.d = aljaVar2;
        anfwVar2.b |= 2;
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihhVar2.e(aqaf.b, aqaf.a);
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
        ajwo ajwoVar = (ajwo) aihhVar2.build();
        ajwoVar.getClass();
        anfwVar3.f = ajwoVar;
        anfwVar3.b |= 32;
        anfw anfwVar4 = (anfw) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
        anfwVar4.getClass();
        anfvVar.c = anfwVar4;
        anfvVar.b = 66441108;
        return (anfv) aihfVarCreateBuilder2.build();
    }
}
