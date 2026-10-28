package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyk implements hyi {
    public final cf a;
    private final awmi b;
    private final awmi c;
    private final awmi d;
    private final vxz e;
    private final kjc f;
    private final hfn g;

    public hyk(cf cfVar, hfn hfnVar, vxz vxzVar, kjc kjcVar) {
        cfVar.getClass();
        hfnVar.getClass();
        vxzVar.getClass();
        kjcVar.getClass();
        this.a = cfVar;
        this.g = hfnVar;
        this.e = vxzVar;
        this.f = kjcVar;
        this.b = new awmp(new ebk(this, 9));
        this.c = new awmp(new ebk(this, 10));
        this.d = new awmp(new ebk(this, 11));
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (!this.e.l(95, 45762151L, false) || !this.f.n()) {
            return null;
        }
        boolean z = this.g.x() == hww.h;
        aliz alizVar = z ? aliz.PLAYER_FULL_EXIT_ALT : aliz.PLAYER_FULL_ENTER_ALT;
        aihf aihfVarCreateBuilder = anfw.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        alay alayVarC = ackj.c((String) this.d.a());
        alayVarC.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
        anfwVar.c = alayVarC;
        anfwVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aihhVar.getClass();
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
        anfwVar2.d = (alja) aihnVarBuild;
        anfwVar2.b |= 2;
        aihf aihfVarCreateBuilder2 = anfu.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = aiqd.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        String str = z ? (String) this.b.a() : (String) this.c.a();
        str.getClass();
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder3.instance;
        aiqdVar.b |= 2;
        aiqdVar.c = str;
        aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
        aihnVarBuild2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        anfu anfuVar = (anfu) aihfVarCreateBuilder2.instance;
        anfuVar.c = (aiqd) aihnVarBuild2;
        anfuVar.b |= 1;
        aihn aihnVarBuild3 = aihfVarCreateBuilder2.build();
        aihnVarBuild3.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
        anfwVar3.h = (anfu) aihnVarBuild3;
        anfwVar3.b |= SemanticState.Hidden;
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihhVar2.getClass();
        aihl aihlVar = aqnq.a;
        aihlVar.getClass();
        aqnp aqnpVar = aqnp.a;
        aqnpVar.getClass();
        aihhVar2.e(aihlVar, aqnpVar);
        ajwo ajwoVarW = atqp.W(aihhVar2);
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar4 = (anfw) aihfVarCreateBuilder.instance;
        anfwVar4.f = ajwoVarW;
        anfwVar4.b |= 32;
        aihn aihnVarBuild4 = aihfVarCreateBuilder.build();
        aihnVarBuild4.getClass();
        aihf aihfVarCreateBuilder4 = anfv.a.createBuilder();
        aihfVarCreateBuilder4.getClass();
        aihfVarCreateBuilder4.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder4.instance;
        anfvVar.c = (anfw) aihnVarBuild4;
        anfvVar.b = 66441108;
        aihn aihnVarBuild5 = aihfVarCreateBuilder4.build();
        aihnVarBuild5.getClass();
        return (anfv) aihnVarBuild5;
    }
}
