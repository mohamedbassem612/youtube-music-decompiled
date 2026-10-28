package defpackage;

import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hej implements Parcelable, hek {
    public ajwo f;
    public hei g = hei.a;
    public Object h;
    public String i;
    protected int j;
    public String k;
    public boolean l;
    public Map m;
    public Throwable n;

    @Override // defpackage.hek
    public final String f() {
        String str = this.k;
        str.getClass();
        return str;
    }

    public final void g() {
        this.j = 0;
    }

    public final void h(int i) {
        this.j |= i;
    }

    @Override // defpackage.hek
    public final void i(String str) {
        this.k = str;
    }

    public final void j(ajwo ajwoVar) {
        ajwoVar.getClass();
        this.f = ajwoVar;
    }

    public final void k(hei heiVar) {
        this.g = heiVar;
        if (heiVar.ordinal() > hei.b.ordinal()) {
            g();
        }
    }

    public final boolean l(int i) {
        return (this.j & i) != 0;
    }

    @Override // defpackage.hek
    public final boolean m() {
        return !ahno.aa(this.k);
    }

    @Override // defpackage.hek
    public final boolean n() {
        return this.g == hei.c;
    }

    public final void o() {
        this.l = true;
    }
}
