package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uko {
    public final ArrayDeque a = new ArrayDeque();
    public final awlo b = new awlo();
    private final ulj c;
    private boolean d;
    private uga e;

    public uko(ulj uljVar) {
        this.c = uljVar;
    }

    private final void d(int i) {
        ulj uljVar = this.c;
        uld uldVar = (uld) uljVar.i();
        ulk ulkVar = uldVar.r;
        uldVar.k = ulkVar == null || ulkVar.a;
        int i2 = i - 1;
        if (i2 == 0) {
            uljVar.h().v();
            return;
        }
        if (i2 == 1) {
            uljVar.h().u();
        } else if (this.d) {
            uljVar.h().v();
        } else {
            uljVar.h().u();
        }
    }

    public final void a(final ugc ugcVar) {
        ukn uknVar = (ukn) this.a.peek();
        if (uknVar == null) {
            c(ugcVar);
        } else {
            final ugc ugcVar2 = uknVar.a;
            ugcVar2.b(new ufz() { // from class: ukm
                @Override // defpackage.ufz
                public final void a() {
                    Pair pair = new Pair(ugcVar2, ugb.b);
                    uko ukoVar = this.a;
                    ukoVar.b.kk(pair);
                    ukoVar.c(ugcVar);
                }
            });
        }
    }

    public final void b() {
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty()) {
            ukn uknVar = (ukn) arrayDeque.pop();
            ugc ugcVar = uknVar.a;
            this.e = ugcVar.a();
            this.d = uknVar.b;
            if (this.e != null) {
                d(3);
                this.e = null;
            }
            this.b.kk(new Pair(ugcVar, ugb.b));
        }
        ukn uknVar2 = (ukn) arrayDeque.peek();
        if (uknVar2 != null) {
            ukl uklVar = new ukl(this);
            ugc ugcVar2 = uknVar2.a;
            ugcVar2.d(uklVar);
            this.b.kk(new Pair(ugcVar2, ugb.a));
        }
    }

    public final void c(ugc ugcVar) {
        this.e = ugcVar.a();
        boolean z = ((uld) this.c.k()).l;
        uga ugaVar = this.e;
        if (ugaVar != null) {
            d(ugaVar.a());
        }
        this.d = z;
        this.a.push(new ukn(ugcVar, z));
        ugcVar.d(new ukl(this));
        this.b.kk(new Pair(ugcVar, ugb.a));
    }
}
