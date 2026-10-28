package app.rive.semantics;

import android.os.Bundle;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.bbz;
import defpackage.bcc;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ActiveSemanticNodeProvider extends bcc {
    private final Function0 accessibilityFocusedVirtualNodeId;
    private final bcc delegate;
    private final Function0 inputFocusedVirtualNodeId;
    private final awqg isActiveVirtualNode;
    private final awqk onAccessibilityFocusChanged;
    private final Function0 synchronizeBeforeQuery;

    public ActiveSemanticNodeProvider(bcc bccVar, awqg awqgVar, Function0 function0, Function0 function1, Function0 function2, awqk awqkVar) {
        bccVar.getClass();
        awqgVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        awqkVar.getClass();
        this.delegate = bccVar;
        this.isActiveVirtualNode = awqgVar;
        this.accessibilityFocusedVirtualNodeId = function0;
        this.inputFocusedVirtualNodeId = function1;
        this.synchronizeBeforeQuery = function2;
        this.onAccessibilityFocusChanged = awqkVar;
    }

    private final boolean isAccessibilityFocusAction(int i) {
        return i == 64 || i == 128;
    }

    private final boolean isQueryable(int i) {
        this.synchronizeBeforeQuery.invoke();
        return i == -1 || ((Boolean) this.isActiveVirtualNode.invoke(Integer.valueOf(i))).booleanValue();
    }

    @Override // defpackage.bcc
    public void addExtraDataToAccessibilityNodeInfo(int i, bbz bbzVar, String str, Bundle bundle) {
        bbzVar.getClass();
        str.getClass();
        if (isQueryable(i)) {
            this.delegate.addExtraDataToAccessibilityNodeInfo(i, bbzVar, str, bundle);
        }
    }

    @Override // defpackage.bcc
    public bbz createAccessibilityNodeInfo(int i) {
        if (isQueryable(i)) {
            return this.delegate.createAccessibilityNodeInfo(i);
        }
        return null;
    }

    @Override // defpackage.bcc
    public List findAccessibilityNodeInfosByText(String str, int i) {
        str.getClass();
        if (isQueryable(i)) {
            return this.delegate.findAccessibilityNodeInfosByText(str, i);
        }
        return null;
    }

    @Override // defpackage.bcc
    public bbz findFocus(int i) {
        int iIntValue;
        this.synchronizeBeforeQuery.invoke();
        if (i == 1) {
            iIntValue = ((Number) this.inputFocusedVirtualNodeId.invoke()).intValue();
        } else {
            if (i != 2) {
                return this.delegate.findFocus(i);
            }
            iIntValue = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        }
        if (iIntValue == Integer.MIN_VALUE || ((Boolean) this.isActiveVirtualNode.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
            return this.delegate.findFocus(i);
        }
        return null;
    }

    @Override // defpackage.bcc
    public boolean performAction(int i, int i2, Bundle bundle) {
        if (!isQueryable(i)) {
            return false;
        }
        int iIntValue = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        boolean zPerformAction = this.delegate.performAction(i, i2, bundle);
        int iIntValue2 = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        if (!zPerformAction || iIntValue == iIntValue2 || !isAccessibilityFocusAction(i2)) {
            return zPerformAction;
        }
        this.onAccessibilityFocusChanged.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        return true;
    }
}
