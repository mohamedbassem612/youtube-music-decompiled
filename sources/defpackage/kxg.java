package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxg implements Runnable {
    private final /* synthetic */ int $cid;
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final Object d;

    public kxg(Context context, GoogleHelp googleHelp, Object obj, long j, int i) {
        this.$cid = i;
        this.a = context;
        this.b = googleHelp;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        List listSingletonList2;
        List listA;
        int i = this.$cid;
        if (i == 0) {
            try {
                kvz kvzVar = new kvz();
                kvzVar.c();
                listSingletonList = ((ixt) this.d).b();
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
                Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            Context context = this.a;
            khn khnVar = kxd.a;
            kxs kxsVar = new kxs(context);
            GoogleHelp googleHelp = this.b;
            long j = this.c;
            knc kncVar = kxsVar.C;
            kxl kxlVar = new kxl(kncVar, ixt.ab(listSingletonList), j, googleHelp);
            kncVar.a(kxlVar);
            krn.a(kxlVar);
            return;
        }
        if (i != 1) {
            try {
                kvz kvzVar2 = new kvz();
                kvzVar2.c();
                listSingletonList2 = a.q((Bundle) ((qcb) this.d).a);
                try {
                    listSingletonList2.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(kvzVar2.a())));
                } catch (UnsupportedOperationException unused2) {
                    ArrayList arrayList2 = new ArrayList(listSingletonList2);
                    arrayList2.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(kvzVar2.a())));
                    listSingletonList2 = arrayList2;
                }
            } catch (Exception e2) {
                Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.", e2);
                listSingletonList2 = Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"));
            }
            Context context2 = this.a;
            khn khnVar2 = kxd.a;
            kxs kxsVar2 = new kxs(context2);
            GoogleHelp googleHelp2 = this.b;
            long j2 = this.c;
            knc kncVar2 = kxsVar2.C;
            kxj kxjVar = new kxj(kncVar2, ixt.ab(listSingletonList2), j2, googleHelp2);
            kncVar2.a(kxjVar);
            krn.a(kxjVar);
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            kvz kvzVar3 = new kvz();
            kvzVar3.c();
            listA = ((ixt) this.d).a();
            File cacheDir = this.a.getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((kvp) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(kvzVar3.a()));
        } catch (Exception e3) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e3);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        Context context3 = this.a;
        kvn kvnVarA = kvn.a(listA);
        khn khnVar3 = kxd.a;
        kxs kxsVar3 = new kxs(context3);
        GoogleHelp googleHelp3 = this.b;
        long j3 = this.c;
        knc kncVar3 = kxsVar3.C;
        kxn kxnVar = new kxn(kncVar3, kvnVarA, bundle, j3, googleHelp3);
        kncVar3.a(kxnVar);
        krn.a(kxnVar);
    }
}
