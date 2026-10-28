package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vlp implements wmd {
    private final awmd a;

    public vlp(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.MOBILE_DATA_PLAN_REQUEST_CONTEXT;
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
        awmd awmdVar = this.a;
        vli vliVarA = ((vlo) awmdVar.io()).a();
        String strB = ((vlo) awmdVar.io()).b();
        if (vliVarA == null && strB == null) {
            return InnertubeContext$InnerTubeContext.getDefaultInstance();
        }
        aihf aihfVarCreateBuilder = aniu.a.createBuilder();
        if (vliVarA != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aniu aniuVar = (aniu) aihfVarCreateBuilder.instance;
            aniuVar.b |= 1;
            aniuVar.c = vliVarA.b;
            aihfVarCreateBuilder.copyOnWrite();
            aniu aniuVar2 = (aniu) aihfVarCreateBuilder.instance;
            aniuVar2.b |= 2;
            aniuVar2.d = vliVarA.a;
        }
        if (strB != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aniu aniuVar3 = (aniu) aihfVarCreateBuilder.instance;
            aniuVar3.b |= 4;
            aniuVar3.e = strB;
        }
        aihf aihfVarCreateBuilder2 = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihf aihfVarCreateBuilder3 = InnertubeContext$ClientInfo.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder3.instance;
        aniu aniuVar4 = (aniu) aihfVarCreateBuilder.build();
        aniuVar4.getClass();
        innertubeContext$ClientInfo.L = aniuVar4;
        innertubeContext$ClientInfo.c |= Integer.MIN_VALUE;
        aihfVarCreateBuilder2.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder3.build();
        innertubeContext$ClientInfo2.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
        innertubeContext$InnerTubeContext.b |= 1;
        return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.build();
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return EnumSet.of(wku.b);
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
        awmd awmdVar = this.a;
        vli vliVarA = ((vlo) awmdVar.io()).a();
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        aihf builder = defaultInstance.toBuilder();
        if (vliVarA != null) {
            aniu aniuVar = ((InnertubeContext$ClientInfo) builder.instance).L;
            if (aniuVar == null) {
                aniuVar = aniu.a;
            }
            aihf builder2 = aniuVar.toBuilder();
            builder2.copyOnWrite();
            aniu aniuVar2 = (aniu) builder2.instance;
            aniuVar2.b |= 1;
            aniuVar2.c = vliVarA.b;
            builder2.copyOnWrite();
            aniu aniuVar3 = (aniu) builder2.instance;
            aniuVar3.b |= 2;
            aniuVar3.d = vliVarA.a;
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.instance;
            aniu aniuVar4 = (aniu) builder2.build();
            aniuVar4.getClass();
            innertubeContext$ClientInfo.L = aniuVar4;
            innertubeContext$ClientInfo.c |= Integer.MIN_VALUE;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder.build();
            innertubeContext$ClientInfo2.getClass();
            innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
            innertubeContext$InnerTubeContext.b |= 1;
        }
        String strB = ((vlo) awmdVar.io()).b();
        if (strB != null) {
            aniu aniuVar5 = ((InnertubeContext$ClientInfo) builder.instance).L;
            if (aniuVar5 == null) {
                aniuVar5 = aniu.a;
            }
            aihf builder3 = aniuVar5.toBuilder();
            builder3.copyOnWrite();
            aniu aniuVar6 = (aniu) builder3.instance;
            aniuVar6.b |= 4;
            aniuVar6.e = strB;
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) builder.instance;
            aniu aniuVar7 = (aniu) builder3.build();
            aniuVar7.getClass();
            innertubeContext$ClientInfo3.L = aniuVar7;
            innertubeContext$ClientInfo3.c |= Integer.MIN_VALUE;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) builder.build();
            innertubeContext$ClientInfo4.getClass();
            innertubeContext$InnerTubeContext2.c = innertubeContext$ClientInfo4;
            innertubeContext$InnerTubeContext2.b |= 1;
        }
    }
}
