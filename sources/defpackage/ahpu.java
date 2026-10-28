package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.nio.channels.DesugarChannels;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahpu {
    public final Object a;
    public final Object b;

    public ahpu(kmz kmzVar, ahnr ahnrVar, ahrs ahrsVar) {
        this.a = kmzVar;
        kro.l(ahnrVar);
        this.b = ahrsVar;
        if (ahrsVar.a() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public static synchronized ahpu a() {
        return b(ahnr.b());
    }

    public static synchronized ahpu b(ahnr ahnrVar) {
        return (ahpu) ahnrVar.f(ahpu.class);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static ahpu e(Context context) {
        Throwable e;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        FileLock fileLockLock;
        try {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel());
            try {
                fileLockLock = fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
                try {
                    return new ahpu(fileChannelConvertMaybeLegacyFileChannelFromLibrary, fileLockLock);
                } catch (IOException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                        return null;
                    }
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                } catch (Error e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                        return null;
                    }
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                        return null;
                    }
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
            fileLockLock = null;
        }
    }

    public final void c() {
        try {
            ((FileLock) this.a).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized lpa d(String str, String str2, ahrl ahrlVar) {
        lpa lpaVarB;
        Pair pair = new Pair(str, str2);
        ?? r7 = this.b;
        lpaVarB = (lpa) r7.get(pair);
        if (lpaVarB == null) {
            final FirebaseInstanceId firebaseInstanceId = ahrlVar.a;
            String str3 = ahrlVar.b;
            String str4 = ahrlVar.c;
            String str5 = ahrlVar.d;
            final ahrq ahrqVar = ahrlVar.e;
            lpa lpaVarD = ahrn.b(firebaseInstanceId.c.a(str3, str4, str5, new Bundle())).d(firebaseInstanceId.a, new ahsy(firebaseInstanceId, str4, str5, 1));
            lpaVarD.n(new vp(9), new low() { // from class: ahrm
                @Override // defpackage.low
                public final void e(Object obj) {
                    Object obj2 = ((ahud) obj).b;
                    ahrq ahrqVar2 = ahrqVar;
                    if (ahrqVar2 != null) {
                        if (((String) obj2).equals(ahrqVar2.b)) {
                            return;
                        }
                    }
                    Iterator it = firebaseInstanceId.d.iterator();
                    while (it.hasNext()) {
                        ((FirebaseMessaging) ((hhb) it.next()).a).n((String) obj2);
                    }
                }
            });
            lpaVarB = lpaVarD.b(this.a, new ahrp(this, pair, 0));
            r7.put(pair, lpaVarB);
        }
        return lpaVarB;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final bpl f(bpl bplVar) {
        bplVar.getClass();
        return new auoc(this.b, bplVar, (gjd) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized lpa g(String str, ahsx ahsxVar) {
        lpa lpaVarB;
        ?? r0 = this.a;
        lpaVarB = (lpa) r0.get(str);
        if (lpaVarB == null) {
            Object obj = ahsxVar.a;
            Object obj2 = ahsxVar.b;
            Object obj3 = ahsxVar.c;
            final axfd axfdVar = ((FirebaseMessaging) obj).i;
            String str2 = (String) obj2;
            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
            lpaVarB = axfdVar.f().b(Executors.newSingleThreadExecutor(new ktb("Firebase-Messaging-Task", 0)), new loo() { // from class: ahtb
                /* JADX WARN: Type inference failed for: r3v2, types: [ahrw, java.lang.Object] */
                @Override // defpackage.loo
                public final Object a(lpa lpaVar) {
                    Exception excE;
                    if (lpaVar.j() || (excE = lpaVar.e()) == null || TextUtils.isEmpty(excE.getMessage()) || !excE.getMessage().contains("FID_ALREADY_USED:")) {
                        return lpaVar;
                    }
                    axfd axfdVar2 = axfdVar;
                    Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                    axfdVar2.d.f();
                    return axfdVar2.f();
                }
            }).d(((FirebaseMessaging) obj).f, new ahsy(firebaseMessaging, str2, (ahtk) obj3, 0)).b(this.b, new ahrp(this, str, 2));
            r0.put(str, lpaVarB);
        }
        return lpaVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final ListenableFuture h(ahcx ahcxVar, agkz agkzVar) {
        ?? r3;
        final long jB = this.b.b();
        HashSet<afsn> hashSet = new HashSet();
        Iterator it = agkzVar.iterator();
        while (true) {
            r3 = this.a;
            if (!it.hasNext()) {
                break;
            }
            afso afsoVar = (afso) it.next();
            afsoVar.getClass();
            afgi afgiVar = new afgi(afsoVar, 9);
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), new afwh(afty.c(false), afgiVar, 0), 0));
            r3.execute(ahfoVar);
            afjn.d(152, ahfoVar, "Future Monitor failed", new Object[0]);
            hashSet.add(new afsn(afsoVar, ahfoVar));
        }
        long j2 = afwl.a;
        ahfo ahfoVar2 = new ahfo(new afwh(afty.c(false), new afwh(afty.c(false), ahcxVar, 0), 0));
        ahfoVar2.run();
        ahcz ahczVar = new ahcz(afty.c(false), new Callable() { // from class: afsm
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mbc] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Duration.ofMillis(this.b.b.b() - jB);
            }
        }, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahev ahevVar = new ahev(ahczVar);
        ahfoVar2.addListener(ahevVar, executorDirectExecutor);
        int i = 4;
        ahevVar.addListener(new afii(ahevVar, ahfoVar2, i, null), MoreExecutors.directExecutor());
        HashSet hashSet2 = new HashSet();
        for (afsn afsnVar : hashSet) {
            ListenableFuture listenableFutureL = new ahud(new ahek(false, agke.p(new ListenableFuture[]{afsnVar.b, ahevVar, ahfoVar2})), (byte[]) null).l(new afno(afsnVar, ahevVar, i), r3);
            afjn.d(151, listenableFutureL, "Future Monitor failed", new Object[0]);
            hashSet2.add(listenableFutureL);
        }
        return new ahud(new ahek(false, agke.p(new ListenableFuture[]{ahfoVar2, ahng.u(ahng.o(new ahek(false, agke.j(hashSet2)).a(new ahcz(afty.c(false), new okp(14), 1), MoreExecutors.directExecutor())), 10L, TimeUnit.SECONDS, r3)})), (byte[]) null).l(new afwh(afty.c(false), new ojf(ahfoVar2, 17), 0), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awut, java.lang.Object] */
    public final bec i(afqy afqyVar) {
        MessageLite messageLite = afqyVar.c;
        messageLite.getClass();
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        generatedRegistry.getClass();
        bgd bgdVar = new bgd(messageLite, generatedRegistry);
        Optional optional = afqyVar.e;
        optional.getClass();
        bgr bgrVar = (bgr) optional.orElse(null);
        bgz bgzVar = new bgz(afqyVar, this, 8);
        agke agkeVar = afqyVar.b;
        agkeVar.getClass();
        return azt.e(bgdVar, bgrVar, agkeVar, this.b, bgzVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    public final Object j(affd affdVar) {
        Object obj;
        ?? r0 = this.a;
        synchronized (r0) {
            if (!r0.containsKey(affdVar)) {
                hee heeVar = (hee) this.b.io();
                heeVar.b = affdVar;
                r0.put(affdVar, new gkg((ght) heeVar.a, (affd) heeVar.b));
            }
            obj = r0.get(affdVar);
        }
        return obj;
    }

    public final void k(ListenableFuture listenableFuture) {
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        afty.r(false);
        afwj afwjVar = new afwj(this, 1);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), afwjVar, 0)), executorDirectExecutor);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    public final qrx l(afra afraVar, ayq ayqVar) {
        Executor executor = afraVar.g;
        if (executor == null) {
            executor = (Executor) this.a.io();
        }
        Executor executor2 = executor;
        fzs fzsVar = new fzs(this, afraVar, 16, null);
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), fzsVar, 1));
        executor2.execute(ahfoVar);
        qrx qrxVarK = rmp.K(afraVar.a, ahfoVar, afraVar.b, ExtensionRegistryLite.getGeneratedRegistry(), executor2, afraVar.e, ayqVar);
        agke agkeVar = afraVar.d;
        if (!agkeVar.isEmpty()) {
            qrxVarK.b(new qrk(agkeVar, executor2));
        }
        return qrxVarK;
    }

    public ahpu(Context context, kje kjeVar) {
        this.a = context;
        this.b = kjeVar;
    }

    public ahpu(awmd awmdVar, auor auorVar) {
        this.a = awmdVar;
        this.b = auorVar;
    }

    public ahpu(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ahpu(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ahpu() {
        throw null;
    }

    public ahpu(byte[] bArr) {
        this.a = new ConcurrentLinkedQueue();
        this.b = new AtomicLong();
    }

    public ahpu(byte[] bArr, byte[] bArr2) {
        this.a = new Object();
        this.b = new afv();
        new agjq();
    }

    public ahpu(awmd awmdVar) {
        this.a = new HashMap();
        this.b = awmdVar;
    }

    public ahpu(auor auorVar, awut awutVar) {
        auorVar.getClass();
        awutVar.getClass();
        this.a = auorVar;
        this.b = awutVar;
    }

    public ahpu(Executor executor) {
        this.b = new afv();
        this.a = executor;
    }

    public ahpu(Executor executor, byte[] bArr) {
        this.a = new afv();
        this.b = executor;
    }
}
