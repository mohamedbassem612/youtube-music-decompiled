package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class achy implements achs {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public achy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.achs
    public final void a(wqh wqhVar, aihf aihfVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            synchronized (obj) {
                int i2 = ((achd) obj).c;
                if ((i2 == 3 || i2 == 4) && ((achd) obj).b.isPresent()) {
                    ajgu ajguVar = (ajgu) ((achd) obj).b.get();
                    aihfVar.copyOnWrite();
                    alur alurVar = (alur) aihfVar.instance;
                    alur alurVar2 = alur.a;
                    alurVar.j = ajguVar;
                    alurVar.b |= SemanticState.Hidden;
                    ((achd) obj).c = 4;
                }
            }
            return;
        }
        achz achzVar = (achz) obj;
        if (achzVar.a != 0) {
            aihf aihfVarCreateBuilder = aluq.a.createBuilder();
            int iL = aajg.l(achzVar.a);
            aihfVarCreateBuilder.copyOnWrite();
            aluq aluqVar = (aluq) aihfVarCreateBuilder.instance;
            aluqVar.c = iL - 1;
            aluqVar.b |= 1;
            aluq aluqVar2 = (aluq) aihfVarCreateBuilder.build();
            aihfVar.copyOnWrite();
            alur alurVar3 = (alur) aihfVar.instance;
            alur alurVar4 = alur.a;
            aluqVar2.getClass();
            alurVar3.i = aluqVar2;
            alurVar3.b |= SemanticState.Focused;
        }
        aazk aazkVar = achzVar.b;
        if (aazkVar != null) {
            aluq aluqVar3 = ((alur) aihfVar.instance).i;
            if (aluqVar3 == null) {
                aluqVar3 = aluq.a;
            }
            aihf builder = aluqVar3.toBuilder();
            aihf aihfVarCreateBuilder2 = arev.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            arev arevVar = (arev) aihfVarCreateBuilder2.instance;
            arevVar.b |= 1;
            arevVar.c = aazkVar.a;
            aihfVarCreateBuilder2.copyOnWrite();
            arev arevVar2 = (arev) aihfVarCreateBuilder2.instance;
            arevVar2.b |= 2;
            arevVar2.d = aazkVar.b;
            arev arevVar3 = (arev) aihfVarCreateBuilder2.build();
            builder.copyOnWrite();
            aluq aluqVar4 = (aluq) builder.instance;
            arevVar3.getClass();
            aluqVar4.d = arevVar3;
            aluqVar4.b |= 2;
            aihfVar.copyOnWrite();
            alur alurVar5 = (alur) aihfVar.instance;
            aluq aluqVar5 = (aluq) builder.build();
            aluqVar5.getClass();
            alurVar5.i = aluqVar5;
            alurVar5.b |= SemanticState.Focused;
        }
    }
}
