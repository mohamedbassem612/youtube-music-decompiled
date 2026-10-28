package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avmm implements avmn, avnq {
    awkm a;
    public volatile boolean b;

    public avmm(avmn... avmnVarArr) {
        this.a = new awkm(avmnVarArr.length + 1);
        for (avmn avmnVar : avmnVarArr) {
            avmnVar.getClass();
            this.a.a(avmnVar);
        }
    }

    static final void g(awkm awkmVar) {
        if (awkmVar != null) {
            ArrayList arrayList = null;
            for (Object obj : awkmVar.d) {
                if (obj instanceof avmn) {
                    try {
                        ((avmn) obj).dispose();
                    } catch (Throwable th) {
                        avkz.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new avmw(arrayList);
                }
                throw awkh.b((Throwable) arrayList.get(0));
            }
        }
    }

    public final int a() {
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    awkm awkmVar = this.a;
                    i = awkmVar != null ? awkmVar.b : 0;
                }
            }
        }
        return i;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                awkm awkmVar = this.a;
                this.a = null;
                g(awkmVar);
            }
        }
    }

    @Override // defpackage.avnq
    public final boolean c(avmn avmnVar) {
        avmnVar.getClass();
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    awkm awkmVar = this.a;
                    if (awkmVar == null) {
                        awkmVar = new awkm(16);
                        this.a = awkmVar;
                    }
                    awkmVar.a(avmnVar);
                    return true;
                }
            }
        }
        avmnVar.dispose();
        return false;
    }

    @Override // defpackage.avnq
    public final boolean d(avmn avmnVar) {
        Object obj;
        avmnVar.getClass();
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            awkm awkmVar = this.a;
            if (awkmVar != null) {
                Object[] objArr = awkmVar.d;
                int i = awkmVar.a;
                int iHashCode = avmnVar.hashCode() * (-1640531527);
                int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    if (obj2.equals(avmnVar)) {
                        awkmVar.b(i2, objArr, i);
                    } else {
                        do {
                            i2 = (i2 + 1) & i;
                            obj = objArr[i2];
                            if (obj != null) {
                            }
                        } while (!obj.equals(avmnVar));
                        awkmVar.b(i2, objArr, i);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                awkm awkmVar = this.a;
                this.a = null;
                g(awkmVar);
            }
        }
    }

    public final void e(avmn... avmnVarArr) {
        avmnVarArr.getClass();
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    awkm awkmVar = this.a;
                    if (awkmVar == null) {
                        awkmVar = new awkm(avmnVarArr.length + 1);
                        this.a = awkmVar;
                    }
                    int length = avmnVarArr.length;
                    while (i < length) {
                        avmn avmnVar = avmnVarArr[i];
                        avmnVar.getClass();
                        awkmVar.a(avmnVar);
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = avmnVarArr.length;
        while (i < length2) {
            avmnVarArr[i].dispose();
            i++;
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.avnq
    public final void h(avmn avmnVar) {
        if (d(avmnVar)) {
            avmnVar.dispose();
        }
    }

    public avmm() {
    }
}
