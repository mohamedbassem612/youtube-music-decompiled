package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vvo implements wmd {
    private final /* synthetic */ int $cid;
    private final awmd a;

    public vvo(awmd awmdVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return this.$cid != 0 ? wkt.AD_SIGNALS_INNER_TUBE_CONTEXT : wkt.SAFETY_MODE;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ wkt b() {
        return this.$cid != 0 ? wkt.UNUSED_1 : wkt.UNUSED_1;
    }

    @Override // defpackage.wmd
    public final ListenableFuture c(wmc wmcVar, Executor executor) {
        int i = this.$cid;
        awmd awmdVar = this.a;
        if (i == 0) {
            return ahno.ar(((wgb) awmdVar.io()).a(), new sdp(20), executor);
        }
        spr sprVar = (spr) awmdVar.io();
        ListenableFuture listenableFutureA = sprVar.a();
        ListenableFuture listenableFutureB = sprVar.b();
        return ahno.av(listenableFutureA, listenableFutureB).k(new ium(listenableFutureA, sprVar, listenableFutureB, 16, (char[]) null), executor);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        return this.$cid != 0 ? zik.cl(this, wmcVar) : zik.cl(this, wmcVar);
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return this.$cid != 0 ? EnumSet.of(wku.b, wku.c) : EnumSet.of(wku.a);
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
        if (this.$cid == 0) {
            alor alorVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).e;
            if (alorVar == null) {
                alorVar = alor.a;
            }
            awmd awmdVar = this.a;
            aihf builder = alorVar.toBuilder();
            boolean zB = ((wgb) awmdVar.io()).b();
            builder.copyOnWrite();
            alor alorVar2 = (alor) builder.instance;
            alorVar2.b |= 4;
            alorVar2.d = zB;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            alor alorVar3 = (alor) builder.build();
            alorVar3.getClass();
            innertubeContext$InnerTubeContext.e = alorVar3;
            innertubeContext$InnerTubeContext.b |= 4;
            return;
        }
        taq.c();
        spr sprVar = (spr) this.a.io();
        String strE = sprVar.e();
        aloi aloiVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).i;
        if (aloiVar == null) {
            aloiVar = aloi.a;
        }
        aihf builder2 = aloiVar.toBuilder();
        builder2.copyOnWrite();
        ((aloi) builder2.instance).c = aloi.emptyProtobufList();
        aihf aihfVarCreateBuilder = amgu.a.createBuilder();
        String strI = sprVar.i();
        aihfVarCreateBuilder.copyOnWrite();
        amgu amguVar = (amgu) aihfVarCreateBuilder.instance;
        amguVar.b |= 1;
        amguVar.e = strI;
        String strH = sprVar.h();
        aihfVarCreateBuilder.copyOnWrite();
        amgu amguVar2 = (amgu) aihfVarCreateBuilder.instance;
        strH.getClass();
        amguVar2.c = 2;
        amguVar2.d = strH;
        builder2.br(aihfVarCreateBuilder);
        builder2.copyOnWrite();
        aloi aloiVar2 = (aloi) builder2.instance;
        aloiVar2.b |= 16;
        aloiVar2.d = strE;
        boolean zJ = sprVar.j();
        builder2.copyOnWrite();
        aloi aloiVar3 = (aloi) builder2.instance;
        aloiVar3.b |= 64;
        aloiVar3.f = zJ;
        int i = true != strE.equals("00000000-0000-0000-0000-000000000000") ? 6 : 1;
        builder2.copyOnWrite();
        aloi aloiVar4 = (aloi) builder2.instance;
        aloiVar4.e = i - 1;
        aloiVar4.b |= 32;
        Optional optionalC = sprVar.c();
        hkp hkpVar = new hkp(builder2, 8);
        if (true == optionalC.isPresent()) {
            Object obj = optionalC.get();
            aihf aihfVar2 = (aihf) hkpVar.a;
            aihfVar2.copyOnWrite();
            aloi aloiVar5 = (aloi) aihfVar2.instance;
            aloiVar5.b |= SemanticState.Focused;
            aloiVar5.g = (String) obj;
        }
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        aloi aloiVar6 = (aloi) builder2.build();
        aloiVar6.getClass();
        innertubeContext$InnerTubeContext2.i = aloiVar6;
        innertubeContext$InnerTubeContext2.b |= SemanticState.Hidden;
    }
}
