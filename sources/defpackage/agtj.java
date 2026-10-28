package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agtj implements agtf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agtf
    public final /* synthetic */ void a(agrx agrxVar, Iterator it, Object obj) {
        if (!agrxVar.b) {
            throw new IllegalStateException("non repeating key");
        }
        if (!agrxVar.c || agtu.a() <= 20) {
            agrxVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(agrxVar.a, it.next());
            }
        }
    }
}
