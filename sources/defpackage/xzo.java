package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzo implements Supplier {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public xzo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        if (this.$cid != 0) {
            aihf aihfVarCreateBuilder = amxd.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amxd amxdVar = (amxd) aihfVarCreateBuilder.instance;
            amxdVar.c = ((amyt) this.a).e;
            amxdVar.b |= 2;
            return aihfVarCreateBuilder;
        }
        aihf aihfVarCreateBuilder2 = amxw.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amxw amxwVar = (amxw) aihfVarCreateBuilder2.instance;
        amxwVar.b |= 1;
        amxwVar.c = (String) this.a;
        aihfVarCreateBuilder2.copyOnWrite();
        amxw amxwVar2 = (amxw) aihfVarCreateBuilder2.instance;
        amxwVar2.d = 2;
        amxwVar2.b |= 2;
        return aihfVarCreateBuilder2;
    }
}
