package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.common.util.concurrent.SettableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class plj implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ plj(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [com.google.mediapipe.framework.GlSyncToken, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        lpa lpaVarL;
        Account account;
        lpa lpaVarL2;
        Account[] accountArr;
        int length;
        qug qugVar;
        rbo rboVar;
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        SharedPreferences.Editor editorEdit = null;
        Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                ((ahec) this.a).execute(this.b);
                break;
            case 1:
                ((ahec) this.a).execute(this.b);
                break;
            case 2:
                GnpExecutorApiService.b.add(this.b);
                Context context = (Context) this.a;
                Intent intent = new Intent(context, (Class<?>) GnpExecutorApiService.class);
                intent.setAction("ACTION_NEW_TASK");
                context.startService(intent);
                break;
            case 3:
                Object obj = this.b;
                try {
                    try {
                        Context context2 = ((qbt) this.a).a.a;
                        String str = jxs.a;
                        jxz.c(context2, (String) obj);
                        lpaVarL = mda.m(null);
                    } catch (IOException e) {
                        e = e;
                        lpaVarL = mda.l(e);
                    } catch (jxr e2) {
                        e = e2;
                        lpaVarL = mda.l(e);
                    }
                    mda.n(lpaVarL);
                } catch (InterruptedException | ExecutionException e3) {
                    Log.w("ParentToolsAuthTask", "Failed to clear auth token", e3);
                    return;
                }
                break;
            case 4:
                ((qcf) ((qbt) this.a).b.a).g.loadUrl((String) this.b);
                break;
            case 5:
                Object obj2 = this.a;
                try {
                    jya jyaVar = ((qcf) obj2).k;
                    try {
                        lpaVarL2 = mda.m(((kjc) jyaVar.b.io()).j(jyaVar.a));
                        while (true) {
                            if (i2 < length) {
                                Account account2 = accountArr[i2];
                                if (TextUtils.equals(account2.name, ((qcf) obj2).a)) {
                                    account = account2;
                                } else {
                                    i2++;
                                }
                            } else {
                                account = null;
                            }
                        }
                    } catch (RemoteException | kmj | kmk e4) {
                        lpaVarL2 = mda.l(e4);
                    }
                    accountArr = (Account[]) mda.n(lpaVarL2);
                    length = accountArr.length;
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e5);
                } catch (ExecutionException e6) {
                    Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e6);
                }
                if (account != null) {
                    qcf qcfVar = (qcf) obj2;
                    new qbt(qcfVar.getActivity(), account, (String) this.b, new qcb(obj2, objArr == true ? 1 : 0), new qca(obj2, i3), qcfVar.k).run();
                } else {
                    cf activity = ((qcf) obj2).getActivity();
                    if (activity != null) {
                        ((ParentToolsActivity) activity).c(2, "");
                        activity.runOnUiThread(new qca(obj2, i));
                    }
                }
                break;
            case 6:
                int i4 = ((qcp) this.a).a;
                if (i4 != 0) {
                    Process.setThreadPriority(i4);
                }
                this.b.run();
                break;
            case 7:
                ((qhk) this.b).c.d.a(5, ((qci) this.a).a);
                break;
            case 8:
                SharedPreferences sharedPreferences = ((Context) this.a).getSharedPreferences("PhenotypeStickyAccount", 0);
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if ((entry.getValue() instanceof String) && entry.getValue().equals(this.b)) {
                        if (editorEdit == null) {
                            editorEdit = sharedPreferences.edit();
                        }
                        editorEdit.remove(entry.getKey());
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                }
                break;
            case 9:
                try {
                    ahng.v(this.b);
                } catch (Exception e7) {
                    Log.w("FlagStore", "Failed to store account on flag read for: " + ((qmi) this.a).c + " which may lead to stale flags.", e7);
                    return;
                }
                break;
            case 10:
                ((qmi) this.a).b(this.b);
                break;
            case 11:
                qxo qxoVar = (qxo) this.b;
                qul qulVar = qxoVar.b;
                Object obj3 = this.a;
                if (qulVar != null && (qugVar = ((qxm) obj3).h) != null) {
                    tge tgeVarA = quk.a();
                    tgeVarA.c = new quf(5);
                    tgeVarA.b = qxoVar.b;
                    tgeVarA.e = "Internal CAR rendering error";
                    ((rdr) qugVar).D(tgeVarA.e());
                }
                qxm qxmVar = (qxm) obj3;
                int i5 = qxmVar.s - qxoVar.a;
                qxmVar.s = i5;
                if (i5 <= 0) {
                    qxmVar.t = ahbt.b(qxoVar.f);
                    qxmVar.u = ahbt.b(qxoVar.c);
                    boolean z = qxmVar.v;
                    boolean z2 = qxoVar.d;
                    qxmVar.v = z2;
                    if (z2 && !z) {
                        new rbc(qxm.z, rbd.a).a("Renderer ended at %s", qxmVar.u);
                    }
                    if (qxmVar.h()) {
                        qxmVar.c();
                        Duration durationPlusMillis = qxmVar.t.plus(qxmVar.f).plusNanos(1000L).plusMillis(qxmVar.e);
                        while (true) {
                            int i6 = qxmVar.r;
                            agke agkeVar = qxmVar.o;
                            if (i6 < ((agpi) agkeVar).d) {
                                qxl qxlVar = (qxl) agkeVar.get(i6);
                                if (qxlVar.c().compareTo(durationPlusMillis) <= 0) {
                                    qxmVar.r++;
                                    qxmVar.b();
                                    qxlVar.e();
                                    qxmVar.e(qxlVar);
                                    qxmVar.p.add(qxlVar);
                                }
                            }
                        }
                    }
                    SettableFuture settableFuture = qxmVar.x;
                    if (settableFuture != null) {
                        qxmVar.x = null;
                        settableFuture.setFuture(aher.a);
                    }
                }
                break;
            case 12:
                Object obj4 = this.a;
                Object obj5 = this.b;
                rdi rdiVar = (rdi) obj5;
                if (!rdiVar.c.equals(obj4)) {
                    Size size = (Size) obj4;
                    rdiVar.c = size;
                    if (!rdiVar.e()) {
                        try {
                            bvo.o(((rdi) obj5).d, ((rdi) obj5).g, ((rdi) obj5).b, ((Size) obj4).getWidth(), ((Size) obj4).getHeight());
                        } catch (bvn e8) {
                            rbc rbcVar = new rbc(rdi.k, rbd.e);
                            rbcVar.a = e8;
                            rbcVar.c();
                            rbcVar.d("Could not update the output size of the frame rendererer. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(((rfo) obj5).o), Integer.valueOf(size.getWidth()), Integer.valueOf(size.getHeight()));
                            rbcVar.a("Could not update the output size of the frame rendererer.", new Object[0]);
                        }
                        rdiVar.a();
                    }
                }
                break;
            case 13:
                rdi rdiVar2 = (rdi) this.b;
                Surface surface = rdiVar2.e;
                Object obj6 = this.a;
                if (surface != null || !rdiVar2.c.equals(obj6)) {
                    rdiVar2.e = null;
                    rdiVar2.c = (Size) obj6;
                    rdiVar2.b();
                    rdiVar2.h = null;
                }
                break;
            case 14:
                Object obj7 = this.a;
                Optional optional = ((rdr) this.b).D;
                rbj rbjVar = new rbj(obj7, 6);
                if (true == optional.isPresent()) {
                    ((rbs) optional.get()).h((quk) rbjVar.a);
                }
                break;
            case 15:
                rdr rdrVar = (rdr) this.a;
                if (rdrVar.B && (rboVar = rdrVar.w) != null) {
                    rboVar.a(Duration.ofMillis(Instant.now().toEpochMilli()), rdrVar.g.a(), (Duration) this.b);
                    break;
                }
                break;
            case 16:
                ((rfz) this.b).a.a((rfs) this.a);
                break;
            case 17:
                rfx rfxVar = (rfx) this.a;
                long j = rfxVar.c;
                rfy rfyVar = ((rfz) this.b).a;
                rfyVar.d = j;
                rfyVar.e = rfxVar.e;
                rfyVar.f = rfxVar.f;
                Size size2 = rfxVar.a;
                rfyVar.b = size2.getWidth();
                int height = size2.getHeight();
                rfyVar.c = height;
                rfyVar.g = rfxVar.h;
                rfyVar.h = rfxVar.b;
                rfyVar.i = rfxVar.i;
                rgf rgfVar = rfyVar.a;
                if (rgfVar != null) {
                    rgfVar.d(rfyVar.b, height);
                }
                break;
            case 18:
                Size size3 = (Size) this.a;
                ((rgc) this.b).c.d(size3.getWidth(), size3.getHeight());
                break;
            case 19:
                ((rgf) this.b).e((rge) this.a);
                break;
            default:
                ((rhm) this.a).a(this.b);
                break;
        }
    }

    public /* synthetic */ plj(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public plj(Runnable runnable, Context context, int i) {
        this.$cid = i;
        this.b = runnable;
        this.a = context;
    }
}
