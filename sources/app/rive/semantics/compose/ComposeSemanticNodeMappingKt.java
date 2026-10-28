package app.rive.semantics.compose;

import app.rive.semantics.SemanticNodeContent;
import app.rive.semantics.SemanticNodeContentKind;
import app.rive.semantics.SemanticNodeState;
import app.rive.semantics.SemanticRole;
import app.rive.semantics.SemanticToggleState;
import defpackage.aou;
import defpackage.aow;
import defpackage.aox;
import defpackage.aoz;
import defpackage.atqq;
import defpackage.awmj;
import defpackage.awrc;
import defpackage.wg;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposeSemanticNodeMappingKt {

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SemanticRole.values().length];
            try {
                iArr[SemanticRole.Button.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticRole.Checkbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticRole.SwitchControl.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticRole.Slider.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.None.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.TextField.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticNodeContentKind.values().length];
            try {
                iArr2[SemanticNodeContentKind.General.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticNodeContentKind.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticNodeContentKind.TextField.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ComposeSemanticNodeContainer.values().length];
            try {
                iArr3[ComposeSemanticNodeContainer.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Group.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Collection.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.SelectableGroup.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Dialog.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SemanticToggleState.values().length];
            try {
                iArr4[SemanticToggleState.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[SemanticToggleState.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[SemanticToggleState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void applySemanticNodeContainer(aow aowVar, ComposeSemanticNodeContainer composeSemanticNodeContainer) {
        aowVar.getClass();
        composeSemanticNodeContainer.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        ComposeSemanticNodeContainer composeSemanticNodeContainer2 = ComposeSemanticNodeContainer.None;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        int iOrdinal = composeSemanticNodeContainer.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                aowVar.a();
                return;
            }
            if (iOrdinal == 2) {
                aowVar.a();
                aowVar.a();
            } else if (iOrdinal == 3) {
                aowVar.a();
                aowVar.a();
            } else {
                if (iOrdinal != 4) {
                    throw new awmj();
                }
                aowVar.a();
                aowVar.a();
            }
        }
    }

    public static final void applySemanticNodeContent(aow aowVar, SemanticNodeContent semanticNodeContent) {
        aowVar.getClass();
        semanticNodeContent.getClass();
        SemanticNodeContentKind kind = semanticNodeContent.getKind();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        ComposeSemanticNodeContainer composeSemanticNodeContainer = ComposeSemanticNodeContainer.None;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        int iOrdinal = kind.ordinal();
        if (iOrdinal == 0) {
            String label = semanticNodeContent.getLabel();
            if (label != null) {
                wg.b(aowVar, label);
            }
            if (joinContentDescriptions(semanticNodeContent.getValue(), semanticNodeContent.getHint()) != null) {
                aowVar.a();
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            String label2 = semanticNodeContent.getLabel();
            if (label2 != null) {
                Collections.singletonList(new aoz(null, label2)).getClass();
                aowVar.a();
            }
            if (joinContentDescriptions(semanticNodeContent.getValue(), semanticNodeContent.getHint()) != null) {
                aowVar.a();
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            throw new awmj();
        }
        String label3 = semanticNodeContent.getLabel();
        if (label3 != null) {
            wg.b(aowVar, label3);
        }
        String value = semanticNodeContent.getValue();
        if (value == null) {
            value = "";
        }
        new aoz(null, value);
        aowVar.a();
        if (semanticNodeContent.getHint() != null) {
            aowVar.a();
        }
        if (semanticNodeContent.isObscured()) {
            aowVar.a();
            aowVar.a();
            aowVar.a();
        }
    }

    public static final void applySemanticNodeState(aow aowVar, SemanticNodeState semanticNodeState) {
        aowVar.getClass();
        semanticNodeState.getClass();
        if (semanticNodeState.getLiveRegion()) {
            aowVar.a();
        }
        if (awrc.c(semanticNodeState.getEnabled(), Boolean.FALSE)) {
            aowVar.a();
        }
        Boolean selected = semanticNodeState.getSelected();
        if (selected != null) {
            selected.booleanValue();
            aowVar.a();
        }
        SemanticToggleState toggleState = semanticNodeState.getToggleState();
        if (toggleState != null) {
            toComposeToggleableState(toggleState);
            aowVar.a();
        }
    }

    public static final void applySemanticNodeTraversal(aow aowVar, int i) {
        aowVar.getClass();
        aowVar.a();
    }

    private static final String joinContentDescriptions(String str, String str2) {
        String strAD = atqq.aD(atqq.aQ(new String[]{str, str2}), ", ", null, null, null, 62);
        if (strAD.length() == 0) {
            return null;
        }
        return strAD;
    }

    public static final aou toComposeRole(SemanticRole semanticRole) {
        semanticRole.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        ComposeSemanticNodeContainer composeSemanticNodeContainer = ComposeSemanticNodeContainer.None;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        switch (semanticRole) {
            case None:
            case Link:
            case TextField:
            case Text:
            case Group:
            case List:
            case ListItem:
            case TabList:
            case Dialog:
            case AlertDialog:
            case RadioGroup:
                return null;
            case Button:
                return new aou(0);
            case Checkbox:
                return new aou(1);
            case SwitchControl:
                return new aou(2);
            case Slider:
                return new aou(7);
            case Image:
                return new aou(5);
            case Tab:
                return new aou(4);
            case RadioButton:
                return new aou(3);
            default:
                throw new awmj();
        }
    }

    public static final ComposeSemanticNodeContainer toComposeSemanticNodeContainer(SemanticRole semanticRole) {
        semanticRole.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        ComposeSemanticNodeContainer composeSemanticNodeContainer = ComposeSemanticNodeContainer.None;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        switch (semanticRole) {
            case None:
            case Button:
            case Link:
            case Checkbox:
            case SwitchControl:
            case Slider:
            case TextField:
            case Text:
            case Image:
            case ListItem:
            case Tab:
            case RadioButton:
                return ComposeSemanticNodeContainer.None;
            case Group:
                return ComposeSemanticNodeContainer.Group;
            case List:
                return ComposeSemanticNodeContainer.Collection;
            case TabList:
            case RadioGroup:
                return ComposeSemanticNodeContainer.SelectableGroup;
            case Dialog:
            case AlertDialog:
                return ComposeSemanticNodeContainer.Dialog;
            default:
                throw new awmj();
        }
    }

    private static final aox toComposeToggleableState(SemanticToggleState semanticToggleState) {
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        ComposeSemanticNodeContainer composeSemanticNodeContainer = ComposeSemanticNodeContainer.None;
        SemanticToggleState semanticToggleState2 = SemanticToggleState.Off;
        int iOrdinal = semanticToggleState.ordinal();
        if (iOrdinal == 0) {
            return aox.b;
        }
        if (iOrdinal == 1) {
            return aox.a;
        }
        if (iOrdinal == 2) {
            return aox.c;
        }
        throw new awmj();
    }
}
