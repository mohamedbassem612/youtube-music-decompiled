package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxr {
    public final Supplier a;
    public final Supplier b;
    public final Supplier c;
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public boolean f;
    public boolean g;

    public yxr(Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.a = supplier;
        this.c = supplier2;
        this.b = supplier3;
    }

    public final void a() {
        this.f = true;
    }
}
