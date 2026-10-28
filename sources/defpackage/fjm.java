package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fjm implements fjl {
    private final List b = new ArrayList(4);
    public fjk a = fjk.HINT_VISIBLE;

    @Override // defpackage.fjl
    public final fjk a() {
        return this.a;
    }

    @Override // defpackage.fjl
    public final synchronized void b(fjj fjjVar) {
        this.b.add(fjjVar);
    }

    @Override // defpackage.fjl
    public final synchronized void c(fjj fjjVar) {
        this.b.remove(fjjVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0037  */
    public final void d(fjk fjkVar) {
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gzj.aS();
        fjk fjkVar2 = fjk.DESTROYED;
        if (fjkVar == fjkVar2 && this.a == fjk.HINT_VISIBLE) {
            d(fjk.HINT_INVISIBLE);
        }
        fjk fjkVar3 = this.a;
        int i = 0;
        if (fjkVar3 == fjkVar2) {
            c = 2;
        } else if (fjkVar != fjkVar2) {
            fjk fjkVar4 = fjk.HINT_VISIBLE;
            if (fjkVar != fjkVar4) {
                fjk fjkVar5 = fjk.HINT_INVISIBLE;
                if (fjkVar == fjkVar5) {
                    if (fjkVar3 == fjkVar5) {
                        c = 1;
                    } else if (fjkVar3 == fjkVar4) {
                        c = 0;
                    }
                }
                c = 2;
            } else if (fjkVar3 == fjkVar4) {
                c = 1;
            } else if (fjkVar3 == fjk.HINT_INVISIBLE) {
                c = 0;
            } else {
                c = 2;
            }
        } else if (fjkVar3 == fjk.HINT_INVISIBLE) {
            c = 0;
        } else {
            c = 2;
        }
        if (c == 2) {
            gzj.br(1, "Cannot move from state " + String.valueOf(fjkVar3) + " to state " + fjkVar.d);
            return;
        }
        if (c == 0) {
            this.a = fjkVar;
            int iOrdinal = fjkVar.ordinal();
            if (iOrdinal == 0) {
                synchronized (this) {
                    arrayList = new ArrayList(this.b);
                }
                int size = arrayList.size();
                while (i < size) {
                    ((fjj) arrayList.get(i)).s(fjk.HINT_VISIBLE);
                    i++;
                }
                return;
            }
            if (iOrdinal == 1) {
                synchronized (this) {
                    arrayList2 = new ArrayList(this.b);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((fjj) arrayList2.get(i)).s(fjk.HINT_INVISIBLE);
                    i++;
                }
                return;
            }
            if (iOrdinal != 2) {
                throw new IllegalStateException("State not known");
            }
            synchronized (this) {
                arrayList3 = new ArrayList(this.b);
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                ((fjj) arrayList3.get(i)).s(fjk.DESTROYED);
                i++;
            }
        }
    }
}
