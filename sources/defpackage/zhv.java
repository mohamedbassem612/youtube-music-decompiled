package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhv {
    public Optional a;
    public zhw b;
    public String c;
    public Throwable d;
    public boolean e;
    private final String f;
    private final List g;
    private boolean h;

    public zhv(zhz zhzVar) {
        this.b = zhw.a;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.f = zhzVar.b;
        this.a = zhzVar.c;
        this.b = zhzVar.d;
        this.c = zhzVar.e;
        this.e = zhzVar.f;
        arrayList.addAll(zhzVar.h);
    }

    public final zhz a() {
        zhz zhzVar = new zhz(this.b, this.f, this.a, this.c, this.d, null, this.h);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            zhzVar.h.add(it.next());
        }
        if (this.e) {
            zhzVar.o();
        } else {
            zhzVar.p();
        }
        return zhzVar;
    }

    public final void b(Object obj) {
        this.g.add(obj);
    }

    public final void c(String str) {
        String str2 = this.c;
        this.c = (str2 != null ? str2.concat(";") : "").concat(str);
    }

    public final void d() {
        this.h = true;
    }

    public final void e(long j) {
        this.a = Optional.of(Long.valueOf(j));
    }

    public final void f(String str, String str2) {
        c(str + '.' + str2);
    }

    public zhv(String str) {
        this.b = zhw.a;
        this.g = new ArrayList();
        this.f = str;
        this.a = Optional.empty();
        this.e = zhz.i(str);
    }
}
