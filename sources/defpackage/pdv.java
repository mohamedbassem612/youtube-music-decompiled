package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pdv extends Exception {
    public pdv(aidy aidyVar) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", Integer.valueOf(aidyVar.q)));
    }

    public pdv(aier aierVar) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", Integer.valueOf(aierVar.p)));
    }
}
