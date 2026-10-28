package app.rive.semantics;

import defpackage.atqq;
import defpackage.awmj;
import defpackage.awnq;
import defpackage.awrc;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticNodeClassificationKt {
    private static final Set tapRoles = atqq.aS(new SemanticRole[]{SemanticRole.Button, SemanticRole.Link, SemanticRole.Checkbox, SemanticRole.SwitchControl, SemanticRole.Tab, SemanticRole.RadioButton});

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SemanticRole.values().length];
            try {
                iArr[SemanticRole.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.Button.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.Checkbox.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.SwitchControl.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Slider.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.TextField.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticNodeTopology.values().length];
            try {
                iArr2[SemanticNodeTopology.Structural.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticNodeTopology.ExplicitContainer.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticNodeTopology.AbsorbingLeaf.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SemanticCheckState.values().length];
            try {
                iArr3[SemanticCheckState.Unchecked.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[SemanticCheckState.Checked.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[SemanticCheckState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SemanticNodeProjection classifySemanticNodeProjection(SemanticRole semanticRole, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, float f, float f2, float f3, float f4) {
        semanticRole.getClass();
        semanticNodeContent.getClass();
        semanticNodeState.getClass();
        if (semanticNodeState.getHidden()) {
            return SemanticNodeProjection.PruneSubtree;
        }
        if (!hasFinitePositiveArea(f, f2, f3, f4)) {
            return SemanticNodeProjection.PromoteChildren;
        }
        SemanticNodeTopology semanticNodeTopology = toSemanticNodeTopology(semanticRole);
        SemanticNodeTopology semanticNodeTopology2 = SemanticNodeTopology.Structural;
        SemanticCheckState semanticCheckState = SemanticCheckState.Unchecked;
        int iOrdinal = semanticNodeTopology.ordinal();
        if (iOrdinal == 0) {
            return hasAccessibleContent(semanticNodeContent) ? SemanticNodeProjection.ExportContainer : SemanticNodeProjection.PromoteChildren;
        }
        if (iOrdinal == 1) {
            return SemanticNodeProjection.ExportContainer;
        }
        if (iOrdinal == 2) {
            return SemanticNodeProjection.ExportLeaf;
        }
        throw new awmj();
    }

    private static final Boolean gatedState(int i, int i2, int i3, int i4) {
        if (SemanticTrait.INSTANCE.has(i, i2)) {
            return Boolean.valueOf(SemanticState.INSTANCE.has(i3, i4));
        }
        return null;
    }

    private static final boolean hasAccessibleContent(SemanticNodeContent semanticNodeContent) {
        String label = semanticNodeContent.getLabel();
        if (label != null && label.length() != 0) {
            return true;
        }
        String value = semanticNodeContent.getValue();
        if (value != null && value.length() != 0) {
            return true;
        }
        String hint = semanticNodeContent.getHint();
        return (hint == null || hint.length() == 0) ? false : true;
    }

    private static final boolean hasFinitePositiveArea(float f, float f2, float f3, float f4) {
        return Math.abs(f) <= Float.MAX_VALUE && Math.abs(f2) <= Float.MAX_VALUE && Math.abs(f3) <= Float.MAX_VALUE && Math.abs(f4) <= Float.MAX_VALUE && f != f3 && f2 != f4;
    }

    public static final boolean isActiveModal(SemanticRole semanticRole, SemanticNodeState semanticNodeState) {
        semanticRole.getClass();
        semanticNodeState.getClass();
        if (semanticNodeState.getModal()) {
            return semanticRole == SemanticRole.Dialog || semanticRole == SemanticRole.AlertDialog;
        }
        return false;
    }

    public static final SemanticNodeActions mapSemanticNodeActions(SemanticRole semanticRole, SemanticNodeState semanticNodeState) {
        Set setAS;
        semanticRole.getClass();
        semanticNodeState.getClass();
        if (awrc.c(semanticNodeState.getEnabled(), Boolean.FALSE)) {
            setAS = awnq.a;
        } else if (tapRoles.contains(semanticRole)) {
            setAS = atqq.o(SemanticActionType.Tap);
        } else {
            setAS = semanticRole == SemanticRole.Slider ? atqq.aS(new SemanticActionType[]{SemanticActionType.Increase, SemanticActionType.Decrease}) : awnq.a;
        }
        return new SemanticNodeActions(setAS, semanticNodeState.getFocused() != null);
    }

    public static final SemanticNodeContent mapSemanticNodeContent(SemanticRole semanticRole, String str, String str2, String str3, SemanticNodeState semanticNodeState) {
        SemanticNodeContentKind semanticNodeContentKind;
        semanticRole.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        semanticNodeState.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeTopology semanticNodeTopology = SemanticNodeTopology.Structural;
        SemanticCheckState semanticCheckState = SemanticCheckState.Unchecked;
        int iOrdinal = semanticRole.ordinal();
        if (iOrdinal != 6) {
            semanticNodeContentKind = iOrdinal != 7 ? SemanticNodeContentKind.General : SemanticNodeContentKind.Text;
        } else {
            semanticNodeContentKind = SemanticNodeContentKind.TextField;
        }
        SemanticNodeContentKind semanticNodeContentKind2 = semanticNodeContentKind;
        boolean z = semanticNodeContentKind2 == SemanticNodeContentKind.TextField;
        boolean z2 = z && semanticNodeState.getObscured();
        if (str.length() == 0) {
            str = null;
        }
        return new SemanticNodeContent(semanticNodeContentKind2, str, (z2 || (!z && str2.length() == 0)) ? null : str2, str3.length() != 0 ? str3 : null, z && semanticNodeState.getReadOnly(), z2, z && semanticNodeState.getMultiline());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    public static final SemanticNodeState mapSemanticNodeState(int i, int i2) {
        SemanticToggleState semanticToggleState;
        SemanticToggleState semanticToggleState2;
        if (!SemanticTrait.INSTANCE.has(i, 4)) {
            if (SemanticTrait.INSTANCE.has(i, 8)) {
                semanticToggleState2 = SemanticState.INSTANCE.has(i2, 16) ? SemanticToggleState.On : SemanticToggleState.Off;
            } else {
                semanticToggleState = null;
            }
            Boolean boolGatedState = gatedState(i, 1, i2, 1);
            Boolean boolGatedState2 = gatedState(i, 2, i2, 2);
            Boolean boolGatedState3 = gatedState(i, 16, i2, 32);
            Boolean boolGatedState4 = gatedState(i, 32, i2, 64);
            return new SemanticNodeState(boolGatedState, boolGatedState2, semanticToggleState, boolGatedState3, boolGatedState4 != null ? Boolean.valueOf(!boolGatedState4.booleanValue()) : null, gatedState(i, 64, i2, SemanticState.Focused), SemanticState.INSTANCE.has(i2, SemanticState.Hidden), SemanticState.INSTANCE.has(i2, SemanticState.LiveRegion), SemanticState.INSTANCE.has(i2, SemanticState.ReadOnly), SemanticState.INSTANCE.has(i2, SemanticState.Modal), SemanticState.INSTANCE.has(i2, SemanticState.Obscured), SemanticState.INSTANCE.has(i2, SemanticState.Multiline));
        }
        SemanticCheckState semanticCheckStateCheckState = SemanticState.INSTANCE.checkState(i2);
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeTopology semanticNodeTopology = SemanticNodeTopology.Structural;
        SemanticCheckState semanticCheckState = SemanticCheckState.Unchecked;
        int iOrdinal = semanticCheckStateCheckState.ordinal();
        if (iOrdinal == 0) {
            semanticToggleState2 = SemanticToggleState.Off;
        } else if (iOrdinal == 1) {
            semanticToggleState2 = SemanticToggleState.On;
        } else {
            if (iOrdinal != 2) {
                throw new awmj();
            }
            semanticToggleState2 = SemanticToggleState.Mixed;
        }
        semanticToggleState = semanticToggleState2;
        Boolean boolGatedState5 = gatedState(i, 1, i2, 1);
        Boolean boolGatedState6 = gatedState(i, 2, i2, 2);
        Boolean boolGatedState7 = gatedState(i, 16, i2, 32);
        Boolean boolGatedState8 = gatedState(i, 32, i2, 64);
        return new SemanticNodeState(boolGatedState5, boolGatedState6, semanticToggleState, boolGatedState7, boolGatedState8 != null ? Boolean.valueOf(!boolGatedState8.booleanValue()) : null, gatedState(i, 64, i2, SemanticState.Focused), SemanticState.INSTANCE.has(i2, SemanticState.Hidden), SemanticState.INSTANCE.has(i2, SemanticState.LiveRegion), SemanticState.INSTANCE.has(i2, SemanticState.ReadOnly), SemanticState.INSTANCE.has(i2, SemanticState.Modal), SemanticState.INSTANCE.has(i2, SemanticState.Obscured), SemanticState.INSTANCE.has(i2, SemanticState.Multiline));
    }

    public static final SemanticNodeTopology toSemanticNodeTopology(SemanticRole semanticRole) {
        semanticRole.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticNodeTopology semanticNodeTopology = SemanticNodeTopology.Structural;
        SemanticCheckState semanticCheckState = SemanticCheckState.Unchecked;
        switch (semanticRole) {
            case None:
                return SemanticNodeTopology.Structural;
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
                return SemanticNodeTopology.AbsorbingLeaf;
            case Group:
            case List:
            case TabList:
            case Dialog:
            case AlertDialog:
            case RadioGroup:
                return SemanticNodeTopology.ExplicitContainer;
            default:
                throw new awmj();
        }
    }
}
