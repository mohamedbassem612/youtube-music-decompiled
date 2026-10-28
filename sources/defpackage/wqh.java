package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wqh extends wlu {
    public String a;
    public String b;
    public arev c;
    public int d;
    private String e;

    protected wqh(abxv abxvVar, zwa zwaVar) {
        super("player/heartbeat", abxvVar, zwaVar, 1, true, null, null);
        this.d = -1;
    }

    public void F(int i) {
        this.d = i;
    }

    public void G(String str) {
        this.a = str;
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public aihf a() {
        aihf aihfVarCreateBuilder = alur.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alur alurVar = (alur) aihfVarCreateBuilder.instance;
        str.getClass();
        alurVar.b |= 2;
        alurVar.d = str;
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alur alurVar2 = (alur) aihfVarCreateBuilder.instance;
        str2.getClass();
        alurVar2.b |= 4;
        alurVar2.e = str2;
        int i = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        alur alurVar3 = (alur) aihfVarCreateBuilder.instance;
        alurVar3.b |= 32;
        alurVar3.g = i;
        if (this.c != null) {
            aihf aihfVarCreateBuilder2 = aluq.a.createBuilder();
            arev arevVar = this.c;
            aihfVarCreateBuilder2.copyOnWrite();
            aluq aluqVar = (aluq) aihfVarCreateBuilder2.instance;
            arevVar.getClass();
            aluqVar.d = arevVar;
            aluqVar.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar4 = (alur) aihfVarCreateBuilder.instance;
            aluq aluqVar2 = (aluq) aihfVarCreateBuilder2.build();
            aluqVar2.getClass();
            alurVar4.i = aluqVar2;
            alurVar4.b |= SemanticState.Focused;
        }
        String str3 = this.e;
        if (str3 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar5 = (alur) aihfVarCreateBuilder.instance;
            alurVar5.b |= 16;
            alurVar5.f = str3;
        }
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    @Override // defpackage.wkf
    protected void b() {
        typ.f(this.r);
        typ.f(this.a);
        typ.f(this.b);
        ahno.O((this.d ^ (-1)) >>> 31);
    }

    public void e(String str) {
        this.e = str;
    }
}
