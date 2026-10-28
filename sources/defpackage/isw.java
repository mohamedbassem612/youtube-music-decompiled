package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class isw {
    public Object a;
    public Object b;

    public isw(isx isxVar) {
        this.a = isxVar.a;
        this.b = isxVar.b;
    }

    public final isx a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new isx((String) obj2, (agke) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" playlistName");
        }
        if (this.b == null) {
            sb.append(" trackList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null playlistName");
        }
        this.a = str;
    }

    public final void c(List list) {
        this.b = agke.n(list);
    }

    public final void d(List list) {
        this.b = agke.n(list);
    }

    public final void e(List list) {
        this.a = agke.n(list);
    }

    public final Optional f() {
        Optional optionalOfNullable = Optional.ofNullable(this.b);
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((awku) optionalOfNullable.get()).N()) : optionalOfNullable;
    }

    public final void g() {
        Object obj = this.b;
        if (obj != null) {
            ((awku) obj).kn();
            this.b = null;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            ((awku) obj2).kn();
            this.a = null;
        }
    }

    public final void h(znf znfVar) {
        Object obj = this.b;
        if (obj != null) {
            ((awku) obj).kk(znfVar);
        }
    }

    public isw() {
    }
}
