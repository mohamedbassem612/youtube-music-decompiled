package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvx implements Runnable {
    private final /* synthetic */ int $cid;
    private final long a;
    private final Object b;
    private final Object c;

    public kvx(Context context, ixt ixtVar, long j, int i) {
        this.$cid = i;
        this.b = context;
        this.c = ixtVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        List listA;
        int i = this.$cid;
        if (i == 0) {
            try {
                kvz kvzVar = new kvz();
                kvzVar.c();
                listSingletonList = ((ixt) this.c).b();
                if (listSingletonList == null) {
                    listSingletonList = new ArrayList(1);
                }
                try {
                    listSingletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(kvzVar.a())));
                } catch (UnsupportedOperationException unused) {
                    ArrayList arrayList = new ArrayList(listSingletonList);
                    arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(kvzVar.a())));
                    listSingletonList = arrayList;
                }
            } catch (Exception e) {
                Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            Object obj = this.b;
            khn khnVar = kvj.a;
            new lmm((Context) obj, (char[]) null).g(ixt.ab(listSingletonList), this.a);
            return;
        }
        if (i != 1) {
            if (((awjj) this.b).c) {
                return;
            }
            long jD = awjj.d(TimeUnit.MILLISECONDS);
            long j = this.a;
            if (j > jD) {
                try {
                    Thread.sleep(j - jD);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    atqp.n(e2);
                    return;
                }
            }
            if (((awjj) this.b).c) {
                return;
            }
            this.c.run();
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            kvz kvzVar2 = new kvz();
            kvzVar2.c();
            listA = ((ixt) this.c).a();
            File cacheDir = ((Context) this.b).getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((kvp) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(kvzVar2.a()));
        } catch (Exception e3) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e3);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        long j2 = this.a;
        Object obj2 = this.b;
        kvn kvnVarA = kvn.a(listA);
        khn khnVar2 = kvj.a;
        new lmm((Context) obj2, (char[]) null).f(kvnVarA, bundle, j2);
    }

    public kvx(Runnable runnable, awjj awjjVar, long j, int i) {
        this.$cid = i;
        this.c = runnable;
        this.b = awjjVar;
        this.a = j;
    }
}
