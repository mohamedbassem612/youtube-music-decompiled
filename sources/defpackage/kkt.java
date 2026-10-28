package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkt extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? kku.class : super.loadClass(str, z);
    }
}
