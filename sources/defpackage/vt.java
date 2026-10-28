package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vt extends vv implements Iterator {
    final /* synthetic */ vw a;
    private vs b;
    private boolean c = true;

    public vt(vw vwVar) {
        this.a = vwVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        vs vsVar;
        if (this.c) {
            this.c = false;
            vsVar = this.a.a;
        } else {
            vs vsVar2 = this.b;
            vsVar = vsVar2 != null ? vsVar2.c : null;
        }
        this.b = vsVar;
        return vsVar;
    }

    @Override // defpackage.vv
    public final void b(vs vsVar) {
        vs vsVar2 = this.b;
        if (vsVar == vsVar2) {
            vs vsVar3 = vsVar2.d;
            this.b = vsVar3;
            this.c = vsVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.c) {
            vs vsVar = this.b;
            if (vsVar != null && vsVar.c != null) {
                return true;
            }
        } else if (this.a.a != null) {
            return true;
        }
        return false;
    }
}
