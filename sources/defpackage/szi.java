package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szi implements Iterator {
    public szg a;
    private szg b;
    private szg d = null;
    private szg c = null;

    public szi(szg szgVar) {
        this.a = szgVar;
        this.b = szgVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final szg next() {
        szg szgVar = this.a;
        if (szgVar == null) {
            throw new NoSuchElementException();
        }
        this.c = this.d;
        this.d = szgVar;
        this.a = szgVar.d;
        return szgVar;
    }

    public final void b() {
        this.a = this.b;
        this.d = null;
        this.c = null;
    }

    public final void c(aftj aftjVar) {
        szg szgVar = this.d;
        remove();
        szg szgVar2 = szgVar.d;
        Object obj = aftjVar.a;
        if (obj == null) {
            aftjVar.a = szgVar;
            aftjVar.b = szgVar;
        } else {
            ((szg) obj).d = szgVar;
            aftjVar.a = szgVar;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        szg szgVar = this.d;
        szg szgVar2 = this.c;
        szg szgVar3 = this.a;
        if (szgVar2 == null) {
            this.b = szgVar3;
        } else {
            szgVar2.d = szgVar3;
        }
        this.d = szgVar2;
        szgVar.d = null;
    }
}
