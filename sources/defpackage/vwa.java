package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vwa implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vwa(aajk aajkVar, List list, int i, ug ugVar, int i2) {
        this.$cid = i2;
        this.c = aajkVar;
        this.d = list;
        this.a = i;
        this.b = ugVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.a;
            return ((aaok) this.b).u((ajgq) this.c, this.d, i2);
        }
        if (i == 1) {
            gzb gzbVarD = ((gzc) aguu.aw(((gzd) this.b).b, gzc.class, (affd) obj)).d();
            final AtomicInteger atomicInteger = new AtomicInteger();
            tpq tpqVar = gzbVarD.b;
            final int i3 = this.a;
            Object obj2 = this.c;
            final String str = (String) this.d;
            final aijp aijpVar = (aijp) obj2;
            return afxd.f(tpqVar.b(new agek() { // from class: gza
                @Override // defpackage.agek
                public final Object apply(Object obj3) {
                    ailr ailrVar = (ailr) obj3;
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ailrVar.b);
                    String str2 = str;
                    aile aileVar = aile.a;
                    aile aileVar2 = (aile) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap, str2, aileVar);
                    aijp aijpVar2 = aileVar2.d;
                    if (aijpVar2 == null) {
                        aijpVar2 = aijp.a;
                    }
                    aijp aijpVar3 = aijpVar;
                    int i4 = 0;
                    int i5 = aijpVar2.b == aijpVar3.b ? aileVar2.c : 0;
                    int i6 = i3;
                    if (i5 >= i6 || i5 < 0) {
                        ((agrc) ((agrc) gzb.a.c()).k("com/google/android/apps/youtube/music/command/store/MusicIterateCommandsCommandHistoryStore", "getAndUpdate", 77, "MusicIterateCommandsCommandHistoryStore.java")).u("Next command index %d is out of bounds.", i5);
                    } else {
                        i4 = i5;
                    }
                    atomicInteger.set(i4);
                    aihf aihfVarCreateBuilder = aileVar.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aile aileVar3 = (aile) aihfVarCreateBuilder.instance;
                    aileVar3.b |= 1;
                    aileVar3.c = (i4 + 1) % i6;
                    aihfVarCreateBuilder.copyOnWrite();
                    aile aileVar4 = (aile) aihfVarCreateBuilder.instance;
                    aijpVar3.getClass();
                    aileVar4.d = aijpVar3;
                    aileVar4.b |= 2;
                    aile aileVar5 = (aile) aihfVarCreateBuilder.build();
                    aihf builder = ailrVar.toBuilder();
                    str2.getClass();
                    aileVar5.getClass();
                    builder.copyOnWrite();
                    ailr ailrVar2 = (ailr) builder.instance;
                    aiip aiipVar = ailrVar2.b;
                    if (!aiipVar.b) {
                        ailrVar2.b = aiipVar.a();
                    }
                    ailrVar2.b.put(str2, aileVar5);
                    return (ailr) builder.build();
                }
            })).g(new gmv(atomicInteger, 5), gzbVarD.c);
        }
        ArrayList arrayList = new ArrayList((Collection) this.d);
        arrayList.removeAll((agke) obj);
        agke agkeVarN = agke.n(arrayList);
        aajk aajkVar = (aajk) this.c;
        aajkVar.b.g(this.a, agkeVarN);
        tc tcVar = new tc(aajkVar.e.y());
        tcVar.b(agkeVarN);
        return ((ug) this.b).c(tcVar.a());
    }

    public /* synthetic */ vwa(aaok aaokVar, ajgq ajgqVar, Map map, int i, int i2) {
        this.$cid = i2;
        this.b = aaokVar;
        this.c = ajgqVar;
        this.d = map;
        this.a = i;
    }

    public /* synthetic */ vwa(gzd gzdVar, String str, aijp aijpVar, int i, int i2) {
        this.$cid = i2;
        this.b = gzdVar;
        this.d = str;
        this.c = aijpVar;
        this.a = i;
    }
}
