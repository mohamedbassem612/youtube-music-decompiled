package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pad implements pab {
    public static final agsn a = agsn.h("GnpSdk");
    public final Context b;
    public final Map c;
    public final pls d;
    public final awmd e;
    public final ijt f;
    private final pni g;

    public pad(Context context, Map map, pni pniVar, pls plsVar, pav pavVar, awmd awmdVar, ijt ijtVar) {
        context.getClass();
        pniVar.getClass();
        plsVar.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        ijtVar.getClass();
        this.b = context;
        this.c = map;
        this.g = pniVar;
        this.d = plsVar;
        this.e = awmdVar;
        this.f = ijtVar;
    }

    @Override // defpackage.pab
    public final boolean a(JobParameters jobParameters, JobService jobService) {
        jobParameters.getClass();
        int jobId = jobParameters.getJobId();
        PersistableBundle extras = jobParameters.getExtras();
        extras.getClass();
        try {
            String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            if (string == null || string.length() == 0) {
                ((agsj) a.b()).u("Job scheduled with invalid handler key. Job ID: '%d'", jobId);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            this.g.d(new pac(this, string, jobId, extras, jobService, jobParameters, 0), plb.b(180000L));
            return true;
        } catch (IllegalArgumentException e) {
            ((agsj) ((agsj) a.b()).j(e)).u("Error retrieving handler key for Job. Job ID: '%d'", jobId);
            return false;
        } catch (NullPointerException e2) {
            ((agsj) ((agsj) a.b()).j(e2)).u("Error retrieving handler key for Job. Job ID: '%d'", jobId);
            return false;
        }
    }

    @Override // defpackage.pab
    public final void b(JobParameters jobParameters) {
        jobParameters.getClass();
    }
}
