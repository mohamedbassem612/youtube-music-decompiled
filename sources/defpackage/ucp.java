package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucp extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucn aucnVar = (aucn) obj;
        aihf aihfVarCreateBuilder = anbp.a.createBuilder();
        if ((aucnVar.b & 1) != 0) {
            agdy agdyVar = ufg.d;
            auby aubyVar = aucnVar.e;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar = (anbp) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anbpVar.e = anbaVar;
            anbpVar.b |= 1;
        }
        if ((aucnVar.b & 2) != 0) {
            agdy agdyVar2 = ufg.c;
            aubo auboVar = aucnVar.f;
            if (auboVar == null) {
                auboVar = aubo.a;
            }
            anaq anaqVar = (anaq) agdyVar2.b(auboVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar2 = (anbp) aihfVarCreateBuilder.instance;
            anaqVar.getClass();
            anbpVar2.f = anaqVar;
            anbpVar2.b |= 2;
        }
        if ((aucnVar.b & 4) != 0) {
            boolean z = aucnVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar3 = (anbp) aihfVarCreateBuilder.instance;
            anbpVar3.b |= 4;
            anbpVar3.g = z;
        }
        int i = aucnVar.c;
        if (i == 4 && atqo.v(4) == 5) {
            anbv anbvVar = (anbv) ufg.a.b(i == 4 ? (auct) aucnVar.d : auct.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar4 = (anbp) aihfVarCreateBuilder.instance;
            anbvVar.getClass();
            anbpVar4.d = anbvVar;
            anbpVar4.c = 4;
        }
        int i2 = aucnVar.c;
        if (i2 == 5 && atqo.v(5) == 6) {
            anbu anbuVar = (anbu) ufg.b.b(i2 == 5 ? (aucs) aucnVar.d : aucs.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar5 = (anbp) aihfVarCreateBuilder.instance;
            anbuVar.getClass();
            anbpVar5.d = anbuVar;
            anbpVar5.c = 5;
        }
        int i3 = aucnVar.c;
        if (i3 == 6 && atqo.v(6) == 7) {
            anbe anbeVar = (anbe) ufg.g.b(i3 == 6 ? (aucc) aucnVar.d : aucc.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar6 = (anbp) aihfVarCreateBuilder.instance;
            anbeVar.getClass();
            anbpVar6.d = anbeVar;
            anbpVar6.c = 6;
        }
        int i4 = aucnVar.c;
        if (i4 == 7 && atqo.v(7) == 8) {
            anah anahVar = (anah) ufg.e.b(i4 == 7 ? (aubf) aucnVar.d : aubf.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar7 = (anbp) aihfVarCreateBuilder.instance;
            anahVar.getClass();
            anbpVar7.d = anahVar;
            anbpVar7.c = 7;
        }
        int i5 = aucnVar.c;
        if (i5 == 8 && atqo.v(8) == 9) {
            anbs anbsVar = (anbs) ufg.f.b(i5 == 8 ? (aucq) aucnVar.d : aucq.a);
            aihfVarCreateBuilder.copyOnWrite();
            anbp anbpVar8 = (anbp) aihfVarCreateBuilder.instance;
            anbsVar.getClass();
            anbpVar8.d = anbsVar;
            anbpVar8.c = 8;
        }
        return (anbp) aihfVarCreateBuilder.build();
    }
}
