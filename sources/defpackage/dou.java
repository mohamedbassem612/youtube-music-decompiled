package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dou {
    public final dpa a;
    private doo b;

    public dou(dpa dpaVar) {
        dpaVar.getClass();
        this.a = dpaVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        dpa dpaVar = this.a;
        dpaVar.a.invoke(str);
        ayq ayqVar = dpaVar.d;
        doz dozVarR = ayqVar.r(str);
        if (dozVarR != null) {
            Bundle bundle2 = dozVarR.b;
            dozVarR.b = null;
            return bundle2;
        }
        synchronized (ayqVar.b) {
            bundle = (Bundle) ((agu) ayqVar.a).f(str);
        }
        return bundle;
    }

    public final void b(String str, dos dosVar) {
        boolean z;
        dosVar.getClass();
        doz dozVar = new doz(dosVar);
        dpa dpaVar = this.a;
        ayq ayqVar = dpaVar.d;
        Object obj = ayqVar.b;
        synchronized (obj) {
            Object obj2 = ayqVar.c;
            doz dozVar2 = (doz) ((agu) obj2).a(str);
            if (dozVar2 != null) {
                dos dosVar2 = dozVar2.a;
                dos dosVar3 = dozVar.a;
                if (dosVar2 != dosVar3) {
                    throw new IllegalArgumentException("SavedStateProvider with key '" + str + "' already registered. Existing instance: '" + dosVar2 + "'. New instance: '" + dosVar3 + "'.");
                }
                z = false;
            } else {
                synchronized (obj) {
                    ((agu) obj2).g(str, dozVar);
                    Object obj3 = ayqVar.a;
                    if (agu.d((agu) obj3, str)) {
                        dozVar.b((Bundle) ((agu) obj3).f(str));
                    }
                    z = true;
                }
            }
        }
        if (z && dpaVar.b && !dozVar.c) {
            dozVar.b(null);
        }
    }

    public final void c(Class cls) {
        if (!this.a.c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        doo dooVar = this.b;
        if (dooVar == null) {
            dooVar = new doo(this);
        }
        this.b = dooVar;
        try {
            cls.getDeclaredConstructor(null);
            doo dooVar2 = this.b;
            if (dooVar2 != null) {
                String name = cls.getName();
                name.getClass();
                dooVar2.a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
