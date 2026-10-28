package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ufp implements ufq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ufr a;

    public /* synthetic */ ufp(ufr ufrVar, int i) {
        this.$cid = i;
        this.a = ufrVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, rbi] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, rbi] */
    @Override // defpackage.ufq
    public final void a(aijp aijpVar) {
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVarCreateBuilder = askf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            askf askfVar = (askf) aihfVarCreateBuilder.instance;
            aijpVar.getClass();
            askfVar.c = aijpVar;
            askfVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            askf askfVar2 = (askf) aihfVarCreateBuilder.instance;
            askfVar2.b |= 4;
            ufr ufrVar = this.a;
            long j = ufrVar.e;
            askfVar2.d = j;
            ufrVar.l(agpi.a);
            saa saaVar = new saa(ufrVar, 15);
            Optional optional = ufrVar.f;
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                Object obj2 = saaVar.a;
                saa saaVar2 = new saa(obj, 16);
                Optional optional2 = ((ufr) obj2).g;
                if (true == optional2.isPresent()) {
                    optional2.get().b((UUID) saaVar2.a);
                }
            }
            agbv agbvVar = ufrVar.b;
            askf askfVar3 = (askf) aihfVarCreateBuilder.build();
            agbvVar.i();
            aigv aigvVar = aigv.a;
            ((ConcurrentHashMap) ufrVar.i.e).remove(Long.valueOf(j));
            return;
        }
        if (i != 1) {
            aihf aihfVarCreateBuilder2 = asjw.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            asjw asjwVar = (asjw) aihfVarCreateBuilder2.instance;
            aijpVar.getClass();
            asjwVar.c = aijpVar;
            asjwVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            asjw asjwVar2 = (asjw) aihfVarCreateBuilder2.instance;
            asjwVar2.b |= 2;
            ufr ufrVar2 = this.a;
            asjwVar2.d = ufrVar2.e;
            asjw asjwVar3 = (asjw) aihfVarCreateBuilder2.build();
            agbv agbvVar2 = ufrVar2.b;
            agbvVar2.i();
            aigv aigvVar2 = aigv.a;
            return;
        }
        aihf aihfVarCreateBuilder3 = askg.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        askg askgVar = (askg) aihfVarCreateBuilder3.instance;
        aijpVar.getClass();
        askgVar.c = aijpVar;
        askgVar.b |= 1;
        ufr ufrVar3 = this.a;
        vca vcaVar = (vca) ((adbm) ufrVar3.i.a).c;
        String strA = vcaVar.a().a();
        if (strA != null) {
            aihfVarCreateBuilder3.copyOnWrite();
            askg askgVar2 = (askg) aihfVarCreateBuilder3.instance;
            askgVar2.b |= 4;
            askgVar2.e = strA;
        }
        String strC = vcaVar.a().c();
        if (strC != null) {
            aihfVarCreateBuilder3.copyOnWrite();
            askg askgVar3 = (askg) aihfVarCreateBuilder3.instance;
            askgVar3.b |= 2;
            askgVar3.d = strC;
        }
        Optional optional3 = ufrVar3.d;
        saa saaVar3 = new saa(aihfVarCreateBuilder3, 14);
        optional3.isPresent();
        Object obj3 = saaVar3.a;
        Object obj4 = optional3.get();
        aihf aihfVar = (aihf) obj3;
        aihfVar.copyOnWrite();
        askg askgVar4 = (askg) aihfVar.instance;
        askgVar4.f = ((apsc) obj4).j;
        askgVar4.b |= 8;
        long j2 = ufrVar3.e;
        aihfVarCreateBuilder3.copyOnWrite();
        askg askgVar5 = (askg) aihfVarCreateBuilder3.instance;
        askgVar5.b |= 32;
        askgVar5.h = j2;
        Optional optional4 = ufrVar3.f;
        sda sdaVar = new sda(ufrVar3, aihfVarCreateBuilder3, 2);
        if (true == optional4.isPresent()) {
            Object obj5 = optional4.get();
            Object obj6 = sdaVar.a;
            Object obj7 = sdaVar.b;
            sda sdaVar2 = new sda(obj6, obj5, 3);
            Optional optional5 = ((ufr) obj6).g;
            if (true == optional5.isPresent()) {
                ?? r2 = optional5.get();
                Object obj8 = sdaVar2.a;
                Object obj9 = sdaVar2.b;
                askh askhVar = ((ufr) obj8).h;
                anck anckVarA = anck.a((askhVar.b == 2 ? (aske) askhVar.c : aske.a).c);
                if (anckVarA == null) {
                    anckVarA = anck.MEDIA_ENGINE_SERVICE_TYPE_UNKNOWN;
                }
                r2.a((UUID) obj9, anckVarA);
            }
            long leastSignificantBits = ((UUID) obj5).getLeastSignificantBits();
            aihf aihfVar2 = (aihf) obj7;
            aihfVar2.copyOnWrite();
            askg askgVar6 = (askg) aihfVar2.instance;
            askgVar6.b |= 64;
            askgVar6.i = leastSignificantBits;
        }
        apsd apsdVar = ufrVar3.c;
        aihfVarCreateBuilder3.copyOnWrite();
        askg askgVar7 = (askg) aihfVarCreateBuilder3.instance;
        askgVar7.g = apsdVar.p;
        askgVar7.b |= 16;
        askh askhVar2 = ufrVar3.h;
        aihfVarCreateBuilder3.copyOnWrite();
        askg askgVar8 = (askg) aihfVarCreateBuilder3.instance;
        askhVar2.getClass();
        askgVar8.j = askhVar2;
        askgVar8.b |= SemanticState.Focused;
        agbv agbvVar3 = ufrVar3.b;
        askg askgVar9 = (askg) aihfVarCreateBuilder3.build();
        agbvVar3.i();
        aigv aigvVar3 = aigv.a;
    }
}
