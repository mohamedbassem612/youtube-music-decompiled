package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bbk {
    static final bbn i;
    final bbn j;

    static {
        bbb bavVar;
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba();
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz();
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay();
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax();
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw();
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav() : new bau();
        }
        i = bavVar.a().k().l().m();
    }

    public bbk(bbn bbnVar) {
        this.j = bbnVar;
    }

    public boolean A() {
        return false;
    }

    public ayi B() {
        return null;
    }

    public bbn C() {
        return this.j;
    }

    public avw D() {
        return d();
    }

    public avw E() {
        return d();
    }

    public avw F() {
        return d();
    }

    public avw a(int i2) {
        return avw.a;
    }

    public avw c(int i2) {
        if ((i2 & 8) == 0) {
            return avw.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public avw d() {
        return avw.a;
    }

    public bbn e(int i2, int i3, int i4, int i5) {
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbk) {
            bbk bbkVar = (bbk) obj;
            if (s() == bbkVar.s() && A() == bbkVar.A() && Objects.equals(d(), bbkVar.d()) && Objects.equals(w(), bbkVar.w()) && Objects.equals(B(), bbkVar.B())) {
                return true;
            }
        }
        return false;
    }

    public List f(int i2) {
        return Collections.EMPTY_LIST;
    }

    public List g(int i2) {
        return Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(A()), d(), w(), B());
    }

    public boolean s() {
        return false;
    }

    public boolean u(int i2) {
        return true;
    }

    public avw w() {
        return avw.a;
    }

    public bbn x() {
        return this.j;
    }

    public bbn y() {
        return this.j;
    }

    public void k() {
    }

    public void h(View view) {
    }

    public void i(bbn bbnVar) {
    }

    public void j(View view) {
    }

    public void l(ayk aykVar) {
    }

    public void m(avw[] avwVarArr) {
    }

    public void n(avw avwVar) {
    }

    public void o(bbn bbnVar) {
    }

    public void p(int i2) {
    }

    public void q(Rect[][] rectArr) {
    }

    public void r(Rect[][] rectArr) {
    }

    public void z(avw avwVar) {
    }
}
