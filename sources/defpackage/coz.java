package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class coz extends bsz {
    public final agke c;

    public coz(String str, List list) {
        super(str, null, false, 1);
        this.c = agke.n(list);
    }

    @Override // defpackage.bsz, java.lang.Throwable
    public final String getMessage() {
        agke agkeVar = this.c;
        String message = super.getMessage();
        if (agkeVar.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + String.valueOf(agkeVar);
    }
}
