package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abol implements wmd {
    public volatile aigj a;
    public volatile String b;

    public abol(avlh avlhVar, avlh avlhVar2) {
        avlhVar.p().W(new vvb(new abhg(8), 8)).al(new abmm(this, 17), new abeq(16));
        avlhVar2.al(new abmm(this, 18), new abeq(16));
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.CONTEXT_PARAMS;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ wkt b() {
        return wkt.UNUSED_1;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ ListenableFuture c(wmc wmcVar, Executor executor) {
        return zik.ck(this, wmcVar, executor);
    }

    @Override // defpackage.wmd
    public final InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        aigj aigjVar = this.a;
        if (aigjVar == null || aigjVar.E()) {
            return InnertubeContext$InnerTubeContext.getDefaultInstance();
        }
        aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aisj.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aisj aisjVar = (aisj) aihfVarCreateBuilder2.instance;
        aisjVar.b |= 1;
        aisjVar.c = aigjVar;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.instance;
        aisj aisjVar2 = (aisj) aihfVarCreateBuilder2.build();
        aisjVar2.getClass();
        innertubeContext$InnerTubeContext.a();
        innertubeContext$InnerTubeContext.j.add(aisjVar2);
        return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return EnumSet.noneOf(wku.class);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.wmd
    public final void g(aihf aihfVar) {
        throw null;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ void h(aihf aihfVar, String str) {
        aigj aigjVar = this.a;
        if (aigjVar == null || aigjVar.E()) {
            return;
        }
        aihf aihfVarCreateBuilder = aisj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aisj aisjVar = (aisj) aihfVarCreateBuilder.instance;
        aisjVar.b |= 1;
        aisjVar.c = aigjVar;
        aisj aisjVar2 = (aisj) aihfVarCreateBuilder.build();
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = InnertubeContext$InnerTubeContext.a;
        aisjVar2.getClass();
        innertubeContext$InnerTubeContext.a();
        innertubeContext$InnerTubeContext.j.add(aisjVar2);
    }
}
