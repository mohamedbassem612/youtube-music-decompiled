package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hdc extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ hdd b;

    public hdc(hdd hddVar, String str) {
        this.a = str;
        this.b = hddVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        afwl.m(this.b.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
