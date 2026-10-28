package defpackage;

import android.os.StrictMode;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ConcurrentMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmi {
    public final qkh b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final qnc g;
    public volatile web h;
    public final omj j;
    private final agkz k;
    public static final ruk i = new ruk();
    static final qme a = new qme(new qmd(0), false, false, agpr.a);

    public qmi(qkh qkhVar, qme qmeVar) {
        this.b = qkhVar;
        String strA = qmeVar.a(qkhVar.c);
        this.c = strA;
        this.d = "";
        boolean z = qmeVar.a;
        this.e = z;
        this.f = qmeVar.b;
        boolean z2 = qmeVar.c;
        this.k = qmeVar.d;
        this.h = null;
        this.j = new omj(null, null, null, null);
        this.g = new qnc(qkhVar, strA, "", z);
    }

    public final void a() {
        qnc qncVar = this.g;
        ListenableFuture listenableFutureB = qncVar.b(this.d);
        qmu qmuVar = new qmu(qncVar, 1);
        qkh qkhVar = this.b;
        ahcs.f(listenableFutureB, qmuVar, qkhVar.b()).addListener(new plj(this, listenableFutureB, 10), qkhVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d A[Catch: CancellationException -> 0x0069, CancellationException | ExecutionException -> 0x006b, TryCatch #3 {CancellationException | ExecutionException -> 0x006b, blocks: (B:2:0x0000, B:4:0x0017, B:11:0x0023, B:13:0x002d, B:15:0x0039, B:19:0x0045, B:21:0x0049, B:6:0x001b, B:24:0x0066), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[Catch: CancellationException -> 0x0069, CancellationException | ExecutionException -> 0x006b, TRY_LEAVE, TryCatch #3 {CancellationException | ExecutionException -> 0x006b, blocks: (B:2:0x0000, B:4:0x0017, B:11:0x0023, B:13:0x002d, B:15:0x0039, B:19:0x0045, B:21:0x0049, B:6:0x001b, B:24:0x0066), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    public final /* synthetic */ void b(ListenableFuture listenableFuture) {
        web webVar;
        qmy qmyVar;
        try {
            qnd qndVar = (qnd) ahng.v(listenableFuture);
            web webVar2 = new web(qndVar, new qnb(6, 2, false));
            boolean z = this.f;
            if (z || (webVar = this.h) == null) {
                synchronized (this) {
                    if (!z) {
                        webVar = this.h;
                        if (webVar != null) {
                            if (!aguu.q(webVar.c, webVar2.c)) {
                                qmyVar = (qmy) this.b.d.io();
                                if (qmyVar != null) {
                                    qmyVar.a();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    this.h = webVar2;
                    this.j.X();
                }
            } else if (!aguu.q(webVar.c, webVar2.c)) {
                qmyVar = (qmy) this.b.d.io();
                if (qmyVar != null) {
                    qmyVar.a();
                    return;
                }
                return;
            }
            if (this.f) {
                qkh qkhVar = this.b;
                ahbz.e(qkhVar.e().z(qndVar.c), Throwable.class, new onn(this, 3), qkhVar.b());
            }
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof SecurityException) {
                return;
            }
            Log.w("FlagStore", "Unable to update local snapshot for " + this.c + ", may result in stale flags.", e);
        }
    }

    public final void c() {
        ListenableFuture listenableFutureZ;
        web webVarD = d();
        Object obj = webVarD.g;
        qkh qkhVar = this.b;
        qmz qmzVarC = qkhVar.f.c(this.e);
        if (qmzVarC.j) {
            String str = (String) obj;
            if (ahno.aa(str) && !qmzVarC.i) {
                ListenableFuture listenableFuture = aher.a;
                return;
            }
            aihf aihfVarCreateBuilder = qkq.a.createBuilder();
            Object obj2 = webVarD.e;
            aihf aihfVarCreateBuilder2 = qkp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            qkp qkpVar = (qkp) aihfVarCreateBuilder2.instance;
            qnb qnbVar = (qnb) obj2;
            qkpVar.c = qnbVar.b - 2;
            int i2 = 1;
            qkpVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            qkp qkpVar2 = (qkp) aihfVarCreateBuilder2.instance;
            qkpVar2.d = qnbVar.c - 2;
            qkpVar2.b |= 2;
            qkp qkpVar3 = (qkp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            qkq qkqVar = (qkq) aihfVarCreateBuilder.instance;
            qkpVar3.getClass();
            qkqVar.d = qkpVar3;
            qkqVar.b |= 2;
            if (!ahno.aa(str)) {
                aihfVarCreateBuilder.copyOnWrite();
                qkq qkqVar2 = (qkq) aihfVarCreateBuilder.instance;
                obj.getClass();
                qkqVar2.b |= 1;
                qkqVar2.c = str;
            }
            if (qmzVarC.i) {
                String str2 = this.c;
                aihfVarCreateBuilder.copyOnWrite();
                qkq qkqVar3 = (qkq) aihfVarCreateBuilder.instance;
                str2.getClass();
                qkqVar3.b |= 4;
                qkqVar3.e = str2;
            }
            kjc kjcVarE = qkhVar.e();
            qkq qkqVar4 = (qkq) aihfVarCreateBuilder.build();
            Object obj3 = kjcVarE.a;
            listenableFutureZ = kjc.A(((llq) obj3).b(qkqVar4).b(MoreExecutors.directExecutor(), new ahrp(obj3, qkqVar4, i2)));
        } else {
            String str3 = (String) obj;
            if (ahno.aa(str3)) {
                ListenableFuture listenableFuture2 = aher.a;
                return;
            }
            listenableFutureZ = qkhVar.e().z(str3);
        }
        idm idmVar = new idm(this, webVarD, 10);
        ahey aheyVarB = qkhVar.b();
        ahbx ahbxVar = new ahbx(listenableFutureZ, qkt.class, idmVar);
        listenableFutureZ.addListener(ahbxVar, MoreExecutors.c(aheyVarB, ahbxVar));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x01ce, TryCatch #1 {all -> 0x01ce, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0027, B:15:0x0034, B:17:0x0048, B:19:0x004e, B:21:0x0054, B:23:0x005e, B:24:0x0078, B:26:0x0095, B:28:0x009f, B:29:0x00ad, B:30:0x00c1, B:32:0x00c7, B:34:0x00e1, B:36:0x00e9, B:38:0x00f4, B:39:0x00f8, B:41:0x0104, B:51:0x0142, B:42:0x010b, B:43:0x0112, B:45:0x011b, B:46:0x0121, B:48:0x0128, B:50:0x013a, B:49:0x012f, B:54:0x014a, B:56:0x0154, B:57:0x0162, B:59:0x016e, B:61:0x0176, B:63:0x0185, B:72:0x01a5, B:66:0x018a, B:68:0x0192, B:70:0x01a1, B:18:0x004c, B:73:0x01b3, B:75:0x01b7, B:77:0x01c1, B:80:0x01c6, B:81:0x01c9, B:82:0x01ca, B:8:0x000d), top: B:91:0x0005, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final web d() {
        Object obj;
        qmb[] qmbVarArr;
        qmb[] qmbVarArr2;
        web webVar = this.h;
        if (webVar == null) {
            synchronized (this) {
                try {
                    webVar = this.h;
                    if (webVar == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        try {
                            web webVarE = this.g.e();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            Object obj2 = webVarE.e;
                            int i2 = ((qnb) obj2).c - 2;
                            if (i2 != 15 && i2 != 16) {
                                qkh qkhVar = this.b;
                                qnf qnfVar = qkhVar.f;
                                int i3 = 1;
                                if (mef.h(qnfVar.c)) {
                                    long j = qnfVar.a().g;
                                    TimeUnit timeUnit = TimeUnit.HOURS;
                                    if (j + 86400000 < System.currentTimeMillis()) {
                                        qnfVar.d(true);
                                    } else {
                                        ListenableFuture listenableFuture = aher.a;
                                    }
                                } else {
                                    ListenableFuture listenableFuture2 = aher.a;
                                }
                                if (webVarE.h() && ((String) webVarE.g).isEmpty()) {
                                    qkhVar.b().execute(new qca(this, 9));
                                    webVarE = new web(qnd.a, (qnb) obj2);
                                } else {
                                    qkhVar.b().execute(new mbo(this, 12));
                                    axfd axfdVar = qkhVar.i;
                                    Object obj3 = webVarE.f;
                                    agkz agkzVar = this.k;
                                    String str = this.c;
                                    if (!agkzVar.isEmpty() && !((AtomicBoolean) axfdVar.c).getAndSet(true)) {
                                        kjc.a().a.add(0, new omj(axfdVar));
                                    }
                                    byte[] bArrG = ((aigj) obj3).G();
                                    ConcurrentMap.EL.compute(axfdVar.a, str, new adtf(bArrG, i3));
                                    Iterator it = agkzVar.iterator();
                                    while (it.hasNext()) {
                                        AtomicReference atomicReference = (AtomicReference) axfdVar.b.putIfAbsent((String) it.next(), new AtomicReference(new qmb(str, bArrG)));
                                        if (atomicReference != null) {
                                            do {
                                                obj = atomicReference.get();
                                                if (obj instanceof qmb) {
                                                    qmb qmbVar = (qmb) obj;
                                                    String str2 = qmbVar.a;
                                                    if (str.equals(str2)) {
                                                        qmbVar.b(bArrG);
                                                        break;
                                                    }
                                                    qmb qmbVar2 = new qmb(str, bArrG);
                                                    qmbVarArr2 = str.compareTo(str2) < 0 ? new qmb[]{qmbVar2, qmbVar} : new qmb[]{qmbVar, qmbVar2};
                                                } else {
                                                    qmb[] qmbVarArr3 = (qmb[]) obj;
                                                    int iBinarySearch = Arrays.binarySearch(qmbVarArr3, str);
                                                    if (iBinarySearch >= 0) {
                                                        qmbVarArr3[iBinarySearch].b(bArrG);
                                                        break;
                                                    }
                                                    int i4 = ~iBinarySearch;
                                                    int length = qmbVarArr3.length;
                                                    int i5 = length + 1;
                                                    int i6 = length - i4;
                                                    if (i6 == 0) {
                                                        qmbVarArr = (qmb[]) Arrays.copyOf(qmbVarArr3, i5);
                                                    } else {
                                                        qmb[] qmbVarArr4 = new qmb[i5];
                                                        System.arraycopy(qmbVarArr3, 0, qmbVarArr4, 0, i4);
                                                        System.arraycopy(qmbVarArr3, i4, qmbVarArr4, i4 + 1, i6);
                                                        qmbVarArr = qmbVarArr4;
                                                    }
                                                    qmbVarArr[i4] = new qmb(str, bArrG);
                                                    qmbVarArr2 = qmbVarArr;
                                                }
                                            } while (!a.av(atomicReference, obj, qmbVarArr2));
                                        }
                                    }
                                    if (!this.d.equals("")) {
                                        qkhVar.b().execute(new qca(this, 10));
                                    }
                                    qnc qncVar = this.g;
                                    qnf qnfVar2 = qncVar.a.f;
                                    boolean z = qncVar.d;
                                    ahnm ahnmVar = ahnm.FILE;
                                    if (z) {
                                        qlg qlgVarB = qnfVar2.b();
                                        if (qlgVarB.e && new aihx(qlgVarB.i, qlg.a).contains(ahnmVar) && !qlgVarB.n) {
                                            qkhVar.b().execute(new mbo(this, 13));
                                        }
                                    } else {
                                        qlf qlfVarA = qnfVar2.a();
                                        if (qlfVarA.e && new aihx(qlfVarA.j, qlf.a).contains(ahnmVar) && !qlfVarA.o) {
                                            qkhVar.b().execute(new mbo(this, 13));
                                        }
                                    }
                                }
                            }
                            if (!this.f || ((qnb) webVarE.e).c != 17) {
                                this.h = webVarE;
                            }
                            webVar = webVarE;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return webVar;
    }
}
