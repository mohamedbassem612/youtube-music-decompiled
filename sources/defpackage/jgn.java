package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgn implements AdapterView.OnItemSelectedListener {
    public int a = -1;
    final /* synthetic */ jgo b;

    public jgn(jgo jgoVar) {
        this.b = jgoVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != this.a) {
            jgo jgoVar = this.b;
            aqav aqavVar = (aqav) jgoVar.c.getItem(i);
            if (aqavVar != null) {
                int i2 = aqavVar.c;
                if (i2 == 5) {
                    jgoVar.a.c(i2 == 5 ? (ajwo) aqavVar.d : ajwo.a, null);
                } else {
                    int i3 = aqavVar.c;
                    if (i3 == 6) {
                        jgoVar.a.c(i3 == 6 ? (ajwo) aqavVar.d : ajwo.a, null);
                    }
                }
            }
            this.a = i;
            jgoVar.b.setSelection(i, false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
