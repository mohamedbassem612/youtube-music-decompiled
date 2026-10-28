package defpackage;

import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dkk implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ dkl a;

    public dkk(dkl dklVar) {
        this.a = dklVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        dkl dklVar = this.a;
        boolean z2 = dklVar.l;
        if (z) {
            dklVar.l = z2 | dklVar.k.add(dklVar.n[i].toString());
        } else {
            dklVar.l = z2 | dklVar.k.remove(dklVar.n[i].toString());
        }
    }
}
