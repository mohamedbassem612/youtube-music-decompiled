package defpackage;

import j$.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfi extends vek {
    public static final Function a = new vfg();

    @Override // defpackage.vek
    public final void b(auhs auhsVar, aihf aihfVar) {
        Iterable iterable = (Iterable) Collection.EL.stream(usj.e(auhsVar)).map(new uot(auhsVar, 14)).collect(aghu.a);
        aihfVar.copyOnWrite();
        akqv akqvVar = (akqv) aihfVar.instance;
        akqv akqvVar2 = akqv.a;
        aiie aiieVar = akqvVar.b;
        if (!aiieVar.c()) {
            akqvVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, akqvVar.b);
    }
}
