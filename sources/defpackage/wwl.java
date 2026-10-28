package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wwl implements adky {
    final /* synthetic */ adkz a;
    final /* synthetic */ wwn b;

    public wwl(wwn wwnVar, adkz adkzVar) {
        this.a = adkzVar;
        this.b = wwnVar;
    }

    private final void b() {
        wwm wwmVar = this.b.i;
        if (wwmVar != null) {
            wwmVar.ae(((tbm) this.a).size());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        b();
        Object obj = ((tbm) this.a).get(i);
        boolean z = obj instanceof amrd;
        wwn wwnVar = this.b;
        if (z) {
            alja aljaVar = ((amrd) obj).e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            if (alizVarA != aliz.GIFT) {
                wwnVar.g.c();
            }
        } else {
            wwnVar.g.c();
        }
        String str = wwnVar.q;
        if (str != null) {
            int i3 = wwnVar.u;
            if (i3 == 0) {
                throw null;
            }
            if (i3 != 3) {
                if (obj instanceof amrc) {
                    amrc amrcVar = (amrc) obj;
                    if (amrcVar.j != amrcVar.k) {
                        return;
                    }
                } else {
                    if (!(obj instanceof amra)) {
                        return;
                    }
                    amra amraVar = (amra) obj;
                    if (amraVar.f != amraVar.g) {
                        return;
                    }
                }
                wbz wbzVar = wwnVar.m;
                boolean z2 = !str.isEmpty();
                wby wbyVarC = wbzVar.c();
                ahno.P(z2, "key cannot be empty");
                aihf aihfVarCreateBuilder = alit.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                alit alitVar = (alit) aihfVarCreateBuilder.instance;
                alitVar.b |= 1;
                alitVar.c = str;
                aliq aliqVar = new aliq(aihfVarCreateBuilder);
                aihf aihfVar = aliqVar.a;
                aihfVar.copyOnWrite();
                alit alitVar2 = (alit) aihfVar.instance;
                alitVar2.b |= 2;
                alitVar2.d = " ";
                Boolean.TRUE.booleanValue();
                aihfVar.copyOnWrite();
                alit alitVar3 = (alit) aihfVar.instance;
                alitVar3.b |= 4;
                alitVar3.e = true;
                wer werVarE = wbyVarC.e();
                werVarE.m(aliqVar);
                werVarE.b().D();
            }
        }
    }

    @Override // defpackage.adky
    public final void jS() {
        b();
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        b();
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        b();
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        b();
    }
}
