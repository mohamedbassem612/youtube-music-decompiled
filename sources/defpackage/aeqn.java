package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeqn implements wfv {
    public final awmd a;
    private final Map b = new HashMap();

    public aeqn(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
        Map map = this.b;
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @tcc
    void handleGFeedbackParamsReceivedEvent(wjq wjqVar) {
        amgu[] amguVarArr = wjqVar.a;
        if (amguVarArr != null) {
            for (amgu amguVar : amguVarArr) {
                this.b.put(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
            }
        }
    }

    @tcc
    void handleSignInEvent(zwt zwtVar) {
        this.b.clear();
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
    }
}
