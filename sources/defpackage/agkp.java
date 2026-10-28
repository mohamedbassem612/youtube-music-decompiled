package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agkp extends agho implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient agkj map;
    final transient int size;

    public agkp(agkj agkjVar, int i) {
        this.map = agkjVar;
        this.size = i;
    }

    @Override // defpackage.agom
    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    @Override // defpackage.agom
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public agjw j() {
        return new agko(this);
    }

    @Override // defpackage.agom
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final agkz q() {
        return this.map.keySet();
    }

    @Override // defpackage.agom
    public final int h() {
        return this.size;
    }

    @Override // defpackage.aghh
    public final /* synthetic */ Iterator k() {
        return new agkm(this);
    }

    @Override // defpackage.agom
    public /* synthetic */ Map n() {
        return this.map;
    }

    @Override // defpackage.agom
    @Deprecated
    public final void r() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agom
    public final boolean t(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.aghh, defpackage.agom
    @Deprecated
    public final void u(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aghh, defpackage.agom
    @Deprecated
    public final boolean x(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aghh, defpackage.agom
    @Deprecated
    public final void y(agom agomVar) {
        throw null;
    }
}
