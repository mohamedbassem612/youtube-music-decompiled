package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Uri;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pac implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pac(atxv atxvVar, tsl tslVar, aqi aqiVar, tsi tsiVar, tsk tskVar, int i, int i2) {
        this.$cid = i2;
        this.c = atxvVar;
        this.b = tslVar;
        this.f = aqiVar;
        this.e = tsiVar;
        this.d = tskVar;
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x03ba, code lost:
    
        if ((r6 instanceof defpackage.pla) == false) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [agsj] */
    /* JADX WARN: Type inference failed for: r0v4, types: [agsj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [qbh] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pac.run():void");
    }

    public pac(lcz lczVar, int i, String str, Object obj, Object obj2, Object obj3, int i2) {
        this.$cid = i2;
        this.a = i;
        this.c = str;
        this.e = obj;
        this.d = obj2;
        this.b = obj3;
        this.f = lczVar;
    }

    public /* synthetic */ pac(pad padVar, String str, int i, PersistableBundle persistableBundle, JobService jobService, JobParameters jobParameters, int i2) {
        this.$cid = i2;
        this.b = padVar;
        this.c = str;
        this.a = i;
        this.d = persistableBundle;
        this.e = jobService;
        this.f = jobParameters;
    }

    public /* synthetic */ pac(vib vibVar, Uri uri, byte[] bArr, Uri uri2, int i, sxu sxuVar, int i2) {
        this.$cid = i2;
        this.b = vibVar;
        this.f = uri;
        this.c = bArr;
        this.e = uri2;
        this.a = i;
        this.d = sxuVar;
    }
}
