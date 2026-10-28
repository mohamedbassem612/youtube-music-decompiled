package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Objects;
import j$.util.OptionalInt;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acyv implements wmd {
    public final awmd a;
    private final vyo b;
    private final tqj c;
    private final Map d;
    private final vxz e;

    public acyv(awmd awmdVar, vxz vxzVar, vyo vyoVar, tqj tqjVar) {
        this.a = awmdVar;
        this.e = vxzVar;
        this.b = vyoVar;
        this.c = tqjVar;
        HashMap map = new HashMap();
        Iterator it = vxzVar.f(1, 45726335L, new byte[0]).b.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = ((String) it.next()).split(":", 2);
            if (strArrSplit.length == 2) {
                try {
                    map.put(strArrSplit[1], Integer.valueOf(Integer.parseInt(strArrSplit[0])));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.d = map;
    }

    private final OptionalInt i(String str) {
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            return OptionalInt.of(num.intValue());
        }
        vxz vxzVar = this.e;
        if (vxzVar.l(327, 45718892L, false) && Objects.equals(str, "player")) {
            return OptionalInt.of((int) vxzVar.c(39, 45718893L, 0L));
        }
        return (vxzVar.l(329, 45719163L, false) && Objects.equals(str, "log_event")) ? OptionalInt.of(0) : OptionalInt.empty();
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.ELEMENTS_TEMPLATE_CONTEXT;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ wkt b() {
        return wkt.UNUSED_1;
    }

    @Override // defpackage.wmd
    public final ListenableFuture c(wmc wmcVar, Executor executor) {
        OptionalInt optionalIntI = i(wmcVar.b);
        return aczd.f(this.c) ? ahcs.e(((aczd) this.a.io()).b(optionalIntI, executor), afwl.a(new abzr(16)), executor) : ahno.av(this.b.a()).l(new gmf(this, optionalIntI, executor, 18), executor);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        return zik.cl(this, wmcVar);
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return EnumSet.of(wku.a, wku.c);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ void g(aihf aihfVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:24:0x0097, B:26:0x00a8, B:29:0x00ae, B:31:0x00b6, B:30:0x00b1, B:32:0x00c0), top: B:66:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1 A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:24:0x0097, B:26:0x00a8, B:29:0x00ae, B:31:0x00b6, B:30:0x00b1, B:32:0x00c0), top: B:66:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aunn, java.lang.Object] */
    @Override // defpackage.wmd
    public final void h(aihf aihfVar, String str) {
        agfr agfrVar;
        ListenableFuture listenableFutureD;
        Object obj;
        Object aherVar;
        awmd awmdVar = this.a;
        OptionalInt optionalIntI = i(str);
        aczd aczdVar = (aczd) awmdVar.io();
        aigj aigjVarH = null;
        if (!aczdVar.h(optionalIntI)) {
            ?? r0 = aczdVar.h;
            int i = tqr.a;
            if (r0.k(1073808332)) {
                if (optionalIntI.isPresent() && aczdVar.c().isDone()) {
                    try {
                        ListenableFuture listenableFutureC = aczdVar.c();
                        ahno.R(listenableFutureC.isDone(), "Future was expected to be done: %s", listenableFutureC);
                        byte[] limitedServingContext = ((ResourceLoader) a.i(listenableFutureC)).getLimitedServingContext(optionalIntI.getAsInt());
                        aigj aigjVar = aigj.d;
                        try {
                            aigjVarH = aigj.H(limitedServingContext, 0, limitedServingContext.length);
                        } catch (aiik e) {
                            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                        }
                    } catch (ExecutionException unused) {
                        agfrVar = (agfr) ((AtomicReference) aczdVar.e).get();
                        listenableFutureD = aczdVar.d();
                        if (listenableFutureD.isDone()) {
                            ahno.R(listenableFutureD.isDone(), "Future was expected to be done: %s", listenableFutureD);
                            aigjVarH = (aigj) a.i(listenableFutureD);
                        } else {
                            byte[] servingContext = aczdVar.a().getServingContext();
                            aigj aigjVar2 = aigj.d;
                            aigjVarH = aigj.H(servingContext, 0, servingContext.length);
                            synchronized (aczdVar.a) {
                                obj = aczdVar.e;
                                if (((agfr) ((AtomicReference) obj).get()).equals(agfrVar)) {
                                    if (aigjVarH == null) {
                                        aherVar = aher.a;
                                    } else {
                                        aherVar = new aher(aigjVarH);
                                    }
                                    ((AtomicReference) obj).set(new agfu(aherVar));
                                }
                            }
                        }
                    }
                } else {
                    agfrVar = (agfr) ((AtomicReference) aczdVar.e).get();
                    listenableFutureD = aczdVar.d();
                    if (listenableFutureD.isDone()) {
                        try {
                            ahno.R(listenableFutureD.isDone(), "Future was expected to be done: %s", listenableFutureD);
                            aigjVarH = (aigj) a.i(listenableFutureD);
                        } catch (ExecutionException unused2) {
                        }
                    } else {
                        byte[] servingContext2 = aczdVar.a().getServingContext();
                        aigj aigjVar3 = aigj.d;
                        try {
                            aigjVarH = aigj.H(servingContext2, 0, servingContext2.length);
                            synchronized (aczdVar.a) {
                                obj = aczdVar.e;
                                if (((agfr) ((AtomicReference) obj).get()).equals(agfrVar) && !aczdVar.b) {
                                    if (aigjVarH == null) {
                                        aherVar = aher.a;
                                    } else {
                                        aherVar = new aher(aigjVarH);
                                    }
                                    ((AtomicReference) obj).set(new agfu(aherVar));
                                }
                            }
                        } catch (aiik e2) {
                            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        }
                    }
                }
            } else if (aczdVar.g() && ((AtomicBoolean) aczdVar.f).compareAndSet(false, true)) {
                if (((vxz) aczdVar.j).l(27, 45368905L, false)) {
                    ((adak) aczdVar.g.io()).d();
                } else {
                    aczdVar.e(aczdVar.a());
                    if (optionalIntI.isPresent()) {
                        byte[] limitedServingContext2 = aczdVar.a().getLimitedServingContext(optionalIntI.getAsInt());
                        aigj aigjVar4 = aigj.d;
                        aigjVarH = aigj.H(limitedServingContext2, 0, limitedServingContext2.length);
                    }
                }
                aigjVarH = (aigj) ((AtomicReference) aczdVar.d).get();
            } else if (optionalIntI.isPresent()) {
                byte[] limitedServingContext3 = aczdVar.a().getLimitedServingContext(optionalIntI.getAsInt());
                aigj aigjVar5 = aigj.d;
                try {
                    aigjVarH = aigj.H(limitedServingContext3, 0, limitedServingContext3.length);
                } catch (aiik e3) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
                }
            } else {
                aigjVarH = (aigj) ((AtomicReference) aczdVar.d).get();
            }
        }
        if (aigjVarH != null) {
            InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
            if (defaultInstance == null) {
                defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
            }
            aihf builder = defaultInstance.toBuilder();
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.instance;
            innertubeContext$ClientInfo.d |= 32768;
            innertubeContext$ClientInfo.R = aigjVarH;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder.build();
            innertubeContext$ClientInfo2.getClass();
            innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
            innertubeContext$InnerTubeContext.b |= 1;
        }
    }
}
