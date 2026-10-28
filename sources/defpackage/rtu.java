package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtu implements rsu {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;
    final /* synthetic */ abzo d;

    public rtu(abzo abzoVar, String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = abzoVar;
    }

    @Override // defpackage.rsu
    public final void Q() {
        this.d.r(this.a);
    }

    @Override // defpackage.rsu
    public final void R() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.d.y((String) it.next(), this.c);
        }
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }
}
