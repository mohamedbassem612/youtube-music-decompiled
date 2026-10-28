package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actk {
    public static final /* synthetic */ int b = 0;
    private static final alvt c;
    protected final wjb a;

    static {
        aihh aihhVar = (aihh) alvt.a.createBuilder();
        StreamingDataOuterClass$StreamingData defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        defaultInstance.getClass();
        alvtVar.h = defaultInstance;
        alvtVar.b |= 16;
        c = (alvt) aihhVar.build();
    }

    public actk(wjb wjbVar) {
        this.a = wjbVar;
    }

    public final ListenableFuture a() {
        alvt alvtVar = c;
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        wjgVar.h = this.a;
        wjgVar.b(0L);
        return ahng.n(wjgVar.a());
    }
}
