package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aehn {
    public volatile Object a;

    public aehn(vyo vyoVar) {
        this.a = agpr.a;
        aksj aksjVar = vyoVar.b().B;
        a(aksjVar == null ? aksj.a : aksjVar);
        vyoVar.c(new adhc(1)).aq().af(new acym(this, 2));
    }

    public final void a(aksj aksjVar) {
        agkx agkxVar = new agkx();
        Iterator it = aksjVar.b.iterator();
        while (it.hasNext()) {
            agkxVar.c(((aksi) it.next()).b);
        }
        this.a = agkxVar.g();
    }

    public final float b() {
        return ((tyb) this.a).a;
    }

    public final boolean c() {
        return ((tyb) this.a).b;
    }

    public aehn(byte[] bArr) {
        this.a = "";
    }

    public aehn(byte[] bArr, byte[] bArr2) {
        this.a = new tyb(-1.0f, false);
    }

    public aehn(Context context, awut awutVar) {
        context.getClass();
        awutVar.getClass();
    }

    public aehn() {
    }
}
