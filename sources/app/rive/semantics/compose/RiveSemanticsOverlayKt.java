package app.rive.semantics.compose;

import app.rive.semantics.SemanticActionType;
import app.rive.semantics.SemanticNodeClassificationKt;
import app.rive.semantics.SemanticNodeData;
import app.rive.semantics.SemanticNodeState;
import app.rive.semantics.SemanticRole;
import app.rive.semantics.SemanticState;
import app.rive.semantics.SemanticTreeModel;
import defpackage.aao;
import defpackage.ahf;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.aie;
import defpackage.ail;
import defpackage.ais;
import defpackage.aiu;
import defpackage.ajm;
import defpackage.akn;
import defpackage.akq;
import defpackage.ale;
import defpackage.ane;
import defpackage.aot;
import defpackage.aov;
import defpackage.aow;
import defpackage.atqq;
import defpackage.awmy;
import defpackage.awoa;
import defpackage.awqg;
import defpackage.dl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveSemanticsOverlayKt {
    /* JADX INFO: renamed from: $r8$lambda$25N-PYZFYuOmsdNAGk7HwZ6pJTQ, reason: not valid java name */
    public static /* synthetic */ boolean m599$r8$lambda$25NPYZFYuOmsdNAGk7HwZ6pJTQ(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        RenderSemanticNodeComposable$lambda$0$0$2(awqgVar, renderSemanticNode);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$K6pfIdOqZI8r7pidCS_4Hx7Qrz0(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        RenderSemanticNodeComposable$lambda$1$0$0(awqgVar, renderSemanticNode);
        return true;
    }

    /* JADX INFO: renamed from: $r8$lambda$YuHwBhFMffv-GGacYqY-j8XqUwk, reason: not valid java name */
    public static /* synthetic */ boolean m600$r8$lambda$YuHwBhFMffvGGacYqYj8XqUwk(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        RenderSemanticNodeComposable$lambda$0$0$0(awqgVar, renderSemanticNode);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$kYJDpMGUTn49u78lCxltYSE7SQg(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        RenderSemanticNodeComposable$lambda$0$0$1(awqgVar, renderSemanticNode);
        return true;
    }

    private static final void RenderSemanticNodeComposable(final RenderSemanticNode renderSemanticNode, final awqg awqgVar, final awqg awqgVar2, final awqg awqgVar3, final awqg awqgVar4, ahk ahkVar, int i) {
        int i2;
        int i3 = i & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ahkVarC.v() ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ahkVarC.v() ? SemanticState.Focused : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ahkVarC.v() ? SemanticState.ReadOnly : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ahkVarC.v() ? SemanticState.Multiline : 16384;
        }
        if (ahkVarC.y()) {
            renderSemanticNode.getId();
            renderSemanticNode.getActions();
            boolean zR = ahkVarC.r() | ahkVarC.t();
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 7168) == 2048;
            boolean z4 = (57344 & i2) == 16384;
            Object objC = ahkVarC.c();
            if ((zR | z2 | z3 | z4) || objC == ahj.a) {
                awoa awoaVar = new awoa(10);
                if (renderSemanticNode.getActions().getSemanticActions().contains(SemanticActionType.Increase)) {
                    awoaVar.add(new aot("Increase", new Function0() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RiveSemanticsOverlayKt.m600$r8$lambda$YuHwBhFMffvGGacYqYj8XqUwk(awqgVar2, renderSemanticNode);
                            return Boolean.TRUE;
                        }
                    }));
                }
                if (renderSemanticNode.getActions().getSemanticActions().contains(SemanticActionType.Decrease)) {
                    awoaVar.add(new aot("Decrease", new Function0() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RiveSemanticsOverlayKt.$r8$lambda$kYJDpMGUTn49u78lCxltYSE7SQg(awqgVar3, renderSemanticNode);
                            return Boolean.TRUE;
                        }
                    }));
                }
                if (renderSemanticNode.getActions().getCanRequestFocus()) {
                    awoaVar.add(new aot("Focus", new Function0() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RiveSemanticsOverlayKt.m599$r8$lambda$25NPYZFYuOmsdNAGk7HwZ6pJTQ(awqgVar4, renderSemanticNode);
                            return Boolean.TRUE;
                        }
                    }));
                }
                objC = awoaVar.f();
                ahkVarC.D();
            }
            int i4 = i2 & 14;
            final List list = (List) objC;
            akn aknVar = akq.c;
            boolean zV = (i4 == 4 || ((i2 & 8) != 0 && ahkVarC.v())) | ((i2 & 112) == 32) | ahkVarC.v();
            Object objC2 = ahkVarC.c();
            if (zV || objC2 == ahj.a) {
                objC2 = new awqg() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$$ExternalSyntheticLambda7
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        return RiveSemanticsOverlayKt.RenderSemanticNodeComposable$lambda$1$0(renderSemanticNode, list, awqgVar, (aow) obj);
                    }
                };
                ahkVarC.D();
            }
            akq akqVarA = aov.a(aknVar, false, (awqg) objC2);
            if (i4 != 4 && ((i2 & 8) == 0 || !ahkVarC.v())) {
                z = false;
            }
            Object objC3 = ahkVarC.c();
            if (z || objC3 == ahj.a) {
                objC3 = new RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1(renderSemanticNode);
                ahkVarC.D();
            }
            ane aneVar = (ane) objC3;
            int iM = RiveSemanticsOverlayKt$$ExternalSyntheticBackport0.m(ahkVarC.a());
            ajm ajmVarG = ahkVarC.G();
            akq akqVarA2 = aao.a(ahkVarC, akqVarA);
            if (!(ahkVarC.E() instanceof ahf)) {
                dl.j();
            }
            ahkVarC.m();
            if (ahkVarC.p()) {
                ahkVarC.x();
            } else {
                ahkVarC.n();
            }
            aiu.a(ahkVarC, aneVar);
            aiu.a(ahkVarC, ajmVarG);
            aiu.a(ahkVarC, Integer.valueOf(iM));
            ahkVarC.q();
            aiu.a(ahkVarC, akqVarA2);
            ahkVarC.A();
            Iterator it = renderSemanticNode.getChildren().iterator();
            while (it.hasNext()) {
                RenderSemanticNodeComposable((RenderSemanticNode) it.next(), awqgVar, awqgVar2, awqgVar3, awqgVar4, ahkVarC, 65520 & i2);
            }
            ahkVarC.h();
            ahkVarC.g();
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    private static final boolean RenderSemanticNodeComposable$lambda$0$0$0(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        awqgVar.invoke(Integer.valueOf(renderSemanticNode.getId()));
        return true;
    }

    private static final boolean RenderSemanticNodeComposable$lambda$0$0$1(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        awqgVar.invoke(Integer.valueOf(renderSemanticNode.getId()));
        return true;
    }

    private static final boolean RenderSemanticNodeComposable$lambda$0$0$2(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        awqgVar.invoke(Integer.valueOf(renderSemanticNode.getId()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RenderSemanticNodeComposable$lambda$1$0(RenderSemanticNode renderSemanticNode, List list, awqg awqgVar, aow aowVar) {
        aowVar.getClass();
        ComposeSemanticNodeMappingKt.applySemanticNodeContainer(aowVar, renderSemanticNode.getContainer());
        ComposeSemanticNodeMappingKt.applySemanticNodeTraversal(aowVar, renderSemanticNode.getSiblingIndex());
        ComposeSemanticNodeMappingKt.applySemanticNodeContent(aowVar, renderSemanticNode.getContent());
        ComposeSemanticNodeMappingKt.applySemanticNodeState(aowVar, renderSemanticNode.getState());
        if (renderSemanticNode.getHeadingLevel() > 0) {
            aowVar.a();
        }
        if (ComposeSemanticNodeMappingKt.toComposeRole(renderSemanticNode.getRole()) != null) {
            aowVar.a();
        }
        if (renderSemanticNode.getActions().getSemanticActions().contains(SemanticActionType.Tap)) {
            aowVar.a();
        }
        if (!list.isEmpty()) {
            aowVar.a();
        }
        return awmy.a;
    }

    private static final boolean RenderSemanticNodeComposable$lambda$1$0$0(awqg awqgVar, RenderSemanticNode renderSemanticNode) {
        awqgVar.invoke(Integer.valueOf(renderSemanticNode.getId()));
        return true;
    }

    static final awmy RenderSemanticNodeComposable$lambda$4(RenderSemanticNode renderSemanticNode, awqg awqgVar, awqg awqgVar2, awqg awqgVar3, awqg awqgVar4, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        RenderSemanticNodeComposable(renderSemanticNode, awqgVar, awqgVar2, awqgVar3, awqgVar4, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }

    public static final void RiveSemanticsOverlay(SemanticTreeModel semanticTreeModel, awqg awqgVar, awqg awqgVar2, awqg awqgVar3, awqg awqgVar4, ahk ahkVar, int i) {
        Object obj;
        semanticTreeModel.getClass();
        awqgVar.getClass();
        awqgVar2.getClass();
        awqgVar3.getClass();
        awqgVar4.getClass();
        int i2 = i & 6;
        ahk ahkVarC = ahkVar.C();
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != ahkVarC.v() ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ahkVarC.v() ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ahkVarC.v() ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ahkVarC.v() ? SemanticState.Multiline : 16384;
        }
        if (ahkVarC.y()) {
            RiveSemanticsOverlay$lambda$0(aie.c(semanticTreeModel.getVersionFlow(), ahkVarC));
            boolean zR = ahkVarC.r();
            Object objC = ahkVarC.c();
            if (zR || objC == ahj.a) {
                obj = objC;
                List roots = semanticTreeModel.getRoots();
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                for (Object obj2 : roots) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        atqq.M();
                    }
                    RenderSemanticNode renderSemanticNodeBuildRenderableNode = buildRenderableNode(((Number) obj2).intValue(), i4, semanticTreeModel);
                    if (renderSemanticNodeBuildRenderableNode != null) {
                        arrayList.add(renderSemanticNodeBuildRenderableNode);
                    }
                    i4 = i5;
                }
                ahkVarC.D();
                obj = arrayList;
            }
            obj = objC;
            List list = (List) obj;
            akn aknVar = akq.c;
            Object objC2 = ahkVarC.c();
            Object obj3 = ahj.a;
            if (objC2 == obj3) {
                objC2 = new awqg() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt$$ExternalSyntheticLambda2
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj4) {
                        return RiveSemanticsOverlayKt.RiveSemanticsOverlay$lambda$2$0((aow) obj4);
                    }
                };
                ahkVarC.D();
            }
            akq akqVarA = aov.a(aknVar, false, (awqg) objC2);
            boolean zV = ahkVarC.v();
            Object objC3 = ahkVarC.c();
            if (zV || objC3 == obj3) {
                objC3 = new RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1(list);
                ahkVarC.D();
            }
            ane aneVar = (ane) objC3;
            int iM = RiveSemanticsOverlayKt$$ExternalSyntheticBackport0.m(ahkVarC.a());
            ajm ajmVarG = ahkVarC.G();
            akq akqVarA2 = aao.a(ahkVarC, akqVarA);
            if (!(ahkVarC.E() instanceof ahf)) {
                dl.j();
            }
            ahkVarC.m();
            if (ahkVarC.p()) {
                ahkVarC.x();
            } else {
                ahkVarC.n();
            }
            aiu.a(ahkVarC, aneVar);
            aiu.a(ahkVarC, ajmVarG);
            aiu.a(ahkVarC, Integer.valueOf(iM));
            ahkVarC.q();
            aiu.a(ahkVarC, akqVarA2);
            ahkVarC.A();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RenderSemanticNodeComposable((RenderSemanticNode) it.next(), awqgVar, awqgVar2, awqgVar3, awqgVar4, ahkVarC, 65520 & i3);
            }
            ahkVarC.h();
            ahkVarC.g();
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    private static final int RiveSemanticsOverlay$lambda$0(ais aisVar) {
        return ((Number) aisVar.e()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSemanticsOverlay$lambda$2$0(aow aowVar) {
        aowVar.getClass();
        aowVar.a();
        return awmy.a;
    }

    static final awmy RiveSemanticsOverlay$lambda$5(SemanticTreeModel semanticTreeModel, awqg awqgVar, awqg awqgVar2, awqg awqgVar3, awqg awqgVar4, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        RiveSemanticsOverlay(semanticTreeModel, awqgVar, awqgVar2, awqgVar3, awqgVar4, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }

    private static final RenderSemanticNode buildRenderableNode(int i, int i2, SemanticTreeModel semanticTreeModel) {
        SemanticNodeData semanticNodeDataNodeById = semanticTreeModel.nodeById(i);
        if (semanticNodeDataNodeById != null) {
            SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
            if (!semanticNodeStateMapSemanticNodeState.getHidden()) {
                ale aleVarMapRect = mapRect(semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY());
                if (aleVarMapRect.c - aleVarMapRect.a > 0.0f && aleVarMapRect.d - aleVarMapRect.b > 0.0f) {
                    List children = semanticNodeDataNodeById.getChildren();
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (Object obj : children) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            atqq.M();
                        }
                        RenderSemanticNode renderSemanticNodeBuildRenderableNode = buildRenderableNode(((Number) obj).intValue(), i3, semanticTreeModel);
                        if (renderSemanticNodeBuildRenderableNode != null) {
                            arrayList.add(renderSemanticNodeBuildRenderableNode);
                        }
                        i3 = i4;
                    }
                    SemanticRole semanticRoleFromValue = SemanticRole.Companion.fromValue(semanticNodeDataNodeById.getRole());
                    return new RenderSemanticNode(semanticNodeDataNodeById.getId(), semanticRoleFromValue, ComposeSemanticNodeMappingKt.toComposeSemanticNodeContainer(semanticRoleFromValue), i2, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, SemanticNodeClassificationKt.mapSemanticNodeActions(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState), semanticNodeDataNodeById.getHeadingLevel(), aleVarMapRect, arrayList);
                }
            }
        }
        return null;
    }

    private static final ale mapRect(float f, float f2, float f3, float f4) {
        return new ale(Math.min(f, f3), Math.min(f2, f4), Math.max(f, f3), Math.max(f2, f4));
    }
}
