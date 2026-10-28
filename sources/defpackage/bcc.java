package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bcc {
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public bcc() {
        this.mProvider = new bcb(this);
    }

    public bbz createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public bbz findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public bcc(Object obj) {
        this.mProvider = obj;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, bbz bbzVar, String str, Bundle bundle) {
    }
}
