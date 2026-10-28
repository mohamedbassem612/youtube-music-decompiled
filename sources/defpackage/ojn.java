package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojn {
    public Uri a;
    public String b;
    public ojv c;
    public final agev d;
    public int e;
    public agke f;
    public String g;
    public final agev h;
    public final agev i;
    public boolean j;
    public boolean k;
    public aifv l;
    public byte m;

    public ojn() {
        agdf agdfVar = agdf.a;
        this.d = agdfVar;
        this.h = agdfVar;
        this.i = agdfVar;
    }

    public final void a(ojv ojvVar) {
        if (ojvVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.c = ojvVar;
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.f = agkeVar;
    }

    public final void c(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 4);
    }
}
