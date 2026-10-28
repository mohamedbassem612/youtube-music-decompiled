package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class axiz implements Comparable, Serializable {
    private static final long serialVersionUID = 1;

    public abstract Object a();

    public abstract Object b();

    public abstract Object c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        axiz axizVar = (axiz) obj;
        abh abhVar = new abh((char[]) null);
        abhVar.c(a(), axizVar.a());
        abhVar.c(b(), axizVar.b());
        abhVar.c(c(), axizVar.c());
        return abhVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axiz) {
            axiz axizVar = (axiz) obj;
            if (Objects.equals(a(), axizVar.a()) && Objects.equals(b(), axizVar.b()) && Objects.equals(c(), axizVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(a()) ^ Objects.hashCode(b())) ^ Objects.hashCode(c());
    }

    public final String toString() {
        return "(" + String.valueOf(a()) + ',' + b().toString() + ',' + c().toString() + ')';
    }
}
