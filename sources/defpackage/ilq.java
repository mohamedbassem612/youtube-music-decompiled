package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilq extends wlu {
    public apji a;
    public String b;
    public agke c;
    public agke d;
    public aigj e;

    public ilq(abxv abxvVar, zwa zwaVar) {
        super("music/get_music_commentary", abxvVar, zwaVar, 1, false, null, null);
        agke agkeVar = agpi.a;
        this.c = agkeVar;
        this.d = agkeVar;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = aldl.a.createBuilder();
        apji apjiVar = this.a;
        if (apjiVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aldl aldlVar = (aldl) aihfVarCreateBuilder.instance;
            aldlVar.d = apjiVar;
            aldlVar.b |= 2;
        }
        String str = this.b;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aldl aldlVar2 = (aldl) aihfVarCreateBuilder.instance;
            aldlVar2.b |= 16;
            aldlVar2.e = str;
        }
        agke agkeVar = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        aldl aldlVar3 = (aldl) aihfVarCreateBuilder.instance;
        aiie aiieVar = aldlVar3.f;
        if (!aiieVar.c()) {
            aldlVar3.f = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(agkeVar, aldlVar3.f);
        agke agkeVar2 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        aldl aldlVar4 = (aldl) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = aldlVar4.h;
        if (!aiieVar2.c()) {
            aldlVar4.h = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(agkeVar2, aldlVar4.h);
        aigj aigjVar = this.e;
        if (aigjVar != null && !aigjVar.E()) {
            aihfVarCreateBuilder.copyOnWrite();
            aldl aldlVar5 = (aldl) aihfVarCreateBuilder.instance;
            aldlVar5.b |= 32;
            aldlVar5.g = aigjVar;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
