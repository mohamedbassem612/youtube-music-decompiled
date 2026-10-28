package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uba extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audq audqVar = (audq) obj;
        aihf aihfVarCreateBuilder = ancw.a.createBuilder();
        if ((audqVar.c & 1) != 0) {
            String str = audqVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar = (ancw) aihfVarCreateBuilder.instance;
            str.getClass();
            ancwVar.b |= 1;
            ancwVar.c = str;
        }
        if ((audqVar.c & 2) != 0) {
            int i = audqVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar2 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar2.b |= 2;
            ancwVar2.d = i;
        }
        if ((audqVar.c & 4) != 0) {
            int i2 = audqVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar3 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar3.b |= 4;
            ancwVar3.e = i2;
        }
        if ((audqVar.c & 8) != 0) {
            int i3 = audqVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar4 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar4.b |= 8;
            ancwVar4.f = i3;
        }
        if ((audqVar.c & 16) != 0) {
            int i4 = audqVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar5 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar5.b |= 16;
            ancwVar5.g = i4;
        }
        if ((audqVar.c & 32) != 0) {
            int i5 = audqVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar6 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar6.b |= 32;
            ancwVar6.h = i5;
        }
        if ((audqVar.c & 64) != 0) {
            int i6 = audqVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar7 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar7.b |= 64;
            ancwVar7.i = i6;
        }
        if ((audqVar.c & SemanticState.Focused) != 0) {
            int i7 = audqVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar8 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar8.b |= SemanticState.Focused;
            ancwVar8.j = i7;
        }
        if ((audqVar.c & SemanticState.Hidden) != 0) {
            int i8 = audqVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar9 = (ancw) aihfVarCreateBuilder.instance;
            ancwVar9.b |= SemanticState.Hidden;
            ancwVar9.k = i8;
        }
        Iterator<E> it = new aihx(audqVar.m, audq.a).iterator();
        while (it.hasNext()) {
            anby anbyVar = (anby) ued.a.b((aucv) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            ancw ancwVar10 = (ancw) aihfVarCreateBuilder.instance;
            anbyVar.getClass();
            aihv aihvVar = ancwVar10.l;
            if (!aihvVar.c()) {
                ancwVar10.l = aihn.mutableCopy(aihvVar);
            }
            ancwVar10.l.h(anbyVar.f);
        }
        return (ancw) aihfVarCreateBuilder.build();
    }
}
