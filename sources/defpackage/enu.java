package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class enu {
    private final eom A;
    private ExecutorService B;
    private final ExecutorService C;
    private final Long D;
    public final Context d;
    public final eod e;
    public boolean f;
    public volatile eny h;
    public final List i;
    public final String j;
    public final agfx k;
    public volatile epv l;
    public volatile aerq m;
    public final acih n;
    private final String o;
    private final String p;
    private volatile enx q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final boolean z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler c = new Handler(Looper.getMainLooper());
    public int g = 0;

    public enu(String str, acih acihVar, Context context, eom eomVar, ExecutorService executorService, ent entVar) {
        ListenableFuture listenableFutureM;
        agpr agprVar = agpr.a;
        this.i = new ArrayList();
        this.D = Long.valueOf(new Random().nextLong());
        this.k = agdd.a;
        this.j = str;
        this.o = "9.2.0";
        String str2 = null;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
        }
        this.p = str2;
        this.C = executorService;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        aihf aihfVarCreateBuilder = aiof.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar = (aiof) aihfVarCreateBuilder.instance;
        aiofVar.b |= 1;
        aiofVar.c = "9.2.0";
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aiof aiofVar2 = (aiof) aihfVarCreateBuilder.instance;
            aiofVar2.b |= 2;
            aiofVar2.d = str2;
        }
        String packageName = applicationContext.getPackageName();
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar3 = (aiof) aihfVarCreateBuilder.instance;
        packageName.getClass();
        aiofVar3.b |= 4;
        aiofVar3.e = packageName;
        long jLongValue = this.D.longValue();
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar4 = (aiof) aihfVarCreateBuilder.instance;
        aiofVar4.b |= 16;
        aiofVar4.g = jLongValue;
        boolean z = entVar.o;
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar5 = (aiof) aihfVarCreateBuilder.instance;
        aiofVar5.b |= 64;
        aiofVar5.i = z;
        int i = Build.VERSION.SDK_INT;
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar6 = (aiof) aihfVarCreateBuilder.instance;
        aiofVar6.b |= SemanticState.Focused;
        aiofVar6.j = i;
        aihfVarCreateBuilder.copyOnWrite();
        aiof aiofVar7 = (aiof) aihfVarCreateBuilder.instance;
        aiofVar7.b |= SemanticState.LiveRegion;
        aiofVar7.l = 1000342775L;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i2 = (int) (memoryInfo.totalMem / 1048576);
                aihfVarCreateBuilder.copyOnWrite();
                aiof aiofVar8 = (aiof) aihfVarCreateBuilder.instance;
                aiofVar8.b |= 16384;
                aiofVar8.q = i2;
                String str3 = Build.BRAND;
                aihfVarCreateBuilder.copyOnWrite();
                aiof aiofVar9 = (aiof) aihfVarCreateBuilder.instance;
                str3.getClass();
                aiofVar9.b |= SemanticState.ReadOnly;
                aiofVar9.m = str3;
                String str4 = Build.MODEL;
                aihfVarCreateBuilder.copyOnWrite();
                aiof aiofVar10 = (aiof) aihfVarCreateBuilder.instance;
                str4.getClass();
                aiofVar10.b |= SemanticState.Modal;
                aiofVar10.n = str4;
                String str5 = Build.MANUFACTURER;
                aihfVarCreateBuilder.copyOnWrite();
                aiof aiofVar11 = (aiof) aihfVarCreateBuilder.instance;
                str5.getClass();
                aiofVar11.b |= SemanticState.Obscured;
                aiofVar11.o = str5;
                String str6 = Build.FINGERPRINT;
                aihfVarCreateBuilder.copyOnWrite();
                aiof aiofVar12 = (aiof) aihfVarCreateBuilder.instance;
                str6.getClass();
                aiofVar12.b |= SemanticState.Multiline;
                aiofVar12.p = str6;
            }
        } catch (RuntimeException e) {
            eov.f("BillingClient", "Runtime error while populating device info.", e);
        }
        try {
            int i3 = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionCode;
            aihfVarCreateBuilder.copyOnWrite();
            aiof aiofVar13 = (aiof) aihfVarCreateBuilder.instance;
            aiofVar13.b |= SemanticState.Hidden;
            aiofVar13.k = i3;
        } catch (Throwable th) {
            eov.f("BillingClient", "Error getting app version code.", th);
        }
        eok eokVar = new eok(this.d, (aiof) aihfVarCreateBuilder.build());
        this.e = eokVar;
        if (eomVar == null) {
            eov.e("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.m = new aerq(this.d, eomVar, eokVar);
        this.n = acihVar;
        this.A = eomVar;
        this.d.getPackageName();
        Context context2 = this.d;
        try {
            qkh qkhVarA = qkh.a(context2);
            if (qkhVarA == null) {
                listenableFutureM = aher.a;
            } else {
                listenableFutureM = kjc.A(((llq) qkhVarA.e().a).f(auwo.a(context2), 1, new String[]{"PLAY_BILLING_LIBRARY"}));
            }
        } catch (RuntimeException e2) {
            listenableFutureM = ahng.m(e2);
        }
        ahng.x(listenableFutureM, new adao(1), f());
        agfx agfxVar = entVar.p;
        this.z = entVar.o;
    }

    private final void A(int i, eoh eohVar, long j) {
        try {
            ainy ainyVarB = eoc.b(i, 2, eohVar);
            zj zjVar = new zj();
            zjVar.b = Integer.valueOf(this.g);
            zjVar.a = Long.valueOf(j);
            w(ainyVarB, new eoe(zjVar));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    private final void B(int i, eoh eohVar, long j, boolean z) {
        try {
            ainy ainyVarB = eoc.b(i, 2, eohVar);
            zj zjVar = new zj();
            zjVar.b = Integer.valueOf(this.g);
            zjVar.a = Long.valueOf(j);
            zjVar.c = Boolean.valueOf(z);
            w(ainyVarB, new eoe(zjVar));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    public static eoh d(Exception exc) {
        return exc instanceof DeadObjectException ? eoi.g : eoi.e;
    }

    private final eoh v(int i) {
        boolean z = 1 == i;
        int i2 = eov.a;
        aihf aihfVarCreateBuilder = ainz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ainz ainzVar = (ainz) aihfVarCreateBuilder.instance;
        ainzVar.e = 5;
        ainzVar.b |= 1;
        aihf aihfVarCreateBuilder2 = aiom.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aiom aiomVar = (aiom) aihfVarCreateBuilder2.instance;
        aiomVar.b |= 2;
        aiomVar.c = true;
        aihfVarCreateBuilder2.copyOnWrite();
        aiom aiomVar2 = (aiom) aihfVarCreateBuilder2.instance;
        aiomVar2.b |= 8;
        aiomVar2.e = z;
        aihfVarCreateBuilder2.copyOnWrite();
        aiom aiomVar3 = (aiom) aihfVarCreateBuilder2.instance;
        aiomVar3.b |= 16;
        aiomVar3.f = i;
        aihfVarCreateBuilder.copyOnWrite();
        ainz ainzVar2 = (ainz) aihfVarCreateBuilder.instance;
        aiom aiomVar4 = (aiom) aihfVarCreateBuilder2.build();
        aiomVar4.getClass();
        ainzVar2.d = aiomVar4;
        ainzVar2.c = 3;
        j((ainz) aihfVarCreateBuilder.build());
        return eoi.f;
    }

    private final void w(ainy ainyVar, eoe eoeVar) {
        try {
            this.e.b(ainyVar, eoeVar);
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    private final synchronized void x() {
        ExecutorService executorService = this.B;
        if (executorService != null && executorService != this.C) {
            executorService.shutdownNow();
            this.B = null;
        }
    }

    private final boolean y() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.l != null && this.q != null) {
                z = true;
            }
        }
        return z;
    }

    private final void z(int i, eoh eohVar, String str, long j, boolean z) {
        try {
            int i2 = eoc.a;
            ainy ainyVarC = eoc.c(i, 2, eohVar, str, aioc.BROADCAST_ACTION_UNSPECIFIED);
            zj zjVar = new zj();
            zjVar.b = Integer.valueOf(this.g);
            zjVar.a = Long.valueOf(j);
            zjVar.c = Boolean.valueOf(z);
            w(ainyVarC, new eoe(zjVar));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    public final int a() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public final /* synthetic */ Bundle b(String str, String str2) {
        epv epvVar;
        try {
            synchronized (this.a) {
                epvVar = this.l;
            }
            if (epvVar == null) {
                return eov.h(eoi.g, 119);
            }
            String packageName = this.d.getPackageName();
            Parcel parcelC = epvVar.c();
            parcelC.writeInt(3);
            parcelC.writeString(packageName);
            parcelC.writeString(str);
            parcelC.writeString(str2);
            parcelC.writeString(null);
            Parcel parcelD = epvVar.d(3, parcelC);
            Bundle bundle = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
            parcelD.recycle();
            return bundle;
        } catch (DeadObjectException e) {
            return eov.i(eoi.g, eoc.a(e));
        } catch (Exception e2) {
            return eov.i(eoi.e, eoc.a(e2));
        }
    }

    public final eog c() {
        eof eofVar = new eof();
        eofVar.a = "9.2.0";
        eofVar.b = this.p;
        eofVar.c = this.D.longValue();
        eofVar.d = this.j;
        return new eog(eofVar);
    }

    /* JADX WARN: Code duplicated, block: B:237:0x055c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0560  */
    /* JADX WARN: Code duplicated, block: B:247:0x0583  */
    /* JADX WARN: Code duplicated, block: B:282:0x0567 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [enu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [enu] */
    /* JADX WARN: Type inference failed for: r1v5, types: [enu] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [enu] */
    /* JADX WARN: Type inference failed for: r1v9, types: [enu] */
    /* JADX WARN: Type inference failed for: r30v0, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16, types: [long] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public eoh e(Activity activity, eob eobVar) {
        int i;
        boolean z;
        eoh eohVarJ;
        long j;
        ?? r5;
        Future futureG;
        int iT;
        String string;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        int i2;
        ListenableFuture listenableFutureN;
        ?? r1 = this;
        long jNextLong = new Random().nextLong();
        if (r1.A == null) {
            if (r1.m != null) {
                aerq aerqVar = r1.m;
            }
            eoh eohVar = eoi.m;
            r1.A(12, eohVar, jNextLong);
            return eohVar;
        }
        long j2 = eoj.a;
        int i3 = 1;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j2 = 0;
            }
            if (!r1.z || r1.y()) {
                int i4 = eov.a;
                listenableFutureN = ahng.n(eoi.f);
            } else {
                listenableFutureN = a.bO(new enz(r1, i3));
            }
            int i5 = ((eoh) listenableFutureN.get(j2, TimeUnit.MILLISECONDS)).a;
            if (i5 == 0) {
                int i6 = eov.a;
            } else {
                eov.e("BillingClient", a.bR(i5, "Reconnection failed with result: "));
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            eov.f("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!r1.y()) {
            eoh eohVar2 = eoi.g;
            r1.A(2, eohVar2, jNextLong);
            r1.s(eohVar2);
            return eohVar2;
        }
        synchronized (r1.a) {
            i = r1.q != null ? r1.q.b : 0;
        }
        ArrayList<SkuDetails> arrayList = new ArrayList();
        arrayList.addAll(eobVar.d);
        ?? r9 = eobVar.c;
        SkuDetails skuDetails = (SkuDetails) aguu.J(arrayList, null);
        zi ziVar = (zi) aguu.J(r9, null);
        skuDetails.getClass();
        String strB = skuDetails.b();
        String strD = skuDetails.d();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z = false;
                break;
            }
            boolean zEquals = ((SkuDetails) arrayList.get(i7)).d().equals("subs");
            i7++;
            if (zEquals) {
                z = true;
                break;
            }
        }
        agke agkeVar = (agke) r9;
        agqs agqsVarListIterator = agkeVar.listIterator(0);
        if (agqsVarListIterator.hasNext()) {
            throw null;
        }
        boolean z4 = 1 == i;
        if (!z || r1.f) {
            boolean z5 = z4;
            long j3 = jNextLong;
            if (((isw) eobVar.b).a == null && !eobVar.a) {
                ?? r14 = eobVar.c;
                if (r14 != 0 && ((agpi) r14).d > 0) {
                    throw null;
                }
            } else if (!r1.r) {
                eov.e("BillingClient", "Current client doesn't support extra params for buy intent.");
                eohVarJ = eoi.d;
                r1.B(18, eohVarJ, j3, z5);
                r1.s(eohVarJ);
            }
            if (arrayList.size() > 1 && !r1.v) {
                eov.e("BillingClient", "Current client doesn't support multi-item purchases.");
                eohVarJ = eoi.j;
                r1.B(19, eohVarJ, j3, z5);
                r1.s(eohVarJ);
            } else if (r9.isEmpty() || r1.w) {
                agqs agqsVarListIterator2 = agkeVar.listIterator(0);
                if (agqsVarListIterator2.hasNext()) {
                    throw null;
                }
                if (!((agke) eobVar.c).isEmpty()) {
                    throw null;
                }
                eoh eohVar3 = eoi.a;
                if (r1.r) {
                    eog eogVarC = r1.c();
                    boolean z6 = r1.s && r1.n != null;
                    r1.d.getPackageName();
                    Bundle bundle = new Bundle();
                    eov.g(bundle, eogVarC);
                    bundle.putLong("billingClientTransactionId", j3);
                    if (!TextUtils.isEmpty(eobVar.b())) {
                        bundle.putString("oldSkuPurchaseToken", eobVar.b());
                    }
                    if (!TextUtils.isEmpty(eobVar.a())) {
                        bundle.putString("oldSkuPurchaseId", eobVar.a());
                    }
                    if (z6) {
                        bundle.putBoolean("enablePendingPurchases", true);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    agqs agqsVarListIterator3 = ((agke) eobVar.c).listIterator(0);
                    if (agqsVarListIterator3.hasNext()) {
                        throw null;
                    }
                    if (!arrayList2.isEmpty()) {
                        aihf aihfVarCreateBuilder = aifq.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aifq aifqVar = (aifq) aihfVarCreateBuilder.instance;
                        aiie aiieVar = aifqVar.b;
                        if (!aiieVar.c()) {
                            aifqVar.b = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(arrayList2, aifqVar.b);
                        bundle.putByteArray("subscriptionProductReplacementParamsList", ((aifq) aihfVarCreateBuilder.build()).toByteArray());
                    }
                    if (arrayList.isEmpty()) {
                        str = strB;
                        str2 = strD;
                        j = j3;
                        z2 = z5;
                        int i8 = ((agpi) r9).d;
                        int i9 = i8 - 1;
                        ArrayList<String> arrayList3 = new ArrayList<>(i9);
                        ArrayList<String> arrayList4 = new ArrayList<>(i9);
                        ArrayList<String> arrayList5 = new ArrayList<>();
                        ArrayList<String> arrayList6 = new ArrayList<>();
                        ArrayList<String> arrayList7 = new ArrayList<>();
                        ArrayList<Integer> arrayList8 = new ArrayList<>();
                        ArrayList<Integer> arrayList9 = new ArrayList<>();
                        new ArrayList();
                        if (i8 > 0) {
                            throw null;
                        }
                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList6);
                        if (!arrayList8.isEmpty()) {
                            bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList8);
                        }
                        if (!arrayList9.isEmpty()) {
                            bundle.putIntegerArrayList("autoPayBalanceThresholdDisplayUnitList", arrayList9);
                        }
                        if (!arrayList5.isEmpty()) {
                            bundle.putStringArrayList("skuDetailsTokens", arrayList5);
                        }
                        if (!arrayList7.isEmpty()) {
                            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList7);
                        }
                        if (!arrayList3.isEmpty()) {
                            bundle.putStringArrayList("additionalSkus", arrayList3);
                            bundle.putStringArrayList("additionalSkuTypes", arrayList4);
                        }
                    } else {
                        ArrayList<String> arrayList10 = new ArrayList<>();
                        ArrayList<String> arrayList11 = new ArrayList<>();
                        ArrayList<String> arrayList12 = new ArrayList<>();
                        ArrayList<Integer> arrayList13 = new ArrayList<>();
                        str = strB;
                        ArrayList<String> arrayList14 = new ArrayList<>();
                        boolean z7 = false;
                        boolean z8 = false;
                        boolean z9 = false;
                        boolean z10 = false;
                        for (SkuDetails skuDetails2 : arrayList) {
                            String str3 = strD;
                            long j4 = j3;
                            if (!skuDetails2.c().isEmpty()) {
                                arrayList10.add(skuDetails2.c());
                            }
                            JSONObject jSONObject = skuDetails2.a;
                            String strOptString = jSONObject.optString("offerIdToken");
                            if (strOptString.isEmpty()) {
                                strOptString = jSONObject.optString("offer_id_token");
                            }
                            String strOptString2 = jSONObject.optString("offer_id");
                            boolean z11 = z5;
                            int iOptInt = jSONObject.optInt("offer_type");
                            String strOptString3 = jSONObject.optString("serializedDocid");
                            arrayList11.add(strOptString);
                            z7 |= !TextUtils.isEmpty(strOptString);
                            arrayList12.add(strOptString2);
                            z8 |= !TextUtils.isEmpty(strOptString2);
                            arrayList13.add(Integer.valueOf(iOptInt));
                            z9 |= iOptInt != 0;
                            z10 |= !TextUtils.isEmpty(strOptString3);
                            arrayList14.add(strOptString3);
                            z5 = z11;
                            strD = str3;
                            j3 = j4;
                        }
                        str2 = strD;
                        j = j3;
                        z2 = z5;
                        if (!arrayList10.isEmpty()) {
                            bundle.putStringArrayList("skuDetailsTokens", arrayList10);
                        }
                        if (z7) {
                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList11);
                        }
                        if (z8) {
                            bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList12);
                        }
                        if (z9) {
                            bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList13);
                        }
                        if (z10) {
                            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList14);
                        }
                        if (arrayList.size() > 1) {
                            ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
                            ArrayList<String> arrayList16 = new ArrayList<>(arrayList.size() - 1);
                            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                                arrayList15.add(((SkuDetails) arrayList.get(i10)).b());
                                arrayList16.add(((SkuDetails) arrayList.get(i10)).d());
                            }
                            bundle.putStringArrayList("additionalSkus", arrayList15);
                            bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                        }
                    }
                    if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") || r1.t) {
                        z5 = z2;
                        if (!TextUtils.isEmpty(skuDetails.a())) {
                            bundle.putString("skuPackageName", skuDetails.a());
                            z3 = true;
                        } else {
                            if (ziVar != null) {
                                throw null;
                            }
                            z3 = false;
                        }
                        if (r1.A != null) {
                            bundle.putBoolean("isFirstPartyPblClient", true);
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            eov.e("BillingClient", "Activity's intent is null.");
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", r1.d.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        if (r1.y) {
                            i2 = 28;
                        } else if (r1.w && !r9.isEmpty()) {
                            i2 = 17;
                        } else if (r1.u && z3) {
                            i2 = 15;
                        } else {
                            i2 = r1.s ? 9 : 6;
                        }
                        r5 = 0;
                        futureG = r1.g(new vvz((enu) r1, i2, str, str2, bundle, 1), 5000L, null, r1.c);
                    } else {
                        eohVarJ = eoi.k;
                        r1.B(21, eohVarJ, j, z2);
                        r1.s(eohVarJ);
                    }
                } else {
                    j = j3;
                    r5 = 0;
                    futureG = r1.g(new egz(r1, strB, strD, 2), 5000L, null, r1.c);
                }
                try {
                    if (futureG == null) {
                        try {
                            eohVarJ = eoi.b;
                            r1 = this;
                            boolean z12 = z5;
                            long j5 = j;
                            try {
                                r1.B(25, eohVarJ, j5, z12);
                                r1.s(eohVarJ);
                            } catch (CancellationException e2) {
                                e = e2;
                                z5 = z12;
                                r5 = j5;
                                eov.f("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.h;
                                r1.z(4, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            } catch (TimeoutException e3) {
                                e = e3;
                                z5 = z12;
                                r5 = j5;
                                eov.f("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.h;
                                r1.z(4, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            } catch (Exception e4) {
                                e = e4;
                                z5 = z12;
                                r5 = j5;
                                eov.f("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.g;
                                r1.z(5, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            }
                        } catch (CancellationException e5) {
                            e = e5;
                            r1 = this;
                            r5 = j;
                        } catch (TimeoutException e6) {
                            e = e6;
                            r1 = this;
                            r5 = j;
                        } catch (Exception e7) {
                            e = e7;
                            r1 = this;
                            r5 = j;
                        }
                    } else {
                        r1 = this;
                        r5 = j;
                        Bundle bundle2 = (Bundle) futureG.get(5000L, TimeUnit.MILLISECONDS);
                        int iA = eov.a(bundle2, "BillingClient");
                        String strD2 = eov.d(bundle2, "BillingClient");
                        if (iA == 0) {
                            ?? intent2 = new Intent((Context) activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", r5);
                            if (r1.A != null) {
                                intent2.putExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", true);
                            }
                            intent2.putExtra("wasServiceAutoReconnected", z5);
                            activity.startActivity(intent2);
                            return eoi.f;
                        }
                        eov.e("BillingClient", a.bR(iA, "Unable to buy item, Error response code: "));
                        eohVarJ = zi.j(iA, 0, strD2);
                        if (bundle2 != null) {
                            try {
                                Object obj = bundle2.get("LOG_REASON");
                                if (obj == null) {
                                    iT = 1;
                                } else if (obj instanceof Integer) {
                                    iT = aext.t(((Integer) obj).intValue());
                                } else {
                                    eov.e("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                    iT = 1;
                                }
                            } catch (Throwable th) {
                                eov.e("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                            }
                            if (iT == 1) {
                                iT = 23;
                            }
                            int i11 = iT;
                            if (bundle2 != null) {
                                try {
                                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                } catch (Throwable th2) {
                                    eov.e("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                                    string = null;
                                }
                            } else {
                                string = null;
                            }
                            try {
                                r1.z(i11, eohVarJ, string, r5, z5);
                                r1.s(eohVarJ);
                            } catch (CancellationException e8) {
                                e = e8;
                                z5 = z5;
                                eov.f("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.h;
                                r1.z(4, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            } catch (TimeoutException e9) {
                                e = e9;
                                z5 = z5;
                                eov.f("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.h;
                                r1.z(4, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            } catch (Exception e10) {
                                e = e10;
                                z5 = z5;
                                eov.f("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                eohVarJ = eoi.g;
                                r1.z(5, eohVarJ, eoc.a(e), r5, z5);
                                r1.s(eohVarJ);
                            }
                        } else {
                            iT = 1;
                            if (iT == 1) {
                                iT = 23;
                            }
                            int i12 = iT;
                            if (bundle2 != null) {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } else {
                                string = null;
                            }
                            r1.z(i12, eohVarJ, string, r5, z5);
                            r1.s(eohVarJ);
                        }
                        eov.f("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        eohVarJ = eoi.h;
                        r1.z(4, eohVarJ, eoc.a(e), r5, z5);
                        r1.s(eohVarJ);
                    }
                } catch (CancellationException e11) {
                    e = e11;
                } catch (TimeoutException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                    eov.f("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    eohVarJ = eoi.g;
                    r1.z(5, eohVarJ, eoc.a(e), r5, z5);
                    r1.s(eohVarJ);
                    return eohVarJ;
                }
            } else {
                eov.e("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                eohVarJ = eoi.l;
                r1.B(20, eohVarJ, j3, z5);
                r1.s(eohVarJ);
            }
        } else {
            eov.e("BillingClient", "Current client doesn't support subscriptions.");
            eohVarJ = eoi.i;
            r1.B(9, eohVarJ, jNextLong, z4);
            r1.s(eohVarJ);
        }
        return eohVarJ;
    }

    public final synchronized ExecutorService f() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.B;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = this.C;
            if (executorServiceNewFixedThreadPool == null) {
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(eov.a, new mdo(1));
            }
            this.B = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    public final Future g(Callable callable, long j, Runnable runnable, Handler handler) {
        try {
            Future futureSubmit = f().submit(callable);
            handler.postDelayed(new dhr((Object) futureSubmit, (Object) runnable, 13, (byte[]) null), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            eov.f("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public void h() {
        ArrayList arrayList;
        try {
            j(eoc.d(12));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
        synchronized (this.a) {
            try {
                if (this.m != null) {
                    aerq aerqVar = this.m;
                    Object obj = aerqVar.f;
                    Context context = aerqVar.a;
                    ((ens) obj).b(context);
                    ((ens) aerqVar.e).b(context);
                    try {
                        int i = eov.a;
                        q();
                    } catch (Throwable th2) {
                        eov.f("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    arrayList = null;
                    try {
                        x();
                    } catch (Throwable th3) {
                        try {
                            eov.f("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            m(3);
                            this.h = null;
                            throw th4;
                        }
                    }
                    m(3);
                    this.h = null;
                } else {
                    int i2 = eov.a;
                    q();
                    arrayList = null;
                    x();
                    m(3);
                    this.h = null;
                }
            } catch (Throwable th5) {
                eov.f("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
        synchronized (this.a) {
            List list = this.i;
            if (!list.isEmpty()) {
                arrayList = new ArrayList(list);
                list.clear();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    ((eny) arrayList.get(i3)).b(eoi.g);
                } catch (Throwable th6) {
                    eov.f("BillingClient", "Exception while calling parked onBillingSetupFinished.", th6);
                }
            }
        }
    }

    public final void i(ainy ainyVar) {
        try {
            eod eodVar = this.e;
            zj zjVar = new zj();
            zjVar.b = Integer.valueOf(this.g);
            eodVar.b(ainyVar, new eoe(zjVar));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    public final void j(ainz ainzVar) {
        try {
            eod eodVar = this.e;
            zj zjVar = new zj();
            zjVar.b = Integer.valueOf(this.g);
            eodVar.c(ainzVar, new eoe(zjVar));
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    public final void k(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    public final void l(int i) {
        this.g = i;
        this.y = i >= 28;
        this.x = i >= 21;
        this.w = i >= 17;
        this.v = i >= 16;
        this.u = i >= 15;
        this.t = i >= 14;
        this.s = i >= 9;
        this.r = i >= 6;
    }

    public final void m(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            int i2 = this.b;
            int i3 = eov.a;
            this.b = i;
        }
    }

    public final void n(int i) {
        if (i != 0) {
            m(0);
            return;
        }
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            m(2);
            aerq aerqVar = this.m != null ? this.m : null;
            if (aerqVar != null) {
                boolean z = this.x;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                aerqVar.c = z;
                Object obj = aerqVar.e;
                Context context = aerqVar.a;
                ((ens) obj).a(context, intentFilter2);
                if (aerqVar.c) {
                    ((ens) aerqVar.f).c(context, intentFilter);
                } else {
                    ((ens) aerqVar.f).a(context, intentFilter);
                }
            }
        }
    }

    public void o(eny enyVar) {
        p(enyVar, 0);
    }

    public final void p(eny enyVar, int i) {
        eoh eohVar;
        eoh eohVarV;
        Object obj = this.a;
        synchronized (obj) {
            if (y()) {
                eohVarV = v(i);
            } else {
                if (eoj.c) {
                    synchronized (obj) {
                        try {
                            if (this.b == 1) {
                                eov.e("BillingClient", "Client is already in the process of connecting to billing service, queuing listener.");
                                this.i.add(enyVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    eohVarV = null;
                } else {
                    if (this.b == 1) {
                        eov.e("BillingClient", "Client is already in the process of connecting to billing service.");
                        eohVar = eoi.c;
                        u(37, eohVar, i);
                    }
                    eohVarV = eohVar;
                }
                if (this.b == 3) {
                    eov.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    eohVar = eoi.g;
                    u(38, eohVar, i);
                } else {
                    m(1);
                    if (i == 0) {
                        this.h = enyVar;
                    }
                    q();
                    int i2 = eov.a;
                    this.q = new enx(this, enyVar, i);
                    enx enxVar = this.q;
                    synchronized (enxVar.c.a) {
                        try {
                            agfp agfpVar = enxVar.a;
                            agfpVar.d();
                            agfpVar.e();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.d.getPackageManager().queryIntentServices(intent, 0);
                    int i3 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        m(0);
                        eoh eohVar2 = eoi.a;
                        u(i3, eohVar2, i);
                        eohVarV = eohVar2;
                    } else {
                        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                        if (resolveInfo.serviceInfo != null) {
                            String str = resolveInfo.serviceInfo.packageName;
                            String str2 = resolveInfo.serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                eov.e("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.o);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        eohVarV = v(i);
                                    } else if (this.b != 1) {
                                        eov.e("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        eohVar = eoi.g;
                                        u(117, eohVar, i);
                                    } else {
                                        enx enxVar2 = this.q;
                                        if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.d.bindService(intent2, enxVar2, 1) : this.d.bindService(intent2, 1, f(), enxVar2)) {
                                            eohVarV = null;
                                        } else {
                                            eov.e("BillingClient", "Connection to Billing service is blocked.");
                                            i3 = 39;
                                            m(0);
                                            eoh eohVar3 = eoi.a;
                                            u(i3, eohVar3, i);
                                            eohVarV = eohVar3;
                                        }
                                    }
                                }
                            }
                        } else {
                            eov.e("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        i3 = 40;
                        m(0);
                        eoh eohVar4 = eoi.a;
                        u(i3, eohVar4, i);
                        eohVarV = eohVar4;
                    }
                }
                eohVarV = eohVar;
            }
        }
        if (eohVarV != null) {
            enyVar.b(eohVarV);
        }
    }

    public final void q() {
        synchronized (this.a) {
            if (this.q != null) {
                try {
                    this.d.unbindService(this.q);
                    this.l = null;
                    this.q = null;
                } catch (Throwable th) {
                    try {
                        eov.f("BillingClient", "There was an exception while unbinding service!", th);
                        this.l = null;
                        this.q = null;
                    } catch (Throwable th2) {
                        this.l = null;
                        this.q = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean r() {
        boolean z;
        synchronized (this.a) {
            z = this.b == 1;
        }
        return z;
    }

    public final void s(eoh eohVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new dhr(this, eohVar, 12));
    }

    public final /* synthetic */ Bundle t(int i, String str, String str2, Bundle bundle) {
        epv epvVar;
        try {
            synchronized (this.a) {
                epvVar = this.l;
            }
            if (epvVar == null) {
                return eov.h(eoi.g, 119);
            }
            String packageName = this.d.getPackageName();
            Parcel parcelC = epvVar.c();
            parcelC.writeInt(i);
            parcelC.writeString(packageName);
            parcelC.writeString(str);
            parcelC.writeString(str2);
            parcelC.writeString(null);
            gdc.c(parcelC, bundle);
            Parcel parcelD = epvVar.d(8, parcelC);
            Bundle bundle2 = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
            parcelD.recycle();
            return bundle2;
        } catch (DeadObjectException e) {
            return eov.i(eoi.g, eoc.a(e));
        } catch (Exception e2) {
            return eov.i(eoi.e, eoc.a(e2));
        }
    }

    public final void u(int i, eoh eohVar, int i2) {
        try {
            aihf builder = eoc.b(i, 6, eohVar).toBuilder();
            aihf aihfVarCreateBuilder = aiom.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aiom aiomVar = (aiom) aihfVarCreateBuilder.instance;
            aiomVar.b |= 8;
            aiomVar.e = 1 == i2;
            aihfVarCreateBuilder.copyOnWrite();
            aiom aiomVar2 = (aiom) aihfVarCreateBuilder.instance;
            aiomVar2.b |= 16;
            aiomVar2.f = i2;
            builder.copyOnWrite();
            ainy ainyVar = (ainy) builder.instance;
            aiom aiomVar3 = (aiom) aihfVarCreateBuilder.build();
            aiomVar3.getClass();
            ainyVar.d = aiomVar3;
            ainyVar.c = 6;
            i((ainy) builder.build());
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }
}
