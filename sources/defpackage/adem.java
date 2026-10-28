package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adem implements Runnable {
    public final String a;
    private final byte[] b;
    private final zsl c;
    private final nry d;
    private final nsl e;
    private final Optional f;
    private final Optional g;
    private final aqi h;

    public adem(byte[] bArr, String str, zsl zslVar, nry nryVar, nsl nslVar, Optional optional, Optional optional2, aqi aqiVar) {
        this.b = bArr;
        this.a = str;
        this.c = zslVar;
        this.d = nryVar;
        this.e = nslVar;
        this.f = optional;
        this.g = optional2;
        this.h = aqiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        try {
            drawable = (Drawable) this.c.d(this.b);
        } catch (IOException | tzn unused) {
            Optional optional = this.g;
            addb addbVar = new addb(this, 7);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).b(((adem) addbVar.a).a, "img_lerr");
            }
            adeo.e(this.e, this.d, this.f);
            drawable = null;
        }
        this.h.b(drawable);
    }
}
