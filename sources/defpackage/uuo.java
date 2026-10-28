package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuo implements utv {
    private final List a;
    private final Map b;

    public uuo(List list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auhr auhrVar = (auhr) it.next();
            arfu arfuVarA = arfu.a(auhrVar.b);
            if (arfuVarA == null) {
                arfuVarA = arfu.VOLUME_TYPE_UNKNOWN;
            }
            awml awmlVar = new awml(arfuVarA, Float.valueOf(auhrVar.c));
            linkedHashMap.put(awmlVar.a, awmlVar.b);
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhsVar.getClass();
        aiie<aufa> aiieVar = auhsVar.e;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        for (aufa aufaVarH : aiieVar) {
            Float f = (Float) this.b.get(yno.gp(auhsVar, aufaVarH.e));
            if (f != null) {
                aufaVarH.getClass();
                aihf builder = aufaVarH.toBuilder();
                builder.getClass();
                atqo.n(f.floatValue(), builder);
                aufaVarH = atqo.h(builder);
            }
            arrayList.add(aufaVarH);
        }
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).k = auhs.emptyProtobufList();
        List list = this.a;
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        aiie aiieVar2 = auhsVar2.k;
        if (!aiieVar2.c()) {
            auhsVar2.k = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(list, auhsVar2.k);
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).e = auhs.emptyProtobufList();
        auhqVar.a(arrayList);
        aihn aihnVarBuild = auhqVar.build();
        aihnVarBuild.getClass();
        return (auhs) aihnVarBuild;
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
