package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubt extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auej auejVar = (auej) obj;
        aihf aihfVarCreateBuilder = andq.a.createBuilder();
        if ((auejVar.b & 1) != 0) {
            String str = auejVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar = (andq) aihfVarCreateBuilder.instance;
            str.getClass();
            andqVar.b |= 1;
            andqVar.c = str;
        }
        if ((auejVar.b & 2) != 0) {
            aigu aiguVar = auejVar.d;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar2 = (andq) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            andqVar2.d = aiguVar;
            andqVar2.b |= 2;
        }
        if ((auejVar.b & 4) != 0) {
            int i = auejVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar3 = (andq) aihfVarCreateBuilder.instance;
            andqVar3.b |= 4;
            andqVar3.e = i;
        }
        if ((auejVar.b & 8) != 0) {
            int i2 = auejVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar4 = (andq) aihfVarCreateBuilder.instance;
            andqVar4.b |= 8;
            andqVar4.f = i2;
        }
        if ((auejVar.b & 16) != 0) {
            int i3 = auejVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar5 = (andq) aihfVarCreateBuilder.instance;
            andqVar5.b |= 16;
            andqVar5.g = i3;
        }
        if ((auejVar.b & 32) != 0) {
            int i4 = auejVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar6 = (andq) aihfVarCreateBuilder.instance;
            andqVar6.b |= 32;
            andqVar6.h = i4;
        }
        if ((auejVar.b & 64) != 0) {
            int i5 = auejVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar7 = (andq) aihfVarCreateBuilder.instance;
            andqVar7.b |= 64;
            andqVar7.i = i5;
        }
        if ((auejVar.b & SemanticState.Focused) != 0) {
            int i6 = auejVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar8 = (andq) aihfVarCreateBuilder.instance;
            andqVar8.b |= SemanticState.Focused;
            andqVar8.j = i6;
        }
        if ((auejVar.b & SemanticState.Hidden) != 0) {
            int i7 = auejVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar9 = (andq) aihfVarCreateBuilder.instance;
            andqVar9.b |= SemanticState.Hidden;
            andqVar9.k = i7;
        }
        if ((auejVar.b & SemanticState.LiveRegion) != 0) {
            aigu aiguVar2 = auejVar.l;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar10 = (andq) aihfVarCreateBuilder.instance;
            aiguVar2.getClass();
            andqVar10.l = aiguVar2;
            andqVar10.b |= SemanticState.LiveRegion;
        }
        aiie aiieVar = auejVar.m;
        aihfVarCreateBuilder.copyOnWrite();
        andq andqVar11 = (andq) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = andqVar11.m;
        if (!aiieVar2.c()) {
            andqVar11.m = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(aiieVar, andqVar11.m);
        if ((auejVar.b & SemanticState.ReadOnly) != 0) {
            agdy agdyVar = ueq.a;
            audy audyVar = auejVar.n;
            if (audyVar == null) {
                audyVar = audy.a;
            }
            ande andeVar = (ande) agdyVar.b(audyVar);
            aihfVarCreateBuilder.copyOnWrite();
            andq andqVar12 = (andq) aihfVarCreateBuilder.instance;
            andeVar.getClass();
            andqVar12.n = andeVar;
            andqVar12.b |= SemanticState.ReadOnly;
        }
        return (andq) aihfVarCreateBuilder.build();
    }
}
