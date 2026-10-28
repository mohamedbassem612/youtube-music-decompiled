package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agoa extends agjd {
    final /* synthetic */ Set a;

    public agoa(Set set) {
        this.a = set;
    }

    @Override // defpackage.agiy, defpackage.agjb
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.agiy, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agiy, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agjd, defpackage.agiy
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.agjd
    protected final Set c() {
        return this.a;
    }
}
