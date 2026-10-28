package app.rive.semantics.compose;

import defpackage.aja;
import defpackage.ale;
import defpackage.ana;
import defpackage.and;
import defpackage.ane;
import defpackage.anf;
import defpackage.ang;
import defpackage.ani;
import defpackage.anj;
import defpackage.apb;
import defpackage.apd;
import defpackage.atqq;
import defpackage.avkz;
import defpackage.awmy;
import defpackage.awnp;
import defpackage.awqg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1 implements ane {
    final /* synthetic */ List $roots;

    public RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1(List list) {
        this.$roots = list;
    }

    static final awmy measure_3p2s80s$lambda$1(List list, List list2, ani aniVar) {
        aniVar.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            RenderSemanticNode renderSemanticNode = (RenderSemanticNode) list2.get(i);
            ani.a((anj) obj, avkz.h(renderSemanticNode.getRect().a), avkz.h(renderSemanticNode.getRect().b));
            i = i2;
        }
        return awmy.a;
    }

    @Override // defpackage.ane
    public /* synthetic */ int maxIntrinsicHeight(ana anaVar, List list, int i) {
        return aja.c(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    public /* synthetic */ int maxIntrinsicWidth(ana anaVar, List list, int i) {
        return aja.d(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final anf mo201measure3p2s80s(ang angVar, List list, long j) {
        angVar.getClass();
        list.getClass();
        final ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            RenderSemanticNode renderSemanticNode = (RenderSemanticNode) this.$roots.get(i);
            ale rect = renderSemanticNode.getRect();
            int iMax = Math.max(1, avkz.h(rect.c - rect.a));
            ale rect2 = renderSemanticNode.getRect();
            arrayList.add(((and) obj).e(apb.b(iMax, Math.max(1, avkz.h(rect2.d - rect2.b)))));
            i = i2;
        }
        int iB = apd.b(j);
        int iA = apd.a(j);
        final List list2 = this.$roots;
        return angVar.r(iB, iA, awnp.a, new awqg() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj2) {
                return RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1.measure_3p2s80s$lambda$1(arrayList, list2, (ani) obj2);
            }
        });
    }

    @Override // defpackage.ane
    public /* synthetic */ int minIntrinsicHeight(ana anaVar, List list, int i) {
        return aja.e(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    public /* synthetic */ int minIntrinsicWidth(ana anaVar, List list, int i) {
        return aja.f(this, anaVar, list, i);
    }
}
