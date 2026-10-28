package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nro extends DataSourceDelegate implements avmn {
    public final mna a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final Float j;
    public boolean k;
    public final omj l;
    public final omj m;
    private final DataSourceDelegate n;
    private final omj o;

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, nbm] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, ndw] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, ndw] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, ndw] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, ndr] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, ndr] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, ndr] */
    public nro(omj omjVar, nsl nslVar, DataSourceDelegate dataSourceDelegate, mna mnaVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4) {
        this.n = dataSourceDelegate;
        this.a = mnaVar;
        this.b = agevVar.g() ? agevVar.c().g() : -1;
        Float fValueOf = null;
        this.o = (agevVar.g() && agevVar.c().i()) ? omjVar.B(agevVar.c().h(), nslVar) : null;
        this.c = agevVar2.g() && agevVar2.c().i() && agevVar2.c().h();
        this.l = (agevVar2.g() && agevVar2.c().j()) ? omjVar.B(agevVar2.c().g(), nslVar) : null;
        this.d = agevVar3.g() && agevVar3.c().h();
        this.m = (agevVar3.g() && agevVar3.c().i()) ? omjVar.B(agevVar3.c().g(), nslVar) : null;
        this.e = agevVar4.g() && agevVar4.c().ab();
        this.f = agevVar4.g() && agevVar4.c().ad();
        int iAa = 10;
        if (agevVar4.g() && agevVar4.c().ag()) {
            iAa = agevVar4.c().aa();
        }
        this.h = iAa;
        this.i = (agevVar4.g() && agevVar4.c().ae()) ? Integer.valueOf(agevVar4.c().Z()) : null;
        if (agevVar4.g() && agevVar4.c().af()) {
            fValueOf = Float.valueOf(agevVar4.c().Y());
        }
        this.j = fValueOf;
        this.g = agevVar4.g() && agevVar4.c().ac();
        this.k = false;
    }

    public final CommandOuterClass$Command a() {
        omj omjVar = this.o;
        if (omjVar != null) {
            return omjVar.x();
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final void dispose() {
        this.k = true;
        this.a.a.clear();
        this.n.dispose();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    @Deprecated
    public final StatusOr elementAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesByKey(String str) {
        return this.n.elementBytesByKey(str);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.k;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final ArrayList identifiers() {
        return this.n.identifiers();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status loadMore() {
        return this.n.loadMore();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status moveItem(int i, int i2) {
        return this.n.moveItem(i, i2);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status reload() {
        return this.n.reload();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status removeItem(int i) {
        return this.n.removeItem(i);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final int size() {
        return this.n.size();
    }

    public nro() {
        throw null;
    }
}
