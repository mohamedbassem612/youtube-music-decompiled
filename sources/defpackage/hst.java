package defpackage;

import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hst implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ hsu a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hst(hsu hsuVar, aamh aamhVar, anue anueVar, aaew aaewVar, aofa aofaVar, int i) {
        this.$cid = i;
        this.a = hsuVar;
        this.c = aamhVar;
        this.d = anueVar;
        this.b = aaewVar;
        this.e = aofaVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid == 0) {
            aamo aamoVar = (aamo) obj;
            aamn aamnVar = aamn.AUTO_OFFLINE;
            aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
            boolean zContains = this.d.contains(aamoVar.d());
            aihf aihfVarCreateBuilder = aofa.a.createBuilder();
            aofb aofbVar = aofb.OFFLINE_NOW;
            aihfVarCreateBuilder.copyOnWrite();
            aofa aofaVar = (aofa) aihfVarCreateBuilder.instance;
            aofaVar.d = aofbVar.i;
            aofaVar.b |= 4;
            aofa aofaVar2 = (aofa) aihfVarCreateBuilder.build();
            hsu hsuVar = this.a;
            Object obj2 = this.e;
            return hsuVar.c.e(aamoVar, (aamh) this.b, (aohx) this.c, aamnVar, aogfVar, zContains, (byte[]) obj2, aofaVar2);
        }
        aohc aohcVar = (aohc) obj;
        aohb aohbVar = aohcVar.c;
        if (aohbVar == null) {
            aohbVar = aohb.a;
        }
        Object obj3 = this.d;
        aamo aamoVarB = aamo.b(aohbVar);
        anue anueVar = (anue) obj3;
        aohx aohxVarA = aohx.a(anueVar.g);
        if (aohxVarA == null) {
            aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
        }
        aohx aohxVar = aohxVarA;
        aamn aamnVarA = aamn.a(anueVar.i);
        aogf aogfVar2 = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        aohb aohbVar2 = aohcVar.c;
        if (aohbVar2 == null) {
            aohbVar2 = aohb.a;
        }
        Object obj4 = this.e;
        boolean zN = hfn.n((aaew) this.b, aohbVar2.c);
        byte[] bArrG = anueVar.f.G();
        aihf aihfVarCreateBuilder2 = aofa.a.createBuilder();
        aofb aofbVar2 = aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE;
        aihfVarCreateBuilder2.copyOnWrite();
        aofa aofaVar3 = (aofa) aihfVarCreateBuilder2.instance;
        aofaVar3.d = aofbVar2.i;
        aofaVar3.b |= 4;
        aoez aoezVar = ((aofa) obj4).e;
        if (aoezVar == null) {
            aoezVar = aoez.a;
        }
        hsu hsuVar2 = this.a;
        Object obj5 = this.c;
        aihfVarCreateBuilder2.copyOnWrite();
        aofa aofaVar4 = (aofa) aihfVarCreateBuilder2.instance;
        aoezVar.getClass();
        aofaVar4.e = aoezVar;
        aofaVar4.b |= 8;
        return hsuVar2.c.e(aamoVarB, (aamh) obj5, aohxVar, aamnVarA, aogfVar2, zN, bArrG, (aofa) aihfVarCreateBuilder2.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ hst(hsu hsuVar, aamh aamhVar, aohx aohxVar, Set set, byte[] bArr, int i) {
        this.$cid = i;
        this.a = hsuVar;
        this.b = aamhVar;
        this.c = aohxVar;
        this.d = set;
        this.e = bArr;
    }
}
