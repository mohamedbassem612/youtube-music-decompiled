package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xxt implements abjh, abji, abjj {
    final Set a = new CopyOnWriteArraySet();
    final Set c = new CopyOnWriteArraySet();
    final Set b = new CopyOnWriteArraySet();

    @Override // defpackage.abjh
    public final void a(int i, int i2, int i3) {
        agrx agrxVar = agso.a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abjh) it.next()).a(i, i2, i3);
        }
    }

    @Override // defpackage.abjh
    public final void b(int i, int i2, int i3, int i4) {
        agrx agrxVar = agso.a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abjh) it.next()).b(i, i2, i3, i4);
        }
    }

    @Override // defpackage.abjh
    public final void c(int i, int i2, int i3) {
        agrx agrxVar = agso.a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abjh) it.next()).c(i, i2, i3);
        }
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        agrx agrxVar = agso.a;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((abjj) it.next()).ho(i, i2);
        }
    }

    @Override // defpackage.abji
    public final /* synthetic */ void hp(Object obj, abjm abjmVar) {
        agrx agrxVar = agso.a;
        if (obj != null) {
            obj.toString();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((abji) it.next()).hp(obj, abjmVar);
        }
    }
}
