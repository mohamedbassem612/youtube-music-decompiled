package app.rive.semantics;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.awmj;
import defpackage.bby;
import defpackage.bbz;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSemanticNodeMappingKt {

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
                iArr[SemanticRole.TextField.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.None.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticToggleState.values().length];
            try {
                iArr2[SemanticToggleState.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticToggleState.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticToggleState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SemanticActionType.values().length];
            try {
                iArr3[SemanticActionType.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[SemanticActionType.Increase.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[SemanticActionType.Decrease.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SemanticNodeContentKind.values().length];
            try {
                iArr4[SemanticNodeContentKind.General.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[SemanticNodeContentKind.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[SemanticNodeContentKind.TextField.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void applySemanticNodeActions(bbz bbzVar, SemanticNodeActions semanticNodeActions) {
        bbzVar.getClass();
        semanticNodeActions.getClass();
        bbzVar.w(semanticNodeActions.getSemanticActions().contains(SemanticActionType.Tap));
        Iterator it = semanticNodeActions.getSemanticActions().iterator();
        while (it.hasNext()) {
            bbzVar.k(new bby(null, toAndroidAccessibilityActionId((SemanticActionType) it.next()), null, null, null));
        }
    }

    public static final void applySemanticNodeContent(bbz bbzVar, SemanticNodeContent semanticNodeContent) {
        bbzVar.getClass();
        semanticNodeContent.getClass();
        SemanticNodeContentKind kind = semanticNodeContent.getKind();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        SemanticActionType semanticActionType = SemanticActionType.Tap;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        int iOrdinal = kind.ordinal();
        if (iOrdinal == 0) {
            bbzVar.z(semanticNodeContent.getLabel());
            bbzVar.N(semanticNodeContent.getValue());
        } else if (iOrdinal == 1) {
            bbzVar.O(semanticNodeContent.getLabel());
            bbzVar.N(semanticNodeContent.getValue());
        } else {
            if (iOrdinal != 2) {
                throw new awmj();
            }
            bbzVar.z(semanticNodeContent.getLabel());
            bbzVar.O(semanticNodeContent.getValue());
            AccessibilityNodeInfo accessibilityNodeInfo = bbzVar.a;
            accessibilityNodeInfo.setEditable(false);
            accessibilityNodeInfo.setPassword(semanticNodeContent.isObscured());
            boolean zIsObscured = semanticNodeContent.isObscured();
            if (Build.VERSION.SDK_INT >= 34) {
                accessibilityNodeInfo.setAccessibilityDataSensitive(zIsObscured);
            } else {
                bbzVar.p(64, zIsObscured);
            }
            bbzVar.G(semanticNodeContent.isMultiline());
        }
        String hint = semanticNodeContent.getHint();
        if (Build.VERSION.SDK_INT >= 36) {
            bbzVar.a.setSupplementalDescription(hint);
        } else {
            bbzVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", hint);
        }
    }

    public static final void applySemanticNodeHeading(bbz bbzVar, int i) {
        bbzVar.getClass();
        bbzVar.E(isAndroidAccessibilityHeading(i));
    }

    public static final void applySemanticNodeRole(bbz bbzVar, SemanticRole semanticRole) {
        bbzVar.getClass();
        semanticRole.getClass();
        String androidAccessibilityClassName = toAndroidAccessibilityClassName(semanticRole);
        if (androidAccessibilityClassName != null) {
            bbzVar.v(androidAccessibilityClassName);
        }
    }

    public static final void applySemanticNodeState(bbz bbzVar, SemanticNodeState semanticNodeState) {
        bbzVar.getClass();
        semanticNodeState.getClass();
        Integer androidAccessibilityExpandedState = toAndroidAccessibilityExpandedState(semanticNodeState);
        if (androidAccessibilityExpandedState != null) {
            int iIntValue = androidAccessibilityExpandedState.intValue();
            if (Build.VERSION.SDK_INT >= 36) {
                bbzVar.a.setExpandedState(iIntValue);
            } else {
                bbzVar.a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", iIntValue);
            }
        }
        Boolean selected = semanticNodeState.getSelected();
        if (selected != null) {
            bbzVar.a.setSelected(selected.booleanValue());
        }
        SemanticToggleState toggleState = semanticNodeState.getToggleState();
        if (toggleState != null) {
            bbzVar.s(true);
            bbzVar.t(toAndroidAccessibilityCheckedState(toggleState));
        }
        Boolean required = semanticNodeState.getRequired();
        if (required != null) {
            boolean zBooleanValue = required.booleanValue();
            if (Build.VERSION.SDK_INT >= 36) {
                bbzVar.a.setFieldRequired(zBooleanValue);
            } else {
                bbzVar.a.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", zBooleanValue);
            }
        }
        Boolean enabled = semanticNodeState.getEnabled();
        if (enabled != null) {
            bbzVar.B(enabled.booleanValue());
        }
        bbzVar.a.setLiveRegion(toAndroidAccessibilityLiveRegion(semanticNodeState));
    }

    public static final boolean isAndroidAccessibilityHeading(int i) {
        return i > 0;
    }

    public static final int toAndroidAccessibilityActionId(SemanticActionType semanticActionType) {
        semanticActionType.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        SemanticActionType semanticActionType2 = SemanticActionType.Tap;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        int iOrdinal = semanticActionType.ordinal();
        if (iOrdinal == 0) {
            return 16;
        }
        if (iOrdinal == 1) {
            return SemanticState.Obscured;
        }
        if (iOrdinal == 2) {
            return SemanticState.Multiline;
        }
        throw new awmj();
    }

    public static final int toAndroidAccessibilityCheckedState(SemanticToggleState semanticToggleState) {
        semanticToggleState.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticToggleState semanticToggleState2 = SemanticToggleState.Off;
        SemanticActionType semanticActionType = SemanticActionType.Tap;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        int iOrdinal = semanticToggleState.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            throw new awmj();
        }
        return 2;
    }

    public static final String toAndroidAccessibilityClassName(SemanticRole semanticRole) {
        semanticRole.getClass();
        SemanticRole.Companion companion = SemanticRole.Companion;
        SemanticToggleState semanticToggleState = SemanticToggleState.Off;
        SemanticActionType semanticActionType = SemanticActionType.Tap;
        SemanticNodeContentKind semanticNodeContentKind = SemanticNodeContentKind.General;
        switch (semanticRole) {
            case None:
            case Link:
            case Group:
            case ListItem:
            case Tab:
            case TabList:
            case Dialog:
            case AlertDialog:
                return null;
            case Button:
                return "android.widget.Button";
            case Checkbox:
                return "android.widget.CheckBox";
            case SwitchControl:
                return "android.widget.Switch";
            case Slider:
                return "android.widget.SeekBar";
            case TextField:
                return "android.widget.EditText";
            case Text:
                return "android.widget.TextView";
            case Image:
                return "android.widget.ImageView";
            case List:
                return "android.widget.ListView";
            case RadioGroup:
                return "android.widget.RadioGroup";
            case RadioButton:
                return "android.widget.RadioButton";
            default:
                throw new awmj();
        }
    }

    public static final Integer toAndroidAccessibilityExpandedState(SemanticNodeState semanticNodeState) {
        semanticNodeState.getClass();
        Boolean expanded = semanticNodeState.getExpanded();
        if (expanded != null) {
            return Integer.valueOf(true == expanded.booleanValue() ? 3 : 1);
        }
        return null;
    }

    public static final int toAndroidAccessibilityLiveRegion(SemanticNodeState semanticNodeState) {
        semanticNodeState.getClass();
        return semanticNodeState.getLiveRegion() ? 1 : 0;
    }
}
