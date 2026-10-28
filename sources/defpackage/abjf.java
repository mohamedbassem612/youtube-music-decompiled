package defpackage;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjf {
    public final Set a;
    public Object b;

    public abjf(awmd awmdVar) {
        this.b = (xgn) awmdVar.io();
        this.a = new HashSet();
    }

    public final boolean a(abke abkeVar) {
        return Objects.equals(this.b, abkeVar);
    }

    public final void b() {
        this.a.clear();
    }

    public abjf() {
        this.a = new CopyOnWriteArraySet();
    }
}
