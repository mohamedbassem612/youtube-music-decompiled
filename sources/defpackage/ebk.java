package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.youtube.music.R;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ebk implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ebk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r5v31, types: [awmd, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$cid) {
            case 0:
                return new eej((dmq) this.a);
            case 1:
                return new efh((dmq) this.a);
            case 2:
                return new een((dmq) this.a);
            case 3:
                return new eep((dmq) this.a);
            case 4:
                return new eec((dmq) this.a);
            case 5:
                return new eef((dmq) this.a);
            case 6:
                ebm ebmVar = (ebm) this.a;
                Context context = ebmVar.b;
                String str = ecg.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    ece.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List listF = ecg.f(context, jobScheduler);
                if (listF != null && !listF.isEmpty()) {
                    Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        ecg.g(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ebmVar.d.C().x();
                eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
                return awmy.a;
            case 7:
                this.a.invoke();
                return awmy.a;
            case 8:
                return ((hbl) this.a).a.c();
            case 9:
                return ((hyk) this.a).a.getString(R.string.accessibility_exit_fullscreen);
            case 10:
                return ((hyk) this.a).a.getString(R.string.accessibility_enter_fullscreen);
            case 11:
                return ((hyk) this.a).a.getString(R.string.fullscreen_button);
            case 12:
                return this.a;
            case 13:
                return new File((String) this.a);
            case 14:
                ?? r5 = this.a;
                if (r5 != 0) {
                    return (tfr) r5.io();
                }
                return null;
            case 15:
                int i = tqr.a;
                tja tjaVar = (tja) this.a;
                return Boolean.valueOf(tjaVar.d.k(1073829995) && tjaVar.b.H());
            case 16:
                int i2 = tqr.a;
                return Integer.valueOf(((tko) this.a).a.a(1073960047));
            case 17:
                int i3 = tqr.a;
                return Long.valueOf(((long) ((tko) this.a).a.a(1073960044)) * 5);
            case 18:
                int i4 = tqr.a;
                byte[] bArrQ = ((tko) this.a).a.q();
                int i5 = 0;
                while (true) {
                    if (i5 >= 64) {
                        i5 = -1;
                    } else if (bArrQ[i5] != 0) {
                        i5++;
                    }
                }
                int i6 = i5 != -1 ? i5 : 64;
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                String string = awrc.q(new String(bArrQ, 0, i6, charset)).toString();
                return string.length() == 0 ? "" : a.bT(string, "https://www.gstatic.com/innertube-shared-dict/", ".dict");
            case 19:
                int i7 = tqr.a;
                return Boolean.valueOf(((vwp) this.a).b.k(1073830109));
            default:
                xnx xnxVar = (xnx) this.a;
                return awro.t(xnxVar.b, null, 2, new dnz(xnxVar, (awoq) null, 20), 1);
        }
    }
}
