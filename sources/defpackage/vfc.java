package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vfc extends vee {
    static final Function a = new ved(13);
    static final agek b = new vem(4);

    @Override // defpackage.vee
    public final void a(augr augrVar, aihf aihfVar) {
        Function function = a;
        augq augqVarA = augq.a(augrVar.f);
        if (augqVarA == null) {
            augqVarA = augq.COMMENT_STICKER_SOURCE_UNKNOWN;
        }
        arfp arfpVar = (arfp) function.apply(augqVarA);
        aihfVar.copyOnWrite();
        akpt akptVar = (akpt) aihfVar.instance;
        akpt akptVar2 = akpt.a;
        akptVar.c = arfpVar.f;
        akptVar.b |= 1;
    }

    @Override // defpackage.vee
    public final void b(augr augrVar, aihf aihfVar) {
        Object objApply = b.apply(augrVar.i);
        aihfVar.copyOnWrite();
        akpt akptVar = (akpt) aihfVar.instance;
        akpt akptVar2 = akpt.a;
        objApply.getClass();
        akptVar.h = (akps) objApply;
        akptVar.b |= 32;
    }
}
