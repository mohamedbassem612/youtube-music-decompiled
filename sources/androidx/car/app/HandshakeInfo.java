package androidx.car.app;

import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public String getHostPackageName() {
        String str = this.mHostPackageName;
        str.getClass();
        return str;
    }

    public HandshakeInfo(String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }
}
