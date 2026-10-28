package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahro implements ahrr {
    final FirebaseInstanceId a;

    public ahro(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.ahrr
    public final void a(hhb hhbVar) {
        this.a.d.add(hhbVar);
    }
}
