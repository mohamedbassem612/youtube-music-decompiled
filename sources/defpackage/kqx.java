package defpackage;

import android.content.ComponentName;
import android.os.UserHandle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqx {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;
    public final UserHandle f;

    public kqx(ComponentName componentName) {
        this.a = null;
        this.b = null;
        if (componentName == null) {
            throw new NullPointerException("null reference");
        }
        this.c = componentName;
        this.d = 4225;
        this.e = false;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kqx) {
            kqx kqxVar = (kqx) obj;
            if (Objects.equals(this.a, kqxVar.a) && Objects.equals(this.b, kqxVar.b) && Objects.equals(this.c, kqxVar.c)) {
                int i = kqxVar.d;
                if (this.e == kqxVar.e) {
                    UserHandle userHandle = kqxVar.f;
                    if (Objects.equals(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, 4225, Boolean.valueOf(this.e), null);
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        kro.l(componentName);
        return componentName.flattenToString();
    }

    public kqx(String str, boolean z) {
        kro.i(str);
        this.a = str;
        kro.i("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = 4225;
        this.e = z;
        this.f = null;
    }
}
