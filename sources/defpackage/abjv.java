package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjv implements abji {
    public final awmd a;
    private final awmd b;
    private final Set c;

    public abjv(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = Collections.newSetFromMap(new WeakHashMap());
    }

    final Object b() {
        Object obj = new Object();
        this.c.add(obj);
        return obj;
    }

    final void c(Object obj) {
        this.c.remove(obj);
    }

    public final void d(abke abkeVar, abjm abjmVar, boolean z) {
        abvk abvkVar = (abvk) this.a.io();
        abvc abvcVar = (abvc) this.b.io();
        if (abkeVar == null) {
            if (abvkVar.h() != null) {
                abvkVar.D();
                return;
            }
            return;
        }
        abnl abnlVarA = abjmVar != null ? abjmVar.a(abkeVar) : abkeVar.n();
        if (z) {
            abvkVar.D();
        } else if (abvkVar.S(abnlVarA)) {
            return;
        }
        if (abnlVarA != null) {
            abvcVar.g(abnlVarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abji
    public final /* bridge */ /* synthetic */ void hp(Object obj, abjm abjmVar) {
        if (this.c.isEmpty()) {
            d(obj, new abju(this), false);
        }
    }
}
