package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uus implements utv {
    private final /* synthetic */ int $cid;
    private final Object a;

    public uus(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return this.$cid != 0 ? yno.gq(this) : yno.gq(this);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.uub
    public final void c(urz urzVar) {
        if (this.$cid != 0) {
            urzVar.c = agke.B(Comparator$CC.comparingInt(new ddc(10)), this.a);
        } else {
            urzVar.e(((aufa) this.a).e, new ush(11));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) throws utw {
        if (this.$cid == 0) {
            aufa aufaVar = (aufa) this.a;
            if (aufaVar.c == 100) {
                return usj.h(auhsVar, aufaVar);
            }
            throw new utw("CreationAudioSegment must have a UriAudioSource.", this);
        }
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).g = auhs.emptyProtobufList();
        Iterable iterable = (Iterable) Collection.EL.stream(this.a).map(new ush(10)).collect(aghu.a);
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        aiie aiieVar = auhsVar2.g;
        if (!aiieVar.c()) {
            auhsVar2.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, auhsVar2.g);
        return (auhs) auhqVar.build();
    }
}
