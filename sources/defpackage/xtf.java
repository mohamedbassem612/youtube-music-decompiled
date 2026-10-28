package defpackage;

import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xtf extends et implements xtq {
    public String d;
    public String e;
    public Bitmap f;
    public IconCompat g;
    public boolean h;
    public abuz i;

    public xtf(xtf xtfVar) {
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = false;
        this.d = xtfVar.d;
        this.e = xtfVar.e;
        this.g = xtfVar.g;
        this.f = xtfVar.f;
        this.h = xtfVar.h;
        this.i = xtfVar.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtf)) {
            return false;
        }
        xtf xtfVar = (xtf) obj;
        return this.d.equals(xtfVar.d) && this.e.equals(xtfVar.e) && this.g == xtfVar.g && this.h == xtfVar.h;
    }

    public final void f() {
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.g, Boolean.valueOf(this.h));
    }

    public xtf() {
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = false;
    }
}
