package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class brj {
    public int a;
    private final int b;
    private final int c;
    private final String d;
    private VolumeProvider e;

    public brj(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = str;
    }

    public final Object a() {
        brj brjVar;
        if (this.e == null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = this.b;
            if (i >= 30) {
                brjVar = this;
                brjVar.e = new brh(brjVar, i2, this.c, this.a, this.d);
            } else {
                brjVar = this;
                brjVar.e = new bri(brjVar, i2, brjVar.c, brjVar.a);
            }
        } else {
            brjVar = this;
        }
        return brjVar.e;
    }

    public void b(int i) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }
}
