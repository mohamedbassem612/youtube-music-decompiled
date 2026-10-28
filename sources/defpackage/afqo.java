package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqo implements afqk {
    public final bog a;
    public final awut b;
    public final afqp c;
    public final ahub d;

    public afqo(bog bogVar, awut awutVar, ahub ahubVar) {
        this.a = bogVar;
        this.b = awutVar;
        this.d = ahubVar;
        this.c = (afqp) ahubVar.o(R.id.lifecycle_channel_mixin, bogVar, new afqm());
        bogVar.getLifecycle().b(new afqn(this));
    }

    @Override // defpackage.afqk
    public final ahub a(axat axatVar) {
        throw null;
    }
}
