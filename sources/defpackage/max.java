package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class max implements agfr {
    public final List a = new ArrayList();
    public mav b;
    private final agfr c;

    public max(agfr agfrVar) {
        this.c = aguu.al(new jxq(this, agfrVar, 2));
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final maw io() {
        return (maw) this.c.io();
    }

    public final void c(Consumer consumer) {
        synchronized (this) {
            mav mavVar = this.b;
            if (mavVar != null) {
                consumer.r(mavVar);
            } else {
                this.a.add(consumer);
            }
        }
    }
}
