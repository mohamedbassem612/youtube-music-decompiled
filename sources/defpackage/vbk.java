package defpackage;

import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.AssetDetail;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbk {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/selection/innertube/XenoAssetRetrieverImpl");
    public final zvl b;
    private final Executor c;
    private final Executor d;
    private final uju e;
    private final Map f;
    private final Map g;
    private final vxz h;
    private final aend i;

    public vbk(Executor executor, Executor executor2, aend aendVar, uju ujuVar, vxz vxzVar, Map map, Map map2, zvl zvlVar) {
        this.c = executor;
        this.d = executor2;
        this.i = aendVar;
        this.e = ujuVar;
        this.h = vxzVar;
        this.f = map;
        this.g = map2;
        this.b = zvlVar;
    }

    private final ListenableFuture c(AssetDetail assetDetail, uzz uzzVar) {
        aend aendVar = this.i;
        wqd wqdVarD = aendVar.d();
        wqdVarD.e(assetDetail);
        wqdVarD.a = uzzVar.i;
        wqdVarD.F();
        wqdVarD.m();
        return aendVar.g(wqdVarD, this.c);
    }

    public final ListenableFuture a(AssetDetail assetDetail, uzz uzzVar) {
        this.e.a().isPresent();
        return c(assetDetail, uzzVar);
    }

    public final ListenableFuture b(uzz uzzVar) {
        aihf aihfVarCreateBuilder = AssetDetail.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        AssetDetail assetDetail = (AssetDetail) aihfVarCreateBuilder.instance;
        String str = uzzVar.a;
        str.getClass();
        assetDetail.b |= 1;
        assetDetail.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        AssetDetail assetDetail2 = (AssetDetail) aihfVarCreateBuilder.instance;
        int i = uzzVar.h;
        if (i == 0) {
            throw null;
        }
        assetDetail2.d = i - 1;
        assetDetail2.b |= 4;
        Optional optional = uzzVar.d;
        int i2 = 10;
        urh urhVar = new urh(aihfVarCreateBuilder, i2);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) urhVar.a;
            aihfVar.copyOnWrite();
            AssetDetail assetDetail3 = (AssetDetail) aihfVar.instance;
            assetDetail3.b |= 32;
            assetDetail3.e = (aigj) obj;
        }
        AssetDetail assetDetail4 = (AssetDetail) aihfVarCreateBuilder.build();
        ListenableFuture listenableFutureA = this.h.l(122, 45833044L, false) ? Looper.myLooper() == Looper.getMainLooper() ? a(assetDetail4, uzzVar) : ahno.aq(new gmf(this, assetDetail4, uzzVar, 14), this.d) : c(assetDetail4, uzzVar);
        agjz agjzVar = new agjz(4);
        agke agkeVar = uzzVar.e;
        int size = agkeVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ajgi ajgiVar = (ajgi) agkeVar.get(i3);
            vba vbaVar = (vba) this.g.get(ajgh.a(ajgiVar.b));
            if (vbaVar == null) {
                return ahng.m(new IllegalStateException("No asset parallel data request factory found for type: ".concat(String.valueOf(String.valueOf(ajgh.a(ajgiVar.b))))));
            }
            if (vbaVar.a() == null) {
                return ahng.m(new IllegalStateException("AssetParallelDataRequest is empty for type: ".concat(String.valueOf(String.valueOf(ajgh.a(ajgiVar.b))))));
            }
            vbb vbbVar = (vbb) this.f.get(ajgh.a(ajgiVar.b));
            if (vbbVar == null) {
                return ahng.m(new IllegalStateException("No asset parallel data service found for type: ".concat(String.valueOf(String.valueOf(ajgh.a(ajgiVar.b))))));
            }
            agjzVar.h(vbbVar.a());
        }
        ListenableFuture listenableFutureK = ahng.k(agjzVar.g());
        taf.j(listenableFutureK, new roc(this, 9));
        taf.j(listenableFutureA, new roc(this, i2));
        return ahno.ax(listenableFutureA, listenableFutureK).k(new ium(listenableFutureA, uzzVar, listenableFutureK, 18, (char[]) null), this.c);
    }
}
