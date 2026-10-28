package app.rive;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import app.rive.semantics.AndroidVirtualNodeIdAllocator;
import app.rive.semantics.AndroidVirtualNodeIdRegistry;
import app.rive.semantics.RiveExploreByTouchHelper;
import app.rive.semantics.SemanticTreeModel;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awrc;
import defpackage.bac;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveTextureView extends TextureView {
    public static final int $stable = 8;
    private RiveExploreByTouchHelper semanticsHelper;
    private final AndroidVirtualNodeIdAllocator semanticsIdAllocator;
    private SemanticsInstallation semanticsInstallation;

    /* JADX INFO: compiled from: PG */
    final class SemanticsInstallation {
        private final awqg onAccessibilityFocusChanged;
        private final awqk onSemanticAction;
        private final Function0 onSemanticFocusCleared;
        private final awqg onSemanticFocusRequested;
        private final SemanticTreeModel tree;

        public SemanticsInstallation(SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0) {
            semanticTreeModel.getClass();
            awqkVar.getClass();
            awqgVar.getClass();
            awqgVar2.getClass();
            function0.getClass();
            this.tree = semanticTreeModel;
            this.onSemanticAction = awqkVar;
            this.onAccessibilityFocusChanged = awqgVar;
            this.onSemanticFocusRequested = awqgVar2;
            this.onSemanticFocusCleared = function0;
        }

        public static /* synthetic */ SemanticsInstallation copy$default(SemanticsInstallation semanticsInstallation, SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                semanticTreeModel = semanticsInstallation.tree;
            }
            if ((i & 2) != 0) {
                awqkVar = semanticsInstallation.onSemanticAction;
            }
            if ((i & 4) != 0) {
                awqgVar = semanticsInstallation.onAccessibilityFocusChanged;
            }
            if ((i & 8) != 0) {
                awqgVar2 = semanticsInstallation.onSemanticFocusRequested;
            }
            if ((i & 16) != 0) {
                function0 = semanticsInstallation.onSemanticFocusCleared;
            }
            return semanticsInstallation.copy(semanticTreeModel, awqkVar, awqgVar, awqgVar2, function0);
        }

        public final SemanticTreeModel component1() {
            return this.tree;
        }

        public final awqk component2() {
            return this.onSemanticAction;
        }

        public final awqg component3() {
            return this.onAccessibilityFocusChanged;
        }

        public final awqg component4() {
            return this.onSemanticFocusRequested;
        }

        public final Function0 component5() {
            return this.onSemanticFocusCleared;
        }

        public final SemanticsInstallation copy(SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0) {
            semanticTreeModel.getClass();
            awqkVar.getClass();
            awqgVar.getClass();
            awqgVar2.getClass();
            function0.getClass();
            return new SemanticsInstallation(semanticTreeModel, awqkVar, awqgVar, awqgVar2, function0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SemanticsInstallation) {
                SemanticsInstallation semanticsInstallation = (SemanticsInstallation) obj;
                if (awrc.c(this.tree, semanticsInstallation.tree) && awrc.c(this.onSemanticAction, semanticsInstallation.onSemanticAction) && awrc.c(this.onAccessibilityFocusChanged, semanticsInstallation.onAccessibilityFocusChanged) && awrc.c(this.onSemanticFocusRequested, semanticsInstallation.onSemanticFocusRequested) && awrc.c(this.onSemanticFocusCleared, semanticsInstallation.onSemanticFocusCleared)) {
                    return true;
                }
            }
            return false;
        }

        public final awqg getOnAccessibilityFocusChanged() {
            return this.onAccessibilityFocusChanged;
        }

        public final awqk getOnSemanticAction() {
            return this.onSemanticAction;
        }

        public final Function0 getOnSemanticFocusCleared() {
            return this.onSemanticFocusCleared;
        }

        public final awqg getOnSemanticFocusRequested() {
            return this.onSemanticFocusRequested;
        }

        public final SemanticTreeModel getTree() {
            return this.tree;
        }

        public int hashCode() {
            return (((((((this.tree.hashCode() * 31) + this.onSemanticAction.hashCode()) * 31) + this.onAccessibilityFocusChanged.hashCode()) * 31) + this.onSemanticFocusRequested.hashCode()) * 31) + this.onSemanticFocusCleared.hashCode();
        }

        public String toString() {
            return "SemanticsInstallation(tree=" + this.tree + ", onSemanticAction=" + this.onSemanticAction + ", onAccessibilityFocusChanged=" + this.onAccessibilityFocusChanged + ", onSemanticFocusRequested=" + this.onSemanticFocusRequested + ", onSemanticFocusCleared=" + this.onSemanticFocusCleared + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(Context context) {
        super(context);
        context.getClass();
        this.semanticsIdAllocator = new AndroidVirtualNodeIdAllocator();
    }

    private final void disposeSemanticsHelper() {
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        if (riveExploreByTouchHelper != null) {
            riveExploreByTouchHelper.dispose();
            riveExploreByTouchHelper.invalidateRoot();
            this.semanticsHelper = null;
            bac.p(this, null);
        }
    }

    public static /* synthetic */ void installSemantics$default(RiveTextureView riveTextureView, SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            awqgVar2 = new awqg() { // from class: app.rive.RiveTextureView$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj2) {
                    ((Integer) obj2).intValue();
                    return awmy.a;
                }
            };
        }
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: app.rive.RiveTextureView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return awmy.a;
                }
            };
        }
        riveTextureView.installSemantics(semanticTreeModel, awqkVar, awqgVar, awqgVar2, function0);
    }

    private final void installSemanticsHelper(SemanticsInstallation semanticsInstallation) {
        disposeSemanticsHelper();
        RiveExploreByTouchHelper riveExploreByTouchHelper = new RiveExploreByTouchHelper(this, semanticsInstallation.getTree(), semanticsInstallation.getOnSemanticAction(), semanticsInstallation.getOnAccessibilityFocusChanged(), semanticsInstallation.getOnSemanticFocusRequested(), semanticsInstallation.getOnSemanticFocusCleared(), new AndroidVirtualNodeIdRegistry(this.semanticsIdAllocator));
        this.semanticsHelper = riveExploreByTouchHelper;
        bac.p(this, riveExploreByTouchHelper);
        riveExploreByTouchHelper.onInstalled();
        riveExploreByTouchHelper.invalidateRoot();
    }

    public final void clearSemantics() {
        this.semanticsInstallation = null;
        disposeSemanticsHelper();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return dispatchSemanticHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchSemanticHoverEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        return riveExploreByTouchHelper != null && riveExploreByTouchHelper.dispatchHoverEvent(motionEvent);
    }

    public final void installSemantics(SemanticTreeModel semanticTreeModel, awqk awqkVar, awqg awqgVar, awqg awqgVar2, Function0 function0) {
        semanticTreeModel.getClass();
        awqkVar.getClass();
        awqgVar.getClass();
        awqgVar2.getClass();
        function0.getClass();
        SemanticsInstallation semanticsInstallation = new SemanticsInstallation(semanticTreeModel, awqkVar, awqgVar, awqgVar2, function0);
        this.semanticsInstallation = semanticsInstallation;
        installSemanticsHelper(semanticsInstallation);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        SemanticsInstallation semanticsInstallation;
        super.onAttachedToWindow();
        if (this.semanticsHelper != null || (semanticsInstallation = this.semanticsInstallation) == null) {
            return;
        }
        installSemanticsHelper(semanticsInstallation);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        disposeSemanticsHelper();
        super.onDetachedFromWindow();
    }

    public final boolean synchronizeSemantics() {
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        if (riveExploreByTouchHelper == null || !riveExploreByTouchHelper.synchronizeWithTree()) {
            return false;
        }
        riveExploreByTouchHelper.invalidateRoot();
        return true;
    }
}
