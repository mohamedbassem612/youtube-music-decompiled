package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atn {
    public final Bundle a;
    public boolean b;
    public boolean c;

    @Deprecated
    public int d;
    public CharSequence e;
    public PendingIntent f;
    public final aamo[] g;
    private IconCompat h;

    public atn(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, aamo[] aamoVarArr) {
        this.c = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.d = iconCompat.a();
        }
        this.e = atr.c(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = aamoVarArr;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.h;
        if (iconCompat != null || (i = this.d) == 0) {
            return iconCompat;
        }
        IconCompat iconCompatG = IconCompat.g(null, "", i);
        this.h = iconCompatG;
        return iconCompatG;
    }

    public atn(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.g(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null);
    }
}
