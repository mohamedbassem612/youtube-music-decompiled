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
import defpackage.atqq;
import defpackage.avkz;
import defpackage.awmy;
import defpackage.awnp;
import defpackage.awqg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1 implements ane {
    final /* synthetic */ RenderSemanticNode $node;

    public RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1(RenderSemanticNode renderSemanticNode) {
        this.$node = renderSemanticNode;
    }

    static final awmy measure_3p2s80s$lambda$1(List list, RenderSemanticNode renderSemanticNode, ani aniVar) {
        aniVar.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            RenderSemanticNode renderSemanticNode2 = (RenderSemanticNode) renderSemanticNode.getChildren().get(i);
            ani.a((anj) obj, avkz.h(renderSemanticNode2.getRect().a - renderSemanticNode.getRect().a), avkz.h(renderSemanticNode2.getRect().b - renderSemanticNode.getRect().b));
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
        ale rect = this.$node.getRect();
        int iMax = Math.max(1, avkz.h(rect.c - rect.a));
        ale rect2 = this.$node.getRect();
        int iMax2 = Math.max(1, avkz.h(rect2.d - rect2.b));
        final ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            RenderSemanticNode renderSemanticNode = (RenderSemanticNode) this.$node.getChildren().get(i);
            ale rect3 = renderSemanticNode.getRect();
            int iMax3 = Math.max(1, avkz.h(rect3.c - rect3.a));
            ale rect4 = renderSemanticNode.getRect();
            arrayList.add(((and) obj).e(apb.b(iMax3, Math.max(1, avkz.h(rect4.d - rect4.b)))));
            i = i2;
        }
        final RenderSemanticNode renderSemanticNode2 = this.$node;
        return angVar.r(iMax, iMax2, awnp.a, new awqg() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj2) {
                return RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1.measure_3p2s80s$lambda$1(arrayList, renderSemanticNode2, (ani) obj2);
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
