package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uce extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auet auetVar = (auet) obj;
        aihf aihfVarCreateBuilder = aned.a.createBuilder();
        if ((auetVar.b & 1) != 0) {
            agdy agdyVar = uey.a;
            audb audbVarA = audb.a(auetVar.c);
            if (audbVarA == null) {
                audbVarA = audb.MEDIA_ENGINE_CLIENT_UNKNOWN;
            }
            apsc apscVar = (apsc) agdyVar.b(audbVarA);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar = (aned) aihfVarCreateBuilder.instance;
            anedVar.c = apscVar.j;
            anedVar.b |= 1;
        }
        if ((auetVar.b & 2) != 0) {
            agdy agdyVar2 = uey.b;
            audc audcVarA = audc.a(auetVar.d);
            if (audcVarA == null) {
                audcVarA = audc.MEDIA_ENGINE_CLIENT_SURFACE_UNKNOWN;
            }
            apsd apsdVar = (apsd) agdyVar2.b(audcVarA);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar2 = (aned) aihfVarCreateBuilder.instance;
            anedVar2.m = apsdVar.p;
            anedVar2.b |= SemanticState.LiveRegion;
        }
        if ((auetVar.b & 4) != 0) {
            agdy agdyVar3 = uey.c;
            audd auddVarA = audd.a(auetVar.e);
            if (auddVarA == null) {
                auddVarA = audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
            }
            ancg ancgVar = (ancg) agdyVar3.b(auddVarA);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar3 = (aned) aihfVarCreateBuilder.instance;
            anedVar3.d = ancgVar.ap;
            anedVar3.b |= 2;
        }
        if ((auetVar.b & 8) != 0) {
            String str = auetVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar4 = (aned) aihfVarCreateBuilder.instance;
            str.getClass();
            anedVar4.b |= 4;
            anedVar4.e = str;
        }
        Iterator it = auetVar.g.iterator();
        while (it.hasNext()) {
            ando andoVar = (ando) uey.d.b((aueh) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar5 = (aned) aihfVarCreateBuilder.instance;
            andoVar.getClass();
            aiie aiieVar = anedVar5.f;
            if (!aiieVar.c()) {
                anedVar5.f = aihn.mutableCopy(aiieVar);
            }
            anedVar5.f.add(andoVar);
        }
        if ((auetVar.b & 16) != 0) {
            agdy agdyVar4 = uey.e;
            auel auelVar = auetVar.h;
            if (auelVar == null) {
                auelVar = auel.a;
            }
            ands andsVar = (ands) agdyVar4.b(auelVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar6 = (aned) aihfVarCreateBuilder.instance;
            andsVar.getClass();
            anedVar6.g = andsVar;
            anedVar6.b |= 8;
        }
        if ((auetVar.b & 32) != 0) {
            agdy agdyVar5 = uey.f;
            auec auecVar = auetVar.i;
            if (auecVar == null) {
                auecVar = auec.a;
            }
            andi andiVar = (andi) agdyVar5.b(auecVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar7 = (aned) aihfVarCreateBuilder.instance;
            andiVar.getClass();
            anedVar7.h = andiVar;
            anedVar7.b |= 16;
        }
        if ((auetVar.b & 64) != 0) {
            String str2 = auetVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar8 = (aned) aihfVarCreateBuilder.instance;
            str2.getClass();
            anedVar8.b |= 32;
            anedVar8.i = str2;
        }
        if ((auetVar.b & SemanticState.Focused) != 0) {
            agdy agdyVar6 = uey.h;
            auea aueaVar = auetVar.k;
            if (aueaVar == null) {
                aueaVar = auea.a;
            }
            andg andgVar = (andg) agdyVar6.b(aueaVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar9 = (aned) aihfVarCreateBuilder.instance;
            andgVar.getClass();
            anedVar9.j = andgVar;
            anedVar9.b |= 64;
        }
        if ((auetVar.b & SemanticState.Hidden) != 0) {
            agdy agdyVar7 = uey.i;
            auem auemVar = auetVar.l;
            if (auemVar == null) {
                auemVar = auem.a;
            }
            andv andvVar = (andv) agdyVar7.b(auemVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar10 = (aned) aihfVarCreateBuilder.instance;
            andvVar.getClass();
            anedVar10.k = andvVar;
            anedVar10.b |= SemanticState.Focused;
        }
        if ((auetVar.b & SemanticState.LiveRegion) != 0) {
            agdy agdyVar8 = uey.g;
            audx audxVar = auetVar.m;
            if (audxVar == null) {
                audxVar = audx.a;
            }
            andd anddVar = (andd) agdyVar8.b(audxVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar11 = (aned) aihfVarCreateBuilder.instance;
            anddVar.getClass();
            anedVar11.l = anddVar;
            anedVar11.b |= SemanticState.Hidden;
        }
        if ((auetVar.b & SemanticState.ReadOnly) != 0) {
            agdy agdyVar9 = uey.j;
            auek auekVar = auetVar.n;
            if (auekVar == null) {
                auekVar = auek.a;
            }
            andr andrVar = (andr) agdyVar9.b(auekVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar12 = (aned) aihfVarCreateBuilder.instance;
            andrVar.getClass();
            anedVar12.n = andrVar;
            anedVar12.b |= SemanticState.ReadOnly;
        }
        if ((auetVar.b & SemanticState.Modal) != 0) {
            agdy agdyVar10 = uey.k;
            audz audzVar = auetVar.o;
            if (audzVar == null) {
                audzVar = audz.a;
            }
            andf andfVar = (andf) agdyVar10.b(audzVar);
            aihfVarCreateBuilder.copyOnWrite();
            aned anedVar13 = (aned) aihfVarCreateBuilder.instance;
            andfVar.getClass();
            anedVar13.o = andfVar;
            anedVar13.b |= SemanticState.Modal;
        }
        return (aned) aihfVarCreateBuilder.build();
    }
}
