package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acju implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ acju(ainq ainqVar, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.c = ainqVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        String strAu;
        if (this.$cid != 0) {
            Object obj2 = this.c;
            aihl aihlVar = ainq.b;
            aihf builder = ((aihn) obj2).toBuilder();
            builder.copyOnWrite();
            ainq ainqVar = (ainq) builder.instance;
            ainqVar.c |= 2;
            ainqVar.e = this.a;
            builder.copyOnWrite();
            ainq ainqVar2 = (ainq) builder.instance;
            ainqVar2.c |= 4;
            ainqVar2.f = this.b;
            ((aihh) obj).e(aihlVar, (ainq) builder.build());
            return awmy.a;
        }
        aazq aazqVar = (aazq) obj;
        aazqVar.getClass();
        acip acipVar = aazqVar.b;
        if (acipVar != null && (strAu = acipVar.au()) != null) {
            Object obj3 = this.c;
            acip acipVar2 = this.a ? (acjt) ((ConcurrentHashMap) ((abxu) ((aeod) obj3).c).f).get(strAu) : null;
            if (acipVar2 == null) {
                acip acipVarA = this.b ? ((abvy) ((aeod) obj3).a).a(strAu) : null;
                acipVar2 = acipVarA == null ? acipVar : acipVarA;
            }
            if (acipVar2 != acipVar) {
                return new aazq(acipVar2);
            }
        }
        return aazqVar;
    }

    public /* synthetic */ acju(boolean z, aeod aeodVar, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.c = aeodVar;
        this.b = z2;
    }
}
