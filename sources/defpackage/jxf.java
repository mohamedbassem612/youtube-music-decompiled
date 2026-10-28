package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxf implements Iterator {
    protected int a;
    public jxd b;
    public final Map[] c;
    final /* synthetic */ jxg d;

    public jxf(jxg jxgVar) {
        String[] strArr;
        this.d = jxgVar;
        Map[] mapArr = null;
        if (!jxgVar.a() && (strArr = jxgVar.i) != null) {
            mapArr = new Map[strArr.length];
        }
        this.c = mapArr;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jxe next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        jxg jxgVar = this.d;
        int i = this.a;
        jxe jxeVar = new jxe(jxgVar, i, this);
        this.a = i + 1;
        return jxeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        jxg jxgVar = this.d;
        return !jxgVar.a() && this.a < jxgVar.g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
