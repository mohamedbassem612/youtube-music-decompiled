package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tcv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tcv(cc ccVar, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        this.$cid = i;
        this.d = ccVar;
        this.a = layoutInflater;
        this.b = viewGroup;
        this.c = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tdb] */
    @Override // java.lang.Runnable
    public final void run() {
        tda tdaVar;
        tda tdaVar2;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.d;
                ((xeq) this.c).o((akku) this.a, (alot) this.b, (aihf) obj);
                return;
            } else {
                Object obj2 = this.c;
                ((cc) this.d).m661lambda$performCreateView$6$androidsupportv4appFragment((LayoutInflater) this.a, (ViewGroup) this.b, (Bundle) obj2);
                return;
            }
        }
        Object obj3 = this.c;
        Object obj4 = this.a;
        if (obj3 != null) {
            tdc tdcVar = (tdc) obj4;
            Iterator it = tdcVar.c.iterator();
            do {
                if (!it.hasNext()) {
                    tdaVar = new tda(tdcVar, (Activity) obj3);
                    break;
                }
                tdaVar = (tda) it.next();
            } while (tdaVar.b != obj3);
        } else {
            tdaVar = (tda) ((tdc) obj4).c.peekFirst();
        }
        Object obj5 = this.b;
        if (tdaVar != null) {
            if (obj5 == tcj.class) {
                tdaVar.c = true;
                Deque deque = tdaVar.e.c;
                if (tdaVar != deque.peekFirst()) {
                    if (deque.remove(tdaVar)) {
                        deque.push(tdaVar);
                    }
                    Iterator itDescendingIterator = deque.descendingIterator();
                    tda tdaVar3 = null;
                    while (itDescendingIterator.hasNext()) {
                        tda tdaVar4 = (tda) itDescendingIterator.next();
                        tdaVar4.d = tdaVar3;
                        tdaVar3 = tdaVar4;
                    }
                }
            } else if (obj5 != tcp.class) {
                if (obj5 == tco.class) {
                    tdaVar.c = true;
                } else if (obj5 != tcl.class) {
                    if (obj5 == tcm.class) {
                        tdaVar.c = true;
                    } else if (obj5 == tck.class) {
                        tdaVar.c = false;
                        tdaVar.e.c.remove(tdaVar);
                    }
                }
            }
            if (tdaVar.c && (tdaVar2 = tdaVar.d) != null) {
                tdaVar2.c = false;
            }
        }
        tdc tdcVar2 = (tdc) obj4;
        Iterable<vwt> iterableA = tdcVar2.b;
        if (obj5 == tct.class || obj5 == tcs.class || obj5 == tcr.class || obj5 == tcq.class) {
            Iterator it2 = tdcVar2.c.iterator();
            while (it2.hasNext()) {
                iterableA = agix.a(iterableA, ((tda) it2.next()).a);
            }
        } else {
            boolean z = tdaVar.c;
            iterableA = agix.a(iterableA, tdaVar.a);
        }
        for (vwt vwtVar : iterableA) {
            Class cls = (Class) obj5;
            if (vwtVar.H(cls)) {
                this.d.a((tcu) cls.cast(vwtVar.a));
            }
        }
    }

    public /* synthetic */ tcv(tdc tdcVar, Class cls, Activity activity, tdb tdbVar, int i) {
        this.$cid = i;
        this.a = tdcVar;
        this.b = cls;
        this.c = activity;
        this.d = tdbVar;
    }

    public tcv(xeq xeqVar, akku akkuVar, alot alotVar, aihf aihfVar, int i) {
        this.$cid = i;
        this.a = akkuVar;
        this.b = alotVar;
        this.d = aihfVar;
        this.c = xeqVar;
    }
}
