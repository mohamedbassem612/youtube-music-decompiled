package defpackage;

import com.google.vr.ndk.base.GvrApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujw {
    private final long a;

    public aujw(long j) {
        this.a = j;
    }

    public final boolean a(aujv aujvVar) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.a, aujvVar.c);
    }
}
