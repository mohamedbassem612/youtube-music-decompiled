package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aaqz {
    public final aaqx a;
    public final HashSet b;
    public final Object c;
    public aamu d;
    private int e;

    public aaqz(aaqx aaqxVar, HashSet hashSet) {
        this.a = aaqxVar;
        this.b = new HashSet(hashSet);
        this.c = aaqxVar;
    }

    public aamu a() {
        aamu aamuVar;
        Object obj = this.c;
        synchronized (obj) {
            aamuVar = this.d;
            if (aamuVar == null) {
                int iA = this.a.a();
                synchronized (obj) {
                    try {
                        aamuVar = new aamu(iA, this.b.size(), this.e);
                        this.d = aamuVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return aamuVar;
    }

    public void b(String str) {
        synchronized (this.c) {
            typ.f(str);
            this.b.add(str);
            this.a.d(str);
        }
    }

    public void c(Collection collection) {
        synchronized (this.c) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
        }
    }

    public boolean d(aamw aamwVar) {
        Object obj = this.c;
        synchronized (obj) {
            String strE = aarq.e(aamwVar.f);
            HashSet hashSet = this.b;
            int i = 0;
            if (!hashSet.contains(strE)) {
                return false;
            }
            if (!aamwVar.c()) {
                hashSet.remove(strE);
                if (hashSet.isEmpty()) {
                    this.a.c().clear();
                }
            }
            synchronized (obj) {
                try {
                    int iA = this.a.a();
                    if (iA > 0) {
                        int size = iA - hashSet.size();
                        if (size == iA) {
                            this.e = 100;
                        } else {
                            int iA2 = (size * 100) / iA;
                            if (aamwVar.c()) {
                                iA2 += aamwVar.a() / iA;
                            }
                            if (iA2 != 0) {
                                i = iA2;
                            } else if (aamwVar.d > 0) {
                                i = 1;
                            }
                            this.e = Math.min(99, i);
                        }
                    }
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }
}
