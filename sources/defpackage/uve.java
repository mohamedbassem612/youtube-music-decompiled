package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uve extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uve(long j) {
        aihl aihlVar = augp.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        augp augpVar = (augp) obj;
        if (augpVar == null) {
            return null;
        }
        aihf builder = augpVar.toBuilder();
        builder.getClass();
        atqo.z(builder);
        builder.copyOnWrite();
        ((augp) builder.instance).c = augp.emptyProtobufList();
        atqo.z(builder);
        aiie aiieVar = augpVar.c;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aiieVar) {
            if (((augo) obj2).b != this.a) {
                arrayList.add(obj2);
            }
        }
        List listAp = atqq.ap(arrayList);
        builder.copyOnWrite();
        augp augpVar2 = (augp) builder.instance;
        aiie aiieVar2 = augpVar2.c;
        if (!aiieVar2.c()) {
            augpVar2.c = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(listAp, augpVar2.c);
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (augp) aihnVarBuild;
    }
}
