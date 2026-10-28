package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doz implements dos, dot {
    public final dos a;
    public Bundle b = null;
    public boolean c;

    public doz(dos dosVar) {
        this.a = dosVar;
    }

    @Override // defpackage.dos
    public final Bundle a() {
        return this.a.a();
    }

    @Override // defpackage.dot
    public final void b(Bundle bundle) {
        this.c = true;
        dos dosVar = this.a;
        if (dosVar instanceof dot) {
            ((dot) dosVar).b(bundle);
        } else {
            this.b = bundle;
        }
    }
}
