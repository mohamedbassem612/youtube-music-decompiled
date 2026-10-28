package defpackage;

import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.stream.Collector;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abzk implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abzk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$cid) {
            case 0:
                aihf aihfVarCreateBuilder = ajgs.a.createBuilder();
                aihf aihfVarCreateBuilder2 = ajgr.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ajgr ajgrVar = (ajgr) aihfVarCreateBuilder2.instance;
                ajgrVar.b |= 2;
                abzn abznVar = (abzn) this.a;
                ajgrVar.d = abznVar.e;
                aihfVarCreateBuilder2.copyOnWrite();
                ajgr ajgrVar2 = (ajgr) aihfVarCreateBuilder2.instance;
                ajgrVar2.b |= 1;
                ajgrVar2.c = abznVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                ajgs ajgsVar = (ajgs) aihfVarCreateBuilder.instance;
                ajgr ajgrVar3 = (ajgr) aihfVarCreateBuilder2.build();
                ajgrVar3.getClass();
                ajgsVar.c = ajgrVar3;
                ajgsVar.b = 1;
                return ((ajgs) aihfVarCreateBuilder.build()).toByteString();
            case 1:
                return (ListenableFuture) ((AtomicReference) this.a).get();
            case 2:
                acfd acfdVar = acfg.a;
                return Optional.ofNullable(((acfs) this.a).d());
            case 3:
                ((acfg) this.a).aV();
                return null;
            case 4:
                return Long.valueOf(((acfs) this.a).a.w().f);
            case 5:
                return ((acoi) this.a).t();
            case 6:
                return Boolean.valueOf(((aehd) this.a).o);
            case 7:
                return ((aehd) this.a).s;
            case 8:
                return ((aehd) this.a).p;
            case 9:
                return Integer.valueOf(Build.VERSION.SDK_INT >= 31 ? ((dze) this.a).e() : -1);
            default:
                Collector collector = aghu.a;
                return new agld(this.a);
        }
    }
}
