package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wou extends wov {
    public String a;
    public int b;

    public wou(abxv abxvVar, zwb zwbVar) {
        super(abxvVar, zwbVar);
    }

    @Override // defpackage.wov, defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        return a();
    }

    @Override // defpackage.wov, defpackage.wkf
    public final void b() {
        super.b();
        typ.f(this.a);
        ahno.O(this.b != 1);
    }

    @Override // defpackage.wov
    /* JADX INFO: renamed from: e */
    public final aihf a() {
        aihf aihfVarA = super.a();
        if (this.b == 2) {
            aihf aihfVarCreateBuilder = alyu.a.createBuilder();
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alyu alyuVar = (alyu) aihfVarCreateBuilder.instance;
            str.getClass();
            alyuVar.b = 1;
            alyuVar.c = str;
            aihfVarA.copyOnWrite();
            alyz alyzVar = (alyz) aihfVarA.instance;
            alyu alyuVar2 = (alyu) aihfVarCreateBuilder.build();
            alyz alyzVar2 = alyz.a;
            alyuVar2.getClass();
            alyzVar.e = alyuVar2;
            alyzVar.b |= SemanticState.LiveRegion;
        }
        if (this.b == 3) {
            aihf aihfVarCreateBuilder2 = alyw.a.createBuilder();
            String str2 = this.a;
            aihfVarCreateBuilder2.copyOnWrite();
            alyw alywVar = (alyw) aihfVarCreateBuilder2.instance;
            str2.getClass();
            alywVar.b = 1;
            alywVar.c = str2;
            aihfVarA.copyOnWrite();
            alyz alyzVar3 = (alyz) aihfVarA.instance;
            alyw alywVar2 = (alyw) aihfVarCreateBuilder2.build();
            alyz alyzVar4 = alyz.a;
            alywVar2.getClass();
            alyzVar3.f = alywVar2;
            alyzVar3.b |= SemanticState.Obscured;
        }
        return aihfVarA;
    }
}
