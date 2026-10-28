package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ufo implements ufq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ufo(ufr ufrVar, Object obj, int i) {
        this.$cid = i;
        this.b = ufrVar;
        this.a = obj;
    }

    @Override // defpackage.ufq
    public final void a(aijp aijpVar) {
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVarCreateBuilder = askd.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            askd askdVar = (askd) aihfVarCreateBuilder.instance;
            aijpVar.getClass();
            askdVar.c = aijpVar;
            askdVar.b |= 1;
            andh andhVar = (andh) rbh.c.b(((quk) this.b).e);
            aihfVarCreateBuilder.copyOnWrite();
            askd askdVar2 = (askd) aihfVarCreateBuilder.instance;
            andhVar.getClass();
            askdVar2.d = andhVar;
            askdVar2.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            askd askdVar3 = (askd) aihfVarCreateBuilder.instance;
            askdVar3.b |= 4;
            ufr ufrVar = (ufr) this.a;
            askdVar3.e = ufrVar.e;
            askd askdVar4 = (askd) aihfVarCreateBuilder.build();
            agbv agbvVar = ufrVar.b;
            agbvVar.i();
            aigv aigvVar = aigv.a;
            return;
        }
        if (i == 1) {
            aihf aihfVarCreateBuilder2 = aski.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar = (aski) aihfVarCreateBuilder2.instance;
            aijpVar.getClass();
            askiVar.c = aijpVar;
            askiVar.b |= 1;
            apsh apshVar = (apsh) this.a;
            aigu aiguVar = apshVar.e;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar2 = (aski) aihfVarCreateBuilder2.instance;
            aiguVar.getClass();
            askiVar2.f = aiguVar;
            askiVar2.b |= 8;
            aigu aiguVar2 = apshVar.c;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar3 = (aski) aihfVarCreateBuilder2.instance;
            aiguVar2.getClass();
            askiVar3.d = aiguVar2;
            askiVar3.b |= 2;
            aigu aiguVar3 = apshVar.d;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar4 = (aski) aihfVarCreateBuilder2.instance;
            aiguVar3.getClass();
            askiVar4.e = aiguVar3;
            askiVar4.b |= 4;
            aiie aiieVar = apshVar.f;
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar5 = (aski) aihfVarCreateBuilder2.instance;
            aiie aiieVar2 = askiVar5.g;
            if (!aiieVar2.c()) {
                askiVar5.g = aihn.mutableCopy(aiieVar2);
            }
            Object obj = this.b;
            aifs.addAll(aiieVar, askiVar5.g);
            aihfVarCreateBuilder2.copyOnWrite();
            aski askiVar6 = (aski) aihfVarCreateBuilder2.instance;
            askiVar6.b |= 16;
            ufr ufrVar2 = (ufr) obj;
            askiVar6.h = ufrVar2.e;
            aski askiVar7 = (aski) aihfVarCreateBuilder2.build();
            agbv agbvVar2 = ufrVar2.b;
            agbvVar2.i();
            aigv aigvVar2 = aigv.a;
            return;
        }
        if (i == 2) {
            aihf aihfVarCreateBuilder3 = asju.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            asju asjuVar = (asju) aihfVarCreateBuilder3.instance;
            aijpVar.getClass();
            asjuVar.c = aijpVar;
            asjuVar.b |= 1;
            ando andoVar = (ando) uey.d.b(this.a);
            aihfVarCreateBuilder3.copyOnWrite();
            asju asjuVar2 = (asju) aihfVarCreateBuilder3.instance;
            andoVar.getClass();
            asjuVar2.d = andoVar;
            asjuVar2.b |= 2;
            aihfVarCreateBuilder3.copyOnWrite();
            asju asjuVar3 = (asju) aihfVarCreateBuilder3.instance;
            asjuVar3.b |= 4;
            ufr ufrVar3 = (ufr) this.b;
            asjuVar3.e = ufrVar3.e;
            asju asjuVar4 = (asju) aihfVarCreateBuilder3.build();
            agbv agbvVar3 = ufrVar3.b;
            agbvVar3.i();
            aigv aigvVar3 = aigv.a;
            return;
        }
        if (i != 3) {
            Object obj2 = this.a;
            agke agkeVarN = agke.n(((asjv) obj2).d);
            ufr ufrVar4 = (ufr) this.b;
            ufrVar4.l(agkeVarN);
            aihf builder = ((aihn) obj2).toBuilder();
            builder.copyOnWrite();
            asjv asjvVar = (asjv) builder.instance;
            aijpVar.getClass();
            asjvVar.c = aijpVar;
            asjvVar.b |= 1;
            builder.copyOnWrite();
            asjv asjvVar2 = (asjv) builder.instance;
            asjvVar2.b |= 4;
            asjvVar2.e = ufrVar4.e;
            asjv asjvVar3 = (asjv) builder.build();
            agbv agbvVar4 = ufrVar4.b;
            agbvVar4.i();
            aigv aigvVar4 = aigv.a;
            return;
        }
        aihf aihfVarCreateBuilder4 = asjy.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        asjy asjyVar = (asjy) aihfVarCreateBuilder4.instance;
        aijpVar.getClass();
        asjyVar.c = aijpVar;
        asjyVar.b |= 1;
        saa saaVar = new saa(aihfVarCreateBuilder4, 17);
        Optional optional = (Optional) this.a;
        if (true == optional.isPresent()) {
            Object obj3 = optional.get();
            Object obj4 = saaVar.a;
            long jLongValue = ((Long) obj3).longValue();
            aihf aihfVar = (aihf) obj4;
            aihfVar.copyOnWrite();
            asjy asjyVar2 = (asjy) aihfVar.instance;
            asjyVar2.b |= 2;
            asjyVar2.d = jLongValue;
        }
        Object obj5 = this.b;
        aihfVarCreateBuilder4.copyOnWrite();
        asjy asjyVar3 = (asjy) aihfVarCreateBuilder4.instance;
        asjyVar3.b |= 4;
        ufr ufrVar5 = (ufr) obj5;
        asjyVar3.e = ufrVar5.e;
        asjy asjyVar4 = (asjy) aihfVarCreateBuilder4.build();
        agbv agbvVar5 = ufrVar5.b;
        agbvVar5.i();
        aigv aigvVar5 = aigv.a;
    }

    public /* synthetic */ ufo(ufr ufrVar, quk qukVar, int i) {
        this.$cid = i;
        this.a = ufrVar;
        this.b = qukVar;
    }
}
