package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jdz extends adlw {
    final /* synthetic */ izr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdz(vxe vxeVar, View view, izr izrVar) {
        super(vxeVar, view);
        this.a = izrVar;
    }

    @Override // defpackage.adlw, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        this.a.i();
    }
}
