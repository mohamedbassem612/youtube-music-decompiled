package defpackage;

import android.net.Uri;
import android.webkit.PermissionRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aehf extends PermissionRequest {
    private final PermissionRequest a;
    private final agkz b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public aehf(PermissionRequest permissionRequest, Set set) {
        this.a = permissionRequest;
        set.getClass();
        this.b = agkz.n(set);
    }

    @Override // android.webkit.PermissionRequest
    public final void deny() {
        if (this.c.compareAndSet(false, true)) {
            this.a.deny();
        } else {
            ((agrc) ((agrc) aehg.e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient$SafePermissionRequest", "deny", 412, "WebViewControllerV2WebChromeClient.java")).t("SafePermissionRequest: deny() called after request was already handled. Ignoring.");
        }
    }

    @Override // android.webkit.PermissionRequest
    public final Uri getOrigin() {
        return this.a.getOrigin();
    }

    @Override // android.webkit.PermissionRequest
    public final String[] getResources() {
        return (String[]) this.b.toArray(new String[0]);
    }

    @Override // android.webkit.PermissionRequest
    public final void grant(String[] strArr) {
        int length;
        if (!this.c.compareAndSet(false, true)) {
            ((agrc) ((agrc) aehg.e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient$SafePermissionRequest", "grant", 378, "WebViewControllerV2WebChromeClient.java")).t("SafePermissionRequest: grant() called after request was already handled. Ignoring.");
            return;
        }
        if (strArr == null) {
            this.a.deny();
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (true) {
            length = strArr.length;
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (str != null && this.b.contains(str)) {
                linkedHashSet.add(str);
            }
            i++;
        }
        if (linkedHashSet.isEmpty()) {
            ((agrc) ((agrc) aehg.e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient$SafePermissionRequest", "grant", 393, "WebViewControllerV2WebChromeClient.java")).x("SafePermissionRequest: Attempted to grant %d resources, but none matched allowlist (size %d). Denying.", length, this.b.size());
            this.a.deny();
        } else {
            if (linkedHashSet.size() < length) {
                ((agrc) ((agrc) aehg.e.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewControllerV2WebChromeClient$SafePermissionRequest", "grant", 400, "WebViewControllerV2WebChromeClient.java")).x("SafePermissionRequest: Filtered granted resources from count %d to allowlisted subset count %d.", length, linkedHashSet.size());
            }
            this.a.grant((String[]) linkedHashSet.toArray(new String[0]));
        }
    }
}
