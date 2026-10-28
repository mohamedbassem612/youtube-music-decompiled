package defpackage;

import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpf implements wmd {
    public xzc a;

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.MDX_INNER_TUBE_CONTEXT;
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
        xzc xzcVar = this.a;
        if (xzcVar == null || xzcVar.b() == 2) {
            return InnertubeContext$InnerTubeContext.getDefaultInstance();
        }
        aihf aihfVarCreateBuilder = InnertubeContext$ClientInfo.a.createBuilder();
        alol alolVarI = i();
        agrx agrxVar = agso.a;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo.o = alolVarI.aO;
        innertubeContext$ClientInfo.b |= 33554432;
        xvr xvrVarJ = xzcVar.j();
        if (xvrVarJ instanceof xvn) {
            xvn xvnVar = (xvn) xvrVarJ;
            String str = xvnVar.e;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
                innertubeContext$ClientInfo2.b |= Integer.MIN_VALUE;
                innertubeContext$ClientInfo2.r = str;
            }
            String str2 = xvnVar.f;
            if (str2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
                innertubeContext$ClientInfo3.c |= 2;
                innertubeContext$ClientInfo3.t = str2;
            }
            String str3 = xvnVar.h;
            if (str3 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
                innertubeContext$ClientInfo4.c |= 64;
                innertubeContext$ClientInfo4.w = str3;
            }
        } else if (xvrVarJ instanceof xvj) {
            CastDevice castDevice = ((xvj) xvrVarJ).a;
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo5.b |= Integer.MIN_VALUE;
            innertubeContext$ClientInfo5.r = "Google Inc.";
            String str4 = castDevice.e;
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo6.c |= 2;
            innertubeContext$ClientInfo6.t = str4;
            String str5 = castDevice.f;
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo7 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo7.c |= 64;
            innertubeContext$ClientInfo7.w = str5;
        }
        aihf aihfVarCreateBuilder2 = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo8 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.build();
        innertubeContext$ClientInfo8.getClass();
        innertubeContext$InnerTubeContext.d = innertubeContext$ClientInfo8;
        innertubeContext$InnerTubeContext.b |= 2;
        return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.build();
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
        xzc xzcVar = this.a;
        if (xzcVar == null || xzcVar.b() == 2) {
            return;
        }
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).d;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        aihf builder = defaultInstance.toBuilder();
        alol alolVarI = i();
        agrx agrxVar = agso.a;
        builder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.instance;
        innertubeContext$ClientInfo.o = alolVarI.aO;
        innertubeContext$ClientInfo.b |= 33554432;
        xvr xvrVarJ = xzcVar.j();
        if (xvrVarJ instanceof xvn) {
            xvn xvnVar = (xvn) xvrVarJ;
            String str2 = xvnVar.e;
            if (str2 != null) {
                builder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder.instance;
                innertubeContext$ClientInfo2.b |= Integer.MIN_VALUE;
                innertubeContext$ClientInfo2.r = str2;
            }
            String str3 = xvnVar.f;
            if (str3 != null) {
                builder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) builder.instance;
                innertubeContext$ClientInfo3.c |= 2;
                innertubeContext$ClientInfo3.t = str3;
            }
            String str4 = xvnVar.h;
            if (str4 != null) {
                builder.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) builder.instance;
                innertubeContext$ClientInfo4.c |= 64;
                innertubeContext$ClientInfo4.w = str4;
            }
        } else if (xvrVarJ instanceof xvj) {
            CastDevice castDevice = ((xvj) xvrVarJ).a;
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) builder.instance;
            innertubeContext$ClientInfo5.b |= Integer.MIN_VALUE;
            innertubeContext$ClientInfo5.r = "Google Inc.";
            String str5 = castDevice.e;
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) builder.instance;
            innertubeContext$ClientInfo6.c |= 2;
            innertubeContext$ClientInfo6.t = str5;
            String str6 = castDevice.f;
            builder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo7 = (InnertubeContext$ClientInfo) builder.instance;
            innertubeContext$ClientInfo7.c |= 64;
            innertubeContext$ClientInfo7.w = str6;
        }
        InnertubeContext$ClientInfo innertubeContext$ClientInfo8 = (InnertubeContext$ClientInfo) builder.build();
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        innertubeContext$ClientInfo8.getClass();
        innertubeContext$InnerTubeContext.d = innertubeContext$ClientInfo8;
        innertubeContext$InnerTubeContext.b |= 2;
    }

    final alol i() {
        xzc xzcVar = this.a;
        String strV = null;
        if (xzcVar != null && xzcVar.b() != 2) {
            strV = xzcVar.v();
        }
        if ("tvlite".equals(strV)) {
            return alol.TVLITE;
        }
        if ("xbox".equals(strV)) {
            return alol.XBOX;
        }
        return (xzcVar == null || !xzcVar.am()) ? alol.TVHTML5 : alol.TVHTML5_AUDIO;
    }
}
