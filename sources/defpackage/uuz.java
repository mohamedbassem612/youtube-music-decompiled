package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuz extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uuz(long j) {
        aihl aihlVar = aufx.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufx aufxVar = (aufx) obj;
        if (aufxVar == null) {
            return null;
        }
        aihf builder = aufxVar.toBuilder();
        builder.getClass();
        atqn.p(builder);
        builder.copyOnWrite();
        ((aufx) builder.instance).c = aufx.emptyProtobufList();
        atqn.p(builder);
        aiie aiieVar = aufxVar.c;
        aiieVar.getClass();
        ArrayList<aufw> arrayList = new ArrayList();
        for (Object obj2 : aiieVar) {
            if (((aufw) obj2).c != this.a) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
        for (aufw aufwVar : arrayList) {
            if (aufwVar.d == this.a) {
                aufwVar.getClass();
                aihf builder2 = aufwVar.toBuilder();
                builder2.getClass();
                builder2.copyOnWrite();
                aufw aufwVar2 = (aufw) builder2.instance;
                aufwVar2.b &= -3;
                aufwVar2.d = 0L;
                aihn aihnVarBuild = builder2.build();
                aihnVarBuild.getClass();
                aufwVar = (aufw) aihnVarBuild;
            }
            arrayList2.add(aufwVar);
        }
        List listAp = atqq.ap(arrayList2);
        builder.copyOnWrite();
        aufx aufxVar2 = (aufx) builder.instance;
        aufxVar2.a();
        aifs.addAll(listAp, aufxVar2.c);
        aihn aihnVarBuild2 = builder.build();
        aihnVarBuild2.getClass();
        return (aufx) aihnVarBuild2;
    }
}
