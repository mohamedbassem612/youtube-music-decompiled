package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pna implements pmb {
    private final pml a;

    static {
        agsn.h("GnpSdk");
    }

    public pna(pml pmlVar) {
        this.a = pmlVar;
    }

    @Override // defpackage.pmb
    public final boolean a(Intent intent) {
        if (!awrc.c("com.google.android.c2dm.intent.RECEIVE", intent.getAction())) {
            return false;
        }
        intent.getAction();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                Objects.toString(extras.get(it.next()));
            }
        }
        pmi pmiVarA = pmi.a(intent);
        int i = pmiVarA.f;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1) {
            return this.a.a(pmiVarA);
        }
        return i2 == 2;
    }
}
