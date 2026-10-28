package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afgj {
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final affw b;
    public final awmd c;
    public final List d = new ArrayList();
    private final ahex e;

    public afgj(affw affwVar, agev agevVar, ahex ahexVar) {
        this.b = affwVar;
        this.c = (awmd) ((agfa) agevVar).a;
        this.e = ahexVar;
    }

    public final ListenableFuture a() {
        return ahng.s(afwl.c(new afgi(this, 0)), this.e);
    }
}
