package defpackage;

import android.app.AlertDialog;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aekc implements RadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aekc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.$cid != 0) {
            ((AlertDialog) this.a).getButton(-1).setEnabled(true);
            return;
        }
        String string = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
        aeke aekeVar = (aeke) this.a;
        aekeVar.p = string;
        if (radioGroup.equals(aekeVar.q)) {
            aekeVar.k(aekeVar.r);
        } else if (radioGroup.equals(aekeVar.r)) {
            aekeVar.k(aekeVar.q);
        }
    }
}
