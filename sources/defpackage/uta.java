package defpackage;

import android.util.Size;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uta implements usx {
    private final Size a;

    public uta(Size size) {
        this.a = size;
    }

    @Override // defpackage.usx
    public final auhs a(auhs auhsVar) {
        auhn auhnVar = auhn.a;
        aihf aihfVarCreateBuilder = auhnVar.createBuilder();
        Size size = this.a;
        int width = size.getWidth();
        aihfVarCreateBuilder.copyOnWrite();
        auhn auhnVar2 = (auhn) aihfVarCreateBuilder.instance;
        auhnVar2.b |= 1;
        auhnVar2.c = width;
        int height = size.getHeight();
        aihfVarCreateBuilder.copyOnWrite();
        auhn auhnVar3 = (auhn) aihfVarCreateBuilder.instance;
        auhnVar3.b |= 2;
        auhnVar3.d = height;
        auhn auhnVar4 = (auhn) aihfVarCreateBuilder.build();
        boolean z = auhsVar.j;
        boolean z2 = !z;
        auhn auhnVar5 = auhsVar.i;
        if (auhnVar5 == null) {
            auhnVar5 = auhnVar;
        }
        boolean zEquals = auhnVar5.equals(auhnVar4);
        if (z && zEquals) {
            return auhsVar;
        }
        agkz agkzVar = (agkz) Collection.EL.stream(usj.f(auhsVar)).map(new ush(6)).collect(aghu.b);
        auhn auhnVar6 = auhsVar.i;
        if (auhnVar6 != null) {
            auhnVar = auhnVar6;
        }
        agke agkeVar = (agke) Collection.EL.stream(auhsVar.d).map(new nyw(z2, agkzVar, new Size(auhnVar.c, auhnVar.d), 3)).map(new ush(7)).collect(aghu.a);
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        auhsVar2.b |= 8;
        auhsVar2.j = true;
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).d = auhs.emptyProtobufList();
        auhqVar.b(agkeVar);
        auhqVar.copyOnWrite();
        auhs auhsVar3 = (auhs) auhqVar.instance;
        auhnVar4.getClass();
        auhsVar3.i = auhnVar4;
        auhsVar3.b |= 4;
        return (auhs) auhqVar.build();
    }
}
