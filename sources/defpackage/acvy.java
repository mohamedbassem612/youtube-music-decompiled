package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvy implements awmd {
    private final awmd a;
    private final Set b = new HashSet();

    public acvy(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acvx io() {
        acvx acvxVar = (acvx) this.a.io();
        this.b.add(acvxVar);
        return acvxVar;
    }
}
