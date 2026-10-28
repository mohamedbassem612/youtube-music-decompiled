package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineUserInitiatedDataTransferJobService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aacy {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/backgroundtask/OfflineUserInitiatedDataTransferJobUtil");

    public static boolean a(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (!z || jobScheduler.getPendingJob(10) == null) {
            JobInfo.Builder requiresCharging = new JobInfo.Builder(10, new ComponentName(context, (Class<?>) OfflineUserInitiatedDataTransferJobService.class)).setUserInitiated(true).setRequiredNetworkType(1).setBackoffCriteria(30000L, 1).setRequiresCharging(false);
            PersistableBundle persistableBundle = new PersistableBundle();
            JobWorkItem.Builder builder = new JobWorkItem.Builder();
            builder.setExtras(persistableBundle);
            JobWorkItem jobWorkItemBuild = builder.build();
            JobInfo jobInfoBuild = requiresCharging.build();
            int id = jobInfoBuild.getId();
            int iEnqueue = jobScheduler.enqueue(jobInfoBuild, jobWorkItemBuild);
            if (iEnqueue != 1) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/backgroundtask/OfflineUserInitiatedDataTransferJobUtil", "scheduleUserInitiatedDataTransferJobService", 82, "OfflineUserInitiatedDataTransferJobUtil.java")).x("[Offline][UIDT] Failed to schedule job service, job id: %dresult code: %d", id, iEnqueue);
                return false;
            }
        }
        return true;
    }
}
