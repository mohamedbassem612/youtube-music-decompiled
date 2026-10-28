package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubx extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auen auenVar = (auen) obj;
        aihf aihfVarCreateBuilder = andw.a.createBuilder();
        if ((auenVar.b & 1) != 0) {
            String str = auenVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar = (andw) aihfVarCreateBuilder.instance;
            str.getClass();
            andwVar.b |= 1;
            andwVar.c = str;
        }
        if ((auenVar.b & 2) != 0) {
            agdy agdyVar = uet.a;
            audh audhVarA = audh.a(auenVar.d);
            if (audhVarA == null) {
                audhVarA = audh.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
            }
            ancj ancjVar = (ancj) agdyVar.b(audhVarA);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar2 = (andw) aihfVarCreateBuilder.instance;
            andwVar2.d = ancjVar.j;
            andwVar2.b |= 2;
        }
        Iterator it = auenVar.e.iterator();
        while (it.hasNext()) {
            anec anecVar = (anec) uet.b.b((aues) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar3 = (andw) aihfVarCreateBuilder.instance;
            anecVar.getClass();
            aiie aiieVar = andwVar3.e;
            if (!aiieVar.c()) {
                andwVar3.e = aihn.mutableCopy(aiieVar);
            }
            andwVar3.e.add(anecVar);
        }
        if ((auenVar.b & 4) != 0) {
            agdy agdyVar2 = uet.c;
            auer auerVar = auenVar.f;
            if (auerVar == null) {
                auerVar = auer.a;
            }
            aneb anebVar = (aneb) agdyVar2.b(auerVar);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar4 = (andw) aihfVarCreateBuilder.instance;
            anebVar.getClass();
            andwVar4.f = anebVar;
            andwVar4.b |= 4;
        }
        if ((auenVar.b & 8) != 0) {
            agdy agdyVar3 = uet.d;
            audw audwVar = auenVar.g;
            if (audwVar == null) {
                audwVar = audw.a;
            }
            andc andcVar = (andc) agdyVar3.b(audwVar);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar5 = (andw) aihfVarCreateBuilder.instance;
            andcVar.getClass();
            andwVar5.g = andcVar;
            andwVar5.b |= 8;
        }
        if ((auenVar.b & 16) != 0) {
            agdy agdyVar4 = uet.f;
            aueg auegVar = auenVar.h;
            if (auegVar == null) {
                auegVar = aueg.a;
            }
            andn andnVar = (andn) agdyVar4.b(auegVar);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar6 = (andw) aihfVarCreateBuilder.instance;
            andnVar.getClass();
            andwVar6.h = andnVar;
            andwVar6.b |= 16;
        }
        if ((auenVar.b & 32) != 0) {
            agdy agdyVar5 = uet.e;
            auei aueiVar = auenVar.i;
            if (aueiVar == null) {
                aueiVar = auei.a;
            }
            andp andpVar = (andp) agdyVar5.b(aueiVar);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar7 = (andw) aihfVarCreateBuilder.instance;
            andpVar.getClass();
            andwVar7.i = andpVar;
            andwVar7.b |= 32;
        }
        if ((auenVar.b & 64) != 0) {
            agdy agdyVar6 = uet.g;
            aueu aueuVar = auenVar.j;
            if (aueuVar == null) {
                aueuVar = aueu.a;
            }
            aneg anegVar = (aneg) agdyVar6.b(aueuVar);
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar8 = (andw) aihfVarCreateBuilder.instance;
            anegVar.getClass();
            andwVar8.j = anegVar;
            andwVar8.b |= 64;
        }
        if ((auenVar.b & SemanticState.Focused) != 0) {
            long j = auenVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar9 = (andw) aihfVarCreateBuilder.instance;
            andwVar9.b |= SemanticState.Focused;
            andwVar9.k = j;
        }
        if ((auenVar.b & SemanticState.Hidden) != 0) {
            long j2 = auenVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar10 = (andw) aihfVarCreateBuilder.instance;
            andwVar10.b |= SemanticState.Hidden;
            andwVar10.l = j2;
        }
        if ((auenVar.b & SemanticState.LiveRegion) != 0) {
            float f = auenVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar11 = (andw) aihfVarCreateBuilder.instance;
            andwVar11.b |= SemanticState.LiveRegion;
            andwVar11.m = f;
        }
        if ((auenVar.b & SemanticState.ReadOnly) != 0) {
            boolean z = auenVar.n;
            aihfVarCreateBuilder.copyOnWrite();
            andw andwVar12 = (andw) aihfVarCreateBuilder.instance;
            andwVar12.b |= SemanticState.ReadOnly;
            andwVar12.n = z;
        }
        return (andw) aihfVarCreateBuilder.build();
    }
}
