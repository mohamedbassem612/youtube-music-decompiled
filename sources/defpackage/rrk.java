package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrk implements wmd {
    public final AtomicBoolean a;
    private final tqj b;
    private final avmm c;

    public rrk(axfd axfdVar, tqj tqjVar) {
        axfdVar.getClass();
        tqjVar.getClass();
        this.b = tqjVar;
        this.a = new AtomicBoolean(false);
        avmm avmmVar = new avmm();
        this.c = avmmVar;
        avmmVar.c(axfdVar.l().al(new jqi(new rri(this, 0), 9), new jqi(rrj.a, 10)));
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.EXPERIMENTAL_SIGNALS_REQUEST_CONTEXT;
    }

    @Override // defpackage.wmd
    public final wkt b() {
        return wkt.EXPERIMENTAL_SIGNALS_REQUEST_CONTEXT;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ ListenableFuture c(wmc wmcVar, Executor executor) {
        return zik.ck(this, wmcVar, executor);
    }

    @Override // defpackage.wmd
    public final InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        g(aihfVarCreateBuilder);
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (InnertubeContext$InnerTubeContext) aihnVarBuild;
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        EnumSet enumSetOf = EnumSet.of(wku.b);
        enumSetOf.getClass();
        return enumSetOf;
    }

    @Override // defpackage.wmd
    public final boolean f() {
        return true;
    }

    @Override // defpackage.wmd
    public final void g(aihf aihfVar) {
        aihfVar.getClass();
        int i = tqr.a;
        if (this.b.k(1073829118) && this.a.get()) {
            aihf aihfVarCreateBuilder = InnertubeContext$ClientInfo.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihf aihfVarCreateBuilder2 = aiwj.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            aiwj aiwjVar = (aiwj) aihfVarCreateBuilder2.instance;
            aiwjVar.b |= 1;
            aiwjVar.c = true;
            aihn aihnVarBuild = aihfVarCreateBuilder2.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo.Z = (aiwj) aihnVarBuild;
            innertubeContext$ClientInfo.d |= 268435456;
            aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
            aihnVarBuild2.getClass();
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = InnertubeContext$InnerTubeContext.a;
            innertubeContext$InnerTubeContext.c = (InnertubeContext$ClientInfo) aihnVarBuild2;
            innertubeContext$InnerTubeContext.b |= 1;
        }
    }

    @Override // defpackage.wmd
    public final /* synthetic */ void h(aihf aihfVar, String str) {
        g(aihfVar);
    }
}
