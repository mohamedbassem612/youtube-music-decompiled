package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahqj {
    public final Object a;
    public Object b;

    public ahqj() {
        this.a = new agwj(agwi.c);
        this.b = new agwj(agwi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final ahqk a() {
        ?? r1 = this.b;
        return new ahqk((String) this.a, r1 == 0 ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((Map) r1)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(ahqr.class, annotation);
    }

    public final afuy c() {
        return afty.o() ? afuy.d(((afvt) atqp.a(this.a, afvt.class)).bo()) : afux.a;
    }

    public final afvn d(String str) {
        if (afty.o()) {
            return null;
        }
        Object obj = this.a;
        return ahno.aC((Context) obj).b(170, str + ' ' + obj.getClass().getSimpleName(), afvf.a);
    }

    public final String e(String str) {
        return str + ' ' + this.a.getClass().getSimpleName();
    }

    public final void f() {
        this.b = null;
        afba.S(aewo.j((aess) this.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [avmn, java.lang.Object] */
    public final void g() {
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.dispose();
            this.b = null;
        }
    }

    public ahqj(String str) {
        this.b = null;
        this.a = str;
    }

    public ahqj(Object obj) {
        this.a = obj;
    }
}
