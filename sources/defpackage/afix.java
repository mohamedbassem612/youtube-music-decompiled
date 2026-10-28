package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afix implements afhx {
    @Override // defpackage.afhx
    public final ListenableFuture a() {
        aihh aihhVar = (aihh) afhq.a.createBuilder();
        aihhVar.copyOnWrite();
        afhq afhqVar = (afhq) aihhVar.instance;
        afhqVar.b |= SemanticState.Hidden;
        afhqVar.f = "pseudonymous";
        aihhVar.copyOnWrite();
        afhq afhqVar2 = (afhq) aihhVar.instance;
        afhqVar2.b |= 1;
        afhqVar2.c = "pseudonymous";
        aihhVar.copyOnWrite();
        afhq afhqVar3 = (afhq) aihhVar.instance;
        afhqVar3.b |= 2;
        afhqVar3.d = "UNHANDLED ACCOUNT TYPE ლ(ಠ益ಠლ)";
        aihhVar.copyOnWrite();
        afhq afhqVar4 = (afhq) aihhVar.instance;
        afhqVar4.b |= 16;
        afhqVar4.e = "¯\\_(ツ)_/¯";
        Object[] objArr = {(afhq) aihhVar.build()};
        aguu.j(objArr, 1);
        return new aher(new agpi(objArr, 1));
    }
}
