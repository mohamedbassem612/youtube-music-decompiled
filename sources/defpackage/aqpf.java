package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqpf extends tzk {
    public final aihh a;

    private aqpf() {
        super(null);
        this.a = (aihh) aqpi.b.createBuilder();
    }

    @Override // defpackage.tzk
    /* JADX INFO: renamed from: am, reason: merged with bridge method [inline-methods] */
    public final aqph I(wek wekVar) {
        return new aqph((aqpi) this.a.build(), wekVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void an(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            aqpd aqpdVar = (aqpd) agqsVarListIterator.next();
            aihh aihhVar = this.a;
            aihhVar.copyOnWrite();
            aqpi aqpiVar = (aqpi) aihhVar.instance;
            aihw aihwVar = aqpi.a;
            aqpdVar.getClass();
            aihv aihvVar = aqpiVar.f;
            if (!aihvVar.c()) {
                aqpiVar.f = aihn.mutableCopy(aihvVar);
            }
            aqpiVar.f.h(aqpdVar.k);
        }
    }

    public final void ao(String... strArr) {
        this.a.s(strArr[0]);
    }

    public final void ap(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aihw aihwVar = aqpi.a;
        str.getClass();
        aqpiVar.c |= 8;
        aqpiVar.k = str;
    }

    public final void aq(aqpe aqpeVar) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aihw aihwVar = aqpi.a;
        aqpiVar.h = aqpeVar.o;
        aqpiVar.c |= 4;
    }

    public final void ar(aohx aohxVar) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aihw aihwVar = aqpi.a;
        aqpiVar.m = aohxVar.l;
        aqpiVar.c |= 32;
    }

    public final void as(aqpc aqpcVar) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aihw aihwVar = aqpi.a;
        aqpiVar.e = aqpcVar.i;
        aqpiVar.c |= 2;
    }

    public aqpf(aihh aihhVar) {
        super(null);
        this.a = aihhVar;
    }
}
