package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class brf {
    brg a;

    public brf(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new brg(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof brf) {
            return this.a.equals(((brf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public brf(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                this.a = Build.VERSION.SDK_INT >= 28 ? new brg(str, i, i2, null) : new brg(str, i, i2);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
