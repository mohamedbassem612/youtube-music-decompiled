package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkp implements wmd {
    private final agfr a;
    private final Executor b;
    private int c;
    private final vxu d;

    public wkp(agfr agfrVar, vxu vxuVar, Executor executor) {
        this.d = vxuVar;
        this.a = agfrVar;
        this.b = executor;
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.CLIENT_INFO_REQUEST_CONTEXT;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ wkt b() {
        return wkt.UNUSED_1;
    }

    @Override // defpackage.wmd
    public final ListenableFuture c(wmc wmcVar, Executor executor) {
        int i = this.c;
        this.c = i + 1;
        return ahno.ar(ahno.av(this.d.a()).k(new wko(this.a, 0), i == 0 ? this.b : executor), new vxq(5), executor);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        return zik.cl(this, wmcVar);
    }

    @Override // defpackage.wmd
    public final EnumSet e() {
        return EnumSet.of(wku.a);
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
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        agfr agfrVar = this.a;
        aihf builder = defaultInstance.toBuilder();
        builder.mergeFrom((aihn) agfrVar.io());
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.build();
        innertubeContext$ClientInfo.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo;
        innertubeContext$InnerTubeContext.b |= 1;
    }
}
