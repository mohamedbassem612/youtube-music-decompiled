package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agjd extends agiy implements Set {
    protected agjd() {
    }

    @Override // defpackage.agiy
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Set c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c().hashCode();
    }
}
