package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvd extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uvd(long j) {
        aihl aihlVar = augl.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        augl auglVar = (augl) obj;
        if (auglVar == null) {
            return null;
        }
        aihf builder = auglVar.toBuilder();
        builder.getClass();
        atqo.B(builder);
        builder.copyOnWrite();
        ((augl) builder.instance).c = augl.emptyProtobufList();
        atqo.B(builder);
        aiie aiieVar = auglVar.c;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aiieVar) {
            if (((augk) obj2).c != this.a) {
                arrayList.add(obj2);
            }
        }
        List listAp = atqq.ap(arrayList);
        builder.copyOnWrite();
        augl auglVar2 = (augl) builder.instance;
        aiie aiieVar2 = auglVar2.c;
        if (!aiieVar2.c()) {
            auglVar2.c = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(listAp, auglVar2.c);
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (augl) aihnVarBuild;
    }
}
