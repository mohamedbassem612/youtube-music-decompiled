package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ee extends Activity implements bog, ayl {
    private final aha extraDataMap = new aha(0);
    private final boh lifecycleRegistry = new boh(this);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        int i = 33;
        switch (str.hashCode()) {
            case -645125871:
                if (!str.equals("--translation")) {
                    return false;
                }
                i = 31;
                break;
                break;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                if (!str.equals("--contentcapture")) {
                    return false;
                }
                i = 29;
                break;
                break;
            case 1455016274:
                if (!str.equals("--autofill")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
        if (Build.VERSION.SDK_INT < i) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (bac.v(decorView, keyEvent)) {
            return true;
        }
        return aym.a(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (bac.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public ed getExtraData(Class cls) {
        cls.getClass();
        return (ed) this.extraDataMap.get(cls);
    }

    public boc getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = bow.a;
        bnz.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.lifecycleRegistry.f(bob.c);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(ed edVar) {
        edVar.getClass();
        this.extraDataMap.put(edVar.getClass(), edVar);
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // defpackage.ayl
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
