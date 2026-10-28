package defpackage;

import com.google.android.libraries.youtube.media.interfaces.AutocropFormat;
import com.google.android.libraries.youtube.media.interfaces.AutocropFrame;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdk {
    private final AutocropFrame a;
    private final AutocropFormat b;

    public zdk(AutocropFrame autocropFrame, AutocropFormat autocropFormat) {
        this.a = autocropFrame;
        this.b = autocropFormat;
    }

    public final int a() {
        return this.a.getHeight();
    }

    public final int b() {
        return this.a.getWidth();
    }

    public final int c() {
        return this.a.getX();
    }

    public final int d() {
        return this.a.getY();
    }

    public final int e() {
        return this.b.getHeight();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zdk) {
            zdk zdkVar = (zdk) obj;
            if (c() == zdkVar.c() && d() == zdkVar.d() && b() == zdkVar.b() && a() == zdkVar.a() && f() == zdkVar.f() && e() == zdkVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.b.getWidth();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(b()), Integer.valueOf(a()), Integer.valueOf(f()), Integer.valueOf(e()));
    }

    public final String toString() {
        return String.format("%s\n%s", this.a, this.b);
    }
}
