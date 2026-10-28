package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzw implements wmd {
    public final AtomicBoolean c = new AtomicBoolean(true);
    private final AtomicBoolean d = new AtomicBoolean(true);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public static String i(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), (String) Collection.EL.stream((List) entry.getValue()).sorted().collect(Collectors.joining("|", "[", "]")));
        }
        return (String) Collection.EL.stream(map2.keySet()).sorted().map(new uot(map2, 20)).collect(Collectors.joining(";"));
    }

    @Override // defpackage.wmd
    public final wkt a() {
        return wkt.DATA_PUSH_VERSION_REPORTER_IMPL;
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
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty() && this.b.isEmpty()) {
            return InnertubeContext$InnerTubeContext.getDefaultInstance();
        }
        aihf aihfVarCreateBuilder = InnertubeContext$ClientInfo.a.createBuilder();
        AtomicBoolean atomicBoolean = this.c;
        AtomicBoolean atomicBoolean2 = this.d;
        boolean z = atomicBoolean.get();
        boolean z2 = atomicBoolean2.get();
        if (!concurrentHashMap.isEmpty() && z) {
            aihfVarCreateBuilder.bd(concurrentHashMap.values());
        }
        ConcurrentHashMap concurrentHashMap2 = this.b;
        if (!concurrentHashMap2.isEmpty() && z2) {
            aihfVarCreateBuilder.bc(concurrentHashMap2.values());
        }
        aihf aihfVarCreateBuilder2 = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.build();
        innertubeContext$ClientInfo.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo;
        innertubeContext$InnerTubeContext.b |= 1;
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
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty() && this.b.isEmpty()) {
            return;
        }
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        AtomicBoolean atomicBoolean = this.c;
        AtomicBoolean atomicBoolean2 = this.d;
        aihf builder = defaultInstance.toBuilder();
        boolean z = atomicBoolean.get();
        boolean z2 = atomicBoolean2.get();
        if (!concurrentHashMap.isEmpty() && z) {
            builder.copyOnWrite();
            ((InnertubeContext$ClientInfo) builder.instance).V = InnertubeContext$ClientInfo.emptyProtobufList();
            builder.bd(concurrentHashMap.values());
        }
        ConcurrentHashMap concurrentHashMap2 = this.b;
        if (!concurrentHashMap2.isEmpty() && z2) {
            builder.copyOnWrite();
            ((InnertubeContext$ClientInfo) builder.instance).W = InnertubeContext$ClientInfo.emptyProtobufList();
            builder.bc(concurrentHashMap2.values());
        }
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder.build();
        innertubeContext$ClientInfo.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo;
        innertubeContext$InnerTubeContext.b |= 1;
    }
}
