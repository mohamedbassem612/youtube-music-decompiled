package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avc {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public avc(avb avbVar) {
        this.a = avbVar.a;
        this.b = avbVar.b;
        this.c = avbVar.c;
        this.d = avbVar.d;
        this.e = avbVar.e;
        this.f = avbVar.f;
    }

    public static avc b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        avb avbVar = new avb();
        avbVar.a = bundle.getCharSequence("name");
        avbVar.b = bundle2 != null ? IconCompat.e(bundle2) : null;
        avbVar.c = bundle.getString("uri");
        avbVar.d = bundle.getString("key");
        avbVar.e = bundle.getBoolean("isBot");
        avbVar.f = bundle.getBoolean("isImportant");
        return new avc(avbVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.d() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof avc)) {
            return false;
        }
        avc avcVar = (avc) obj;
        String str = this.d;
        String str2 = avcVar.d;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (!Objects.equals(Objects.toString(this.a), Objects.toString(avcVar.a)) || !Objects.equals(this.c, avcVar.c)) {
            return false;
        }
        if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(avcVar.e))) {
            return Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(avcVar.f));
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
