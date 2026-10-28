package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class agov extends aghh {
    final agom a;
    public final agof b;

    public agov(agom agomVar, agof agofVar) {
        agomVar.getClass();
        this.a = agomVar;
        this.b = agofVar;
    }

    public Collection a(Object obj, Collection collection) {
        afiq afiqVar = new afiq(this, obj, 3);
        return collection instanceof List ? aguu.u((List) collection, afiqVar) : new aghw(collection, afiqVar);
    }

    @Override // defpackage.agom
    public Collection c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.agom
    public final int h() {
        return this.a.h();
    }

    @Override // defpackage.agom
    public final Collection j() {
        return new agot(this);
    }

    @Override // defpackage.aghh
    public final Iterator k() {
        return new aglt(this.a.j().iterator(), aguu.l(this.b));
    }

    @Override // defpackage.agom
    public final Map n() {
        return new agoj(this.a.n(), new agor(this, 2));
    }

    @Override // defpackage.agom
    public final Set q() {
        return this.a.q();
    }

    @Override // defpackage.agom
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.agom
    public final boolean t(Object obj) {
        throw null;
    }

    @Override // defpackage.aghh, defpackage.agom
    public final void u(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aghh, defpackage.agom
    public final boolean w() {
        return this.a.w();
    }

    @Override // defpackage.aghh, defpackage.agom
    public final boolean x(Object obj, Object obj2) {
        return c(obj).remove(obj2);
    }

    @Override // defpackage.aghh, defpackage.agom
    public final void y(agom agomVar) {
        throw null;
    }
}
