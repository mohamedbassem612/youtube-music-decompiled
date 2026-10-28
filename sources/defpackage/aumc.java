package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aumc implements Iterator, Closeable, fgf {
    private static final fge a = new aumb();
    public fgd c;
    fge d = null;
    public long e = 0;
    public long f = 0;
    public final List g = new ArrayList();
    public aumd h;

    static {
        aumi.b(aumc.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fge next() {
        fge fgeVarA;
        fge fgeVar = this.d;
        if (fgeVar != null && fgeVar != a) {
            this.d = null;
            return fgeVar;
        }
        aumd aumdVar = this.h;
        if (aumdVar == null || this.e >= this.f) {
            this.d = a;
            throw new NoSuchElementException();
        }
        try {
            synchronized (aumdVar) {
                try {
                    this.h.d(this.e);
                    fgeVarA = this.c.a(this.h, this);
                    this.e = this.h.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fgeVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List f() {
        return (this.h == null || this.d == a) ? this.g : new aumh(this.g, this);
    }

    public final List g(Class cls) {
        ArrayList arrayList = new ArrayList(2);
        List listF = f();
        for (int i = 0; i < listF.size(); i++) {
            fge fgeVar = (fge) listF.get(i);
            if (cls.isInstance(fgeVar)) {
                arrayList.add(fgeVar);
            }
        }
        return arrayList;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fge fgeVar = this.d;
        if (fgeVar == a) {
            return false;
        }
        if (fgeVar == null) {
            try {
                this.d = next();
            } catch (NoSuchElementException unused) {
                this.d = a;
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                sb.append(']');
                return sb.toString();
            }
            if (i > 0) {
                sb.append(';');
            }
            sb.append(((fge) list.get(i)).toString());
            i++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
