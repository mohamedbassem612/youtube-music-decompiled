package app.rive.semantics.compose;

import app.rive.semantics.SemanticNodeActions;
import app.rive.semantics.SemanticNodeContent;
import app.rive.semantics.SemanticNodeState;
import app.rive.semantics.SemanticRole;
import app.rive.semantics.SemanticState;
import defpackage.ale;
import defpackage.awrc;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RenderSemanticNode {
    private final SemanticNodeActions actions;
    private final List children;
    private final ComposeSemanticNodeContainer container;
    private final SemanticNodeContent content;
    private final int headingLevel;
    private final int id;
    private final ale rect;
    private final SemanticRole role;
    private final int siblingIndex;
    private final SemanticNodeState state;

    public RenderSemanticNode(int i, SemanticRole semanticRole, ComposeSemanticNodeContainer composeSemanticNodeContainer, int i2, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, SemanticNodeActions semanticNodeActions, int i3, ale aleVar, List list) {
        semanticRole.getClass();
        composeSemanticNodeContainer.getClass();
        semanticNodeContent.getClass();
        semanticNodeState.getClass();
        semanticNodeActions.getClass();
        aleVar.getClass();
        list.getClass();
        this.id = i;
        this.role = semanticRole;
        this.container = composeSemanticNodeContainer;
        this.siblingIndex = i2;
        this.content = semanticNodeContent;
        this.state = semanticNodeState;
        this.actions = semanticNodeActions;
        this.headingLevel = i3;
        this.rect = aleVar;
        this.children = list;
    }

    public static /* synthetic */ RenderSemanticNode copy$default(RenderSemanticNode renderSemanticNode, int i, SemanticRole semanticRole, ComposeSemanticNodeContainer composeSemanticNodeContainer, int i2, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, SemanticNodeActions semanticNodeActions, int i3, ale aleVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = renderSemanticNode.id;
        }
        if ((i4 & 2) != 0) {
            semanticRole = renderSemanticNode.role;
        }
        if ((i4 & 4) != 0) {
            composeSemanticNodeContainer = renderSemanticNode.container;
        }
        if ((i4 & 8) != 0) {
            i2 = renderSemanticNode.siblingIndex;
        }
        if ((i4 & 16) != 0) {
            semanticNodeContent = renderSemanticNode.content;
        }
        if ((i4 & 32) != 0) {
            semanticNodeState = renderSemanticNode.state;
        }
        if ((i4 & 64) != 0) {
            semanticNodeActions = renderSemanticNode.actions;
        }
        if ((i4 & SemanticState.Focused) != 0) {
            i3 = renderSemanticNode.headingLevel;
        }
        if ((i4 & SemanticState.Hidden) != 0) {
            aleVar = renderSemanticNode.rect;
        }
        if ((i4 & SemanticState.LiveRegion) != 0) {
            list = renderSemanticNode.children;
        }
        return renderSemanticNode.copy(i, semanticRole, composeSemanticNodeContainer, i2, semanticNodeContent, semanticNodeState, semanticNodeActions, i3, aleVar, list);
    }

    public final int component1() {
        return this.id;
    }

    public final List component10() {
        return this.children;
    }

    public final SemanticRole component2() {
        return this.role;
    }

    public final ComposeSemanticNodeContainer component3() {
        return this.container;
    }

    public final int component4() {
        return this.siblingIndex;
    }

    public final SemanticNodeContent component5() {
        return this.content;
    }

    public final SemanticNodeState component6() {
        return this.state;
    }

    public final SemanticNodeActions component7() {
        return this.actions;
    }

    public final int component8() {
        return this.headingLevel;
    }

    public final ale component9() {
        return this.rect;
    }

    public final RenderSemanticNode copy(int i, SemanticRole semanticRole, ComposeSemanticNodeContainer composeSemanticNodeContainer, int i2, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, SemanticNodeActions semanticNodeActions, int i3, ale aleVar, List list) {
        semanticRole.getClass();
        composeSemanticNodeContainer.getClass();
        semanticNodeContent.getClass();
        semanticNodeState.getClass();
        semanticNodeActions.getClass();
        aleVar.getClass();
        list.getClass();
        return new RenderSemanticNode(i, semanticRole, composeSemanticNodeContainer, i2, semanticNodeContent, semanticNodeState, semanticNodeActions, i3, aleVar, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenderSemanticNode) {
            RenderSemanticNode renderSemanticNode = (RenderSemanticNode) obj;
            if (this.id == renderSemanticNode.id && this.role == renderSemanticNode.role && this.container == renderSemanticNode.container && this.siblingIndex == renderSemanticNode.siblingIndex && awrc.c(this.content, renderSemanticNode.content) && awrc.c(this.state, renderSemanticNode.state) && awrc.c(this.actions, renderSemanticNode.actions) && this.headingLevel == renderSemanticNode.headingLevel && awrc.c(this.rect, renderSemanticNode.rect) && awrc.c(this.children, renderSemanticNode.children)) {
                return true;
            }
        }
        return false;
    }

    public final SemanticNodeActions getActions() {
        return this.actions;
    }

    public final List getChildren() {
        return this.children;
    }

    public final ComposeSemanticNodeContainer getContainer() {
        return this.container;
    }

    public final SemanticNodeContent getContent() {
        return this.content;
    }

    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    public final int getId() {
        return this.id;
    }

    public final ale getRect() {
        return this.rect;
    }

    public final SemanticRole getRole() {
        return this.role;
    }

    public final int getSiblingIndex() {
        return this.siblingIndex;
    }

    public final SemanticNodeState getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((((((((((((this.id * 31) + this.role.hashCode()) * 31) + this.container.hashCode()) * 31) + this.siblingIndex) * 31) + this.content.hashCode()) * 31) + this.state.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.headingLevel) * 31) + this.rect.hashCode()) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "RenderSemanticNode(id=" + this.id + ", role=" + this.role + ", container=" + this.container + ", siblingIndex=" + this.siblingIndex + ", content=" + this.content + ", state=" + this.state + ", actions=" + this.actions + ", headingLevel=" + this.headingLevel + ", rect=" + this.rect + ", children=" + this.children + ')';
    }
}
