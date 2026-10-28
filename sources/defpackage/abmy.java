package defpackage;

import java.util.Observable;
import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmy extends Observable implements Observer {
    public final zkk a;
    public final zkk b;
    public final zkk c;
    public final zkk d;

    public abmy(zkk zkkVar, zkk zkkVar2, zkk zkkVar3, zkk zkkVar4) {
        zkkVar.getClass();
        this.a = zkkVar;
        zkkVar2.getClass();
        this.b = zkkVar2;
        zkkVar3.getClass();
        this.c = zkkVar3;
        zkkVar4.getClass();
        this.d = zkkVar4;
        zkkVar.addObserver(this);
        zkkVar2.addObserver(this);
        zkkVar3.addObserver(this);
        zkkVar4.addObserver(this);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        setChanged();
        if (observable == this.a) {
            notifyObservers(0);
            return;
        }
        if (observable == this.b) {
            notifyObservers(1);
        } else if (observable == this.c) {
            notifyObservers(2);
        } else if (observable == this.d) {
            notifyObservers(3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public abmy() {
        abmz abmzVar = abmz.a;
        this(abmzVar, abmzVar, abmzVar, abmzVar);
    }
}
