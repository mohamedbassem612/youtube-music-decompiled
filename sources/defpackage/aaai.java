package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaai implements wmd {
    private final /* synthetic */ int $cid;
    public final awmd a;
    public final Object b;
    public final Object c;

    public aaai(awmd awmdVar, Context context, vyo vyoVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = context;
        this.c = vyoVar;
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return this.$cid != 0 ? wkt.SIGNALS_REQUEST_CONTEXT : wkt.NOTIFICATIONS_PERMISSIONS_REQUEST;
    }

    @Override // defpackage.wmd
    public final wkt b() {
        return this.$cid != 0 ? wkt.SIGNALS_REQUEST_CONTEXT : wkt.NOTIFICATIONS_PERMISSIONS_REQUEST;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.wmd
    public final ListenableFuture c(wmc wmcVar, Executor executor) {
        if (this.$cid != 0) {
            ListenableFuture listenableFutureC = ((rrh) this.c.io()).c();
            return ahno.av(((vxu) this.b).a(), listenableFutureC).k(new jkb(this, listenableFutureC, 20), executor);
        }
        hld hldVar = (hld) this.a.io();
        return ahno.av(((vyo) this.c).a(), ahng.o(ahno.av(((aaas) hldVar.a.io()).a()).k(new ub(hldVar, 11), MoreExecutors.directExecutor()))).k(new wci(this, hldVar, 16, null), executor);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        return this.$cid != 0 ? zik.cl(this, wmcVar) : zik.cl(this, wmcVar);
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return this.$cid != 0 ? EnumSet.of(wku.a, wku.b) : EnumSet.of(wku.b, wku.d);
    }

    @Override // defpackage.wmd
    public final boolean f() {
        return true;
    }

    @Override // defpackage.wmd
    public final void g(aihf aihfVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [awmd, java.lang.Object] */
    @Override // defpackage.wmd
    public final /* synthetic */ void h(aihf aihfVar, String str) {
        if (this.$cid == 0) {
            aode aodeVar = ((vyo) this.c).b().p;
            if (aodeVar == null) {
                aodeVar = aode.a;
            }
            if (aodeVar.g) {
                hld hldVar = (hld) this.a.io();
                aihf aihfVarCreateBuilder = aocf.a.createBuilder();
                int i = true != hldVar.c((Context) this.b) ? 3 : 2;
                aihfVarCreateBuilder.copyOnWrite();
                aocf aocfVar = (aocf) aihfVarCreateBuilder.instance;
                aocfVar.c = i - 1;
                aocfVar.b |= 1;
                if (hldVar.a() > 0) {
                    long jA = hldVar.a();
                    aihfVarCreateBuilder.copyOnWrite();
                    aocf aocfVar2 = (aocf) aihfVarCreateBuilder.instance;
                    aocfVar2.b |= 2;
                    aocfVar2.d = jA;
                }
                InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
                if (defaultInstance == null) {
                    defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
                }
                aihf builder = defaultInstance.toBuilder();
                builder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.instance;
                aocf aocfVar3 = (aocf) aihfVarCreateBuilder.build();
                aocfVar3.getClass();
                innertubeContext$ClientInfo.U = aocfVar3;
                innertubeContext$ClientInfo.d |= 1048576;
                aihfVar.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder.build();
                innertubeContext$ClientInfo2.getClass();
                innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
                innertubeContext$InnerTubeContext.b |= 1;
                return;
            }
            return;
        }
        vxu vxuVar = (vxu) this.b;
        if ((vxuVar.c().b & 262144) != 0) {
            anim animVar = vxuVar.c().n;
            if (animVar == null) {
                animVar = anim.a;
            }
            int i2 = animVar.b;
            if ((67108864 & i2) != 0 && (i2 & 131072) != 0 && animVar.i && animVar.h) {
                InnertubeContext$ClientInfo defaultInstance2 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
                if (defaultInstance2 == null) {
                    defaultInstance2 = InnertubeContext$ClientInfo.getDefaultInstance();
                }
                awmd awmdVar = this.a;
                aihf builder2 = defaultInstance2.toBuilder();
                aobj aobjVarA = ((rrl) awmdVar.io()).a();
                builder2.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) builder2.instance;
                innertubeContext$ClientInfo3.S = aobjVarA.g;
                innertubeContext$ClientInfo3.d |= 262144;
                aihfVar.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) builder2.build();
                innertubeContext$ClientInfo4.getClass();
                innertubeContext$InnerTubeContext2.c = innertubeContext$ClientInfo4;
                innertubeContext$InnerTubeContext2.b |= 1;
            }
            if (animVar.m && animVar.j) {
                ListenableFuture listenableFutureC = ((rrh) this.c.io()).c();
                if (listenableFutureC.isDone()) {
                    try {
                        agev agevVar = (agev) listenableFutureC.get();
                        if (agevVar.g()) {
                            InnertubeContext$ClientInfo defaultInstance3 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
                            if (defaultInstance3 == null) {
                                defaultInstance3 = InnertubeContext$ClientInfo.getDefaultInstance();
                            }
                            aihf builder3 = defaultInstance3.toBuilder();
                            long jLongValue = ((Long) agevVar.c()).longValue() / 1024;
                            builder3.copyOnWrite();
                            InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) builder3.instance;
                            innertubeContext$ClientInfo5.d |= 524288;
                            innertubeContext$ClientInfo5.T = jLongValue;
                            aihfVar.copyOnWrite();
                            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
                            InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) builder3.build();
                            innertubeContext$ClientInfo6.getClass();
                            innertubeContext$InnerTubeContext3.c = innertubeContext$ClientInfo6;
                            innertubeContext$InnerTubeContext3.b |= 1;
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
        }
    }

    public aaai(awmd awmdVar, awmd awmdVar2, vxu vxuVar, int i) {
        this.$cid = i;
        this.b = vxuVar;
        this.c = awmdVar;
        this.a = awmdVar2;
    }
}
