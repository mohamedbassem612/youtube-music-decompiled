package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uva extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uva(long j) {
        aihl aihlVar = aufz.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufz aufzVar = (aufz) obj;
        if (aufzVar == null) {
            return null;
        }
        aihf builder = aufzVar.toBuilder();
        builder.getClass();
        atqn.o(builder);
        builder.copyOnWrite();
        ((aufz) builder.instance).c = aufz.emptyProtobufList();
        atqn.o(builder);
        aiie aiieVar = aufzVar.c;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aiieVar) {
            if (((aufy) obj2).b != this.a) {
                arrayList.add(obj2);
            }
        }
        List listAp = atqq.ap(arrayList);
        builder.copyOnWrite();
        aufz aufzVar2 = (aufz) builder.instance;
        aiie aiieVar2 = aufzVar2.c;
        if (!aiieVar2.c()) {
            aufzVar2.c = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(listAp, aufzVar2.c);
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (aufz) aihnVarBuild;
    }
}
