package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agpd implements Comparator {
    protected agpd() {
    }

    public agpd a() {
        return new agpu(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
