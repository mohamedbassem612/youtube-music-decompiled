package defpackage;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrb implements wmd {
    private static final agkz a = agkz.t("player", "get_watch", "reel/reel_item_watch", "reel/reel_watch_sequence", "player/ad_break");
    private final abmt b;
    private final dov c;

    public abrb(dov dovVar, abmt abmtVar) {
        this.c = dovVar;
        this.b = abmtVar;
    }

    private final void i(aihf aihfVar) {
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        dov dovVar = this.c;
        aihf builder = defaultInstance.toBuilder();
        Boolean bool = Boolean.TRUE;
        zis zisVar = zis.a;
        bool.booleanValue();
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesA = zjo.a(null, (zjr) dovVar.a, zisVar, true, zjb.c, zjb.a, zjb.b);
        builder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.instance;
        mediaCapabilitiesOuterClass$MediaCapabilitiesA.getClass();
        innertubeContext$ClientInfo.Y = mediaCapabilitiesOuterClass$MediaCapabilitiesA;
        innertubeContext$ClientInfo.d |= 67108864;
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder.build();
        innertubeContext$ClientInfo2.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
        innertubeContext$InnerTubeContext.b |= 1;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ wkt a() {
        return wkt.NOT_ASYNC;
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
    public final /* synthetic */ InnertubeContext$InnerTubeContext d(wmc wmcVar) {
        return zik.cl(this, wmcVar);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ EnumSet e() {
        return EnumSet.of(wku.a, wku.b, wku.c, wku.d);
    }

    @Override // defpackage.wmd
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.wmd
    public final /* synthetic */ void g(aihf aihfVar) {
        throw null;
    }

    @Override // defpackage.wmd
    public final void h(aihf aihfVar, String str) {
        vxz vxzVar = this.b.e;
        if (vxzVar.m(321, 45754085L)) {
            i(aihfVar);
        } else if (vxzVar.m(297, 45719876L) && a.contains(str)) {
            i(aihfVar);
        }
    }
}
