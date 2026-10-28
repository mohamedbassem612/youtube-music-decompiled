package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekd implements View.OnClickListener {
    final RadioGroup a;
    final LayoutInflater b;
    final apri c;
    final /* synthetic */ aeke d;

    public aekd(aeke aekeVar, LayoutInflater layoutInflater, RadioGroup radioGroup, apri apriVar) {
        this.d = aekeVar;
        this.b = layoutInflater;
        this.a = radioGroup;
        this.c = apriVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioGroup radioGroup = this.a;
        radioGroup.removeAllViews();
        this.d.l(this.b, radioGroup, this.c);
    }
}
