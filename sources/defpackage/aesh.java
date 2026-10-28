package defpackage;

import android.content.Context;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesh {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public aesh(aess aessVar, ahqj ahqjVar) {
        this.f = new aesg(this);
        this.e = aessVar;
        this.a = ((trl) aessVar.e).a(334, 250, 250);
        this.d = new AtomicReference();
        this.b = new Handler(((Context) aessVar.c).getMainLooper());
        this.c = ahqjVar;
    }

    public aesh(String str, long j, List list, List list2, cir cirVar, List list3) {
        this.e = str;
        this.a = j;
        this.f = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.b = cirVar;
        this.c = agke.B(new awv(5), list3);
    }
}
