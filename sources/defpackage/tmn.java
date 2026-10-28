package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tmn implements tns {
    public final String a;
    public final tnr b;
    public final boolean c;
    public tnz d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Optional h;
    public final ainp i;
    public volatile agek j;
    public final int k;
    private final tng l;
    private List m;

    public tmn(int i, String str, tnr tnrVar, tng tngVar, boolean z, ainp ainpVar) {
        this.d = new tna();
        this.f = true;
        this.g = false;
        this.h = Optional.empty();
        this.k = i;
        this.a = str;
        this.b = tnrVar;
        this.l = tngVar;
        this.c = z;
        this.i = ainpVar;
    }

    @Override // defpackage.tns
    public final void A(agek agekVar) {
        this.j = agekVar;
    }

    @Override // defpackage.tns
    public final void B(tok tokVar) {
        this.h = Optional.of(tokVar);
    }

    @Override // defpackage.tns
    public final boolean C() {
        return this.g;
    }

    @Override // defpackage.tns
    public final boolean D() {
        return this.e;
    }

    @Override // defpackage.tns
    public boolean E() {
        return false;
    }

    @Override // defpackage.tns
    public boolean F() {
        return false;
    }

    @Override // defpackage.tns
    public final boolean G() {
        return this.f;
    }

    @Override // defpackage.tns
    public boolean H() {
        return false;
    }

    @Override // defpackage.tns
    public final boolean I() {
        return this.c;
    }

    @Override // defpackage.tns
    public boolean J() {
        return false;
    }

    @Override // defpackage.tns
    public final synchronized void K(Object obj) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(obj);
    }

    @Override // defpackage.tns
    public final List L() {
        return agpi.a;
    }

    @Override // defpackage.tns
    public final int M() {
        return this.k;
    }

    @Override // defpackage.tns
    public String ac() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // defpackage.tns
    public byte[] ae() {
        return null;
    }

    @Override // defpackage.tns
    public tnr af() {
        return this.b;
    }

    @Override // defpackage.tns
    public Map e() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.tns
    public final tnz h() {
        return this.d;
    }

    @Override // defpackage.tns
    public ListenableFuture j(Executor executor, tnm tnmVar, boolean z) {
        throw new UnsupportedOperationException("parseNetworkResponseAsync not implemented");
    }

    @Override // defpackage.tns
    public ListenableFuture k(Executor executor, tnm tnmVar, boolean z) {
        throw new UnsupportedOperationException("processNetworkResponse not implemented");
    }

    @Override // defpackage.tns
    public final ainp l() {
        return this.i;
    }

    @Override // defpackage.tns
    public aqrv m() {
        return aqrv.a;
    }

    @Override // defpackage.tns
    public Optional n() {
        return Optional.empty();
    }

    @Override // defpackage.tns
    public final Optional o() {
        return this.h;
    }

    @Override // defpackage.tns
    public final synchronized Object p(Class cls) {
        List list = this.m;
        if (list == null) {
            return null;
        }
        for (Object obj : list) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    @Override // defpackage.tns
    public String q() {
        return s();
    }

    @Override // defpackage.tns
    public String r() {
        return null;
    }

    @Override // defpackage.tns
    public String s() {
        return this.a;
    }

    @Override // defpackage.tns
    public final synchronized Collection t() {
        Collection collection;
        collection = this.m;
        if (collection == null) {
            collection = agpi.a;
        }
        return collection;
    }

    @Override // defpackage.tns
    public List u(tnm tnmVar) {
        return agpi.a;
    }

    @Override // defpackage.tns
    public List v() {
        StringBuilder sb = new StringBuilder("Basic CURL command:");
        for (Map.Entry entry : e().entrySet()) {
            sb.append("-H \"");
            sb.append((String) entry.getKey());
            sb.append(':');
            sb.append((String) entry.getValue());
            sb.append("\" ");
        }
        sb.append('\'');
        sb.append(s());
        sb.append('\'');
        return agke.q(sb.toString());
    }

    @Override // defpackage.tns
    @Deprecated
    public final void w() {
        this.e = true;
        agek agekVar = this.j;
        if (agekVar != null) {
            agekVar.apply(null);
        }
    }

    @Override // defpackage.tns
    public final void x() {
        this.j = null;
    }

    @Override // defpackage.tns
    public void y(toe toeVar) {
        tng tngVar = this.l;
        if (tngVar != null) {
            tngVar.jj(toeVar);
        }
    }

    @Override // defpackage.tns
    public final synchronized void z(Object obj) {
        List list = this.m;
        if (list != null) {
            list.remove(obj);
        }
    }

    @Override // defpackage.tns
    public final void N() {
    }

    @Override // defpackage.tns
    public final void O() {
    }

    @Override // defpackage.tns
    public toe i(toe toeVar) {
        return toeVar;
    }

    public tmn(int i, String str, tng tngVar) {
        this(i, str, tnr.b, tngVar, false, null);
    }
}
