package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewd {
    public final axr a;
    public final List b;
    public final String c;

    public ewd(Class cls, Class cls2, Class cls3, List list, axr axrVar) {
        this.a = axrVar;
        gzj.bL(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + '}';
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
